package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class vys extends defpackage.vzh {
    private final defpackage.vyp c;

    public vys(defpackage.ajgy ajgyVar, boolean z) {
        super(z, ajgyVar);
        this.c = new defpackage.vyp(ajgyVar, z);
    }

    @Override // defpackage.vzh
    public final defpackage.ajgy b(defpackage.vzf vzfVar) {
        if (vzfVar == null) {
            return this.c.c(null);
        }
        return vzfVar.d() ? f(vzfVar) : e();
    }

    @Override // defpackage.vzh
    public final defpackage.vzf d(java.lang.String str) {
        return this.c.a(str);
    }
}
