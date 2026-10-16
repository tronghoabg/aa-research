package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public class xdn extends xcw {
    private static final yph t = yph.c("GH.PrInputService");
    protected Bundle s;

    public xdn() {
        super("ProjectionInputMethod");
    }

    @Override // defpackage.xcw
    public final xdc e() throws Exception {
        xdc xdmVar;
        try {
            boolean zE = nrd.a().e();
            boolean zD = nrd.a().d();
            boolean zF = nrd.a().f();
            if (!zD || zE) {
                if (!zD && !zE && !zF) {
                    throw new Exception("Car has invalid input configuration");
                }
                xdmVar = new xdm();
            } else {
                xdmVar = new xdv();
            }
        } catch (Exception e) {
            e = e;
            xdmVar = null;
        }
        try {
            Bundle bundle = this.s;
            if (bundle != null) {
                xdmVar.setArguments(bundle);
            }
            return xdmVar;
        } catch (Exception e2) {
            e = e2;
            ((ype) ((ype) ((ype) t.g()).p(e)).ai((char) 10135)).u("Exception thrown");
            return xdmVar;
        }
    }

    @Override // defpackage.xcw, defpackage.rlz, android.app.Service
    @ResultIgnorabilityUnspecified
    public final IBinder onBind(Intent intent) {
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

    public xdn(String str) {
        super(str);
    }
}
