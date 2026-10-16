package defpackage;

import j$.util.Map;
import j$.util.function.BiFunction$CC;
import j$.util.stream.Collector;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class ycf implements BinaryOperator {
    private final /* synthetic */ int a;

    public /* synthetic */ ycf(int i) {
        this.a = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            oct octVar = (oct) obj;
            Iterator it = ((oct) obj2).a.iterator();
            while (it.hasNext()) {
                octVar.n((ylp) it.next());
            }
            return octVar;
        }
        if (i == 1) {
            ygr ygrVar = (ygr) obj;
            ygr ygrVar2 = (ygr) obj2;
            yph yphVar = tgx.a;
            ygrVar.getClass();
            ygrVar2.getClass();
            return new ymh(ygrVar, ygrVar2).f();
        }
        int i2 = 2;
        if (i == 2) {
            yfl yflVar = (yfl) obj;
            yfl yflVar2 = (yfl) obj2;
            yflVar.a(yflVar2.a, yflVar2.b);
            return yflVar;
        }
        if (i == 3) {
            ygp ygpVar = (ygp) obj;
            ygpVar.l((ygp) obj2);
            return ygpVar;
        }
        if (i == 4) {
            ycl yclVar = (ycl) obj;
            ycl yclVar2 = (ycl) obj2;
            if (yclVar.a == null) {
                return yclVar2;
            }
            EnumMap enumMap = yclVar2.a;
            if (enumMap != null) {
                Map.EL.forEach(enumMap, new pcw(yclVar, i2));
            }
            return yclVar;
        }
        if (i == 5) {
            yfu yfuVar = (yfu) obj;
            yfuVar.f((yfu) obj2);
            return yfuVar;
        }
        Collector collector = ycm.a;
        throw new IllegalArgumentException("Multiple values for key: " + String.valueOf(obj) + ", " + String.valueOf(obj2));
    }
}
