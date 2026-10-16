package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class adsy implements Runnable {
    public final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ adsy(adtk adtkVar, IOException iOException, int i) {
        this.c = i;
        this.a = adtkVar;
        this.b = iOException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [adje, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [adzx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        adwi adwiVar;
        adyf adyfVar;
        boolean z = true;
        int i = 0;
        adxy adxyVar = null;
        switch (this.c) {
            case 0:
                adnq adnqVar = (adnq) this.a;
                ((adtc) this.b).g.i(adnqVar.q, adnqVar.r);
                return;
            case 1:
                ((adqm) this.b).b((adnq) this.a);
                return;
            case 2:
                ((adtc) this.a).g.n(this.b);
                return;
            case 3:
                ((adtb) this.b).k((admc) this.a);
                return;
            case 4:
                ((adtb) this.a).l(this.b);
                return;
            case 5:
                ((adti) this.b).f.h(this.a);
                return;
            case 6:
                ((adti) this.b).f.j((adjt) this.a);
                return;
            case 7:
                ((adti) this.b).f.i((adjr) this.a);
                return;
            case 8:
                ((adti) this.a).f.n((InputStream) this.b);
                return;
            case 9:
                ((adti) this.b).f.c((adnq) this.a);
                return;
            case 10:
                ((adth) this.a).a.d(this.b);
                return;
            case 11:
                ((adth) this.b).a.c((admc) this.a);
                return;
            case 12:
                ((adtk) this.b).b.u((admp) this.a);
                return;
            case 13:
                List list = Collections.EMPTY_LIST;
                adtk adtkVar = (adtk) this.a;
                adtkVar.b.u(new admp(adns.b(adnq.m.e("Unable to resolve host ".concat(String.valueOf(adtkVar.a.j))).d((Throwable) this.b)), adis.a, null));
                return;
            case 14:
                ?? r0 = this.b;
                aduw aduwVar = (aduw) this.a;
                adut adutVar = aduwVar.h;
                SocketAddress socketAddressB = adutVar.b();
                adutVar.c = r0;
                adutVar.c();
                aduwVar.i = r0;
                adjh adjhVar = aduwVar.p.a;
                adjh adjhVar2 = adjh.b;
                if (adjhVar == adjhVar2 || aduwVar.p.a == adjh.a) {
                    while (true) {
                        if (i < adutVar.c.size()) {
                            int iIndexOf = ((adjv) adutVar.c.get(i)).e.indexOf(socketAddressB);
                            if (iIndexOf == -1) {
                                i++;
                            } else {
                                adutVar.a = i;
                                adutVar.b = iIndexOf;
                            }
                        } else if (aduwVar.p.a == adjhVar2) {
                            adwiVar = aduwVar.o;
                            aduwVar.o = null;
                            adutVar.c();
                            aduwVar.b(adjh.d);
                        } else {
                            aduwVar.n.q(adnq.m.e("InternalSubchannel closed pending transport due to address change"));
                            aduwVar.n = null;
                            adutVar.c();
                            aduwVar.h();
                        }
                    }
                    adwiVar = null;
                } else {
                    adwiVar = null;
                }
                if (adwiVar != null) {
                    if (aduwVar.w != null) {
                        aduwVar.k.q(adnq.m.e("InternalSubchannel closed transport early due to address change"));
                        aduwVar.w.h();
                        aduwVar.w = null;
                    }
                    aduwVar.k = adwiVar;
                    aduwVar.w = aduwVar.g.d(new adpo(this, 18, null), 5L, TimeUnit.SECONDS, aduwVar.b);
                    return;
                }
                return;
            case 15:
                aduw aduwVar2 = (aduw) this.b;
                adjh adjhVar3 = aduwVar2.p.a;
                adjh adjhVar4 = adjh.e;
                if (adjhVar3 == adjhVar4) {
                    return;
                }
                adnq adnqVar2 = (adnq) this.a;
                aduwVar2.q = adnqVar2;
                adwi adwiVar2 = aduwVar2.o;
                adss adssVar = aduwVar2.n;
                aduwVar2.o = null;
                aduwVar2.n = null;
                aduwVar2.b(adjhVar4);
                aduwVar2.h.c();
                if (aduwVar2.l.isEmpty()) {
                    aduwVar2.d();
                }
                aduwVar2.g.c();
                aebg aebgVar = aduwVar2.v;
                if (aebgVar != null) {
                    aebgVar.h();
                    aduwVar2.v = null;
                    aduwVar2.u = null;
                }
                aebg aebgVar2 = aduwVar2.w;
                if (aebgVar2 != null) {
                    aebgVar2.h();
                    aduwVar2.k.q(adnqVar2);
                    aduwVar2.w = null;
                    aduwVar2.k = null;
                }
                if (adwiVar2 != null) {
                    adwiVar2.q(adnqVar2);
                }
                if (adssVar != null) {
                    adssVar.q(adnqVar2);
                    return;
                }
                return;
            case 16:
                ((advo) this.b).g((adnq) this.a);
                return;
            case 17:
                advs advsVar = (advs) this.b;
                if (advsVar.a.get() != advv.e) {
                    ((advr) this.a).bc();
                    return;
                }
                advv advvVar = advsVar.c;
                if (advvVar.v == null) {
                    advvVar.v = new LinkedHashSet();
                    advvVar.P.c(advvVar.w, true);
                }
                advvVar.v.add(this.a);
                return;
            case 18:
                this.b.run();
                Object obj = this.a;
                ((advr) obj).k.c.m.execute(new aduy(obj, 10));
                return;
            case 19:
                Object obj2 = this.a;
                adyg adygVar = ((adxz) obj2).b;
                Object obj3 = adygVar.m;
                synchronized (obj3) {
                    if (!((adxz) obj2).a.c) {
                        adygVar.r = adygVar.r.a((adye) this.b);
                        if (adygVar.w(adygVar.r) && ((adyfVar = adygVar.p) == null || adyfVar.a())) {
                            adxyVar = new adxy(obj3);
                            adygVar.y = adxyVar;
                        } else {
                            adygVar.r = adygVar.r.b();
                            adygVar.y = null;
                        }
                        z = false;
                    }
                }
                if (z) {
                    adye adyeVar = (adye) this.b;
                    adyeVar.a.m(new adyd(((adxz) this.a).b, adyeVar));
                    adyeVar.a.c(adnq.c.e("Unneeded hedging"));
                    return;
                }
                if (adxyVar != null) {
                    adyg adygVar2 = ((adxz) this.a).b;
                    adxyVar.b(adygVar2.i.schedule(new adxz(adygVar2, adxyVar), adygVar2.k.b, TimeUnit.NANOSECONDS));
                }
                ((adxz) this.a).b.t((adye) this.b);
                return;
            default:
                ((adyd) this.b).b.w.c((admc) this.a);
                return;
        }
    }

    public adsy(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ adsy(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public adsy(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
