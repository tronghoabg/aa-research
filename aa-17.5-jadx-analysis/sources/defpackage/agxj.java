package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agxj extends agie {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agxj.class, "binaryClasses", "getBinaryClasses$org_jetbrains_kotlin_descriptors_jvm()Ljava/util/Map;", 0), new affn(agxj.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0)};
    private final agfk annotations;
    private final aiec binaryClasses$delegate;
    private final agvu c;
    private final agzu jPackage;
    private final ahlc metadataVersion;
    private final aiec partToFacade$delegate;
    private final agwh scope;
    private final aiec<List<ahnf>> subPackages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agxj(agvu agvuVar, agzu agzuVar) {
        super(agvuVar.getModule(), agzuVar.getFqName());
        agvuVar.getClass();
        agzuVar.getClass();
        this.jPackage = agzuVar;
        agvu agvuVarChildForClassOrPackage$default = agvk.childForClassOrPackage$default(agvuVar, this, null, 0, 6, null);
        this.c = agvuVarChildForClassOrPackage$default;
        this.metadataVersion = agvuVar.getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration().getMetadataVersion();
        this.binaryClasses$delegate = agvuVarChildForClassOrPackage$default.getStorageManager().createLazyValue(new agxg(this));
        this.scope = new agwh(agvuVarChildForClassOrPackage$default, agzuVar, this);
        this.subPackages = agvuVarChildForClassOrPackage$default.getStorageManager().createRecursionTolerantLazyValue(new agxh(this), afbe.a);
        this.annotations = agvuVarChildForClassOrPackage$default.getComponents().getJavaTypeEnhancementState().getDisabledDefaultAnnotations() ? agfk.Companion.getEMPTY() : agvr.resolveAnnotations(agvuVarChildForClassOrPackage$default, agzuVar);
        this.partToFacade$delegate = agvuVarChildForClassOrPackage$default.getStorageManager().createLazyValue(new agxi(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map binaryClasses_delegate$lambda$0(agxj agxjVar) {
        List<String> listFindPackageParts = agxjVar.c.getComponents().getPackagePartProvider().findPackageParts(agxjVar.getFqName().asString());
        ArrayList arrayList = new ArrayList();
        for (String str : listFindPackageParts) {
            ahfj ahfjVarFindKotlinClass = ahfd.findKotlinClass(agxjVar.c.getComponents().getKotlinClassFinder(), ahnd.Companion.topLevel(ahwd.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars()), agxjVar.metadataVersion);
            aezu aezuVar = ahfjVarFindKotlinClass != null ? new aezu(str, ahfjVarFindKotlinClass) : null;
            if (aezuVar != null) {
                arrayList.add(aezuVar);
            }
        }
        return woy.bc(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap partToFacade_delegate$lambda$0(agxj agxjVar) {
        String multifileClassName;
        HashMap map = new HashMap();
        for (Map.Entry<String, ahfj> entry : agxjVar.getBinaryClasses$org_jetbrains_kotlin_descriptors_jvm().entrySet()) {
            String key = entry.getKey();
            ahfj value = entry.getValue();
            ahwd ahwdVarByInternalName = ahwd.byInternalName(key);
            ahgb classHeader = value.getClassHeader();
            ahga kind = classHeader.getKind();
            ahfz ahfzVar = ahga.Companion;
            int iOrdinal = kind.ordinal();
            if (iOrdinal == 2) {
                map.put(ahwdVarByInternalName, ahwdVarByInternalName);
            } else if (iOrdinal == 5 && (multifileClassName = classHeader.getMultifileClassName()) != null) {
                map.put(ahwdVarByInternalName, ahwd.byInternalName(multifileClassName));
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List subPackages$lambda$0(agxj agxjVar) {
        Collection<agzu> subPackages = agxjVar.jPackage.getSubPackages();
        ArrayList arrayList = new ArrayList(woy.bp(subPackages, 10));
        Iterator<T> it = subPackages.iterator();
        while (it.hasNext()) {
            arrayList.add(((agzu) it.next()).getFqName());
        }
        return arrayList;
    }

    public final agba findClassifierByJavaClass$org_jetbrains_kotlin_descriptors_jvm(agzj agzjVar) {
        agzjVar.getClass();
        return this.scope.getJavaScope$org_jetbrains_kotlin_descriptors_jvm().findClassifierByJavaClass$org_jetbrains_kotlin_descriptors_jvm(agzjVar);
    }

    @Override // defpackage.agfa, defpackage.agez
    public agfk getAnnotations() {
        return this.annotations;
    }

    public final Map<String, ahfj> getBinaryClasses$org_jetbrains_kotlin_descriptors_jvm() {
        return (Map) aieh.getValue(this.binaryClasses$delegate, this, $$delegatedProperties[0]);
    }

    @Override // defpackage.agie, defpackage.aggz, defpackage.agbl
    public agdx getSource() {
        return new ahfk(this);
    }

    public final List<ahnf> getSubPackageFqNames$org_jetbrains_kotlin_descriptors_jvm() {
        return this.subPackages.invoke();
    }

    @Override // defpackage.agie, defpackage.aggy
    public String toString() {
        return "Lazy Java package fragment: " + getFqName() + " of module " + this.c.getComponents().getModule();
    }

    @Override // defpackage.agdc
    public agwh getMemberScope() {
        return this.scope;
    }
}
