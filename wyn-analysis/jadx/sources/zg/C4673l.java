package zg;

import java.util.concurrent.Executor;
import okhttp3.Request;

/* renamed from: zg.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4673l implements InterfaceC4664c {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f48627a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4664c f48628b;

    public C4673l(Executor executor, InterfaceC4664c interfaceC4664c) {
        this.f48627a = executor;
        this.f48628b = interfaceC4664c;
    }

    @Override // zg.InterfaceC4664c
    public final void cancel() {
        this.f48628b.cancel();
    }

    @Override // zg.InterfaceC4664c
    public final void i(InterfaceC4667f interfaceC4667f) {
        this.f48628b.i(new C4672k(this, interfaceC4667f));
    }

    @Override // zg.InterfaceC4664c
    public final boolean isCanceled() {
        return this.f48628b.isCanceled();
    }

    @Override // zg.InterfaceC4664c
    public final Request request() {
        return this.f48628b.request();
    }

    @Override // zg.InterfaceC4664c
    public final InterfaceC4664c clone() {
        return new C4673l(this.f48627a, this.f48628b.clone());
    }
}
