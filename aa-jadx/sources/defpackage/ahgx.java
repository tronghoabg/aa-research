package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahgx {
    public static final defpackage.ahgx CLASS_DECLARATION;
    public static final defpackage.ahgw Companion = new defpackage.ahgw(null);
    public static final defpackage.ahgx DEFAULT;
    public static final defpackage.ahgx DEFAULT_UAST;
    public static final defpackage.ahgx GENERIC_ARGUMENT;
    public static final defpackage.ahgx GENERIC_ARGUMENT_FOR_SUPER_TYPES_AS_IS;
    public static final defpackage.ahgx GENERIC_ARGUMENT_UAST;
    public static final defpackage.ahgx INVOKE_DYNAMIC_BOOTSTRAP_ARGUMENT;
    public static final defpackage.ahgx RETURN_TYPE_BOXED;
    public static final defpackage.ahgx SUPER_TYPE;
    public static final defpackage.ahgx SUPER_TYPE_AS_IS;
    public static final defpackage.ahgx SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;
    public static final defpackage.ahgx VALUE_FOR_ANNOTATION;
    private final defpackage.ahgx genericArgumentMode;
    private final defpackage.ahgx genericContravariantArgumentMode;
    private final defpackage.ahgx genericInvariantArgumentMode;
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
        defpackage.ahgx ahgxVar = new defpackage.ahgx(z, z2, z3, z4, z5, null, false, null, null, z6, z7, 2047, null);
        GENERIC_ARGUMENT = ahgxVar;
        defpackage.affu affuVar = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        defpackage.ahgx ahgxVar2 = null;
        defpackage.ahgx ahgxVar3 = null;
        defpackage.ahgx ahgxVar4 = new defpackage.ahgx(z8, z9, z6, z7, z10, null, z11, ahgxVar2, ahgxVar3, false, true, 1023, affuVar);
        GENERIC_ARGUMENT_FOR_SUPER_TYPES_AS_IS = ahgxVar4;
        boolean z12 = false;
        defpackage.ahgx ahgxVar5 = new defpackage.ahgx(z8, z9, z6, z7, z10, 0 == true ? 1 : 0, z11, ahgxVar2, ahgxVar3, true, z12, 1535, affuVar);
        GENERIC_ARGUMENT_UAST = ahgxVar5;
        RETURN_TYPE_BOXED = new defpackage.ahgx(z8, true, z6, z7, z10, 0 == true ? 1 : 0, z11, ahgxVar2, ahgxVar3, false, z12, 2045, affuVar);
        DEFAULT = new defpackage.ahgx(z, z2, z3, z4, z5, ahgxVar, false, null, null, z6, z7, 2012, 0 == true ? 1 : 0);
        DEFAULT_UAST = new defpackage.ahgx(false, false, z6, z7, false, ahgxVar5, z11, ahgxVar2, ahgxVar3, true, z12, 1500, affuVar);
        defpackage.affu affuVar2 = null;
        boolean z13 = false;
        defpackage.ahgx ahgxVar6 = null;
        defpackage.ahgx ahgxVar7 = null;
        CLASS_DECLARATION = new defpackage.ahgx(z, true, z3, z4, z5, ahgxVar, z13, ahgxVar6, ahgxVar7, z6, z7, 2012, affuVar2);
        boolean z14 = false;
        SUPER_TYPE = new defpackage.ahgx(z, z14, z3, true, z5, ahgxVar, z13, ahgxVar6, ahgxVar7, z6, z7, 2007, affuVar2);
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = true;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = true;
        SUPER_TYPE_AS_IS = new defpackage.ahgx(z15, z16, z6, z17, z18, ahgxVar4, z11, ahgxVar2, ahgxVar3, z19, z20, 983, affuVar);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new defpackage.ahgx(z15, z16, z6, z17, z18, ahgxVar4, z11, ahgxVar2, ahgxVar3, z19, z20, 919, affuVar);
        boolean z21 = true;
        boolean z22 = false;
        defpackage.ahgx ahgxVar8 = null;
        boolean z23 = false;
        VALUE_FOR_ANNOTATION = new defpackage.ahgx(z, z14, z21, z22, z5, ahgxVar, false, null, ahgxVar8, z6, z23, 2008, null);
        INVOKE_DYNAMIC_BOOTSTRAP_ARGUMENT = new defpackage.ahgx(true, z21, z22, z5, false, null, true, ahgxVar8, null, z23, false, 1980, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ahgx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, defpackage.ahgx ahgxVar, boolean z6, defpackage.ahgx ahgxVar2, defpackage.ahgx ahgxVar3, boolean z7, boolean z8, int i, defpackage.affu affuVar) {
        boolean z9 = z2 | (!((i & 2) == 0));
        boolean z10 = ((i & 4) == 0) & z3;
        boolean z11 = ((i & 8) == 0) & z4;
        boolean z12 = ((i & 16) == 0) & z5;
        boolean z13 = (!((i & 64) == 0)) | z6;
        int i2 = i & 128;
        defpackage.ahgx ahgxVar4 = (i & 32) != 0 ? null : ahgxVar;
        this(1 == ((z ? 1 : 0) | (i & 1)), z9, z10, z11, z12, ahgxVar4, z13, i2 != 0 ? ahgxVar4 : ahgxVar2, (i & 256) != 0 ? ahgxVar4 : ahgxVar3, ((i & defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE) == 0) & z7, ((i & 1024) == 0) & z8);
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

    public final defpackage.ahgx toGenericArgumentMode(defpackage.aikg aikgVar, boolean z) {
        aikgVar.getClass();
        if (!z || !this.isForAnnotationParameter) {
            int iOrdinal = aikgVar.ordinal();
            if (iOrdinal == 0) {
                defpackage.ahgx ahgxVar = this.genericInvariantArgumentMode;
                if (ahgxVar != null) {
                    return ahgxVar;
                }
            } else if (iOrdinal != 1) {
                defpackage.ahgx ahgxVar2 = this.genericArgumentMode;
                if (ahgxVar2 != null) {
                    return ahgxVar2;
                }
            } else {
                defpackage.ahgx ahgxVar3 = this.genericContravariantArgumentMode;
                if (ahgxVar3 != null) {
                    return ahgxVar3;
                }
            }
        }
        return this;
    }

    public final defpackage.ahgx wrapInlineClassesMode() {
        return new defpackage.ahgx(this.needPrimitiveBoxing, true, this.isForAnnotationParameter, this.skipDeclarationSiteWildcards, this.skipDeclarationSiteWildcardsIfPossible, this.genericArgumentMode, this.kotlinCollectionsToJavaCollections, this.genericContravariantArgumentMode, this.genericInvariantArgumentMode, this.mapTypeAliases, this.ignoreTypeArgumentsBounds);
    }

    public ahgx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, defpackage.ahgx ahgxVar, boolean z6, defpackage.ahgx ahgxVar2, defpackage.ahgx ahgxVar3, boolean z7, boolean z8) {
        this.needPrimitiveBoxing = z;
        this.needInlineClassWrapping = z2;
        this.isForAnnotationParameter = z3;
        this.skipDeclarationSiteWildcards = z4;
        this.skipDeclarationSiteWildcardsIfPossible = z5;
        this.genericArgumentMode = ahgxVar;
        this.kotlinCollectionsToJavaCollections = z6;
        this.genericContravariantArgumentMode = ahgxVar2;
        this.genericInvariantArgumentMode = ahgxVar3;
        this.mapTypeAliases = z7;
        this.ignoreTypeArgumentsBounds = z8;
    }

    public ahgx() {
        this(false, false, false, false, false, null, false, null, null, false, false, 2047, null);
    }
}
