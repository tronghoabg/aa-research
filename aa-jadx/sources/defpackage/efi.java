package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class efi extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.ehg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efi(defpackage.ehg ehgVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = ehgVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
