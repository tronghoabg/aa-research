package defpackage;

/* loaded from: classes3.dex */
public final class agys {
    public static final agyr toAttributes(aija aijaVar, boolean z, boolean z2, agee ageeVar) {
        aijaVar.getClass();
        return new agyr(aijaVar, null, z2, z, ageeVar != null ? woy.aO(ageeVar) : null, null, 34, null);
    }

    public static /* synthetic */ agyr toAttributes$default(aija aijaVar, boolean z, boolean z2, agee ageeVar, int i, Object obj) {
        boolean z3 = z2 & ((i & 2) == 0);
        if ((i & 4) != 0) {
            ageeVar = null;
        }
        return toAttributes(aijaVar, 1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), z3, ageeVar);
    }
}
