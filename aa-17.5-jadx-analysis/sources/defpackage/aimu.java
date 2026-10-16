package defpackage;

/* loaded from: classes3.dex */
public final class aimu extends aiig {
    @Override // defpackage.aiig
    public aiin get(aiid aiidVar) {
        aiidVar.getClass();
        ahtw ahtwVar = aiidVar instanceof ahtw ? (ahtw) aiidVar : null;
        if (ahtwVar == null) {
            return null;
        }
        return ahtwVar.getProjection().isStarProjection() ? new aiip(aijg.OUT_VARIANCE, ahtwVar.getProjection().getType()) : ahtwVar.getProjection();
    }
}
