package j$.util.stream;

import j$.util.Map;
import j$.util.StringJoiner;
import j$.util.function.BiConsumer$CC;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements BiConsumer, Supplier {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        Function function = (Function) this.a;
        Function function2 = (Function) this.b;
        BinaryOperator binaryOperator = (BinaryOperator) this.c;
        Set set = Collectors.a;
        Map.EL.merge((java.util.Map) obj, function.apply(obj2), function2.apply(obj2), binaryOperator);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        CharSequence charSequence = (CharSequence) this.a;
        CharSequence charSequence2 = (CharSequence) this.b;
        CharSequence charSequence3 = (CharSequence) this.c;
        Set set = Collectors.a;
        return new StringJoiner(charSequence, charSequence2, charSequence3);
    }
}
