package okhttp3.internal.e;

import h.g.b.x;
import java.util.concurrent.TimeUnit;
import okhttp3.ab;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f56084b;

    /* renamed from: c, reason: collision with root package name */
    private final ab f56085c;

    /* renamed from: d, reason: collision with root package name */
    private long f56086d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f56087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, ab abVar) {
        super(gVar);
        x.f(abVar, "url");
        this.f56084b = gVar;
        this.f56085c = abVar;
        this.f56086d = -1L;
        this.f56087e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (r9.f56087e != false) goto L28;
     */
    @Override // okhttp3.internal.e.a, k.am
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(k.h r10, long r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.c.a(k.h, long):long");
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (c()) {
            return;
        }
        if (this.f56087e && !okhttp3.internal.b.F(this, TimeUnit.MILLISECONDS)) {
            this.f56084b.c().l();
            b();
        }
        d();
    }
}
