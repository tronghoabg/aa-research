package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class vyx extends defpackage.vzh {
    private final double c;
    private final defpackage.vyp d;

    /* JADX WARN: Illegal instructions before constructor call */
    public vyx(defpackage.ajgy ajgyVar, double d) {
        defpackage.vzf vzfVarB = defpackage.vzf.b(ajgyVar);
        super(vzfVarB.c > 0, ajgyVar);
        this.c = d;
        this.d = new defpackage.vyp(ajgyVar, vzfVarB.c(d));
    }

    @Override // defpackage.vzh
    public final defpackage.ajgy b(defpackage.vzf vzfVar) {
        if (vzfVar == null) {
            return this.d.c(null);
        }
        return vzfVar.c(this.c) ? f(vzfVar) : e();
    }

    @Override // defpackage.vzh
    public final defpackage.vzf d(java.lang.String str) {
        return this.d.a(str);
    }
}
