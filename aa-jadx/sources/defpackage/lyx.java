package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class lyx extends defpackage.lyz {
    final /* synthetic */ defpackage.lza a;

    public lyx(defpackage.lza lzaVar) {
        this.a = lzaVar;
    }

    @Override // defpackage.lyz
    protected final boolean a() {
        return this.a.a;
    }

    @Override // defpackage.lyz
    protected final void b(boolean z) {
        int i = defpackage.lza.e;
        java.util.Set set = this.a.b;
        set.size();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ((defpackage.lyu) it.next()).b();
        }
    }
}
