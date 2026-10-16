package defpackage;

/* loaded from: classes3.dex */
final class uvi implements uvj {
    private final uth a;
    private final tqs b;

    public uvi(uth uthVar, tqs tqsVar) {
        this.a = uthVar;
        this.b = tqsVar;
    }

    @Override // defpackage.uvj
    public final void a(uud uudVar, yfq yfqVar, uvl uvlVar) {
        uth uthVar = this.a;
        vaq.c(uthVar.F());
        san sanVarC = vao.c("addEntity ", uthVar.F());
        try {
            uthVar.y(uudVar);
            ((uvo) yfqVar.get(uthVar.F().ordinal())).c(uthVar);
            if (uthVar.p() != null && uvlVar != null) {
                tqs tqsVar = this.b;
                if (!(uthVar instanceof uma)) {
                    throw new IllegalArgumentException("Current implementation only supports GmmEntity");
                }
                if (tqsVar != null) {
                    ((twm) uvlVar).e.put((uma) uthVar, tqsVar);
                }
                ((twm) uvlVar).c.add((uma) uthVar);
                ((twm) uvlVar).c();
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
    }
}
