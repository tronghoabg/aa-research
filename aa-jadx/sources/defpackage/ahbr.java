package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahbr {
    public static final defpackage.ahbq Companion = new defpackage.ahbq(null);
    private static final defpackage.ahbr NONE = new defpackage.ahbr(null, null, false, false, false, 24, null);
    private final boolean definitelyNotNull;
    private final boolean isMutabilityQualifierForWarning;
    private final boolean isNullabilityQualifierForWarning;
    private final defpackage.ahbs mutability;
    private final defpackage.ahbu nullability;

    public /* synthetic */ ahbr(defpackage.ahbu ahbuVar, defpackage.ahbs ahbsVar, boolean z, boolean z2, boolean z3, int i, defpackage.affu affuVar) {
        this(ahbuVar, ahbsVar, z, z2 & ((i & 8) == 0), z3 & ((i & 16) == 0));
    }

    public static /* synthetic */ defpackage.ahbr copy$default(defpackage.ahbr ahbrVar, defpackage.ahbu ahbuVar, defpackage.ahbs ahbsVar, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            ahbuVar = ahbrVar.nullability;
        }
        if ((i & 2) != 0) {
            ahbsVar = ahbrVar.mutability;
        }
        if ((i & 4) != 0) {
            z = ahbrVar.definitelyNotNull;
        }
        if ((i & 8) != 0) {
            z2 = ahbrVar.isNullabilityQualifierForWarning;
        }
        if ((i & 16) != 0) {
            z3 = ahbrVar.isMutabilityQualifierForWarning;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return ahbrVar.copy(ahbuVar, ahbsVar, z5, z2, z4);
    }

    public final defpackage.ahbr copy(defpackage.ahbu ahbuVar, defpackage.ahbs ahbsVar, boolean z, boolean z2, boolean z3) {
        return new defpackage.ahbr(ahbuVar, ahbsVar, z, z2, z3);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ahbr)) {
            return false;
        }
        defpackage.ahbr ahbrVar = (defpackage.ahbr) obj;
        return this.nullability == ahbrVar.nullability && this.mutability == ahbrVar.mutability && this.definitelyNotNull == ahbrVar.definitelyNotNull && this.isNullabilityQualifierForWarning == ahbrVar.isNullabilityQualifierForWarning && this.isMutabilityQualifierForWarning == ahbrVar.isMutabilityQualifierForWarning;
    }

    public final boolean getDefinitelyNotNull() {
        return this.definitelyNotNull;
    }

    public final defpackage.ahbs getMutability() {
        return this.mutability;
    }

    public final defpackage.ahbu getNullability() {
        return this.nullability;
    }

    public int hashCode() {
        defpackage.ahbu ahbuVar = this.nullability;
        int iHashCode = ahbuVar == null ? 0 : ahbuVar.hashCode();
        defpackage.ahbs ahbsVar = this.mutability;
        return (((((((iHashCode * 31) + (ahbsVar != null ? ahbsVar.hashCode() : 0)) * 31) + defpackage.ahbp.m(this.definitelyNotNull)) * 31) + defpackage.ahbp.m(this.isNullabilityQualifierForWarning)) * 31) + defpackage.ahbp.m(this.isMutabilityQualifierForWarning);
    }

    public final boolean isMutabilityQualifierForWarning() {
        return this.isMutabilityQualifierForWarning;
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.isNullabilityQualifierForWarning;
    }

    public java.lang.String toString() {
        return "JavaTypeQualifiers(nullability=" + this.nullability + ", mutability=" + this.mutability + ", definitelyNotNull=" + this.definitelyNotNull + ", isNullabilityQualifierForWarning=" + this.isNullabilityQualifierForWarning + ", isMutabilityQualifierForWarning=" + this.isMutabilityQualifierForWarning + ')';
    }

    public ahbr(defpackage.ahbu ahbuVar, defpackage.ahbs ahbsVar, boolean z, boolean z2, boolean z3) {
        this.nullability = ahbuVar;
        this.mutability = ahbsVar;
        this.definitelyNotNull = z;
        this.isNullabilityQualifierForWarning = z2;
        this.isMutabilityQualifierForWarning = z3;
    }
}
