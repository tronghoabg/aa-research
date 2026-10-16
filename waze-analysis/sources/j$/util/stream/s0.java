package j$.util.stream;

import java.util.stream.Gatherer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class s0 implements Gatherer.Integrator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f50600a;

    public final /* synthetic */ boolean equals(Object obj) {
        t0 t0Var = this.f50600a;
        if (obj instanceof s0) {
            obj = ((s0) obj).f50600a;
        }
        return t0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50600a.hashCode();
    }

    public final /* synthetic */ boolean integrate(Object obj, Object obj2, Gatherer.Downstream downstream) {
        return ((r0) this.f50600a).a(obj, obj2, downstream == null ? null : downstream instanceof p0 ? ((p0) downstream).f50564a : new o0(downstream));
    }
}
