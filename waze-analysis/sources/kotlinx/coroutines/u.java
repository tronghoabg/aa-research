package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f52067a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.a f52068b;

    public u(Throwable th, boolean z) {
        this.f52067a = th;
        this.f52068b = h.e.b.e(z);
    }

    public final boolean b() {
        return this.f52068b.c();
    }

    public final boolean c() {
        return this.f52068b.b(false, true);
    }

    public final String toString() {
        return aj.a(this) + "[" + this.f52067a + "]";
    }

    public /* synthetic */ u(Throwable th) {
        this(th, false);
    }
}
