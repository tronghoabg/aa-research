package j$.util;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3057x implements IntConsumer {
    private long count;
    private long sum;
    private int min = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    private int max = Integer.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i5) {
        this.count++;
        this.sum += i5;
        this.min = Math.min(this.min, i5);
        this.max = Math.max(this.max, i5);
    }

    public final void b(C3057x c3057x) {
        this.count += c3057x.count;
        this.sum += c3057x.sum;
        this.min = Math.min(this.min, c3057x.min);
        this.max = Math.max(this.max, c3057x.max);
    }

    public final String toString() {
        String simpleName = C3057x.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Integer numValueOf = Integer.valueOf(this.min);
        long j8 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, Double.valueOf(j8 > 0 ? this.sum / j8 : 0.0d), Integer.valueOf(this.max));
    }
}
