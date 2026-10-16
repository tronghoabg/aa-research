package defpackage;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class aduy implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aduy(adli adliVar, int i) {
        this.b = i;
        this.a = adliVar;
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [aduz, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        long jNextLong = 0;
        boolean z3 = true;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                synchronized (obj) {
                    if (((adva) obj).g != 6) {
                        ((adva) obj).g = 6;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    Object obj2 = this.a;
                    adnq adnqVarE = adnq.m.e("Keepalive failed. The connection is likely gone");
                    adzt adztVar = adzt.SUBCHANNEL_SHUTDOWN;
                    ((adva) obj2).h.a.a(adnqVarE);
                    return;
                }
                return;
            case 1:
                aduu aduuVar = (aduu) this.a;
                adss adssVar = aduuVar.a;
                aduw aduwVar = aduuVar.c;
                Collection collection = aduwVar.l;
                collection.remove(adssVar);
                if (aduwVar.p.a == adjh.e && collection.isEmpty()) {
                    aduwVar.d();
                    return;
                }
                return;
            case 2:
                Object obj3 = this.a;
                synchronized (obj3) {
                    ((adva) obj3).d = null;
                    int i = ((adva) obj3).g;
                    if (i == 2) {
                        ((adva) obj3).g = 4;
                        ((adva) obj3).c = ((adva) obj3).a.schedule(((adva) obj3).e, 0L, TimeUnit.NANOSECONDS);
                        z = true;
                    } else {
                        if (i == 3) {
                            ((adva) obj3).d = ((adva) obj3).a.schedule(((adva) obj3).f, -((adva) obj3).b.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                            ((adva) obj3).g = 2;
                        }
                        z = false;
                    }
                }
                if (z) {
                    sm smVar = ((adva) this.a).h;
                    Object obj4 = smVar.a;
                    ajmd ajmdVar = new ajmd(smVar, null);
                    Object obj5 = ((aebe) obj4).m;
                    zfq zfqVar = zfq.a;
                    synchronized (obj5) {
                        woy.Z(((aebe) obj4).k != null);
                        if (((aebe) obj4).u) {
                            ((aebe) obj4).f();
                            adui.b(ajmdVar, zfqVar);
                            return;
                        }
                        adui aduiVar = ((aebe) obj4).t;
                        if (aduiVar != null) {
                            z2 = false;
                        } else {
                            jNextLong = ((aebe) obj4).h.nextLong();
                            xya xyaVar = new xya();
                            xyaVar.e();
                            adui aduiVar2 = new adui(jNextLong, xyaVar);
                            ((aebe) obj4).t = aduiVar2;
                            ((aebe) obj4).F.e++;
                            aduiVar = aduiVar2;
                            z2 = true;
                        }
                        if (z2) {
                            ((aebe) obj4).k.d(false, (int) (jNextLong >>> 32), (int) jNextLong);
                        }
                        synchronized (aduiVar) {
                            if (aduiVar.d) {
                                adui.a(zfqVar, aduiVar.e != null ? new adpo(ajmdVar, 15, null) : new adzc(1));
                                return;
                            } else {
                                aduiVar.c.put(ajmdVar, zfqVar);
                                return;
                            }
                        }
                    }
                }
                return;
            case 3:
                ((advv) this.a).g(true);
                return;
            case 4:
                advv advvVar = (advv) this.a;
                if (advvVar.z.get() || advvVar.s == null) {
                    return;
                }
                advvVar.g(false);
                advvVar.h();
                return;
            case 5:
                advv advvVar2 = (advv) this.a;
                advvVar2.F.a(2, "Entering SHUTDOWN state");
                advvVar2.o.a(adjh.e);
                return;
            case 6:
                advv advvVar3 = (advv) this.a;
                if (advvVar3.s == null) {
                    return;
                }
                advvVar3.h();
                return;
            case 7:
                advv advvVar4 = ((advn) this.a).b;
                advvVar4.m.c();
                if (advvVar4.r) {
                    advvVar4.q.b();
                    return;
                }
                return;
            case 8:
                advs advsVar = (advs) this.a;
                advv advvVar5 = advsVar.c;
                if (advvVar5.v == null) {
                    AtomicReference atomicReference = advsVar.a;
                    if (atomicReference.get() == advv.e) {
                        atomicReference.set(null);
                    }
                    advvVar5.y.a(advv.b);
                    return;
                }
                return;
            case 9:
                ((advs) this.a).c.i();
                return;
            case 10:
                Object obj6 = this.a;
                advv advvVar6 = ((advr) obj6).k.c;
                Collection collection2 = advvVar6.v;
                if (collection2 != null) {
                    collection2.remove(obj6);
                    if (advvVar6.v.isEmpty()) {
                        advvVar6.P.c(advvVar6.w, false);
                        advvVar6.v = null;
                        if (advvVar6.z.get()) {
                            advvVar6.y.a(advv.b);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((adrl) this.a).f.g(advv.c);
                return;
            case 12:
                Object obj7 = this.a;
                adxb adxbVar = (adxb) obj7;
                adxbVar.s = null;
                adxbVar.k.c();
                ((adli) obj7).c();
                return;
            case 13:
                Object obj8 = this.a;
                adxb adxbVar2 = (adxb) obj8;
                adxbVar2.r = null;
                if (adxbVar2.k.e()) {
                    ((adli) obj8).c();
                    return;
                }
                return;
            case 14:
                ((adli) this.a).c();
                return;
            case 15:
                ((adli) this.a).c();
                return;
            case 16:
                Object obj9 = this.a;
                adxo adxoVar = (adxo) obj9;
                if (!adxoVar.e) {
                    adxoVar.f = null;
                    return;
                }
                long jA = adxoVar.d - adxoVar.a();
                if (jA > 0) {
                    adxoVar.f = adxoVar.a.schedule(new aduy(obj9, 17), jA, TimeUnit.NANOSECONDS);
                    return;
                }
                adxoVar.e = false;
                adxoVar.f = null;
                adxoVar.c.run();
                return;
            case 17:
                Object obj10 = this.a;
                ((adxo) obj10).b.execute(new aduy(obj10, 16));
                return;
            case 18:
                adyg adygVar = ((adxq) this.a).g;
                adygVar.A = true;
                adsj adsjVar = adygVar.w;
                zre zreVar = adygVar.F;
                adsjVar.a((adnq) zreVar.b, (adsi) zreVar.c, (admc) zreVar.a);
                return;
            case 19:
                adyg adygVar2 = (adyg) this.a;
                if (adygVar2.A) {
                    return;
                }
                adygVar2.w.e();
                return;
            default:
                adyg adygVar3 = ((adyd) this.a).b;
                adygVar3.A = true;
                adsj adsjVar2 = adygVar3.w;
                zre zreVar2 = adygVar3.F;
                adsjVar2.a((adnq) zreVar2.b, (adsi) zreVar2.c, (admc) zreVar2.a);
                return;
        }
    }

    public aduy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
