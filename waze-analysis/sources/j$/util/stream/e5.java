package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class e5 extends z4 implements y4 {

    /* renamed from: b, reason: collision with root package name */
    public long f50389b;

    @Override // j$.util.stream.y4
    public final void B(y4 y4Var) {
        this.f50389b += ((e5) y4Var).f50389b;
    }

    public /* synthetic */ void accept(double d2) {
        d4.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t5
    public final void end() {
    }

    @Override // j$.util.stream.z4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f50389b);
    }

    @Override // j$.util.stream.t5
    public final void l(long j2) {
        this.f50389b = 0L;
    }

    @Override // j$.util.stream.t5
    public final boolean o() {
        return false;
    }

    public /* synthetic */ void accept(int i2) {
        d4.k();
        throw null;
    }

    public /* synthetic */ void accept(long j2) {
        d4.l();
        throw null;
    }
}
