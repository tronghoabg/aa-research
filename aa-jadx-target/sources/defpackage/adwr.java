package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adwr implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ adwr(aiuf aiufVar, aixu aixuVar, int i) {
        this.c = i;
        this.a = aiufVar;
        this.b = aixuVar;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [aeax, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v37, types: [aiuf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        adzb adzbVar;
        adzh adzhVar;
        boolean z = true;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                defpackage.adwt adwtVar = (defpackage.adwt) this.b;
                if (adwtVar.a.get() != defpackage.adww.e) {
                    ((adws) this.a).aT();
                    return;
                }
                defpackage.adww adwwVar = adwtVar.c;
                if (adwwVar.v == null) {
                    adwwVar.v = new java.util.LinkedHashSet();
                    adwwVar.P.c(adwwVar.w, true);
                }
                adwwVar.v.add(this.a);
                return;
            case 1:
                ((defpackage.adwo) this.b).g((defpackage.ador) this.a);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                this.b.run();
                java.lang.Object obj = this.a;
                ((adws) obj).k.c.m.execute(new defpackage.adug(obj, 19));
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj2 = this.a;
                defpackage.adzi adziVar = ((adzc) obj2).b;
                java.lang.Object obj3 = adziVar.m;
                synchronized (obj3) {
                    adzbVar = null;
                    if (!((adzc) obj2).a.c) {
                        adziVar.r = adziVar.r.a((defpackage.adzg) this.b);
                        z = false;
                        if (adziVar.w(adziVar.r) && ((adzhVar = adziVar.p) == null || adzhVar.a())) {
                            adzbVar = new adzb(obj3);
                            adziVar.y = adzbVar;
                        } else {
                            adziVar.r = adziVar.r.b();
                            adziVar.y = null;
                        }
                    }
                    break;
                }
                if (z) {
                    defpackage.adzg adzgVar = (defpackage.adzg) this.b;
                    adzgVar.a.m(new defpackage.adzf(((adzc) this.a).b, adzgVar));
                    adzgVar.a.c(defpackage.ador.c.e("Unneeded hedging"));
                    return;
                }
                if (adzbVar != null) {
                    defpackage.adzi adziVar2 = ((adzc) this.a).b;
                    adzbVar.b(adziVar2.i.schedule(new adzc(adziVar2, adzbVar), adziVar2.k.b, java.util.concurrent.TimeUnit.NANOSECONDS));
                }
                ((adzc) this.a).b.t((defpackage.adzg) this.b);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.adzf) this.b).b.w.c((defpackage.adnd) this.a);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.adzf) ((defpackage.unw) this.a).a).b.t((defpackage.adzg) this.b);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.adzf) this.a).b.t((defpackage.adzg) this.b);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.adzf) this.a).b.w.d((aeax) this.b);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                try {
                    ((java.util.concurrent.CyclicBarrier) this.b).await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                    ((java.util.concurrent.CountDownLatch) this.a).await();
                    return;
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                } catch (java.util.concurrent.BrokenBarrierException | java.util.concurrent.TimeoutException unused2) {
                    return;
                }
            default:
                this.a.f((aiut) this.b, defpackage.afbk.a);
                return;
        }
    }

    public adwr(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public adwr(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public adwr(java.util.concurrent.CyclicBarrier cyclicBarrier, java.util.concurrent.CountDownLatch countDownLatch, int i) {
        this.c = i;
        this.b = cyclicBarrier;
        this.a = countDownLatch;
    }
}
