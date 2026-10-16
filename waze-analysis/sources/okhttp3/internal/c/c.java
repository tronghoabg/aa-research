package okhttp3.internal.c;

import h.g.b.x;
import java.io.IOException;
import java.net.ProtocolException;
import k.al;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class c extends k.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f55988a;

    /* renamed from: b, reason: collision with root package name */
    private final long f55989b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f55990c;

    /* renamed from: d, reason: collision with root package name */
    private long f55991d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f55992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, al alVar, long j2) {
        super(alVar);
        x.f(alVar, "delegate");
        this.f55988a = eVar;
        this.f55989b = j2;
    }

    private final IOException a(IOException iOException) {
        if (this.f55990c) {
            return iOException;
        }
        this.f55990c = true;
        return this.f55988a.q(false, true, iOException);
    }

    @Override // k.q, k.al, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f55992e) {
            return;
        }
        this.f55992e = true;
        long j2 = this.f55989b;
        if (j2 != -1 && this.f55991d != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
        } catch (IOException e2) {
            throw a(e2);
        }
    }

    @Override // k.q, k.al, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e2) {
            throw a(e2);
        }
    }

    @Override // k.q, k.al
    public final void l(k.h hVar, long j2) throws IOException {
        x.f(hVar, "source");
        if (this.f55992e) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f55989b;
        if (j3 == -1 || this.f55991d + j2 <= j3) {
            try {
                super.l(hVar, j2);
                this.f55991d += j2;
                return;
            } catch (IOException e2) {
                throw a(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.f55991d + j2));
    }
}
