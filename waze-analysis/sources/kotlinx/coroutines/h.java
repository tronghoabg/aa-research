package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class h extends bf {

    /* renamed from: b, reason: collision with root package name */
    private final Thread f52016b;

    public h(Thread thread) {
        this.f52016b = thread;
    }

    @Override // kotlinx.coroutines.ba
    protected final Thread a() {
        return this.f52016b;
    }
}
