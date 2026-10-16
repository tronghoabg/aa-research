package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class afgm extends defpackage.afgp implements defpackage.afix {
    public afgm() {
    }

    @Override // defpackage.affq
    protected defpackage.afid computeReflected() {
        return defpackage.afgw.a.property1(this);
    }

    @Override // defpackage.afix
    public java.lang.Object getDelegate(java.lang.Object obj) {
        return ((defpackage.afix) getReflected()).getDelegate(obj);
    }

    @Override // defpackage.afja
    public afiw getGetter() {
        return ((defpackage.afix) getReflected()).getGetter();
    }

    @Override // defpackage.affc
    public java.lang.Object invoke(java.lang.Object obj) {
        return get(obj);
    }

    public afgm(java.lang.Object obj) {
        super(obj);
    }

    public afgm(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
