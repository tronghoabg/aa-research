package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ydn implements java.util.function.BiConsumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ydn(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.a;
        if (i == 0) {
            ((defpackage.ygr) obj).i(obj2);
            return;
        }
        if (i == 1) {
            defpackage.leb.g((android.content.Context) obj, (lbp) obj2);
        } else if (i != 2) {
            ((odn) obj).n((ymu) obj2);
        } else {
            ((defpackage.yhv) obj).c(obj2);
        }
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        int i = this.a;
        if (i == 0) {
            return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
        }
        if (i != 1) {
            return i != 2 ? j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer) : j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
        }
        return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
    }
}
