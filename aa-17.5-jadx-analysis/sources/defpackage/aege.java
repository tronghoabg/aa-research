package defpackage;

import j$.util.function.Function$CC;
import java.io.Serializable;
import java.util.function.Function;

/* loaded from: classes3.dex */
public abstract class aege<V> implements Serializable, aegu {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aege() {
    }

    @Override // defpackage.aegu
    public /* synthetic */ Object a(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.IntFunction
    public final /* synthetic */ Object apply(int i) {
        return p(i);
    }

    @Override // defpackage.aegu
    public /* synthetic */ Object b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aegu
    public /* synthetic */ boolean c(int i) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.aeee
    public /* synthetic */ boolean containsKey(Object obj) {
        throw null;
    }

    @Override // defpackage.aeee
    public /* synthetic */ Object get(Object obj) {
        return adzo.z(this, obj);
    }

    @Override // defpackage.aeee
    public /* synthetic */ int size() {
        return -1;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return get(obj);
    }
}
