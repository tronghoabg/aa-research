package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class isj {
    private final defpackage.jfo c;
    private static final defpackage.yqm b = defpackage.yqm.c("CAR.AUDIO");
    public static final defpackage.yhx a = new defpackage.ynu(defpackage.zbd.zy);

    public isj(defpackage.jfo jfoVar) {
        this.c = jfoVar;
    }

    private static defpackage.zbd d(defpackage.xik xikVar) {
        switch (xikVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.zbd.zg;
            case 1:
                return defpackage.zbd.zh;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.zbd.zi;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.zbd.zl;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.zbd.zn;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.zbd.zm;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.zbd.zk;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.zbd.zj;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }

    public final void a(defpackage.isi isiVar) {
        java.lang.Long l;
        defpackage.xij xijVar = isiVar.a;
        if (xijVar != null && isiVar.b == null) {
            defpackage.zbe zbeVarM = defpackage.acmj.m(xijVar);
            int i = isiVar.h;
            if (i != 0) {
                int i2 = i - 1;
                if (i2 == 3) {
                    c(zbeVarM, defpackage.zbd.zw);
                } else if (i2 == 4) {
                    c(zbeVarM, defpackage.zbd.zx);
                }
            }
            if (!isiVar.e) {
                c(zbeVarM, defpackage.zbd.zq);
                return;
            }
            int i3 = isiVar.f;
            if (i3 == 1) {
                c(zbeVarM, defpackage.zbd.ze);
                return;
            } else {
                if (i3 == isiVar.g) {
                    c(zbeVarM, defpackage.zbd.zf);
                    return;
                }
                return;
            }
        }
        defpackage.zbe zbeVarM2 = xijVar == null ? defpackage.zbe.AUDIO_FOCUS_REQUEST_UNAVAILABLE : defpackage.acmj.m(xijVar);
        int i4 = isiVar.h;
        if (i4 != 0) {
            int i5 = i4 - 1;
            if (i5 == 1) {
                c(zbeVarM2, defpackage.zbd.zu);
            } else if (i5 == 2) {
                c(zbeVarM2, defpackage.zbd.zv);
            }
        }
        if (!isiVar.d) {
            if (xijVar != null) {
                defpackage.xik xikVar = isiVar.b;
                defpackage.zbe zbeVarM3 = defpackage.acmj.m(xijVar);
                xikVar.getClass();
                c(zbeVarM3, d(xikVar));
                return;
            }
            return;
        }
        if (xijVar != null) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai(1273)).w("Received unsolicited response for request %d", xijVar.e);
        }
        defpackage.xik xikVar2 = isiVar.b;
        xikVar2.getClass();
        defpackage.zbe zbeVar = defpackage.zbe.AUDIO_FOCUS_REQUEST_UNAVAILABLE;
        c(zbeVar, d(xikVar2));
        if (xikVar2 == defpackage.xik.AUDIO_FOCUS_STATE_LOSS && (l = isiVar.c) != null) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - l.longValue();
            if (jElapsedRealtime < 5000) {
                ((defpackage.yqj) ((defpackage.yqj) b.h()).ai(1272)).x("Unsolicited LOSS received %d millis after voice session", jElapsedRealtime);
                c(zbeVar, defpackage.zbd.zr);
            }
        }
        if (i4 == 1) {
            c(zbeVar, defpackage.zbd.zt);
        }
    }

    public final void b(defpackage.zbd zbdVar) {
        c(defpackage.zbe.AUDIO_FOCUS_PHONE_CALL, zbdVar);
    }

    public final void c(defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, zbeVar, zbdVar);
        rrvVarH.w(1);
        this.c.b(rrvVarH.l());
    }
}
