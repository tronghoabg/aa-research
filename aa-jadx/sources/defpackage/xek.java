package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class xek extends defpackage.xds {
    private static final defpackage.yqm t = defpackage.yqm.c("GH.PrInputService");
    protected android.os.Bundle s;

    public xek() {
        super("ProjectionInputMethod");
    }

    @Override // defpackage.xds
    public final defpackage.xdy e() {
        defpackage.xdy xejVar;
        try {
            boolean zE = defpackage.nrr.a().e();
            boolean zD = defpackage.nrr.a().d();
            boolean zF = defpackage.nrr.a().f();
            if (!zD || zE) {
                if (!zD && !zE && !zF) {
                    throw new java.lang.Exception("Car has invalid input configuration");
                }
                xejVar = new defpackage.xej();
            } else {
                xejVar = new defpackage.xet();
            }
            try {
                android.os.Bundle bundle = this.s;
                if (bundle != null) {
                    xejVar.setArguments(bundle);
                }
                return xejVar;
            } catch (java.lang.Exception e) {
                e = e;
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) t.g()).p(e)).ai((char) 10163)).u("Exception thrown");
                return xejVar;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            xejVar = null;
        }
    }

    @Override // defpackage.xds, defpackage.rmv, android.app.Service
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            this.s = intent.getExtras();
        }
        this.p.p();
        if ("external_keyboard_action".equals(intent.getAction())) {
            return this.n;
        }
        if ("com.google.android.gms.car.BIND_CAR_INPUT".equals(intent.getAction())) {
            return this.e;
        }
        return null;
    }

    public xek(java.lang.String str) {
        super(str);
    }
}
