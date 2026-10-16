package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gen implements defpackage.gdt {
    public final defpackage.gnr a;
    private final defpackage.gdt b;

    public gen(defpackage.gnr gnrVar, defpackage.gdt gdtVar) {
        this.b = gdtVar;
        this.a = gnrVar;
    }

    @Override // defpackage.gdt
    public final void a(java.lang.Object obj, defpackage.glm glmVar) throws android.os.RemoteException {
        this.b.a(obj, glmVar);
    }

    public final java.lang.String toString() {
        return "[" + this.a.name() + "]";
    }
}
