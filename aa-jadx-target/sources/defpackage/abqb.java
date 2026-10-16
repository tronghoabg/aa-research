package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class abqb<T> implements defpackage.abqn<T> {
    public static final int[] a = new int[0];
    public static final sun.misc.Unsafe b = defpackage.abrd.g();
    private final int[] c;
    private final java.lang.Object[] d;
    private final int e;
    private final int f;
    private final defpackage.abpy g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final defpackage.abqx m;

    public abqb(int[] iArr, java.lang.Object[] objArr, int i, int i2, defpackage.abpy abpyVar, int[] iArr2, int i3, int i4, defpackage.abqx abqxVar, defpackage.ysr ysrVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = abpyVar instanceof defpackage.abox;
        boolean z = false;
        if (ysrVar != null && (abpyVar instanceof defpackage.abou)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = abqxVar;
        this.g = abpyVar;
    }

    private final void A(java.lang.Object obj, java.lang.Object obj2, int i) {
        if (I(obj2, i)) {
            int iS = s(i) & 1048575;
            sun.misc.Unsafe unsafe = b;
            long j = iS;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + n(i) + " is present but null: " + obj2.toString());
            }
            defpackage.abqn abqnVarV = v(i);
            if (!I(obj, i)) {
                if (K(object)) {
                    java.lang.Object objE = abqnVarV.e();
                    abqnVarV.h(objE, object);
                    unsafe.putObject(obj, j, objE);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                D(obj, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!K(object2)) {
                java.lang.Object objE2 = abqnVarV.e();
                abqnVarV.h(objE2, object2);
                unsafe.putObject(obj, j, objE2);
                object2 = objE2;
            }
            abqnVarV.h(object2, object);
        }
    }

    private final void B(java.lang.Object obj, java.lang.Object obj2, int i) {
        int iN = n(i);
        if (M(obj2, iN, i)) {
            long jT = t(s(i));
            sun.misc.Unsafe unsafe = b;
            java.lang.Object object = unsafe.getObject(obj2, jT);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + n(i) + " is present but null: " + obj2.toString());
            }
            defpackage.abqn abqnVarV = v(i);
            if (!M(obj, iN, i)) {
                if (K(object)) {
                    java.lang.Object objE = abqnVarV.e();
                    abqnVarV.h(objE, object);
                    unsafe.putObject(obj, jT, objE);
                } else {
                    unsafe.putObject(obj, jT, object);
                }
                E(obj, iN, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, jT);
            if (!K(object2)) {
                java.lang.Object objE2 = abqnVarV.e();
                abqnVarV.h(objE2, object2);
                unsafe.putObject(obj, jT, objE2);
                object2 = objE2;
            }
            abqnVarV.h(object2, object);
        }
    }

    private final void C(java.lang.Object obj, int i, defpackage.abnz abnzVar) throws java.io.IOException {
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            defpackage.abrd.a.l(obj, j, abnzVar.u());
        } else if (this.i) {
            defpackage.abrd.a.l(obj, j, abnzVar.t());
        } else {
            defpackage.abrd.a.l(obj, j, abnzVar.o());
        }
    }

    private final void D(java.lang.Object obj, int i) {
        int iQ = q(i);
        long j = 1048575 & iQ;
        if (j == 1048575) {
            return;
        }
        defpackage.abrc abrcVar = defpackage.abrd.a;
        abrcVar.j(obj, j, (1 << (iQ >>> 20)) | abrcVar.g(obj, j));
    }

    private final void E(java.lang.Object obj, int i, int i2) {
        defpackage.abrd.l(obj, q(i2) & 1048575, i);
    }

    private final void F(java.lang.Object obj, int i, java.lang.Object obj2) {
        b.putObject(obj, s(i) & 1048575, obj2);
        D(obj, i);
    }

    private final void G(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        b.putObject(obj, t(s(i2)), obj2);
        E(obj, i, i2);
    }

    private final boolean H(java.lang.Object obj, java.lang.Object obj2, int i) {
        return I(obj, i) == I(obj2, i);
    }

    private final boolean I(java.lang.Object obj, int i) {
        int iQ = q(i);
        long j = iQ & 1048575;
        if (j != 1048575) {
            return ((1 << (iQ >>> 20)) & defpackage.abrd.a.g(obj, j)) != 0;
        }
        int iS = s(i);
        long j2 = iS & 1048575;
        switch ((iS >>> 20) & 255) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Double.doubleToRawLongBits(defpackage.abrd.b(obj, j2)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(defpackage.abrd.c(obj, j2)) != 0;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.abrd.a.h(obj, j2) != 0;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.abrd.a.h(obj, j2) != 0;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.abrd.a.g(obj, j2) != 0;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.abrd.a.h(obj, j2) != 0;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.abrd.a.g(obj, j2) != 0;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.abrd.a.f(obj, j2);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object objI = defpackage.abrd.a.i(obj, j2);
                if (objI instanceof java.lang.String) {
                    return !((java.lang.String) objI).isEmpty();
                }
                if (objI instanceof defpackage.abnv) {
                    return !defpackage.abnv.d.equals(objI);
                }
                return N();
            case 9:
                return defpackage.abrd.a.i(obj, j2) != null;
            case 10:
                return !defpackage.abnv.d.equals(defpackage.abrd.a.i(obj, j2));
            case 11:
                return defpackage.abrd.a.g(obj, j2) != 0;
            case 12:
                return defpackage.abrd.a.g(obj, j2) != 0;
            case 13:
                return defpackage.abrd.a.g(obj, j2) != 0;
            case 14:
                return defpackage.abrd.a.h(obj, j2) != 0;
            case 15:
                return defpackage.abrd.a.g(obj, j2) != 0;
            case 16:
                return defpackage.abrd.a.h(obj, j2) != 0;
            case 17:
                return defpackage.abrd.a.i(obj, j2) != null;
            default:
                return N();
        }
    }

    private final boolean J(java.lang.Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return I(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean K(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof defpackage.abox) {
            return ((defpackage.abox) obj).T();
        }
        return true;
    }

    private final boolean L(java.lang.Object obj, java.lang.Object obj2, int i) {
        long jQ = q(i) & 1048575;
        return defpackage.abrd.d(obj, jQ) == defpackage.abrd.d(obj2, jQ);
    }

    private final boolean M(java.lang.Object obj, int i, int i2) {
        return defpackage.abrd.a.g(obj, (long) (q(i2) & 1048575)) == i;
    }

    private boolean N() {
        throw new java.lang.IllegalArgumentException();
    }

    private static final int O(byte[] bArr, int i, int i2, defpackage.abrf abrfVar, java.lang.Class cls, defpackage.abnj abnjVar) throws java.io.IOException {
        defpackage.abrf abrfVar2 = defpackage.abrf.DOUBLE;
        switch (abrfVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                int i3 = i + 8;
                abnjVar.c = java.lang.Double.valueOf(defpackage.abnk.a(bArr, i));
                return i3;
            case 1:
                int i4 = i + 4;
                abnjVar.c = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(defpackage.abnk.c(bArr, i)));
                return i4;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int iO = defpackage.abnk.o(bArr, i, abnjVar);
                abnjVar.c = java.lang.Long.valueOf(abnjVar.b);
                return iO;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
            case 12:
            case 13:
                int iL = defpackage.abnk.l(bArr, i, abnjVar);
                abnjVar.c = java.lang.Integer.valueOf(abnjVar.a);
                return iL;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case 15:
                int i5 = i + 8;
                abnjVar.c = java.lang.Long.valueOf(defpackage.abnk.s(bArr, i));
                return i5;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
            case 14:
                int i6 = i + 4;
                abnjVar.c = java.lang.Integer.valueOf(defpackage.abnk.c(bArr, i));
                return i6;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int iO2 = defpackage.abnk.o(bArr, i, abnjVar);
                abnjVar.c = java.lang.Boolean.valueOf(abnjVar.b != 0);
                return iO2;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.abnk.j(bArr, i, abnjVar);
            case 9:
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
            case 10:
                return defpackage.abnk.f(defpackage.abqg.a.b(cls), bArr, i, i2, abnjVar);
            case 11:
                return defpackage.abnk.b(bArr, i, abnjVar);
            case 16:
                int iL2 = defpackage.abnk.l(bArr, i, abnjVar);
                int i7 = abnjVar.a;
                int i8 = defpackage.abny.l;
                abnjVar.c = java.lang.Integer.valueOf((-(i7 & 1)) ^ (i7 >>> 1));
                return iL2;
            case 17:
                int iO3 = defpackage.abnk.o(bArr, i, abnjVar);
                long j = abnjVar.b;
                int i9 = defpackage.abny.l;
                abnjVar.c = java.lang.Long.valueOf((-(j & 1)) ^ (j >>> 1));
                return iO3;
        }
    }

    private final java.lang.Object P(java.lang.Object obj, int i, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.abpd abpdVarU;
        int iN = n(i);
        java.lang.Object objI = defpackage.abrd.a.i(obj, s(i) & 1048575);
        if (objI == null || (abpdVarU = u(i)) == null) {
            return obj2;
        }
        java.lang.Object obj4 = ((defpackage.ldx) w(i)).a;
        java.util.Iterator it = ((defpackage.abpv) objI).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!abpdVarU.a(((java.lang.Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = defpackage.abqx.e(obj3);
                }
                int iL = defpackage.ldx.l((defpackage.abpu) obj4, entry.getKey(), entry.getValue());
                defpackage.abnv abnvVar = defpackage.abnv.d;
                byte[] bArr = new byte[iL];
                defpackage.aboa aboaVar = new defpackage.aboa(bArr, 0, iL, null);
                try {
                    defpackage.ldx.m(aboaVar, (defpackage.abpu) obj4, entry.getKey(), entry.getValue());
                    aboaVar.I();
                    ((defpackage.abqy) obj2).e((iN << 3) | 2, new defpackage.abnt(bArr));
                    it.remove();
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static final void Q(int i, java.lang.Object obj, defpackage.kwv kwvVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            kwvVar.u(i, (java.lang.String) obj);
        } else {
            kwvVar.f(i, (defpackage.abnv) obj);
        }
    }

    static defpackage.abqy d(java.lang.Object obj) {
        defpackage.abox aboxVar = (defpackage.abox) obj;
        defpackage.abqy abqyVar = aboxVar.al;
        if (abqyVar != defpackage.abqy.a) {
            return abqyVar;
        }
        defpackage.abqy abqyVar2 = new defpackage.abqy();
        aboxVar.al = abqyVar2;
        return abqyVar2;
    }

    public static java.lang.reflect.Field f(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException e) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields), e);
        }
    }

    private final int n(int i) {
        return this.c[i];
    }

    private static int o(java.lang.Object obj, long j) {
        return ((java.lang.Integer) defpackage.abrd.a.i(obj, j)).intValue();
    }

    private final int p(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return r(i, 0);
    }

    private final int q(int i) {
        return this.c[i + 2];
    }

    private final int r(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iN = n(i4);
            if (i == iN) {
                return i4;
            }
            if (i < iN) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int s(int i) {
        return this.c[i + 1];
    }

    private static long t(int i) {
        return i & 1048575;
    }

    private final defpackage.abpd u(int i) {
        int i2 = i / 3;
        return (defpackage.abpd) this.d[i2 + i2 + 1];
    }

    private final defpackage.abqn v(int i) {
        java.lang.Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        defpackage.abqn abqnVar = (defpackage.abqn) objArr[i3];
        if (abqnVar != null) {
            return abqnVar;
        }
        defpackage.abqn abqnVarB = defpackage.abqg.a.b((java.lang.Class) objArr[i3 + 1]);
        objArr[i3] = abqnVarB;
        return abqnVarB;
    }

    private final java.lang.Object w(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final java.lang.Object x(java.lang.Object obj, int i) {
        defpackage.abqn abqnVarV = v(i);
        int iS = s(i) & 1048575;
        if (!I(obj, i)) {
            return abqnVarV.e();
        }
        java.lang.Object object = b.getObject(obj, iS);
        if (K(object)) {
            return object;
        }
        java.lang.Object objE = abqnVarV.e();
        if (object != null) {
            abqnVarV.h(objE, object);
        }
        return objE;
    }

    private final java.lang.Object y(java.lang.Object obj, int i, int i2) {
        defpackage.abqn abqnVarV = v(i2);
        if (!M(obj, i, i2)) {
            return abqnVarV.e();
        }
        java.lang.Object object = b.getObject(obj, t(s(i2)));
        if (K(object)) {
            return object;
        }
        java.lang.Object objE = abqnVarV.e();
        if (object != null) {
            abqnVarV.h(objE, object);
        }
        return objE;
    }

    private static void z(java.lang.Object obj) {
        if (!K(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x044d  */
    /* JADX WARN: Code duplicated, block: B:169:0x050f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0634  */
    @Override // defpackage.abqn
    public final int a(java.lang.Object obj) {
        int i;
        int iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int iNumberOfLeadingZeros4;
        int iNumberOfLeadingZeros5;
        int iNumberOfLeadingZeros6;
        int iBQ;
        int iNumberOfLeadingZeros7;
        int iNumberOfLeadingZeros8;
        int i2;
        int iNumberOfLeadingZeros9;
        int i3;
        int iA;
        int i4;
        int size;
        int i5;
        int iNumberOfLeadingZeros10;
        int iBQ2;
        int iNumberOfLeadingZeros11;
        int iBQ3;
        int iNumberOfLeadingZeros12;
        int iNumberOfLeadingZeros13;
        int iNumberOfLeadingZeros14;
        int size2;
        int iNumberOfLeadingZeros15;
        int iNumberOfLeadingZeros16;
        int iA2;
        int iNumberOfLeadingZeros17;
        int iNumberOfLeadingZeros18;
        int iNumberOfLeadingZeros19;
        int iNumberOfLeadingZeros20;
        int iNumberOfLeadingZeros21;
        int iBQ4;
        int iNumberOfLeadingZeros22;
        int iNumberOfLeadingZeros23;
        int i6;
        defpackage.abqb<T> abqbVar = this;
        sun.misc.Unsafe unsafe = b;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int iNumberOfLeadingZeros24 = 0;
        while (true) {
            int[] iArr = abqbVar.c;
            if (i8 >= iArr.length) {
                int iA3 = iNumberOfLeadingZeros24 + ((defpackage.abox) obj).al.a();
                if (!abqbVar.h) {
                    return iA3;
                }
                defpackage.abqs abqsVar = ((defpackage.abou) obj).w.b;
                int size3 = abqsVar.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size3; i11++) {
                    defpackage.abqp abqpVar = (defpackage.abqp) abqsVar.a(i11);
                    i10 += defpackage.abon.i(abqpVar.c, abqpVar.a);
                }
                return iA3 + i10;
            }
            int iS = abqbVar.s(i8);
            int iN = abqbVar.n(i8);
            int i12 = iArr[i8 + 2];
            int i13 = i12 & 1048575;
            int i14 = (iS >>> 20) & 255;
            if (i14 <= 17) {
                if (i13 != i7) {
                    i9 = i13 == 1048575 ? 0 : unsafe.getInt(obj, i13);
                    i7 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            int i15 = iS & 1048575;
            if (i14 >= defpackage.aboo.DOUBLE_LIST_PACKED.Z) {
                int i16 = defpackage.aboo.SINT64_LIST_PACKED.Z;
            }
            long j = i15;
            switch (i14) {
                case defpackage.abnt.b /* 0 */:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        iNumberOfLeadingZeros24 += ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 8;
                    }
                    break;
                case 1:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros5 = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros3 = java.lang.Long.numberOfLeadingZeros(j2);
                        i3 = 640 - (iNumberOfLeadingZeros3 * 9);
                        iNumberOfLeadingZeros5 = ((352 - iNumberOfLeadingZeros2) >>> 6) + (i3 >>> 6);
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros3 = java.lang.Long.numberOfLeadingZeros(j3);
                        i3 = 640 - (iNumberOfLeadingZeros3 * 9);
                        iNumberOfLeadingZeros5 = ((352 - iNumberOfLeadingZeros2) >>> 6) + (i3 >>> 6);
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        int i17 = unsafe.getInt(obj, j);
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros3 = java.lang.Long.numberOfLeadingZeros(i17);
                        i3 = 640 - (iNumberOfLeadingZeros3 * 9);
                        iNumberOfLeadingZeros5 = ((352 - iNumberOfLeadingZeros2) >>> 6) + (i3 >>> 6);
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        iNumberOfLeadingZeros4 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros5 = ((352 - (iNumberOfLeadingZeros4 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros5 = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        iNumberOfLeadingZeros5 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 1;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        int i18 = iN << 3;
                        java.lang.Object object = unsafe.getObject(obj, j);
                        if (object instanceof defpackage.abnv) {
                            iNumberOfLeadingZeros6 = java.lang.Integer.numberOfLeadingZeros(i18) * 9;
                            iBQ = ((defpackage.abnv) object).d();
                            iNumberOfLeadingZeros7 = java.lang.Integer.numberOfLeadingZeros(iBQ);
                        } else {
                            iNumberOfLeadingZeros6 = java.lang.Integer.numberOfLeadingZeros(i18) * 9;
                            iBQ = defpackage.ysr.bQ((java.lang.String) object);
                            iNumberOfLeadingZeros7 = java.lang.Integer.numberOfLeadingZeros(iBQ);
                        }
                        iNumberOfLeadingZeros5 = ((352 - iNumberOfLeadingZeros6) >>> 6) + ((352 - (iNumberOfLeadingZeros7 * 9)) >>> 6) + iBQ;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case 9:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        java.lang.Object object2 = unsafe.getObject(obj, j);
                        defpackage.abqn abqnVarV = abqbVar.v(i8);
                        defpackage.abqx abqxVar = defpackage.abqo.a;
                        int iNumberOfLeadingZeros25 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        int iE = ((defpackage.abng) object2).e(abqnVarV);
                        iNumberOfLeadingZeros8 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iE) * 9)) >>> 6) + iE;
                        i2 = (352 - iNumberOfLeadingZeros25) >>> 6;
                        iA = i2 + iNumberOfLeadingZeros8;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 10:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        defpackage.abnv abnvVar = (defpackage.abnv) unsafe.getObject(obj, j);
                        iNumberOfLeadingZeros6 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iBQ = abnvVar.d();
                        iNumberOfLeadingZeros7 = java.lang.Integer.numberOfLeadingZeros(iBQ);
                        iNumberOfLeadingZeros5 = ((352 - iNumberOfLeadingZeros6) >>> 6) + ((352 - (iNumberOfLeadingZeros7 * 9)) >>> 6) + iBQ;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case 11:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        int i19 = unsafe.getInt(obj, j);
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros(i19);
                        i3 = 352 - (iNumberOfLeadingZeros9 * 9);
                        iNumberOfLeadingZeros5 = ((352 - iNumberOfLeadingZeros2) >>> 6) + (i3 >>> 6);
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case 12:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        int i20 = unsafe.getInt(obj, j);
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros3 = java.lang.Long.numberOfLeadingZeros(i20);
                        i3 = 640 - (iNumberOfLeadingZeros3 * 9);
                        iNumberOfLeadingZeros5 = ((352 - iNumberOfLeadingZeros2) >>> 6) + (i3 >>> 6);
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case 13:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros5 = ((352 - (iNumberOfLeadingZeros * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case 14:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        iNumberOfLeadingZeros4 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iNumberOfLeadingZeros5 = ((352 - (iNumberOfLeadingZeros4 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case 15:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        int i21 = unsafe.getInt(obj, j);
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros9 = java.lang.Integer.numberOfLeadingZeros((i21 >> 31) ^ (i21 + i21));
                        i3 = 352 - (iNumberOfLeadingZeros9 * 9);
                        iNumberOfLeadingZeros5 = ((352 - iNumberOfLeadingZeros2) >>> 6) + (i3 >>> 6);
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case 16:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        long j4 = unsafe.getLong(obj, j);
                        iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros3 = java.lang.Long.numberOfLeadingZeros((j4 >> 63) ^ (j4 + j4));
                        i3 = 640 - (iNumberOfLeadingZeros3 * 9);
                        iNumberOfLeadingZeros5 = ((352 - iNumberOfLeadingZeros2) >>> 6) + (i3 >>> 6);
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros5;
                    }
                    abqbVar = this;
                    break;
                case 17:
                    if (abqbVar.J(obj, i8, i7, i9, i)) {
                        iA = defpackage.abqo.a(iN, (defpackage.abpy) unsafe.getObject(obj, j), abqbVar.v(i8));
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 18:
                    iA = defpackage.abqo.g(iN, (java.util.List) unsafe.getObject(obj, j));
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 19:
                    iA = defpackage.abqo.f(iN, (java.util.List) unsafe.getObject(obj, j));
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 20:
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar2 = defpackage.abqo.a;
                    if (list.size() == 0) {
                        i4 = 0;
                    } else {
                        i4 = defpackage.abqo.i(list) + (list.size() * ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6));
                    }
                    iNumberOfLeadingZeros24 += i4;
                    break;
                case 21:
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar3 = defpackage.abqo.a;
                    size = list2.size();
                    if (size == 0) {
                        iA = 0;
                    } else {
                        i5 = defpackage.abqo.i(list2);
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = i5 + (size * ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6));
                    }
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 22:
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar4 = defpackage.abqo.a;
                    size = list3.size();
                    if (size == 0) {
                        iA = 0;
                    } else {
                        i5 = defpackage.abqo.h(list3);
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = i5 + (size * ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6));
                    }
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 23:
                    iA = defpackage.abqo.g(iN, (java.util.List) unsafe.getObject(obj, j));
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 24:
                    iA = defpackage.abqo.f(iN, (java.util.List) unsafe.getObject(obj, j));
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 25:
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar5 = defpackage.abqo.a;
                    int size4 = list4.size();
                    if (size4 == 0) {
                        iA = 0;
                    } else {
                        iA = size4 * (((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 1);
                    }
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 26:
                    java.util.List list5 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar6 = defpackage.abqo.a;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        i4 = 0;
                    } else {
                        boolean z = list5 instanceof defpackage.abps;
                        i4 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) * size5;
                        if (z) {
                            defpackage.abps abpsVar = (defpackage.abps) list5;
                            for (int i22 = 0; i22 < size5; i22++) {
                                java.lang.Object objC = abpsVar.c();
                                if (objC instanceof defpackage.abnv) {
                                    iBQ3 = ((defpackage.abnv) objC).d();
                                    iNumberOfLeadingZeros12 = java.lang.Integer.numberOfLeadingZeros(iBQ3);
                                } else {
                                    iBQ3 = defpackage.ysr.bQ((java.lang.String) objC);
                                    iNumberOfLeadingZeros12 = java.lang.Integer.numberOfLeadingZeros(iBQ3);
                                }
                                i4 += ((352 - (iNumberOfLeadingZeros12 * 9)) >>> 6) + iBQ3;
                            }
                        } else {
                            for (int i23 = 0; i23 < size5; i23++) {
                                java.lang.Object obj2 = list5.get(i23);
                                if (obj2 instanceof defpackage.abnv) {
                                    iBQ2 = ((defpackage.abnv) obj2).d();
                                    iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iBQ2);
                                } else {
                                    iBQ2 = defpackage.ysr.bQ((java.lang.String) obj2);
                                    iNumberOfLeadingZeros11 = java.lang.Integer.numberOfLeadingZeros(iBQ2);
                                }
                                i4 += ((352 - (iNumberOfLeadingZeros11 * 9)) >>> 6) + iBQ2;
                            }
                        }
                    }
                    iNumberOfLeadingZeros24 += i4;
                    break;
                case 27:
                    java.util.List list6 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqn abqnVarV2 = abqbVar.v(i8);
                    defpackage.abqx abqxVar7 = defpackage.abqo.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iNumberOfLeadingZeros13 = 0;
                    } else {
                        iNumberOfLeadingZeros13 = ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) * size6;
                        for (int i24 = 0; i24 < size6; i24++) {
                            int iE2 = ((defpackage.abng) list6.get(i24)).e(abqnVarV2);
                            iNumberOfLeadingZeros13 += ((352 - (java.lang.Integer.numberOfLeadingZeros(iE2) * 9)) >>> 6) + iE2;
                        }
                    }
                    iNumberOfLeadingZeros24 += iNumberOfLeadingZeros13;
                    break;
                case 28:
                    java.util.List list7 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar8 = defpackage.abqo.a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iNumberOfLeadingZeros14 = 0;
                    } else {
                        iNumberOfLeadingZeros14 = size7 * ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6);
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            iNumberOfLeadingZeros14 += defpackage.abof.E((defpackage.abnv) list7.get(i25));
                        }
                    }
                    iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    break;
                case 29:
                    java.util.List list8 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar9 = defpackage.abqo.a;
                    size = list8.size();
                    if (size == 0) {
                        iA = 0;
                    } else {
                        i5 = defpackage.abqo.d(list8);
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = i5 + (size * ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6));
                    }
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 30:
                    java.util.List list9 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar10 = defpackage.abqo.a;
                    size = list9.size();
                    if (size == 0) {
                        iA = 0;
                    } else {
                        i5 = defpackage.abqo.h(list9);
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = i5 + (size * ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6));
                    }
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 31:
                    iA = defpackage.abqo.f(iN, (java.util.List) unsafe.getObject(obj, j));
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 32:
                    iA = defpackage.abqo.g(iN, (java.util.List) unsafe.getObject(obj, j));
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 33:
                    java.util.List list10 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar11 = defpackage.abqo.a;
                    size = list10.size();
                    if (size == 0) {
                        iA = 0;
                    } else {
                        i5 = defpackage.abqo.b(list10);
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = i5 + (size * ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6));
                    }
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 34:
                    java.util.List list11 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar12 = defpackage.abqo.a;
                    size = list11.size();
                    if (size == 0) {
                        iA = 0;
                    } else {
                        i5 = defpackage.abqo.c(list11);
                        iNumberOfLeadingZeros10 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = i5 + (size * ((352 - (iNumberOfLeadingZeros10 * 9)) >>> 6));
                    }
                    iNumberOfLeadingZeros24 += iA;
                    break;
                case 35:
                    java.util.List list12 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar13 = defpackage.abqo.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 36:
                    java.util.List list13 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar14 = defpackage.abqo.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 37:
                    size2 = defpackage.abqo.i((java.util.List) unsafe.getObject(obj, j));
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 38:
                    size2 = defpackage.abqo.i((java.util.List) unsafe.getObject(obj, j));
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 39:
                    size2 = defpackage.abqo.h((java.util.List) unsafe.getObject(obj, j));
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 40:
                    java.util.List list14 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar15 = defpackage.abqo.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 41:
                    java.util.List list15 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar16 = defpackage.abqo.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 42:
                    java.util.List list16 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar17 = defpackage.abqo.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 43:
                    size2 = defpackage.abqo.d((java.util.List) unsafe.getObject(obj, j));
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 44:
                    size2 = defpackage.abqo.h((java.util.List) unsafe.getObject(obj, j));
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 45:
                    java.util.List list17 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar18 = defpackage.abqo.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 46:
                    java.util.List list18 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqx abqxVar19 = defpackage.abqo.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 47:
                    size2 = defpackage.abqo.b((java.util.List) unsafe.getObject(obj, j));
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 48:
                    size2 = defpackage.abqo.c((java.util.List) unsafe.getObject(obj, j));
                    if (size2 > 0) {
                        iNumberOfLeadingZeros15 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros16 = java.lang.Integer.numberOfLeadingZeros(size2);
                        iNumberOfLeadingZeros14 = ((352 - iNumberOfLeadingZeros15) >>> 6) + ((352 - (iNumberOfLeadingZeros16 * 9)) >>> 6) + size2;
                        iNumberOfLeadingZeros24 += iNumberOfLeadingZeros14;
                    }
                    break;
                case 49:
                    java.util.List list19 = (java.util.List) unsafe.getObject(obj, j);
                    defpackage.abqn abqnVarV3 = abqbVar.v(i8);
                    defpackage.abqx abqxVar20 = defpackage.abqo.a;
                    int size8 = list19.size();
                    if (size8 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (int i26 = 0; i26 < size8; i26++) {
                            iA2 += defpackage.abqo.a(iN, (defpackage.abpy) list19.get(i26), abqnVarV3);
                        }
                    }
                    iNumberOfLeadingZeros24 += iA2;
                    break;
                case 50:
                    defpackage.abpv abpvVar = (defpackage.abpv) unsafe.getObject(obj, j);
                    defpackage.ldx ldxVar = (defpackage.ldx) abqbVar.w(i8);
                    if (abpvVar.isEmpty()) {
                        iNumberOfLeadingZeros13 = 0;
                    } else {
                        iNumberOfLeadingZeros13 = 0;
                        for (java.util.Map.Entry entry : abpvVar.entrySet()) {
                            java.lang.Object key = entry.getKey();
                            java.lang.Object value = entry.getValue();
                            int iNumberOfLeadingZeros26 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                            int iL = defpackage.ldx.l((defpackage.abpu) ldxVar.a, key, value);
                            iNumberOfLeadingZeros13 += ((352 - iNumberOfLeadingZeros26) >>> 6) + ((352 - (java.lang.Integer.numberOfLeadingZeros(iL) * 9)) >>> 6) + iL;
                        }
                    }
                    iNumberOfLeadingZeros24 += iNumberOfLeadingZeros13;
                    break;
                case 51:
                    if (abqbVar.M(obj, iN, i8)) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros17 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 52:
                    if (abqbVar.M(obj, iN, i8)) {
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 53:
                    if (abqbVar.M(obj, iN, i8)) {
                        long jLongValue = ((java.lang.Long) defpackage.abrd.a.i(obj, j)).longValue();
                        iNumberOfLeadingZeros19 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros20 = java.lang.Long.numberOfLeadingZeros(jLongValue);
                        i6 = 640 - (iNumberOfLeadingZeros20 * 9);
                        i2 = (352 - iNumberOfLeadingZeros19) >>> 6;
                        iNumberOfLeadingZeros8 = i6 >>> 6;
                        iA = i2 + iNumberOfLeadingZeros8;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 54:
                    if (abqbVar.M(obj, iN, i8)) {
                        long jLongValue2 = ((java.lang.Long) defpackage.abrd.a.i(obj, j)).longValue();
                        iNumberOfLeadingZeros19 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros20 = java.lang.Long.numberOfLeadingZeros(jLongValue2);
                        i6 = 640 - (iNumberOfLeadingZeros20 * 9);
                        i2 = (352 - iNumberOfLeadingZeros19) >>> 6;
                        iNumberOfLeadingZeros8 = i6 >>> 6;
                        iA = i2 + iNumberOfLeadingZeros8;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 55:
                    if (abqbVar.M(obj, iN, i8)) {
                        int iO = o(obj, j);
                        iNumberOfLeadingZeros19 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros20 = java.lang.Long.numberOfLeadingZeros(iO);
                        i6 = 640 - (iNumberOfLeadingZeros20 * 9);
                        i2 = (352 - iNumberOfLeadingZeros19) >>> 6;
                        iNumberOfLeadingZeros8 = i6 >>> 6;
                        iA = i2 + iNumberOfLeadingZeros8;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 56:
                    if (abqbVar.M(obj, iN, i8)) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros17 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 57:
                    if (abqbVar.M(obj, iN, i8)) {
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 58:
                    if (abqbVar.M(obj, iN, i8)) {
                        iA = ((352 - (java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9)) >>> 6) + 1;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 59:
                    if (abqbVar.M(obj, iN, i8)) {
                        int i27 = iN << 3;
                        java.lang.Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof defpackage.abnv) {
                            iNumberOfLeadingZeros21 = java.lang.Integer.numberOfLeadingZeros(i27) * 9;
                            iBQ4 = ((defpackage.abnv) object3).d();
                            iNumberOfLeadingZeros22 = java.lang.Integer.numberOfLeadingZeros(iBQ4);
                        } else {
                            iNumberOfLeadingZeros21 = java.lang.Integer.numberOfLeadingZeros(i27) * 9;
                            iBQ4 = defpackage.ysr.bQ((java.lang.String) object3);
                            iNumberOfLeadingZeros22 = java.lang.Integer.numberOfLeadingZeros(iBQ4);
                        }
                        iA = ((352 - iNumberOfLeadingZeros21) >>> 6) + ((352 - (iNumberOfLeadingZeros22 * 9)) >>> 6) + iBQ4;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 60:
                    if (abqbVar.M(obj, iN, i8)) {
                        int i28 = iN << 3;
                        java.lang.Object object4 = unsafe.getObject(obj, j);
                        defpackage.abqn abqnVarV4 = abqbVar.v(i8);
                        defpackage.abqx abqxVar21 = defpackage.abqo.a;
                        iNumberOfLeadingZeros21 = java.lang.Integer.numberOfLeadingZeros(i28) * 9;
                        iBQ4 = ((defpackage.abng) object4).e(abqnVarV4);
                        iNumberOfLeadingZeros22 = java.lang.Integer.numberOfLeadingZeros(iBQ4);
                        iA = ((352 - iNumberOfLeadingZeros21) >>> 6) + ((352 - (iNumberOfLeadingZeros22 * 9)) >>> 6) + iBQ4;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 61:
                    if (abqbVar.M(obj, iN, i8)) {
                        defpackage.abnv abnvVar2 = (defpackage.abnv) unsafe.getObject(obj, j);
                        iNumberOfLeadingZeros21 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iBQ4 = abnvVar2.d();
                        iNumberOfLeadingZeros22 = java.lang.Integer.numberOfLeadingZeros(iBQ4);
                        iA = ((352 - iNumberOfLeadingZeros21) >>> 6) + ((352 - (iNumberOfLeadingZeros22 * 9)) >>> 6) + iBQ4;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 62:
                    if (abqbVar.M(obj, iN, i8)) {
                        int iO2 = o(obj, j);
                        iNumberOfLeadingZeros19 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros23 = java.lang.Integer.numberOfLeadingZeros(iO2);
                        i6 = 352 - (iNumberOfLeadingZeros23 * 9);
                        i2 = (352 - iNumberOfLeadingZeros19) >>> 6;
                        iNumberOfLeadingZeros8 = i6 >>> 6;
                        iA = i2 + iNumberOfLeadingZeros8;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 63:
                    if (abqbVar.M(obj, iN, i8)) {
                        int iO3 = o(obj, j);
                        iNumberOfLeadingZeros19 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros20 = java.lang.Long.numberOfLeadingZeros(iO3);
                        i6 = 640 - (iNumberOfLeadingZeros20 * 9);
                        i2 = (352 - iNumberOfLeadingZeros19) >>> 6;
                        iNumberOfLeadingZeros8 = i6 >>> 6;
                        iA = i2 + iNumberOfLeadingZeros8;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 64:
                    if (abqbVar.M(obj, iN, i8)) {
                        iNumberOfLeadingZeros18 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros18 * 9)) >>> 6) + 4;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 65:
                    if (abqbVar.M(obj, iN, i8)) {
                        iNumberOfLeadingZeros17 = java.lang.Integer.numberOfLeadingZeros(iN << 3);
                        iA = ((352 - (iNumberOfLeadingZeros17 * 9)) >>> 6) + 8;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 66:
                    if (abqbVar.M(obj, iN, i8)) {
                        int iO4 = o(obj, j);
                        iNumberOfLeadingZeros19 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros23 = java.lang.Integer.numberOfLeadingZeros((iO4 >> 31) ^ (iO4 + iO4));
                        i6 = 352 - (iNumberOfLeadingZeros23 * 9);
                        i2 = (352 - iNumberOfLeadingZeros19) >>> 6;
                        iNumberOfLeadingZeros8 = i6 >>> 6;
                        iA = i2 + iNumberOfLeadingZeros8;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 67:
                    if (abqbVar.M(obj, iN, i8)) {
                        long jLongValue3 = ((java.lang.Long) defpackage.abrd.a.i(obj, j)).longValue();
                        iNumberOfLeadingZeros19 = java.lang.Integer.numberOfLeadingZeros(iN << 3) * 9;
                        iNumberOfLeadingZeros20 = java.lang.Long.numberOfLeadingZeros((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                        i6 = 640 - (iNumberOfLeadingZeros20 * 9);
                        i2 = (352 - iNumberOfLeadingZeros19) >>> 6;
                        iNumberOfLeadingZeros8 = i6 >>> 6;
                        iA = i2 + iNumberOfLeadingZeros8;
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
                case 68:
                    if (abqbVar.M(obj, iN, i8)) {
                        iA = defpackage.abqo.a(iN, (defpackage.abpy) unsafe.getObject(obj, j), abqbVar.v(i8));
                        iNumberOfLeadingZeros24 += iA;
                    }
                    break;
            }
            i8 += 3;
        }
    }

    @Override // defpackage.abqn
    public final int b(java.lang.Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int iHashCode = 0;
        for (int i3 = 0; i3 < this.c.length; i3 += 3) {
            int iS = s(i3);
            int i4 = (iS >>> 20) & 255;
            if (i4 <= 50 || i4 >= 69) {
                long j = iS & 1048575;
                int iHashCode2 = 37;
                switch (i4) {
                    case defpackage.abnt.b /* 0 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = java.lang.Double.doubleToLongBits(defpackage.abrd.b(obj, j));
                        byte[] bArr = defpackage.abpk.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iFloatToIntBits = java.lang.Float.floatToIntBits(defpackage.abrd.c(obj, j));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = defpackage.abrd.a.h(obj, j);
                        byte[] bArr2 = defpackage.abpk.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = defpackage.abrd.a.h(obj, j);
                        byte[] bArr3 = defpackage.abpk.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.abrd.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = defpackage.abrd.a.h(obj, j);
                        byte[] bArr4 = defpackage.abpk.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.abrd.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = iHashCode * 53;
                        boolean zF = defpackage.abrd.a.f(obj, j);
                        byte[] bArr5 = defpackage.abpk.a;
                        iFloatToIntBits = true != zF ? 1237 : 1231;
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        i = iHashCode * 53;
                        iFloatToIntBits = ((java.lang.String) defpackage.abrd.a.i(obj, j)).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 9:
                        i2 = iHashCode * 53;
                        java.lang.Object objI = defpackage.abrd.a.i(obj, j);
                        if (objI != null) {
                            iHashCode2 = objI.hashCode();
                        }
                        iHashCode = i2 + iHashCode2;
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.abrd.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.abrd.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.abrd.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.abrd.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = defpackage.abrd.a.h(obj, j);
                        byte[] bArr6 = defpackage.abpk.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.abrd.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = defpackage.abrd.a.h(obj, j);
                        byte[] bArr7 = defpackage.abpk.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 17:
                        i2 = iHashCode * 53;
                        java.lang.Object objI2 = defpackage.abrd.a.i(obj, j);
                        if (objI2 != null) {
                            iHashCode2 = objI2.hashCode();
                        }
                        iHashCode = i2 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.abrd.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iFloatToIntBits = defpackage.abrd.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                }
            }
        }
        int i5 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i5 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((defpackage.abox) obj).al.hashCode();
                return this.h ? (iHashCode3 * 53) + ((defpackage.abou) obj).w.hashCode() : iHashCode3;
            }
            int i6 = iArr[i5];
            if (!M(obj, 0, i6)) {
                iHashCode = (iHashCode * 53) + defpackage.abrd.a.i(obj, s(i6) & 1048575).hashCode();
            }
            i5++;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int c(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, defpackage.abnj r42) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abqb.c(java.lang.Object, byte[], int, int, int, abnj):int");
    }

    @Override // defpackage.abqn
    public final java.lang.Object e() {
        return ((defpackage.abox) this.g).u();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086 A[SYNTHETIC] */
    @Override // defpackage.abqn
    public final void g(java.lang.Object obj) {
        if (K(obj)) {
            if (obj instanceof defpackage.abox) {
                defpackage.abox aboxVar = (defpackage.abox) obj;
                aboxVar.Q(Integer.MAX_VALUE);
                aboxVar.ak = 0;
                aboxVar.O();
            }
            int[] iArr = this.c;
            for (int i = 0; i < iArr.length; i += 3) {
                int iS = s(i);
                int i2 = 1048575 & iS;
                int i3 = (iS >>> 20) & 255;
                long j = i2;
                if (i3 != 9) {
                    if (i3 != 60 && i3 != 68) {
                        switch (i3) {
                            case 17:
                                if (I(obj, i)) {
                                    v(i).g(b.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((defpackage.abpj) defpackage.abrd.a.i(obj, j)).b();
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = b;
                                java.lang.Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((defpackage.abpv) object).c();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (M(obj, n(i), i)) {
                        v(i).g(b.getObject(obj, j));
                    }
                } else if (I(obj, i)) {
                    v(i).g(b.getObject(obj, j));
                }
            }
            ((defpackage.abox) obj).al.d();
            if (this.h) {
                ((defpackage.abou) obj).w.e();
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.abqn
    public final void h(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        z(obj);
        obj2.getClass();
        int i = 0;
        while (i < this.c.length) {
            int iS = s(i);
            int iN = n(i);
            long j = 1048575 & iS;
            switch ((iS >>> 20) & 255) {
                case defpackage.abnt.b /* 0 */:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrd.k(obj3, j, defpackage.abrd.b(obj2, j));
                        D(obj3, i);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrd.a.e(obj3, j, defpackage.abrd.c(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar = defpackage.abrd.a;
                        abrcVar.k(obj3, j, abrcVar.h(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar2 = defpackage.abrd.a;
                        abrcVar2.k(obj3, j, abrcVar2.h(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar3 = defpackage.abrd.a;
                        abrcVar3.j(obj3, j, abrcVar3.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar4 = defpackage.abrd.a;
                        abrcVar4.k(obj3, j, abrcVar4.h(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar5 = defpackage.abrd.a;
                        abrcVar5.j(obj3, j, abrcVar5.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar6 = defpackage.abrd.a;
                        abrcVar6.c(obj3, j, abrcVar6.f(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar7 = defpackage.abrd.a;
                        abrcVar7.l(obj3, j, abrcVar7.i(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    A(obj3, obj2, i);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar8 = defpackage.abrd.a;
                        abrcVar8.l(obj3, j, abrcVar8.i(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar9 = defpackage.abrd.a;
                        abrcVar9.j(obj3, j, abrcVar9.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar10 = defpackage.abrd.a;
                        abrcVar10.j(obj3, j, abrcVar10.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar11 = defpackage.abrd.a;
                        abrcVar11.j(obj3, j, abrcVar11.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar12 = defpackage.abrd.a;
                        abrcVar12.k(obj3, j, abrcVar12.h(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar13 = defpackage.abrd.a;
                        abrcVar13.j(obj3, j, abrcVar13.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (I(obj2, i)) {
                        defpackage.abrc abrcVar14 = defpackage.abrd.a;
                        obj3 = obj;
                        abrcVar14.k(obj3, j, abrcVar14.h(obj2, j));
                        D(obj3, i);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    A(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    defpackage.abrc abrcVar15 = defpackage.abrd.a;
                    defpackage.abpj abpjVarD = (defpackage.abpj) abrcVar15.i(obj, j);
                    defpackage.abpj abpjVar = (defpackage.abpj) abrcVar15.i(obj2, j);
                    int size = abpjVarD.size();
                    int size2 = abpjVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!abpjVarD.c()) {
                            abpjVarD = abpjVarD.d(size2 + size);
                        }
                        abpjVarD.addAll(abpjVar);
                    }
                    if (size > 0) {
                        abpjVar = abpjVarD;
                    }
                    abrcVar15.l(obj, j, abpjVar);
                    break;
                case 50:
                    defpackage.abqx abqxVar = defpackage.abqo.a;
                    defpackage.abrc abrcVar16 = defpackage.abrd.a;
                    abrcVar16.l(obj, j, defpackage.ysr.bU(abrcVar16.i(obj, j), abrcVar16.i(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (M(obj2, iN, i)) {
                        defpackage.abrc abrcVar17 = defpackage.abrd.a;
                        abrcVar17.l(obj, j, abrcVar17.i(obj2, j));
                        E(obj, iN, i);
                    }
                    break;
                case 60:
                    B(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (M(obj2, iN, i)) {
                        defpackage.abrc abrcVar18 = defpackage.abrd.a;
                        abrcVar18.l(obj, j, abrcVar18.i(obj2, j));
                        E(obj, iN, i);
                    }
                    break;
                case 68:
                    B(obj, obj2, i);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
        java.lang.Object obj4 = obj;
        defpackage.abqx abqxVar2 = defpackage.abqo.a;
        defpackage.abox aboxVar = (defpackage.abox) obj4;
        aboxVar.al = defpackage.abqx.c(aboxVar.al, ((defpackage.abox) obj2).al);
        if (this.h) {
            defpackage.abqo.j(obj4, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:297:0x0849 A[Catch: all -> 0x0845, TRY_ENTER, TryCatch #2 {all -> 0x0845, blocks: (B:76:0x01c3, B:288:0x082e, B:297:0x0849, B:298:0x084e), top: B:324:0x01c3 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x085b A[LOOP:1: B:301:0x0857->B:303:0x085b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x0868  */
    /* JADX WARN: Code duplicated, block: B:313:0x0879 A[LOOP:4: B:311:0x0875->B:313:0x0879, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:315:0x0886  */
    /* JADX WARN: Code duplicated, block: B:356:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0855 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x019b  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a0 A[Catch: all -> 0x0870, TryCatch #10 {all -> 0x0870, blocks: (B:3:0x0010, B:11:0x0034, B:17:0x0044, B:18:0x004b, B:20:0x0059, B:22:0x0065, B:23:0x006a, B:62:0x0184, B:64:0x018a, B:65:0x018f, B:73:0x01b8, B:70:0x01a0, B:72:0x01a6, B:24:0x0070, B:25:0x0078, B:27:0x007e, B:28:0x0088, B:29:0x0092, B:30:0x009c, B:31:0x00a6, B:32:0x00ad, B:33:0x00ae, B:34:0x00b8, B:35:0x00be, B:37:0x00c4, B:39:0x00cc, B:41:0x00db, B:42:0x00e6, B:43:0x00eb, B:44:0x00f7, B:46:0x00fd, B:48:0x0105, B:50:0x0114, B:51:0x011f, B:52:0x0124, B:53:0x0138, B:54:0x013d, B:55:0x0146, B:56:0x014f, B:57:0x0158, B:58:0x0161, B:59:0x016a, B:60:0x0173, B:61:0x017c, B:75:0x01bf, B:14:0x003a, B:82:0x01da, B:89:0x01f5, B:90:0x0207, B:91:0x021c, B:92:0x0231, B:93:0x0246, B:94:0x025a, B:96:0x0264, B:99:0x026b, B:100:0x0271, B:101:0x0281, B:102:0x0295, B:103:0x02a5, B:104:0x02b6, B:107:0x02c5, B:108:0x02d9, B:109:0x02ed, B:110:0x0301, B:111:0x0315, B:112:0x0329, B:113:0x033e, B:114:0x0353, B:116:0x0368, B:118:0x0376, B:120:0x037c, B:124:0x0399, B:152:0x041e, B:160:0x042f, B:161:0x0434, B:121:0x0386, B:123:0x038c, B:164:0x043b, B:166:0x044e, B:168:0x045d, B:170:0x0461, B:172:0x0467, B:173:0x046b, B:174:0x0470, B:175:0x0471, B:176:0x047f, B:177:0x048d, B:178:0x049b, B:179:0x04a9, B:186:0x04cb, B:187:0x04d4, B:188:0x04e2, B:189:0x04f0, B:190:0x04fe, B:191:0x050c, B:192:0x0519, B:193:0x0526, B:194:0x0533, B:195:0x0540, B:196:0x054d, B:197:0x055a, B:198:0x0567), top: B:334:0x0010 }] */
    @Override // defpackage.abqn
    public final void i(java.lang.Object obj, defpackage.abnz abnzVar, defpackage.abol abolVar) throws java.lang.Throwable {
        java.lang.Object obj2;
        int i;
        java.lang.Object objValueOf;
        int iOrdinal;
        java.lang.Object objJ;
        java.lang.Object obj3;
        defpackage.abon abonVar;
        java.lang.Object obj4;
        defpackage.abqx abqxVar;
        int i2;
        java.lang.Object obj5 = obj;
        abolVar.getClass();
        z(obj5);
        java.lang.Object objP = null;
        defpackage.abon abonVarI = null;
        while (true) {
            try {
                int iC = abnzVar.c();
                int iP = p(iC);
                defpackage.abqx abqxVar2 = this.m;
                int i3 = Integer.MAX_VALUE;
                if (iP >= 0) {
                    int iS = s(iP);
                    switch ((iS >>> 20) & 255) {
                        case defpackage.abnt.b /* 0 */:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.k(obj5, iS & 1048575, abnzVar.a());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 1:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.e(obj5, iS & 1048575, abnzVar.b());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.k(obj5, iS & 1048575, abnzVar.k());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.k(obj5, iS & 1048575, abnzVar.n());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.j(obj5, iS & 1048575, abnzVar.f());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.k(obj5, iS & 1048575, abnzVar.j());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.j(obj5, iS & 1048575, abnzVar.e());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.c(obj5, iS & 1048575, abnzVar.N());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            obj3 = objP;
                            abonVar = abonVarI;
                            C(obj5, iS, abnzVar);
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 9:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abpy abpyVar = (defpackage.abpy) x(obj5, iP);
                            abnzVar.w(abpyVar, v(iP), abolVar);
                            F(obj5, iP, abpyVar);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 10:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.l(obj5, iS & 1048575, abnzVar.o());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 11:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.j(obj5, iS & 1048575, abnzVar.i());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 12:
                            obj3 = objP;
                            abonVar = abonVarI;
                            int iD = abnzVar.d();
                            defpackage.abpd abpdVarU = u(iP);
                            if (abpdVarU == null || abpdVarU.a(iD)) {
                                defpackage.abrd.a.j(obj5, iS & 1048575, iD);
                                D(obj5, iP);
                                objP = obj3;
                            } else {
                                objP = defpackage.abqo.k(obj5, iC, iD, obj3);
                            }
                            abonVarI = abonVar;
                            break;
                        case 13:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.j(obj5, iS & 1048575, abnzVar.g());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 14:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.k(obj5, iS & 1048575, abnzVar.l());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 15:
                            obj3 = objP;
                            abonVar = abonVarI;
                            defpackage.abrd.a.j(obj5, iS & 1048575, abnzVar.h());
                            D(obj5, iP);
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 16:
                            abonVar = abonVarI;
                            obj4 = objP;
                            try {
                                try {
                                    obj3 = obj4;
                                    defpackage.abrd.a.k(obj5, iS & 1048575, abnzVar.m());
                                    D(obj5, iP);
                                    objP = obj3;
                                } catch (defpackage.abpo unused) {
                                    abqxVar = abqxVar2;
                                    obj2 = obj4;
                                    objP = obj2;
                                    if (objP == null) {
                                        objP = defpackage.abqx.e(obj5);
                                    }
                                    if (!abqxVar.a(objP, abnzVar, 0)) {
                                        for (i2 = this.k; i2 < this.l; i2++) {
                                            objP = P(obj5, this.j[i2], objP, obj5);
                                        }
                                        if (objP != null) {
                                            ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                                        }
                                    }
                                }
                            } catch (defpackage.abpo unused2) {
                                abqxVar = abqxVar2;
                            }
                            abonVarI = abonVar;
                            break;
                        case 17:
                            abonVar = abonVarI;
                            obj4 = objP;
                            defpackage.abpy abpyVar2 = (defpackage.abpy) x(obj5, iP);
                            abnzVar.v(abpyVar2, v(iP), abolVar);
                            F(obj5, iP, abpyVar2);
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 18:
                            abonVar = abonVarI;
                            obj4 = objP;
                            abnzVar.y(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 19:
                            abonVar = abonVarI;
                            obj4 = objP;
                            abnzVar.C(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 20:
                            abonVar = abonVarI;
                            obj4 = objP;
                            abnzVar.E(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 21:
                            abonVar = abonVarI;
                            obj4 = objP;
                            abnzVar.L(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 22:
                            abonVar = abonVarI;
                            obj4 = objP;
                            abnzVar.D(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 23:
                            abonVar = abonVarI;
                            obj4 = objP;
                            abnzVar.B(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 24:
                            abonVar = abonVarI;
                            obj4 = objP;
                            abnzVar.A(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 25:
                            abonVar = abonVarI;
                            obj4 = objP;
                            abnzVar.x(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 26:
                            abonVar = abonVarI;
                            obj4 = objP;
                            if ((536870912 & iS) != 0) {
                                abnzVar.J(defpackage.ysr.bW(obj5, iS & 1048575), true);
                            } else {
                                abnzVar.J(defpackage.ysr.bW(obj5, iS & 1048575), false);
                            }
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 27:
                            abonVar = abonVarI;
                            obj4 = objP;
                            defpackage.abqn abqnVarV = v(iP);
                            java.util.List listBW = defpackage.ysr.bW(obj5, iS & 1048575);
                            int i4 = abnzVar.b;
                            if ((i4 & 7) != 2) {
                                throw new defpackage.abpo();
                            }
                            while (true) {
                                listBW.add(abnzVar.r(abqnVarV, abolVar));
                                defpackage.abny abnyVar = abnzVar.a;
                                if (!abnyVar.C() && abnzVar.c == 0) {
                                    int iN = abnyVar.n();
                                    if (iN != i4) {
                                        abnzVar.c = iN;
                                    }
                                }
                            }
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                            break;
                        case 28:
                            abonVar = abonVarI;
                            obj4 = objP;
                            java.util.List listBW2 = defpackage.ysr.bW(obj5, iS & 1048575);
                            if ((abnzVar.b & 7) != 2) {
                                throw new defpackage.abpo();
                            }
                            while (true) {
                                listBW2.add(abnzVar.o());
                                defpackage.abny abnyVar2 = abnzVar.a;
                                if (!abnyVar2.C()) {
                                    int iN2 = abnyVar2.n();
                                    if (iN2 != abnzVar.b) {
                                        abnzVar.c = iN2;
                                    }
                                }
                            }
                            obj3 = obj4;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                            break;
                        case 29:
                            abonVar = abonVarI;
                            obj4 = objP;
                            try {
                                try {
                                    abnzVar.K(defpackage.ysr.bW(obj5, iS & 1048575));
                                    obj3 = obj4;
                                    objP = obj3;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    obj2 = obj4;
                                    objP = obj2;
                                    for (i = this.k; i < this.l; i++) {
                                        objP = P(obj5, this.j[i], objP, obj5);
                                    }
                                    if (objP != null) {
                                        ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                                    }
                                    throw th;
                                }
                            } catch (defpackage.abpo unused3) {
                                abqxVar = abqxVar2;
                                obj2 = obj4;
                                objP = obj2;
                                if (objP == null) {
                                    objP = defpackage.abqx.e(obj5);
                                }
                                if (!abqxVar.a(objP, abnzVar, 0)) {
                                    while (i2 < this.l) {
                                        objP = P(obj5, this.j[i2], objP, obj5);
                                    }
                                    if (objP != null) {
                                        ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                                    }
                                }
                            }
                            abonVarI = abonVar;
                            break;
                        case 30:
                            abonVar = abonVarI;
                            try {
                                java.util.List listBW3 = defpackage.ysr.bW(obj5, iS & 1048575);
                                abnzVar.z(listBW3);
                                java.lang.Object obj6 = obj5;
                                try {
                                    objP = defpackage.abqo.e(obj6, iC, listBW3, u(iP), objP, abqxVar2);
                                    obj5 = obj6;
                                    abonVarI = abonVar;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    obj5 = obj6;
                                    obj4 = objP;
                                    obj2 = obj4;
                                    objP = obj2;
                                    while (i < this.l) {
                                        objP = P(obj5, this.j[i], objP, obj5);
                                    }
                                    if (objP != null) {
                                        ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                            }
                            break;
                        case 31:
                            abonVar = abonVarI;
                            abnzVar.F(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 32:
                            abonVar = abonVarI;
                            abnzVar.G(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 33:
                            abonVar = abonVarI;
                            abnzVar.H(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 34:
                            abonVar = abonVarI;
                            abnzVar.I(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 35:
                            abonVar = abonVarI;
                            abnzVar.y(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 36:
                            abonVar = abonVarI;
                            abnzVar.C(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 37:
                            abonVar = abonVarI;
                            abnzVar.E(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 38:
                            abonVar = abonVarI;
                            abnzVar.L(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 39:
                            abonVar = abonVarI;
                            abnzVar.D(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 40:
                            abonVar = abonVarI;
                            abnzVar.B(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 41:
                            abonVar = abonVarI;
                            abnzVar.A(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 42:
                            abonVar = abonVarI;
                            abnzVar.x(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 43:
                            abonVar = abonVarI;
                            abnzVar.K(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 44:
                            abonVar = abonVarI;
                            java.util.List listBW4 = defpackage.ysr.bW(obj5, iS & 1048575);
                            abnzVar.z(listBW4);
                            java.lang.Object obj7 = obj5;
                            try {
                                try {
                                    objP = defpackage.abqo.e(obj7, iC, listBW4, u(iP), objP, abqxVar2);
                                    obj5 = obj7;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    obj5 = obj7;
                                    obj2 = objP;
                                    objP = obj2;
                                    while (i < this.l) {
                                        objP = P(obj5, this.j[i], objP, obj5);
                                    }
                                    if (objP != null) {
                                        ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                                    }
                                    throw th;
                                }
                            } catch (defpackage.abpo unused4) {
                                obj5 = obj7;
                                obj2 = objP;
                                abqxVar = abqxVar2;
                                objP = obj2;
                                if (objP == null) {
                                    objP = defpackage.abqx.e(obj5);
                                }
                                if (!abqxVar.a(objP, abnzVar, 0)) {
                                    while (i2 < this.l) {
                                        objP = P(obj5, this.j[i2], objP, obj5);
                                    }
                                    if (objP != null) {
                                        ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                                    }
                                }
                            }
                            abonVarI = abonVar;
                            break;
                        case 45:
                            abonVar = abonVarI;
                            abnzVar.F(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 46:
                            abonVar = abonVarI;
                            abnzVar.G(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 47:
                            abonVar = abonVarI;
                            abnzVar.H(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 48:
                            abonVar = abonVarI;
                            abnzVar.I(defpackage.ysr.bW(obj5, iS & 1048575));
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 49:
                            abonVar = abonVarI;
                            defpackage.abqn abqnVarV2 = v(iP);
                            java.util.List listBW5 = defpackage.ysr.bW(obj5, iS & 1048575);
                            int i5 = abnzVar.b;
                            if ((i5 & 7) != 3) {
                                throw new defpackage.abpo();
                            }
                            while (true) {
                                listBW5.add(abnzVar.q(abqnVarV2, abolVar));
                                defpackage.abny abnyVar3 = abnzVar.a;
                                if (!abnyVar3.C() && abnzVar.c == 0) {
                                    int iN3 = abnyVar3.n();
                                    if (iN3 != i5) {
                                        abnzVar.c = iN3;
                                    }
                                }
                            }
                            obj3 = objP;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                            break;
                        case 50:
                            try {
                                java.lang.Object objW = w(iP);
                                int iS2 = s(iP) & 1048575;
                                defpackage.abrc abrcVar = defpackage.abrd.a;
                                abonVar = abonVarI;
                                long j = iS2;
                                try {
                                    java.lang.Object objI = abrcVar.i(obj5, j);
                                    if (objI == null) {
                                        objI = defpackage.abpv.a.a();
                                        abrcVar.l(obj5, j, objI);
                                    } else if (defpackage.ysr.bV(objI)) {
                                        defpackage.abpv abpvVarA = defpackage.abpv.a.a();
                                        defpackage.ysr.bU(abpvVarA, objI);
                                        abrcVar.l(obj5, j, abpvVarA);
                                        objI = abpvVarA;
                                    }
                                    defpackage.abpv abpvVar = (defpackage.abpv) objI;
                                    java.lang.Object obj8 = ((defpackage.ldx) objW).a;
                                    abnzVar.M(2);
                                    defpackage.abny abnyVar4 = abnzVar.a;
                                    int iF = abnyVar4.f(abnyVar4.o());
                                    java.lang.Object obj9 = ((defpackage.abpu) obj8).a;
                                    java.lang.Object obj10 = ((defpackage.abpu) obj8).b;
                                    java.lang.Object objP2 = obj9;
                                    java.lang.Object objP3 = obj10;
                                    while (true) {
                                        try {
                                            int iC2 = abnzVar.c();
                                            if (iC2 != i3 && !abnyVar4.C()) {
                                                if (iC2 == 1) {
                                                    objP2 = abnzVar.p((defpackage.abrf) ((defpackage.abpu) obj8).c, null, null);
                                                } else if (iC2 != 2) {
                                                    try {
                                                        if (!abnzVar.O()) {
                                                            throw new defpackage.abpp("Unable to parse map entry.");
                                                        }
                                                    } catch (defpackage.abpo e) {
                                                        if (!abnzVar.O()) {
                                                            throw new defpackage.abpp(e, null);
                                                        }
                                                    }
                                                } else {
                                                    objP3 = abnzVar.p((defpackage.abrf) ((defpackage.abpu) obj8).d, obj10.getClass(), abolVar);
                                                }
                                                i3 = Integer.MAX_VALUE;
                                            }
                                            th = th;
                                        } catch (java.lang.Throwable th5) {
                                            th = th5;
                                        }
                                        abnzVar.a.A(iF);
                                        throw th;
                                    }
                                    try {
                                        abpvVar.put(objP2, objP3);
                                        defpackage.abny abnyVar5 = abnzVar.a;
                                        if (abnyVar5.d() != 0) {
                                            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                        abnyVar5.A(iF);
                                        obj3 = objP;
                                        objP = obj3;
                                        abonVarI = abonVar;
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                    }
                                } catch (defpackage.abpo unused5) {
                                    obj2 = objP;
                                    abqxVar = abqxVar2;
                                    objP = obj2;
                                    if (objP == null) {
                                        objP = defpackage.abqx.e(obj5);
                                    }
                                    if (!abqxVar.a(objP, abnzVar, 0)) {
                                        while (i2 < this.l) {
                                            objP = P(obj5, this.j[i2], objP, obj5);
                                        }
                                        if (objP != null) {
                                            ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                                        }
                                    }
                                }
                            } catch (defpackage.abpo unused6) {
                                abonVar = abonVarI;
                            }
                            break;
                        case 51:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Double.valueOf(abnzVar.a()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 52:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Float.valueOf(abnzVar.b()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 53:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Long.valueOf(abnzVar.k()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 54:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Long.valueOf(abnzVar.n()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 55:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Integer.valueOf(abnzVar.f()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 56:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Long.valueOf(abnzVar.j()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 57:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Integer.valueOf(abnzVar.e()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 58:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Boolean.valueOf(abnzVar.N()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 59:
                            C(obj5, iS, abnzVar);
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 60:
                            defpackage.abpy abpyVar3 = (defpackage.abpy) y(obj5, iC, iP);
                            abnzVar.w(abpyVar3, v(iP), abolVar);
                            G(obj5, iC, iP, abpyVar3);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 61:
                            defpackage.abrd.a.l(obj5, iS & 1048575, abnzVar.o());
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 62:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Integer.valueOf(abnzVar.i()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 63:
                            int iD2 = abnzVar.d();
                            defpackage.abpd abpdVarU2 = u(iP);
                            if (abpdVarU2 == null || abpdVarU2.a(iD2)) {
                                defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Integer.valueOf(iD2));
                                E(obj5, iC, iP);
                                obj3 = objP;
                                abonVar = abonVarI;
                                objP = obj3;
                                abonVarI = abonVar;
                            } else {
                                objP = defpackage.abqo.k(obj5, iC, iD2, objP);
                            }
                            break;
                        case 64:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Integer.valueOf(abnzVar.g()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 65:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Long.valueOf(abnzVar.l()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 66:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Integer.valueOf(abnzVar.h()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 67:
                            defpackage.abrd.a.l(obj5, iS & 1048575, java.lang.Long.valueOf(abnzVar.m()));
                            E(obj5, iC, iP);
                            obj3 = objP;
                            abonVar = abonVarI;
                            objP = obj3;
                            abonVarI = abonVar;
                            break;
                        case 68:
                            try {
                                defpackage.abpy abpyVar4 = (defpackage.abpy) y(obj5, iC, iP);
                                abnzVar.v(abpyVar4, v(iP), abolVar);
                                G(obj5, iC, iP, abpyVar4);
                                obj3 = objP;
                                abonVar = abonVarI;
                                objP = obj3;
                            } catch (defpackage.abpo unused7) {
                                obj2 = objP;
                                abqxVar = abqxVar2;
                                abonVar = abonVarI;
                                objP = obj2;
                                if (objP == null) {
                                    objP = defpackage.abqx.e(obj5);
                                }
                                if (!abqxVar.a(objP, abnzVar, 0)) {
                                    while (i2 < this.l) {
                                        objP = P(obj5, this.j[i2], objP, obj5);
                                    }
                                    if (objP != null) {
                                        ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                                    }
                                }
                            }
                            abonVarI = abonVar;
                            break;
                        default:
                            obj2 = objP;
                            abqxVar = abqxVar2;
                            abonVar = abonVarI;
                            if (obj2 == null) {
                                try {
                                    objP = defpackage.abqx.e(obj5);
                                } catch (defpackage.abpo unused8) {
                                    objP = obj2;
                                    if (objP == null) {
                                        objP = defpackage.abqx.e(obj5);
                                    }
                                    if (!abqxVar.a(objP, abnzVar, 0)) {
                                        while (i2 < this.l) {
                                            objP = P(obj5, this.j[i2], objP, obj5);
                                        }
                                        if (objP != null) {
                                            ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                                        }
                                    }
                                    abonVarI = abonVar;
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    objP = obj2;
                                    while (i < this.l) {
                                        objP = P(obj5, this.j[i], objP, obj5);
                                    }
                                    if (objP != null) {
                                        ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                                    }
                                    throw th;
                                }
                            } else {
                                objP = obj2;
                            }
                            try {
                                if (!abqxVar.a(objP, abnzVar, 0)) {
                                    for (int i6 = this.k; i6 < this.l; i6++) {
                                        objP = P(obj5, this.j[i6], objP, obj5);
                                    }
                                }
                            } catch (defpackage.abpo unused9) {
                                if (objP == null) {
                                    objP = defpackage.abqx.e(obj5);
                                }
                                if (!abqxVar.a(objP, abnzVar, 0)) {
                                    while (i2 < this.l) {
                                        objP = P(obj5, this.j[i2], objP, obj5);
                                    }
                                    if (objP != null) {
                                        ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                                    }
                                }
                            }
                            abonVarI = abonVar;
                            break;
                    }
                } else if (iC == Integer.MAX_VALUE) {
                    for (int i7 = this.k; i7 < this.l; i7++) {
                        objP = P(obj5, this.j[i7], objP, obj5);
                    }
                } else {
                    defpackage.aboj abojVarB = !this.h ? null : abolVar.b(this.g, iC);
                    if (abojVarB != null) {
                        if (abonVarI == null) {
                            abonVarI = ((defpackage.abou) obj5).i();
                        }
                        int iA = abojVarB.a();
                        defpackage.abow abowVar = abojVarB.d;
                        if (abojVarB.b() != defpackage.abrf.ENUM) {
                            switch (abojVarB.b().ordinal()) {
                                case defpackage.abnt.b /* 0 */:
                                    objValueOf = java.lang.Double.valueOf(abnzVar.a());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr2 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case 1:
                                    objValueOf = java.lang.Float.valueOf(abnzVar.b());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr3 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr4 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                    objValueOf = java.lang.Long.valueOf(abnzVar.k());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr5 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr6 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                    objValueOf = java.lang.Long.valueOf(abnzVar.n());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr7 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr8 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                    objValueOf = java.lang.Integer.valueOf(abnzVar.f());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr9 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr10 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                    objValueOf = java.lang.Long.valueOf(abnzVar.j());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr11 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr12 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                    objValueOf = java.lang.Integer.valueOf(abnzVar.e());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr13 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr14 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                    objValueOf = java.lang.Boolean.valueOf(abnzVar.N());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr15 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr16 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                    objValueOf = abnzVar.t();
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr17 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr18 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case 9:
                                    if (!abojVarB.f()) {
                                        java.lang.Object objJ2 = abonVarI.j(abowVar);
                                        if (objJ2 instanceof defpackage.abox) {
                                            defpackage.abox aboxVar = (defpackage.abox) objJ2;
                                            defpackage.abqn abqnVarA = defpackage.abqg.a.a(aboxVar);
                                            if (!aboxVar.T()) {
                                                java.lang.Object objE = abqnVarA.e();
                                                abqnVarA.h(objE, objJ2);
                                                abonVarI.l(abowVar, objE);
                                                objJ2 = objE;
                                            }
                                            abnzVar.v(objJ2, abqnVarA, abolVar);
                                            break;
                                        }
                                    }
                                    java.lang.Class<?> cls = abojVarB.c.getClass();
                                    abnzVar.M(3);
                                    objValueOf = abnzVar.q(defpackage.abqg.a.b(cls), abolVar);
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr19 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr110 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case 10:
                                    if (!abojVarB.f()) {
                                        java.lang.Object objJ3 = abonVarI.j(abowVar);
                                        if (objJ3 instanceof defpackage.abox) {
                                            defpackage.abox aboxVar2 = (defpackage.abox) objJ3;
                                            defpackage.abqn abqnVarA2 = defpackage.abqg.a.a(aboxVar2);
                                            if (!aboxVar2.T()) {
                                                java.lang.Object objE2 = abqnVarA2.e();
                                                abqnVarA2.h(objE2, objJ3);
                                                abonVarI.l(abowVar, objE2);
                                                objJ3 = objE2;
                                            }
                                            abnzVar.w(objJ3, abqnVarA2, abolVar);
                                            break;
                                        }
                                    }
                                    objValueOf = abnzVar.s(abojVarB.c.getClass(), abolVar);
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr111 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr112 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case 11:
                                    objValueOf = abnzVar.o();
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr113 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr114 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case 12:
                                    objValueOf = java.lang.Integer.valueOf(abnzVar.i());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr115 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr116 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case 13:
                                    throw new java.lang.IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    objValueOf = java.lang.Integer.valueOf(abnzVar.g());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr117 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr118 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case 15:
                                    objValueOf = java.lang.Long.valueOf(abnzVar.l());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr119 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr1110 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case 16:
                                    objValueOf = java.lang.Integer.valueOf(abnzVar.h());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr1111 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr1112 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                case 17:
                                    objValueOf = java.lang.Long.valueOf(abnzVar.m());
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr1113 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr1114 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                                default:
                                    objValueOf = null;
                                    if (abojVarB.f()) {
                                        abonVarI.k(abowVar, objValueOf);
                                    } else {
                                        iOrdinal = abojVarB.b().ordinal();
                                        if (iOrdinal != 9) {
                                            byte[] bArr1115 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        } else {
                                            byte[] bArr1116 = defpackage.abpk.a;
                                            objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                        }
                                        abonVarI.l(abowVar, objValueOf);
                                    }
                                    break;
                            }
                        } else {
                            int iF2 = abnzVar.f();
                            if (abowVar.a.a(iF2) == null) {
                                objP = defpackage.abqo.k(obj5, iA, iF2, objP);
                            } else {
                                objValueOf = java.lang.Integer.valueOf(iF2);
                                if (abojVarB.f()) {
                                    abonVarI.k(abowVar, objValueOf);
                                } else {
                                    iOrdinal = abojVarB.b().ordinal();
                                    if ((iOrdinal != 9 || iOrdinal == 10) && (objJ = abonVarI.j(abowVar)) != null) {
                                        byte[] bArr1117 = defpackage.abpk.a;
                                        objValueOf = ((defpackage.abpy) objJ).K().g((defpackage.abpy) objValueOf).r();
                                    }
                                    abonVarI.l(abowVar, objValueOf);
                                }
                            }
                        }
                    } else {
                        if (objP == null) {
                            objP = defpackage.abqx.e(obj5);
                        }
                        try {
                            if (!abqxVar2.a(objP, abnzVar, 0)) {
                                for (int i8 = this.k; i8 < this.l; i8++) {
                                    objP = P(obj5, this.j[i8], objP, obj5);
                                }
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            while (i < this.l) {
                                objP = P(obj5, this.j[i], objP, obj5);
                            }
                            if (objP != null) {
                                ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
                            }
                            throw th;
                        }
                    }
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
        }
        if (objP != null) {
            ((defpackage.abox) obj5).al = (defpackage.abqy) objP;
        }
    }

    @Override // defpackage.abqn
    public final void j(java.lang.Object obj, byte[] bArr, int i, int i2, defpackage.abnj abnjVar) throws java.io.IOException {
        c(obj, bArr, i, i2, 0, abnjVar);
    }

    @Override // defpackage.abqn
    public final boolean k(java.lang.Object obj, java.lang.Object obj2) {
        boolean zB;
        for (int i = 0; i < this.c.length; i += 3) {
            int iS = s(i);
            int i2 = (iS >>> 20) & 255;
            if (i2 <= 50 || i2 >= 69) {
                long j = iS & 1048575;
                switch (i2) {
                    case defpackage.abnt.b /* 0 */:
                        if (!H(obj, obj2, i) || java.lang.Double.doubleToLongBits(defpackage.abrd.b(obj, j)) != java.lang.Double.doubleToLongBits(defpackage.abrd.b(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!H(obj, obj2, i) || java.lang.Float.floatToIntBits(defpackage.abrd.c(obj, j)) != java.lang.Float.floatToIntBits(defpackage.abrd.c(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar = defpackage.abrd.a;
                            if (abrcVar.h(obj, j) == abrcVar.h(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar2 = defpackage.abrd.a;
                            if (abrcVar2.h(obj, j) == abrcVar2.h(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar3 = defpackage.abrd.a;
                            if (abrcVar3.g(obj, j) == abrcVar3.g(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar4 = defpackage.abrd.a;
                            if (abrcVar4.h(obj, j) == abrcVar4.h(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar5 = defpackage.abrd.a;
                            if (abrcVar5.g(obj, j) == abrcVar5.g(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar6 = defpackage.abrd.a;
                            if (abrcVar6.f(obj, j) == abrcVar6.f(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar7 = defpackage.abrd.a;
                            java.lang.Object objI = abrcVar7.i(obj, j);
                            java.lang.Object objI2 = abrcVar7.i(obj2, j);
                            defpackage.abqx abqxVar = defpackage.abqo.a;
                            if (defpackage.a.B(objI, objI2)) {
                                continue;
                            }
                        }
                        return false;
                    case 9:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar8 = defpackage.abrd.a;
                            java.lang.Object objI3 = abrcVar8.i(obj, j);
                            java.lang.Object objI4 = abrcVar8.i(obj2, j);
                            defpackage.abqx abqxVar2 = defpackage.abqo.a;
                            if (defpackage.a.B(objI3, objI4)) {
                                continue;
                            }
                        }
                        return false;
                    case 10:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar9 = defpackage.abrd.a;
                            java.lang.Object objI5 = abrcVar9.i(obj, j);
                            java.lang.Object objI6 = abrcVar9.i(obj2, j);
                            defpackage.abqx abqxVar3 = defpackage.abqo.a;
                            if (defpackage.a.B(objI5, objI6)) {
                                continue;
                            }
                        }
                        return false;
                    case 11:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar10 = defpackage.abrd.a;
                            if (abrcVar10.g(obj, j) == abrcVar10.g(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 12:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar11 = defpackage.abrd.a;
                            if (abrcVar11.g(obj, j) == abrcVar11.g(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 13:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar12 = defpackage.abrd.a;
                            if (abrcVar12.g(obj, j) == abrcVar12.g(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 14:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar13 = defpackage.abrd.a;
                            if (abrcVar13.h(obj, j) == abrcVar13.h(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 15:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar14 = defpackage.abrd.a;
                            if (abrcVar14.g(obj, j) == abrcVar14.g(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 16:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar15 = defpackage.abrd.a;
                            if (abrcVar15.h(obj, j) == abrcVar15.h(obj2, j)) {
                                continue;
                            }
                        }
                        return false;
                    case 17:
                        if (H(obj, obj2, i)) {
                            defpackage.abrc abrcVar16 = defpackage.abrd.a;
                            java.lang.Object objI7 = abrcVar16.i(obj, j);
                            java.lang.Object objI8 = abrcVar16.i(obj2, j);
                            defpackage.abqx abqxVar4 = defpackage.abqo.a;
                            if (defpackage.a.B(objI7, objI8)) {
                                continue;
                            }
                        }
                        return false;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        defpackage.abrc abrcVar17 = defpackage.abrd.a;
                        java.lang.Object objI9 = abrcVar17.i(obj, j);
                        java.lang.Object objI10 = abrcVar17.i(obj2, j);
                        defpackage.abqx abqxVar5 = defpackage.abqo.a;
                        zB = defpackage.a.B(objI9, objI10);
                        break;
                    case 50:
                        defpackage.abrc abrcVar18 = defpackage.abrd.a;
                        java.lang.Object objI11 = abrcVar18.i(obj, j);
                        java.lang.Object objI12 = abrcVar18.i(obj2, j);
                        defpackage.abqx abqxVar6 = defpackage.abqo.a;
                        zB = defpackage.a.B(objI11, objI12);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        if (L(obj, obj2, i)) {
                            defpackage.abrc abrcVar19 = defpackage.abrd.a;
                            java.lang.Object objI13 = abrcVar19.i(obj, j);
                            java.lang.Object objI14 = abrcVar19.i(obj2, j);
                            defpackage.abqx abqxVar7 = defpackage.abqo.a;
                            if (defpackage.a.B(objI13, objI14)) {
                                continue;
                            }
                        }
                        return false;
                    default:
                        continue;
                }
                if (!zB) {
                    return false;
                }
            }
        }
        int i3 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i3 >= iArr.length) {
                if (!((defpackage.abox) obj).al.equals(((defpackage.abox) obj2).al)) {
                    return false;
                }
                if (this.h) {
                    return ((defpackage.abou) obj).w.equals(((defpackage.abou) obj2).w);
                }
                return true;
            }
            int i4 = iArr[i3];
            if (!L(obj, obj2, i4)) {
                return false;
            }
            if (!M(obj, 0, i4)) {
                int iS2 = s(i4) & 1048575;
                defpackage.abrc abrcVar20 = defpackage.abrd.a;
                long j2 = iS2;
                java.lang.Object objI15 = abrcVar20.i(obj, j2);
                java.lang.Object objI16 = abrcVar20.i(obj2, j2);
                defpackage.abqx abqxVar8 = defpackage.abqo.a;
                if (!defpackage.a.B(objI15, objI16)) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4 A[LOOP:2: B:53:0x00e3->B:58:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0111 A[SYNTHETIC] */
    @Override // defpackage.abqn
    public final boolean l(java.lang.Object obj) {
        int i;
        int i2;
        java.util.List list;
        defpackage.abqn abqnVarV;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.k) {
            int i7 = this.j[i4];
            int iS = this.s(i7);
            int i8 = this.c[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i6) {
                if (i9 != 1048575) {
                    i5 = b.getInt(obj, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i6;
                i2 = i5;
            }
            defpackage.abqb<T> abqbVar = this;
            java.lang.Object obj2 = obj;
            if ((268435456 & iS) != 0 && !abqbVar.J(obj2, i7, i, i2, i10)) {
                return false;
            }
            int i11 = (iS >>> 20) & 255;
            if (i11 == 9 || i11 == 17) {
                if (abqbVar.J(obj2, i7, i, i2, i10)) {
                    if (!abqbVar.v(i7).l(defpackage.abrd.a.i(obj2, iS & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (i11 == 27) {
                list = (java.util.List) defpackage.abrd.a.i(obj2, iS & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    abqnVarV = abqbVar.v(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!abqnVarV.l(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i11 == 60 || i11 == 68) {
                if (abqbVar.M(obj2, abqbVar.n(i7), i7)) {
                    if (!abqbVar.v(i7).l(defpackage.abrd.a.i(obj2, iS & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (i11 == 49) {
                list = (java.util.List) defpackage.abrd.a.i(obj2, iS & 1048575);
                if (list.isEmpty()) {
                    abqnVarV = abqbVar.v(i7);
                    while (i3 < list.size()) {
                        if (!abqnVarV.l(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i11 != 50) {
                continue;
            } else {
                defpackage.abpv abpvVar = (defpackage.abpv) defpackage.abrd.a.i(obj2, iS & 1048575);
                if (!abpvVar.isEmpty() && ((defpackage.abrf) ((defpackage.abpu) ((defpackage.ldx) abqbVar.w(i7)).a).d).s == defpackage.abrg.i) {
                    defpackage.abqn abqnVarB = null;
                    for (java.lang.Object obj3 : abpvVar.values()) {
                        if (abqnVarB == null) {
                            abqnVarB = defpackage.abqg.a.b(((defpackage.abox) obj3).getClass());
                        }
                        if (!abqnVarB.l(obj3)) {
                            return false;
                        }
                    }
                }
            }
            i4++;
            this = abqbVar;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        return !this.h || ((defpackage.abou) obj).w.h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // defpackage.abqn
    public final void m(java.lang.Object obj, defpackage.kwv kwvVar) throws java.io.IOException {
        java.util.Map.Entry entry;
        java.util.Iterator it;
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        defpackage.abqb<T> abqbVar = this;
        if (abqbVar.h) {
            defpackage.abon abonVar = ((defpackage.abou) obj).w;
            if (abonVar.g()) {
                entry = null;
                it = null;
            } else {
                java.util.Iterator itD = abonVar.d();
                entry = (java.util.Map.Entry) itD.next();
                it = itD;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = abqbVar.c;
        sun.misc.Unsafe unsafe = b;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < iArr.length) {
            int iS = abqbVar.s(i6);
            int iN = abqbVar.n(i6);
            int i8 = (iS >>> 20) & 255;
            if (i8 <= 17) {
                int i9 = iArr[i6 + 2];
                z = true;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i7;
                i3 = 1 << (i9 >>> 20);
            } else {
                z = true;
                i = i5;
                i2 = i7;
                i3 = 0;
            }
            while (entry != null && ((defpackage.abow) entry.getKey()).b <= iN) {
                defpackage.ysr.cJ(kwvVar, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            long j = iS & i4;
            switch (i8) {
                case defpackage.abnt.b /* 0 */:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.g(iN, defpackage.abrd.b(obj, j));
                    }
                    break;
                case 1:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.k(iN, defpackage.abrd.c(obj, j));
                    }
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.n(iN, unsafe.getLong(obj, j));
                    }
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.w(iN, unsafe.getLong(obj, j));
                    }
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.m(iN, unsafe.getInt(obj, j));
                    }
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.j(iN, unsafe.getLong(obj, j));
                    }
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.i(iN, unsafe.getInt(obj, j));
                    }
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.e(iN, defpackage.abrd.a.f(obj, j));
                    }
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        Q(iN, unsafe.getObject(obj, j), kwvVar);
                    }
                    break;
                case 9:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.o(iN, unsafe.getObject(obj, j), abqbVar.v(i6));
                    }
                    break;
                case 10:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.f(iN, (defpackage.abnv) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.v(iN, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.h(iN, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.q(iN, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.r(iN, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.s(iN, unsafe.getInt(obj, j));
                    }
                    break;
                case 16:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.t(iN, unsafe.getLong(obj, j));
                    }
                    break;
                case 17:
                    if (abqbVar.J(obj, i6, i, i2, i3)) {
                        kwvVar.l(iN, unsafe.getObject(obj, j), abqbVar.v(i6));
                    }
                    break;
                case 18:
                    i = i;
                    i2 = i2;
                    defpackage.abqo.n(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 19:
                    i = i;
                    i2 = i2;
                    defpackage.abqo.o(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 20:
                    i = i;
                    i2 = i2;
                    defpackage.abqo.y(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 21:
                    i = i;
                    i2 = i2;
                    defpackage.abqo.y(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 22:
                    i = i;
                    i2 = i2;
                    defpackage.abqo.v(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 23:
                    i = i;
                    i2 = i2;
                    defpackage.abqo.x(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 24:
                    i = i;
                    i2 = i2;
                    defpackage.abqo.w(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 25:
                    i = i;
                    i2 = i2;
                    defpackage.abqo.l(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 26:
                    defpackage.abqo.t(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar);
                    i = i;
                    i2 = i2;
                    break;
                case 27:
                    defpackage.abqo.q(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, abqbVar.v(i6));
                    i = i;
                    i2 = i2;
                    break;
                case 28:
                    defpackage.abqo.m(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar);
                    i = i;
                    i2 = i2;
                    break;
                case 29:
                    z2 = false;
                    defpackage.abqo.u(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 30:
                    z2 = false;
                    defpackage.abqo.v(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 31:
                    z2 = false;
                    defpackage.abqo.w(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 32:
                    z2 = false;
                    defpackage.abqo.x(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 33:
                    z2 = false;
                    defpackage.abqo.r(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 34:
                    z2 = false;
                    defpackage.abqo.s(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, false);
                    i = i;
                    i2 = i2;
                    break;
                case 35:
                    defpackage.abqo.n(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 36:
                    defpackage.abqo.o(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 37:
                    defpackage.abqo.y(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 38:
                    defpackage.abqo.y(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 39:
                    defpackage.abqo.v(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 40:
                    defpackage.abqo.x(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 41:
                    defpackage.abqo.w(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 42:
                    defpackage.abqo.l(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 43:
                    defpackage.abqo.u(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 44:
                    defpackage.abqo.v(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 45:
                    defpackage.abqo.w(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 46:
                    defpackage.abqo.x(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 47:
                    defpackage.abqo.r(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 48:
                    defpackage.abqo.s(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, z);
                    i = i;
                    i2 = i2;
                    break;
                case 49:
                    defpackage.abqo.p(abqbVar.n(i6), (java.util.List) unsafe.getObject(obj, j), kwvVar, abqbVar.v(i6));
                    i = i;
                    i2 = i2;
                    break;
                case 50:
                    java.lang.Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        java.lang.Object obj2 = ((defpackage.ldx) abqbVar.w(i6)).a;
                        java.lang.Object obj3 = kwvVar.a;
                        java.util.Iterator it2 = ((defpackage.abpv) object).entrySet().iterator();
                        while (it2.hasNext()) {
                            java.util.Map.Entry entry2 = (java.util.Map.Entry) it2.next();
                            defpackage.abof abofVar = (defpackage.abof) obj3;
                            abofVar.t(iN, 2);
                            java.util.Iterator it3 = it2;
                            defpackage.abpu abpuVar = (defpackage.abpu) obj2;
                            abofVar.v(defpackage.ldx.l(abpuVar, entry2.getKey(), entry2.getValue()));
                            defpackage.ldx.m(abofVar, abpuVar, entry2.getKey(), entry2.getValue());
                            it2 = it3;
                            i = i;
                            i2 = i2;
                        }
                    }
                    break;
                case 51:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.g(iN, ((java.lang.Double) defpackage.abrd.a.i(obj, j)).doubleValue());
                    }
                    break;
                case 52:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.k(iN, ((java.lang.Float) defpackage.abrd.a.i(obj, j)).floatValue());
                    }
                    break;
                case 53:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.n(iN, ((java.lang.Long) defpackage.abrd.a.i(obj, j)).longValue());
                    }
                    break;
                case 54:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.w(iN, ((java.lang.Long) defpackage.abrd.a.i(obj, j)).longValue());
                    }
                    break;
                case 55:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.m(iN, o(obj, j));
                    }
                    break;
                case 56:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.j(iN, ((java.lang.Long) defpackage.abrd.a.i(obj, j)).longValue());
                    }
                    break;
                case 57:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.i(iN, o(obj, j));
                    }
                    break;
                case 58:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.e(iN, ((java.lang.Boolean) defpackage.abrd.a.i(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (abqbVar.M(obj, iN, i6)) {
                        Q(iN, unsafe.getObject(obj, j), kwvVar);
                    }
                    break;
                case 60:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.o(iN, unsafe.getObject(obj, j), abqbVar.v(i6));
                    }
                    break;
                case 61:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.f(iN, (defpackage.abnv) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.v(iN, o(obj, j));
                    }
                    break;
                case 63:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.h(iN, o(obj, j));
                    }
                    break;
                case 64:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.q(iN, o(obj, j));
                    }
                    break;
                case 65:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.r(iN, ((java.lang.Long) defpackage.abrd.a.i(obj, j)).longValue());
                    }
                    break;
                case 66:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.s(iN, o(obj, j));
                    }
                    break;
                case 67:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.t(iN, ((java.lang.Long) defpackage.abrd.a.i(obj, j)).longValue());
                    }
                    break;
                case 68:
                    if (abqbVar.M(obj, iN, i6)) {
                        kwvVar.l(iN, unsafe.getObject(obj, j), abqbVar.v(i6));
                    }
                    break;
                default:
                    break;
            }
            i6 += 3;
            i4 = 1048575;
            abqbVar = this;
            i7 = i2;
            i5 = i;
            entry = entry;
        }
        while (entry != null) {
            defpackage.ysr.cJ(kwvVar, entry);
            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
        }
        ((defpackage.abox) obj).al.f(kwvVar);
    }
}
