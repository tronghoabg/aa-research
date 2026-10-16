package j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements BinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f50231b;

    public /* synthetic */ a(Comparator comparator, int i2) {
        this.f50230a = i2;
        this.f50231b = comparator;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f50230a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i2 = this.f50230a;
        Comparator comparator = this.f50231b;
        switch (i2) {
            case 0:
                if (comparator.compare(obj, obj2) < 0) {
                    break;
                }
                break;
            default:
                if (comparator.compare(obj, obj2) > 0) {
                    break;
                }
                break;
        }
        return obj2;
    }
}
