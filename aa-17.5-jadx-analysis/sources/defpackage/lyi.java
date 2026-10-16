package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
final class lyi implements epf {
    private static final yph a = yph.c("GH.MessagingCarAppSrvc");
    private final luj b;

    public lyi(luj lujVar) {
        this.b = lujVar;
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        ((ype) a.f()).y("Messaging app stop: %s", this.b.b);
    }

    @Override // defpackage.epf
    public final void fM() {
        ((ype) a.f()).y("Messaging app pause: %s", this.b.b);
    }

    @Override // defpackage.epf
    public final void fx(eqa eqaVar) {
        ype ypeVar = (ype) a.f();
        luj lujVar = this.b;
        ypeVar.y("Messaging app resume: %s", lujVar.b);
        ComponentName componentName = lujVar.a;
        componentName.getClass();
        lxr.e();
        yzz yzzVar = yzz.MESSAGING_APP;
        lxr.g(yzzVar, yzy.mV, componentName);
        if (lup.e().g(componentName)) {
            lxr.e();
            lxr.g(yzzVar, yzy.na, componentName);
        }
        lup.e();
        if (lup.k(componentName)) {
            lxr.e();
            lxr.g(yzzVar, yzy.mZ, componentName);
        }
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        ((ype) a.f()).y("Messaging app start: %s", this.b.b);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }
}
