package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agxr extends agyp {
    private final aieb<agxm, agba> classes;
    private final agzu jPackage;
    private final aied<Set<String>> knownClassNamesInPackage;
    private final agxj ownerDescriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agxr(agvu agvuVar, agzu agzuVar, agxj agxjVar) {
        super(agvuVar);
        agvuVar.getClass();
        agzuVar.getClass();
        agxjVar.getClass();
        this.jPackage = agzuVar;
        this.ownerDescriptor = agxjVar;
        this.knownClassNamesInPackage = agvuVar.getStorageManager().createNullableLazyValue(new agxk(agvuVar, this));
        this.classes = agvuVar.getStorageManager().createMemoizedFunctionWithNullableValues(new agxl(this, agvuVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agba classes$lambda$0(agxr agxrVar, agvu agvuVar, agxm agxmVar) {
        agxmVar.getClass();
        ahnd ahndVar = new ahnd(agxrVar.getOwnerDescriptor().getFqName(), agxmVar.getName());
        ahfb ahfbVarFindKotlinClassOrContent = agxmVar.getJavaClass() != null ? agvuVar.getComponents().getKotlinClassFinder().findKotlinClassOrContent(agxmVar.getJavaClass(), agxrVar.getMetadataVersion()) : agvuVar.getComponents().getKotlinClassFinder().findKotlinClassOrContent(ahndVar, agxrVar.getMetadataVersion());
        ahfj kotlinJvmBinaryClass = ahfbVarFindKotlinClassOrContent != null ? ahfbVarFindKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
        ahnd classId = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
        if (classId != null && (classId.isNestedClass() || classId.isLocal())) {
            return null;
        }
        agxq agxqVarResolveKotlinBinaryClass = agxrVar.resolveKotlinBinaryClass(kotlinJvmBinaryClass);
        if (agxqVarResolveKotlinBinaryClass instanceof agxn) {
            return ((agxn) agxqVarResolveKotlinBinaryClass).getDescriptor();
        }
        if (agxqVarResolveKotlinBinaryClass instanceof agxp) {
            return null;
        }
        if (!(agxqVarResolveKotlinBinaryClass instanceof agxo)) {
            throw new aezs();
        }
        agzj javaClass = agxmVar.getJavaClass();
        if (javaClass == null) {
            agsm finder = agvuVar.getComponents().getFinder();
            ahez ahezVar = ahfbVarFindKotlinClassOrContent instanceof ahez ? (ahez) ahfbVarFindKotlinClassOrContent : null;
            javaClass = finder.findClass(new agsl(ahndVar, ahezVar != null ? ahezVar.getContent() : null, null, 4, null));
        }
        agzj agzjVar = javaClass;
        if ((agzjVar != null ? agzjVar.getLightClassOriginKind() : null) != ahab.BINARY) {
            ahnf fqName = agzjVar != null ? agzjVar.getFqName() : null;
            if (fqName == null || fqName.isRoot() || !affa.f(fqName.parent(), agxrVar.getOwnerDescriptor().getFqName())) {
                return null;
            }
            agws agwsVar = new agws(agvuVar, agxrVar.getOwnerDescriptor(), agzjVar, null, 8, null);
            agvuVar.getComponents().getJavaClassesTracker().reportClass(agwsVar);
            return agwsVar;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + agzjVar + "\nClassId: " + ahndVar + "\nfindKotlinClass(JavaClass) = " + ahfd.findKotlinClass(agvuVar.getComponents().getKotlinClassFinder(), agzjVar, agxrVar.getMetadataVersion()) + "\nfindKotlinClass(ClassId) = " + ahfd.findKotlinClass(agvuVar.getComponents().getKotlinClassFinder(), ahndVar, agxrVar.getMetadataVersion()) + '\n');
    }

    private final agba findClassifier(ahnj ahnjVar, agzj agzjVar) {
        if (!ahnm.INSTANCE.isSafeIdentifier(ahnjVar)) {
            return null;
        }
        Set<String> setInvoke = this.knownClassNamesInPackage.invoke();
        if (agzjVar != null || setInvoke == null || setInvoke.contains(ahnjVar.asString())) {
            return this.classes.invoke(new agxm(ahnjVar, agzjVar));
        }
        return null;
    }

    private final ahlc getMetadataVersion() {
        return getC().getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration().getMetadataVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set knownClassNamesInPackage$lambda$0(agvu agvuVar, agxr agxrVar) {
        return agvuVar.getComponents().getFinder().knownClassNamesInPackage(agxrVar.getOwnerDescriptor().getFqName());
    }

    private final agxq resolveKotlinBinaryClass(ahfj ahfjVar) {
        if (ahfjVar == null) {
            return agxo.INSTANCE;
        }
        if (ahfjVar.getClassHeader().getKind() != ahga.CLASS) {
            return agxp.INSTANCE;
        }
        agba agbaVarResolveClass = getC().getComponents().getDeserializedDescriptorResolver().resolveClass(ahfjVar);
        return agbaVarResolveClass != null ? new agxn(agbaVarResolveClass) : agxo.INSTANCE;
    }

    @Override // defpackage.agyh
    protected Set<ahnj> computeClassNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        if (!ahwtVar.acceptsKinds(ahwt.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return afbg.a;
        }
        Set<String> setInvoke = this.knownClassNamesInPackage.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(ahnj.identifier((String) it.next()));
            }
            return hashSet;
        }
        agzu agzuVar = this.jPackage;
        if (afecVar == null) {
            afecVar = aipl.alwaysTrue();
        }
        Collection<agzj> classes = agzuVar.getClasses(afecVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (agzj agzjVar : classes) {
            ahnj name = agzjVar.getLightClassOriginKind() == ahab.SOURCE ? null : agzjVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.agyh
    protected Set<ahnj> computeFunctionNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        return afbg.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agyh
    public agwe computeMemberIndex() {
        return agwd.INSTANCE;
    }

    @Override // defpackage.agyh
    protected void computeNonDeclaredFunctions(Collection<agdv> collection, ahnj ahnjVar) {
        collection.getClass();
        ahnjVar.getClass();
    }

    @Override // defpackage.agyh
    protected Set<ahnj> computePropertyNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        return afbg.a;
    }

    public final agba findClassifierByJavaClass$org_jetbrains_kotlin_descriptors_jvm(agzj agzjVar) {
        agzjVar.getClass();
        return findClassifier(agzjVar.getName(), agzjVar);
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public agba getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return findClassifier(ahnjVar, null);
    }

    @Override // defpackage.agyh, defpackage.ahxf, defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        if (!ahwtVar.acceptsKinds(ahwt.Companion.getCLASSIFIERS_MASK() | ahwt.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return afbe.a;
        }
        Collection<agbi> collectionInvoke = getAllDescriptors().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            agbi agbiVar = (agbi) obj;
            if (agbiVar instanceof agba) {
                ahnj name = ((agba) agbiVar).getName();
                name.getClass();
                if (afecVar.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.agyh, defpackage.ahxf, defpackage.ahxe
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return afbe.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agyh
    public agxj getOwnerDescriptor() {
        return this.ownerDescriptor;
    }
}
