package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class amp extends defpackage.afea {
    java.lang.Object a;
    java.lang.Object b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.amq d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amp(defpackage.amq amqVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.d = amqVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
