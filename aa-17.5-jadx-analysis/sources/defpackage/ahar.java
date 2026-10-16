package defpackage;

/* loaded from: classes3.dex */
public final class ahar {
    public static final ahaq Companion = new ahaq(null);
    private static final ahar NONE = new ahar(null, null, false, false, false, 24, null);
    private final boolean definitelyNotNull;
    private final boolean isMutabilityQualifierForWarning;
    private final boolean isNullabilityQualifierForWarning;
    private final ahas mutability;
    private final ahau nullability;

    public /* synthetic */ ahar(ahau ahauVar, ahas ahasVar, boolean z, boolean z2, boolean z3, int i, afeu afeuVar) {
        this(ahauVar, ahasVar, z, z2 & ((i & 8) == 0), z3 & ((i & 16) == 0));
    }

    public static /* synthetic */ ahar copy$default(ahar aharVar, ahau ahauVar, ahas ahasVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            ahauVar = aharVar.nullability;
        }
        if ((i & 2) != 0) {
            ahasVar = aharVar.mutability;
        }
        if ((i & 4) != 0) {
            z = aharVar.definitelyNotNull;
        }
        if ((i & 8) != 0) {
            z2 = aharVar.isNullabilityQualifierForWarning;
        }
        if ((i & 16) != 0) {
            z3 = aharVar.isMutabilityQualifierForWarning;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return aharVar.copy(ahauVar, ahasVar, z5, z2, z4);
    }

    public final ahar copy(ahau ahauVar, ahas ahasVar, boolean z, boolean z2, boolean z3) {
        return new ahar(ahauVar, ahasVar, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahar)) {
            return false;
        }
        ahar aharVar = (ahar) obj;
        return this.nullability == aharVar.nullability && this.mutability == aharVar.mutability && this.definitelyNotNull == aharVar.definitelyNotNull && this.isNullabilityQualifierForWarning == aharVar.isNullabilityQualifierForWarning && this.isMutabilityQualifierForWarning == aharVar.isMutabilityQualifierForWarning;
    }

    public final boolean getDefinitelyNotNull() {
        return this.definitelyNotNull;
    }

    public final ahas getMutability() {
        return this.mutability;
    }

    public final ahau getNullability() {
        return this.nullability;
    }

    public int hashCode() {
        ahau ahauVar = this.nullability;
        int iHashCode = ahauVar == null ? 0 : ahauVar.hashCode();
        ahas ahasVar = this.mutability;
        return (((((((iHashCode * 31) + (ahasVar != null ? ahasVar.hashCode() : 0)) * 31) + ahap.m(this.definitelyNotNull)) * 31) + ahap.m(this.isNullabilityQualifierForWarning)) * 31) + ahap.m(this.isMutabilityQualifierForWarning);
    }

    public final boolean isMutabilityQualifierForWarning() {
        return this.isMutabilityQualifierForWarning;
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.isNullabilityQualifierForWarning;
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.nullability + ", mutability=" + this.mutability + ", definitelyNotNull=" + this.definitelyNotNull + ", isNullabilityQualifierForWarning=" + this.isNullabilityQualifierForWarning + ", isMutabilityQualifierForWarning=" + this.isMutabilityQualifierForWarning + ')';
    }

    public ahar(ahau ahauVar, ahas ahasVar, boolean z, boolean z2, boolean z3) {
        this.nullability = ahauVar;
        this.mutability = ahasVar;
        this.definitelyNotNull = z;
        this.isNullabilityQualifierForWarning = z2;
        this.isMutabilityQualifierForWarning = z3;
    }
}
