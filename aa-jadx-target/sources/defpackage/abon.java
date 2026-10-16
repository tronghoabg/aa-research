package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abon {
    public static final defpackage.abon a = new defpackage.abon(null);
    final defpackage.abqs b = new defpackage.abqs();
    boolean c;
    boolean d;

    private abon(byte[] bArr) {
        e();
        e();
    }

    public static int a(defpackage.abrf abrfVar, int i, java.lang.Object obj) {
        int iNumberOfLeadingZeros;
        int iBQ;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i2;
        int iNumberOfLeadingZeros4 = (352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        if (abrfVar == defpackage.abrf.GROUP) {
            iNumberOfLeadingZeros4 += iNumberOfLeadingZeros4;
        }
        defpackage.abrg abrgVar = defpackage.abrg.a;
        int iF = 4;
        switch (abrfVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                ((java.lang.Double) obj).doubleValue();
                iF = 8;
                return iNumberOfLeadingZeros4 + iF;
            case 1:
                ((java.lang.Float) obj).floatValue();
                return iNumberOfLeadingZeros4 + iF;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(((java.lang.Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(((java.lang.Long) obj).longValue());
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                iF = defpackage.abof.F(((java.lang.Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iF;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((java.lang.Long) obj).longValue();
                iF = 8;
                return iNumberOfLeadingZeros4 + iF;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((java.lang.Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iF;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((java.lang.Boolean) obj).booleanValue();
                iF = 1;
                return iNumberOfLeadingZeros4 + iF;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof defpackage.abnv) {
                    iF = defpackage.abof.E((defpackage.abnv) obj);
                } else {
                    iBQ = defpackage.ysr.bQ((java.lang.String) obj);
                    iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iBQ);
                    iF = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iBQ;
                }
                return iNumberOfLeadingZeros4 + iF;
            case 9:
                iF = ((defpackage.abpy) obj).m();
                return iNumberOfLeadingZeros4 + iF;
            case 10:
                iF = obj instanceof defpackage.abpn ? ((defpackage.abpn) obj).a() : defpackage.abof.G((defpackage.abpy) obj);
                return iNumberOfLeadingZeros4 + iF;
            case 11:
                if (obj instanceof defpackage.abnv) {
                    iF = defpackage.abof.E((defpackage.abnv) obj);
                } else {
                    iBQ = ((byte[]) obj).length;
                    iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(iBQ);
                    iF = ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iBQ;
                }
                return iNumberOfLeadingZeros4 + iF;
            case 12:
                iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros(((java.lang.Integer) obj).intValue());
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case 13:
                iF = obj instanceof defpackage.abpb ? defpackage.abof.F(((defpackage.abpb) obj).a()) : defpackage.abof.F(((java.lang.Integer) obj).intValue());
                return iNumberOfLeadingZeros4 + iF;
            case 14:
                ((java.lang.Integer) obj).intValue();
                return iNumberOfLeadingZeros4 + iF;
            case 15:
                ((java.lang.Long) obj).longValue();
                iF = 8;
                return iNumberOfLeadingZeros4 + iF;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                iNumberOfLeadingZeros3 = java.lang.Integer.numberOfLeadingZeros((iIntValue + iIntValue) ^ (iIntValue >> 31));
                i2 = 352 - (iNumberOfLeadingZeros3 * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            case 17:
                long jLongValue = ((java.lang.Long) obj).longValue();
                iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros((jLongValue + jLongValue) ^ (jLongValue >> 63));
                i2 = 640 - (iNumberOfLeadingZeros * 9);
                iF = i2 >>> 6;
                return iNumberOfLeadingZeros4 + iF;
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static java.lang.Object c(java.lang.Object obj) {
        if (obj instanceof defpackage.abqd) {
            return ((defpackage.abqd) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static void f(defpackage.abof abofVar, defpackage.abrf abrfVar, int i, java.lang.Object obj) throws java.io.IOException {
        if (abrfVar == defpackage.abrf.GROUP) {
            abofVar.t(i, 3);
            ((defpackage.abpy) obj).R(abofVar);
            abofVar.t(i, 4);
            return;
        }
        abofVar.t(i, abrfVar.t);
        defpackage.abrg abrgVar = defpackage.abrg.a;
        switch (abrfVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                abofVar.K(((java.lang.Double) obj).doubleValue());
                break;
            case 1:
                abofVar.M(((java.lang.Float) obj).floatValue());
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                abofVar.x(((java.lang.Long) obj).longValue());
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                abofVar.x(((java.lang.Long) obj).longValue());
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                abofVar.n(((java.lang.Integer) obj).intValue());
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                abofVar.l(((java.lang.Long) obj).longValue());
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                abofVar.j(((java.lang.Integer) obj).intValue());
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                abofVar.d(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof defpackage.abnv)) {
                    abofVar.s((java.lang.String) obj);
                } else {
                    abofVar.h((defpackage.abnv) obj);
                }
                break;
            case 9:
                ((defpackage.abpy) obj).R(abofVar);
                break;
            case 10:
                abofVar.o((defpackage.abpy) obj);
                break;
            case 11:
                if (!(obj instanceof defpackage.abnv)) {
                    byte[] bArr = (byte[]) obj;
                    abofVar.y(bArr, bArr.length);
                } else {
                    abofVar.h((defpackage.abnv) obj);
                }
                break;
            case 12:
                abofVar.v(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof defpackage.abpb)) {
                    abofVar.n(((java.lang.Integer) obj).intValue());
                } else {
                    abofVar.n(((defpackage.abpb) obj).a());
                }
                break;
            case 14:
                abofVar.j(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                abofVar.l(((java.lang.Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                abofVar.v((iIntValue + iIntValue) ^ (iIntValue >> 31));
                break;
            case 17:
                long jLongValue = ((java.lang.Long) obj).longValue();
                abofVar.x((jLongValue + jLongValue) ^ (jLongValue >> 63));
                break;
        }
    }

    public static int i(defpackage.abow abowVar, java.lang.Object obj) {
        defpackage.abrf abrfVar = abowVar.c;
        int i = abowVar.b;
        if (!abowVar.d) {
            return a(abrfVar, i, obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = list.size();
        int iA = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA += a(abrfVar, i, list.get(i2));
        }
        return iA;
    }

    private static boolean n(java.lang.Object obj) {
        if (obj instanceof defpackage.abpz) {
            return ((defpackage.abpz) obj).v();
        }
        if (obj instanceof defpackage.abpn) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void o(defpackage.abow abowVar, java.lang.Object obj) {
        boolean z;
        obj.getClass();
        defpackage.abrf abrfVar = defpackage.abrf.DOUBLE;
        defpackage.abrg abrgVar = defpackage.abrg.a;
        defpackage.abrg abrgVar2 = abowVar.c.s;
        switch (abrgVar2.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(abowVar.b), abrgVar2, obj.getClass().getName()));
            case 1:
                z = obj instanceof java.lang.Long;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(abowVar.b), abrgVar2, obj.getClass().getName()));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                z = obj instanceof java.lang.Float;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(abowVar.b), abrgVar2, obj.getClass().getName()));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                z = obj instanceof java.lang.Double;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(abowVar.b), abrgVar2, obj.getClass().getName()));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(abowVar.b), abrgVar2, obj.getClass().getName()));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                z = obj instanceof java.lang.String;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(abowVar.b), abrgVar2, obj.getClass().getName()));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                if ((obj instanceof defpackage.abnv) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(abowVar.b), abrgVar2, obj.getClass().getName()));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                if ((obj instanceof java.lang.Integer) || (obj instanceof defpackage.abpb)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(abowVar.b), abrgVar2, obj.getClass().getName()));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                if ((obj instanceof defpackage.abpy) || (obj instanceof defpackage.abpn)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(abowVar.b), abrgVar2, obj.getClass().getName()));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(abowVar.b), abrgVar2, obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.abon clone() {
        defpackage.abon abonVar = new defpackage.abon();
        defpackage.abqs abqsVar = this.b;
        int size = abqsVar.size();
        for (int i = 0; i < size; i++) {
            defpackage.abqp abqpVar = (defpackage.abqp) abqsVar.a(i);
            abonVar.l(abqpVar.c, abqpVar.a);
        }
        abonVar.d = this.d;
        return abonVar;
    }

    public final java.util.Iterator d() {
        if (g()) {
            return java.util.Collections.emptyIterator();
        }
        boolean z = this.d;
        defpackage.abqs abqsVar = this.b;
        return z ? new abpm(abqsVar.entrySet().iterator()) : abqsVar.entrySet().iterator();
    }

    public final void e() {
        if (this.c) {
            return;
        }
        defpackage.abqs abqsVar = this.b;
        int size = abqsVar.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = ((defpackage.abqp) abqsVar.a(i)).a;
            if (obj instanceof defpackage.abox) {
                ((defpackage.abox) obj).N();
            }
        }
        if (!abqsVar.c) {
            abqsVar.c();
            if (abqsVar.a != null) {
                for (int i2 = 0; i2 < abqsVar.b; i2++) {
                    defpackage.abqp abqpVar = (defpackage.abqp) abqsVar.a[i2];
                    if (abqpVar.c.d) {
                        abqpVar.setValue(j$.util.DesugarCollections.unmodifiableList((java.util.List) abqpVar.a));
                    }
                }
            }
            abqsVar.c = true;
        }
        this.c = true;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.abon)) {
            return false;
        }
        defpackage.abqs abqsVar = this.b;
        defpackage.abqs abqsVar2 = ((defpackage.abon) obj).b;
        if (abqsVar.size() != abqsVar2.size() || !abqsVar.keySet().equals(abqsVar2.keySet())) {
            return false;
        }
        for (java.util.Map.Entry entry : abqsVar.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            java.lang.Object obj2 = abqsVar2.get(key);
            if (value == obj2) {
                zEquals = true;
            } else if (value == null || obj2 == null) {
                zEquals = false;
            } else if (value instanceof defpackage.abpn) {
                zEquals = value.equals(obj2);
            } else {
                zEquals = obj2 instanceof defpackage.abpn ? obj2.equals(value) : value.equals(obj2);
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    final boolean g() {
        return this.b.isEmpty();
    }

    public final boolean h() {
        defpackage.abqs abqsVar = this.b;
        int size = abqsVar.size();
        for (int i = 0; i < size; i++) {
            defpackage.abqp abqpVar = (defpackage.abqp) abqsVar.a(i);
            defpackage.abow abowVar = abqpVar.c;
            if (abowVar.a() == defpackage.abrg.i) {
                if (abowVar.d) {
                    java.util.List list = (java.util.List) abqpVar.a;
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (!n(list.get(i2))) {
                            return false;
                        }
                    }
                } else if (!n(abqpVar.a)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.Object j(defpackage.abow abowVar) {
        java.lang.Object obj = this.b.get(abowVar);
        return obj instanceof defpackage.abpn ? ((defpackage.abpn) obj).b() : obj;
    }

    public final void k(defpackage.abow abowVar, java.lang.Object obj) {
        java.util.List arrayList;
        if (!abowVar.d) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        o(abowVar, obj);
        java.lang.Object objJ = j(abowVar);
        if (objJ == null) {
            arrayList = new java.util.ArrayList();
            this.b.d(abowVar, arrayList);
        } else {
            arrayList = (java.util.List) objJ;
        }
        arrayList.add(obj);
    }

    public final void l(defpackage.abow abowVar, java.lang.Object obj) {
        if (!abowVar.d) {
            o(abowVar, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                java.lang.Object obj2 = list.get(i);
                o(abowVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof defpackage.abpn) {
            this.d = true;
        }
        this.b.d(abowVar, obj);
    }

    public final boolean m(defpackage.abow abowVar) {
        if (abowVar.d) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.b.get(abowVar) != null;
    }

    private abon() {
    }
}
