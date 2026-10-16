package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class F1 extends AbstractC3044y0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37985h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f37986i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Object f37987j;
    final /* synthetic */ Object k;

    public /* synthetic */ F1(EnumC2963h3 enumC2963h3, Object obj, Object obj2, Object obj3, int i5) {
        this.f37985h = i5;
        this.f37987j = obj;
        this.k = obj2;
        this.f37986i = obj3;
    }

    @Override // j$.util.stream.AbstractC3044y0
    public final V1 T() {
        switch (this.f37985h) {
            case 0:
                return new C1((Supplier) this.f37986i, (ObjLongConsumer) this.k, (C3004q) this.f37987j);
            case 1:
                return new I1((Supplier) this.f37986i, (ObjDoubleConsumer) this.k, (C3004q) this.f37987j);
            case 2:
                return new K1(this.f37986i, (BiFunction) this.k, (BinaryOperator) this.f37987j);
            case 3:
                return new O1((Supplier) this.f37986i, (BiConsumer) this.k, (BiConsumer) this.f37987j);
            default:
                return new S1((Supplier) this.f37986i, (ObjIntConsumer) this.k, (C3004q) this.f37987j);
        }
    }
}
