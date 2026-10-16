package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aiso implements defpackage.aisp {
    public final defpackage.afer a;
    public final defpackage.affc b;

    public aiso(defpackage.afer aferVar, defpackage.affc affcVar) {
        this.a = aferVar;
        this.b = affcVar;
    }

    @Override // defpackage.aisp
    public final java.util.Iterator a() {
        return new defpackage.aisn(this);
    }
}
