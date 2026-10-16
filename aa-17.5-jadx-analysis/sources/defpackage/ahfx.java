package defpackage;

/* loaded from: classes3.dex */
public final class ahfx {
    public static final ahfx CLASS_DECLARATION;
    public static final ahfw Companion = new ahfw(null);
    public static final ahfx DEFAULT;
    public static final ahfx DEFAULT_UAST;
    public static final ahfx GENERIC_ARGUMENT;
    public static final ahfx GENERIC_ARGUMENT_FOR_SUPER_TYPES_AS_IS;
    public static final ahfx GENERIC_ARGUMENT_UAST;
    public static final ahfx INVOKE_DYNAMIC_BOOTSTRAP_ARGUMENT;
    public static final ahfx RETURN_TYPE_BOXED;
    public static final ahfx SUPER_TYPE;
    public static final ahfx SUPER_TYPE_AS_IS;
    public static final ahfx SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;
    public static final ahfx VALUE_FOR_ANNOTATION;
    private final ahfx genericArgumentMode;
    private final ahfx genericContravariantArgumentMode;
    private final ahfx genericInvariantArgumentMode;
    private final boolean ignoreTypeArgumentsBounds;
    private final boolean isForAnnotationParameter;
    private final boolean kotlinCollectionsToJavaCollections;
    private final boolean mapTypeAliases;
    private final boolean needInlineClassWrapping;
    private final boolean needPrimitiveBoxing;
    private final boolean skipDeclarationSiteWildcards;
    private final boolean skipDeclarationSiteWildcardsIfPossible;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        ahfx ahfxVar = new ahfx(z, z2, z3, z4, z5, null, false, null, null, z6, z7, 2047, null);
        GENERIC_ARGUMENT = ahfxVar;
        afeu afeuVar = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        ahfx ahfxVar2 = null;
        ahfx ahfxVar3 = null;
        ahfx ahfxVar4 = new ahfx(z8, z9, z6, z7, z10, null, z11, ahfxVar2, ahfxVar3, false, true, 1023, afeuVar);
        GENERIC_ARGUMENT_FOR_SUPER_TYPES_AS_IS = ahfxVar4;
        boolean z12 = false;
        ahfx ahfxVar5 = new ahfx(z8, z9, z6, z7, z10, 0 == true ? 1 : 0, z11, ahfxVar2, ahfxVar3, true, z12, 1535, afeuVar);
        GENERIC_ARGUMENT_UAST = ahfxVar5;
        RETURN_TYPE_BOXED = new ahfx(z8, true, z6, z7, z10, 0 == true ? 1 : 0, z11, ahfxVar2, ahfxVar3, false, z12, 2045, afeuVar);
        DEFAULT = new ahfx(z, z2, z3, z4, z5, ahfxVar, false, null, null, z6, z7, 2012, 0 == true ? 1 : 0);
        DEFAULT_UAST = new ahfx(false, false, z6, z7, false, ahfxVar5, z11, ahfxVar2, ahfxVar3, true, z12, 1500, afeuVar);
        afeu afeuVar2 = null;
        boolean z13 = false;
        ahfx ahfxVar6 = null;
        ahfx ahfxVar7 = null;
        CLASS_DECLARATION = new ahfx(z, true, z3, z4, z5, ahfxVar, z13, ahfxVar6, ahfxVar7, z6, z7, 2012, afeuVar2);
        boolean z14 = false;
        SUPER_TYPE = new ahfx(z, z14, z3, true, z5, ahfxVar, z13, ahfxVar6, ahfxVar7, z6, z7, 2007, afeuVar2);
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = true;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = true;
        SUPER_TYPE_AS_IS = new ahfx(z15, z16, z6, z17, z18, ahfxVar4, z11, ahfxVar2, ahfxVar3, z19, z20, 983, afeuVar);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new ahfx(z15, z16, z6, z17, z18, ahfxVar4, z11, ahfxVar2, ahfxVar3, z19, z20, 919, afeuVar);
        boolean z21 = true;
        boolean z22 = false;
        ahfx ahfxVar8 = null;
        boolean z23 = false;
        VALUE_FOR_ANNOTATION = new ahfx(z, z14, z21, z22, z5, ahfxVar, false, null, ahfxVar8, z6, z23, 2008, null);
        INVOKE_DYNAMIC_BOOTSTRAP_ARGUMENT = new ahfx(true, z21, z22, z5, false, null, true, ahfxVar8, null, z23, false, 1980, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ahfx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ahfx ahfxVar, boolean z6, ahfx ahfxVar2, ahfx ahfxVar3, boolean z7, boolean z8, int i, afeu afeuVar) {
        boolean z9 = z2 | (!((i & 2) == 0));
        boolean z10 = ((i & 4) == 0) & z3;
        boolean z11 = ((i & 8) == 0) & z4;
        boolean z12 = ((i & 16) == 0) & z5;
        boolean z13 = (!((i & 64) == 0)) | z6;
        int i2 = i & 128;
        ahfx ahfxVar4 = (i & 32) != 0 ? null : ahfxVar;
        this(1 == ((z ? 1 : 0) | (i & 1)), z9, z10, z11, z12, ahfxVar4, z13, i2 != 0 ? ahfxVar4 : ahfxVar2, (i & 256) != 0 ? ahfxVar4 : ahfxVar3, ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0) & z7, ((i & 1024) == 0) & z8);
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.kotlinCollectionsToJavaCollections;
    }

    public final boolean getMapTypeAliases() {
        return this.mapTypeAliases;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.needInlineClassWrapping;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.needPrimitiveBoxing;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    public final ahfx toGenericArgumentMode(aijg aijgVar, boolean z) {
        aijgVar.getClass();
        if (!z || !this.isForAnnotationParameter) {
            int iOrdinal = aijgVar.ordinal();
            if (iOrdinal == 0) {
                ahfx ahfxVar = this.genericInvariantArgumentMode;
                if (ahfxVar != null) {
                    return ahfxVar;
                }
            } else if (iOrdinal != 1) {
                ahfx ahfxVar2 = this.genericArgumentMode;
                if (ahfxVar2 != null) {
                    return ahfxVar2;
                }
            } else {
                ahfx ahfxVar3 = this.genericContravariantArgumentMode;
                if (ahfxVar3 != null) {
                    return ahfxVar3;
                }
            }
        }
        return this;
    }

    public final ahfx wrapInlineClassesMode() {
        return new ahfx(this.needPrimitiveBoxing, true, this.isForAnnotationParameter, this.skipDeclarationSiteWildcards, this.skipDeclarationSiteWildcardsIfPossible, this.genericArgumentMode, this.kotlinCollectionsToJavaCollections, this.genericContravariantArgumentMode, this.genericInvariantArgumentMode, this.mapTypeAliases, this.ignoreTypeArgumentsBounds);
    }

    public ahfx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ahfx ahfxVar, boolean z6, ahfx ahfxVar2, ahfx ahfxVar3, boolean z7, boolean z8) {
        this.needPrimitiveBoxing = z;
        this.needInlineClassWrapping = z2;
        this.isForAnnotationParameter = z3;
        this.skipDeclarationSiteWildcards = z4;
        this.skipDeclarationSiteWildcardsIfPossible = z5;
        this.genericArgumentMode = ahfxVar;
        this.kotlinCollectionsToJavaCollections = z6;
        this.genericContravariantArgumentMode = ahfxVar2;
        this.genericInvariantArgumentMode = ahfxVar3;
        this.mapTypeAliases = z7;
        this.ignoreTypeArgumentsBounds = z8;
    }

    public ahfx() {
        this(false, false, false, false, false, null, false, null, null, false, false, 2047, null);
    }
}
