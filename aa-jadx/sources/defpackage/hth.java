package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hth extends java.io.ByteArrayOutputStream {
    final /* synthetic */ defpackage.hti a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hth(defpackage.hti htiVar, int i) {
        super(i);
        this.a = htiVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final java.lang.String toString() {
        try {
            return new java.lang.String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, this.a.a.name());
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
