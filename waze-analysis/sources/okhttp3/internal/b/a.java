package okhttp3.internal.b;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f55962a;

    /* renamed from: b, reason: collision with root package name */
    private c f55963b;

    /* renamed from: c, reason: collision with root package name */
    private long f55964c;

    public a(String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f55962a = str;
        this.f55964c = -1L;
    }

    public final long a() {
        return this.f55964c;
    }

    public abstract long b();

    public final String c() {
        return this.f55962a;
    }

    public final c d() {
        return this.f55963b;
    }

    public final void e(c cVar) {
        x.f(cVar, "queue");
        c cVar2 = this.f55963b;
        if (cVar2 == cVar) {
            return;
        }
        if (cVar2 != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f55963b = cVar;
    }

    public final void f(long j2) {
        this.f55964c = j2;
    }

    public final String toString() {
        return this.f55962a;
    }
}
