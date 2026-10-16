package j$.util.stream;

import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class n1 extends o5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(int i2, t5 t5Var) {
        super(t5Var);
        this.f50534b = i2;
    }

    @Override // j$.util.stream.s5, j$.util.stream.t5
    public final void accept(long j2) {
        switch (this.f50534b) {
            case 0:
                this.f50558a.accept(j2);
                return;
            case 1:
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j2);
                throw null;
            case 2:
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j2);
                throw null;
            case 3:
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j2);
                throw null;
            default:
                LongPredicate longPredicate = null;
                longPredicate.test(j2);
                throw null;
        }
    }

    @Override // j$.util.stream.o5, j$.util.stream.t5
    public void l(long j2) {
        switch (this.f50534b) {
            case 4:
                this.f50558a.l(-1L);
                break;
            default:
                super.l(j2);
                break;
        }
    }
}
