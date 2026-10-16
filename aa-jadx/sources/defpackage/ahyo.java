package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahyo implements defpackage.ahye {
    private final defpackage.afar _allDescriptors$delegate;
    private final defpackage.aijy capturingSubstitutor;
    private java.util.Map<defpackage.agci, defpackage.agci> substitutedDescriptors;
    private final defpackage.afar substitutor$delegate;
    private final defpackage.ahye workerScope;

    public ahyo(defpackage.ahye ahyeVar, defpackage.aijy aijyVar) {
        ahyeVar.getClass();
        aijyVar.getClass();
        this.workerScope = ahyeVar;
        this.substitutor$delegate = defpackage.afga.cA(new defpackage.ahym(aijyVar));
        defpackage.aijt substitution = aijyVar.getSubstitution();
        substitution.getClass();
        this.capturingSubstitutor = defpackage.ahva.wrapWithCapturingSubstitution(substitution, 1 == ((false ? 1 : 0) | (1 & 1))).buildSubstitutor();
        this._allDescriptors$delegate = defpackage.afga.cA(new defpackage.ahyn(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Collection _allDescriptors_delegate$lambda$0(defpackage.ahyo ahyoVar) {
        return ahyoVar.substitute(defpackage.ahyh.getContributedDescriptors$default(ahyoVar.workerScope, null, null, 3, null));
    }

    private final java.util.Collection<defpackage.agci> get_allDescriptors() {
        return (java.util.Collection) this._allDescriptors$delegate.a();
    }

    private final <D extends defpackage.agci> D substitute(D d) {
        if (this.capturingSubstitutor.isEmpty()) {
            return d;
        }
        if (this.substitutedDescriptors == null) {
            this.substitutedDescriptors = new java.util.HashMap();
        }
        java.util.Map<defpackage.agci, defpackage.agci> map = this.substitutedDescriptors;
        map.getClass();
        defpackage.agci agciVarSubstitute = map.get(d);
        if (agciVarSubstitute == null) {
            if (!(d instanceof defpackage.agfa)) {
                java.util.Objects.toString(d);
                throw new java.lang.IllegalStateException("Unknown descriptor in scope: ".concat(java.lang.String.valueOf(d)));
            }
            agciVarSubstitute = ((defpackage.agfa) d).substitute(this.capturingSubstitutor);
            if (agciVarSubstitute == null) {
                throw new java.lang.AssertionError(defpackage.a.bl(d, "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", " substitution fails"));
            }
            map.put(d, agciVarSubstitute);
        }
        return (D) agciVarSubstitute;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aijy substitutor_delegate$lambda$0(defpackage.aijy aijyVar) {
        return aijyVar.getSubstitution().buildSubstitutor();
    }

    @Override // defpackage.ahye
    public java.util.Set<defpackage.ahoj> getClassifierNames() {
        return this.workerScope.getClassifierNames();
    }

    @Override // defpackage.ahyi
    public defpackage.agcd getContributedClassifier(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        defpackage.agcd contributedClassifier = this.workerScope.getContributedClassifier(ahojVar, agmoVar);
        if (contributedClassifier != null) {
            return (defpackage.agcd) substitute(contributedClassifier);
        }
        return null;
    }

    @Override // defpackage.ahyi
    public java.util.Collection<defpackage.agci> getContributedDescriptors(defpackage.ahxt ahxtVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar) {
        ahxtVar.getClass();
        affcVar.getClass();
        return get_allDescriptors();
    }

    @Override // defpackage.ahye, defpackage.ahyi
    public java.util.Collection<? extends defpackage.agev> getContributedFunctions(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        return substitute(this.workerScope.getContributedFunctions(ahojVar, agmoVar));
    }

    @Override // defpackage.ahye
    public java.util.Collection<? extends defpackage.agen> getContributedVariables(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        return substitute(this.workerScope.getContributedVariables(ahojVar, agmoVar));
    }

    @Override // defpackage.ahye
    public java.util.Set<defpackage.ahoj> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @Override // defpackage.ahye
    public java.util.Set<defpackage.ahoj> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    @Override // defpackage.ahyi
    /* JADX INFO: renamed from: recordLookup */
    public /* bridge */ void mo95recordLookup(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        defpackage.ahyc.recordLookup(this, ahojVar, agmoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <D extends defpackage.agci> java.util.Collection<D> substitute(java.util.Collection<? extends D> collection) {
        if (this.capturingSubstitutor.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        java.util.LinkedHashSet linkedHashSetNewLinkedHashSetWithExpectedSize = defpackage.aipw.newLinkedHashSetWithExpectedSize(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetNewLinkedHashSetWithExpectedSize.add(substitute((defpackage.agci) it.next()));
        }
        return linkedHashSetNewLinkedHashSetWithExpectedSize;
    }
}
