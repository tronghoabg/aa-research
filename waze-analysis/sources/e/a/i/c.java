package e.a.i;

import e.a.bj;
import e.a.bk;
import e.a.bn;
import e.a.br;
import e.a.bt;
import e.a.w;
import j$.util.Objects;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f47812a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f47813b;

    /* renamed from: c, reason: collision with root package name */
    private final bt f47814c;

    /* renamed from: d, reason: collision with root package name */
    private w f47815d;

    /* renamed from: e, reason: collision with root package name */
    private br f47816e;

    public c(e eVar, Object obj, bj bjVar) {
        Objects.requireNonNull(eVar);
        this.f47812a = eVar;
        this.f47816e = new bk(bn.c());
        this.f47813b = obj;
        this.f47814c = bjVar.a(f());
        this.f47815d = w.f47851a;
    }

    public final w b() {
        return this.f47815d;
    }

    public final br c() {
        return this.f47816e;
    }

    public final bt e() {
        return this.f47814c;
    }

    protected b f() {
        return new b(this);
    }

    public final Object g() {
        return this.f47813b;
    }

    protected final void j() {
        this.f47814c.d();
        this.f47815d = w.f47855e;
        e.f47819i.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.f47813b);
    }

    public final String toString() {
        return "Address = " + String.valueOf(this.f47813b) + ", state = " + String.valueOf(this.f47815d) + ", picker type: " + String.valueOf(this.f47816e.getClass()) + ", lb: " + String.valueOf(this.f47814c);
    }
}
