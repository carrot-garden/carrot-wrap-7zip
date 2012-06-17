package com.carrotgarden.util.sevenzip;

public class Util7z {

	public static final long MASK = 0xFFL;

	public static long decodeLong(final byte[] array) {

		long result = 0L;

		result |= ((array[0] & MASK) << 0);
		result |= ((array[1] & MASK) << 8);
		result |= ((array[2] & MASK) << 16);
		result |= ((array[3] & MASK) << 24);
		result |= ((array[4] & MASK) << 32);
		result |= ((array[5] & MASK) << 40);
		result |= ((array[6] & MASK) << 48);
		result |= ((array[7] & MASK) << 56);

		return result;

	}

}
