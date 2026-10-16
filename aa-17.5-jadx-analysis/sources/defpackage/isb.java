package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class isb {
    private final jfg c;
    private static final yph b = yph.c("CAR.AUDIO");
    public static final ygr a = new ymp(yzy.zu);

    public isb(jfg jfgVar) {
        this.c = jfgVar;
    }

    private static yzy d(xhj xhjVar) {
        switch (xhjVar) {
            case AUDIO_FOCUS_STATE_INVALID:
                return yzy.zc;
            case AUDIO_FOCUS_STATE_GAIN:
                return yzy.zd;
            case AUDIO_FOCUS_STATE_GAIN_TRANSIENT:
                return yzy.ze;
            case AUDIO_FOCUS_STATE_LOSS:
                return yzy.zh;
            case AUDIO_FOCUS_STATE_LOSS_TRANSIENT_CAN_DUCK:
                return yzy.zj;
            case AUDIO_FOCUS_STATE_LOSS_TRANSIENT:
                return yzy.zi;
            case AUDIO_FOCUS_STATE_GAIN_MEDIA_ONLY:
                return yzy.zg;
            case AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY:
                return yzy.zf;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public final void a(isa isaVar) {
        Long l;
        xhi xhiVar = isaVar.a;
        if (xhiVar != null && isaVar.b == null) {
            yzz yzzVarT = aclh.t(xhiVar);
            int i = isaVar.h;
            if (i != 0) {
                int i2 = i - 1;
                if (i2 == 3) {
                    c(yzzVarT, yzy.zs);
                } else if (i2 == 4) {
                    c(yzzVarT, yzy.zt);
                }
            }
            if (!isaVar.e) {
                c(yzzVarT, yzy.zm);
                return;
            }
            int i3 = isaVar.f;
            if (i3 == 1) {
                c(yzzVarT, yzy.za);
                return;
            } else {
                if (i3 == isaVar.g) {
                    c(yzzVarT, yzy.zb);
                    return;
                }
                return;
            }
        }
        yzz yzzVarT2 = xhiVar == null ? yzz.AUDIO_FOCUS_REQUEST_UNAVAILABLE : aclh.t(xhiVar);
        int i4 = isaVar.h;
        if (i4 != 0) {
            int i5 = i4 - 1;
            if (i5 == 1) {
                c(yzzVarT2, yzy.zq);
            } else if (i5 == 2) {
                c(yzzVarT2, yzy.zr);
            }
        }
        if (!isaVar.d) {
            if (xhiVar != null) {
                xhj xhjVar = isaVar.b;
                yzz yzzVarT3 = aclh.t(xhiVar);
                xhjVar.getClass();
                c(yzzVarT3, d(xhjVar));
                return;
            }
            return;
        }
        if (xhiVar != null) {
            ((ype) ((ype) b.h()).ai(1273)).w("Received unsolicited response for request %d", xhiVar.e);
        }
        xhj xhjVar2 = isaVar.b;
        xhjVar2.getClass();
        yzz yzzVar = yzz.AUDIO_FOCUS_REQUEST_UNAVAILABLE;
        c(yzzVar, d(xhjVar2));
        if (xhjVar2 == xhj.AUDIO_FOCUS_STATE_LOSS && (l = isaVar.c) != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            if (jElapsedRealtime < 5000) {
                ((ype) ((ype) b.h()).ai(1272)).x("Unsolicited LOSS received %d millis after voice session", jElapsedRealtime);
                c(yzzVar, yzy.zn);
            }
        }
        if (i4 == 1) {
            c(yzzVar, yzy.zp);
        }
    }

    public final void b(yzy yzyVar) {
        c(yzz.AUDIO_FOCUS_PHONE_CALL, yzyVar);
    }

    public final void c(yzz yzzVar, yzy yzyVar) {
        rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzzVar, yzyVar);
        rrbVarH.w(1);
        this.c.b(rrbVarH.l());
    }
}
