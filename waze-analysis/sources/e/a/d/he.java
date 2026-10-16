package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class he implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    final e.a.ai f47078a;

    /* renamed from: b, reason: collision with root package name */
    final double f47079b;

    public he(e.a.ai aiVar, double d2) {
        this.f47078a = aiVar;
        this.f47079b = d2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Double.compare(this.f47079b, ((he) obj).f47079b);
    }
}
