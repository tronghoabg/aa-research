package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class gjk extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.gjl b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjk(defpackage.gjl gjlVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = gjlVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, this);
    }
}
