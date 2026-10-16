package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fad extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    int b;
    java.lang.Object c;
    final /* synthetic */ defpackage.fae d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fad(defpackage.fae faeVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.d = faeVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
