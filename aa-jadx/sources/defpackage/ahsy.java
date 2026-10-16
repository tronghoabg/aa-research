package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahsy implements defpackage.ahst {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgh(defpackage.ahsy.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0), new defpackage.afgh(defpackage.ahsy.class, "withDefinedIn", "getWithDefinedIn()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "modifiers", "getModifiers()Ljava/util/Set;", 0), new defpackage.afgh(defpackage.ahsy.class, "startFromName", "getStartFromName()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "debugMode", "getDebugMode()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "verbose", "getVerbose()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "unitReturnType", "getUnitReturnType()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "withoutReturnType", "getWithoutReturnType()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "enhancedTypes", "getEnhancedTypes()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0), new defpackage.afgh(defpackage.ahsy.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0), new defpackage.afgh(defpackage.ahsy.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0), new defpackage.afgh(defpackage.ahsy.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0), new defpackage.afgh(defpackage.ahsy.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0), new defpackage.afgh(defpackage.ahsy.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0), new defpackage.afgh(defpackage.ahsy.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0), new defpackage.afgh(defpackage.ahsy.class, "receiverAfterName", "getReceiverAfterName()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0), new defpackage.afgh(defpackage.ahsy.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0), new defpackage.afgh(defpackage.ahsy.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0), new defpackage.afgh(defpackage.ahsy.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0), new defpackage.afgh(defpackage.ahsy.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0), new defpackage.afgh(defpackage.ahsy.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0), new defpackage.afgh(defpackage.ahsy.class, "informativeErrorType", "getInformativeErrorType()Z", 0)};
    private final defpackage.afhm actualPropertiesInPrimaryConstructor$delegate;
    private final defpackage.afhm alwaysRenderModifiers$delegate;
    private final defpackage.afhm annotationArgumentsRenderingPolicy$delegate;
    private final defpackage.afhm annotationFilter$delegate;
    private final defpackage.afhm boldOnlyForNamesInHtml$delegate;
    private final defpackage.afhm classWithPrimaryConstructor$delegate;
    private final defpackage.afhm classifierNamePolicy$delegate = property(defpackage.ahro.INSTANCE);
    private final defpackage.afhm debugMode$delegate;
    private final defpackage.afhm defaultParameterValueRenderer$delegate;
    private final defpackage.afhm eachAnnotationOnNewLine$delegate;
    private final defpackage.afhm enhancedTypes$delegate;
    private final defpackage.afhm excludedAnnotationClasses$delegate;
    private final defpackage.afhm excludedTypeAnnotationClasses$delegate;
    private final defpackage.afhm includeAdditionalModifiers$delegate;
    private final defpackage.afhm includePropertyConstant$delegate;
    private final defpackage.afhm informativeErrorType$delegate;
    private boolean isLocked;
    private final defpackage.afhm modifiers$delegate;
    private final defpackage.afhm normalizedVisibilities$delegate;
    private final defpackage.afhm overrideRenderingPolicy$delegate;
    private final defpackage.afhm parameterNameRenderingPolicy$delegate;
    private final defpackage.afhm parameterNamesInFunctionalTypes$delegate;
    private final defpackage.afhm presentableUnresolvedTypes$delegate;
    private final defpackage.afhm propertyAccessorRenderingPolicy$delegate;
    private final defpackage.afhm propertyConstantRenderer$delegate;
    private final defpackage.afhm receiverAfterName$delegate;
    private final defpackage.afhm renderAbbreviatedTypeComments$delegate;
    private final defpackage.afhm renderCompanionObjectName$delegate;
    private final defpackage.afhm renderConstructorDelegation$delegate;
    private final defpackage.afhm renderConstructorKeyword$delegate;
    private final defpackage.afhm renderDefaultAnnotationArguments$delegate;
    private final defpackage.afhm renderDefaultModality$delegate;
    private final defpackage.afhm renderDefaultVisibility$delegate;
    private final defpackage.afhm renderFunctionContracts$delegate;
    private final defpackage.afhm renderPrimaryConstructorParametersAsProperties$delegate;
    private final defpackage.afhm renderTypeExpansions$delegate;
    private final defpackage.afhm renderUnabbreviatedType$delegate;
    private final defpackage.afhm secondaryConstructorsAsPrimary$delegate;
    private final defpackage.afhm startFromDeclarationKeyword$delegate;
    private final defpackage.afhm startFromName$delegate;
    private final defpackage.afhm textFormat$delegate;
    private final defpackage.afhm typeNormalizer$delegate;
    private final defpackage.afhm uninferredTypeParameterAsName$delegate;
    private final defpackage.afhm unitReturnType$delegate;
    private final defpackage.afhm valueParametersHandler$delegate;
    private final defpackage.afhm verbose$delegate;
    private final defpackage.afhm withDefinedIn$delegate;
    private final defpackage.afhm withSourceFileForTopLevel$delegate;
    private final defpackage.afhm withoutReturnType$delegate;
    private final defpackage.afhm withoutSuperTypes$delegate;
    private final defpackage.afhm withoutTypeParameters$delegate;

    public ahsy() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.withDefinedIn$delegate = property(bool);
        this.withSourceFileForTopLevel$delegate = property(bool);
        this.modifiers$delegate = property(defpackage.ahsr.ALL_EXCEPT_ANNOTATIONS);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        this.startFromName$delegate = property(bool2);
        this.startFromDeclarationKeyword$delegate = property(bool2);
        this.debugMode$delegate = property(bool2);
        this.classWithPrimaryConstructor$delegate = property(bool2);
        this.verbose$delegate = property(bool2);
        this.unitReturnType$delegate = property(bool);
        this.withoutReturnType$delegate = property(bool2);
        this.enhancedTypes$delegate = property(bool2);
        this.normalizedVisibilities$delegate = property(bool2);
        this.renderDefaultVisibility$delegate = property(bool);
        this.renderDefaultModality$delegate = property(bool);
        this.renderConstructorDelegation$delegate = property(bool2);
        this.renderPrimaryConstructorParametersAsProperties$delegate = property(bool2);
        this.actualPropertiesInPrimaryConstructor$delegate = property(bool2);
        this.uninferredTypeParameterAsName$delegate = property(bool2);
        this.includePropertyConstant$delegate = property(bool2);
        this.propertyConstantRenderer$delegate = property(null);
        this.withoutTypeParameters$delegate = property(bool2);
        this.withoutSuperTypes$delegate = property(bool2);
        this.typeNormalizer$delegate = property(defpackage.ahsv.INSTANCE);
        this.defaultParameterValueRenderer$delegate = property(defpackage.ahsw.INSTANCE);
        this.secondaryConstructorsAsPrimary$delegate = property(bool);
        this.overrideRenderingPolicy$delegate = property(defpackage.ahtb.RENDER_OPEN);
        this.valueParametersHandler$delegate = property(defpackage.ahsc.INSTANCE);
        this.textFormat$delegate = property(defpackage.ahtg.PLAIN);
        this.parameterNameRenderingPolicy$delegate = property(defpackage.ahtc.ALL);
        this.receiverAfterName$delegate = property(bool2);
        this.renderCompanionObjectName$delegate = property(bool2);
        this.propertyAccessorRenderingPolicy$delegate = property(defpackage.ahtd.DEBUG);
        this.renderDefaultAnnotationArguments$delegate = property(bool2);
        this.eachAnnotationOnNewLine$delegate = property(bool2);
        this.excludedAnnotationClasses$delegate = property(defpackage.afcg.a);
        this.excludedTypeAnnotationClasses$delegate = property(defpackage.ahsz.INSTANCE.getInternalAnnotationsForResolve());
        this.annotationFilter$delegate = property(null);
        this.annotationArgumentsRenderingPolicy$delegate = property(defpackage.ahrl.NO_ARGUMENTS);
        this.alwaysRenderModifiers$delegate = property(bool2);
        this.renderConstructorKeyword$delegate = property(bool);
        this.renderUnabbreviatedType$delegate = property(bool);
        this.renderTypeExpansions$delegate = property(bool2);
        this.renderAbbreviatedTypeComments$delegate = property(bool2);
        this.includeAdditionalModifiers$delegate = property(bool);
        this.parameterNamesInFunctionalTypes$delegate = property(bool);
        this.renderFunctionContracts$delegate = property(bool2);
        this.presentableUnresolvedTypes$delegate = property(bool2);
        this.boldOnlyForNamesInHtml$delegate = property(bool2);
        this.informativeErrorType$delegate = property(bool);
    }

    static /* synthetic */ defpackage.aihl accessor$DescriptorRendererOptionsImpl$lambda0(defpackage.aihl aihlVar) {
        typeNormalizer_delegate$lambda$0(aihlVar);
        return aihlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String defaultParameterValueRenderer_delegate$lambda$0(defpackage.agfl agflVar) {
        agflVar.getClass();
        return "...";
    }

    private final <T> defpackage.afhm<defpackage.ahsy, T> property(T t) {
        return new defpackage.ahsx(t, this);
    }

    private static final defpackage.aihl typeNormalizer_delegate$lambda$0(defpackage.aihl aihlVar) {
        aihlVar.getClass();
        return aihlVar;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return ((java.lang.Boolean) this.actualPropertiesInPrimaryConstructor$delegate.getValue(this, $$delegatedProperties[17])).booleanValue();
    }

    public boolean getAlwaysRenderModifiers() {
        return ((java.lang.Boolean) this.alwaysRenderModifiers$delegate.getValue(this, $$delegatedProperties[39])).booleanValue();
    }

    @Override // defpackage.ahst
    public defpackage.ahrl getAnnotationArgumentsRenderingPolicy() {
        return (defpackage.ahrl) this.annotationArgumentsRenderingPolicy$delegate.getValue(this, $$delegatedProperties[38]);
    }

    public defpackage.affc<defpackage.aggc, java.lang.Boolean> getAnnotationFilter() {
        return (defpackage.affc) this.annotationFilter$delegate.getValue(this, $$delegatedProperties[37]);
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return ((java.lang.Boolean) this.boldOnlyForNamesInHtml$delegate.getValue(this, $$delegatedProperties[48])).booleanValue();
    }

    public boolean getClassWithPrimaryConstructor() {
        return ((java.lang.Boolean) this.classWithPrimaryConstructor$delegate.getValue(this, $$delegatedProperties[7])).booleanValue();
    }

    public defpackage.ahrp getClassifierNamePolicy() {
        return (defpackage.ahrp) this.classifierNamePolicy$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // defpackage.ahst
    public boolean getDebugMode() {
        return ((java.lang.Boolean) this.debugMode$delegate.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    public defpackage.affc<defpackage.agfl, java.lang.String> getDefaultParameterValueRenderer() {
        return (defpackage.affc) this.defaultParameterValueRenderer$delegate.getValue(this, $$delegatedProperties[24]);
    }

    public boolean getEachAnnotationOnNewLine() {
        return ((java.lang.Boolean) this.eachAnnotationOnNewLine$delegate.getValue(this, $$delegatedProperties[34])).booleanValue();
    }

    @Override // defpackage.ahst
    public boolean getEnhancedTypes() {
        return ((java.lang.Boolean) this.enhancedTypes$delegate.getValue(this, $$delegatedProperties[11])).booleanValue();
    }

    public java.util.Set<defpackage.ahof> getExcludedAnnotationClasses() {
        return (java.util.Set) this.excludedAnnotationClasses$delegate.getValue(this, $$delegatedProperties[35]);
    }

    @Override // defpackage.ahst
    public java.util.Set<defpackage.ahof> getExcludedTypeAnnotationClasses() {
        return (java.util.Set) this.excludedTypeAnnotationClasses$delegate.getValue(this, $$delegatedProperties[36]);
    }

    public boolean getIncludeAdditionalModifiers() {
        return ((java.lang.Boolean) this.includeAdditionalModifiers$delegate.getValue(this, $$delegatedProperties[44])).booleanValue();
    }

    public /* bridge */ boolean getIncludeAnnotationArguments() {
        return defpackage.ahss.getIncludeAnnotationArguments(this);
    }

    public /* bridge */ boolean getIncludeEmptyAnnotationArguments() {
        return defpackage.ahss.getIncludeEmptyAnnotationArguments(this);
    }

    public boolean getIncludePropertyConstant() {
        return ((java.lang.Boolean) this.includePropertyConstant$delegate.getValue(this, $$delegatedProperties[19])).booleanValue();
    }

    public boolean getInformativeErrorType() {
        return ((java.lang.Boolean) this.informativeErrorType$delegate.getValue(this, $$delegatedProperties[49])).booleanValue();
    }

    public java.util.Set<defpackage.ahsr> getModifiers() {
        return (java.util.Set) this.modifiers$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public boolean getNormalizedVisibilities() {
        return ((java.lang.Boolean) this.normalizedVisibilities$delegate.getValue(this, $$delegatedProperties[12])).booleanValue();
    }

    public defpackage.ahtb getOverrideRenderingPolicy() {
        return (defpackage.ahtb) this.overrideRenderingPolicy$delegate.getValue(this, $$delegatedProperties[26]);
    }

    public defpackage.ahtc getParameterNameRenderingPolicy() {
        return (defpackage.ahtc) this.parameterNameRenderingPolicy$delegate.getValue(this, $$delegatedProperties[29]);
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return ((java.lang.Boolean) this.parameterNamesInFunctionalTypes$delegate.getValue(this, $$delegatedProperties[45])).booleanValue();
    }

    public boolean getPresentableUnresolvedTypes() {
        return ((java.lang.Boolean) this.presentableUnresolvedTypes$delegate.getValue(this, $$delegatedProperties[47])).booleanValue();
    }

    public defpackage.ahtd getPropertyAccessorRenderingPolicy() {
        return (defpackage.ahtd) this.propertyAccessorRenderingPolicy$delegate.getValue(this, $$delegatedProperties[32]);
    }

    public defpackage.affc<defpackage.ahvh<?>, java.lang.String> getPropertyConstantRenderer() {
        return (defpackage.affc) this.propertyConstantRenderer$delegate.getValue(this, $$delegatedProperties[20]);
    }

    public boolean getReceiverAfterName() {
        return ((java.lang.Boolean) this.receiverAfterName$delegate.getValue(this, $$delegatedProperties[30])).booleanValue();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return ((java.lang.Boolean) this.renderAbbreviatedTypeComments$delegate.getValue(this, $$delegatedProperties[43])).booleanValue();
    }

    public boolean getRenderCompanionObjectName() {
        return ((java.lang.Boolean) this.renderCompanionObjectName$delegate.getValue(this, $$delegatedProperties[31])).booleanValue();
    }

    public boolean getRenderConstructorDelegation() {
        return ((java.lang.Boolean) this.renderConstructorDelegation$delegate.getValue(this, $$delegatedProperties[15])).booleanValue();
    }

    public boolean getRenderConstructorKeyword() {
        return ((java.lang.Boolean) this.renderConstructorKeyword$delegate.getValue(this, $$delegatedProperties[40])).booleanValue();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return ((java.lang.Boolean) this.renderDefaultAnnotationArguments$delegate.getValue(this, $$delegatedProperties[33])).booleanValue();
    }

    public boolean getRenderDefaultModality() {
        return ((java.lang.Boolean) this.renderDefaultModality$delegate.getValue(this, $$delegatedProperties[14])).booleanValue();
    }

    public boolean getRenderDefaultVisibility() {
        return ((java.lang.Boolean) this.renderDefaultVisibility$delegate.getValue(this, $$delegatedProperties[13])).booleanValue();
    }

    public boolean getRenderFunctionContracts() {
        return ((java.lang.Boolean) this.renderFunctionContracts$delegate.getValue(this, $$delegatedProperties[46])).booleanValue();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return ((java.lang.Boolean) this.renderPrimaryConstructorParametersAsProperties$delegate.getValue(this, $$delegatedProperties[16])).booleanValue();
    }

    public boolean getRenderTypeExpansions() {
        return ((java.lang.Boolean) this.renderTypeExpansions$delegate.getValue(this, $$delegatedProperties[42])).booleanValue();
    }

    public boolean getRenderUnabbreviatedType() {
        return ((java.lang.Boolean) this.renderUnabbreviatedType$delegate.getValue(this, $$delegatedProperties[41])).booleanValue();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return ((java.lang.Boolean) this.secondaryConstructorsAsPrimary$delegate.getValue(this, $$delegatedProperties[25])).booleanValue();
    }

    public boolean getStartFromDeclarationKeyword() {
        return ((java.lang.Boolean) this.startFromDeclarationKeyword$delegate.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public boolean getStartFromName() {
        return ((java.lang.Boolean) this.startFromName$delegate.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public defpackage.ahtg getTextFormat() {
        return (defpackage.ahtg) this.textFormat$delegate.getValue(this, $$delegatedProperties[28]);
    }

    public defpackage.affc<defpackage.aihl, defpackage.aihl> getTypeNormalizer() {
        return (defpackage.affc) this.typeNormalizer$delegate.getValue(this, $$delegatedProperties[23]);
    }

    public boolean getUninferredTypeParameterAsName() {
        return ((java.lang.Boolean) this.uninferredTypeParameterAsName$delegate.getValue(this, $$delegatedProperties[18])).booleanValue();
    }

    public boolean getUnitReturnType() {
        return ((java.lang.Boolean) this.unitReturnType$delegate.getValue(this, $$delegatedProperties[9])).booleanValue();
    }

    public defpackage.ahsd getValueParametersHandler() {
        return (defpackage.ahsd) this.valueParametersHandler$delegate.getValue(this, $$delegatedProperties[27]);
    }

    public boolean getVerbose() {
        return ((java.lang.Boolean) this.verbose$delegate.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    public boolean getWithDefinedIn() {
        return ((java.lang.Boolean) this.withDefinedIn$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public boolean getWithSourceFileForTopLevel() {
        return ((java.lang.Boolean) this.withSourceFileForTopLevel$delegate.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public boolean getWithoutReturnType() {
        return ((java.lang.Boolean) this.withoutReturnType$delegate.getValue(this, $$delegatedProperties[10])).booleanValue();
    }

    public boolean getWithoutSuperTypes() {
        return ((java.lang.Boolean) this.withoutSuperTypes$delegate.getValue(this, $$delegatedProperties[22])).booleanValue();
    }

    public boolean getWithoutTypeParameters() {
        return ((java.lang.Boolean) this.withoutTypeParameters$delegate.getValue(this, $$delegatedProperties[21])).booleanValue();
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final void lock() {
        this.isLocked = true;
    }

    public void setActualPropertiesInPrimaryConstructor(boolean z) {
        this.actualPropertiesInPrimaryConstructor$delegate.setValue(this, $$delegatedProperties[17], java.lang.Boolean.valueOf(z));
    }

    public void setAlwaysRenderModifiers(boolean z) {
        this.alwaysRenderModifiers$delegate.setValue(this, $$delegatedProperties[39], java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.ahst
    public void setAnnotationArgumentsRenderingPolicy(defpackage.ahrl ahrlVar) {
        ahrlVar.getClass();
        this.annotationArgumentsRenderingPolicy$delegate.setValue(this, $$delegatedProperties[38], ahrlVar);
    }

    public void setAnnotationFilter(defpackage.affc<? super defpackage.aggc, java.lang.Boolean> affcVar) {
        this.annotationFilter$delegate.setValue(this, $$delegatedProperties[37], affcVar);
    }

    public void setBoldOnlyForNamesInHtml(boolean z) {
        this.boldOnlyForNamesInHtml$delegate.setValue(this, $$delegatedProperties[48], java.lang.Boolean.valueOf(z));
    }

    public void setClassWithPrimaryConstructor(boolean z) {
        this.classWithPrimaryConstructor$delegate.setValue(this, $$delegatedProperties[7], java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.ahst
    public void setClassifierNamePolicy(defpackage.ahrp ahrpVar) {
        ahrpVar.getClass();
        this.classifierNamePolicy$delegate.setValue(this, $$delegatedProperties[0], ahrpVar);
    }

    @Override // defpackage.ahst
    public void setDebugMode(boolean z) {
        this.debugMode$delegate.setValue(this, $$delegatedProperties[6], java.lang.Boolean.valueOf(z));
    }

    public void setDefaultParameterValueRenderer(defpackage.affc<? super defpackage.agfl, java.lang.String> affcVar) {
        this.defaultParameterValueRenderer$delegate.setValue(this, $$delegatedProperties[24], affcVar);
    }

    public void setEachAnnotationOnNewLine(boolean z) {
        this.eachAnnotationOnNewLine$delegate.setValue(this, $$delegatedProperties[34], java.lang.Boolean.valueOf(z));
    }

    public void setEnhancedTypes(boolean z) {
        this.enhancedTypes$delegate.setValue(this, $$delegatedProperties[11], java.lang.Boolean.valueOf(z));
    }

    public void setExcludedAnnotationClasses(java.util.Set<defpackage.ahof> set) {
        set.getClass();
        this.excludedAnnotationClasses$delegate.setValue(this, $$delegatedProperties[35], set);
    }

    @Override // defpackage.ahst
    public void setExcludedTypeAnnotationClasses(java.util.Set<defpackage.ahof> set) {
        set.getClass();
        this.excludedTypeAnnotationClasses$delegate.setValue(this, $$delegatedProperties[36], set);
    }

    public void setIncludeAdditionalModifiers(boolean z) {
        this.includeAdditionalModifiers$delegate.setValue(this, $$delegatedProperties[44], java.lang.Boolean.valueOf(z));
    }

    public void setIncludePropertyConstant(boolean z) {
        this.includePropertyConstant$delegate.setValue(this, $$delegatedProperties[19], java.lang.Boolean.valueOf(z));
    }

    public void setInformativeErrorType(boolean z) {
        this.informativeErrorType$delegate.setValue(this, $$delegatedProperties[49], java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.ahst
    public void setModifiers(java.util.Set<? extends defpackage.ahsr> set) {
        set.getClass();
        this.modifiers$delegate.setValue(this, $$delegatedProperties[3], set);
    }

    public void setNormalizedVisibilities(boolean z) {
        this.normalizedVisibilities$delegate.setValue(this, $$delegatedProperties[12], java.lang.Boolean.valueOf(z));
    }

    public void setOverrideRenderingPolicy(defpackage.ahtb ahtbVar) {
        ahtbVar.getClass();
        this.overrideRenderingPolicy$delegate.setValue(this, $$delegatedProperties[26], ahtbVar);
    }

    @Override // defpackage.ahst
    public void setParameterNameRenderingPolicy(defpackage.ahtc ahtcVar) {
        ahtcVar.getClass();
        this.parameterNameRenderingPolicy$delegate.setValue(this, $$delegatedProperties[29], ahtcVar);
    }

    public void setParameterNamesInFunctionalTypes(boolean z) {
        this.parameterNamesInFunctionalTypes$delegate.setValue(this, $$delegatedProperties[45], java.lang.Boolean.valueOf(z));
    }

    public void setPresentableUnresolvedTypes(boolean z) {
        this.presentableUnresolvedTypes$delegate.setValue(this, $$delegatedProperties[47], java.lang.Boolean.valueOf(z));
    }

    public void setPropertyAccessorRenderingPolicy(defpackage.ahtd ahtdVar) {
        ahtdVar.getClass();
        this.propertyAccessorRenderingPolicy$delegate.setValue(this, $$delegatedProperties[32], ahtdVar);
    }

    public void setPropertyConstantRenderer(defpackage.affc<? super defpackage.ahvh<?>, java.lang.String> affcVar) {
        this.propertyConstantRenderer$delegate.setValue(this, $$delegatedProperties[20], affcVar);
    }

    @Override // defpackage.ahst
    public void setReceiverAfterName(boolean z) {
        this.receiverAfterName$delegate.setValue(this, $$delegatedProperties[30], java.lang.Boolean.valueOf(z));
    }

    public void setRenderAbbreviatedTypeComments(boolean z) {
        this.renderAbbreviatedTypeComments$delegate.setValue(this, $$delegatedProperties[43], java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.ahst
    public void setRenderCompanionObjectName(boolean z) {
        this.renderCompanionObjectName$delegate.setValue(this, $$delegatedProperties[31], java.lang.Boolean.valueOf(z));
    }

    public void setRenderConstructorDelegation(boolean z) {
        this.renderConstructorDelegation$delegate.setValue(this, $$delegatedProperties[15], java.lang.Boolean.valueOf(z));
    }

    public void setRenderConstructorKeyword(boolean z) {
        this.renderConstructorKeyword$delegate.setValue(this, $$delegatedProperties[40], java.lang.Boolean.valueOf(z));
    }

    public void setRenderDefaultAnnotationArguments(boolean z) {
        this.renderDefaultAnnotationArguments$delegate.setValue(this, $$delegatedProperties[33], java.lang.Boolean.valueOf(z));
    }

    public void setRenderDefaultModality(boolean z) {
        this.renderDefaultModality$delegate.setValue(this, $$delegatedProperties[14], java.lang.Boolean.valueOf(z));
    }

    public void setRenderDefaultVisibility(boolean z) {
        this.renderDefaultVisibility$delegate.setValue(this, $$delegatedProperties[13], java.lang.Boolean.valueOf(z));
    }

    public void setRenderFunctionContracts(boolean z) {
        this.renderFunctionContracts$delegate.setValue(this, $$delegatedProperties[46], java.lang.Boolean.valueOf(z));
    }

    public void setRenderPrimaryConstructorParametersAsProperties(boolean z) {
        this.renderPrimaryConstructorParametersAsProperties$delegate.setValue(this, $$delegatedProperties[16], java.lang.Boolean.valueOf(z));
    }

    public void setRenderTypeExpansions(boolean z) {
        this.renderTypeExpansions$delegate.setValue(this, $$delegatedProperties[42], java.lang.Boolean.valueOf(z));
    }

    public void setRenderUnabbreviatedType(boolean z) {
        this.renderUnabbreviatedType$delegate.setValue(this, $$delegatedProperties[41], java.lang.Boolean.valueOf(z));
    }

    public void setSecondaryConstructorsAsPrimary(boolean z) {
        this.secondaryConstructorsAsPrimary$delegate.setValue(this, $$delegatedProperties[25], java.lang.Boolean.valueOf(z));
    }

    public void setStartFromDeclarationKeyword(boolean z) {
        this.startFromDeclarationKeyword$delegate.setValue(this, $$delegatedProperties[5], java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.ahst
    public void setStartFromName(boolean z) {
        this.startFromName$delegate.setValue(this, $$delegatedProperties[4], java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.ahst
    public void setTextFormat(defpackage.ahtg ahtgVar) {
        ahtgVar.getClass();
        this.textFormat$delegate.setValue(this, $$delegatedProperties[28], ahtgVar);
    }

    public void setTypeNormalizer(defpackage.affc<? super defpackage.aihl, ? extends defpackage.aihl> affcVar) {
        affcVar.getClass();
        this.typeNormalizer$delegate.setValue(this, $$delegatedProperties[23], affcVar);
    }

    public void setUninferredTypeParameterAsName(boolean z) {
        this.uninferredTypeParameterAsName$delegate.setValue(this, $$delegatedProperties[18], java.lang.Boolean.valueOf(z));
    }

    public void setUnitReturnType(boolean z) {
        this.unitReturnType$delegate.setValue(this, $$delegatedProperties[9], java.lang.Boolean.valueOf(z));
    }

    public void setValueParametersHandler(defpackage.ahsd ahsdVar) {
        ahsdVar.getClass();
        this.valueParametersHandler$delegate.setValue(this, $$delegatedProperties[27], ahsdVar);
    }

    @Override // defpackage.ahst
    public void setVerbose(boolean z) {
        this.verbose$delegate.setValue(this, $$delegatedProperties[8], java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.ahst
    public void setWithDefinedIn(boolean z) {
        this.withDefinedIn$delegate.setValue(this, $$delegatedProperties[1], java.lang.Boolean.valueOf(z));
    }

    public void setWithSourceFileForTopLevel(boolean z) {
        this.withSourceFileForTopLevel$delegate.setValue(this, $$delegatedProperties[2], java.lang.Boolean.valueOf(z));
    }

    public void setWithoutReturnType(boolean z) {
        this.withoutReturnType$delegate.setValue(this, $$delegatedProperties[10], java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.ahst
    public void setWithoutSuperTypes(boolean z) {
        this.withoutSuperTypes$delegate.setValue(this, $$delegatedProperties[22], java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.ahst
    public void setWithoutTypeParameters(boolean z) {
        this.withoutTypeParameters$delegate.setValue(this, $$delegatedProperties[21], java.lang.Boolean.valueOf(z));
    }
}
