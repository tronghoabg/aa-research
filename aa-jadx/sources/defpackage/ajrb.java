package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ajrb implements defpackage.ajra {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ defpackage.ajrc b;

    public ajrb(defpackage.ajrc ajrcVar, java.lang.String str) {
        this.a = str;
        this.b = ajrcVar;
    }

    @Override // defpackage.ajra
    public final defpackage.ajqy b(defpackage.akca akcaVar) {
        ((defpackage.ajqh) akcaVar.v("http.request")).hj();
        return this.b.c(this.a);
    }
}
