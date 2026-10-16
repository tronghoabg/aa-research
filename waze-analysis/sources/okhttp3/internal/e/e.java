package okhttp3.internal.e;

import h.g.b.x;
import k.al;
import k.ao;
import k.h;
import k.s;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class e implements al {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f56090a;

    /* renamed from: b, reason: collision with root package name */
    private final s f56091b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f56092c;

    public e(g gVar) {
        this.f56090a = gVar;
        this.f56091b = new s(gVar.f56097d.h());
    }

    @Override // k.al, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f56092c) {
            return;
        }
        this.f56092c = true;
        g gVar = this.f56090a;
        g.s(this.f56091b);
        gVar.f56098e = 3;
    }

    @Override // k.al, java.io.Flushable
    public final void flush() {
        if (this.f56092c) {
            return;
        }
        this.f56090a.f56097d.flush();
    }

    @Override // k.al
    public final ao h() {
        return this.f56091b;
    }

    @Override // k.al
    public final void l(h hVar, long j2) {
        x.f(hVar, "source");
        if (this.f56092c) {
            throw new IllegalStateException("closed");
        }
        okhttp3.internal.b.D(hVar.q(), j2);
        this.f56090a.f56097d.l(hVar, j2);
    }
}
