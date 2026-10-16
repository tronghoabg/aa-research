package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afqq {
    public static final defpackage.afqp Companion = new defpackage.afqp(null);
    public static final defpackage.afqq EMPTY = new defpackage.afqq(null, null, null, null, defpackage.afce.a, false, false, false, false);
    private final defpackage.airu classTypeParametersSubstitutor;
    private final boolean forceIsExternal;
    private final boolean forceIsInfix;
    private final boolean forceIsInline;
    private final boolean forceIsOperator;
    private final java.lang.Boolean isStatic;
    private final defpackage.agpx modality;
    private final java.util.List<defpackage.afjc> originalCallableTypeParameters;
    private final defpackage.afsj originalContainerIfFakeOverride;

    /* JADX WARN: Multi-variable type inference failed */
    public afqq(defpackage.airu airuVar, defpackage.agpx agpxVar, java.lang.Boolean bool, defpackage.afsj afsjVar, java.util.List<? extends defpackage.afjc> list, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        this.classTypeParametersSubstitutor = airuVar;
        this.modality = agpxVar;
        this.isStatic = bool;
        this.originalContainerIfFakeOverride = afsjVar;
        this.originalCallableTypeParameters = list;
        this.forceIsExternal = z;
        this.forceIsOperator = z2;
        this.forceIsInfix = z3;
        this.forceIsInline = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ defpackage.afqq copy$default(defpackage.afqq afqqVar, defpackage.airu airuVar, defpackage.agpx agpxVar, java.lang.Boolean bool, defpackage.afsj afsjVar, java.util.List list, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            airuVar = afqqVar.classTypeParametersSubstitutor;
        }
        if ((i & 2) != 0) {
            agpxVar = afqqVar.modality;
        }
        if ((i & 4) != 0) {
            bool = afqqVar.isStatic;
        }
        if ((i & 8) != 0) {
            afsjVar = afqqVar.originalContainerIfFakeOverride;
        }
        if ((i & 16) != 0) {
            list = afqqVar.originalCallableTypeParameters;
        }
        if ((i & 32) != 0) {
            z = afqqVar.forceIsExternal;
        }
        if ((i & 64) != 0) {
            z2 = afqqVar.forceIsOperator;
        }
        if ((i & 128) != 0) {
            z3 = afqqVar.forceIsInfix;
        }
        if ((i & 256) != 0) {
            z4 = afqqVar.forceIsInline;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z;
        boolean z8 = z2;
        java.util.List list2 = list;
        java.lang.Boolean bool2 = bool;
        return afqqVar.copy(airuVar, agpxVar, bool2, afsjVar, list2, z7, z8, z5, z6);
    }

    public final defpackage.afqq copy(defpackage.airu airuVar, defpackage.agpx agpxVar, java.lang.Boolean bool, defpackage.afsj afsjVar, java.util.List<? extends defpackage.afjc> list, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        return new defpackage.afqq(airuVar, agpxVar, bool, afsjVar, list, z, z2, z3, z4);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.afqq)) {
            return false;
        }
        defpackage.afqq afqqVar = (defpackage.afqq) obj;
        return defpackage.afga.f(this.classTypeParametersSubstitutor, afqqVar.classTypeParametersSubstitutor) && this.modality == afqqVar.modality && defpackage.afga.f(this.isStatic, afqqVar.isStatic) && defpackage.afga.f(this.originalContainerIfFakeOverride, afqqVar.originalContainerIfFakeOverride) && defpackage.afga.f(this.originalCallableTypeParameters, afqqVar.originalCallableTypeParameters) && this.forceIsExternal == afqqVar.forceIsExternal && this.forceIsOperator == afqqVar.forceIsOperator && this.forceIsInfix == afqqVar.forceIsInfix && this.forceIsInline == afqqVar.forceIsInline;
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

    public final defpackage.agpx getModality() {
        return this.modality;
    }

    public final defpackage.afsj getOriginalContainerIfFakeOverride() {
        return this.originalContainerIfFakeOverride;
    }

    public final defpackage.airu getTypeSubstitutor(java.util.List<? extends defpackage.afjc> list, java.lang.String str) {
        list.getClass();
        str.getClass();
        defpackage.airu airuVarSubstitutedWith = defpackage.afnz.substitutedWith(this.originalCallableTypeParameters, list);
        if (airuVarSubstitutedWith != null) {
            defpackage.airu empty = this.classTypeParametersSubstitutor;
            if (empty == null) {
                empty = defpackage.airu.Companion.getEMPTY();
            }
            defpackage.airu airuVarDisjointSumWith = airuVarSubstitutedWith.disjointSumWith(empty, str);
            if (airuVarDisjointSumWith != null) {
                return airuVarDisjointSumWith;
            }
        }
        defpackage.airu airuVar = this.classTypeParametersSubstitutor;
        return airuVar == null ? defpackage.airu.Companion.getEMPTY() : airuVar;
    }

    public int hashCode() {
        defpackage.airu airuVar = this.classTypeParametersSubstitutor;
        int iHashCode = airuVar == null ? 0 : airuVar.hashCode();
        defpackage.agpx agpxVar = this.modality;
        int iHashCode2 = agpxVar == null ? 0 : agpxVar.hashCode();
        int i = iHashCode * 31;
        java.lang.Boolean bool = this.isStatic;
        int iHashCode3 = (((i + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode())) * 31;
        defpackage.afsj afsjVar = this.originalContainerIfFakeOverride;
        return ((((((((((iHashCode3 + (afsjVar != null ? afsjVar.hashCode() : 0)) * 31) + this.originalCallableTypeParameters.hashCode()) * 31) + defpackage.afqo.m(this.forceIsExternal)) * 31) + defpackage.afqo.m(this.forceIsOperator)) * 31) + defpackage.afqo.m(this.forceIsInfix)) * 31) + defpackage.afqo.m(this.forceIsInline);
    }

    public final boolean isFakeOverride() {
        return this.originalContainerIfFakeOverride != null;
    }

    public final java.lang.Boolean isStatic() {
        return this.isStatic;
    }

    public java.lang.String toString() {
        return "KCallableOverriddenStorage(classTypeParametersSubstitutor=" + this.classTypeParametersSubstitutor + ", modality=" + this.modality + ", isStatic=" + this.isStatic + ", originalContainerIfFakeOverride=" + this.originalContainerIfFakeOverride + ", originalCallableTypeParameters=" + this.originalCallableTypeParameters + ", forceIsExternal=" + this.forceIsExternal + ", forceIsOperator=" + this.forceIsOperator + ", forceIsInfix=" + this.forceIsInfix + ", forceIsInline=" + this.forceIsInline + ')';
    }

    public final defpackage.afqq withChainedClassTypeParametersSubstitutor(defpackage.airu airuVar) {
        defpackage.airu airuVarChainedWith;
        airuVar.getClass();
        defpackage.airu airuVar2 = this.classTypeParametersSubstitutor;
        return copy$default(this, (airuVar2 == null || (airuVarChainedWith = airuVar2.chainedWith(airuVar)) == null) ? airuVar : airuVarChainedWith, null, null, null, null, false, false, false, false, 510, null);
    }
}
