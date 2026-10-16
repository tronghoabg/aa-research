package j$.util.function;

import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements IntUnaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntUnaryOperator f37891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntUnaryOperator f37892c;

    public /* synthetic */ g(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2, int i5) {
        this.f37890a = i5;
        this.f37891b = intUnaryOperator;
        this.f37892c = intUnaryOperator2;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        switch (this.f37890a) {
        }
        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        switch (this.f37890a) {
        }
        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i5) {
        switch (this.f37890a) {
            case 0:
                return this.f37892c.applyAsInt(this.f37891b.applyAsInt(i5));
            default:
                return this.f37891b.applyAsInt(this.f37892c.applyAsInt(i5));
        }
    }
}
