package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class agsq {
    private final boolean definitelyNotNull;
    private final ahdf<ahau> nullabilityQualifier;
    private final boolean preferQualifierOverBound;
    private final boolean preferQualifierOverSupertype;
    private final Collection<agrv> qualifierApplicabilityTypes;

    public /* synthetic */ agsq(ahdf ahdfVar, Collection collection, boolean z, boolean z2, boolean z3, int i, afeu afeuVar) {
        this(ahdfVar, collection, (i & 4) != 0 ? ahdfVar.getQualifier() == ahau.NOT_NULL : z, ((i & 8) == 0) & z2, ((i & 16) == 0) & z3);
    }

    public static /* synthetic */ agsq copy$default(agsq agsqVar, ahdf ahdfVar, Collection collection, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            ahdfVar = agsqVar.nullabilityQualifier;
        }
        if ((i & 2) != 0) {
            collection = agsqVar.qualifierApplicabilityTypes;
        }
        if ((i & 4) != 0) {
            z = agsqVar.definitelyNotNull;
        }
        if ((i & 8) != 0) {
            z2 = agsqVar.preferQualifierOverBound;
        }
        if ((i & 16) != 0) {
            z3 = agsqVar.preferQualifierOverSupertype;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return agsqVar.copy(ahdfVar, collection, z5, z2, z4);
    }

    public final agsq copy(ahdf<ahau> ahdfVar, Collection<? extends agrv> collection, boolean z, boolean z2, boolean z3) {
        ahdfVar.getClass();
        collection.getClass();
        return new agsq(ahdfVar, collection, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agsq)) {
            return false;
        }
        agsq agsqVar = (agsq) obj;
        return affa.f(this.nullabilityQualifier, agsqVar.nullabilityQualifier) && affa.f(this.qualifierApplicabilityTypes, agsqVar.qualifierApplicabilityTypes) && this.definitelyNotNull == agsqVar.definitelyNotNull && this.preferQualifierOverBound == agsqVar.preferQualifierOverBound && this.preferQualifierOverSupertype == agsqVar.preferQualifierOverSupertype;
    }

    public final boolean getDefinitelyNotNull() {
        return this.definitelyNotNull;
    }

    public final ahdf<ahau> getNullabilityQualifier() {
        return this.nullabilityQualifier;
    }

    public final boolean getPreferQualifierOverSupertype() {
        return this.preferQualifierOverSupertype;
    }

    public final Collection<agrv> getQualifierApplicabilityTypes() {
        return this.qualifierApplicabilityTypes;
    }

    public int hashCode() {
        int iHashCode = (this.nullabilityQualifier.hashCode() * 31) + this.qualifierApplicabilityTypes.hashCode();
        boolean z = this.preferQualifierOverSupertype;
        return (((((iHashCode * 31) + agsp.m(this.definitelyNotNull)) * 31) + agsp.m(this.preferQualifierOverBound)) * 31) + agsp.m(z);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.nullabilityQualifier + ", qualifierApplicabilityTypes=" + this.qualifierApplicabilityTypes + ", definitelyNotNull=" + this.definitelyNotNull + ", preferQualifierOverBound=" + this.preferQualifierOverBound + ", preferQualifierOverSupertype=" + this.preferQualifierOverSupertype + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public agsq(ahdf<ahau> ahdfVar, Collection<? extends agrv> collection, boolean z, boolean z2, boolean z3) {
        ahdfVar.getClass();
        collection.getClass();
        this.nullabilityQualifier = ahdfVar;
        this.qualifierApplicabilityTypes = collection;
        this.definitelyNotNull = z;
        this.preferQualifierOverBound = z2;
        this.preferQualifierOverSupertype = z3;
    }
}
