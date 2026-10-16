package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aivo implements defpackage.aiue {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public aivo(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [affc, aivn, java.lang.Object] */
    @Override // defpackage.aiue
    public final void a(java.lang.Throwable th) {
        int i = this.a;
        ?? r1 = this.b;
        if (i != 0) {
            r1.invoke(th);
        } else {
            r1.gK();
        }
    }

    public final java.lang.String toString() {
        int i = this.a;
        java.lang.Object obj = this.b;
        if (i == 0) {
            return "DisposeOnCancel[" + obj + "]";
        }
        return "CancelHandler.UserSupplied[" + defpackage.aiuz.a(obj) + "@" + defpackage.aiuz.b(this) + "]";
    }
}
