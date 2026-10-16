package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adug implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public adug(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [advz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v25, types: [adln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v43, types: [advz, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        long jNextLong;
        boolean z;
        boolean z2 = true;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.adui) this.a).f.e();
                return;
            case 1:
                ((defpackage.adui) this.a).f.d();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.aduh) this.a).a.e();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ?? r14 = ((defpackage.erh) ((ajnd) this.a).a).a;
                defpackage.ador adorVarE = defpackage.ador.m.e("Keepalive failed. The connection is likely gone");
                defpackage.aeat aeatVar = defpackage.aeat.SUBCHANNEL_SHUTDOWN;
                r14.a(adorVarE);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.advx advxVar = (defpackage.advx) this.a;
                advxVar.v = null;
                advxVar.d.a(2, "CONNECTING after backoff");
                advxVar.b(defpackage.adkh.a);
                advxVar.h();
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.advx advxVar2 = (defpackage.advx) this.a;
                if (advxVar2.p.a == defpackage.adkh.d) {
                    advxVar2.d.a(2, "CONNECTING as requested");
                    advxVar2.b(defpackage.adkh.a);
                    advxVar2.h();
                    return;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.advx advxVar3 = (defpackage.advx) ((defpackage.aafx) this.a).b;
                adxj adxjVar = advxVar3.k;
                advxVar3.w = null;
                advxVar3.k = null;
                adxjVar.q(defpackage.ador.m.e("InternalSubchannel closed transport due to address change"));
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ?? r15 = this.a;
                defpackage.advx advxVar4 = (defpackage.advx) r15;
                advxVar4.d.a(2, "Terminated");
                defpackage.adww adwwVar = ((defpackage.adsm) advxVar4.a.b).i;
                adwwVar.u.remove(r15);
                defpackage.adlk.c(adwwVar.G.e, r15);
                adwwVar.j();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.advv advvVar = (defpackage.advv) this.a;
                defpackage.advx advxVar5 = advvVar.c;
                advxVar5.u = null;
                if (advxVar5.q != null) {
                    defpackage.ysr.bk(advxVar5.o == null, "Unexpected non-null activeTransport");
                    advvVar.a.q(advxVar5.q);
                    return;
                }
                adtt adttVar = advxVar5.n;
                adtt adttVar2 = advvVar.a;
                if (adttVar == adttVar2) {
                    advxVar5.o = adttVar2;
                    advxVar5.n = null;
                    defpackage.advu advuVar = advxVar5.h;
                    advxVar5.r = advuVar.a();
                    advxVar5.b(defpackage.adkh.b);
                    defpackage.aeaz aeazVar = advxVar5.s;
                    java.lang.String str = advxVar5.t;
                    java.lang.String strG = defpackage.advv.g(advuVar.a());
                    java.lang.String strF = defpackage.advv.f(advuVar.a(), defpackage.adkw.b);
                    java.lang.String strE = defpackage.advv.e((defpackage.adof) advuVar.a().a(defpackage.adva.a));
                    defpackage.adnz adnzVar = defpackage.aeaz.c;
                    defpackage.ygw ygwVarQ = defpackage.ygw.q(str);
                    defpackage.ygw ygwVarR = defpackage.ygw.r(strG, strF);
                    adni adniVar = aeazVar.a;
                    adniVar.a(adnzVar, ygwVarQ, ygwVarR);
                    adniVar.b(defpackage.aeaz.e, defpackage.ygw.q(str), defpackage.ygw.s(strE, strG, strF));
                    return;
                }
                return;
            case 9:
                defpackage.advv advvVar2 = (defpackage.advv) this.a;
                adtt adttVar3 = advvVar2.a;
                defpackage.advx advxVar6 = advvVar2.c;
                java.util.Collection collection = advxVar6.l;
                collection.remove(adttVar3);
                if (advxVar6.p.a == defpackage.adkh.e && collection.isEmpty()) {
                    advxVar6.d();
                    return;
                }
                return;
            case 10:
                java.lang.Object obj = this.a;
                synchronized (obj) {
                    if (((adwa) obj).g != 6) {
                        ((adwa) obj).g = 6;
                    } else {
                        z2 = false;
                    }
                    break;
                }
                if (z2) {
                    java.lang.Object obj2 = this.a;
                    defpackage.ador adorVarE2 = defpackage.ador.m.e("Keepalive failed. The connection is likely gone");
                    defpackage.aeat aeatVar2 = defpackage.aeat.SUBCHANNEL_SHUTDOWN;
                    ((adwa) obj2).h.a.a(adorVarE2);
                    return;
                }
                return;
            case 11:
                java.lang.Object obj3 = this.a;
                synchronized (obj3) {
                    ((adwa) obj3).d = null;
                    int i = ((adwa) obj3).g;
                    jNextLong = 0;
                    if (i == 2) {
                        ((adwa) obj3).g = 4;
                        ((adwa) obj3).c = ((adwa) obj3).a.schedule(((adwa) obj3).e, 0L, java.util.concurrent.TimeUnit.NANOSECONDS);
                        z = true;
                    } else {
                        if (i == 3) {
                            ((adwa) obj3).d = ((adwa) obj3).a.schedule(((adwa) obj3).f, -((adwa) obj3).b.a(java.util.concurrent.TimeUnit.NANOSECONDS), java.util.concurrent.TimeUnit.NANOSECONDS);
                            ((adwa) obj3).g = 2;
                        }
                        z = false;
                    }
                    break;
                }
                if (z) {
                    defpackage.erh erhVar = ((adwa) this.a).h;
                    java.lang.Object obj4 = erhVar.a;
                    ajnd ajndVar = new ajnd(erhVar, (byte[]) null);
                    java.lang.Object obj5 = ((aece) obj4).m;
                    defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
                    synchronized (obj5) {
                        defpackage.ysr.bj(((aece) obj4).k != null);
                        if (((aece) obj4).u) {
                            ((aece) obj4).f();
                            advj.b(ajndVar, zgtVar);
                            return;
                        }
                        advj advjVar = ((aece) obj4).t;
                        if (advjVar != null) {
                            z2 = false;
                        } else {
                            jNextLong = ((aece) obj4).h.nextLong();
                            defpackage.xzg xzgVar = new defpackage.xzg();
                            xzgVar.e();
                            advj advjVar2 = new advj(jNextLong, xzgVar);
                            ((aece) obj4).t = advjVar2;
                            ((aece) obj4).F.e++;
                            advjVar = advjVar2;
                        }
                        if (z2) {
                            ((aece) obj4).k.d(false, (int) (jNextLong >>> 32), (int) jNextLong);
                        }
                        synchronized (advjVar) {
                            if (advjVar.d) {
                                advj.a(zgtVar, advjVar.e != null ? new defpackage.adug(ajndVar, 3) : new advi(0));
                                return;
                            } else {
                                advjVar.c.put(ajndVar, zgtVar);
                                return;
                            }
                        }
                    }
                }
                return;
            case 12:
                ((defpackage.adww) this.a).g(true);
                return;
            case 13:
                defpackage.adww adwwVar2 = (defpackage.adww) this.a;
                if (adwwVar2.z.get() || adwwVar2.s == null) {
                    return;
                }
                adwwVar2.g(false);
                adwwVar2.h();
                return;
            case 14:
                defpackage.adww adwwVar3 = (defpackage.adww) this.a;
                adwwVar3.F.a(2, "Entering SHUTDOWN state");
                adwwVar3.o.a(defpackage.adkh.e);
                return;
            case 15:
                defpackage.adww adwwVar4 = (defpackage.adww) this.a;
                if (adwwVar4.s == null) {
                    return;
                }
                adwwVar4.h();
                return;
            case 16:
                defpackage.adww adwwVar5 = ((defpackage.adwn) this.a).b;
                adwwVar5.m.c();
                if (adwwVar5.r) {
                    adwwVar5.q.b();
                    return;
                }
                return;
            case 17:
                defpackage.adwt adwtVar = (defpackage.adwt) this.a;
                defpackage.adww adwwVar6 = adwtVar.c;
                if (adwwVar6.v == null) {
                    java.util.concurrent.atomic.AtomicReference atomicReference = adwtVar.a;
                    if (atomicReference.get() == defpackage.adww.e) {
                        atomicReference.set(null);
                    }
                    adwwVar6.y.a(defpackage.adww.b);
                    return;
                }
                return;
            case 18:
                ((defpackage.adwt) this.a).c.i();
                return;
            case 19:
                java.lang.Object obj6 = this.a;
                defpackage.adww adwwVar7 = ((adws) obj6).k.c;
                java.util.Collection collection2 = adwwVar7.v;
                if (collection2 != null) {
                    collection2.remove(obj6);
                    if (adwwVar7.v.isEmpty()) {
                        adwwVar7.P.c(adwwVar7.w, false);
                        adwwVar7.v = null;
                        if (adwwVar7.z.get()) {
                            adwwVar7.y.a(defpackage.adww.b);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((defpackage.adsm) this.a).f.g(defpackage.adww.c);
                return;
        }
    }
}
