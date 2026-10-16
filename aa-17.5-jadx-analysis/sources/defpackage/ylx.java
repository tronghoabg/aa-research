package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ylx<K, V> extends yfy<K, V> {
    public static final yfy a = new ylx(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] c;
    public final transient int d;
    private final transient Object e;

    private ylx(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.c = objArr;
        this.d = i;
    }

    public static ylx a(int i, Object[] objArr, yfu yfuVar) {
        if (i == 0) {
            return (ylx) a;
        }
        if (i == 1) {
            objArr[0].getClass();
            objArr[1].getClass();
            return new ylx(null, objArr, 1);
        }
        woy.aj(i, objArr.length >> 1);
        Object objT = t(objArr, i, ygr.j(i), 0);
        if (objT instanceof Object[]) {
            Object[] objArr2 = (Object[]) objT;
            zre zreVar = (zre) objArr2[2];
            if (yfuVar == null) {
                throw zreVar.g();
            }
            yfuVar.c = zreVar;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue + iIntValue);
            objT = obj;
            i = iIntValue;
        }
        return new ylx(objT, objArr, i);
    }

    static Object e(Object[] objArr, int i, int i2, int i3) {
        Object objT = t(objArr, i, i2, i3);
        if (objT instanceof Object[]) {
            throw ((zre) ((Object[]) objT)[2]).g();
        }
        return objT;
    }

    static Object s(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iW = wub.w(obj2.hashCode());
            while (true) {
                int i3 = iW & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iW = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iW2 = wub.w(obj2.hashCode());
            while (true) {
                int i5 = iW2 & length2;
                char c = (char) sArr[i5];
                if (c == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[c])) {
                    return objArr[c ^ 1];
                }
                iW2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iW3 = wub.w(obj2.hashCode());
            while (true) {
                int i6 = iW3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                iW3 = i6 + 1;
            }
        }
    }

    private static Object t(Object[] objArr, int i, int i2, int i3) {
        int i4;
        zre zreVar = null;
        int i5 = 1;
        if (i == 1) {
            objArr[i3].getClass();
            objArr[i3 ^ 1].getClass();
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 + i8 + i3;
                int i10 = i7 + i7 + i3;
                Object obj = objArr[i9];
                obj.getClass();
                Object obj2 = objArr[i9 ^ 1];
                obj2.getClass();
                int iW = wub.w(obj.hashCode());
                while (true) {
                    int i11 = iW & i6;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj;
                            objArr[i10 ^ 1] = obj2;
                        }
                        i7++;
                    } else {
                        if (obj.equals(objArr[i12])) {
                            int i13 = i12 ^ 1;
                            Object obj3 = objArr[i13];
                            obj3.getClass();
                            zre zreVar2 = new zre(obj, obj2, obj3);
                            objArr[i13] = obj2;
                            zreVar = zreVar2;
                            break;
                        }
                        iW = i11 + 1;
                    }
                }
            }
            return i7 == i ? bArr : new Object[]{bArr, Integer.valueOf(i7), zreVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = i15 + i15 + i3;
                int i17 = i14 + i14 + i3;
                Object obj4 = objArr[i16];
                obj4.getClass();
                Object obj5 = objArr[i16 ^ 1];
                obj5.getClass();
                int iW2 = wub.w(obj4.hashCode());
                while (true) {
                    int i18 = iW2 & i6;
                    char c = (char) sArr[i18];
                    if (c == 65535) {
                        sArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj4;
                            objArr[i17 ^ 1] = obj5;
                        }
                        i14++;
                    } else {
                        if (obj4.equals(objArr[c])) {
                            int i19 = c ^ 1;
                            Object obj6 = objArr[i19];
                            obj6.getClass();
                            zre zreVar3 = new zre(obj4, obj5, obj6);
                            objArr[i19] = obj5;
                            zreVar = zreVar3;
                            break;
                        }
                        iW2 = i18 + 1;
                    }
                }
            }
            return i14 == i ? sArr : new Object[]{sArr, Integer.valueOf(i14), zreVar};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = i20 + i20 + i3;
            int i23 = i21 + i21 + i3;
            Object obj7 = objArr[i22];
            obj7.getClass();
            Object obj8 = objArr[i22 ^ i5];
            obj8.getClass();
            int iW3 = wub.w(obj7.hashCode());
            while (true) {
                int i24 = iW3 & i6;
                int i25 = iArr[i24];
                if (i25 == -1) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj7;
                        objArr[i23 ^ 1] = obj8;
                    }
                    i21++;
                    i4 = i5;
                } else {
                    i4 = i5;
                    if (obj7.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj9 = objArr[i26];
                        obj9.getClass();
                        zre zreVar4 = new zre(obj7, obj8, obj9);
                        objArr[i26] = obj8;
                        zreVar = zreVar4;
                        break;
                    }
                    iW3 = i24 + 1;
                    i5 = i4;
                }
            }
            i20++;
            i5 = i4;
        }
        int i27 = i5;
        if (i21 == i) {
            return iArr;
        }
        Integer numValueOf = Integer.valueOf(i21);
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i27] = numValueOf;
        objArr2[2] = zreVar;
        return objArr2;
    }

    @Override // defpackage.yfy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.yfy, java.util.Map
    /* renamed from: f */
    public final ygr entrySet() {
        return new ylu(this, this.c, 0, this.d);
    }

    @Override // defpackage.yfy, java.util.Map
    /* renamed from: g */
    public final ygr keySet() {
        return new ylv(this, new ylw(this.c, 0, this.d));
    }

    @Override // defpackage.yfy, java.util.Map
    /* renamed from: gR */
    public final yfg values() {
        return new ylw(this.c, 1, this.d);
    }

    @Override // defpackage.yfy, java.util.Map
    public final V get(Object obj) {
        V v = (V) s(this.e, this.c, this.d, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // defpackage.yfy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
