package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class adyd implements adsj {
    final adye a;
    public final /* synthetic */ adyg b;

    public adyd(adyg adygVar, adye adyeVar) {
        this.b = adygVar;
        this.a = adyeVar;
    }

    private static final Integer b(admc admcVar) {
        String str = (String) admcVar.b(adyg.b);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // defpackage.adsj
    public final void a(adnq adnqVar, adsi adsiVar, admc admcVar) {
        int i;
        int i2;
        adxy adxyVar;
        String string;
        adyg adygVar = this.b;
        synchronized (adygVar.m) {
            adyb adybVar = adygVar.r;
            adye adyeVar = this.a;
            adyeVar.b = true;
            Collection collection = adybVar.c;
            if (collection.contains(adyeVar)) {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.remove(adyeVar);
                adybVar = new adyb(adybVar.b, DesugarCollections.unmodifiableCollection(arrayList), adybVar.d, adybVar.f, adybVar.g, adybVar.a, adybVar.h, adybVar.e);
            }
            adygVar.r = adybVar;
            adygVar.q.a(adnqVar.p);
        }
        adyg adygVar2 = this.b;
        if (adygVar2.u.decrementAndGet() == Integer.MIN_VALUE) {
            adygVar2.h.execute(new aduy(this, 20));
            return;
        }
        adye adyeVar2 = this.a;
        if (adyeVar2.c) {
            adygVar2.r(adyeVar2);
            if (adygVar2.r.f == adyeVar2) {
                adygVar2.v(adnqVar, adsiVar, admcVar);
                return;
            }
            return;
        }
        adsi adsiVar2 = adsi.d;
        if (adsiVar == adsiVar2 && adygVar2.t.incrementAndGet() > 1000) {
            adygVar2.r(adyeVar2);
            if (adygVar2.r.f == adyeVar2) {
                adnn adnnVar = adnn.INTERNAL;
                Charset charset = adue.a;
                adnq adnqVarA = adnnVar.a();
                String str = adnqVar.q;
                if (str == null) {
                    string = adnqVar.p.toString();
                } else {
                    string = adnqVar.p.toString() + ": " + str;
                }
                adygVar2.v(adnqVarA.e("Too many transparent retries. Might be a bug in gRPC: ".concat(String.valueOf(string))).d(adnqVar.r), adsiVar, admcVar);
                return;
            }
            return;
        }
        if (adygVar2.r.f == null) {
            if (adsiVar == adsiVar2 || (adsiVar == adsi.b && adygVar2.s.compareAndSet(false, true))) {
                adyg adygVar3 = this.b;
                adye adyeVar3 = this.a;
                adye adyeVarP = adygVar3.p(adyeVar3.d, true, false);
                if (adyeVarP != null) {
                    if (adygVar3.l) {
                        synchronized (adygVar3.m) {
                            adyb adybVar2 = adygVar3.r;
                            ArrayList arrayList2 = new ArrayList(adybVar2.d);
                            arrayList2.remove(adyeVar3);
                            arrayList2.add(adyeVarP);
                            adygVar3.r = new adyb(adybVar2.b, adybVar2.c, DesugarCollections.unmodifiableCollection(arrayList2), adybVar2.f, adybVar2.g, adybVar2.a, adybVar2.h, adybVar2.e);
                        }
                    }
                    this.b.g.execute(new adyc(this, adyeVarP, 0));
                    return;
                }
                return;
            }
            if (adsiVar != adsi.c) {
                adygVar2.s.set(true);
                if (adygVar2.l) {
                    Integer numB = b(admcVar);
                    adyg adygVar4 = this.b;
                    boolean zContains = adygVar4.k.c.contains(adnqVar.p);
                    boolean z = (adygVar4.p == null || (!zContains && (numB == null || numB.intValue() >= 0))) ? false : !r9.b();
                    if (zContains && !z && !adnqVar.g() && numB != null && numB.intValue() > 0) {
                        numB = 0;
                    }
                    boolean z2 = zContains && !z;
                    if (z2 && numB != null) {
                        if (numB.intValue() < 0) {
                            adygVar4.u();
                        } else {
                            Object obj = adygVar4.m;
                            synchronized (obj) {
                                adxy adxyVar2 = adygVar4.y;
                                if (adxyVar2 != null) {
                                    Future futureA = adxyVar2.a();
                                    adxy adxyVar3 = new adxy(obj);
                                    adygVar4.y = adxyVar3;
                                    if (futureA != null) {
                                        futureA.cancel(false);
                                    }
                                    adxyVar3.b(adygVar4.i.schedule(new adxz(adygVar4, adxyVar3), numB.intValue(), TimeUnit.MILLISECONDS));
                                }
                            }
                        }
                    }
                    adyg adygVar5 = this.b;
                    synchronized (adygVar5.m) {
                        adyb adybVar3 = adygVar5.r;
                        adye adyeVar4 = this.a;
                        ArrayList arrayList3 = new ArrayList(adybVar3.d);
                        arrayList3.remove(adyeVar4);
                        adygVar5.r = new adyb(adybVar3.b, adybVar3.c, DesugarCollections.unmodifiableCollection(arrayList3), adybVar3.f, adybVar3.g, adybVar3.a, adybVar3.h, adybVar3.e);
                        if (z2 && (adygVar5.w(adygVar5.r) || !adygVar5.r.d.isEmpty())) {
                            return;
                        }
                    }
                } else {
                    adyh adyhVar = adygVar2.j;
                    long j = 0;
                    if (adyhVar == null) {
                        i2 = 0;
                        i = 1;
                    } else {
                        boolean zContains2 = adyhVar.f.contains(adnqVar.p);
                        Integer numB2 = b(admcVar);
                        boolean z3 = (adygVar2.p == null || (!zContains2 && (numB2 == null || numB2.intValue() >= 0))) ? false : !r13.b();
                        if (adyhVar.a <= adyeVar2.d + 1 || z3) {
                            i = 1;
                            i2 = 0;
                        } else {
                            if (numB2 == null) {
                                if (zContains2) {
                                    long j2 = adygVar2.z;
                                    double dNextDouble = adyg.e ? (adyg.d.nextDouble() * 0.4d) + 0.8d : adyg.d.nextDouble();
                                    i = 1;
                                    adygVar2.z = Math.min((long) (adygVar2.z * adyhVar.d), adyhVar.c);
                                    j = (long) (j2 * dNextDouble);
                                }
                                i = 1;
                                i2 = 0;
                            } else {
                                i = 1;
                                if (numB2.intValue() >= 0) {
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(numB2.intValue());
                                    adygVar2.z = adyhVar.b;
                                    j = nanos;
                                }
                                i2 = 0;
                            }
                            i2 = i;
                        }
                    }
                    if (i2 != 0) {
                        adye adyeVarP2 = adygVar2.p(adyeVar2.d + i, false, false);
                        if (adyeVarP2 != null) {
                            Object obj2 = adygVar2.m;
                            synchronized (obj2) {
                                adxyVar = new adxy(obj2);
                                adygVar2.x = adxyVar;
                            }
                            adxyVar.b(this.b.i.schedule(new uze(this, adxyVar, adyeVarP2, 14), j, TimeUnit.NANOSECONDS));
                            return;
                        }
                        return;
                    }
                }
            } else if (adygVar2.l) {
                adygVar2.u();
            }
        }
        adyg adygVar6 = this.b;
        adye adyeVar5 = this.a;
        adygVar6.r(adyeVar5);
        if (adygVar6.r.f == adyeVar5) {
            adygVar6.v(adnqVar, adsiVar, admcVar);
        }
    }

    @Override // defpackage.adsj
    public final void c(admc admcVar) {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        adye adyeVar = this.a;
        int i3 = adyeVar.d;
        if (i3 > 0) {
            adlx adlxVar = adyg.a;
            admcVar.d(adlxVar);
            admcVar.f(adlxVar, String.valueOf(i3));
        }
        adyg adygVar = this.b;
        adygVar.r(adyeVar);
        if (adygVar.r.f == adyeVar) {
            adyf adyfVar = adygVar.p;
            if (adyfVar != null) {
                do {
                    atomicInteger = adyfVar.d;
                    i = atomicInteger.get();
                    i2 = adyfVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(adyfVar.c + i, i2)));
            }
            adygVar.h.execute(new adsy(this, admcVar, 20));
        }
    }

    @Override // defpackage.adzy
    public final void d(adzx adzxVar) throws IOException {
        adyg adygVar = this.b;
        adye adyeVar = adygVar.r.f;
        woy.aa(adyeVar != null, "Headers should be received prior to messages.");
        if (adyeVar != this.a) {
            adue.f(adzxVar);
        } else {
            adygVar.h.execute(new adyc(this, adzxVar, 2));
        }
    }

    @Override // defpackage.adzy
    public final void e() {
        adyg adygVar = this.b;
        if (adygVar.o()) {
            adygVar.h.execute(new adyj(this, 1));
        }
    }
}
