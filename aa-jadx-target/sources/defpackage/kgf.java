package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kgf implements java.util.function.BiFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ kgf(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return this.a != 0 ? j$.util.function.BiFunction.-CC.$default$andThen(this, function) : j$.util.function.BiFunction.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        if (this.a != 0) {
            return defpackage.ipz.B().a();
        }
        defpackage.yqm yqmVar = com.google.android.apps.auto.components.bugreport.BugreportRequester.a;
        android.content.Context applicationContext = ((android.content.Context) obj).getApplicationContext();
        applicationContext.getClass();
        return defpackage.omv.b(applicationContext, (defpackage.rco) obj2, null, null, 2);
    }
}
