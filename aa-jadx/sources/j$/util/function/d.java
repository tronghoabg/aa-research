package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements java.util.function.Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.Function b;
    public final /* synthetic */ java.util.function.Function c;

    public /* synthetic */ d(java.util.function.Function function, java.util.function.Function function2, byte b) {
        this.a = b;
        this.b = function;
        this.c = function2;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ java.util.function.Function mo330andThen(java.util.function.Function function) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        byte b = this.a;
        java.util.function.Function function = this.c;
        java.util.function.Function function2 = this.b;
        switch (b) {
            case 0:
                return function.apply(function2.apply(obj));
            default:
                return function2.apply(function.apply(obj));
        }
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.Function$CC.$default$compose(this, function);
    }
}
