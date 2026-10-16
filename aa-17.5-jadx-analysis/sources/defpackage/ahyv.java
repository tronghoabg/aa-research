package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahyv {
    private final agfx additionalClassPartsProvider;
    private final ahyi<agfc, ahuh<?>> annotationAndConstantLoader;
    private final ahyn classDataFinder;
    private final ahyr classDeserializer;
    private final ahyx configuration;
    private final ahyu contractDeserializer;
    private final ahzf enumEntriesDeserializationSupport;
    private final ahzh errorReporter;
    private final ahog extensionRegistryLite;
    private final Iterable<agfy> fictitiousClassDescriptorFactories;
    private final ahzj flexibleTypeDeserializer;
    private final aike kotlinTypeChecker;
    private final ahzo localClassifierTypeSettings;
    private final aglq lookupTracker;
    private final agcu moduleDescriptor;
    private final agdb notFoundClasses;
    private final agdd packageFragmentProvider;
    private final aggb platformDependentDeclarationFilter;
    private final ahwh samConversionResolver;
    private final aiei storageManager;
    private final List<aihp> typeAttributeTranslators;

    /* JADX WARN: Multi-variable type inference failed */
    public ahyv(aiei aieiVar, agcu agcuVar, ahyx ahyxVar, ahyn ahynVar, ahyi<? extends agfc, ? extends ahuh<?>> ahyiVar, agdd agddVar, ahzo ahzoVar, ahzh ahzhVar, aglq aglqVar, ahzj ahzjVar, Iterable<? extends agfy> iterable, agdb agdbVar, ahyu ahyuVar, agfx agfxVar, aggb aggbVar, ahog ahogVar, aike aikeVar, ahwh ahwhVar, List<? extends aihp> list, ahzf ahzfVar) {
        aieiVar.getClass();
        agcuVar.getClass();
        ahyxVar.getClass();
        ahynVar.getClass();
        ahyiVar.getClass();
        agddVar.getClass();
        ahzoVar.getClass();
        ahzhVar.getClass();
        aglqVar.getClass();
        ahzjVar.getClass();
        iterable.getClass();
        agdbVar.getClass();
        ahyuVar.getClass();
        agfxVar.getClass();
        aggbVar.getClass();
        ahogVar.getClass();
        aikeVar.getClass();
        ahwhVar.getClass();
        list.getClass();
        ahzfVar.getClass();
        this.storageManager = aieiVar;
        this.moduleDescriptor = agcuVar;
        this.configuration = ahyxVar;
        this.classDataFinder = ahynVar;
        this.annotationAndConstantLoader = ahyiVar;
        this.packageFragmentProvider = agddVar;
        this.localClassifierTypeSettings = ahzoVar;
        this.errorReporter = ahzhVar;
        this.lookupTracker = aglqVar;
        this.flexibleTypeDeserializer = ahzjVar;
        this.fictitiousClassDescriptorFactories = iterable;
        this.notFoundClasses = agdbVar;
        this.contractDeserializer = ahyuVar;
        this.additionalClassPartsProvider = agfxVar;
        this.platformDependentDeclarationFilter = aggbVar;
        this.extensionRegistryLite = ahogVar;
        this.kotlinTypeChecker = aikeVar;
        this.samConversionResolver = ahwhVar;
        this.typeAttributeTranslators = list;
        this.enumEntriesDeserializationSupport = ahzfVar;
        this.classDeserializer = new ahyr(this);
    }

    public final ahyy createContext(agdc agdcVar, ahld ahldVar, ahlh ahlhVar, ahln ahlnVar, ahkv ahkvVar, aibv aibvVar) {
        agdcVar.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        ahlnVar.getClass();
        ahkvVar.getClass();
        return new ahyy(this, ahldVar, agdcVar, ahlhVar, ahlnVar, ahkvVar, aibvVar, null, afbe.a);
    }

    public final agba deserializeClass(ahnd ahndVar) {
        ahndVar.getClass();
        return ahyr.deserializeClass$default(this.classDeserializer, ahndVar, null, 2, null);
    }

    public final agfx getAdditionalClassPartsProvider() {
        return this.additionalClassPartsProvider;
    }

    public final ahyi<agfc, ahuh<?>> getAnnotationAndConstantLoader() {
        return this.annotationAndConstantLoader;
    }

    public final ahyn getClassDataFinder() {
        return this.classDataFinder;
    }

    public final ahyr getClassDeserializer() {
        return this.classDeserializer;
    }

    public final ahyx getConfiguration() {
        return this.configuration;
    }

    public final ahyu getContractDeserializer() {
        return this.contractDeserializer;
    }

    public final ahzf getEnumEntriesDeserializationSupport() {
        return this.enumEntriesDeserializationSupport;
    }

    public final ahzh getErrorReporter() {
        return this.errorReporter;
    }

    public final ahog getExtensionRegistryLite() {
        return this.extensionRegistryLite;
    }

    public final Iterable<agfy> getFictitiousClassDescriptorFactories() {
        return this.fictitiousClassDescriptorFactories;
    }

    public final ahzj getFlexibleTypeDeserializer() {
        return this.flexibleTypeDeserializer;
    }

    public final aike getKotlinTypeChecker() {
        return this.kotlinTypeChecker;
    }

    public final ahzo getLocalClassifierTypeSettings() {
        return this.localClassifierTypeSettings;
    }

    public final aglq getLookupTracker() {
        return this.lookupTracker;
    }

    public final agcu getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    public final agdb getNotFoundClasses() {
        return this.notFoundClasses;
    }

    public final agdd getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    public final aggb getPlatformDependentDeclarationFilter() {
        return this.platformDependentDeclarationFilter;
    }

    public final aiei getStorageManager() {
        return this.storageManager;
    }

    public final List<aihp> getTypeAttributeTranslators() {
        return this.typeAttributeTranslators;
    }

    public /* synthetic */ ahyv(aiei aieiVar, agcu agcuVar, ahyx ahyxVar, ahyn ahynVar, ahyi ahyiVar, agdd agddVar, ahzo ahzoVar, ahzh ahzhVar, aglq aglqVar, ahzj ahzjVar, Iterable iterable, agdb agdbVar, ahyu ahyuVar, agfx agfxVar, aggb aggbVar, ahog ahogVar, aike aikeVar, ahwh ahwhVar, List list, ahzf ahzfVar, int i, afeu afeuVar) {
        this(aieiVar, agcuVar, ahyxVar, ahynVar, ahyiVar, agddVar, ahzoVar, ahzhVar, aglqVar, ahzjVar, iterable, agdbVar, ahyuVar, (i & 8192) != 0 ? agfw.INSTANCE : agfxVar, (i & 16384) != 0 ? agfz.INSTANCE : aggbVar, ahogVar, (65536 & i) != 0 ? aike.Companion.getDefault() : aikeVar, ahwhVar, (262144 & i) != 0 ? woy.bg(aifm.INSTANCE) : list, (i & 524288) != 0 ? ahze.INSTANCE : ahzfVar);
    }
}
