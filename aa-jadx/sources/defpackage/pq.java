package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pq extends defpackage.ps implements java.util.Iterator {
    final /* synthetic */ defpackage.pt a;
    private defpackage.pp b;
    private boolean c = true;

    public pq(defpackage.pt ptVar) {
        this.a = ptVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.Map.Entry next() {
        if (this.c) {
            this.c = false;
            defpackage.pp ppVar = this.a.a;
            this.b = ppVar;
            return ppVar;
        }
        defpackage.pp ppVar2 = this.b;
        defpackage.pp ppVar3 = ppVar2 != null ? ppVar2.c : null;
        this.b = ppVar3;
        return ppVar3;
    }

    @Override // defpackage.ps
    public final void b(defpackage.pp ppVar) {
        defpackage.pp ppVar2 = this.b;
        if (ppVar == ppVar2) {
            defpackage.pp ppVar3 = ppVar2.d;
            this.b = ppVar3;
            this.c = ppVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.a != null;
        }
        defpackage.pp ppVar = this.b;
        return (ppVar == null || ppVar.c == null) ? false : true;
    }
}
