package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aihk implements defpackage.aijd, defpackage.aind {
    private defpackage.aihl alternative;
    private final int hashCode;
    private final java.util.LinkedHashSet<defpackage.aihl> intersectedTypes;

    public aihk(java.util.Collection<? extends defpackage.aihl> collection) {
        collection.getClass();
        collection.isEmpty();
        java.util.LinkedHashSet<defpackage.aihl> linkedHashSet = new java.util.LinkedHashSet<>(collection);
        this.intersectedTypes = linkedHashSet;
        this.hashCode = linkedHashSet.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aihw createType$lambda$0(defpackage.aihk aihkVar, defpackage.aiku aikuVar) {
        aikuVar.getClass();
        return aihkVar.refine(aikuVar).createType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String makeDebugNameForIntersectionType$default(defpackage.aihk aihkVar, defpackage.affc affcVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            affcVar = defpackage.aihh.INSTANCE;
        }
        return aihkVar.makeDebugNameForIntersectionType(affcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String makeDebugNameForIntersectionType$lambda$0(defpackage.aihl aihlVar) {
        aihlVar.getClass();
        return aihlVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence makeDebugNameForIntersectionType$lambda$2(defpackage.affc affcVar, defpackage.aihl aihlVar) {
        aihlVar.getClass();
        return affcVar.invoke(aihlVar).toString();
    }

    public final defpackage.ahye createScopeForKotlinType() {
        return defpackage.ahyt.Companion.create("member scope for intersection type", this.intersectedTypes);
    }

    public final defpackage.aihw createType() {
        return defpackage.aihq.simpleTypeWithNonTrivialMemberScope(defpackage.aiir.Companion.getEmpty(), this, defpackage.afce.a, false, createScopeForKotlinType(), new defpackage.aihi(this));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aihk) {
            return defpackage.afga.f(this.intersectedTypes, ((defpackage.aihk) obj).intersectedTypes);
        }
        return false;
    }

    public final defpackage.aihl getAlternativeType() {
        return this.alternative;
    }

    @Override // defpackage.aijd
    public defpackage.afze getBuiltIns() {
        defpackage.afze builtIns = this.intersectedTypes.iterator().next().getConstructor().getBuiltIns();
        builtIns.getClass();
        return builtIns;
    }

    @Override // defpackage.aijd
    public defpackage.agcd getDeclarationDescriptor() {
        return null;
    }

    @Override // defpackage.aijd
    public java.util.List<defpackage.agfe> getParameters() {
        return defpackage.afce.a;
    }

    @Override // defpackage.aijd
    /* JADX INFO: renamed from: getSupertypes */
    public java.util.Collection<defpackage.aihl> mo89getSupertypes() {
        return this.intersectedTypes;
    }

    public int hashCode() {
        return this.hashCode;
    }

    @Override // defpackage.aijd
    public boolean isDenotable() {
        return false;
    }

    public final java.lang.String makeDebugNameForIntersectionType(defpackage.affc<? super defpackage.aihl, ? extends java.lang.Object> affcVar) {
        affcVar.getClass();
        return defpackage.afga.bo(defpackage.afga.aW(this.intersectedTypes, new defpackage.aihj(affcVar)), " & ", "{", "}", new defpackage.aihg(affcVar), 24);
    }

    @Override // defpackage.aijd
    public defpackage.aihk refine(defpackage.aiku aikuVar) {
        aikuVar.getClass();
        java.util.Collection<defpackage.aihl> collectionMo89getSupertypes = mo89getSupertypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(collectionMo89getSupertypes, 10));
        java.util.Iterator<T> it = collectionMo89getSupertypes.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((defpackage.aihl) it.next()).refine(aikuVar));
            z = true;
        }
        defpackage.aihk alternative = null;
        if (z) {
            defpackage.aihl alternativeType = getAlternativeType();
            alternative = new defpackage.aihk(arrayList).setAlternative(alternativeType != null ? alternativeType.refine(aikuVar) : null);
        }
        return alternative == null ? this : alternative;
    }

    public final defpackage.aihk setAlternative(defpackage.aihl aihlVar) {
        return new defpackage.aihk(this.intersectedTypes, aihlVar);
    }

    public java.lang.String toString() {
        return makeDebugNameForIntersectionType$default(this, null, 1, null);
    }

    private aihk(java.util.Collection<? extends defpackage.aihl> collection, defpackage.aihl aihlVar) {
        this(collection);
        this.alternative = aihlVar;
    }
}
