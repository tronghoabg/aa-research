package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aiwq extends defpackage.aiut {
    protected final java.lang.String e() {
        defpackage.aiwq aiwqVarI;
        defpackage.aiut aiutVar = defpackage.aivl.a;
        defpackage.aiwq aiwqVar = defpackage.ajdt.a;
        if (this == aiwqVar) {
            return "Dispatchers.Main";
        }
        try {
            aiwqVarI = aiwqVar.i();
        } catch (java.lang.UnsupportedOperationException unused) {
            aiwqVarI = null;
        }
        if (this == aiwqVarI) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract defpackage.aiwq i();

    @Override // defpackage.aiut
    public java.lang.String toString() {
        java.lang.String strE = e();
        if (strE != null) {
            return strE;
        }
        return defpackage.aiuz.a(this) + "@" + defpackage.aiuz.b(this);
    }
}
