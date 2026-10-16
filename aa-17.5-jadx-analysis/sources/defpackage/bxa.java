package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bxa {
    public final bvd a;
    public final buj b;
    public final Object c;
    public final AtomicReference d = new AtomicReference(bxb.c);
    public long e = Thread.currentThread().getId();
    public final cda f;
    public final bxo g;
    private final bvb h;
    private final bwc i;
    private final afeg j;
    private final boolean k;
    private aap l;

    public bxa(bvd bvdVar, bvb bvbVar, bwc bwcVar, Set set, afeg afegVar, boolean z, buj bujVar, Object obj) {
        this.a = bvdVar;
        this.h = bvbVar;
        this.i = bwcVar;
        this.j = afegVar;
        this.k = z;
        this.b = bujVar;
        this.c = obj;
        aap aapVar = aaq.a;
        aapVar.getClass();
        this.l = aapVar;
        cda cdaVar = new cda();
        cdaVar.h(set, bwcVar.Q());
        this.f = cdaVar;
        this.g = new bxo();
    }

    private final void c() {
        AtomicReference atomicReference = this.d;
        bxb bxbVar = bxb.d;
        bxb bxbVar2 = bxb.f;
        if (a.h(atomicReference, bxbVar, bxbVar2)) {
            return;
        }
        bxc.b(a.bw(bxbVar2, bxbVar, "Unexpected state change from: ", " to: ", "."));
    }

    public final boolean a() {
        return ((bxb) this.d.get()).compareTo(bxb.f) >= 0;
    }

    public final void b(bxw bxwVar) throws Exception {
        try {
            AtomicReference atomicReference = this.d;
            switch (((bxb) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    if (this.k) {
                        this.i.ac();
                    }
                    this.l = this.h.p(this.a, bxwVar, this.j);
                    if (this.k) {
                        this.i.Z();
                    }
                    bxb bxbVar = bxb.c;
                    bxb bxbVar2 = bxb.d;
                    if (!a.h(this.d, bxbVar, bxbVar2)) {
                        bxc.b(a.bw(bxbVar2, bxbVar, "Unexpected state change from: ", " to: ", "."));
                    }
                    if (this.l.b()) {
                        c();
                    }
                    a();
                    return;
                case 3:
                    bxb bxbVar3 = bxb.d;
                    bxb bxbVar4 = bxb.e;
                    if (!a.h(atomicReference, bxbVar3, bxbVar4)) {
                        bxc.b(a.bw(bxbVar4, bxbVar3, "Unexpected state change from: ", " to: ", "."));
                    }
                    long j = this.e;
                    try {
                        this.e = Thread.currentThread().getId();
                        this.l = this.h.q(this.a, bxwVar, this.l);
                        if (this.l.b()) {
                            c();
                        }
                        a();
                        return;
                    } finally {
                        this.e = j;
                        bxb bxbVar5 = bxb.e;
                        bxb bxbVar6 = bxb.d;
                        if (!a.h(this.d, bxbVar5, bxbVar6)) {
                            bxc.b(a.bw(bxbVar6, bxbVar5, "Unexpected state change from: ", " to: ", "."));
                        }
                    }
                case 4:
                    buz.a("Recursive call to resume()");
                    throw new aezp();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new aezs();
            }
        } catch (Exception e) {
            this.d.set(bxb.a);
            throw e;
        }
    }
}
