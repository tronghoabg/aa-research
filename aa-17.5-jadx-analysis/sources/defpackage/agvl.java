package defpackage;

/* loaded from: classes3.dex */
public final class agvl {
    private final agrw annotationTypeQualifierResolver;
    private final ahen deserializedDescriptorResolver;
    private final ahzh errorReporter;
    private final agsm finder;
    private final agso javaClassesTracker;
    private final agsx javaModuleResolver;
    private final agun javaPropertyInitializerEvaluator;
    private final agup javaResolverCache;
    private final agtd javaTypeEnhancementState;
    private final ahfc kotlinClassFinder;
    private final aike kotlinTypeChecker;
    private final aglq lookupTracker;
    private final agcu module;
    private final agvx moduleClassResolver;
    private final ahfr packagePartProvider;
    private final afym reflectionTypes;
    private final ahwh samConversionResolver;
    private final agvo settings;
    private final ahcu signatureEnhancement;
    private final aguw signaturePropagator;
    private final agze sourceElementFactory;
    private final aiei storageManager;
    private final agec supertypeLoopChecker;
    private final ahwg syntheticPartsProvider;

    public agvl(aiei aieiVar, agsm agsmVar, ahfc ahfcVar, ahen ahenVar, aguw aguwVar, ahzh ahzhVar, agup agupVar, agun agunVar, ahwh ahwhVar, agze agzeVar, agvx agvxVar, ahfr ahfrVar, agec agecVar, aglq aglqVar, agcu agcuVar, afym afymVar, agrw agrwVar, ahcu ahcuVar, agso agsoVar, agvo agvoVar, aike aikeVar, agtd agtdVar, agsx agsxVar, ahwg ahwgVar) {
        aieiVar.getClass();
        agsmVar.getClass();
        ahfcVar.getClass();
        ahenVar.getClass();
        aguwVar.getClass();
        ahzhVar.getClass();
        agupVar.getClass();
        agunVar.getClass();
        ahwhVar.getClass();
        agzeVar.getClass();
        agvxVar.getClass();
        ahfrVar.getClass();
        agecVar.getClass();
        aglqVar.getClass();
        agcuVar.getClass();
        afymVar.getClass();
        agrwVar.getClass();
        ahcuVar.getClass();
        agsoVar.getClass();
        agvoVar.getClass();
        aikeVar.getClass();
        agtdVar.getClass();
        agsxVar.getClass();
        ahwgVar.getClass();
        this.storageManager = aieiVar;
        this.finder = agsmVar;
        this.kotlinClassFinder = ahfcVar;
        this.deserializedDescriptorResolver = ahenVar;
        this.signaturePropagator = aguwVar;
        this.errorReporter = ahzhVar;
        this.javaResolverCache = agupVar;
        this.javaPropertyInitializerEvaluator = agunVar;
        this.samConversionResolver = ahwhVar;
        this.sourceElementFactory = agzeVar;
        this.moduleClassResolver = agvxVar;
        this.packagePartProvider = ahfrVar;
        this.supertypeLoopChecker = agecVar;
        this.lookupTracker = aglqVar;
        this.module = agcuVar;
        this.reflectionTypes = afymVar;
        this.annotationTypeQualifierResolver = agrwVar;
        this.signatureEnhancement = ahcuVar;
        this.javaClassesTracker = agsoVar;
        this.settings = agvoVar;
        this.kotlinTypeChecker = aikeVar;
        this.javaTypeEnhancementState = agtdVar;
        this.javaModuleResolver = agsxVar;
        this.syntheticPartsProvider = ahwgVar;
    }

    public final agrw getAnnotationTypeQualifierResolver() {
        return this.annotationTypeQualifierResolver;
    }

    public final ahen getDeserializedDescriptorResolver() {
        return this.deserializedDescriptorResolver;
    }

    public final ahzh getErrorReporter() {
        return this.errorReporter;
    }

    public final agsm getFinder() {
        return this.finder;
    }

    public final agso getJavaClassesTracker() {
        return this.javaClassesTracker;
    }

    public final agsx getJavaModuleResolver() {
        return this.javaModuleResolver;
    }

    public final agun getJavaPropertyInitializerEvaluator() {
        return this.javaPropertyInitializerEvaluator;
    }

    public final agup getJavaResolverCache() {
        return this.javaResolverCache;
    }

    public final agtd getJavaTypeEnhancementState() {
        return this.javaTypeEnhancementState;
    }

    public final ahfc getKotlinClassFinder() {
        return this.kotlinClassFinder;
    }

    public final aike getKotlinTypeChecker() {
        return this.kotlinTypeChecker;
    }

    public final aglq getLookupTracker() {
        return this.lookupTracker;
    }

    public final agcu getModule() {
        return this.module;
    }

    public final agvx getModuleClassResolver() {
        return this.moduleClassResolver;
    }

    public final ahfr getPackagePartProvider() {
        return this.packagePartProvider;
    }

    public final afym getReflectionTypes() {
        return this.reflectionTypes;
    }

    public final agvo getSettings() {
        return this.settings;
    }

    public final ahcu getSignatureEnhancement() {
        return this.signatureEnhancement;
    }

    public final aguw getSignaturePropagator() {
        return this.signaturePropagator;
    }

    public final agze getSourceElementFactory() {
        return this.sourceElementFactory;
    }

    public final aiei getStorageManager() {
        return this.storageManager;
    }

    public final agec getSupertypeLoopChecker() {
        return this.supertypeLoopChecker;
    }

    public final ahwg getSyntheticPartsProvider() {
        return this.syntheticPartsProvider;
    }

    public final agvl replace(agup agupVar) {
        agupVar.getClass();
        return new agvl(this.storageManager, this.finder, this.kotlinClassFinder, this.deserializedDescriptorResolver, this.signaturePropagator, this.errorReporter, agupVar, this.javaPropertyInitializerEvaluator, this.samConversionResolver, this.sourceElementFactory, this.moduleClassResolver, this.packagePartProvider, this.supertypeLoopChecker, this.lookupTracker, this.module, this.reflectionTypes, this.annotationTypeQualifierResolver, this.signatureEnhancement, this.javaClassesTracker, this.settings, this.kotlinTypeChecker, this.javaTypeEnhancementState, this.javaModuleResolver, null, 8388608, null);
    }

    public /* synthetic */ agvl(aiei aieiVar, agsm agsmVar, ahfc ahfcVar, ahen ahenVar, aguw aguwVar, ahzh ahzhVar, agup agupVar, agun agunVar, ahwh ahwhVar, agze agzeVar, agvx agvxVar, ahfr ahfrVar, agec agecVar, aglq aglqVar, agcu agcuVar, afym afymVar, agrw agrwVar, ahcu ahcuVar, agso agsoVar, agvo agvoVar, aike aikeVar, agtd agtdVar, agsx agsxVar, ahwg ahwgVar, int i, afeu afeuVar) {
        this(aieiVar, agsmVar, ahfcVar, ahenVar, aguwVar, ahzhVar, agupVar, agunVar, ahwhVar, agzeVar, agvxVar, ahfrVar, agecVar, aglqVar, agcuVar, afymVar, agrwVar, ahcuVar, agsoVar, agvoVar, aikeVar, agtdVar, agsxVar, (i & 8388608) != 0 ? ahwg.Companion.getEMPTY() : ahwgVar);
    }
}
