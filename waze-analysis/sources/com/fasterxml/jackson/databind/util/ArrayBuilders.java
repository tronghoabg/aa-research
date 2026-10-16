package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.HashSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ArrayBuilders {
    private BooleanBuilder _booleanBuilder = null;
    private ByteBuilder _byteBuilder = null;
    private ShortBuilder _shortBuilder = null;
    private IntBuilder _intBuilder = null;
    private LongBuilder _longBuilder = null;
    private FloatBuilder _floatBuilder = null;
    private DoubleBuilder _doubleBuilder = null;

    public static <T> HashSet<T> arrayToSet(T[] tArr) {
        if (tArr == null) {
            return new HashSet<>();
        }
        HashSet<T> hashSet = new HashSet<>(tArr.length);
        for (T t : tArr) {
            hashSet.add(t);
        }
        return hashSet;
    }

    public static Object getArrayComparator(final Object obj) {
        final int length = Array.getLength(obj);
        final Class<?> cls = obj.getClass();
        return new Object() { // from class: com.fasterxml.jackson.databind.util.ArrayBuilders.1
            public boolean equals(Object obj2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
                if (obj2 == this) {
                    return true;
                }
                if (!ClassUtil.hasClass(obj2, cls) || Array.getLength(obj2) != length) {
                    return false;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj3 = Array.get(obj, i2);
                    Object obj4 = Array.get(obj2, i2);
                    if (obj3 != obj4 && obj3 != null && !obj3.equals(obj4)) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public static <T> T[] insertInListNoDup(T[] tArr, T t) {
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (tArr[i2] == t) {
                if (i2 == 0) {
                    return tArr;
                }
                int i3 = i2 + 1;
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length));
                System.arraycopy(tArr, 0, tArr2, 1, i2);
                tArr2[0] = t;
                int i4 = length - i3;
                if (i4 > 0) {
                    System.arraycopy(tArr, i3, tArr2, i3, i4);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1));
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t;
        return tArr3;
    }

    public BooleanBuilder getBooleanBuilder() {
        BooleanBuilder booleanBuilder = this._booleanBuilder;
        if (booleanBuilder != null) {
            return booleanBuilder;
        }
        BooleanBuilder booleanBuilder2 = new BooleanBuilder();
        this._booleanBuilder = booleanBuilder2;
        return booleanBuilder2;
    }

    public ByteBuilder getByteBuilder() {
        ByteBuilder byteBuilder = this._byteBuilder;
        if (byteBuilder != null) {
            return byteBuilder;
        }
        ByteBuilder byteBuilder2 = new ByteBuilder();
        this._byteBuilder = byteBuilder2;
        return byteBuilder2;
    }

    public DoubleBuilder getDoubleBuilder() {
        DoubleBuilder doubleBuilder = this._doubleBuilder;
        if (doubleBuilder != null) {
            return doubleBuilder;
        }
        DoubleBuilder doubleBuilder2 = new DoubleBuilder();
        this._doubleBuilder = doubleBuilder2;
        return doubleBuilder2;
    }

    public FloatBuilder getFloatBuilder() {
        FloatBuilder floatBuilder = this._floatBuilder;
        if (floatBuilder != null) {
            return floatBuilder;
        }
        FloatBuilder floatBuilder2 = new FloatBuilder();
        this._floatBuilder = floatBuilder2;
        return floatBuilder2;
    }

    public IntBuilder getIntBuilder() {
        IntBuilder intBuilder = this._intBuilder;
        if (intBuilder != null) {
            return intBuilder;
        }
        IntBuilder intBuilder2 = new IntBuilder();
        this._intBuilder = intBuilder2;
        return intBuilder2;
    }

    public LongBuilder getLongBuilder() {
        LongBuilder longBuilder = this._longBuilder;
        if (longBuilder != null) {
            return longBuilder;
        }
        LongBuilder longBuilder2 = new LongBuilder();
        this._longBuilder = longBuilder2;
        return longBuilder2;
    }

    public ShortBuilder getShortBuilder() {
        ShortBuilder shortBuilder = this._shortBuilder;
        if (shortBuilder != null) {
            return shortBuilder;
        }
        ShortBuilder shortBuilder2 = new ShortBuilder();
        this._shortBuilder = shortBuilder2;
        return shortBuilder2;
    }

    /* compiled from: WazeSource */
    public final class BooleanBuilder extends PrimitiveArrayBuilder<boolean[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final boolean[] _constructArray(int i2) {
            return new boolean[i2];
        }
    }

    /* compiled from: WazeSource */
    public final class ByteBuilder extends PrimitiveArrayBuilder<byte[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final byte[] _constructArray(int i2) {
            return new byte[i2];
        }
    }

    /* compiled from: WazeSource */
    public final class DoubleBuilder extends PrimitiveArrayBuilder<double[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final double[] _constructArray(int i2) {
            return new double[i2];
        }
    }

    /* compiled from: WazeSource */
    public final class FloatBuilder extends PrimitiveArrayBuilder<float[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final float[] _constructArray(int i2) {
            return new float[i2];
        }
    }

    /* compiled from: WazeSource */
    public final class IntBuilder extends PrimitiveArrayBuilder<int[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final int[] _constructArray(int i2) {
            return new int[i2];
        }
    }

    /* compiled from: WazeSource */
    public final class LongBuilder extends PrimitiveArrayBuilder<long[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final long[] _constructArray(int i2) {
            return new long[i2];
        }
    }

    /* compiled from: WazeSource */
    public final class ShortBuilder extends PrimitiveArrayBuilder<short[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final short[] _constructArray(int i2) {
            return new short[i2];
        }
    }
}
