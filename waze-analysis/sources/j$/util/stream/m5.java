package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class m5 implements q5 {

    /* renamed from: a, reason: collision with root package name */
    public final t5 f50521a;

    public m5(t5 t5Var) {
        this.f50521a = (t5) Objects.requireNonNull(t5Var);
    }

    @Override // j$.util.stream.q5
    public final /* synthetic */ void C(Double d2) {
        d4.e(this, d2);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public void end() {
        this.f50521a.end();
    }

    @Override // j$.util.stream.t5
    public void l(long j2) {
        this.f50521a.l(j2);
    }

    @Override // j$.util.stream.t5
    public boolean o() {
        return this.f50521a.o();
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C((Double) obj);
    }
}
