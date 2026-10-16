package X2;

/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f16057a;

    /* renamed from: b, reason: collision with root package name */
    public final c f16058b;

    public g(int i5, c cVar) {
        this.f16057a = i5;
        this.f16058b = cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16057a, ((g) obj).f16057a);
    }
}
