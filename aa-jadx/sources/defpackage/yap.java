package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class yap implements java.util.Iterator {
    int a;
    int b = -1;
    defpackage.yaz c;
    java.util.concurrent.atomic.AtomicReferenceArray d;
    defpackage.ybu e;
    defpackage.ybs f;
    defpackage.ybs g;
    final /* synthetic */ defpackage.ybt h;

    public yap(defpackage.ybt ybtVar) {
        this.h = ybtVar;
        this.a = ybtVar.f.length - 1;
        b();
    }

    final defpackage.ybs a() {
        defpackage.ybs ybsVar = this.f;
        if (ybsVar == null) {
            throw new java.util.NoSuchElementException();
        }
        this.g = ybsVar;
        b();
        return this.g;
    }

    final void b() {
        this.f = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i < 0) {
                return;
            }
            defpackage.ybt ybtVar = this.h;
            this.a = i - 1;
            defpackage.yaz yazVar = ybtVar.f[i];
            this.c = yazVar;
            if (yazVar.b != 0) {
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.c.f;
                this.d = atomicReferenceArray;
                this.b = atomicReferenceArray.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(defpackage.ybu ybuVar) {
        java.lang.Object obj;
        boolean z;
        try {
            defpackage.ybt ybtVar = this.h;
            long jB = ybtVar.p.b();
            java.lang.Object objJ = ybuVar.j();
            java.lang.Object obj2 = null;
            if (ybuVar.j() != null && (obj = ybuVar.d().get()) != null && !ybtVar.l(ybuVar, jB)) {
                obj2 = obj;
            }
            if (obj2 != null) {
                this.f = new defpackage.ybs(ybtVar, objJ, obj2);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.c.n();
        }
    }

    final boolean d() {
        defpackage.ybu ybuVar = this.e;
        if (ybuVar == null) {
            return false;
        }
        while (true) {
            this.e = ybuVar.e();
            defpackage.ybu ybuVar2 = this.e;
            if (ybuVar2 == null) {
                return false;
            }
            if (c(ybuVar2)) {
                return true;
            }
            ybuVar = this.e;
        }
    }

    final boolean e() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            defpackage.ybu ybuVar = (defpackage.ybu) atomicReferenceArray.get(i);
            this.e = ybuVar;
            if (ybuVar != null && (c(ybuVar) || d())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        defpackage.ysr.bj(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
