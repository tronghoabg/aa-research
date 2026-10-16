package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class bv extends kotlinx.coroutines.b.a.d<bt<?>> {

    /* renamed from: a, reason: collision with root package name */
    public long f51617a = -1;

    /* renamed from: b, reason: collision with root package name */
    public h.c.e f51618b;

    @Override // kotlinx.coroutines.b.a.d
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        bt btVar = (bt) obj;
        if (this.f51617a >= 0) {
            return false;
        }
        this.f51617a = btVar.e();
        return true;
    }

    @Override // kotlinx.coroutines.b.a.d
    public final /* bridge */ /* synthetic */ h.c.e[] b(Object obj) {
        int i2 = kotlinx.coroutines.ai.f51347a;
        long j2 = this.f51617a;
        this.f51617a = -1L;
        this.f51618b = null;
        return ((bt) obj).j(j2);
    }
}
