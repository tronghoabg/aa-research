package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vqc implements defpackage.vqe {
    private final defpackage.ajhv a;
    private final java.lang.Comparable b;

    public vqc(defpackage.ajhv ajhvVar, java.lang.Comparable comparable) {
        this.a = ajhvVar;
        this.b = comparable;
    }

    @Override // defpackage.vqe
    public final long a() {
        return this.a.e(null);
    }

    @Override // defpackage.vqe
    public final /* synthetic */ java.lang.Object b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.b.compareTo(((defpackage.vqc) obj).b);
    }
}
