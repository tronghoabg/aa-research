package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes2.dex */
final class J1 extends AbstractC3044y0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f38018h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ double f38019i;

    @Override // j$.util.stream.AbstractC3044y0
    public final V1 T() {
        return new E1(this.f38019i, this.f38018h);
    }

    J1(EnumC2963h3 enumC2963h3, DoubleBinaryOperator doubleBinaryOperator, double d3) {
        this.f38018h = doubleBinaryOperator;
        this.f38019i = d3;
    }
}
