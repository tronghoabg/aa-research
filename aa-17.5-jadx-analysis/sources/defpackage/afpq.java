package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class afpq {
    public static final afpp Companion = new afpp(null);
    public static final afpq EMPTY = new afpq(null, null, null, null, afbe.a, false, false, false, false);
    private final aiqu classTypeParametersSubstitutor;
    private final boolean forceIsExternal;
    private final boolean forceIsInfix;
    private final boolean forceIsInline;
    private final boolean forceIsOperator;
    private final Boolean isStatic;
    private final agox modality;
    private final List<afic> originalCallableTypeParameters;
    private final afrj originalContainerIfFakeOverride;

    /* JADX WARN: Multi-variable type inference failed */
    public afpq(aiqu aiquVar, agox agoxVar, Boolean bool, afrj afrjVar, List<? extends afic> list, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        this.classTypeParametersSubstitutor = aiquVar;
        this.modality = agoxVar;
        this.isStatic = bool;
        this.originalContainerIfFakeOverride = afrjVar;
        this.originalCallableTypeParameters = list;
        this.forceIsExternal = z;
        this.forceIsOperator = z2;
        this.forceIsInfix = z3;
        this.forceIsInline = z4;
    }

    public static /* synthetic */ afpq copy$default(afpq afpqVar, aiqu aiquVar, agox agoxVar, Boolean bool, afrj afrjVar, List list, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            aiquVar = afpqVar.classTypeParametersSubstitutor;
        }
        if ((i & 2) != 0) {
            agoxVar = afpqVar.modality;
        }
        if ((i & 4) != 0) {
            bool = afpqVar.isStatic;
        }
        if ((i & 8) != 0) {
            afrjVar = afpqVar.originalContainerIfFakeOverride;
        }
        if ((i & 16) != 0) {
            list = afpqVar.originalCallableTypeParameters;
        }
        if ((i & 32) != 0) {
            z = afpqVar.forceIsExternal;
        }
        if ((i & 64) != 0) {
            z2 = afpqVar.forceIsOperator;
        }
        if ((i & 128) != 0) {
            z3 = afpqVar.forceIsInfix;
        }
        if ((i & 256) != 0) {
            z4 = afpqVar.forceIsInline;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z;
        boolean z8 = z2;
        List list2 = list;
        Boolean bool2 = bool;
        return afpqVar.copy(aiquVar, agoxVar, bool2, afrjVar, list2, z7, z8, z5, z6);
    }

    public final afpq copy(aiqu aiquVar, agox agoxVar, Boolean bool, afrj afrjVar, List<? extends afic> list, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        return new afpq(aiquVar, agoxVar, bool, afrjVar, list, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afpq)) {
            return false;
        }
        afpq afpqVar = (afpq) obj;
        return affa.f(this.classTypeParametersSubstitutor, afpqVar.classTypeParametersSubstitutor) && this.modality == afpqVar.modality && affa.f(this.isStatic, afpqVar.isStatic) && affa.f(this.originalContainerIfFakeOverride, afpqVar.originalContainerIfFakeOverride) && affa.f(this.originalCallableTypeParameters, afpqVar.originalCallableTypeParameters) && this.forceIsExternal == afpqVar.forceIsExternal && this.forceIsOperator == afpqVar.forceIsOperator && this.forceIsInfix == afpqVar.forceIsInfix && this.forceIsInline == afpqVar.forceIsInline;
    }

    public final boolean getForceIsExternal() {
        return this.forceIsExternal;
    }

    public final boolean getForceIsInfix() {
        return this.forceIsInfix;
    }

    public final boolean getForceIsInline() {
        return this.forceIsInline;
    }

    public final boolean getForceIsOperator() {
        return this.forceIsOperator;
    }

    public final agox getModality() {
        return this.modality;
    }

    public final afrj getOriginalContainerIfFakeOverride() {
        return this.originalContainerIfFakeOverride;
    }

    public final aiqu getTypeSubstitutor(List<? extends afic> list, String str) {
        list.getClass();
        str.getClass();
        aiqu aiquVarSubstitutedWith = afmz.substitutedWith(this.originalCallableTypeParameters, list);
        if (aiquVarSubstitutedWith != null) {
            aiqu empty = this.classTypeParametersSubstitutor;
            if (empty == null) {
                empty = aiqu.Companion.getEMPTY();
            }
            aiqu aiquVarDisjointSumWith = aiquVarSubstitutedWith.disjointSumWith(empty, str);
            if (aiquVarDisjointSumWith != null) {
                return aiquVarDisjointSumWith;
            }
        }
        aiqu aiquVar = this.classTypeParametersSubstitutor;
        return aiquVar == null ? aiqu.Companion.getEMPTY() : aiquVar;
    }

    public int hashCode() {
        aiqu aiquVar = this.classTypeParametersSubstitutor;
        int iHashCode = aiquVar == null ? 0 : aiquVar.hashCode();
        agox agoxVar = this.modality;
        int iHashCode2 = agoxVar == null ? 0 : agoxVar.hashCode();
        int i = iHashCode * 31;
        Boolean bool = this.isStatic;
        int iHashCode3 = (((i + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode())) * 31;
        afrj afrjVar = this.originalContainerIfFakeOverride;
        return ((((((((((iHashCode3 + (afrjVar != null ? afrjVar.hashCode() : 0)) * 31) + this.originalCallableTypeParameters.hashCode()) * 31) + afpo.m(this.forceIsExternal)) * 31) + afpo.m(this.forceIsOperator)) * 31) + afpo.m(this.forceIsInfix)) * 31) + afpo.m(this.forceIsInline);
    }

    public final boolean isFakeOverride() {
        return this.originalContainerIfFakeOverride != null;
    }

    public final Boolean isStatic() {
        return this.isStatic;
    }

    public String toString() {
        return "KCallableOverriddenStorage(classTypeParametersSubstitutor=" + this.classTypeParametersSubstitutor + ", modality=" + this.modality + ", isStatic=" + this.isStatic + ", originalContainerIfFakeOverride=" + this.originalContainerIfFakeOverride + ", originalCallableTypeParameters=" + this.originalCallableTypeParameters + ", forceIsExternal=" + this.forceIsExternal + ", forceIsOperator=" + this.forceIsOperator + ", forceIsInfix=" + this.forceIsInfix + ", forceIsInline=" + this.forceIsInline + ')';
    }

    public final afpq withChainedClassTypeParametersSubstitutor(aiqu aiquVar) {
        aiqu aiquVarChainedWith;
        aiquVar.getClass();
        aiqu aiquVar2 = this.classTypeParametersSubstitutor;
        return copy$default(this, (aiquVar2 == null || (aiquVarChainedWith = aiquVar2.chainedWith(aiquVar)) == null) ? aiquVar : aiquVarChainedWith, null, null, null, null, false, false, false, false, 510, null);
    }
}
