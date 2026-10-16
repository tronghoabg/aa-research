package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public class aify {
    private final aigw defaultType;
    private final aija howThisTypeIsUsed;
    private final Set<agee> visitedTypeParameters;

    /* JADX WARN: Multi-variable type inference failed */
    public aify(aija aijaVar, Set<? extends agee> set, aigw aigwVar) {
        aijaVar.getClass();
        this.howThisTypeIsUsed = aijaVar;
        this.visitedTypeParameters = set;
        this.defaultType = aigwVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aify)) {
            return false;
        }
        aify aifyVar = (aify) obj;
        return affa.f(aifyVar.getDefaultType(), getDefaultType()) && aifyVar.getHowThisTypeIsUsed() == getHowThisTypeIsUsed();
    }

    public aigw getDefaultType() {
        return this.defaultType;
    }

    public aija getHowThisTypeIsUsed() {
        return this.howThisTypeIsUsed;
    }

    public Set<agee> getVisitedTypeParameters() {
        return this.visitedTypeParameters;
    }

    public int hashCode() {
        aigw defaultType = getDefaultType();
        int iHashCode = defaultType != null ? defaultType.hashCode() : 0;
        return iHashCode + (iHashCode * 31) + getHowThisTypeIsUsed().hashCode();
    }

    public aify withNewVisitedTypeParameter(agee ageeVar) {
        ageeVar.getClass();
        aija howThisTypeIsUsed = getHowThisTypeIsUsed();
        Set<agee> visitedTypeParameters = getVisitedTypeParameters();
        return new aify(howThisTypeIsUsed, visitedTypeParameters != null ? woy.aT(visitedTypeParameters, ageeVar) : woy.aO(ageeVar), getDefaultType());
    }
}
