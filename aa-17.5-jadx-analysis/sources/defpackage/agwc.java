package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agwc implements agwe {
    private final Map<ahnj, agzv> components;
    private final Map<ahnj, agzo> fields;
    private final agzj jClass;
    private final afec<agzq, Boolean> memberFilter;
    private final afec<agzr, Boolean> methodFilter;
    private final Map<ahnj, List<agzr>> methods;

    /* JADX WARN: Multi-variable type inference failed */
    public agwc(agzj agzjVar, afec<? super agzq, Boolean> afecVar) {
        agzjVar.getClass();
        afecVar.getClass();
        this.jClass = agzjVar;
        this.memberFilter = afecVar;
        agwb agwbVar = new agwb(this);
        this.methodFilter = agwbVar;
        airp airpVarL = afrg.l(woy.cm(agzjVar.getMethods()), agwbVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        airz airzVar = new airz((airk) airpVarL, 1);
        while (airzVar.hasNext()) {
            Object next = airzVar.next();
            ahnj name = ((agzr) next).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.methods = linkedHashMap;
        airp airpVarL2 = afrg.l(woy.cm(this.jClass.getFields()), this.memberFilter);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        airz airzVar2 = new airz((airk) airpVarL2, 1);
        while (airzVar2.hasNext()) {
            Object next2 = airzVar2.next();
            linkedHashMap2.put(((agzo) next2).getName(), next2);
        }
        this.fields = linkedHashMap2;
        Collection<agzv> recordComponents = this.jClass.getRecordComponents();
        afec<agzq, Boolean> afecVar2 = this.memberFilter;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : recordComponents) {
            if (((Boolean) afecVar2.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(afpt.e(woy.aV(woy.bp(arrayList2, 10)), 16));
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((agzv) obj2).getName(), obj2);
        }
        this.components = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean methodFilter$lambda$0(agwc agwcVar, agzr agzrVar) {
        agzrVar.getClass();
        return agwcVar.memberFilter.invoke(agzrVar).booleanValue() && !agzp.isObjectMethodInInterface(agzrVar);
    }

    @Override // defpackage.agwe
    public agzo findFieldByName(ahnj ahnjVar) {
        ahnjVar.getClass();
        return this.fields.get(ahnjVar);
    }

    @Override // defpackage.agwe
    public Collection<agzr> findMethodsByName(ahnj ahnjVar) {
        ahnjVar.getClass();
        List<agzr> list = this.methods.get(ahnjVar);
        return list != null ? list : afbe.a;
    }

    @Override // defpackage.agwe
    public agzv findRecordComponentByName(ahnj ahnjVar) {
        ahnjVar.getClass();
        return this.components.get(ahnjVar);
    }

    @Override // defpackage.agwe
    public Set<ahnj> getFieldNames() {
        airp airpVarL = afrg.l(woy.cm(this.jClass.getFields()), this.memberFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        airz airzVar = new airz((airk) airpVarL, 1);
        while (airzVar.hasNext()) {
            linkedHashSet.add(((agzo) airzVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // defpackage.agwe
    public Set<ahnj> getMethodNames() {
        airp airpVarL = afrg.l(woy.cm(this.jClass.getMethods()), this.methodFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        airz airzVar = new airz((airk) airpVarL, 1);
        while (airzVar.hasNext()) {
            linkedHashSet.add(((agzr) airzVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // defpackage.agwe
    public Set<ahnj> getRecordComponentNames() {
        return this.components.keySet();
    }
}
