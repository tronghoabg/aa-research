package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Gatherer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class u0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gatherer f50627a;

    public /* synthetic */ u0(Gatherer gatherer) {
        this.f50627a = gatherer;
    }

    public static /* synthetic */ w0 c(Gatherer gatherer) {
        if (gatherer == null) {
            return null;
        }
        return gatherer instanceof v0 ? ((v0) gatherer).f50639a : new u0(gatherer);
    }

    public final /* synthetic */ w0 a(w0 w0Var) {
        return c(this.f50627a.andThen(v0.a(w0Var)));
    }

    public final /* synthetic */ BinaryOperator b() {
        return this.f50627a.combiner();
    }

    public final /* synthetic */ BiConsumer d() {
        return this.f50627a.finisher();
    }

    public final /* synthetic */ Supplier e() {
        return this.f50627a.initializer();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Gatherer gatherer = this.f50627a;
        if (obj instanceof u0) {
            obj = ((u0) obj).f50627a;
        }
        return gatherer.equals(obj);
    }

    public final /* synthetic */ t0 f() {
        Gatherer.Integrator integrator = this.f50627a.integrator();
        if (integrator == null) {
            return null;
        }
        return integrator instanceof s0 ? ((s0) integrator).f50600a : new r0(integrator);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50627a.hashCode();
    }
}
