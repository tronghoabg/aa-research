package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaat extends defpackage.aaaf {
    @Override // defpackage.aaaf
    protected final void b(defpackage.aaak aaakVar) {
        this.b.b(aaakVar, true);
    }

    @Override // defpackage.aaaf
    protected final boolean c(defpackage.aaak aaakVar) {
        return this.b.d(aaakVar, true);
    }

    @Override // defpackage.aaaf
    public final boolean d() {
        return true;
    }

    @Override // defpackage.aaaf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aaaf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.aaaf
    protected final boolean g(defpackage.aaak aaakVar) {
        return this.b.c(aaakVar, true);
    }

    @Override // defpackage.aaaf
    public final int h(long j, java.util.LinkedList linkedList, java.util.List list) {
        defpackage.sg sgVar;
        defpackage.sg sgVar2;
        java.util.Iterator it = linkedList.iterator();
        do {
            sgVar = null;
            if (!it.hasNext()) {
                sgVar2 = null;
                break;
            }
            sgVar2 = (defpackage.sg) it.next();
        } while (sgVar2.k() != 2);
        java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            defpackage.sg sgVar3 = (defpackage.sg) listIterator.previous();
            if (sgVar3.k() == 2) {
                sgVar = sgVar3;
                break;
            }
        }
        if (sgVar2 == null || sgVar == null || sgVar.l() - j > 300) {
            return 1;
        }
        return java.lang.Math.max(java.lang.Math.max(java.lang.Math.abs(sgVar.g(0) - sgVar2.g(0)) / sgVar.h(), java.lang.Math.abs(sgVar.i(0) - sgVar2.i(0)) / sgVar.j()), java.lang.Math.max(java.lang.Math.abs(sgVar.g(1) - sgVar2.g(1)) / sgVar.h(), java.lang.Math.abs(sgVar.i(1) - sgVar2.i(1)) / sgVar.j())) > 0.125f ? 1 : 3;
    }
}
