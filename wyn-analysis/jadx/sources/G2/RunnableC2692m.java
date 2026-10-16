package g2;

import android.os.Handler;
import java.io.Closeable;
import l8.j0;

/* renamed from: g2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2692m implements Runnable, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f35624a = Q1.x.m(null);

    /* renamed from: b, reason: collision with root package name */
    public final long f35625b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35626c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2693n f35627d;

    public RunnableC2692m(C2693n c2693n, long j8) {
        this.f35627d = c2693n;
        this.f35625b = j8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35626c = false;
        this.f35624a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        C2693n c2693n = this.f35627d;
        E4.n nVar = c2693n.f35634g;
        nVar.y(nVar.k(4, c2693n.k, j0.f40119g, c2693n.f35635h));
        this.f35624a.postDelayed(this, this.f35625b);
    }
}
