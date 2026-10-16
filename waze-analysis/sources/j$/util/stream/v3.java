package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class v3 extends x3 implements s5 {

    /* renamed from: h, reason: collision with root package name */
    public final long[] f50640h;

    public v3(v3 v3Var, Spliterator spliterator, long j2, long j3) {
        super(v3Var, spliterator, j2, j3, v3Var.f50640h.length);
        this.f50640h = v3Var.f50640h;
    }

    @Override // j$.util.stream.x3
    public final x3 a(Spliterator spliterator, long j2, long j3) {
        return new v3(this, spliterator, j2, j3);
    }

    @Override // j$.util.stream.x3, j$.util.stream.t5
    public final void accept(long j2) {
        int i2 = this.f50684f;
        if (i2 >= this.f50685g) {
            throw new IndexOutOfBoundsException(Integer.toString(i2));
        }
        long[] jArr = this.f50640h;
        this.f50684f = i2 + 1;
        jArr[i2] = j2;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.s5
    public final /* synthetic */ void u(Long l2) {
        d4.i(this, l2);
    }

    public v3(Spliterator spliterator, a aVar, long[] jArr) {
        super(spliterator, aVar, jArr.length);
        this.f50640h = jArr;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void u(Object obj) {
        u((Long) obj);
    }
}
