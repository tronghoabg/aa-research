package okhttp3.internal.c;

import e.a.h.ad;
import h.g.b.x;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class p extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final IOException f56049a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f56050b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(IOException iOException) {
        super(iOException);
        x.f(iOException, "firstConnectException");
        this.f56049a = iOException;
        this.f56050b = iOException;
    }

    public final IOException a() {
        return this.f56049a;
    }

    public final IOException b() {
        return this.f56050b;
    }

    public final void c(IOException iOException) {
        x.f(iOException, "e");
        ad.c(this.f56049a, iOException);
        this.f56050b = iOException;
    }
}
