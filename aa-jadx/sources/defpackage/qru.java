package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qru implements java.util.function.Function {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qru(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ java.util.function.Function mo330andThen(java.util.function.Function function) {
        return this.b != 0 ? j$.util.function.Function$CC.$default$andThen(this, function) : j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.b == 0) {
            defpackage.yqk yqkVar = defpackage.qsa.a;
            return java.lang.Boolean.valueOf(!((java.lang.String) obj).equals(this.a));
        }
        android.content.Intent intent = defpackage.ioh.a;
        return android.content.ComponentName.createRelative(((android.content.pm.ServiceInfo) ((j$.util.Optional) this.a).get()).packageName, (java.lang.String) obj);
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return this.b != 0 ? j$.util.function.Function$CC.$default$compose(this, function) : j$.util.function.Function$CC.$default$compose(this, function);
    }
}
