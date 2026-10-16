package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dba implements android.view.translation.ViewTranslationCallback {
    public static final defpackage.dba a = new defpackage.dba();

    /* JADX WARN: Code duplicated, block: B:19:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x006f A[LOOP:0: B:5:0x0019->B:20:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[EDGE_INSN: B:23:0x0072->B:21:0x0072 BREAK  A[LOOP:0: B:5:0x0019->B:20:0x006f], SYNTHETIC] */
    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(android.view.View view) {
        int i;
        defpackage.ddn ddnVar;
        view.getClass();
        defpackage.cgx cgxVar = ((defpackage.czz) view).r;
        cgxVar.f = 1;
        defpackage.zo zoVarH = cgxVar.h();
        java.lang.Object[] objArr = zoVarH.c;
        long[] jArr = zoVarH.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            defpackage.ddz ddzVar = ((defpackage.dec) ((defpackage.hio) objArr[(i2 << 3) + i4]).b).b;
                            if (ddzVar.g(defpackage.def.F) != null && (ddnVar = (defpackage.ddn) ddzVar.g(defpackage.ddy.n)) != null) {
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0077 A[LOOP:0: B:5:0x0019->B:20:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x007a A[EDGE_INSN: B:23:0x007a->B:21:0x007a BREAK  A[LOOP:0: B:5:0x0019->B:20:0x0077], SYNTHETIC] */
    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(android.view.View view) {
        int i;
        defpackage.ddn ddnVar;
        view.getClass();
        defpackage.cgx cgxVar = ((defpackage.czz) view).r;
        cgxVar.f = 1;
        defpackage.zo zoVarH = cgxVar.h();
        java.lang.Object[] objArr = zoVarH.c;
        long[] jArr = zoVarH.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            defpackage.ddz ddzVar = ((defpackage.dec) ((defpackage.hio) objArr[(i2 << 3) + i4]).b).b;
                            if (defpackage.afga.f(ddzVar.g(defpackage.def.F), java.lang.Boolean.TRUE) && (ddnVar = (defpackage.ddn) ddzVar.g(defpackage.ddy.m)) != null) {
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(android.view.View view) {
        int i;
        defpackage.ddn ddnVar;
        view.getClass();
        defpackage.cgx cgxVar = ((defpackage.czz) view).r;
        cgxVar.f = 2;
        defpackage.zo zoVarH = cgxVar.h();
        java.lang.Object[] objArr = zoVarH.c;
        long[] jArr = zoVarH.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        defpackage.ddz ddzVar = ((defpackage.dec) ((defpackage.hio) objArr[(i2 << 3) + i4]).b).b;
                        if (defpackage.afga.f(ddzVar.g(defpackage.def.F), java.lang.Boolean.FALSE) && (ddnVar = (defpackage.ddn) ddzVar.g(defpackage.ddy.m)) != null) {
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return true;
                }
            }
            if (i2 == length) {
                return true;
            }
            i2++;
        }
    }
}
