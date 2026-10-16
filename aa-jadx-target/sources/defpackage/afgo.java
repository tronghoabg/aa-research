package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afgo extends defpackage.afgp implements defpackage.afiz {
    public afgo(java.lang.Class cls, java.lang.String str, java.lang.String str2) {
        super(NO_RECEIVER, cls, str, str2, 0);
    }

    @Override // defpackage.affq
    protected final defpackage.afid computeReflected() {
        return defpackage.afgw.a.property2(this);
    }

    @Override // defpackage.afiz
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public final afiy mo3getGetter() {
        return ((defpackage.afiz) getReflected()).mo3getGetter();
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return mo3getGetter().call(new java.lang.Object[]{obj, obj2});
    }

    @Override // defpackage.afja
    public final /* bridge */ /* synthetic */ afit getGetter() {
        throw null;
    }
}
