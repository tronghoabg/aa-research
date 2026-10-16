package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajac extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.ajad c;
    java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajac(defpackage.ajad ajadVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = ajadVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
