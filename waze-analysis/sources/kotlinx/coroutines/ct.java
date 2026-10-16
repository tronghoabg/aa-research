package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ct implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final ab f51816a;

    /* renamed from: b, reason: collision with root package name */
    private final k f51817b;

    public ct(ab abVar, k kVar) {
        this.f51816a = abVar;
        this.f51817b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f51817b.e(this.f51816a, h.ab.f48028a);
    }
}
