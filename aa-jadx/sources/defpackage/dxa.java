package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dxa extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.dxb b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(defpackage.dxb dxbVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = dxbVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
