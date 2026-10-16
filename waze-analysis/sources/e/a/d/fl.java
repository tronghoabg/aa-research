package e.a.d;

import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fl extends e.a.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fp f46934a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f46935b;

    /* renamed from: c, reason: collision with root package name */
    private final String f46936c;

    /* renamed from: d, reason: collision with root package name */
    private final e.a.i f46937d;

    /* synthetic */ fl(fp fpVar, String str) {
        Objects.requireNonNull(fpVar);
        this.f46934a = fpVar;
        this.f46935b = new AtomicReference(fp.f46948g);
        this.f46937d = new fe(this);
        com.google.d.b.an.C(str, "authority");
        this.f46936c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.a.k h(e.a.cq cqVar, e.a.h hVar) {
        e.a.aw awVar = (e.a.aw) this.f46935b.get();
        if (awVar == null) {
            return this.f46937d.a(cqVar, hVar);
        }
        if (!(awVar instanceof gb)) {
            return new ev(awVar, this.f46937d, this.f46934a.r, cqVar, hVar);
        }
        ga gaVarB = ((gb) awVar).f47002b.b(cqVar);
        if (gaVarB != null) {
            hVar = hVar.i(ga.f46995a, gaVarB);
        }
        return this.f46937d.a(cqVar, hVar);
    }

    @Override // e.a.i
    public final e.a.k a(e.a.cq cqVar, e.a.h hVar) {
        AtomicReference atomicReference = this.f46935b;
        if (atomicReference.get() != fp.f46948g) {
            return h(cqVar, hVar);
        }
        fp fpVar = this.f46934a;
        ff ffVar = new ff(this);
        e.a.el elVar = fpVar.f46951d;
        elVar.execute(ffVar);
        if (atomicReference.get() != fp.f46948g) {
            return h(cqVar, hVar);
        }
        if (fpVar.M.get()) {
            return new fg(this);
        }
        fk fkVar = new fk(this, e.a.ac.g(), cqVar, hVar);
        elVar.execute(new fh(this, fkVar));
        return fkVar;
    }

    @Override // e.a.i
    public final String b() {
        return this.f46936c;
    }

    final void f() {
        if (this.f46935b.get() == fp.f46948g) {
            fp fpVar = this.f46934a;
            if (fpVar.X == null) {
                g(null);
                return;
            }
            g(fpVar.X.a());
            fpVar.W = fpVar.X;
            fpVar.T.a(4, "Initial Name Resolution error, using default service config");
        }
    }

    final void g(e.a.aw awVar) {
        AtomicReference atomicReference = this.f46935b;
        e.a.aw awVar2 = (e.a.aw) atomicReference.get();
        atomicReference.set(awVar);
        if (awVar2 == fp.f46948g) {
            fp fpVar = this.f46934a;
            if (fpVar.I != null) {
                Iterator it = fpVar.I.iterator();
                while (it.hasNext()) {
                    ((fk) it.next()).o();
                }
            }
        }
    }
}
