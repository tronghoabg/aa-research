package defpackage;

import j$.util.function.Function$CC;
import java.io.Serializable;
import java.util.function.Function;

/* loaded from: classes3.dex */
public abstract class aeqz<K> implements Serializable, aeva {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aeqz() {
    }

    @Override // defpackage.aeva
    public /* synthetic */ int a(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.ToIntFunction
    public final /* synthetic */ int applyAsInt(Object obj) {
        return o(obj);
    }

    @Override // defpackage.aeva
    public /* synthetic */ int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeva
    public /* synthetic */ Integer c(Object obj) {
        return adqs.az(this, obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // defpackage.aeee
    public /* synthetic */ boolean containsKey(Object obj) {
        throw null;
    }

    @Override // defpackage.aeee
    public /* synthetic */ Object get(Object obj) {
        return c(obj);
    }

    @Override // defpackage.aeee
    public /* synthetic */ int size() {
        return -1;
    }
}
