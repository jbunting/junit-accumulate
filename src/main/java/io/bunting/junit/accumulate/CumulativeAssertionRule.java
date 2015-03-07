package io.bunting.junit.accumulate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.internal.ArrayComparisonFailure;
import org.junit.rules.MethodRule;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

@SuppressWarnings({"UnusedDeclaration"})
public class CumulativeAssertionRule implements TestRule, MethodRule, AssertionHandler
{
	private List<AssertionError> assertionErrors = new ArrayList<AssertionError>();

	@Override
	public Statement apply(final Statement base, final Description description)
	{
		return new Statement()
		{
			@Override
			public void evaluate() throws Throwable
			{
				base.evaluate();
				if (!assertionErrors.isEmpty())
				{
					throw generateError(assertionErrors);
				}
			}
		};
	}

	public void checkUp()
	{
		if(!this.assertionErrors.isEmpty())
		{
			List<AssertionError> errors = this.assertionErrors;
			this.assertionErrors = new ArrayList<AssertionError>();
			throw generateError(errors);
		}
	}

	@Override
	public Statement apply(final Statement base, final FrameworkMethod method, final Object target)
	{
		Description testDescription = Description
				.createTestDescription(method.getMethod().getDeclaringClass(), method.getName(),
				                       method.getAnnotations());
		return this.apply(base, testDescription);
	}

	private AssertionError generateError(final List<AssertionError> assertionErrors)
	{
		AssertionError error = new AssertionError(joinMessages(assertionErrors));
		List<StackTraceElement> allElements = new ArrayList<StackTraceElement>();
		for (AssertionError assertionError : assertionErrors)
		{
			allElements.addAll(Arrays.asList(assertionError.getStackTrace()));
		}
		error.setStackTrace(allElements.toArray(new StackTraceElement[allElements.size()]));
		return error;
	}

	private static String joinMessages(final Iterable<AssertionError> assertionErrors)
	{
		StringBuilder sb = new StringBuilder("[ ");
		boolean first = true;
		for (final AssertionError error: assertionErrors)
		{
			if (first)
			{
				first = false;
			}
			else
			{
				sb.append(", ");
			}
			sb.append(error != null ? error.getMessage() : "null");
		}
		return sb.toString();
	}

	@Override
	public void assertTrue(final String message, final boolean condition)
	{
		try
		{
			Assert.assertTrue(message, condition);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertTrue(final boolean condition)
	{
		try
		{
			Assert.assertTrue(condition);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertFalse(final String message, final boolean condition)
	{
		try
		{
			Assert.assertFalse(message, condition);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertFalse(final boolean condition)
	{
		try
		{
			Assert.assertFalse(condition);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void fail(final String message)
	{
		try
		{
			Assert.fail(message);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void fail()
	{
		try
		{
			Assert.fail();
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertEquals(final String message, final Object expected, final Object actual)
	{
		try
		{
			Assert.assertEquals(message, expected, actual);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertEquals(final Object expected, final Object actual)
	{
		try
		{
			Assert.assertEquals(expected, actual);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final String message, final Object[] expecteds, final Object[] actuals)
			throws ArrayComparisonFailure
	{
		try
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final Object[] expecteds, final Object[] actuals)
	{
		try
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final String message, final byte[] expecteds, final byte[] actuals)
			throws ArrayComparisonFailure
	{
		try
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final byte[] expecteds, final byte[] actuals)
	{
		try
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final String message, final char[] expecteds, final char[] actuals)
			throws ArrayComparisonFailure
	{
		try
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final char[] expecteds, final char[] actuals)
	{
		try
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final String message, final short[] expecteds, final short[] actuals)
			throws ArrayComparisonFailure
	{
		try
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final short[] expecteds, final short[] actuals)
	{
		try
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final String message, final int[] expecteds, final int[] actuals)
			throws ArrayComparisonFailure
	{
		try
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final int[] expecteds, final int[] actuals)
	{
		try
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final String message, final long[] expecteds, final long[] actuals)
			throws ArrayComparisonFailure
	{
		try
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final long[] expecteds, final long[] actuals)
	{
		try
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final String message, final double[] expecteds, final double[] actuals,
	                              final double delta) throws ArrayComparisonFailure
	{
		try
		{
			Assert.assertArrayEquals(message, expecteds, actuals, delta);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final double[] expecteds, final double[] actuals, final double delta)
	{
		try
		{
			Assert.assertArrayEquals(expecteds, actuals, delta);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final String message, final float[] expecteds, final float[] actuals,
	                              final float delta) throws ArrayComparisonFailure
	{
		try
		{
			Assert.assertArrayEquals(message, expecteds, actuals, delta);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertArrayEquals(final float[] expecteds, final float[] actuals, final float delta)
	{
		try
		{
			Assert.assertArrayEquals(expecteds, actuals, delta);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertEquals(final String message, final double expected, final double actual, final double delta)
	{
		try
		{
			Assert.assertEquals(message, expected, actual, delta);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertEquals(final long expected, final long actual)
	{
		try
		{
			Assert.assertEquals(expected, actual);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertEquals(final String message, final long expected, final long actual)
	{
		try
		{
			Assert.assertEquals(message, expected, actual);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertEquals(final double expected, final double actual, final double delta)
	{
		try
		{
			Assert.assertEquals(expected, actual, delta);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertNotNull(final String message, final Object object)
	{
		try
		{
			Assert.assertNotNull(message, object);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertNotNull(final Object object)
	{
		try
		{
			Assert.assertNotNull(object);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertNull(final String message, final Object object)
	{
		try
		{
			Assert.assertNull(message, object);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertNull(final Object object)
	{
		try
		{
			Assert.assertNull(object);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertSame(final String message, final Object expected, final Object actual)
	{
		try
		{
			Assert.assertSame(message, expected, actual);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertSame(final Object expected, final Object actual)
	{
		try
		{
			Assert.assertSame(expected, actual);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertNotSame(final String message, final Object unexpected, final Object actual)
	{
		try
		{
			Assert.assertNotSame(message, unexpected, actual);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public void assertNotSame(final Object unexpected, final Object actual)
	{
		try
		{
			Assert.assertNotSame(unexpected, actual);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public <T> void assertThat(final T actual, final Matcher<T> matcher)
	{
		try
		{
			Assert.assertThat(actual, matcher);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}

	@Override
	public <T> void assertThat(final String reason, final T actual, final Matcher<T> matcher)
	{
		try
		{
			Assert.assertThat(reason, actual, matcher);
		}
		catch (AssertionError e)
		{
			assertionErrors.add(e);
		}
	}
}
