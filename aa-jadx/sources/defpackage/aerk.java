package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aerk<K> implements java.io.Serializable, defpackage.aesn {
    private static final long serialVersionUID = -4940583368468432370L;

    protected aerk() {
    }

    @Override // defpackage.aesn
    public /* synthetic */ int a(java.lang.Object obj, int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ java.util.function.Function mo330andThen(java.util.function.Function function) {
        throw new java.lang.NoSuchMethodError();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        return get(obj);
    }

    @Override // java.util.function.ToIntFunction
    public final /* synthetic */ int applyAsInt(java.lang.Object obj) {
        return o(obj);
    }

    @Override // defpackage.aesn
    public /* synthetic */ int b(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aesn
    public /* synthetic */ java.lang.Integer c(java.lang.Object obj) {
        return defpackage.adrq.R(this, obj);
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$compose(this, function);
    }

    @Override // defpackage.aefe
    public /* synthetic */ boolean containsKey(java.lang.Object obj) {
        throw null;
    }

    @Override // defpackage.aefe
    public /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return c(obj);
    }

    @Override // defpackage.aefe
    public /* synthetic */ int size() {
        return -1;
    }
}
