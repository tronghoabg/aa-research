package defpackage;

import java.util.logging.Level;

/* loaded from: classes3.dex */
public class aeds {
    public final Object a;
    public final adli b;
    final /* synthetic */ aedu e;
    public adlg d = new adkz(adlc.a);
    public adjh c = adjh.a;

    public aeds(aedu aeduVar, Object obj, adky adkyVar) {
        this.e = aeduVar;
        this.a = obj;
        this.b = adkyVar.a(a());
    }

    protected aedr a() {
        return new aedr(this);
    }

    protected final void b() {
        this.b.d();
        this.c = adjh.e;
        aedu.f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.a);
    }

    public final String toString() {
        return "Address = " + String.valueOf(this.a) + ", state = " + String.valueOf(this.c) + ", picker type: " + String.valueOf(this.d.getClass()) + ", lb: " + String.valueOf(this.b);
    }
}
