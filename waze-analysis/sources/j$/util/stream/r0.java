package j$.util.stream;

import java.util.stream.Gatherer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class r0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gatherer.Integrator f50592a;

    public final /* synthetic */ boolean a(Object obj, Object obj2, q0 q0Var) {
        return this.f50592a.integrate(obj, obj2, q0Var == null ? null : q0Var instanceof o0 ? ((o0) q0Var).f50548a : new p0(q0Var));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Gatherer.Integrator integrator = this.f50592a;
        if (obj instanceof r0) {
            obj = ((r0) obj).f50592a;
        }
        return integrator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50592a.hashCode();
    }
}
