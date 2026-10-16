package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class xzb implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence a;
    final /* synthetic */ defpackage.xzd b;

    public xzb(defpackage.xzd xzdVar, java.lang.CharSequence charSequence) {
        this.a = charSequence;
        this.b = xzdVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.String> iterator() {
        return this.b.h(this.a);
    }

    public final java.lang.String toString() {
        defpackage.xyj xyjVar = new defpackage.xyj(", ");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('[');
        xyjVar.g(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
