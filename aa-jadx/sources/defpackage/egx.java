package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class egx extends defpackage.afea {
    public java.lang.Object a;
    public java.lang.Object b;
    public long c;
    public /* synthetic */ java.lang.Object d;
    public int e;
    final /* synthetic */ defpackage.dtk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egx(defpackage.dtk dtkVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.f = dtkVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.g(null, this);
    }
}
