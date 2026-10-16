package q6;

/* loaded from: classes3.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f44160a;

    /* renamed from: b, reason: collision with root package name */
    public final C3875b f44161b;

    public g(int i5, C3875b c3875b) {
        this.f44160a = i5;
        this.f44161b = c3875b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f44160a, ((g) obj).f44160a);
    }
}
