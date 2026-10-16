package e.a.h;

import com.google.d.b.an;
import e.a.dt;
import e.a.h.e;
import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class e<S extends e<S>> {
    private final e.a.h callOptions;
    private final e.a.i channel;

    protected e(e.a.i iVar, e.a.h hVar) {
        an.C(iVar, "channel");
        this.channel = iVar;
        an.C(hVar, "callOptions");
        this.callOptions = hVar;
    }

    public static <T extends e<T>> T newStub(d<T> dVar, e.a.i iVar) {
        return (T) newStub(dVar, iVar, e.a.h.f47759a);
    }

    protected abstract S build(e.a.i iVar, e.a.h hVar);

    public final e.a.h getCallOptions() {
        return this.callOptions;
    }

    public final e.a.i getChannel() {
        return this.channel;
    }

    public final S withCallCredentials(e.a.e eVar) {
        return (S) build(this.channel, this.callOptions.b(eVar));
    }

    @Deprecated
    public final S withChannel(e.a.i iVar) {
        return (S) build(iVar, this.callOptions);
    }

    public final S withCompression(String str) {
        return (S) build(this.channel, this.callOptions.c(str));
    }

    public final S withDeadline(e.a.ad adVar) {
        return (S) build(this.channel, this.callOptions.d(adVar));
    }

    public final S withDeadlineAfter(long j2, TimeUnit timeUnit) {
        return (S) build(this.channel, this.callOptions.d(e.a.ad.c(j2, timeUnit)));
    }

    public final S withExecutor(Executor executor) {
        return (S) build(this.channel, this.callOptions.e(executor));
    }

    public final S withInterceptors(e.a.l... lVarArr) {
        return (S) build(dt.r(this.channel, lVarArr), this.callOptions);
    }

    public final S withMaxInboundMessageSize(int i2) {
        return (S) build(this.channel, this.callOptions.f(i2));
    }

    public final S withMaxOutboundMessageSize(int i2) {
        return (S) build(this.channel, this.callOptions.g(i2));
    }

    public final S withOnReadyThreshold(int i2) {
        return (S) build(this.channel, this.callOptions.h(i2));
    }

    public final <T> S withOption(e.a.g<T> gVar, T t) {
        return (S) build(this.channel, this.callOptions.i(gVar, t));
    }

    public final S withWaitForReady() {
        return (S) build(this.channel, this.callOptions.j());
    }

    public static <T extends e<T>> T newStub(d<T> dVar, e.a.i iVar, e.a.h hVar) {
        return (T) dVar.newStub(iVar, hVar);
    }

    public final S withDeadlineAfter(Duration duration) {
        return (S) withDeadlineAfter(dt.f(duration), TimeUnit.NANOSECONDS);
    }

    protected e(e.a.i iVar) {
        this(iVar, e.a.h.f47759a);
    }
}
