package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i0 extends l0 implements r5 {

    /* renamed from: b, reason: collision with root package name */
    public final IntConsumer f50444b;

    public i0(IntConsumer intConsumer, boolean z) {
        super(z);
        this.f50444b = intConsumer;
    }

    @Override // j$.util.stream.l0, j$.util.stream.t5
    public final void accept(int i2) {
        this.f50444b.accept(i2);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.r5
    public final /* synthetic */ void m(Integer num) {
        d4.g(this, num);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        m((Integer) obj);
    }
}
