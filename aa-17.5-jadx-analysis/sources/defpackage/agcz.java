package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class agcz {
    private final ahnd classId;
    private final List<Integer> typeParametersCount;

    public agcz(ahnd ahndVar, List<Integer> list) {
        ahndVar.getClass();
        list.getClass();
        this.classId = ahndVar;
        this.typeParametersCount = list;
    }

    public final ahnd component1() {
        return this.classId;
    }

    public final List<Integer> component2() {
        return this.typeParametersCount;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agcz)) {
            return false;
        }
        agcz agczVar = (agcz) obj;
        return affa.f(this.classId, agczVar.classId) && affa.f(this.typeParametersCount, agczVar.typeParametersCount);
    }

    public int hashCode() {
        return (this.classId.hashCode() * 31) + this.typeParametersCount.hashCode();
    }

    public String toString() {
        return "ClassRequest(classId=" + this.classId + ", typeParametersCount=" + this.typeParametersCount + ')';
    }
}
