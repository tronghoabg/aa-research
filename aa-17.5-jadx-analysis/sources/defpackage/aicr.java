package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class aicr implements aibz {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(aicr.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new affn(aicr.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};
    private final aiec functionNames$delegate;
    private final Map<ahnj, byte[]> functionProtosBytes;
    private final aiea<ahnj, Collection<agdv>> functions;
    private final aiea<ahnj, Collection<agdn>> properties;
    private final Map<ahnj, byte[]> propertyProtosBytes;
    final /* synthetic */ aics this$0;
    private final aieb<ahnj, aged> typeAliasByName;
    private final Map<ahnj, byte[]> typeAliasBytes;
    private final aiec variableNames$delegate;

    public aicr(aics aicsVar, List<ahif> list, List<ahis> list2, List<ahjq> list3) throws IOException {
        Map<ahnj, byte[]> mapPackToByteArray;
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.this$0 = aicsVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            ahnj name = ahzz.getName(aicsVar.getC().getNameResolver(), ((ahif) ((ahpg) obj)).getName());
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.functionProtosBytes = packToByteArray(linkedHashMap);
        aics aicsVar2 = this.this$0;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            ahnj name2 = ahzz.getName(aicsVar2.getC().getNameResolver(), ((ahis) ((ahpg) obj2)).getName());
            Object arrayList2 = linkedHashMap2.get(name2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(name2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.propertyProtosBytes = packToByteArray(linkedHashMap2);
        if (this.this$0.getC().getComponents().getConfiguration().getTypeAliasesAllowed()) {
            aics aicsVar3 = this.this$0;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : list3) {
                ahnj name3 = ahzz.getName(aicsVar3.getC().getNameResolver(), ((ahjq) ((ahpg) obj3)).getName());
                Object arrayList3 = linkedHashMap3.get(name3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(name3, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            mapPackToByteArray = packToByteArray(linkedHashMap3);
        } else {
            mapPackToByteArray = afbf.a;
        }
        this.typeAliasBytes = mapPackToByteArray;
        this.functions = this.this$0.getC().getStorageManager().createMemoizedFunction(new aicl(this));
        this.properties = this.this$0.getC().getStorageManager().createMemoizedFunction(new aicm(this));
        this.typeAliasByName = this.this$0.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new aicn(this));
        this.functionNames$delegate = this.this$0.getC().getStorageManager().createLazyValue(new aico(this, this.this$0));
        this.variableNames$delegate = this.this$0.getC().getStorageManager().createLazyValue(new aicp(this, this.this$0));
    }

    private final Collection<agdv> computeFunctions(ahnj ahnjVar) {
        Collection collectionJ;
        ahpi<ahif> ahpiVar = ahif.PARSER;
        ahpiVar.getClass();
        byte[] bArr = this.functionProtosBytes.get(ahnjVar);
        if (bArr != null) {
            collectionJ = afrg.j(afrg.e(new aicq(ahpiVar, new ByteArrayInputStream(bArr), this.this$0)));
        } else {
            collectionJ = afbe.a;
        }
        ArrayList arrayList = new ArrayList(collectionJ.size());
        Iterator it = collectionJ.iterator();
        while (true) {
            aics aicsVar = this.this$0;
            if (!it.hasNext()) {
                aicsVar.computeNonDeclaredFunctions(ahnjVar, arrayList);
                return aiow.compact(arrayList);
            }
            ahif ahifVar = (ahif) it.next();
            ahzy memberDeserializer = aicsVar.getC().getMemberDeserializer();
            ahifVar.getClass();
            agdv agdvVarLoadFunction = memberDeserializer.loadFunction(ahifVar);
            if (true != aicsVar.isDeclaredFunctionAvailable(agdvVarLoadFunction)) {
                agdvVarLoadFunction = null;
            }
            if (agdvVarLoadFunction != null) {
                arrayList.add(agdvVarLoadFunction);
            }
        }
    }

    private final Collection<agdn> computeProperties(ahnj ahnjVar) {
        Collection collectionJ;
        ahpi<ahis> ahpiVar = ahis.PARSER;
        ahpiVar.getClass();
        byte[] bArr = this.propertyProtosBytes.get(ahnjVar);
        if (bArr != null) {
            collectionJ = afrg.j(afrg.e(new aicq(ahpiVar, new ByteArrayInputStream(bArr), this.this$0)));
        } else {
            collectionJ = afbe.a;
        }
        ArrayList arrayList = new ArrayList(collectionJ.size());
        Iterator it = collectionJ.iterator();
        while (true) {
            aics aicsVar = this.this$0;
            if (!it.hasNext()) {
                aicsVar.computeNonDeclaredProperties(ahnjVar, arrayList);
                return aiow.compact(arrayList);
            }
            ahis ahisVar = (ahis) it.next();
            ahzy memberDeserializer = aicsVar.getC().getMemberDeserializer();
            ahisVar.getClass();
            arrayList.add(memberDeserializer.loadProperty(ahisVar, false & ((2 & 2) == 0)));
        }
    }

    private final aged createTypeAlias(ahnj ahnjVar) {
        ahjq delimitedFrom;
        byte[] bArr = this.typeAliasBytes.get(ahnjVar);
        if (bArr == null || (delimitedFrom = ahjq.parseDelimitedFrom(new ByteArrayInputStream(bArr), this.this$0.getC().getComponents().getExtensionRegistryLite())) == null) {
            return null;
        }
        return this.this$0.getC().getMemberDeserializer().loadTypeAlias(delimitedFrom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set functionNames_delegate$lambda$0(aicr aicrVar, aics aicsVar) {
        return woy.aS(aicrVar.functionProtosBytes.keySet(), aicsVar.getNonDeclaredFunctionNames());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection functions$lambda$0(aicr aicrVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        return aicrVar.computeFunctions(ahnjVar);
    }

    private final Map<ahnj, byte[]> packToByteArray(Map<ahnj, ? extends Collection<? extends ahnt>> map) throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(woy.bp(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((ahnt) it2.next()).writeDelimitedTo(byteArrayOutputStream);
                arrayList.add(afak.a);
            }
            linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection properties$lambda$0(aicr aicrVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        return aicrVar.computeProperties(ahnjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aged typeAliasByName$lambda$0(aicr aicrVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        return aicrVar.createTypeAlias(ahnjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set variableNames_delegate$lambda$0(aicr aicrVar, aics aicsVar) {
        return woy.aS(aicrVar.propertyProtosBytes.keySet(), aicsVar.getNonDeclaredVariableNames());
    }

    @Override // defpackage.aibz
    public void addFunctionsAndPropertiesTo(Collection<agbi> collection, ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar, aglo agloVar) {
        collection.getClass();
        ahwtVar.getClass();
        afecVar.getClass();
        agloVar.getClass();
        if (ahwtVar.acceptsKinds(ahwt.Companion.getVARIABLES_MASK())) {
            Set<ahnj> variableNames = getVariableNames();
            ArrayList arrayList = new ArrayList();
            for (ahnj ahnjVar : variableNames) {
                if (afecVar.invoke(ahnjVar).booleanValue()) {
                    arrayList.addAll(getContributedVariables(ahnjVar, agloVar));
                }
            }
            ahsx ahsxVar = ahsx.INSTANCE;
            ahsxVar.getClass();
            woy.bs(arrayList, ahsxVar);
            collection.addAll(arrayList);
        }
        if (ahwtVar.acceptsKinds(ahwt.Companion.getFUNCTIONS_MASK())) {
            Set<ahnj> functionNames = getFunctionNames();
            ArrayList arrayList2 = new ArrayList();
            for (ahnj ahnjVar2 : functionNames) {
                if (afecVar.invoke(ahnjVar2).booleanValue()) {
                    arrayList2.addAll(getContributedFunctions(ahnjVar2, agloVar));
                }
            }
            ahsx ahsxVar2 = ahsx.INSTANCE;
            ahsxVar2.getClass();
            woy.bs(arrayList2, ahsxVar2);
            collection.addAll(arrayList2);
        }
    }

    @Override // defpackage.aibz
    public Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return !getFunctionNames().contains(ahnjVar) ? afbe.a : this.functions.invoke(ahnjVar);
    }

    @Override // defpackage.aibz
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return !getVariableNames().contains(ahnjVar) ? afbe.a : this.properties.invoke(ahnjVar);
    }

    @Override // defpackage.aibz
    public Set<ahnj> getFunctionNames() {
        return (Set) aieh.getValue(this.functionNames$delegate, this, $$delegatedProperties[0]);
    }

    @Override // defpackage.aibz
    public aged getTypeAliasByName(ahnj ahnjVar) {
        ahnjVar.getClass();
        return this.typeAliasByName.invoke(ahnjVar);
    }

    @Override // defpackage.aibz
    public Set<ahnj> getTypeAliasNames() {
        return this.typeAliasBytes.keySet();
    }

    @Override // defpackage.aibz
    public Set<ahnj> getVariableNames() {
        return (Set) aieh.getValue(this.variableNames$delegate, this, $$delegatedProperties[1]);
    }
}
