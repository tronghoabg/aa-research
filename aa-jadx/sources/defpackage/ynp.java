package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ynp extends defpackage.ybw {
    final java.util.Iterator a;
    final /* synthetic */ java.util.Set b;
    final /* synthetic */ java.util.Set c;

    public ynp(java.util.Set set, java.util.Set set2) {
        this.b = set;
        this.c = set2;
        this.a = set.iterator();
    }

    @Override // defpackage.ybw
    protected final java.lang.Object a() {
        java.util.Set set;
        java.lang.Object next;
        do {
            java.util.Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            set = this.c;
            next = it.next();
        } while (set.contains(next));
        return next;
    }
}
