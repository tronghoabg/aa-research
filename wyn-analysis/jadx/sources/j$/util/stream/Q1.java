package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
final class Q1 extends AbstractC3044y0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f38064h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f38065i;

    @Override // j$.util.stream.AbstractC3044y0
    public final V1 T() {
        return new P1(this.f38065i, this.f38064h);
    }

    Q1(EnumC2963h3 enumC2963h3, IntBinaryOperator intBinaryOperator, int i5) {
        this.f38064h = intBinaryOperator;
        this.f38065i = i5;
    }
}
