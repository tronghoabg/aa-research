package kotlinx.coroutines.f;

import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f51966a;

    public j(Runnable runnable, long j2, boolean z) {
        super(j2, z);
        this.f51966a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f51966a.run();
    }

    public final String toString() {
        Runnable runnable = this.f51966a;
        String strA = aj.a(runnable);
        String strB = aj.b(runnable);
        long j2 = this.f51964f;
        boolean z = this.f51965g;
        String str = k.f51967a;
        return "Task[" + strA + "@" + strB + ", " + j2 + ", " + (true != z ? "Non-blocking" : "Blocking") + "]";
    }
}
