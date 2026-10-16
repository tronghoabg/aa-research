package defpackage;

/* loaded from: classes3.dex */
public final class acaa implements Comparable {
    public int a = -1;
    public double b = -1.0d;
    private final /* synthetic */ int c;

    public acaa(int i) {
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.c != 0 ? Double.valueOf(this.b).compareTo(Double.valueOf(((acaa) obj).b)) : Double.valueOf(this.b).compareTo(Double.valueOf(((acaa) obj).b));
    }
}
