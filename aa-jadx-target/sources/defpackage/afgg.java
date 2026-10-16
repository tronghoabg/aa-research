package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class afgg extends defpackage.afgj implements defpackage.afim {
    public afgg() {
    }

    @Override // defpackage.affq
    protected defpackage.afid computeReflected() {
        return defpackage.afgw.a.mutableProperty1(this);
    }

    @Override // defpackage.afix
    public java.lang.Object getDelegate(java.lang.Object obj) {
        return ((defpackage.afim) getReflected()).getDelegate(obj);
    }

    @Override // defpackage.afja
    public afiw getGetter() {
        return ((defpackage.afim) getReflected()).getGetter();
    }

    @Override // defpackage.afip
    public afil getSetter() {
        return ((defpackage.afim) getReflected()).getSetter();
    }

    @Override // defpackage.affc
    public java.lang.Object invoke(java.lang.Object obj) {
        return get(obj);
    }

    public afgg(java.lang.Object obj) {
        super(obj);
    }

    public afgg(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
