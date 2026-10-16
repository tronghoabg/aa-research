package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class efo extends defpackage.afea {
    public /* synthetic */ java.lang.Object a;
    public int b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public int g;
    final /* synthetic */ defpackage.byq h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efo(defpackage.byq byqVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.h = byqVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
