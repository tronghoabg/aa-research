package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class adrl extends adlf {
    final adkx a;
    final adkn b;
    final adrx c;
    final adry d;
    List e;
    aduw f;
    boolean g;
    boolean h;
    public final /* synthetic */ advv i;
    aebg j;

    public adrl(advv advvVar, adkx adkxVar) {
        this.i = advvVar;
        this.e = adkxVar.a;
        this.a = adkxVar;
        adkn adknVarB = adkn.b("Subchannel", advvVar.a());
        this.b = adknVarB;
        adry adryVar = new adry(adknVarB, advvVar.l.a(), "Subchannel for ".concat(adkxVar.a.toString()));
        this.d = adryVar;
        this.c = new adrx(adryVar, advvVar.l);
    }

    @Override // defpackage.adlf
    public final void a() {
        this.i.m.c();
        woy.aa(this.g, "not started");
        if (this.h) {
            return;
        }
        this.f.a();
    }

    @Override // defpackage.adlf
    public final void b() {
        aebg aebgVar;
        advv advvVar = this.i;
        adnw adnwVar = advvVar.m;
        adnwVar.c();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!advvVar.A || (aebgVar = this.j) == null) {
                return;
            }
            aebgVar.h();
            this.j = null;
        }
        if (advvVar.A) {
            this.f.g(advv.b);
        } else {
            this.j = adnwVar.d(new advb(new aduy(this, 11)), 5L, TimeUnit.SECONDS, advvVar.i.c());
        }
    }

    @Override // defpackage.adlf
    public final void c(adlh adlhVar) {
        advv advvVar = this.i;
        adnw adnwVar = advvVar.m;
        adnwVar.c();
        woy.aa(!this.g, "already started");
        woy.aa(!this.h, "already shutdown");
        woy.aa(!advvVar.A, "Channel is being terminated");
        this.g = true;
        String strA = advvVar.a();
        adsm adsmVar = advvVar.i;
        ScheduledExecutorService scheduledExecutorServiceC = adsmVar.c();
        adus adusVar = new adus(this, adlhVar);
        adrw adrwVarA = advvVar.C.a();
        admh admhVar = advvVar.s.b.R;
        adkn adknVar = this.b;
        adrx adrxVar = this.c;
        List list = advvVar.p;
        adkx adkxVar = this.a;
        adkj adkjVar = advvVar.G;
        aduw aduwVar = new aduw(adkxVar, strA, adsmVar, scheduledExecutorServiceC, adnwVar, adusVar, adkjVar, adrwVarA, adknVar, adrxVar, list, advvVar.h, admhVar);
        adkf adkfVar = new adkf();
        adkfVar.a = "Child Subchannel started";
        adkfVar.b = adkg.b;
        adkfVar.b(advvVar.l.a());
        adkfVar.d = aduwVar;
        advvVar.E.b(adkfVar.a());
        this.f = aduwVar;
        adkj.b(adkjVar.e, aduwVar);
        advvVar.u.add(aduwVar);
    }

    @Override // defpackage.adlf
    public final void d(List list) {
        this.i.m.c();
        this.e = list;
        aduw aduwVar = this.f;
        list.getClass();
        aduw.j(list);
        woy.O(!list.isEmpty(), "newAddressGroups is empty");
        aduwVar.g.execute(new adsy(aduwVar, DesugarCollections.unmodifiableList(new ArrayList(list)), 14, (char[]) null));
    }

    public final String toString() {
        return this.b.toString();
    }
}
