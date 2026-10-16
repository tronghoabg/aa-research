package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adwn extends defpackage.admb {
    defpackage.admj a;
    final /* synthetic */ defpackage.adww b;

    public adwn(defpackage.adww adwwVar) {
        this.b = adwwVar;
    }

    @Override // defpackage.admb
    public final defpackage.adjy a() {
        return this.b.F;
    }

    @Override // defpackage.admb
    public final /* bridge */ /* synthetic */ defpackage.admg b(defpackage.adly adlyVar) {
        defpackage.adww adwwVar = this.b;
        adwwVar.m.c();
        defpackage.ysr.bk(!adwwVar.A, "Channel is being terminated");
        return new defpackage.adsm(adwwVar, adlyVar);
    }

    @Override // defpackage.admb
    public final defpackage.adox c() {
        return this.b.m;
    }

    @Override // defpackage.admb
    public final java.util.concurrent.ScheduledExecutorService d() {
        return this.b.j;
    }

    @Override // defpackage.admb
    public final void e() {
        defpackage.adox adoxVar = this.b.m;
        adoxVar.c();
        adoxVar.execute(new defpackage.adug(this, 16));
    }

    @Override // defpackage.admb
    public final void f(defpackage.adkh adkhVar, defpackage.admh admhVar) {
        defpackage.adww adwwVar = this.b;
        adwwVar.m.c();
        if (this != adwwVar.s || adwwVar.t) {
            return;
        }
        adwwVar.m(admhVar);
        if (adkhVar != defpackage.adkh.e) {
            adwwVar.F.b(2, "Entering {0} state with picker: {1}", adkhVar, admhVar);
            adwwVar.o.a(adkhVar);
        }
    }
}
