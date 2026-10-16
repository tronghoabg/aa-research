package defpackage;

/* loaded from: classes3.dex */
public class aifx {
    public static /* synthetic */ aiin computeProjection$default(aifx aifxVar, agee ageeVar, aify aifyVar, aiim aiimVar, aigl aiglVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i & 8) != 0) {
            aiglVar = aiimVar.getErasedUpperBound(ageeVar, aifyVar);
        }
        return aifxVar.computeProjection(ageeVar, aifyVar, aiimVar, aiglVar);
    }

    public aiin computeProjection(agee ageeVar, aify aifyVar, aiim aiimVar, aigl aiglVar) {
        ageeVar.getClass();
        aifyVar.getClass();
        aiimVar.getClass();
        aiglVar.getClass();
        return new aiip(aijg.OUT_VARIANCE, aiglVar);
    }
}
