package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class advn extends adla {
    adli a;
    final /* synthetic */ advv b;

    public advn(advv advvVar) {
        this.b = advvVar;
    }

    @Override // defpackage.adla
    public final adiy a() {
        return this.b.F;
    }

    @Override // defpackage.adla
    public final /* bridge */ /* synthetic */ adlf b(adkx adkxVar) {
        advv advvVar = this.b;
        advvVar.m.c();
        woy.aa(!advvVar.A, "Channel is being terminated");
        return new adrl(advvVar, adkxVar);
    }

    @Override // defpackage.adla
    public final adnw c() {
        return this.b.m;
    }

    @Override // defpackage.adla
    public final ScheduledExecutorService d() {
        return this.b.j;
    }

    @Override // defpackage.adla
    public final void e() {
        adnw adnwVar = this.b.m;
        adnwVar.c();
        adnwVar.execute(new aduy(this, 7));
    }

    @Override // defpackage.adla
    public final void f(adjh adjhVar, adlg adlgVar) {
        advv advvVar = this.b;
        advvVar.m.c();
        if (this != advvVar.s || advvVar.t) {
            return;
        }
        advvVar.m(adlgVar);
        if (adjhVar != adjh.e) {
            advvVar.F.b(2, "Entering {0} state with picker: {1}", adjhVar, adlgVar);
            advvVar.o.a(adjhVar);
        }
    }
}
