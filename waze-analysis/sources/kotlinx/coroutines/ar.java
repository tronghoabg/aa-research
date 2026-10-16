package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f51366a;

    public ar(Throwable th, ab abVar, h.c.j jVar) {
        super("Coroutine dispatcher " + abVar + " threw an exception, context = " + jVar, th);
        this.f51366a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f51366a;
    }
}
