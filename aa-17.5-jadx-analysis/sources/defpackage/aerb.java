package defpackage;

import j$.util.function.Function$CC;
import java.io.Serializable;
import java.util.function.Function;

/* loaded from: classes3.dex */
public abstract class aerb<K, V> implements Serializable, aevu {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aerb() {
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return get(obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // defpackage.aeee
    public /* synthetic */ boolean containsKey(Object obj) {
        throw null;
    }

    @Override // defpackage.aeee
    public /* synthetic */ int size() {
        return -1;
    }
}
