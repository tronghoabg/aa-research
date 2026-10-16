package defpackage;

import j$.time.Duration;
import j$.util.function.BiFunction$CC;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class rib implements BinaryOperator {
    private final /* synthetic */ int a;

    public /* synthetic */ rib(int i) {
        this.a = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() | ((Integer) obj2).intValue());
            case 1:
                return ((Duration) obj).plus((Duration) obj2);
            case 2:
                ygr ygrVar = (ygr) obj;
                ygr ygrVar2 = (ygr) obj2;
                int i = tgw.a;
                ygrVar.getClass();
                ygrVar2.getClass();
                return new ymh(ygrVar, ygrVar2).f();
            case 3:
                return ysi.j((Comparable) obj, (Comparable) obj2);
            case 4:
                yph yphVar = tgx.a;
                return obj2;
            case 5:
                yfr yfrVar = (yfr) obj;
                Map map = ((yfr) obj2).a;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        yfrVar.g(entry.getKey(), ((yff) entry.getValue()).g());
                    }
                }
                return yfrVar;
            case 6:
                aetq aetqVar = (aetq) obj;
                aetqVar.n(aetqVar.b, (aetq) obj2);
                return aetqVar;
            case 7:
                aeug aeugVar = (aeug) obj;
                int i2 = aeug.l;
                aeugVar.addAll((aeug) obj2);
                return aeugVar;
            case 8:
                aeul aeulVar = (aeul) obj;
                int i3 = aeul.i;
                aeulVar.addAll((aeul) obj2);
                return aeulVar;
            default:
                aexh aexhVar = (aexh) obj;
                aexhVar.l(aexhVar.b, (aexh) obj2);
                return aexhVar;
        }
    }
}
