package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agip extends ahxf {
    private final ahnf fqName;
    private final agcu moduleDescriptor;

    public agip(agcu agcuVar, ahnf ahnfVar) {
        agcuVar.getClass();
        ahnfVar.getClass();
        this.moduleDescriptor = agcuVar;
        this.fqName = ahnfVar;
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        return afbg.a;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        if (!ahwtVar.acceptsKinds(ahwt.Companion.getPACKAGES_MASK()) || (this.fqName.isRoot() && ahwtVar.getExcludes().contains(ahwn.INSTANCE))) {
            return afbe.a;
        }
        Collection<ahnf> subPackagesOf = this.moduleDescriptor.getSubPackagesOf(this.fqName, afecVar);
        ArrayList arrayList = new ArrayList(subPackagesOf.size());
        Iterator<ahnf> it = subPackagesOf.iterator();
        while (it.hasNext()) {
            ahnj ahnjVarShortName = it.next().shortName();
            if (afecVar.invoke(ahnjVarShortName).booleanValue()) {
                aiow.addIfNotNull(arrayList, getPackage(ahnjVarShortName));
            }
        }
        return arrayList;
    }

    protected final agdj getPackage(ahnj ahnjVar) {
        ahnjVar.getClass();
        if (ahnjVar.isSpecial()) {
            return null;
        }
        agdj agdjVar = this.moduleDescriptor.getPackage(this.fqName.child(ahnjVar));
        if (agdjVar.isEmpty()) {
            return null;
        }
        return agdjVar;
    }

    public String toString() {
        return "subpackages of " + this.fqName + " from " + this.moduleDescriptor;
    }
}
