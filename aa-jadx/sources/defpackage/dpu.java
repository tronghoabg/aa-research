package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dpu extends java.lang.Exception {
    private final java.lang.String a;
    private final java.lang.String b;

    public dpu(java.lang.String str, defpackage.dpp dppVar) {
        super(str);
        this.a = str;
        this.b = dppVar.y();
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return "CLParsingException (" + hashCode() + ") : " + (this.a + " (" + this.b + " at line 0)");
    }
}
