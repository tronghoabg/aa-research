package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahwl implements ahxe {
    public static final ahwk Companion = new ahwk(null);
    private final String debugName;
    private final ahxe[] scopes;

    private ahwl(String str, ahxe[] ahxeVarArr) {
        this.debugName = str;
        this.scopes = ahxeVarArr;
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        return ahxg.flatMapClassifierNamesOrNull(woy.cS(this.scopes));
    }

    public final List<ahxe> getComponentScopes() {
        return woy.df(this.scopes);
    }

    @Override // defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        agbd agbdVar = null;
        for (ahxe ahxeVar : this.scopes) {
            agbd contributedClassifier = ahxeVar.getContributedClassifier(ahnjVar, agloVar);
            if (contributedClassifier != null) {
                if (!(contributedClassifier instanceof agbe) || !((agco) contributedClassifier).isExpect()) {
                    return contributedClassifier;
                }
                if (agbdVar == null) {
                    agbdVar = contributedClassifier;
                }
            }
        }
        return agbdVar;
    }

    @Override // defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        ahxe[] ahxeVarArr = this.scopes;
        int length = ahxeVarArr.length;
        if (length == 0) {
            return afbe.a;
        }
        if (length == 1) {
            return ahxeVarArr[0].getContributedDescriptors(ahwtVar, afecVar);
        }
        Collection<agbi> collectionConcat = null;
        for (ahxe ahxeVar : ahxeVarArr) {
            collectionConcat = aiov.concat(collectionConcat, ahxeVar.getContributedDescriptors(ahwtVar, afecVar));
        }
        return collectionConcat == null ? afbg.a : collectionConcat;
    }

    @Override // defpackage.ahxe, defpackage.ahxi
    public Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        ahxe[] ahxeVarArr = this.scopes;
        int length = ahxeVarArr.length;
        if (length == 0) {
            return afbe.a;
        }
        if (length == 1) {
            return ahxeVarArr[0].getContributedFunctions(ahnjVar, agloVar);
        }
        Collection<agdv> collectionConcat = null;
        for (ahxe ahxeVar : ahxeVarArr) {
            collectionConcat = aiov.concat(collectionConcat, ahxeVar.getContributedFunctions(ahnjVar, agloVar));
        }
        return collectionConcat == null ? afbg.a : collectionConcat;
    }

    @Override // defpackage.ahxe
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        ahxe[] ahxeVarArr = this.scopes;
        int length = ahxeVarArr.length;
        if (length == 0) {
            return afbe.a;
        }
        if (length == 1) {
            return ahxeVarArr[0].getContributedVariables(ahnjVar, agloVar);
        }
        Collection<agdn> collectionConcat = null;
        for (ahxe ahxeVar : ahxeVarArr) {
            collectionConcat = aiov.concat(collectionConcat, ahxeVar.getContributedVariables(ahnjVar, agloVar));
        }
        return collectionConcat == null ? afbg.a : collectionConcat;
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getFunctionNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ahxe ahxeVar : this.scopes) {
            woy.cq(linkedHashSet, ahxeVar.getFunctionNames());
        }
        return linkedHashSet;
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getVariableNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ahxe ahxeVar : this.scopes) {
            woy.cq(linkedHashSet, ahxeVar.getVariableNames());
        }
        return linkedHashSet;
    }

    @Override // defpackage.ahxi
    /* renamed from: recordLookup */
    public void mo95recordLookup(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        for (ahxe ahxeVar : this.scopes) {
            ahxeVar.mo95recordLookup(ahnjVar, agloVar);
        }
    }

    public String toString() {
        return this.debugName;
    }

    public /* synthetic */ ahwl(String str, ahxe[] ahxeVarArr, afeu afeuVar) {
        this(str, ahxeVarArr);
    }
}
