package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ykx extends defpackage.yki {
    public final java.lang.ref.ReferenceQueue g;

    public ykx(defpackage.yli yliVar, int i) {
        super(yliVar, i);
        this.g = new java.lang.ref.ReferenceQueue();
    }

    @Override // defpackage.yki
    public final void g() {
        n(this.g);
    }

    @Override // defpackage.yki
    public final void h() {
        e(this.g);
    }
}
