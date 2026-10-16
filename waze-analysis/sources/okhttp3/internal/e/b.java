package okhttp3.internal.e;

import h.g.b.x;
import k.al;
import k.ao;
import k.h;
import k.s;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class b implements al {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f56081a;

    /* renamed from: b, reason: collision with root package name */
    private final s f56082b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f56083c;

    public b(g gVar) {
        this.f56081a = gVar;
        this.f56082b = new s(gVar.f56097d.h());
    }

    @Override // k.al, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f56083c) {
            return;
        }
        this.f56083c = true;
        g gVar = this.f56081a;
        gVar.f56097d.E("0\r\n\r\n");
        g.s(this.f56082b);
        gVar.f56098e = 3;
    }

    @Override // k.al, java.io.Flushable
    public final synchronized void flush() {
        if (this.f56083c) {
            return;
        }
        this.f56081a.f56097d.flush();
    }

    @Override // k.al
    public final ao h() {
        return this.f56082b;
    }

    @Override // k.al
    public final void l(h hVar, long j2) {
        x.f(hVar, "source");
        if (this.f56083c) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        g gVar = this.f56081a;
        gVar.f56097d.af(j2);
        gVar.f56097d.E("\r\n");
        gVar.f56097d.l(hVar, j2);
        gVar.f56097d.E("\r\n");
    }
}
