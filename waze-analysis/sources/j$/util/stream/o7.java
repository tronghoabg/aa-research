package j$.util.stream;

import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class o7 extends p7 implements LongConsumer {

    /* renamed from: c, reason: collision with root package name */
    public final long[] f50559c = new long[128];

    @Override // j$.util.stream.p7
    public final void a(Object obj, long j2) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i2 = 0; i2 < j2; i2++) {
            longConsumer.accept(this.f50559c[i2]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j2) {
        int i2 = this.f50577b;
        this.f50577b = i2 + 1;
        this.f50559c[i2] = j2;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }
}
