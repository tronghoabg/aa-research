package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import androidx.car.app.model.Alert;

/* loaded from: classes2.dex */
public final class jym implements gvb, epf {
    public static final yph a = yph.c("CarApp.H.Not");
    public final ComponentName b;
    public final geu c;
    public boolean d;
    private Alert e;
    private final boolean f;
    private final Object g = new Object();

    public jym(geu geuVar) {
        this.c = geuVar;
        jwq jwqVar = (jwq) geuVar;
        ComponentName componentName = ((gmh) jwqVar.c).a;
        this.b = componentName;
        boolean z = false;
        if (new tgw(mki.a.c, acob.f()).a(componentName.getPackageName()) && nsr.c().b().m().equals(nsv.a)) {
            z = true;
        }
        this.f = z;
        ((ype) a.l().ai(2838)).N("AlertProjectionNotificationProcessor for %s isEnabled(%s)", componentName.flattenToShortString(), z);
        jwqVar.h.b(this, 13, new joo(this, 14, null));
        gsf gsfVar = (gsf) geuVar.l(gsf.class);
        if (gsfVar != null) {
            this.d = gsfVar.c();
        }
    }

    @Override // defpackage.epf
    public final void fw(eqa eqaVar) {
        ((jwq) this.c).h.c(this, 13);
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        i();
    }

    @Override // defpackage.gvb
    public final void g() {
        if (this.f) {
            synchronized (this.g) {
                if (this.e != null) {
                    ((ype) a.l().ai(2839)).y("Canceling Alert %s", this.b);
                    Alert alert = this.e;
                    alert.getClass();
                    gev.c(new hhx(this, alert.getId(), 8));
                }
                this.e = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bc  */
    @Override // defpackage.gvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(androidx.car.app.model.Alert r17, java.util.function.Consumer r18) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jym.h(androidx.car.app.model.Alert, java.util.function.Consumer):void");
    }

    public final void i() {
        gdl gdlVar;
        Alert alertB;
        if (this.f) {
            geu geuVar = this.c;
            if (!((ggk) geuVar.F(ggk.class)).r() || (gdlVar = (gdl) geuVar.l(gdl.class)) == null || (alertB = gdlVar.b()) == null) {
                return;
            }
            gdlVar.c = System.currentTimeMillis();
            Handler handler = gdlVar.d;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(gdlVar.e, alertB.getDurationMillis());
        }
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fL(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }
}
