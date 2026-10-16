package defpackage;

/* loaded from: classes3.dex */
public final class ahto {
    private static final agcs<ahtn> RESOLUTION_ANCHOR_PROVIDER_CAPABILITY = new agcs<>("ResolutionAnchorProvider");

    public static final agcu getResolutionAnchorIfAny(agcu agcuVar) {
        agcuVar.getClass();
        ahtn ahtnVar = (ahtn) agcuVar.getCapability(RESOLUTION_ANCHOR_PROVIDER_CAPABILITY);
        if (ahtnVar != null) {
            return ahtnVar.getResolutionAnchor(agcuVar);
        }
        return null;
    }
}
