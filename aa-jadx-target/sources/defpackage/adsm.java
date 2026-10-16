package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adsm extends defpackage.admg {
    final defpackage.adly a;
    final defpackage.adlo b;
    final defpackage.adsy c;
    final defpackage.adsz d;
    java.util.List e;
    defpackage.advx f;
    boolean g;
    boolean h;
    final /* synthetic */ defpackage.adww i;
    defpackage.aecg j;

    public adsm(defpackage.adww adwwVar, defpackage.adly adlyVar) {
        this.i = adwwVar;
        this.e = adlyVar.a;
        this.a = adlyVar;
        defpackage.adlo adloVarB = defpackage.adlo.b("Subchannel", adwwVar.a());
        this.b = adloVarB;
        defpackage.adsz adszVar = new defpackage.adsz(adloVarB, adwwVar.l.a(), "Subchannel for ".concat(adlyVar.a.toString()));
        this.d = adszVar;
        this.c = new defpackage.adsy(adszVar, adwwVar.l);
    }

    @Override // defpackage.admg
    public final void a() {
        this.i.m.c();
        defpackage.ysr.bk(this.g, "not started");
        if (this.h) {
            return;
        }
        this.f.a();
    }

    @Override // defpackage.admg
    public final void b() {
        defpackage.aecg aecgVar;
        defpackage.adww adwwVar = this.i;
        defpackage.adox adoxVar = adwwVar.m;
        adoxVar.c();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!adwwVar.A || (aecgVar = this.j) == null) {
                return;
            }
            aecgVar.h();
            this.j = null;
        }
        if (adwwVar.A) {
            this.f.g(defpackage.adww.b);
        } else {
            this.j = adoxVar.d(new defpackage.adwb(new defpackage.adug(this, 20)), 5L, java.util.concurrent.TimeUnit.SECONDS, adwwVar.i.c());
        }
    }

    @Override // defpackage.admg
    public final void c(admi admiVar) {
        defpackage.adww adwwVar = this.i;
        defpackage.adox adoxVar = adwwVar.m;
        adoxVar.c();
        defpackage.ysr.bk(!this.g, "already started");
        defpackage.ysr.bk(!this.h, "already shutdown");
        defpackage.ysr.bk(!adwwVar.A, "Channel is being terminated");
        this.g = true;
        java.lang.String strA = adwwVar.a();
        adtn adtnVar = adwwVar.i;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceC = adtnVar.c();
        defpackage.advt advtVar = new defpackage.advt(this, admiVar);
        defpackage.adsx adsxVarA = adwwVar.C.a();
        adni adniVar = adwwVar.s.b.R;
        defpackage.adlo adloVar = this.b;
        defpackage.adsy adsyVar = this.c;
        java.util.List list = adwwVar.p;
        defpackage.adly adlyVar = this.a;
        defpackage.adlk adlkVar = adwwVar.G;
        defpackage.advx advxVar = new defpackage.advx(adlyVar, strA, adtnVar, scheduledExecutorServiceC, adoxVar, advtVar, adlkVar, adsxVarA, adloVar, adsyVar, list, adwwVar.h, adniVar);
        defpackage.adlg adlgVar = new defpackage.adlg();
        adlgVar.a = "Child Subchannel started";
        adlgVar.b = defpackage.adlh.b;
        adlgVar.b(adwwVar.l.a());
        adlgVar.c = advxVar;
        adwwVar.E.b(adlgVar.a());
        this.f = advxVar;
        defpackage.adlk.b(adlkVar.e, advxVar);
        adwwVar.u.add(advxVar);
    }

    @Override // defpackage.admg
    public final void d(java.util.List list) {
        this.i.m.c();
        this.e = list;
        defpackage.advx advxVar = this.f;
        list.getClass();
        defpackage.advx.j(list);
        defpackage.ysr.aY(!list.isEmpty(), "newAddressGroups is empty");
        advxVar.g.execute(new defpackage.aafx(advxVar, j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list)), 19, (char[]) null));
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }
}
