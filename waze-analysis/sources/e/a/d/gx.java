package e.a.d;

import j$.util.Objects;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gx implements e.a.bs {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hf f47061a;

    /* renamed from: b, reason: collision with root package name */
    private hd f47062b;

    /* synthetic */ gx(hf hfVar) {
        Objects.requireNonNull(hfVar);
        this.f47061a = hfVar;
    }

    @Override // e.a.bs
    public final void a(e.a.x xVar) {
        hf hfVar = this.f47061a;
        if (hfVar.r) {
            hf.f47082h.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{xVar, this.f47062b.f47074a});
            return;
        }
        hf.f47082h.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{xVar, this.f47062b.f47074a});
        this.f47062b.f47077d = xVar;
        if (hfVar.f47086l.h() && this.f47062b == hfVar.f47085k.get(hfVar.f47086l.c())) {
            hfVar.t(this.f47062b);
        }
    }
}
