package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tco implements defpackage.affc {
    final /* synthetic */ java.util.function.Consumer a;

    public tco(java.util.function.Consumer consumer) {
        this.a = consumer;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        this.a.accept(obj);
        return obj;
    }
}
