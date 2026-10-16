package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adyt implements java.lang.Runnable {
    final /* synthetic */ java.util.Collection a;
    final /* synthetic */ defpackage.adzg b;
    final /* synthetic */ boolean c;
    final /* synthetic */ java.util.concurrent.Future d;
    final /* synthetic */ boolean e;
    final /* synthetic */ java.util.concurrent.Future f;
    final /* synthetic */ defpackage.adzi g;

    public adyt(defpackage.adzi adziVar, java.util.Collection collection, defpackage.adzg adzgVar, boolean z, java.util.concurrent.Future future, boolean z2, java.util.concurrent.Future future2) {
        this.a = collection;
        this.b = adzgVar;
        this.c = z;
        this.d = future;
        this.e = z2;
        this.f = future2;
        this.g = adziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.ador adorVar;
        for (defpackage.adzg adzgVar : this.a) {
            if (adzgVar != this.b) {
                adzgVar.a.c(defpackage.adzi.c);
            }
        }
        if (this.c) {
            java.util.concurrent.Future future = this.d;
            if (future != null) {
                future.cancel(false);
            }
            if (!this.e) {
                defpackage.adzi adziVar = this.g;
                if (adziVar.u.decrementAndGet() == Integer.MIN_VALUE) {
                    adziVar.h.execute(new adxw(this, 6));
                }
            }
        }
        java.util.concurrent.Future future2 = this.f;
        if (future2 != null) {
            future2.cancel(false);
        }
        defpackage.adzi adziVar2 = this.g;
        defpackage.adwv adwvVar = adziVar2.E.b.y;
        synchronized (adwvVar.a) {
            adwvVar.b.remove(adziVar2);
            if (adwvVar.b.isEmpty()) {
                adorVar = adwvVar.c;
                adwvVar.b = new java.util.HashSet();
            } else {
                adorVar = null;
            }
        }
        if (adorVar != null) {
            adwvVar.d.x.q(adorVar);
        }
    }
}
