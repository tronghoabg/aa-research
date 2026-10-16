package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ddj extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.ddk b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddj(defpackage.ddk ddkVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = ddkVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, this);
    }
}
