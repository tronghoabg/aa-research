package defpackage;

/* loaded from: classes3.dex */
public final class adxa implements Comparable {
    public final adjv a;
    final double b;

    public adxa(adjv adjvVar, double d) {
        this.a = adjvVar;
        this.b = d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Double.compare(this.b, ((adxa) obj).b);
    }
}
