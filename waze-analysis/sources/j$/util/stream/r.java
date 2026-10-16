package j$.util.stream;

import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class r extends m5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50591b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i2, t5 t5Var) {
        super(t5Var);
        this.f50591b = i2;
    }

    @Override // j$.util.stream.q5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        switch (this.f50591b) {
            case 0:
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d2);
                throw null;
            case 1:
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d2);
                throw null;
            default:
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d2);
                throw null;
        }
    }

    @Override // j$.util.stream.m5, j$.util.stream.t5
    public void l(long j2) {
        switch (this.f50591b) {
            case 2:
                this.f50521a.l(-1L);
                break;
            default:
                super.l(j2);
                break;
        }
    }
}
