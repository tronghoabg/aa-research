package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2978k3 extends AbstractC2988m3 implements IntConsumer {

    /* renamed from: c, reason: collision with root package name */
    final int[] f38246c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    C2978k3(int i5) {
        this.f38246c = new int[i5];
    }

    @Override // j$.util.stream.AbstractC2988m3
    public final void b(Object obj, long j8) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i5 = 0; i5 < j8; i5++) {
            intConsumer.accept(this.f38246c[i5]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i5) {
        int i10 = this.f38259b;
        this.f38259b = i10 + 1;
        this.f38246c[i10] = i5;
    }
}
