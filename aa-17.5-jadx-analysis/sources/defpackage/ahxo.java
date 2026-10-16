package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahxo implements ahxe {
    private final aezr _allDescriptors$delegate;
    private final aiiy capturingSubstitutor;
    private Map<agbi, agbi> substitutedDescriptors;
    private final aezr substitutor$delegate;
    private final ahxe workerScope;

    public ahxo(ahxe ahxeVar, aiiy aiiyVar) {
        ahxeVar.getClass();
        aiiyVar.getClass();
        this.workerScope = ahxeVar;
        this.substitutor$delegate = woy.dG(new ahxm(aiiyVar));
        aiit substitution = aiiyVar.getSubstitution();
        substitution.getClass();
        this.capturingSubstitutor = ahua.wrapWithCapturingSubstitution(substitution, 1 == ((false ? 1 : 0) | (1 & 1))).buildSubstitutor();
        this._allDescriptors$delegate = woy.dG(new ahxn(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection _allDescriptors_delegate$lambda$0(ahxo ahxoVar) {
        return ahxoVar.substitute(ahxh.getContributedDescriptors$default(ahxoVar.workerScope, null, null, 3, null));
    }

    private final Collection<agbi> get_allDescriptors() {
        return (Collection) this._allDescriptors$delegate.a();
    }

    private final <D extends agbi> D substitute(D d) {
        if (this.capturingSubstitutor.isEmpty()) {
            return d;
        }
        if (this.substitutedDescriptors == null) {
            this.substitutedDescriptors = new HashMap();
        }
        Map<agbi, agbi> map = this.substitutedDescriptors;
        map.getClass();
        agbi agbiVarSubstitute = map.get(d);
        if (agbiVarSubstitute == null) {
            if (!(d instanceof agea)) {
                Objects.toString(d);
                throw new IllegalStateException("Unknown descriptor in scope: ".concat(String.valueOf(d)));
            }
            agbiVarSubstitute = ((agea) d).substitute(this.capturingSubstitutor);
            if (agbiVarSubstitute == null) {
                throw new AssertionError(a.bm(d, "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", " substitution fails"));
            }
            map.put(d, agbiVarSubstitute);
        }
        return (D) agbiVarSubstitute;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aiiy substitutor_delegate$lambda$0(aiiy aiiyVar) {
        return aiiyVar.getSubstitution().buildSubstitutor();
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        return this.workerScope.getClassifierNames();
    }

    @Override // defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        agbd contributedClassifier = this.workerScope.getContributedClassifier(ahnjVar, agloVar);
        if (contributedClassifier != null) {
            return (agbd) substitute((ahxo) contributedClassifier);
        }
        return null;
    }

    @Override // defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        return get_allDescriptors();
    }

    @Override // defpackage.ahxe, defpackage.ahxi
    public Collection<? extends agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return substitute(this.workerScope.getContributedFunctions(ahnjVar, agloVar));
    }

    @Override // defpackage.ahxe
    public Collection<? extends agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return substitute(this.workerScope.getContributedVariables(ahnjVar, agloVar));
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    @Override // defpackage.ahxi
    /* renamed from: recordLookup */
    public /* bridge */ void mo95recordLookup(ahnj ahnjVar, aglo agloVar) {
        ahxc.recordLookup(this, ahnjVar, agloVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <D extends agbi> Collection<D> substitute(Collection<? extends D> collection) {
        if (this.capturingSubstitutor.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetNewLinkedHashSetWithExpectedSize = aiow.newLinkedHashSetWithExpectedSize(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetNewLinkedHashSetWithExpectedSize.add(substitute((ahxo) it.next()));
        }
        return linkedHashSetNewLinkedHashSetWithExpectedSize;
    }
}
