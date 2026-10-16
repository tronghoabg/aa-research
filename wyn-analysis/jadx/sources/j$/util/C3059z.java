package j$.util;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3059z implements LongConsumer, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i5) {
        accept(i5);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.count++;
        this.sum += j8;
        this.min = Math.min(this.min, j8);
        this.max = Math.max(this.max, j8);
    }

    public final void b(C3059z c3059z) {
        this.count += c3059z.count;
        this.sum += c3059z.sum;
        this.min = Math.min(this.min, c3059z.min);
        this.max = Math.max(this.max, c3059z.max);
    }

    public final String toString() {
        String simpleName = C3059z.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Long lValueOf3 = Long.valueOf(this.min);
        long j8 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, lValueOf3, Double.valueOf(j8 > 0 ? this.sum / j8 : 0.0d), Long.valueOf(this.max));
    }
}
