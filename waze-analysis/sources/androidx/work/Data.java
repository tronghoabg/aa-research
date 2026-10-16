package androidx.work;

import androidx.camera.video.AudioStats;
import h.a.i;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Data {
    public static final Companion Companion = new Companion(null);
    public static final Data EMPTY = new Builder().build();
    public static final int MAX_DATA_BYTES = 10240;
    private static final String NULL_STRING_V1 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
    private static final short STREAM_MAGIC = -21521;
    private static final short STREAM_VERSION = 1;
    private static final byte TYPE_BOOLEAN = 1;
    private static final byte TYPE_BOOLEAN_ARRAY = 8;
    private static final byte TYPE_BYTE = 2;
    private static final byte TYPE_BYTE_ARRAY = 9;
    private static final byte TYPE_DOUBLE = 6;
    private static final byte TYPE_DOUBLE_ARRAY = 13;
    private static final byte TYPE_FLOAT = 5;
    private static final byte TYPE_FLOAT_ARRAY = 12;
    private static final byte TYPE_INTEGER = 3;
    private static final byte TYPE_INTEGER_ARRAY = 10;
    private static final byte TYPE_LONG = 4;
    private static final byte TYPE_LONG_ARRAY = 11;
    private static final byte TYPE_NULL = 0;
    private static final byte TYPE_STRING = 7;
    private static final byte TYPE_STRING_ARRAY = 14;
    private final Map<String, Object> values;

    public Data(Data data) {
        x.f(data, "other");
        this.values = new HashMap(data.values);
    }

    public static final Data fromByteArray(byte[] bArr) {
        return Companion.fromByteArray(bArr);
    }

    private final /* synthetic */ <T> T getOrDefault(String str, T t) {
        T t2 = (T) this.values.get(str);
        x.i();
        return t2 instanceof Object ? t2 : t;
    }

    private final /* synthetic */ <T, TArray> TArray getTypedArray(String str, p<? super Integer, ? super l<? super Integer, ? extends T>, ? extends TArray> pVar) {
        final Object obj = this.values.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        try {
            Integer numValueOf = Integer.valueOf(((Object[]) obj).length);
            x.i();
            return pVar.invoke(numValueOf, new l() { // from class: androidx.work.Data.getTypedArray.1
                public final Object invoke(int i2) {
                    Object obj2 = ((Object[]) obj)[i2];
                    x.i();
                    return obj2;
                }

                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            });
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static final byte[] toByteArrayInternalV0(Data data) {
        return Companion.toByteArrayInternalV0(data);
    }

    public static final byte[] toByteArrayInternalV1(Data data) {
        return Companion.toByteArrayInternalV1(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$0$0(Map.Entry entry) {
        x.f(entry, "<destruct>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            x.e(value, "toString(...)");
        }
        return str + " : " + value;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L6c
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            boolean r2 = h.g.b.x.n(r2, r3)
            if (r2 != 0) goto L16
            goto L6c
        L16:
            androidx.work.Data r8 = (androidx.work.Data) r8
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.values
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.values
            java.util.Set r2 = r2.keySet()
            java.util.Set r3 = r3.keySet()
            boolean r3 = h.g.b.x.n(r2, r3)
            if (r3 != 0) goto L2b
            return r1
        L2b:
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Object> r4 = r7.values
            java.lang.Object r4 = r4.get(r3)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.values
            java.lang.Object r3 = r5.get(r3)
            if (r4 == 0) goto L63
            if (r3 != 0) goto L4c
            goto L63
        L4c:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L5e
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L5e
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = h.a.c.g(r5, r3)
            goto L68
        L5e:
            boolean r3 = h.g.b.x.n(r4, r3)
            goto L68
        L63:
            if (r4 != r3) goto L67
            r3 = r0
            goto L68
        L67:
            r3 = r1
        L68:
            if (r3 != 0) goto L2f
            return r1
        L6b:
            return r0
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.equals(java.lang.Object):boolean");
    }

    public final boolean getBoolean(String str, boolean z) {
        x.f(str, "key");
        Map<String, Object> map = this.values;
        Object objValueOf = Boolean.valueOf(z);
        Object obj = map.get(str);
        if (true == (obj instanceof Boolean)) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final boolean[] getBooleanArray(String str) {
        x.f(str, "key");
        final Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            try {
                int length = ((Object[]) obj).length;
                l<Integer, Boolean> lVar = new l<Integer, Boolean>() { // from class: androidx.work.Data$getBooleanArray$$inlined$getTypedArray$1
                    public final Boolean invoke(int i2) {
                        Object obj2 = ((Object[]) obj)[i2];
                        if (obj2 != null) {
                            return (Boolean) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                };
                boolean[] zArr = new boolean[length];
                for (int i2 = 0; i2 < length; i2++) {
                    zArr[i2] = lVar.invoke(Integer.valueOf(i2)).booleanValue();
                }
                return zArr;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final byte getByte(String str, byte b2) {
        x.f(str, "key");
        Map<String, Object> map = this.values;
        Object objValueOf = Byte.valueOf(b2);
        Object obj = map.get(str);
        if (true == (obj instanceof Byte)) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).byteValue();
    }

    public final byte[] getByteArray(String str) {
        x.f(str, "key");
        final Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            try {
                int length = ((Object[]) obj).length;
                l<Integer, Byte> lVar = new l<Integer, Byte>() { // from class: androidx.work.Data$getByteArray$$inlined$getTypedArray$1
                    public final Byte invoke(int i2) {
                        Object obj2 = ((Object[]) obj)[i2];
                        if (obj2 != null) {
                            return (Byte) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Byte, java.lang.Object] */
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Byte invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                };
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 < length; i2++) {
                    bArr[i2] = lVar.invoke(Integer.valueOf(i2)).byteValue();
                }
                return bArr;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final double getDouble(String str, double d2) {
        x.f(str, "key");
        Map<String, Object> map = this.values;
        Object objValueOf = Double.valueOf(d2);
        Object obj = map.get(str);
        if (true == (obj instanceof Double)) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).doubleValue();
    }

    public final double[] getDoubleArray(String str) {
        x.f(str, "key");
        final Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            try {
                int length = ((Object[]) obj).length;
                l<Integer, Double> lVar = new l<Integer, Double>() { // from class: androidx.work.Data$getDoubleArray$$inlined$getTypedArray$1
                    public final Double invoke(int i2) {
                        Object obj2 = ((Object[]) obj)[i2];
                        if (obj2 != null) {
                            return (Double) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Double, java.lang.Object] */
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Double invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                };
                double[] dArr = new double[length];
                for (int i2 = 0; i2 < length; i2++) {
                    dArr[i2] = lVar.invoke(Integer.valueOf(i2)).doubleValue();
                }
                return dArr;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final float getFloat(String str, float f2) {
        x.f(str, "key");
        Map<String, Object> map = this.values;
        Object objValueOf = Float.valueOf(f2);
        Object obj = map.get(str);
        if (true == (obj instanceof Float)) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).floatValue();
    }

    public final float[] getFloatArray(String str) {
        x.f(str, "key");
        final Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            try {
                int length = ((Object[]) obj).length;
                l<Integer, Float> lVar = new l<Integer, Float>() { // from class: androidx.work.Data$getFloatArray$$inlined$getTypedArray$1
                    public final Float invoke(int i2) {
                        Object obj2 = ((Object[]) obj)[i2];
                        if (obj2 != null) {
                            return (Float) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Float, java.lang.Object] */
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Float invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                };
                float[] fArr = new float[length];
                for (int i2 = 0; i2 < length; i2++) {
                    fArr[i2] = lVar.invoke(Integer.valueOf(i2)).floatValue();
                }
                return fArr;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final int getInt(String str, int i2) {
        x.f(str, "key");
        Map<String, Object> map = this.values;
        Object objValueOf = Integer.valueOf(i2);
        Object obj = map.get(str);
        if (true == (obj instanceof Integer)) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final int[] getIntArray(String str) {
        x.f(str, "key");
        final Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            try {
                int length = ((Object[]) obj).length;
                l<Integer, Integer> lVar = new l<Integer, Integer>() { // from class: androidx.work.Data$getIntArray$$inlined$getTypedArray$1
                    public final Integer invoke(int i2) {
                        Object obj2 = ((Object[]) obj)[i2];
                        if (obj2 != null) {
                            return (Integer) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer, java.lang.Object] */
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                };
                int[] iArr = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = lVar.invoke(Integer.valueOf(i2)).intValue();
                }
                return iArr;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final Map<String, Object> getKeyValueMap() {
        Map<String, Object> mapUnmodifiableMap = DesugarCollections.unmodifiableMap(this.values);
        x.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final long getLong(String str, long j2) {
        x.f(str, "key");
        Map<String, Object> map = this.values;
        Object objValueOf = Long.valueOf(j2);
        Object obj = map.get(str);
        if (true == (obj instanceof Long)) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    public final long[] getLongArray(String str) {
        x.f(str, "key");
        final Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            try {
                int length = ((Object[]) obj).length;
                l<Integer, Long> lVar = new l<Integer, Long>() { // from class: androidx.work.Data$getLongArray$$inlined$getTypedArray$1
                    public final Long invoke(int i2) {
                        Object obj2 = ((Object[]) obj)[i2];
                        if (obj2 != null) {
                            return (Long) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Long, java.lang.Object] */
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ Long invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                };
                long[] jArr = new long[length];
                for (int i2 = 0; i2 < length; i2++) {
                    jArr[i2] = lVar.invoke(Integer.valueOf(i2)).longValue();
                }
                return jArr;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final String[] getNullableStringArray(String str) {
        x.f(str, "key");
        final Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            try {
                int length = ((Object[]) obj).length;
                l<Integer, String> lVar = new l<Integer, String>() { // from class: androidx.work.Data$getNullableStringArray$$inlined$getTypedArray$1
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ String invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final String invoke(int i2) {
                        return (String) ((Object[]) obj)[i2];
                    }
                };
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = lVar.invoke(Integer.valueOf(i2));
                }
                return strArr;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final String getString(String str) {
        x.f(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final String[] getStringArray(String str) {
        x.f(str, "key");
        final Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            try {
                int length = ((Object[]) obj).length;
                l<Integer, String> lVar = new l<Integer, String>() { // from class: androidx.work.Data$getStringArray$$inlined$getTypedArray$1
                    public final String invoke(int i2) {
                        Object obj2 = ((Object[]) obj)[i2];
                        if (obj2 != null) {
                            return (String) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
                    @Override // h.g.a.l
                    public /* bridge */ /* synthetic */ String invoke(Integer num) {
                        return invoke(num.intValue());
                    }
                };
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = lVar.invoke(Integer.valueOf(i2));
                }
                return strArr;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final /* synthetic */ <T> boolean hasKey$work_runtime(String str) {
        x.f(str, "key");
        x.i();
        return hasKeyWithValueOfType(str, Object.class);
    }

    public final <T> boolean hasKeyWithValueOfType(String str, Class<T> cls) {
        x.f(str, "key");
        x.f(cls, "klass");
        Object obj = this.values.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final int size() {
        return this.values.size();
    }

    public final byte[] toByteArray() {
        return Companion.toByteArrayInternalV1(this);
    }

    public String toString() {
        return "Data {" + i.aM(this.values.entrySet(), null, null, null, 0, new l() { // from class: androidx.work.Data$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Data.toString$lambda$0$0((Map.Entry) obj);
            }
        }, 31) + "}";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private static final boolean fromByteArray$isObjectStream(ByteArrayInputStream byteArrayInputStream) {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            boolean z = false;
            if (bArr[0] == -84 && bArr[1] == -19) {
                z = true;
            }
            byteArrayInputStream.reset();
            return z;
        }

        private static final void fromByteArray$readHeader(DataInputStream dataInputStream) throws IOException {
            short s = dataInputStream.readShort();
            if (s != -21521) {
                throw new IllegalStateException("Magic number doesn't match: " + ((int) s));
            }
            short s2 = dataInputStream.readShort();
            if (s2 == 1) {
                return;
            }
            throw new IllegalStateException("Unsupported version number: " + ((int) s2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Object fromByteArray$readValue(DataInputStream dataInputStream, byte b2) throws IOException {
            if (b2 == 0) {
                return null;
            }
            if (b2 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b2 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b2 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b2 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b2 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b2 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b2 == 7) {
                return dataInputStream.readUTF();
            }
            int i2 = 0;
            if (b2 == 8) {
                int i3 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i3];
                while (i2 < i3) {
                    boolArr[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                    i2++;
                }
                return (Serializable) boolArr;
            }
            if (b2 == 9) {
                int i4 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i4];
                while (i2 < i4) {
                    bArr[i2] = Byte.valueOf(dataInputStream.readByte());
                    i2++;
                }
                return (Serializable) bArr;
            }
            if (b2 == 10) {
                int i5 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i5];
                while (i2 < i5) {
                    numArr[i2] = Integer.valueOf(dataInputStream.readInt());
                    i2++;
                }
                return (Serializable) numArr;
            }
            if (b2 == 11) {
                int i6 = dataInputStream.readInt();
                Long[] lArr = new Long[i6];
                while (i2 < i6) {
                    lArr[i2] = Long.valueOf(dataInputStream.readLong());
                    i2++;
                }
                return (Serializable) lArr;
            }
            if (b2 == 12) {
                int i7 = dataInputStream.readInt();
                Float[] fArr = new Float[i7];
                while (i2 < i7) {
                    fArr[i2] = Float.valueOf(dataInputStream.readFloat());
                    i2++;
                }
                return (Serializable) fArr;
            }
            if (b2 == 13) {
                int i8 = dataInputStream.readInt();
                Double[] dArr = new Double[i8];
                while (i2 < i8) {
                    dArr[i2] = Double.valueOf(dataInputStream.readDouble());
                    i2++;
                }
                return (Serializable) dArr;
            }
            if (b2 != 14) {
                throw new IllegalStateException("Unsupported type " + ((int) b2));
            }
            int i9 = dataInputStream.readInt();
            String[] strArr = new String[i9];
            while (i2 < i9) {
                String utf = dataInputStream.readUTF();
                if (true == x.n(utf, Data.NULL_STRING_V1)) {
                    utf = null;
                }
                strArr[i2] = utf;
                i2++;
            }
            return (Serializable) strArr;
        }

        private static final void toByteArrayInternalV1$writeArray(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i2;
            Class<?> cls = objArr.getClass();
            int i3 = ar.f48106a;
            m mVar = new m(cls);
            if (x.n(mVar, new m(Boolean[].class))) {
                i2 = 8;
            } else if (x.n(mVar, new m(Byte[].class))) {
                i2 = 9;
            } else if (x.n(mVar, new m(Integer[].class))) {
                i2 = 10;
            } else if (x.n(mVar, new m(Long[].class))) {
                i2 = 11;
            } else if (x.n(mVar, new m(Float[].class))) {
                i2 = 12;
            } else if (x.n(mVar, new m(Double[].class))) {
                i2 = 13;
            } else {
                if (!x.n(mVar, new m(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new m(objArr.getClass()).b())));
                }
                i2 = 14;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i2 == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i2 == 9) {
                    Byte b2 = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i2 == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i2 == 11) {
                    Long l2 = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l2 != null ? l2.longValue() : 0L);
                } else if (i2 == 12) {
                    Float f2 = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : 0.0f);
                } else if (i2 == 13) {
                    Double d2 = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE);
                } else {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = Data.NULL_STRING_V1;
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        private static final void toByteArrayInternalV1$writeEntry(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    Class<?> cls = obj.getClass();
                    int i2 = ar.f48106a;
                    throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new m(cls).c())));
                }
                toByteArrayInternalV1$writeArray(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        private static final void toByteArrayInternalV1$writeHeader(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        public final Data fromByteArray(byte[] bArr) {
            DataInputStream dataInputStream;
            x.f(bArr, "bytes");
            int length = bArr.length;
            if (length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (length == 0) {
                return Data.EMPTY;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                int i2 = 0;
                if (fromByteArray$isObjectStream(byteArrayInputStream)) {
                    dataInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        ObjectInputStream objectInputStream = dataInputStream;
                        int i3 = objectInputStream.readInt();
                        while (i2 < i3) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i2++;
                        }
                        i.aW(dataInputStream, null);
                    } finally {
                    }
                } else {
                    dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        DataInputStream dataInputStream2 = dataInputStream;
                        fromByteArray$readHeader(dataInputStream2);
                        int i4 = dataInputStream2.readInt();
                        while (i2 < i4) {
                            linkedHashMap.put(dataInputStream2.readUTF(), fromByteArray$readValue(dataInputStream2, dataInputStream2.readByte()));
                            i2++;
                        }
                        i.aW(dataInputStream, null);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            } catch (IOException e2) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#fromByteArray: ", e2);
            } catch (ClassNotFoundException e3) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#fromByteArray: ", e3);
            }
            return new Data(linkedHashMap);
        }

        public final byte[] toByteArrayInternalV0(Data data) {
            x.f(data, "data");
            try {
                ObjectOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                    byteArrayOutputStream = new ObjectOutputStream(byteArrayOutputStream2);
                    try {
                        ObjectOutputStream objectOutputStream = byteArrayOutputStream;
                        objectOutputStream.writeInt(data.size());
                        for (Map.Entry entry : data.values.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            objectOutputStream.writeUTF(str);
                            objectOutputStream.writeObject(value);
                        }
                        i.aW(byteArrayOutputStream, null);
                        i.aW(byteArrayOutputStream, null);
                        if (byteArrayOutputStream2.size() > 10240) {
                            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        x.c(byteArray);
                        return byteArray;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e2) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#toByteArray: ", e2);
                return new byte[0];
            }
        }

        public final byte[] toByteArrayInternalV1(Data data) {
            x.f(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    DataOutputStream dataOutputStream2 = dataOutputStream;
                    toByteArrayInternalV1$writeHeader(dataOutputStream2);
                    dataOutputStream2.writeInt(data.size());
                    for (Map.Entry entry : data.values.entrySet()) {
                        toByteArrayInternalV1$writeEntry(dataOutputStream2, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream2.flush();
                    if (dataOutputStream2.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    i.aW(dataOutputStream, null);
                    x.c(byteArray);
                    return byteArray;
                } finally {
                }
            } catch (IOException e2) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#toByteArray: ", e2);
                return new byte[0];
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public Data(Map<String, ?> map) {
        x.f(map, "values");
        this.values = new HashMap(map);
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private final Map<String, Object> values = new LinkedHashMap();

        private final Builder putDirect(String str, Object obj) {
            this.values.put(str, obj);
            return this;
        }

        public final Data build() {
            Data data = new Data((Map<String, ?>) this.values);
            Data.Companion.toByteArrayInternalV1(data);
            return data;
        }

        public final Builder put(String str, Object obj) {
            x.f(str, "key");
            if (obj == null) {
                obj = null;
            } else {
                int i2 = ar.f48106a;
                m mVar = new m(obj.getClass());
                if (!x.n(mVar, new m(Boolean.TYPE)) && !x.n(mVar, new m(Byte.TYPE)) && !x.n(mVar, new m(Integer.TYPE)) && !x.n(mVar, new m(Long.TYPE)) && !x.n(mVar, new m(Float.TYPE)) && !x.n(mVar, new m(Double.TYPE)) && !x.n(mVar, new m(String.class)) && !x.n(mVar, new m(Boolean[].class)) && !x.n(mVar, new m(Byte[].class)) && !x.n(mVar, new m(Integer[].class)) && !x.n(mVar, new m(Long[].class)) && !x.n(mVar, new m(Float[].class)) && !x.n(mVar, new m(Double[].class)) && !x.n(mVar, new m(String[].class))) {
                    if (x.n(mVar, new m(boolean[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((boolean[]) obj);
                    } else if (x.n(mVar, new m(byte[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((byte[]) obj);
                    } else if (x.n(mVar, new m(int[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((int[]) obj);
                    } else if (x.n(mVar, new m(long[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((long[]) obj);
                    } else if (x.n(mVar, new m(float[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((float[]) obj);
                    } else {
                        if (!x.n(mVar, new m(double[].class))) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + mVar);
                        }
                        obj = Data_Kt.convertPrimitiveArray((double[]) obj);
                    }
                }
            }
            this.values.put(str, obj);
            return this;
        }

        public final Builder putAll(Map<String, ? extends Object> map) {
            x.f(map, "values");
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final Builder putBoolean(String str, boolean z) {
            x.f(str, "key");
            putDirect(str, Boolean.valueOf(z));
            return this;
        }

        public final Builder putBooleanArray(String str, boolean[] zArr) {
            x.f(str, "key");
            x.f(zArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(zArr));
            return this;
        }

        public final Builder putByte(String str, byte b2) {
            x.f(str, "key");
            putDirect(str, Byte.valueOf(b2));
            return this;
        }

        public final Builder putByteArray(String str, byte[] bArr) {
            x.f(str, "key");
            x.f(bArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(bArr));
            return this;
        }

        public final Builder putDouble(String str, double d2) {
            x.f(str, "key");
            putDirect(str, Double.valueOf(d2));
            return this;
        }

        public final Builder putDoubleArray(String str, double[] dArr) {
            x.f(str, "key");
            x.f(dArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(dArr));
            return this;
        }

        public final Builder putFloat(String str, float f2) {
            x.f(str, "key");
            putDirect(str, Float.valueOf(f2));
            return this;
        }

        public final Builder putFloatArray(String str, float[] fArr) {
            x.f(str, "key");
            x.f(fArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(fArr));
            return this;
        }

        public final Builder putInt(String str, int i2) {
            x.f(str, "key");
            putDirect(str, Integer.valueOf(i2));
            return this;
        }

        public final Builder putIntArray(String str, int[] iArr) {
            x.f(str, "key");
            x.f(iArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(iArr));
            return this;
        }

        public final Builder putLong(String str, long j2) {
            x.f(str, "key");
            putDirect(str, Long.valueOf(j2));
            return this;
        }

        public final Builder putLongArray(String str, long[] jArr) {
            x.f(str, "key");
            x.f(jArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(jArr));
            return this;
        }

        public final Builder putString(String str, String str2) {
            x.f(str, "key");
            putDirect(str, str2);
            return this;
        }

        public final Builder putStringArray(String str, String[] strArr) {
            x.f(str, "key");
            x.f(strArr, "value");
            putDirect(str, strArr);
            return this;
        }

        public final Builder putAll(Data data) {
            x.f(data, "data");
            putAll(data.values);
            return this;
        }
    }
}
