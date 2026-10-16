package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
abstract class yix implements Iterator {
    int a;
    int b = -1;
    yjc c;
    AtomicReferenceArray d;
    yiy e;
    ykb f;
    ykb g;
    final /* synthetic */ ykc h;

    public yix(ykc ykcVar) {
        this.h = ykcVar;
        this.a = ykcVar.d.length - 1;
        b();
    }

    final ykb a() {
        ykb ykbVar = this.f;
        if (ykbVar == null) {
            throw new NoSuchElementException();
        }
        this.g = ykbVar;
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
            ykc ykcVar = this.h;
            this.a = i - 1;
            yjc yjcVar = ykcVar.d[i];
            this.c = yjcVar;
            if (yjcVar.b != 0) {
                this.d = this.c.e;
                this.b = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(yiy yiyVar) {
        boolean z;
        try {
            Object objC = yiyVar.c();
            Object objD = yiyVar.c() == null ? null : yiyVar.d();
            if (objD != null) {
                this.f = new ykb(this.h, objC, objD);
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
        yiy yiyVar = this.e;
        if (yiyVar == null) {
            return false;
        }
        while (true) {
            this.e = yiyVar.b();
            yiy yiyVar2 = this.e;
            if (yiyVar2 == null) {
                return false;
            }
            if (c(yiyVar2)) {
                return true;
            }
            yiyVar = this.e;
        }
    }

    final boolean e() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            yiy yiyVar = (yiy) atomicReferenceArray.get(i);
            this.e = yiyVar;
            if (yiyVar != null && (c(yiyVar) || d())) {
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
        woy.aa(this.g != null, "no calls to next() since the last call to remove()");
        this.h.remove(this.g.getKey());
        this.g = null;
    }
}
