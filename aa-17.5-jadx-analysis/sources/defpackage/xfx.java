package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes.dex */
public final class xfx extends ebf {
    public static final yph a = yph.c("GH.GearheadCallNotifica");
    public boolean b;
    public final Context c;
    public final odj d;
    public qrh e;
    public final qxr f;
    public final kfn g;

    public xfx(Context context) {
        odj odjVar = (odj) mki.a.i(odj.class);
        this.f = new qxr(this);
        this.g = new xfu(this);
        this.d = odjVar;
        context.getClass();
        this.c = context;
    }

    public static xfx O() {
        return wyg.a.c;
    }

    private final void R(CarCall carCall) throws qsa {
        if (mjv.C().g(carCall)) {
            return;
        }
        Q();
    }

    public final void P() {
        qrh qrhVar = this.e;
        if (qrhVar != null && qrhVar.a()) {
            qxr qxrVar = this.f;
            if (qrhVar.b == null) {
                throw new IllegalStateException("Cannot remove CarPhoneStatusEventListener if carPhoneStatus is null");
            }
            ((rox) qrhVar.c).c(new rcy(qrhVar, qxrVar, 1));
        }
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, qxp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q() throws defpackage.qsa {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfx.Q():void");
    }

    @Override // defpackage.ebf
    public final void n(CarCall carCall) throws qsa {
        R(carCall);
    }

    @Override // defpackage.ebf
    public final void p(CarCall carCall) throws qsa {
        R(carCall);
    }

    @Override // defpackage.ebf
    public final void y(CarCall carCall, int i) throws qsa {
        ((ype) ((ype) a.f()).ai((char) 10273)).w("onStateChanged: state=%d", i);
        R(carCall);
    }
}
