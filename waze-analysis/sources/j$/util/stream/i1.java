package j$.util.stream;

import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i1 extends n5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i2, t5 t5Var) {
        super(t5Var);
        this.f50445b = i2;
    }

    @Override // j$.util.stream.r5, j$.util.stream.t5
    public final void accept(int i2) {
        switch (this.f50445b) {
            case 0:
                this.f50539a.accept(i2);
                return;
            case 1:
                this.f50539a.accept(i2);
                return;
            case 2:
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i2);
                throw null;
            case 3:
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i2);
                throw null;
            case 4:
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i2);
                throw null;
            default:
                IntPredicate intPredicate = null;
                intPredicate.test(i2);
                throw null;
        }
    }

    @Override // j$.util.stream.n5, j$.util.stream.t5
    public void l(long j2) {
        switch (this.f50445b) {
            case 5:
                this.f50539a.l(-1L);
                break;
            default:
                super.l(j2);
                break;
        }
    }
}
