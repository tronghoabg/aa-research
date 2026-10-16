package defpackage;

/* loaded from: classes3.dex */
public abstract class aiio implements aiin {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiin)) {
            return false;
        }
        aiin aiinVar = (aiin) obj;
        return isStarProjection() == aiinVar.isStarProjection() && getProjectionKind() == aiinVar.getProjectionKind() && getType().equals(aiinVar.getType());
    }

    public int hashCode() {
        return (getProjectionKind().hashCode() * 31) + (aijc.noExpectedType(getType()) ? 19 : isStarProjection() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (isStarProjection()) {
            return "*";
        }
        if (getProjectionKind() == aijg.INVARIANT) {
            return getType().toString();
        }
        return getProjectionKind() + " " + getType();
    }
}
