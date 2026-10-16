package defpackage;

import java.util.logging.Level;

/* loaded from: classes3.dex */
final class adwv implements adlh {
    public adwz a;
    final /* synthetic */ adxb b;

    public adwv(adxb adxbVar) {
        this.b = adxbVar;
    }

    @Override // defpackage.adlh
    public final void a(adji adjiVar) {
        adxb adxbVar = this.b;
        if (adxbVar.p) {
            adxb.f.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{adjiVar, this.a.a});
            return;
        }
        adxb.f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{adjiVar, this.a.a});
        this.a.d = adjiVar;
        adww adwwVar = adxbVar.k;
        if (adwwVar.f() && this.a == adxbVar.j.get(adwwVar.b())) {
            adxbVar.i(this.a);
        }
    }
}
