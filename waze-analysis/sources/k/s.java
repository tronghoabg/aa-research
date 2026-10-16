package k;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class s extends ao {

    /* renamed from: a, reason: collision with root package name */
    private ao f50867a;

    public s(ao aoVar) {
        h.g.b.x.f(aoVar, "delegate");
        this.f50867a = aoVar;
    }

    public final ao e() {
        return this.f50867a;
    }

    public final void i(ao aoVar) {
        h.g.b.x.f(aoVar, "delegate");
        this.f50867a = aoVar;
    }

    @Override // k.ao
    public final long q() {
        return this.f50867a.q();
    }

    @Override // k.ao
    public final ao r() {
        return this.f50867a.r();
    }

    @Override // k.ao
    public final ao s(long j2) {
        return this.f50867a.s(j2);
    }

    @Override // k.ao
    public final ao t(long j2, TimeUnit timeUnit) {
        h.g.b.x.f(timeUnit, "unit");
        return this.f50867a.t(j2, timeUnit);
    }

    @Override // k.ao
    public final void u() throws InterruptedIOException {
        this.f50867a.u();
    }

    @Override // k.ao
    public final boolean v() {
        return this.f50867a.v();
    }

    @Override // k.ao
    public final ao w() {
        return this.f50867a.w();
    }
}
