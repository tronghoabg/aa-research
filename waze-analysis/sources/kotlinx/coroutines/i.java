package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f52049a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f52050b;

    public i(Object obj, int i2) {
        this.f52049a = i2;
        this.f52050b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Future, kotlinx.coroutines.ax] */
    @Override // kotlinx.coroutines.j
    public final void b(Throwable th) {
        int i2 = this.f52049a;
        if (i2 == 0) {
            this.f52050b.invoke(th);
            return;
        }
        ?? r1 = this.f52050b;
        if (i2 != 1) {
            r1.dispose();
        } else {
            r1.cancel(false);
        }
    }

    public final String toString() {
        int i2 = this.f52049a;
        if (i2 == 0) {
            return "CancelHandler.UserSupplied[" + aj.a(this.f52050b) + "@" + aj.b(this) + "]";
        }
        Object obj = this.f52050b;
        if (i2 != 1) {
            return "DisposeOnCancel[" + obj + "]";
        }
        return "CancelFutureOnCancel[" + obj + "]";
    }
}
