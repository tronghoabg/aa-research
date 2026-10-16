package j$.util.stream;

import androidx.camera.video.AudioStats;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j4 implements y4, q5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f50467a;

    /* renamed from: b, reason: collision with root package name */
    public double f50468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f50469c;

    public j4(DoubleBinaryOperator doubleBinaryOperator) {
        this.f50469c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.y4
    public final void B(y4 y4Var) {
        j4 j4Var = (j4) y4Var;
        if (j4Var.f50467a) {
            return;
        }
        accept(j4Var.f50468b);
    }

    @Override // j$.util.stream.q5
    public final /* synthetic */ void C(Double d2) {
        d4.e(this, d2);
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        if (!this.f50467a) {
            this.f50468b = this.f50469c.applyAsDouble(this.f50468b, d2);
        } else {
            this.f50467a = false;
            this.f50468b = d2;
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
        return this.f50467a ? j$.util.z.f50736c : new j$.util.z(this.f50468b);
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        this.f50467a = true;
        this.f50468b = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        C((Double) obj);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }
}
