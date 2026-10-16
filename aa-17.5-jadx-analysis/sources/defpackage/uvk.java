package defpackage;

/* loaded from: classes3.dex */
final class uvk implements uvj {
    private final uth a;

    public uvk(uth uthVar) {
        this.a = uthVar;
    }

    @Override // defpackage.uvj
    public final void a(uud uudVar, yfq yfqVar, uvl uvlVar) {
        uth uthVar = this.a;
        vaq.c(uthVar.F());
        san sanVarC = vao.c("removeEntity ", uthVar.F());
        try {
            uthVar.e(false);
            ((uvo) yfqVar.get(uthVar.F().ordinal())).h(uthVar);
            if (uthVar.p() != null && uvlVar != null) {
                ((twm) uvlVar).c.remove(uthVar);
                ((twm) uvlVar).e.remove(uthVar);
            }
            if (sanVarC != null) {
                sanVarC.close();
            }
        } catch (Throwable th) {
            if (sanVarC != null) {
                try {
                    sanVarC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.uvj
    public final void b() {
        this.a.e(true);
    }
}
