package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
final class B1 extends AbstractC3044y0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f37952h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f37953i;

    @Override // j$.util.stream.AbstractC3044y0
    public final V1 T() {
        return new T1(this.f37953i, this.f37952h);
    }

    B1(EnumC2963h3 enumC2963h3, LongBinaryOperator longBinaryOperator, long j8) {
        this.f37952h = longBinaryOperator;
        this.f37953i = j8;
    }
}
