package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wdl implements java.util.function.Function {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ wdl(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return this.d != 0 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.d == 0) {
            defpackage.wdi wdiVar = (defpackage.wdi) this.b;
            defpackage.wdn wdnVar = new defpackage.wdn((defpackage.wba) this.a, wdiVar);
            boolean z = wdiVar.c;
            defpackage.sjr sjrVar = new defpackage.sjr(wdnVar);
            ((boolean[]) this.c)[0] = true;
            return sjrVar;
        }
        defpackage.yqm yqmVar = defpackage.kpd.a;
        int iOrdinal = ((defpackage.rsr) obj).ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        throw new java.lang.RuntimeException(null, null);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return this.d != 0 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
