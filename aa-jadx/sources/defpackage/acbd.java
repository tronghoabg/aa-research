package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acbd implements java.lang.Comparable {
    public int a = -1;
    public double b = -1.0d;
    private final /* synthetic */ int c;

    public acbd(int i) {
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.c != 0 ? java.lang.Double.valueOf(this.b).compareTo(java.lang.Double.valueOf(((defpackage.acbd) obj).b)) : java.lang.Double.valueOf(this.b).compareTo(java.lang.Double.valueOf(((defpackage.acbd) obj).b));
    }
}
