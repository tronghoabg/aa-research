package A7;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class M0 implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Long.valueOf(((E1) obj).f488b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
