package defpackage;

/* loaded from: classes2.dex */
public final class ajaq extends ajam {
    public final afeh e;

    public /* synthetic */ ajaq(afeh afehVar, aiyk aiykVar) {
        this(afehVar, aiykVar, afcp.a, -2, 1);
    }

    @Override // defpackage.ajal
    protected final ajal c(afco afcoVar, int i, int i2) {
        return new ajaq(this.e, this.d, afcoVar, i, i2);
    }

    @Override // defpackage.ajam
    public final Object g(aiyl aiylVar, afck afckVar) {
        boolean z = aitz.a;
        Object objA = ahni.a(new ajak(this, aiylVar, (afck) null, 2), afckVar);
        return objA == afcr.a ? objA : afak.a;
    }

    public ajaq(afeh afehVar, aiyk aiykVar, afco afcoVar, int i, int i2) {
        super(aiykVar, afcoVar, i, i2);
        this.e = afehVar;
    }
}
