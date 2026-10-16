package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahuo {
    private static final defpackage.agds<defpackage.ahun> RESOLUTION_ANCHOR_PROVIDER_CAPABILITY = new defpackage.agds<>("ResolutionAnchorProvider");

    public static final defpackage.agdu getResolutionAnchorIfAny(defpackage.agdu agduVar) {
        agduVar.getClass();
        defpackage.ahun ahunVar = (defpackage.ahun) agduVar.getCapability(RESOLUTION_ANCHOR_PROVIDER_CAPABILITY);
        if (ahunVar != null) {
            return ahunVar.getResolutionAnchor(agduVar);
        }
        return null;
    }
}
