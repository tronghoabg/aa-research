package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class ykd implements java.util.Iterator {
    int a;
    int b = -1;
    defpackage.yki c;
    java.util.concurrent.atomic.AtomicReferenceArray d;
    defpackage.yke e;
    defpackage.ylh f;
    defpackage.ylh g;
    final /* synthetic */ defpackage.yli h;

    public ykd(defpackage.yli yliVar) {
        this.h = yliVar;
        this.a = yliVar.d.length - 1;
        b();
    }

    final defpackage.ylh a() {
        defpackage.ylh ylhVar = this.f;
        if (ylhVar == null) {
            throw new java.util.NoSuchElementException();
        }
        this.g = ylhVar;
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
            defpackage.yli yliVar = this.h;
            this.a = i - 1;
            defpackage.yki ykiVar = yliVar.d[i];
            this.c = ykiVar;
            if (ykiVar.b != 0) {
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.c.e;
                this.d = atomicReferenceArray;
                this.b = atomicReferenceArray.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(defpackage.yke ykeVar) {
        boolean z;
        try {
            java.lang.Object objC = ykeVar.c();
            java.lang.Object objD = ykeVar.c() == null ? null : ykeVar.d();
            if (objD != null) {
                this.f = new defpackage.ylh(this.h, objC, objD);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.c.i();
        }
    }

    final boolean d() {
        defpackage.yke ykeVar = this.e;
        if (ykeVar == null) {
            return false;
        }
        while (true) {
            this.e = ykeVar.b();
            defpackage.yke ykeVar2 = this.e;
            if (ykeVar2 == null) {
                return false;
            }
            if (c(ykeVar2)) {
                return true;
            }
            ykeVar = this.e;
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
            defpackage.yke ykeVar = (defpackage.yke) atomicReferenceArray.get(i);
            this.e = ykeVar;
            if (ykeVar != null && (c(ykeVar) || d())) {
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
        defpackage.ysr.bk(this.g != null, "no calls to next() since the last call to remove()");
        this.h.remove(this.g.getKey());
        this.g = null;
    }
}
