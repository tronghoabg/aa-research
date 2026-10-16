package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ync<K, V> extends defpackage.yhe<K, V> {
    public static final defpackage.yhe a = new defpackage.ync(null, new java.lang.Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient java.lang.Object[] c;
    public final transient int d;
    private final transient java.lang.Object e;

    private ync(java.lang.Object obj, java.lang.Object[] objArr, int i) {
        this.e = obj;
        this.c = objArr;
        this.d = i;
    }

    public static defpackage.ync a(int i, java.lang.Object[] objArr, defpackage.yha yhaVar) {
        if (i == 0) {
            return (defpackage.ync) a;
        }
        if (i == 1) {
            objArr[0].getClass();
            objArr[1].getClass();
            return new defpackage.ync(null, objArr, 1);
        }
        defpackage.ysr.bt(i, objArr.length >> 1);
        java.lang.Object objT = t(objArr, i, defpackage.yhx.j(i), 0);
        if (objT instanceof java.lang.Object[]) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) objT;
            defpackage.zps zpsVar = (defpackage.zps) objArr2[2];
            if (yhaVar == null) {
                throw zpsVar.c();
            }
            yhaVar.c = zpsVar;
            java.lang.Object obj = objArr2[0];
            int iIntValue = ((java.lang.Integer) objArr2[1]).intValue();
            objArr = java.util.Arrays.copyOf(objArr, iIntValue + iIntValue);
            objT = obj;
            i = iIntValue;
        }
        return new defpackage.ync(objT, objArr, i);
    }

    static java.lang.Object e(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.Object objT = t(objArr, i, i2, i3);
        if (objT instanceof java.lang.Object[]) {
            throw ((defpackage.zps) ((java.lang.Object[]) objT)[2]).c();
        }
        return objT;
    }

    static java.lang.Object s(java.lang.Object obj, java.lang.Object[] objArr, int i, int i2, java.lang.Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            java.lang.Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            java.lang.Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iAz = defpackage.ysr.az(obj2.hashCode());
            while (true) {
                int i3 = iAz & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iAz = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iAz2 = defpackage.ysr.az(obj2.hashCode());
            while (true) {
                int i5 = iAz2 & length2;
                char c = (char) sArr[i5];
                if (c == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[c])) {
                    return objArr[c ^ 1];
                }
                iAz2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iAz3 = defpackage.ysr.az(obj2.hashCode());
            while (true) {
                int i6 = iAz3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                iAz3 = i6 + 1;
            }
        }
    }

    private static java.lang.Object t(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4;
        defpackage.zps zpsVar = null;
        int i5 = 1;
        if (i == 1) {
            objArr[i3].getClass();
            objArr[i3 ^ 1].getClass();
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            java.util.Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 + i8 + i3;
                int i10 = i7 + i7 + i3;
                java.lang.Object obj = objArr[i9];
                obj.getClass();
                java.lang.Object obj2 = objArr[i9 ^ 1];
                obj2.getClass();
                int iAz = defpackage.ysr.az(obj.hashCode());
                while (true) {
                    int i11 = iAz & i6;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj;
                            objArr[i10 ^ 1] = obj2;
                        }
                        i7++;
                        break;
                    }
                    if (obj.equals(objArr[i12])) {
                        int i13 = i12 ^ 1;
                        java.lang.Object obj3 = objArr[i13];
                        obj3.getClass();
                        defpackage.zps zpsVar2 = new defpackage.zps(obj, obj2, obj3);
                        objArr[i13] = obj2;
                        zpsVar = zpsVar2;
                        break;
                    }
                    iAz = i11 + 1;
                }
            }
            return i7 == i ? bArr : new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i7), zpsVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            java.util.Arrays.fill(sArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = i15 + i15 + i3;
                int i17 = i14 + i14 + i3;
                java.lang.Object obj4 = objArr[i16];
                obj4.getClass();
                java.lang.Object obj5 = objArr[i16 ^ 1];
                obj5.getClass();
                int iAz2 = defpackage.ysr.az(obj4.hashCode());
                while (true) {
                    int i18 = iAz2 & i6;
                    char c = (char) sArr[i18];
                    if (c == 65535) {
                        sArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj4;
                            objArr[i17 ^ 1] = obj5;
                        }
                        i14++;
                        break;
                    }
                    if (obj4.equals(objArr[c])) {
                        int i19 = c ^ 1;
                        java.lang.Object obj6 = objArr[i19];
                        obj6.getClass();
                        defpackage.zps zpsVar3 = new defpackage.zps(obj4, obj5, obj6);
                        objArr[i19] = obj5;
                        zpsVar = zpsVar3;
                        break;
                    }
                    iAz2 = i18 + 1;
                }
            }
            return i14 == i ? sArr : new java.lang.Object[]{sArr, java.lang.Integer.valueOf(i14), zpsVar};
        }
        int[] iArr = new int[i2];
        java.util.Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = i20 + i20 + i3;
            int i23 = i21 + i21 + i3;
            java.lang.Object obj7 = objArr[i22];
            obj7.getClass();
            java.lang.Object obj8 = objArr[i22 ^ i5];
            obj8.getClass();
            int iAz3 = defpackage.ysr.az(obj7.hashCode());
            while (true) {
                int i24 = iAz3 & i6;
                int i25 = iArr[i24];
                if (i25 == -1) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj7;
                        objArr[i23 ^ 1] = obj8;
                    }
                    i21++;
                    i4 = i5;
                    break;
                }
                i4 = i5;
                if (obj7.equals(objArr[i25])) {
                    int i26 = i25 ^ 1;
                    java.lang.Object obj9 = objArr[i26];
                    obj9.getClass();
                    defpackage.zps zpsVar4 = new defpackage.zps(obj7, obj8, obj9);
                    objArr[i26] = obj8;
                    zpsVar = zpsVar4;
                    break;
                }
                iAz3 = i24 + 1;
                i5 = i4;
            }
            i20++;
            i5 = i4;
        }
        int i27 = i5;
        if (i21 == i) {
            return iArr;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i21);
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = iArr;
        objArr2[i27] = numValueOf;
        objArr2[2] = zpsVar;
        return objArr2;
    }

    @Override // defpackage.yhe
    public final boolean c() {
        return false;
    }

    @Override // defpackage.yhe, java.util.Map
    /* JADX INFO: renamed from: f */
    public final defpackage.yhx entrySet() {
        return new defpackage.ymz(this, this.c, 0, this.d);
    }

    @Override // defpackage.yhe, java.util.Map
    /* JADX INFO: renamed from: g */
    public final defpackage.yhx keySet() {
        return new defpackage.yna(this, new defpackage.ynb(this.c, 0, this.d));
    }

    @Override // defpackage.yhe, java.util.Map
    /* JADX INFO: renamed from: gc */
    public final defpackage.ygm values() {
        return new defpackage.ynb(this.c, 1, this.d);
    }

    @Override // defpackage.yhe, java.util.Map
    public final V get(java.lang.Object obj) {
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

    @Override // defpackage.yhe
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
