package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class n7 extends p7 implements IntConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final int[] f50540c = new int[128];

    @Override // j$.util.stream.p7
    public final void a(Object obj, long j2) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i2 = 0; i2 < j2; i2++) {
            intConsumer.accept(this.f50540c[i2]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i2) {
        int i3 = this.f50577b;
        this.f50577b = i3 + 1;
        this.f50540c[i3] = i2;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
