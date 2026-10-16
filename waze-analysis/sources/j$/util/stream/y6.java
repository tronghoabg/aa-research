package j$.util.stream;

import com.waze.strings.DisplayStrings;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class y6 extends c7 implements Spliterator.OfInt {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z6 f50711g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(z6 z6Var, int i2, int i3, int i4, int i5) {
        super(z6Var, i2, i3, i4, i5);
        this.f50711g = z6Var;
    }

    @Override // j$.util.stream.c7
    public final void a(int i2, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i2]);
    }

    @Override // j$.util.stream.c7
    public final j$.util.a1 b(Object obj, int i2, int i3) {
        return Spliterators.spliterator((int[]) obj, i2, i3 + i2, DisplayStrings.DS_LOG_OUT);
    }

    @Override // j$.util.stream.c7
    public final j$.util.a1 c(int i2, int i3, int i4, int i5) {
        return new y6(this.f50711g, i2, i3, i4, i5);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.x(this, consumer);
    }
}
