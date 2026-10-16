package defpackage;

/* loaded from: classes.dex */
public final class odb implements aiyk {
    final /* synthetic */ aiyk a;
    private final /* synthetic */ int b;

    public odb(aiyk aiykVar, int i) {
        this.b = i;
        this.a = aiykVar;
    }

    @Override // defpackage.aiyk
    public final Object hR(aiyl aiylVar, afck afckVar) {
        if (this.b != 0) {
            Object objHR = this.a.hR(new byk(aiylVar, 2), afckVar);
            return objHR == afcr.a ? objHR : afak.a;
        }
        Object objHR2 = this.a.hR(new byk(aiylVar, 3), afckVar);
        return objHR2 == afcr.a ? objHR2 : afak.a;
    }
}
