package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class o4 implements y4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f50555a;

    /* renamed from: b, reason: collision with root package name */
    public Object f50556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f50557c;

    public o4(BinaryOperator binaryOperator) {
        this.f50557c = binaryOperator;
    }

    @Override // j$.util.stream.y4
    public final void B(y4 y4Var) {
        o4 o4Var = (o4) y4Var;
        if (o4Var.f50555a) {
            return;
        }
        u(o4Var.f50556b);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) {
        if (!this.f50555a) {
            this.f50556b = this.f50557c.apply(this.f50556b, obj);
        } else {
            this.f50555a = false;
            this.f50556b = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f50555a ? Optional.empty() : Optional.of(this.f50556b);
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        this.f50555a = true;
        this.f50556b = null;
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
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
