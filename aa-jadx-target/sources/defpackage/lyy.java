package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lyy extends defpackage.lyz {
    final /* synthetic */ defpackage.lza a;

    public lyy(defpackage.lza lzaVar) {
        this.a = lzaVar;
    }

    @Override // defpackage.lyz
    protected final boolean a() {
        return this.a.h();
    }

    @Override // defpackage.lyz
    protected final void b(boolean z) {
        int i = defpackage.lza.e;
        java.util.Set set = this.a.b;
        set.size();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lyu) it.next()).a(z);
        }
    }
}
