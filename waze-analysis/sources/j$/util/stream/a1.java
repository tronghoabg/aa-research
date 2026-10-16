package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a1 implements t5, q0 {

    /* renamed from: a, reason: collision with root package name */
    public final t5 f50324a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f50325b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f50326c;

    /* renamed from: d, reason: collision with root package name */
    public Object f50327d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f50328e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f50329f = true;

    public a1(w0 w0Var, t5 t5Var) {
        this.f50325b = w0Var;
        this.f50324a = t5Var;
        this.f50326c = ((u0) w0Var).f();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) {
        this.f50328e = ((r0) this.f50326c).a(this.f50327d, obj, this) & this.f50328e;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
        BiConsumer biConsumerD = ((u0) this.f50325b).d();
        e1 e1Var = e1.DEFAULT;
        e1Var.getClass();
        if (biConsumerD != e1Var) {
            biConsumerD.accept(this.f50327d, this);
        }
        this.f50324a.end();
        this.f50327d = null;
    }

    @Override // j$.util.stream.q0
    public final boolean isRejecting() {
        return !this.f50329f;
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        Supplier supplierE = ((u0) this.f50325b).e();
        e1 e1Var = e1.DEFAULT;
        e1Var.getClass();
        if (supplierE != e1Var) {
            this.f50327d = supplierE.get();
        }
        this.f50324a.l(-1L);
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        if (this.f50328e && this.f50329f) {
            if (!this.f50324a.o()) {
                return false;
            }
            this.f50329f = false;
        }
        return true;
    }

    @Override // j$.util.stream.q0
    public final boolean push(Object obj) {
        boolean z;
        boolean z2 = this.f50329f;
        t5 t5Var = this.f50324a;
        if (z2) {
            t5Var.u((t5) obj);
        }
        if (z2) {
            boolean zO = t5Var.o();
            z = false;
            if (zO) {
                this.f50329f = false;
                z = true;
            }
        } else {
            z = true;
        }
        return !z;
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }
}
