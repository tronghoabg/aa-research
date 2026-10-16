package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adzf implements adtk {
    final defpackage.adzg a;
    public final /* synthetic */ defpackage.adzi b;

    public adzf(defpackage.adzi adziVar, defpackage.adzg adzgVar) {
        this.b = adziVar;
        this.a = adzgVar;
    }

    private static final java.lang.Integer b(defpackage.adnd adndVar) {
        java.lang.String str = (java.lang.String) adndVar.b(defpackage.adzi.b);
        if (str == null) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    public final void a(defpackage.ador adorVar, defpackage.adtj adtjVar, defpackage.adnd adndVar) {
        int i;
        int i2;
        adzb adzbVar;
        java.lang.String string;
        defpackage.adzi adziVar = this.b;
        synchronized (adziVar.m) {
            defpackage.adze adzeVar = adziVar.r;
            defpackage.adzg adzgVar = this.a;
            adzgVar.b = true;
            java.util.Collection collection = adzeVar.c;
            if (collection.contains(adzgVar)) {
                java.util.ArrayList arrayList = new java.util.ArrayList(collection);
                arrayList.remove(adzgVar);
                adzeVar = new defpackage.adze(adzeVar.b, j$.util.DesugarCollections.unmodifiableCollection(arrayList), adzeVar.d, adzeVar.f, adzeVar.g, adzeVar.a, adzeVar.h, adzeVar.e);
            }
            adziVar.r = adzeVar;
            adziVar.q.a(adorVar.p);
        }
        defpackage.adzi adziVar2 = this.b;
        if (adziVar2.u.decrementAndGet() == Integer.MIN_VALUE) {
            adziVar2.h.execute(new adxw(this, 8));
            return;
        }
        defpackage.adzg adzgVar2 = this.a;
        if (adzgVar2.c) {
            adziVar2.r(adzgVar2);
            if (adziVar2.r.f == adzgVar2) {
                adziVar2.v(adorVar, adtjVar, adndVar);
                return;
            }
            return;
        }
        defpackage.adtj adtjVar2 = defpackage.adtj.d;
        if (adtjVar == adtjVar2 && adziVar2.t.incrementAndGet() > 1000) {
            adziVar2.r(adzgVar2);
            if (adziVar2.r.f == adzgVar2) {
                defpackage.adoo adooVar = defpackage.adoo.INTERNAL;
                java.nio.charset.Charset charset = defpackage.adve.a;
                defpackage.ador adorVarA = adooVar.a();
                java.lang.String str = adorVar.q;
                if (str == null) {
                    string = adorVar.p.toString();
                } else {
                    string = adorVar.p.toString() + ": " + str;
                }
                adziVar2.v(adorVarA.e("Too many transparent retries. Might be a bug in gRPC: ".concat(java.lang.String.valueOf(string))).d(adorVar.r), adtjVar, adndVar);
                return;
            }
            return;
        }
        if (adziVar2.r.f == null) {
            if (adtjVar == adtjVar2 || (adtjVar == defpackage.adtj.b && adziVar2.s.compareAndSet(false, true))) {
                defpackage.adzi adziVar3 = this.b;
                defpackage.adzg adzgVar3 = this.a;
                defpackage.adzg adzgVarP = adziVar3.p(adzgVar3.d, true, false);
                if (adzgVarP != null) {
                    if (adziVar3.l) {
                        synchronized (adziVar3.m) {
                            defpackage.adze adzeVar2 = adziVar3.r;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(adzeVar2.d);
                            arrayList2.remove(adzgVar3);
                            arrayList2.add(adzgVarP);
                            adziVar3.r = new defpackage.adze(adzeVar2.b, adzeVar2.c, j$.util.DesugarCollections.unmodifiableCollection(arrayList2), adzeVar2.f, adzeVar2.g, adzeVar2.a, adzeVar2.h, adzeVar2.e);
                        }
                    }
                    this.b.g.execute(new defpackage.adwr(this, adzgVarP, 6, null));
                    return;
                }
                return;
            }
            if (adtjVar != defpackage.adtj.c) {
                adziVar2.s.set(true);
                if (adziVar2.l) {
                    java.lang.Integer numB = b(adndVar);
                    defpackage.adzi adziVar4 = this.b;
                    boolean zContains = adziVar4.k.c.contains(adorVar.p);
                    adzh adzhVar = adziVar4.p;
                    boolean z = (adzhVar == null || (!zContains && (numB == null || numB.intValue() >= 0))) ? false : !adzhVar.b();
                    if (zContains && !z && !adorVar.g() && numB != null && numB.intValue() > 0) {
                        numB = 0;
                    }
                    boolean z2 = zContains && !z;
                    if (z2 && numB != null) {
                        if (numB.intValue() < 0) {
                            adziVar4.u();
                        } else {
                            java.lang.Object obj = adziVar4.m;
                            synchronized (obj) {
                                adzb adzbVar2 = adziVar4.y;
                                if (adzbVar2 != null) {
                                    java.util.concurrent.Future futureA = adzbVar2.a();
                                    adzb adzbVar3 = new adzb(obj);
                                    adziVar4.y = adzbVar3;
                                    if (futureA != null) {
                                        futureA.cancel(false);
                                    }
                                    adzbVar3.b(adziVar4.i.schedule((java.lang.Runnable) new adzc(adziVar4, adzbVar3), numB.intValue(), java.util.concurrent.TimeUnit.MILLISECONDS));
                                }
                            }
                        }
                    }
                    defpackage.adzi adziVar5 = this.b;
                    synchronized (adziVar5.m) {
                        defpackage.adze adzeVar3 = adziVar5.r;
                        defpackage.adzg adzgVar4 = this.a;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(adzeVar3.d);
                        arrayList3.remove(adzgVar4);
                        adziVar5.r = new defpackage.adze(adzeVar3.b, adzeVar3.c, j$.util.DesugarCollections.unmodifiableCollection(arrayList3), adzeVar3.f, adzeVar3.g, adzeVar3.a, adzeVar3.h, adzeVar3.e);
                        if (z2 && (adziVar5.w(adziVar5.r) || !adziVar5.r.d.isEmpty())) {
                            return;
                        }
                    }
                } else {
                    defpackage.adzj adzjVar = adziVar2.j;
                    long j = 0;
                    if (adzjVar == null) {
                        i2 = 0;
                        i = 1;
                    } else {
                        boolean zContains2 = adzjVar.f.contains(adorVar.p);
                        java.lang.Integer numB2 = b(adndVar);
                        adzh adzhVar2 = adziVar2.p;
                        boolean z3 = (adzhVar2 == null || (!zContains2 && (numB2 == null || numB2.intValue() >= 0))) ? false : !adzhVar2.b();
                        if (adzjVar.a <= adzgVar2.d + 1 || z3) {
                            i = 1;
                            i2 = 0;
                        } else {
                            if (numB2 == null) {
                                if (zContains2) {
                                    long j2 = adziVar2.z;
                                    double dNextDouble = defpackage.adzi.e ? (defpackage.adzi.d.nextDouble() * 0.4d) + 0.8d : defpackage.adzi.d.nextDouble();
                                    i = 1;
                                    adziVar2.z = java.lang.Math.min((long) (adziVar2.z * adzjVar.d), adzjVar.c);
                                    j = (long) (j2 * dNextDouble);
                                }
                                i = 1;
                                i2 = 0;
                            } else {
                                i = 1;
                                if (numB2.intValue() >= 0) {
                                    long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(numB2.intValue());
                                    adziVar2.z = adzjVar.b;
                                    j = nanos;
                                } else {
                                    i2 = 0;
                                }
                            }
                            i2 = i;
                        }
                    }
                    if (i2 != 0) {
                        defpackage.adzg adzgVarP2 = adziVar2.p(adzgVar2.d + i, false, false);
                        if (adzgVarP2 != null) {
                            java.lang.Object obj2 = adziVar2.m;
                            synchronized (obj2) {
                                adzbVar = new adzb(obj2);
                                adziVar2.x = adzbVar;
                            }
                            adzbVar.b(this.b.i.schedule(new defpackage.unw(this, adzbVar, adzgVarP2, 18), j, java.util.concurrent.TimeUnit.NANOSECONDS));
                            return;
                        }
                        return;
                    }
                }
            } else if (adziVar2.l) {
                adziVar2.u();
            }
        }
        defpackage.adzi adziVar6 = this.b;
        defpackage.adzg adzgVar5 = this.a;
        adziVar6.r(adzgVar5);
        if (adziVar6.r.f == adzgVar5) {
            adziVar6.v(adorVar, adtjVar, adndVar);
        }
    }

    public final void c(defpackage.adnd adndVar) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i;
        int i2;
        defpackage.adzg adzgVar = this.a;
        int i3 = adzgVar.d;
        if (i3 > 0) {
            defpackage.admy admyVar = defpackage.adzi.a;
            adndVar.d(admyVar);
            adndVar.f(admyVar, java.lang.String.valueOf(i3));
        }
        defpackage.adzi adziVar = this.b;
        adziVar.r(adzgVar);
        if (adziVar.r.f == adzgVar) {
            adzh adzhVar = adziVar.p;
            if (adzhVar != null) {
                do {
                    atomicInteger = adzhVar.d;
                    i = atomicInteger.get();
                    i2 = adzhVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, java.lang.Math.min(adzhVar.c + i, i2)));
            }
            adziVar.h.execute(new defpackage.adwr(this, adndVar, 4));
        }
    }

    public final void d(aeax aeaxVar) {
        defpackage.adzi adziVar = this.b;
        defpackage.adzg adzgVar = adziVar.r.f;
        defpackage.ysr.bk(adzgVar != null, "Headers should be received prior to messages.");
        if (adzgVar != this.a) {
            defpackage.adve.f(aeaxVar);
        } else {
            adziVar.h.execute(new defpackage.adwr(this, aeaxVar, 7, null));
        }
    }

    public final void e() {
        defpackage.adzi adziVar = this.b;
        if (adziVar.o()) {
            adziVar.h.execute(new adxw(this, 9));
        }
    }
}
