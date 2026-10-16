package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class ahwj implements ahxe {
    public final ahxe getActualScope() {
        if (!(getWorkerScope() instanceof ahwj)) {
            return getWorkerScope();
        }
        ahxe workerScope = getWorkerScope();
        workerScope.getClass();
        return ((ahwj) workerScope).getActualScope();
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        return getWorkerScope().getClassifierNames();
    }

    @Override // defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return getWorkerScope().getContributedClassifier(ahnjVar, agloVar);
    }

    @Override // defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        return getWorkerScope().getContributedDescriptors(ahwtVar, afecVar);
    }

    @Override // defpackage.ahxe, defpackage.ahxi
    public Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return getWorkerScope().getContributedFunctions(ahnjVar, agloVar);
    }

    @Override // defpackage.ahxe
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return getWorkerScope().getContributedVariables(ahnjVar, agloVar);
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getFunctionNames() {
        return getWorkerScope().getFunctionNames();
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getVariableNames() {
        return getWorkerScope().getVariableNames();
    }

    protected abstract ahxe getWorkerScope();

    @Override // defpackage.ahxi
    /* renamed from: recordLookup */
    public void mo95recordLookup(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        getWorkerScope().mo95recordLookup(ahnjVar, agloVar);
    }
}
