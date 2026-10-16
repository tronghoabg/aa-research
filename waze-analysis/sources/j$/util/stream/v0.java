package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Gatherer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class v0 implements Gatherer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f50639a;

    public /* synthetic */ v0(w0 w0Var) {
        this.f50639a = w0Var;
    }

    public static /* synthetic */ Gatherer a(w0 w0Var) {
        if (w0Var == null) {
            return null;
        }
        return w0Var instanceof u0 ? ((u0) w0Var).f50627a : new v0(w0Var);
    }

    public final /* synthetic */ Gatherer andThen(Gatherer gatherer) {
        return a(((u0) this.f50639a).a(u0.c(gatherer)));
    }

    public final /* synthetic */ BinaryOperator combiner() {
        return ((u0) this.f50639a).b();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        w0 w0Var = this.f50639a;
        if (obj instanceof v0) {
            obj = ((v0) obj).f50639a;
        }
        return w0Var.equals(obj);
    }

    public final /* synthetic */ BiConsumer finisher() {
        return ((u0) this.f50639a).d();
    }

    public final /* synthetic */ int hashCode() {
        return this.f50639a.hashCode();
    }

    public final /* synthetic */ Supplier initializer() {
        return ((u0) this.f50639a).e();
    }

    public final /* synthetic */ Gatherer.Integrator integrator() {
        t0 t0VarF = ((u0) this.f50639a).f();
        if (t0VarF == null) {
            return null;
        }
        return t0VarF instanceof r0 ? ((r0) t0VarF).f50592a : new s0(t0VarF);
    }
}
