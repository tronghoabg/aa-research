package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class ahxf implements ahxe {
    @Override // defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        return null;
    }

    @Override // defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return null;
    }

    @Override // defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        return afbe.a;
    }

    @Override // defpackage.ahxe, defpackage.ahxi
    public Collection<? extends agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return afbe.a;
    }

    @Override // defpackage.ahxe
    public Collection<? extends agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return afbe.a;
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getFunctionNames() {
        Collection<agbi> contributedDescriptors = getContributedDescriptors(ahwt.FUNCTIONS, aipl.alwaysTrue());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : contributedDescriptors) {
            if (obj instanceof agdv) {
                ahnj name = ((agdv) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.ahxe
    public Set<ahnj> getVariableNames() {
        Collection<agbi> contributedDescriptors = getContributedDescriptors(ahwt.VARIABLES, aipl.alwaysTrue());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : contributedDescriptors) {
            if (obj instanceof agdv) {
                ahnj name = ((agdv) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.ahxi
    /* renamed from: recordLookup */
    public /* bridge */ void mo95recordLookup(ahnj ahnjVar, aglo agloVar) {
        ahxc.recordLookup(this, ahnjVar, agloVar);
    }
}
