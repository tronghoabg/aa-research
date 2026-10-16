package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2983l3 extends AbstractC2988m3 implements LongConsumer {

    /* renamed from: c, reason: collision with root package name */
    final long[] f38254c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    C2983l3(int i5) {
        this.f38254c = new long[i5];
    }

    @Override // j$.util.stream.AbstractC2988m3
    public final void b(Object obj, long j8) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i5 = 0; i5 < j8; i5++) {
            longConsumer.accept(this.f38254c[i5]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        int i5 = this.f38259b;
        this.f38259b = i5 + 1;
        this.f38254c[i5] = j8;
    }
}
