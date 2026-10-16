package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class aick implements aibz {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(aick.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0), new affn(aick.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0), new affn(aick.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0), new affn(aick.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0), new affn(aick.class, "allProperties", "getAllProperties()Ljava/util/List;", 0), new affn(aick.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0), new affn(aick.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0), new affn(aick.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0), new affn(aick.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new affn(aick.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};
    private final aiec allFunctions$delegate;
    private final aiec allProperties$delegate;
    private final aiec allTypeAliases$delegate;
    private final aiec declaredFunctions$delegate;
    private final aiec declaredProperties$delegate;
    private final List<ahif> functionList;
    private final aiec functionNames$delegate;
    private final aiec functionsByName$delegate;
    private final aiec propertiesByName$delegate;
    private final List<ahis> propertyList;
    final /* synthetic */ aics this$0;
    private final List<ahjq> typeAliasList;
    private final aiec typeAliasesByName$delegate;
    private final aiec variableNames$delegate;

    public aick(aics aicsVar, List<ahif> list, List<ahis> list2, List<ahjq> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.this$0 = aicsVar;
        this.functionList = list;
        this.propertyList = list2;
        this.typeAliasList = aicsVar.getC().getComponents().getConfiguration().getTypeAliasesAllowed() ? list3 : afbe.a;
        this.declaredFunctions$delegate = aicsVar.getC().getStorageManager().createLazyValue(new aica(this));
        this.declaredProperties$delegate = aicsVar.getC().getStorageManager().createLazyValue(new aicb(this));
        this.allTypeAliases$delegate = aicsVar.getC().getStorageManager().createLazyValue(new aicc(this));
        this.allFunctions$delegate = aicsVar.getC().getStorageManager().createLazyValue(new aicd(this));
        this.allProperties$delegate = aicsVar.getC().getStorageManager().createLazyValue(new aice(this));
        this.typeAliasesByName$delegate = aicsVar.getC().getStorageManager().createLazyValue(new aicf(this));
        this.functionsByName$delegate = aicsVar.getC().getStorageManager().createLazyValue(new aicg(this));
        this.propertiesByName$delegate = aicsVar.getC().getStorageManager().createLazyValue(new aich(this));
        this.functionNames$delegate = aicsVar.getC().getStorageManager().createLazyValue(new aici(this, aicsVar));
        this.variableNames$delegate = aicsVar.getC().getStorageManager().createLazyValue(new aicj(this, aicsVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allFunctions_delegate$lambda$0(aick aickVar) {
        return woy.bY(aickVar.getDeclaredFunctions(), aickVar.computeAllNonDeclaredFunctions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allProperties_delegate$lambda$0(aick aickVar) {
        return woy.bY(aickVar.getDeclaredProperties(), aickVar.computeAllNonDeclaredProperties());
    }

    private final List<agdv> computeAllNonDeclaredFunctions() {
        Set<ahnj> nonDeclaredFunctionNames = this.this$0.getNonDeclaredFunctionNames();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = nonDeclaredFunctionNames.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, computeNonDeclaredFunctionsForName((ahnj) it.next()));
        }
        return arrayList;
    }

    private final List<agdn> computeAllNonDeclaredProperties() {
        Set<ahnj> nonDeclaredVariableNames = this.this$0.getNonDeclaredVariableNames();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = nonDeclaredVariableNames.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, computeNonDeclaredPropertiesForName((ahnj) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<agdv> computeFunctions() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.functionList.iterator();
        while (it.hasNext()) {
            aics aicsVar = this.this$0;
            agdv agdvVarLoadFunction = aicsVar.getC().getMemberDeserializer().loadFunction((ahif) ((ahpg) it.next()));
            if (true != aicsVar.isDeclaredFunctionAvailable(agdvVarLoadFunction)) {
                agdvVarLoadFunction = null;
            }
            if (agdvVarLoadFunction != null) {
                arrayList.add(agdvVarLoadFunction);
            }
        }
        return arrayList;
    }

    private final List<agdv> computeNonDeclaredFunctionsForName(ahnj ahnjVar) {
        List<agdv> declaredFunctions = getDeclaredFunctions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : declaredFunctions) {
            if (affa.f(((agbi) obj).getName(), ahnjVar)) {
                arrayList.add(obj);
            }
        }
        aics aicsVar = this.this$0;
        int size = arrayList.size();
        aicsVar.computeNonDeclaredFunctions(ahnjVar, arrayList);
        return arrayList.subList(size, arrayList.size());
    }

    private final List<agdn> computeNonDeclaredPropertiesForName(ahnj ahnjVar) {
        List<agdn> declaredProperties = getDeclaredProperties();
        ArrayList arrayList = new ArrayList();
        for (Object obj : declaredProperties) {
            if (affa.f(((agbi) obj).getName(), ahnjVar)) {
                arrayList.add(obj);
            }
        }
        aics aicsVar = this.this$0;
        int size = arrayList.size();
        aicsVar.computeNonDeclaredProperties(ahnjVar, arrayList);
        return arrayList.subList(size, arrayList.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<agdn> computeProperties() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.propertyList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.this$0.getC().getMemberDeserializer().loadProperty((ahis) ((ahpg) it.next()), false & ((2 & 2) == 0)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<aged> computeTypeAliases() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.typeAliasList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.this$0.getC().getMemberDeserializer().loadTypeAlias((ahjq) ((ahpg) it.next())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set functionNames_delegate$lambda$0(aick aickVar, aics aicsVar) {
        List<ahif> list = aickVar.functionList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        aics aicsVar2 = aickVar.this$0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ahzz.getName(aicsVar2.getC().getNameResolver(), ((ahif) ((ahpg) it.next())).getName()));
        }
        return woy.aS(linkedHashSet, aicsVar.getNonDeclaredFunctionNames());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map functionsByName_delegate$lambda$0(aick aickVar) {
        List<agdv> allFunctions = aickVar.getAllFunctions();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : allFunctions) {
            ahnj name = ((agdv) obj).getName();
            name.getClass();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return linkedHashMap;
    }

    private final List<agdv> getAllFunctions() {
        return (List) aieh.getValue(this.allFunctions$delegate, this, $$delegatedProperties[3]);
    }

    private final List<agdn> getAllProperties() {
        return (List) aieh.getValue(this.allProperties$delegate, this, $$delegatedProperties[4]);
    }

    private final List<aged> getAllTypeAliases() {
        return (List) aieh.getValue(this.allTypeAliases$delegate, this, $$delegatedProperties[2]);
    }

    private final List<agdv> getDeclaredFunctions() {
        return (List) aieh.getValue(this.declaredFunctions$delegate, this, $$delegatedProperties[0]);
    }

    private final List<agdn> getDeclaredProperties() {
        return (List) aieh.getValue(this.declaredProperties$delegate, this, $$delegatedProperties[1]);
    }

    private final Map<ahnj, Collection<agdv>> getFunctionsByName() {
        return (Map) aieh.getValue(this.functionsByName$delegate, this, $$delegatedProperties[6]);
    }

    private final Map<ahnj, Collection<agdn>> getPropertiesByName() {
        return (Map) aieh.getValue(this.propertiesByName$delegate, this, $$delegatedProperties[7]);
    }

    private final Map<ahnj, aged> getTypeAliasesByName() {
        return (Map) aieh.getValue(this.typeAliasesByName$delegate, this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map propertiesByName_delegate$lambda$0(aick aickVar) {
        List<agdn> allProperties = aickVar.getAllProperties();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : allProperties) {
            ahnj name = ((agdn) obj).getName();
            name.getClass();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map typeAliasesByName_delegate$lambda$0(aick aickVar) {
        List<aged> allTypeAliases = aickVar.getAllTypeAliases();
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(allTypeAliases, 10)), 16));
        for (Object obj : allTypeAliases) {
            ahnj name = ((aged) obj).getName();
            name.getClass();
            linkedHashMap.put(name, obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set variableNames_delegate$lambda$0(aick aickVar, aics aicsVar) {
        List<ahis> list = aickVar.propertyList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        aics aicsVar2 = aickVar.this$0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ahzz.getName(aicsVar2.getC().getNameResolver(), ((ahis) ((ahpg) it.next())).getName()));
        }
        return woy.aS(linkedHashSet, aicsVar.getNonDeclaredVariableNames());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aibz
    public void addFunctionsAndPropertiesTo(Collection<agbi> collection, ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar, aglo agloVar) {
        collection.getClass();
        ahwtVar.getClass();
        afecVar.getClass();
        agloVar.getClass();
        if (ahwtVar.acceptsKinds(ahwt.Companion.getVARIABLES_MASK())) {
            for (Object obj : getAllProperties()) {
                ahnj name = ((agdn) obj).getName();
                name.getClass();
                if (afecVar.invoke(name).booleanValue()) {
                    collection.add(obj);
                }
            }
        }
        if (ahwtVar.acceptsKinds(ahwt.Companion.getFUNCTIONS_MASK())) {
            for (Object obj2 : getAllFunctions()) {
                ahnj name2 = ((agdv) obj2).getName();
                name2.getClass();
                if (afecVar.invoke(name2).booleanValue()) {
                    collection.add(obj2);
                }
            }
        }
    }

    @Override // defpackage.aibz
    public Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        Collection<agdv> collection;
        ahnjVar.getClass();
        agloVar.getClass();
        return (getFunctionNames().contains(ahnjVar) && (collection = getFunctionsByName().get(ahnjVar)) != null) ? collection : afbe.a;
    }

    @Override // defpackage.aibz
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        Collection<agdn> collection;
        ahnjVar.getClass();
        agloVar.getClass();
        return (getVariableNames().contains(ahnjVar) && (collection = getPropertiesByName().get(ahnjVar)) != null) ? collection : afbe.a;
    }

    @Override // defpackage.aibz
    public Set<ahnj> getFunctionNames() {
        return (Set) aieh.getValue(this.functionNames$delegate, this, $$delegatedProperties[8]);
    }

    @Override // defpackage.aibz
    public aged getTypeAliasByName(ahnj ahnjVar) {
        ahnjVar.getClass();
        return getTypeAliasesByName().get(ahnjVar);
    }

    @Override // defpackage.aibz
    public Set<ahnj> getTypeAliasNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = this.typeAliasList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ahzz.getName(this.this$0.getC().getNameResolver(), ((ahjq) ((ahpg) it.next())).getName()));
        }
        return linkedHashSet;
    }

    @Override // defpackage.aibz
    public Set<ahnj> getVariableNames() {
        return (Set) aieh.getValue(this.variableNames$delegate, this, $$delegatedProperties[9]);
    }
}
