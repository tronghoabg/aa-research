package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class lhy extends kfn {
    final /* synthetic */ lig a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhy(lig ligVar) {
        super(null);
        this.a = ligVar;
    }

    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        ((ype) ((ype) lig.a.f()).ai((char) 3924)).u("Connected to Android Auto car");
        wer.c();
        this.a.m(true, true);
    }

    @Override // defpackage.kfn
    public final void b() {
        ((ype) ((ype) lig.a.f()).ai((char) 3925)).u("Disconnected from Android Auto car");
        wer.c();
        this.a.m(false, true);
    }

    @Override // defpackage.kfn
    public final void c(qrn qrnVar) {
        boolean zR = kio.b().r();
        yph yphVar = lig.a;
        this.a.l = 3;
        if (omc.a) {
            ((ype) ((ype) lig.a.f()).ai((char) 3937)).u("Overriding GMS log settings, since GH logging forced");
            try {
                mki.a.g();
                ols.C(qrnVar, "car_force_logging", true);
            } catch (qrz e) {
                tss.r("GH.LifetimeManager", e, "Car not connected while force turning on logging!", new Object[0]);
            }
        }
        wer.c();
        lig ligVar = this.a;
        Iterator it = ligVar.i.iterator();
        while (it.hasNext()) {
            ((lhl) it.next()).e();
        }
        if (zR) {
            return;
        }
        ligVar.m(false, false);
    }

    @Override // defpackage.kfn
    public final void d(rbu rbuVar) {
        wer.c();
        ((ype) ((ype) lig.a.g()).ai((char) 3927)).y("Connection failed: %s", rbuVar);
        lig ligVar = this.a;
        ligVar.l = 1;
        Iterator it = ligVar.i.iterator();
        while (it.hasNext() && !((lhl) it.next()).g(rbuVar)) {
        }
    }

    @Override // defpackage.kfn
    public final void fz() {
        wer.c();
        yph yphVar = lig.a;
        this.a.l = 1;
    }
}
