package kotlinx.coroutines.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends kotlinx.coroutines.e.e {

    /* renamed from: b, reason: collision with root package name */
    private final e.a.f.a.e f52048b;

    public o(long j2, o oVar, int i2) {
        super(j2, oVar, i2);
        this.f52048b = new e.a.f.a.e(n.f52047g);
    }

    @Override // kotlinx.coroutines.e.e
    public final int a() {
        return n.f52047g;
    }

    public final e.a.f.a.e b() {
        return this.f52048b;
    }

    @Override // kotlinx.coroutines.e.e
    public final void l(int i2, h.c.j jVar) {
        e.a.f.a.e eVar = this.f52048b;
        eVar.d(i2).d(n.f52046f);
        u();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f51893a + ", hashCode=" + hashCode() + "]";
    }
}
