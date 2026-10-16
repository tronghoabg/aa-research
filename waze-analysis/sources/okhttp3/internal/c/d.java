package okhttp3.internal.c;

import h.g.b.x;
import java.io.IOException;
import java.net.ProtocolException;
import k.am;
import k.r;
import okhttp3.w;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d extends r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f55993a;

    /* renamed from: b, reason: collision with root package name */
    private final long f55994b;

    /* renamed from: c, reason: collision with root package name */
    private long f55995c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55996d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f55997e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f55998f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, am amVar, long j2) {
        super(amVar);
        x.f(amVar, "delegate");
        this.f55993a = eVar;
        this.f55994b = j2;
        this.f55996d = true;
        if (j2 == 0) {
            b(null);
        }
    }

    @Override // k.r, k.am
    public final long a(k.h hVar, long j2) throws IOException {
        x.f(hVar, "sink");
        if (this.f55998f) {
            throw new IllegalStateException("closed");
        }
        try {
            long jA = c().a(hVar, j2);
            if (this.f55996d) {
                this.f55996d = false;
                w.e(this.f55993a.d());
            }
            if (jA == -1) {
                b(null);
                return -1L;
            }
            long j3 = this.f55995c + jA;
            long j4 = this.f55994b;
            if (j4 != -1 && j3 > j4) {
                throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
            }
            this.f55995c = j3;
            if (j3 == j4) {
                b(null);
            }
            return jA;
        } catch (IOException e2) {
            throw b(e2);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f55997e) {
            return iOException;
        }
        this.f55997e = true;
        if (iOException == null && this.f55996d) {
            this.f55996d = false;
            w.e(this.f55993a.d());
        }
        return this.f55993a.q(true, false, iOException);
    }

    @Override // k.r, k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f55998f) {
            return;
        }
        this.f55998f = true;
        try {
            super.close();
        } catch (IOException e2) {
            throw b(e2);
        }
    }
}
