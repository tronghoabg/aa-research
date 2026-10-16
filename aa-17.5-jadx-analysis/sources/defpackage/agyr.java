package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class agyr extends aify {
    private final aigw defaultType;
    private final agyt flexibility;
    private final aija howThisTypeIsUsed;
    private final boolean isForAnnotationParameter;
    private final boolean isRaw;
    private final Set<agee> visitedTypeParameters;

    public /* synthetic */ agyr(aija aijaVar, agyt agytVar, boolean z, boolean z2, Set set, aigw aigwVar, int i, afeu afeuVar) {
        this(aijaVar, (i & 2) != 0 ? agyt.INFLEXIBLE : agytVar, ((i & 4) == 0) & z, ((i & 8) == 0) & z2, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : aigwVar);
    }

    public static /* synthetic */ agyr copy$default(agyr agyrVar, aija aijaVar, agyt agytVar, boolean z, boolean z2, Set set, aigw aigwVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aijaVar = agyrVar.howThisTypeIsUsed;
        }
        if ((i & 2) != 0) {
            agytVar = agyrVar.flexibility;
        }
        if ((i & 4) != 0) {
            z = agyrVar.isRaw;
        }
        if ((i & 8) != 0) {
            z2 = agyrVar.isForAnnotationParameter;
        }
        if ((i & 16) != 0) {
            set = agyrVar.visitedTypeParameters;
        }
        if ((i & 32) != 0) {
            aigwVar = agyrVar.defaultType;
        }
        Set set2 = set;
        aigw aigwVar2 = aigwVar;
        return agyrVar.copy(aijaVar, agytVar, z, z2, set2, aigwVar2);
    }

    public final agyr copy(aija aijaVar, agyt agytVar, boolean z, boolean z2, Set<? extends agee> set, aigw aigwVar) {
        aijaVar.getClass();
        agytVar.getClass();
        return new agyr(aijaVar, agytVar, z, z2, set, aigwVar);
    }

    @Override // defpackage.aify
    public boolean equals(Object obj) {
        if (!(obj instanceof agyr)) {
            return false;
        }
        agyr agyrVar = (agyr) obj;
        return affa.f(agyrVar.getDefaultType(), getDefaultType()) && agyrVar.getHowThisTypeIsUsed() == getHowThisTypeIsUsed() && agyrVar.flexibility == this.flexibility && agyrVar.isRaw == this.isRaw && agyrVar.isForAnnotationParameter == this.isForAnnotationParameter;
    }

    @Override // defpackage.aify
    public aigw getDefaultType() {
        return this.defaultType;
    }

    public final agyt getFlexibility() {
        return this.flexibility;
    }

    @Override // defpackage.aify
    public aija getHowThisTypeIsUsed() {
        return this.howThisTypeIsUsed;
    }

    @Override // defpackage.aify
    public Set<agee> getVisitedTypeParameters() {
        return this.visitedTypeParameters;
    }

    @Override // defpackage.aify
    public int hashCode() {
        aigw defaultType = getDefaultType();
        int iHashCode = defaultType != null ? defaultType.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + getHowThisTypeIsUsed().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.flexibility.hashCode();
        int i = iHashCode3 + (iHashCode3 * 31) + (this.isRaw ? 1 : 0);
        return i + (i * 31) + (this.isForAnnotationParameter ? 1 : 0);
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    public final boolean isRaw() {
        return this.isRaw;
    }

    public final agyr markIsRaw(boolean z) {
        return copy$default(this, null, null, z, false, null, null, 59, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.howThisTypeIsUsed + ", flexibility=" + this.flexibility + ", isRaw=" + this.isRaw + ", isForAnnotationParameter=" + this.isForAnnotationParameter + ", visitedTypeParameters=" + this.visitedTypeParameters + ", defaultType=" + this.defaultType + ')';
    }

    public agyr withDefaultType(aigw aigwVar) {
        return copy$default(this, null, null, false, false, null, aigwVar, 31, null);
    }

    public final agyr withFlexibility(agyt agytVar) {
        agytVar.getClass();
        return copy$default(this, null, agytVar, false, false, null, null, 61, null);
    }

    @Override // defpackage.aify
    public agyr withNewVisitedTypeParameter(agee ageeVar) {
        ageeVar.getClass();
        return copy$default(this, null, null, false, false, getVisitedTypeParameters() != null ? woy.aT(getVisitedTypeParameters(), ageeVar) : woy.aO(ageeVar), null, 47, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public agyr(aija aijaVar, agyt agytVar, boolean z, boolean z2, Set<? extends agee> set, aigw aigwVar) {
        super(aijaVar, set, aigwVar);
        aijaVar.getClass();
        agytVar.getClass();
        this.howThisTypeIsUsed = aijaVar;
        this.flexibility = agytVar;
        this.isRaw = z;
        this.isForAnnotationParameter = z2;
        this.visitedTypeParameters = set;
        this.defaultType = aigwVar;
    }
}
