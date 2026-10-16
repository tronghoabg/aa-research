package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aesb<K, V> implements java.io.Serializable, defpackage.aewu {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aesb() {
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ java.util.function.Function mo330andThen(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        return get(obj);
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$compose(this, function);
    }

    @Override // defpackage.aefe
    public /* synthetic */ boolean containsKey(java.lang.Object obj) {
        throw null;
    }

    @Override // defpackage.aefe
    public /* synthetic */ int size() {
        return -1;
    }
}
