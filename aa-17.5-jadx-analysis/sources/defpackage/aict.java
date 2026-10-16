package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aict extends aics {
    private final String debugName;
    private final agdc packageDescriptor;
    private final ahnf packageFqName;
    private final ahim proto;

    public aict(agdc agdcVar, ahim ahimVar, ahld ahldVar, ahkv ahkvVar, aibv aibvVar, ahyv ahyvVar, String str, afdr<? extends Collection<ahnj>> afdrVar) {
        agdcVar.getClass();
        ahimVar.getClass();
        ahldVar.getClass();
        ahkvVar.getClass();
        ahyvVar.getClass();
        str.getClass();
        afdrVar.getClass();
        ahjy typeTable = ahimVar.getTypeTable();
        typeTable.getClass();
        ahlh ahlhVar = new ahlh(typeTable);
        ahlm ahlmVar = ahln.Companion;
        ahkl versionRequirementTable = ahimVar.getVersionRequirementTable();
        versionRequirementTable.getClass();
        ahyy ahyyVarCreateContext = ahyvVar.createContext(agdcVar, ahldVar, ahlhVar, ahlmVar.create(versionRequirementTable), ahkvVar, aibvVar);
        List<ahif> functionList = ahimVar.getFunctionList();
        functionList.getClass();
        List<ahis> propertyList = ahimVar.getPropertyList();
        propertyList.getClass();
        List<ahjq> typeAliasList = ahimVar.getTypeAliasList();
        typeAliasList.getClass();
        super(ahyyVarCreateContext, functionList, propertyList, typeAliasList, afdrVar);
        this.packageDescriptor = agdcVar;
        this.proto = ahimVar;
        this.debugName = str;
        this.packageFqName = agdcVar.getFqName();
    }

    @Override // defpackage.aics
    protected void addEnumEntryDescriptors(Collection<agbi> collection, afec<? super ahnj, Boolean> afecVar) {
        collection.getClass();
        afecVar.getClass();
    }

    @Override // defpackage.aics
    protected ahnd createClassId(ahnj ahnjVar) {
        ahnjVar.getClass();
        return new ahnd(this.packageFqName, ahnjVar);
    }

    @Override // defpackage.aics, defpackage.ahxf, defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        mo95recordLookup(ahnjVar, agloVar);
        return super.getContributedClassifier(ahnjVar, agloVar);
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public List<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        Collection<agbi> collectionComputeDescriptors = computeDescriptors(ahwtVar, afecVar, aglr.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<agfy> fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        ArrayList arrayList = new ArrayList();
        Iterator<agfy> it = fictitiousClassDescriptorFactories.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, it.next().getAllContributedClassesIfPossible(this.packageFqName));
        }
        return woy.bY(collectionComputeDescriptors, arrayList);
    }

    @Override // defpackage.aics
    protected Set<ahnj> getNonDeclaredClassifierNames() {
        return afbg.a;
    }

    @Override // defpackage.aics
    protected Set<ahnj> getNonDeclaredFunctionNames() {
        return afbg.a;
    }

    @Override // defpackage.aics
    protected Set<ahnj> getNonDeclaredVariableNames() {
        return afbg.a;
    }

    public final ahim getProto() {
        return this.proto;
    }

    @Override // defpackage.aics
    protected boolean hasClass(ahnj ahnjVar) {
        ahnjVar.getClass();
        if (super.hasClass(ahnjVar)) {
            return true;
        }
        Iterable<agfy> fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        if ((fictitiousClassDescriptorFactories instanceof Collection) && ((Collection) fictitiousClassDescriptorFactories).isEmpty()) {
            return false;
        }
        Iterator<agfy> it = fictitiousClassDescriptorFactories.iterator();
        while (it.hasNext()) {
            if (it.next().shouldCreateClass(this.packageFqName, ahnjVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    /* renamed from: recordLookup */
    public void mo95recordLookup(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        aglm.record(getC().getComponents().getLookupTracker(), agloVar, this.packageDescriptor, ahnjVar);
    }

    public String toString() {
        return this.debugName;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public /* bridge */ /* synthetic */ Collection getContributedDescriptors(ahwt ahwtVar, afec afecVar) {
        return getContributedDescriptors(ahwtVar, (afec<? super ahnj, Boolean>) afecVar);
    }
}
