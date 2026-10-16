package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pdt implements java.util.function.BiConsumer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pdt(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((defpackage.ydr) this.a).a((java.lang.Enum) obj, obj2);
                return;
            } else {
                ((defpackage.kzb) this.a).S((java.lang.Throwable) obj, (defpackage.yxo) obj2);
                return;
            }
        }
        defpackage.yqm yqmVar = defpackage.ped.a;
        ((java.lang.StringBuilder) this.a).append("callback: " + java.lang.String.valueOf((defpackage.pdz) obj) + " " + java.lang.String.valueOf((defpackage.peb) obj2));
    }

    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer) : j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
        }
        return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
