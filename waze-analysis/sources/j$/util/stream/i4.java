package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i4 extends d4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f50446h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f50447i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f50448j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f50449k;

    public /* synthetic */ i4(k7 k7Var, Object obj, Object obj2, Object obj3, int i2) {
        this.f50446h = i2;
        this.f50448j = obj;
        this.f50449k = obj2;
        this.f50447i = obj3;
    }

    @Override // j$.util.stream.d4
    public final y4 Q() {
        int i2 = this.f50446h;
        Object obj = this.f50448j;
        Object obj2 = this.f50449k;
        Object obj3 = this.f50447i;
        switch (i2) {
            case 0:
                return new f4((Supplier) obj3, (ObjLongConsumer) obj2, (o) obj);
            case 1:
                return new l4((Supplier) obj3, (ObjDoubleConsumer) obj2, (o) obj);
            case 2:
                return new n4(obj3, (BiFunction) obj2, (BinaryOperator) obj);
            case 3:
                return new r4((Supplier) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new v4((Supplier) obj3, (ObjIntConsumer) obj2, (o) obj);
        }
    }
}
