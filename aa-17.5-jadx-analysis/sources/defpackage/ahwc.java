package defpackage;

/* loaded from: classes3.dex */
public final class ahwc {
    private final agup javaResolverCache;
    private final agvt packageFragmentProvider;

    public ahwc(agvt agvtVar, agup agupVar) {
        agvtVar.getClass();
        agupVar.getClass();
        this.packageFragmentProvider = agvtVar;
        this.javaResolverCache = agupVar;
    }

    public final agvt getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    public final agba resolveClass(agzj agzjVar) {
        agxj agxjVar;
        agzjVar.getClass();
        ahnf fqName = agzjVar.getFqName();
        if (fqName != null && agzjVar.getLightClassOriginKind() == ahab.SOURCE) {
            return this.javaResolverCache.getClassResolvedFromSource(fqName);
        }
        agzj outerClass = agzjVar.getOuterClass();
        if (outerClass != null) {
            agba agbaVarResolveClass = resolveClass(outerClass);
            ahxe unsubstitutedInnerClassesScope = agbaVarResolveClass != null ? agbaVarResolveClass.getUnsubstitutedInnerClassesScope() : null;
            agbd contributedClassifier = unsubstitutedInnerClassesScope != null ? unsubstitutedInnerClassesScope.getContributedClassifier(agzjVar.getName(), aglr.FROM_JAVA_LOADER) : null;
            if (contributedClassifier instanceof agba) {
                return (agba) contributedClassifier;
            }
        } else if (fqName != null && (agxjVar = (agxj) woy.bH(this.packageFragmentProvider.getPackageFragments(fqName.parent()))) != null) {
            return agxjVar.findClassifierByJavaClass$org_jetbrains_kotlin_descriptors_jvm(agzjVar);
        }
        return null;
    }
}
