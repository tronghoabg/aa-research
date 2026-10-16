package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class o5 implements s5 {

    /* renamed from: a, reason: collision with root package name */
    public final t5 f50558a;

    public o5(t5 t5Var) {
        this.f50558a = (t5) Objects.requireNonNull(t5Var);
    }

    @Override // j$.util.stream.t5, j$.util.stream.q5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public void end() {
        this.f50558a.end();
    }

    @Override // j$.util.stream.t5
    public void l(long j2) {
        this.f50558a.l(j2);
    }

    @Override // j$.util.stream.t5
    public boolean o() {
        return this.f50558a.o();
    }

    @Override // j$.util.stream.s5
    public final /* synthetic */ void u(Long l2) {
        d4.i(this, l2);
    }

    @Override // j$.util.stream.t5
    public final /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        u((Long) obj);
    }
}
