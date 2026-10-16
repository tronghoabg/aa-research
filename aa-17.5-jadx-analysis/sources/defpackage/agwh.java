package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agwh implements ahxe {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agwh.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};
    private final agvu c;
    private final agxr javaScope;
    private final aiec kotlinScopes$delegate;
    private final agxj packageFragment;

    public agwh(agvu agvuVar, agzu agzuVar, agxj agxjVar) {
        agvuVar.getClass();
        agzuVar.getClass();
        agxjVar.getClass();
        this.c = agvuVar;
        this.packageFragment = agxjVar;
        this.javaScope = new agxr(agvuVar, agzuVar, agxjVar);
        this.kotlinScopes$delegate = agvuVar.getStorageManager().createLazyValue(new agwg(this));
    }

    private final ahxe[] getKotlinScopes() {
        return (ahxe[]) aieh.getValue(this.kotlinScopes$delegate, this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahxe[] kotlinScopes_delegate$lambda$0(agwh agwhVar) {
        Collection<ahfj> collectionValues = agwhVar.packageFragment.getBinaryClasses$org_jetbrains_kotlin_descriptors_jvm().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ahxe ahxeVarCreateKotlinPackagePartScope = agwhVar.c.getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(agwhVar.packageFragment, (ahfj) it.next());
            if (ahxeVarCreateKotlinPackagePartScope != null) {
                arrayList.add(ahxeVarCreateKotlinPackagePartScope);
            }
        }
        return (ahxe[]) aiov.listOfNonEmptyScopes(arrayList).toArray(new ahxe[0]);
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        Set<ahnj> setFlatMapClassifierNamesOrNull = ahxg.flatMapClassifierNamesOrNull(woy.cS(getKotlinScopes()));
        if (setFlatMapClassifierNamesOrNull == null) {
            return null;
        }
        setFlatMapClassifierNamesOrNull.addAll(this.javaScope.getClassifierNames());
        return setFlatMapClassifierNamesOrNull;
    }

    @Override // defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        mo95recordLookup(ahnjVar, agloVar);
        agba contributedClassifier = this.javaScope.getContributedClassifier(ahnjVar, agloVar);
        if (contributedClassifier != null) {
            return contributedClassifier;
        }
        agbd agbdVar = null;
        for (ahxe ahxeVar : getKotlinScopes()) {
            agbd contributedClassifier2 = ahxeVar.getContributedClassifier(ahnjVar, agloVar);
            if (contributedClassifier2 != null) {
                if (!(contributedClassifier2 instanceof agbe) || !((agco) contributedClassifier2).isExpect()) {
                    return contributedClassifier2;
                }
                if (agbdVar == null) {
                    agbdVar = contributedClassifier2;
                }
            }
        }
        return agbdVar;
    }

    @Override // defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        agxr agxrVar = this.javaScope;
        ahxe[] kotlinScopes = getKotlinScopes();
        Collection<agbi> contributedDescriptors = agxrVar.getContributedDescriptors(ahwtVar, afecVar);
        for (ahxe ahxeVar : kotlinScopes) {
            contributedDescriptors = aiov.concat(contributedDescriptors, ahxeVar.getContributedDescriptors(ahwtVar, afecVar));
        }
        return contributedDescriptors == null ? afbg.a : contributedDescriptors;
    }

    @Override // defpackage.ahxe, defpackage.ahxi
    public Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        mo95recordLookup(ahnjVar, agloVar);
        agxr agxrVar = this.javaScope;
        ahxe[] kotlinScopes = getKotlinScopes();
        Collection<? extends agdv> contributedFunctions = agxrVar.getContributedFunctions(ahnjVar, agloVar);
        int length = kotlinScopes.length;
        int i = 0;
        Collection collection = contributedFunctions;
        while (i < length) {
            Collection collectionConcat = aiov.concat(collection, kotlinScopes[i].getContributedFunctions(ahnjVar, agloVar));
            i++;
            collection = collectionConcat;
        }
        return collection == null ? afbg.a : collection;
    }

    @Override // defpackage.ahxe
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        mo95recordLookup(ahnjVar, agloVar);
        agxr agxrVar = this.javaScope;
        ahxe[] kotlinScopes = getKotlinScopes();
        Collection<? extends agdn> contributedVariables = agxrVar.getContributedVariables(ahnjVar, agloVar);
        int length = kotlinScopes.length;
        int i = 0;
        Collection collection = contributedVariables;
        while (i < length) {
            Collection collectionConcat = aiov.concat(collection, kotlinScopes[i].getContributedVariables(ahnjVar, agloVar));
            i++;
            collection = collectionConcat;
        }
        return collection == null ? afbg.a : collection;
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getFunctionNames() {
        ahxe[] kotlinScopes = getKotlinScopes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ahxe ahxeVar : kotlinScopes) {
            woy.cq(linkedHashSet, ahxeVar.getFunctionNames());
        }
        linkedHashSet.addAll(this.javaScope.getFunctionNames());
        return linkedHashSet;
    }

    public final agxr getJavaScope$org_jetbrains_kotlin_descriptors_jvm() {
        return this.javaScope;
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getVariableNames() {
        ahxe[] kotlinScopes = getKotlinScopes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ahxe ahxeVar : kotlinScopes) {
            woy.cq(linkedHashSet, ahxeVar.getVariableNames());
        }
        linkedHashSet.addAll(this.javaScope.getVariableNames());
        return linkedHashSet;
    }

    @Override // defpackage.ahxi
    /* renamed from: recordLookup */
    public void mo95recordLookup(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        aglm.record(this.c.getComponents().getLookupTracker(), agloVar, this.packageFragment, ahnjVar);
    }

    public String toString() {
        agxj agxjVar = this.packageFragment;
        Objects.toString(agxjVar);
        return "scope for ".concat(String.valueOf(agxjVar));
    }
}
