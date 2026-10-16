package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class afgl extends defpackage.afgp implements defpackage.afiv {
    public afgl(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // defpackage.affq
    protected final defpackage.afid computeReflected() {
        return defpackage.afgw.a.property0(this);
    }

    @Override // defpackage.afiv
    public java.lang.Object get() {
        return mo2getGetter().call(new java.lang.Object[0]);
    }

    @Override // defpackage.afiv
    public final java.lang.Object getDelegate() {
        return ((defpackage.afiv) getReflected()).getDelegate();
    }

    @Override // defpackage.afiv
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public final afiu mo2getGetter() {
        return ((defpackage.afiv) getReflected()).mo2getGetter();
    }

    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        return get();
    }

    @Override // defpackage.afja
    public final /* bridge */ /* synthetic */ afit getGetter() {
        throw null;
    }
}
