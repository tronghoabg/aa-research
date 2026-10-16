package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
abstract class xzj implements Iterator {
    int a;
    int b = -1;
    xzt c;
    AtomicReferenceArray d;
    yao e;
    yam f;
    yam g;
    final /* synthetic */ yan h;

    public xzj(yan yanVar) {
        this.h = yanVar;
        this.a = yanVar.f.length - 1;
        b();
    }

    final yam a() {
        yam yamVar = this.f;
        if (yamVar == null) {
            throw new NoSuchElementException();
        }
        this.g = yamVar;
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
            yan yanVar = this.h;
            this.a = i - 1;
            xzt xztVar = yanVar.f[i];
            this.c = xztVar;
            if (xztVar.b != 0) {
                this.d = this.c.f;
                this.b = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(yao yaoVar) {
        Object obj;
        boolean z;
        try {
            yan yanVar = this.h;
            long jB = yanVar.p.b();
            Object objJ = yaoVar.j();
            Object obj2 = null;
            if (yaoVar.j() != null && (obj = yaoVar.d().get()) != null && !yanVar.l(yaoVar, jB)) {
                obj2 = obj;
            }
            if (obj2 != null) {
                this.f = new yam(yanVar, objJ, obj2);
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
        yao yaoVar = this.e;
        if (yaoVar == null) {
            return false;
        }
        while (true) {
            this.e = yaoVar.e();
            yao yaoVar2 = this.e;
            if (yaoVar2 == null) {
                return false;
            }
            if (c(yaoVar2)) {
                return true;
            }
            yaoVar = this.e;
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
            yao yaoVar = (yao) atomicReferenceArray.get(i);
            this.e = yaoVar;
            if (yaoVar != null && (c(yaoVar) || d())) {
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
        woy.Z(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
