package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cqd extends defpackage.afea {
    public /* synthetic */ java.lang.Object a;
    public int b;
    final /* synthetic */ defpackage.tu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqd(defpackage.tu tuVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = tuVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.d(0L, 0L, this);
    }
}
