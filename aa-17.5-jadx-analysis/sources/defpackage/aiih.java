package defpackage;

/* loaded from: classes3.dex */
public final class aiih {
    private final boolean intersectUpperBounds;
    private final boolean leaveNonTypeParameterTypes;

    public aiih(boolean z, boolean z2) {
        this.leaveNonTypeParameterTypes = z;
        this.intersectUpperBounds = z2;
    }

    public final boolean getIntersectUpperBounds() {
        return this.intersectUpperBounds;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.leaveNonTypeParameterTypes;
    }
}
