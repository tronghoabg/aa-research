package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aitc implements defpackage.aisp {
    public final defpackage.aisp a;
    public final defpackage.affc b;

    public aitc(defpackage.aisp aispVar, defpackage.affc affcVar) {
        this.a = aispVar;
        this.b = affcVar;
    }

    @Override // defpackage.aisp
    public final java.util.Iterator a() {
        return new defpackage.aitb(this);
    }
}
