package io.bunting.junit.accumulate;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.internal.ArrayComparisonFailure;

@SuppressWarnings({"UnusedDeclaration"})
public interface AssertionHandler
{
	public static final AssertionHandler DEFAULT = new AssertionHandler()
	{
		@Override
		public void assertTrue(final String message, final boolean condition)
		{
			Assert.assertTrue(message, condition);
		}

		@Override
		public void assertTrue(final boolean condition)
		{
			Assert.assertTrue(condition);
		}

		@Override
		public void assertFalse(final String message, final boolean condition)
		{
			Assert.assertFalse(message, condition);
		}

		@Override
		public void assertFalse(final boolean condition)
		{
			Assert.assertFalse(condition);
		}

		@Override
		public void fail(final String message)
		{
			Assert.fail(message);
		}

		@Override
		public void fail()
		{
			Assert.fail();
		}

		@Override
		public void assertEquals(final String message, final Object expected, final Object actual)
		{
			Assert.assertEquals(message, expected, actual);
		}

		@Override
		public void assertEquals(final Object expected, final Object actual)
		{
			Assert.assertEquals(expected, actual);
		}

		@Override
		public void assertArrayEquals(final String message, final Object[] expecteds, final Object[] actuals)
				throws ArrayComparisonFailure
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final Object[] expecteds, final Object[] actuals)
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final String message, final byte[] expecteds, final byte[] actuals)
				throws ArrayComparisonFailure
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final byte[] expecteds, final byte[] actuals)
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final String message, final char[] expecteds, final char[] actuals)
				throws ArrayComparisonFailure
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final char[] expecteds, final char[] actuals)
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final String message, final short[] expecteds, final short[] actuals)
				throws ArrayComparisonFailure
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final short[] expecteds, final short[] actuals)
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final String message, final int[] expecteds, final int[] actuals)
				throws ArrayComparisonFailure
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final int[] expecteds, final int[] actuals)
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final String message, final long[] expecteds, final long[] actuals)
				throws ArrayComparisonFailure
		{
			Assert.assertArrayEquals(message, expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final long[] expecteds, final long[] actuals)
		{
			Assert.assertArrayEquals(expecteds, actuals);
		}

		@Override
		public void assertArrayEquals(final String message, final double[] expecteds, final double[] actuals,
		                              final double delta) throws ArrayComparisonFailure
		{
			Assert.assertArrayEquals(message, expecteds, actuals, delta);
		}

		@Override
		public void assertArrayEquals(final double[] expecteds, final double[] actuals, final double delta)
		{
			Assert.assertArrayEquals(expecteds, actuals, delta);
		}

		@Override
		public void assertArrayEquals(final String message, final float[] expecteds, final float[] actuals,
		                              final float delta) throws ArrayComparisonFailure
		{
			Assert.assertArrayEquals(message, expecteds, actuals, delta);
		}

		@Override
		public void assertArrayEquals(final float[] expecteds, final float[] actuals, final float delta)
		{
			Assert.assertArrayEquals(expecteds, actuals, delta);
		}

		@Override
		public void assertEquals(final String message, final double expected, final double actual, final double delta)
		{
			Assert.assertEquals(message, expected, actual, delta);
		}

		@Override
		public void assertEquals(final long expected, final long actual)
		{
			Assert.assertEquals(expected, actual);
		}

		@Override
		public void assertEquals(final String message, final long expected, final long actual)
		{
			Assert.assertEquals(message, expected, actual);
		}

		@Override
		public void assertEquals(final double expected, final double actual, final double delta)
		{
			Assert.assertEquals(expected, actual, delta);
		}

		@Override
		public void assertNotNull(final String message, final Object object)
		{
			Assert.assertNotNull(message, object);
		}

		@Override
		public void assertNotNull(final Object object)
		{
			Assert.assertNotNull(object);
		}

		@Override
		public void assertNull(final String message, final Object object)
		{
			Assert.assertNull(message, object);
		}

		@Override
		public void assertNull(final Object object)
		{
			Assert.assertNull(object);
		}

		@Override
		public void assertSame(final String message, final Object expected, final Object actual)
		{
			Assert.assertSame(message, expected, actual);
		}

		@Override
		public void assertSame(final Object expected, final Object actual)
		{
			Assert.assertSame(expected, actual);
		}

		@Override
		public void assertNotSame(final String message, final Object unexpected, final Object actual)
		{
			Assert.assertNotSame(message, unexpected, actual);
		}

		@Override
		public void assertNotSame(final Object unexpected, final Object actual)
		{
			Assert.assertNotSame(unexpected, actual);
		}

		@Override
		public <T> void assertThat(final T actual, final Matcher<T> matcher)
		{
			Assert.assertThat(actual, matcher);
		}

		@Override
		public <T> void assertThat(final String reason, final T actual, final Matcher<T> matcher)
		{
			Assert.assertThat(reason, actual, matcher);
		}
	};
	void assertTrue(String message, boolean condition);

	void assertTrue(boolean condition);

	void assertFalse(String message, boolean condition);

	void assertFalse(boolean condition);

	void fail(String message);

	void fail();

	void assertEquals(String message, Object expected, Object actual);

	void assertEquals(Object expected, Object actual);

	void assertArrayEquals(String message, Object[] expecteds, Object[] actuals)
			throws ArrayComparisonFailure;

	void assertArrayEquals(Object[] expecteds, Object[] actuals);

	void assertArrayEquals(String message, byte[] expecteds, byte[] actuals)
					throws ArrayComparisonFailure;

	void assertArrayEquals(byte[] expecteds, byte[] actuals);

	void assertArrayEquals(String message, char[] expecteds, char[] actuals)
							throws ArrayComparisonFailure;

	void assertArrayEquals(char[] expecteds, char[] actuals);

	void assertArrayEquals(String message, short[] expecteds, short[] actuals)
									throws ArrayComparisonFailure;

	void assertArrayEquals(short[] expecteds, short[] actuals);

	void assertArrayEquals(String message, int[] expecteds, int[] actuals)
											throws ArrayComparisonFailure;

	void assertArrayEquals(int[] expecteds, int[] actuals);

	void assertArrayEquals(String message, long[] expecteds, long[] actuals)
													throws ArrayComparisonFailure;

	void assertArrayEquals(long[] expecteds, long[] actuals);

	void assertArrayEquals(String message, double[] expecteds, double[] actuals,
	                       double delta) throws ArrayComparisonFailure;

	void assertArrayEquals(double[] expecteds, double[] actuals, double delta);

	void assertArrayEquals(String message, float[] expecteds, float[] actuals,
	                       float delta) throws ArrayComparisonFailure;

	void assertArrayEquals(float[] expecteds, float[] actuals, float delta);

	void assertEquals(String message, double expected, double actual, double delta);

	void assertEquals(long expected, long actual);

	void assertEquals(String message, long expected, long actual);

	void assertEquals(double expected, double actual, double delta);

	void assertNotNull(String message, Object object);

	void assertNotNull(Object object);

	void assertNull(String message, Object object);

	void assertNull(Object object);

	void assertSame(String message, Object expected, Object actual);

	void assertSame(Object expected, Object actual);

	void assertNotSame(String message, Object unexpected, Object actual);

	void assertNotSame(Object unexpected, Object actual);

	<T> void assertThat(T actual, Matcher<T> matcher);

	<T> void assertThat(String reason, T actual, Matcher<T> matcher);
}
