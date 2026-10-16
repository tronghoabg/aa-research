package p9;

import java.util.concurrent.Executor;
import m9.G;
import m9.InterfaceC3517p;

/* renamed from: p9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3781b implements InterfaceC3517p {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f43339a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3517p f43340b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f43341c = false;

    public C3781b(Executor executor, InterfaceC3517p interfaceC3517p) {
        this.f43339a = executor;
        this.f43340b = interfaceC3517p;
    }

    @Override // m9.InterfaceC3517p
    public final void a(Object obj, G g9) {
        this.f43339a.execute(new com.applovin.impl.mediation.ads.f(this, obj, g9, 26));
    }
}
