package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
final class D1 extends AbstractC3044y0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37971h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f37972i;

    public /* synthetic */ D1(EnumC2963h3 enumC2963h3, Object obj, int i5) {
        this.f37971h = i5;
        this.f37972i = obj;
    }

    @Override // j$.util.stream.AbstractC3044y0
    public final V1 T() {
        switch (this.f37971h) {
            case 0:
                return new U1((LongBinaryOperator) this.f37972i);
            case 1:
                return new G1((DoubleBinaryOperator) this.f37972i);
            case 2:
                return new L1((BinaryOperator) this.f37972i);
            default:
                return new R1((IntBinaryOperator) this.f37972i);
        }
    }
}
