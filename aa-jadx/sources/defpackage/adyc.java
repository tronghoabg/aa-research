package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adyc implements java.lang.Comparable {
    public final defpackage.adkw a;
    final double b;

    public adyc(defpackage.adkw adkwVar, double d) {
        this.a = adkwVar;
        this.b = d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Double.compare(this.b, ((defpackage.adyc) obj).b);
    }
}
