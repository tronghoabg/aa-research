package k;

import androidx.media3.common.video.Frame;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c implements al {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f50826a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ al f50827b;

    c(e eVar, al alVar) {
        this.f50826a = eVar;
        this.f50827b = alVar;
    }

    @Override // k.al, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        e eVar = this.f50826a;
        eVar.l();
        try {
            this.f50827b.close();
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

    @Override // k.al, java.io.Flushable
    public final void flush() throws IOException {
        e eVar = this.f50826a;
        eVar.l();
        try {
            this.f50827b.flush();
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

    @Override // k.al
    public final /* synthetic */ ao h() {
        return this.f50826a;
    }

    @Override // k.al
    public final void l(h hVar, long j2) throws IOException {
        h.g.b.x.f(hVar, "source");
        okhttp3.internal.publicsuffix.a.g(hVar.q(), 0L, j2);
        while (true) {
            long j3 = 0;
            if (j2 <= 0) {
                return;
            }
            ai aiVar = hVar.f50841a;
            h.g.b.x.c(aiVar);
            while (true) {
                if (j3 >= Frame.USAGE_VIDEO_ENCODE) {
                    break;
                }
                j3 += aiVar.f50808c - aiVar.f50807b;
                if (j3 >= j2) {
                    j3 = j2;
                    break;
                } else {
                    aiVar = aiVar.f50811f;
                    h.g.b.x.c(aiVar);
                }
            }
            e eVar = this.f50826a;
            al alVar = this.f50827b;
            eVar.l();
            try {
                try {
                    alVar.l(hVar, j3);
                    if (eVar.m()) {
                        throw eVar.g(null);
                    }
                    j2 -= j3;
                } catch (IOException e2) {
                    IOException iOExceptionG = e2;
                    if (eVar.m()) {
                        iOExceptionG = eVar.g(iOExceptionG);
                    }
                    throw iOExceptionG;
                }
            } catch (Throwable th) {
                eVar.m();
                throw th;
            }
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f50827b + ")";
    }
}
