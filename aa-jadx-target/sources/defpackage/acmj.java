package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acmj {
    private acmj() {
    }

    public static /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return (defpackage.absk) defpackage.abox.x(defpackage.absk.a, (byte[]) obj);
    }

    public static /* synthetic */ java.lang.Object b(java.lang.Object obj) throws defpackage.abpp {
        byte[] bArr = (byte[]) obj;
        defpackage.abox aboxVarD = defpackage.abox.D(defpackage.absv.a, bArr, 0, bArr.length, defpackage.abol.a);
        defpackage.abox.U(aboxVarD);
        return (defpackage.absv) aboxVarD;
    }

    public static /* synthetic */ int c(int i) {
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return 1;
            case 1:
                return 2;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int d(int i) {
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return 1;
            case 1:
                return 2;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public static /* synthetic */ double e(double d) {
        double dPow = java.lang.Math.pow(java.lang.Math.abs(d), 0.42d);
        return ((((double) defpackage.a.q(d)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    public static /* synthetic */ double f(double d) {
        double dAbs = java.lang.Math.abs(d);
        return ((double) defpackage.a.q(d)) * java.lang.Math.pow(java.lang.Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d);
    }

    public static /* synthetic */ boolean g(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static /* synthetic */ void h(boolean z, java.lang.String str, java.lang.Object[] objArr) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
    }

    public static /* synthetic */ abjl i(abdv abdvVar) {
        defpackage.aboj abojVar = abja.a;
        abdvVar.j(abojVar);
        java.lang.Object objJ = abdvVar.w.j(abojVar.d);
        return (abjl) (objJ == null ? abojVar.b : abojVar.c(objJ));
    }

    public static /* synthetic */ defpackage.afbk j(tjt tjtVar, defpackage.bve bveVar, int i) {
        tjtVar.getClass();
        if (!bveVar.I((i & 17) != 16, i & 1)) {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }

    public static /* synthetic */ int[] k() {
        return new int[]{1, 2, 3};
    }

    public static /* synthetic */ defpackage.zao l(java.util.UUID uuid) {
        defpackage.abor aborVarN = defpackage.zao.a.n();
        long mostSignificantBits = uuid.getMostSignificantBits();
        aborVarN.t();
        defpackage.zao zaoVar = (defpackage.zao) aborVarN.b;
        zaoVar.b |= 1;
        zaoVar.c = mostSignificantBits;
        long leastSignificantBits = uuid.getLeastSignificantBits();
        aborVarN.t();
        defpackage.zao zaoVar2 = (defpackage.zao) aborVarN.b;
        zaoVar2.b |= 2;
        zaoVar2.d = leastSignificantBits;
        return (defpackage.zao) aborVarN.q();
    }

    public static /* synthetic */ defpackage.zbe m(defpackage.xij xijVar) {
        int iOrdinal = xijVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.zbe.AUDIO_FOCUS_REQUEST_GAIN;
        }
        if (iOrdinal == 1) {
            return defpackage.zbe.AUDIO_FOCUS_REQUEST_GAIN_TR;
        }
        if (iOrdinal == 2) {
            return defpackage.zbe.AUDIO_FOCUS_REQUEST_GAIN_TR_DUCK;
        }
        if (iOrdinal == 3) {
            return defpackage.zbe.AUDIO_FOCUS_REQUEST_RELEASE;
        }
        throw new java.lang.RuntimeException(null, null);
    }

    public static /* synthetic */ int n(java.util.Map map) {
        java.lang.Object obj;
        java.util.Collection collectionValues = map.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(collectionValues, 10));
        java.util.Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((java.util.List) it.next()).size()));
        }
        java.util.Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            java.lang.Object next = it2.next();
            while (it2.hasNext()) {
                next = java.lang.Integer.valueOf(((java.lang.Number) next).intValue() + ((java.lang.Number) it2.next()).intValue());
            }
            obj = next;
        } else {
            obj = null;
        }
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static /* synthetic */ android.view.inputmethod.ExtractedText p(defpackage.dkd dkdVar) {
        android.view.inputmethod.ExtractedText extractedText = new android.view.inputmethod.ExtractedText();
        extractedText.text = dkdVar.a();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = dkdVar.a().length();
        extractedText.partialStartOffset = -1;
        long j = dkdVar.b;
        extractedText.selectionStart = defpackage.dgc.d(j);
        extractedText.selectionEnd = defpackage.dgc.c(j);
        extractedText.flags = !afzh.A(dkdVar.a(), '\n') ? 1 : 0;
        return extractedText;
    }

    public static /* synthetic */ boolean q(int i) {
        int type = java.lang.Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static /* synthetic */ long r(long j, long j2) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static /* synthetic */ java.lang.Object s(java.lang.Object obj) throws defpackage.abpp {
        byte[] bArr = (byte[]) obj;
        defpackage.abox aboxVarD = defpackage.abox.D(defpackage.absx.a, bArr, 0, bArr.length, defpackage.abol.a);
        defpackage.abox.U(aboxVarD);
        return (defpackage.absx) aboxVarD;
    }

    public static /* synthetic */ java.lang.Object t(java.lang.Object obj) throws defpackage.abpp {
        byte[] bArr = (byte[]) obj;
        defpackage.abox aboxVarD = defpackage.abox.D(defpackage.absw.a, bArr, 0, bArr.length, defpackage.abol.a);
        defpackage.abox.U(aboxVarD);
        return (defpackage.absw) aboxVarD;
    }

    public static /* synthetic */ void o(java.lang.Object obj) {
    }
}
