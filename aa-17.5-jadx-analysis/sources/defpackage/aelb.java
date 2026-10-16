package defpackage;

import j$.util.function.Function$CC;
import java.io.Serializable;
import java.util.function.Function;

/* loaded from: classes3.dex */
public abstract class aelb<V> implements Serializable, aenw {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aelb() {
    }

    @Override // defpackage.aenw
    public /* synthetic */ Object a(long j, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.LongFunction
    public final /* synthetic */ Object apply(long j) {
        return h(j);
    }

    @Override // defpackage.aenw
    public /* synthetic */ Object b(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aenw
    public /* synthetic */ boolean c(long j) {
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
        return adqq.aw(this, obj);
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
