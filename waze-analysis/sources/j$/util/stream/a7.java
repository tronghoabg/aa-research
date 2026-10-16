package j$.util.stream;

import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a7 extends c7 implements j$.util.x0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b7 f50334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(b7 b7Var, int i2, int i3, int i4, int i5) {
        super(b7Var, i2, i3, i4, i5);
        this.f50334g = b7Var;
    }

    @Override // j$.util.stream.c7
    public final void a(int i2, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i2]);
    }

    @Override // j$.util.stream.c7
    public final j$.util.a1 b(Object obj, int i2, int i3) {
        long[] jArr = (long[]) obj;
        int i4 = i3 + i2;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, i2, i4);
        return new j$.util.p1(jArr, i2, i4, DisplayStrings.DS_LOG_OUT);
    }

    @Override // j$.util.stream.c7
    public final j$.util.a1 c(int i2, int i3, int i4, int i5) {
        return new a7(this.f50334g, i2, i3, i4, i5);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }
}
