package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsm {
    private final java.lang.String a;
    private final defpackage.abqe b;
    private final defpackage.zsl c;

    public zsm(android.content.Context context, java.lang.String str, defpackage.abqe abqeVar) {
        defpackage.zsl zslVar = new defpackage.zsl(context);
        this.a = str;
        this.b = abqeVar;
        this.c = zslVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [abpy] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final synchronized defpackage.abpy a() {
        ?? G;
        byte[] bArrB = this.c.b(this.a);
        G = 0;
        G = 0;
        if (bArrB != null) {
            try {
                G = this.b.g(bArrB);
            } catch (defpackage.abpp unused) {
                this.c.a(this.a, null);
            }
        }
        return G;
    }

    public final synchronized void b(defpackage.abpy abpyVar) {
        defpackage.zsl zslVar = this.c;
        try {
            if (abpyVar == null) {
                zslVar.a(this.a, null);
            } else {
                zslVar.a(this.a, abpyVar.h());
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
