package defpackage;

/* loaded from: classes2.dex */
public final class rfi {
    private static final ypf a = ols.R("CAR.AUDIO");
    private final rwz b;

    public rfi(rwz rwzVar) {
        this.b = rwzVar;
    }

    private static yzy c(xhj xhjVar) {
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

    private final void d(yzz yzzVar, yzy yzyVar) {
        rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzzVar, yzyVar);
        rrbVarH.w(1);
        this.b.b(rrbVarH.l());
    }

    public final void a(rfh rfhVar) {
        xhi xhiVar = rfhVar.a;
        if (xhiVar != null && rfhVar.b == null && !rfhVar.d) {
            d(aclh.t(xhiVar), yzy.zm);
            return;
        }
        yzz yzzVarT = xhiVar == null ? yzz.AUDIO_FOCUS_REQUEST_UNAVAILABLE : aclh.t(xhiVar);
        if (rfhVar.g) {
            d(yzzVarT, yzy.zq);
        }
        if (rfhVar.c) {
            if (xhiVar != null) {
                a.h().ai(7931).w("Received unsolicited response for request %d", xhiVar.e);
            }
            xhj xhjVar = rfhVar.b;
            yzz yzzVar = yzz.AUDIO_FOCUS_REQUEST_UNAVAILABLE;
            xhjVar.getClass();
            d(yzzVar, c(xhjVar));
            return;
        }
        if (xhiVar == null) {
            return;
        }
        boolean z = rfhVar.d;
        yzz yzzVarT2 = aclh.t(xhiVar);
        if (!z) {
            xhj xhjVar2 = rfhVar.b;
            xhjVar2.getClass();
            d(yzzVarT2, c(xhjVar2));
            return;
        }
        int i = rfhVar.e;
        if (i == 1) {
            d(yzzVarT2, yzy.za);
        } else if (i == rfhVar.f) {
            d(yzzVarT2, yzy.zb);
        }
    }

    public final void b(yzy yzyVar) {
        d(yzz.AUDIO_FOCUS_PHONE_CALL, yzyVar);
    }
}
