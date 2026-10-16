package defpackage;

/* loaded from: classes3.dex */
public final class agof {
    public static final agoe Companion = new agoe(null);
    private agol type;
    private String typeFlexibilityId;

    public agof(agol agolVar, String str) {
        agolVar.getClass();
        this.type = agolVar;
        this.typeFlexibilityId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agof)) {
            return false;
        }
        agof agofVar = (agof) obj;
        return affa.f(this.type, agofVar.type) && affa.f(this.typeFlexibilityId, agofVar.typeFlexibilityId);
    }

    public final agol getType() {
        return this.type;
    }

    public final String getTypeFlexibilityId() {
        return this.typeFlexibilityId;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.typeFlexibilityId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "KmFlexibleTypeUpperBound(type=" + this.type + ", typeFlexibilityId=" + this.typeFlexibilityId + ')';
    }
}
