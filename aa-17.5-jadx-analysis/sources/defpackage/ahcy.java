package defpackage;

/* loaded from: classes3.dex */
final class ahcy extends ahaj<agfc> {
    private final agrv containerApplicabilityType;
    private final agvu containerContext;
    private final boolean isCovariant;
    private final boolean skipRawTypeArguments;
    private final agez typeContainer;

    public ahcy(agez agezVar, boolean z, agvu agvuVar, agrv agrvVar, boolean z2) {
        agvuVar.getClass();
        agrvVar.getClass();
        this.typeContainer = agezVar;
        this.isCovariant = z;
        this.containerContext = agvuVar;
        this.containerApplicabilityType = agrvVar;
        this.skipRawTypeArguments = z2;
    }

    @Override // defpackage.ahaj
    public boolean forceWarning(agfc agfcVar, ailw ailwVar) {
        agfcVar.getClass();
        if ((agfcVar instanceof agvg) && ((agvg) agfcVar).isIdeExternalAnnotation()) {
            return true;
        }
        if ((agfcVar instanceof agwl) && !getEnableImprovementsInStrictMode() && (((agwl) agfcVar).isFreshlySupportedTypeUseAnnotation() || getContainerApplicabilityType() == agrv.TYPE_PARAMETER_BOUNDS)) {
            return true;
        }
        return ailwVar != null && afye.isPrimitiveArray((aigl) ailwVar) && getAnnotationTypeQualifierResolver().isTypeUseAnnotation(agfcVar) && !this.containerContext.getComponents().getSettings().getEnhancePrimitiveArrays();
    }

    @Override // defpackage.ahaj
    public agru<agfc> getAnnotationTypeQualifierResolver() {
        return this.containerContext.getComponents().getAnnotationTypeQualifierResolver();
    }

    @Override // defpackage.ahaj
    public Iterable<agfc> getAnnotations(ailw ailwVar) {
        ailwVar.getClass();
        return ((aigl) ailwVar).getAnnotations();
    }

    @Override // defpackage.ahaj
    public Iterable<agfc> getContainerAnnotations() {
        agfk annotations;
        agez agezVar = this.typeContainer;
        return (agezVar == null || (annotations = agezVar.getAnnotations()) == null) ? afbe.a : annotations;
    }

    @Override // defpackage.ahaj
    public agrv getContainerApplicabilityType() {
        return this.containerApplicabilityType;
    }

    @Override // defpackage.ahaj
    public agte getContainerDefaultTypeQualifiers() {
        return this.containerContext.getDefaultTypeQualifiers();
    }

    @Override // defpackage.ahaj
    public boolean getContainerIsVarargParameter() {
        agez agezVar = this.typeContainer;
        return (agezVar instanceof agel) && ((agel) agezVar).getVarargElementType() != null;
    }

    @Override // defpackage.ahaj
    protected ahdf<ahau> getDefaultNullability(ahdf<ahau> ahdfVar, agsq agsqVar) {
        if (ahdfVar != null) {
            return ahdf.copy$default(ahdfVar, ahau.NOT_NULL, false, 2, null);
        }
        if (agsqVar == null) {
            return null;
        }
        return agsqVar.getNullabilityQualifier();
    }

    @Override // defpackage.ahaj
    public boolean getEnableImprovementsInStrictMode() {
        return this.containerContext.getComponents().getSettings().getTypeEnhancementImprovementsInStrictMode();
    }

    @Override // defpackage.ahaj
    public aigl getEnhancedForWarnings(ailw ailwVar) {
        ailwVar.getClass();
        return aije.getEnhancement((aigl) ailwVar);
    }

    @Override // defpackage.ahaj
    public ahnh getFqNameUnsafe(ailw ailwVar) {
        ailwVar.getClass();
        agba classDescriptor = aijc.getClassDescriptor((aigl) ailwVar);
        if (classDescriptor != null) {
            return ahst.getFqName(classDescriptor);
        }
        return null;
    }

    @Override // defpackage.ahaj
    public boolean getSkipRawTypeArguments() {
        return this.skipRawTypeArguments;
    }

    @Override // defpackage.ahaj
    public boolean isArrayOrPrimitiveArray(ailw ailwVar) {
        ailwVar.getClass();
        return afye.isArrayOrPrimitiveArray((aigl) ailwVar);
    }

    @Override // defpackage.ahaj
    public boolean isCovariant() {
        return this.isCovariant;
    }

    @Override // defpackage.ahaj
    public boolean isEqual(ailw ailwVar, ailw ailwVar2) {
        ailwVar.getClass();
        ailwVar2.getClass();
        return this.containerContext.getComponents().getKotlinTypeChecker().equalTypes((aigl) ailwVar, (aigl) ailwVar2);
    }

    @Override // defpackage.ahaj
    public boolean isFromJava(aime aimeVar) {
        aimeVar.getClass();
        return aimeVar instanceof agyq;
    }

    @Override // defpackage.ahaj
    public boolean isK2() {
        return false;
    }

    @Override // defpackage.ahaj
    public boolean isNotNullTypeParameterCompat(ailw ailwVar) {
        ailwVar.getClass();
        return ((aigl) ailwVar).unwrap() instanceof ahat;
    }

    @Override // defpackage.ahaj
    public aimj getTypeSystem() {
        return aikj.INSTANCE;
    }

    public /* synthetic */ ahcy(agez agezVar, boolean z, agvu agvuVar, agrv agrvVar, boolean z2, int i, afeu afeuVar) {
        this(agezVar, z, agvuVar, agrvVar, z2 & ((i & 16) == 0));
    }
}
