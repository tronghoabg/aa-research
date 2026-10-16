package k;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d implements am {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f50828a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f50829b;

    d(e eVar, am amVar) {
        this.f50828a = eVar;
        this.f50829b = amVar;
    }

    @Override // k.am
    public final long a(h hVar, long j2) throws IOException {
        h.g.b.x.f(hVar, "sink");
        e eVar = this.f50828a;
        eVar.l();
        try {
            long jA = this.f50829b.a(hVar, j2);
            if (eVar.m()) {
                throw eVar.g(null);
            }
            return jA;
        } catch (IOException e2) {
            e = e2;
            if (eVar.m()) {
                e = eVar.g(e);
            }
            throw e;
        } finally {
            eVar.m();
        }
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        e eVar = this.f50828a;
        eVar.l();
        try {
            this.f50829b.close();
            if (eVar.m()) {
                throw eVar.g(null);
            }
        } catch (IOException e2) {
            e = e2;
            if (eVar.m()) {
                e = eVar.g(e);
            }
            throw e;
        } finally {
            eVar.m();
        }
    }

    @Override // k.am
    public final /* synthetic */ ao h() {
        return this.f50828a;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f50829b + ")";
    }
}
