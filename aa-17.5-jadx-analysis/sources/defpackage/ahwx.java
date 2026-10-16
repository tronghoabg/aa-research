package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahwx extends ahxf {
    private final ahxe workerScope;

    public ahwx(ahxe ahxeVar) {
        ahxeVar.getClass();
        this.workerScope = ahxeVar;
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        return this.workerScope.getClassifierNames();
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        agbd contributedClassifier = this.workerScope.getContributedClassifier(ahnjVar, agloVar);
        if (contributedClassifier == null) {
            return null;
        }
        agba agbaVar = contributedClassifier instanceof agba ? (agba) contributedClassifier : null;
        if (agbaVar != null) {
            return agbaVar;
        }
        if (contributedClassifier instanceof aged) {
            return (aged) contributedClassifier;
        }
        return null;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public List<agbd> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        ahwt ahwtVarRestrictedToKindsOrNull = ahwtVar.restrictedToKindsOrNull(ahwt.Companion.getCLASSIFIERS_MASK());
        if (ahwtVarRestrictedToKindsOrNull == null) {
            return afbe.a;
        }
        Collection<agbi> contributedDescriptors = this.workerScope.getContributedDescriptors(ahwtVarRestrictedToKindsOrNull, afecVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : contributedDescriptors) {
            if (obj instanceof agbe) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    /* renamed from: recordLookup */
    public void mo95recordLookup(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        this.workerScope.mo95recordLookup(ahnjVar, agloVar);
    }

    public String toString() {
        ahxe ahxeVar = this.workerScope;
        Objects.toString(ahxeVar);
        return "Classes from ".concat(String.valueOf(ahxeVar));
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public /* bridge */ /* synthetic */ Collection getContributedDescriptors(ahwt ahwtVar, afec afecVar) {
        return getContributedDescriptors(ahwtVar, (afec<? super ahnj, Boolean>) afecVar);
    }
}
