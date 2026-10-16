package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aist implements java.lang.Iterable, defpackage.afhc {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public aist(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aisp, java.lang.Object] */
    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        int i = this.b;
        ?? r1 = this.a;
        return i != 0 ? defpackage.affz.c((java.lang.Object[]) r1) : r1.a();
    }
}
