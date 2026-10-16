package j$.util.stream;

import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class w6 extends c7 implements j$.util.s0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x6 f50664g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(x6 x6Var, int i2, int i3, int i4, int i5) {
        super(x6Var, i2, i3, i4, i5);
        this.f50664g = x6Var;
    }

    @Override // j$.util.stream.c7
    public final void a(int i2, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i2]);
    }

    @Override // j$.util.stream.c7
    public final j$.util.a1 b(Object obj, int i2, int i3) {
        double[] dArr = (double[]) obj;
        int i4 = i3 + i2;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, i2, i4);
        return new j$.util.i1(dArr, i2, i4, DisplayStrings.DS_LOG_OUT);
    }

    @Override // j$.util.stream.c7
    public final j$.util.a1 c(int i2, int i3, int i4, int i5) {
        return new w6(this.f50664g, i2, i3, i4, i5);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.w(this, consumer);
    }
}
