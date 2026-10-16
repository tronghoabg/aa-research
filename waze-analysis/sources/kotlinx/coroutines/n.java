package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class n extends u {

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.a f52059b;

    public n(h.c.e eVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + eVar + " was cancelled normally");
        }
        super(th, z);
        this.f52059b = h.e.b.e(false);
    }

    public final boolean a() {
        return this.f52059b.b(false, true);
    }
}
