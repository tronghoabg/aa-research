package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aidk implements defpackage.aicz {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.aidk.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0), new defpackage.afgn(defpackage.aidk.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0), new defpackage.afgn(defpackage.aidk.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0), new defpackage.afgn(defpackage.aidk.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0), new defpackage.afgn(defpackage.aidk.class, "allProperties", "getAllProperties()Ljava/util/List;", 0), new defpackage.afgn(defpackage.aidk.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0), new defpackage.afgn(defpackage.aidk.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0), new defpackage.afgn(defpackage.aidk.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0), new defpackage.afgn(defpackage.aidk.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new defpackage.afgn(defpackage.aidk.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};
    private final defpackage.aifc allFunctions$delegate;
    private final defpackage.aifc allProperties$delegate;
    private final defpackage.aifc allTypeAliases$delegate;
    private final defpackage.aifc declaredFunctions$delegate;
    private final defpackage.aifc declaredProperties$delegate;
    private final java.util.List<defpackage.ahjf> functionList;
    private final defpackage.aifc functionNames$delegate;
    private final defpackage.aifc functionsByName$delegate;
    private final defpackage.aifc propertiesByName$delegate;
    private final java.util.List<defpackage.ahjs> propertyList;
    final /* synthetic */ defpackage.aids this$0;
    private final java.util.List<defpackage.ahkq> typeAliasList;
    private final defpackage.aifc typeAliasesByName$delegate;
    private final defpackage.aifc variableNames$delegate;

    public aidk(defpackage.aids aidsVar, java.util.List<defpackage.ahjf> list, java.util.List<defpackage.ahjs> list2, java.util.List<defpackage.ahkq> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.this$0 = aidsVar;
        this.functionList = list;
        this.propertyList = list2;
        this.typeAliasList = aidsVar.getC().getComponents().getConfiguration().getTypeAliasesAllowed() ? list3 : defpackage.afce.a;
        this.declaredFunctions$delegate = aidsVar.getC().getStorageManager().createLazyValue(new defpackage.aida(this));
        this.declaredProperties$delegate = aidsVar.getC().getStorageManager().createLazyValue(new defpackage.aidb(this));
        this.allTypeAliases$delegate = aidsVar.getC().getStorageManager().createLazyValue(new defpackage.aidc(this));
        this.allFunctions$delegate = aidsVar.getC().getStorageManager().createLazyValue(new defpackage.aidd(this));
        this.allProperties$delegate = aidsVar.getC().getStorageManager().createLazyValue(new defpackage.aide(this));
        this.typeAliasesByName$delegate = aidsVar.getC().getStorageManager().createLazyValue(new defpackage.aidf(this));
        this.functionsByName$delegate = aidsVar.getC().getStorageManager().createLazyValue(new defpackage.aidg(this));
        this.propertiesByName$delegate = aidsVar.getC().getStorageManager().createLazyValue(new defpackage.aidh(this));
        this.functionNames$delegate = aidsVar.getC().getStorageManager().createLazyValue(new defpackage.aidi(this, aidsVar));
        this.variableNames$delegate = aidsVar.getC().getStorageManager().createLazyValue(new defpackage.aidj(this, aidsVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List allFunctions_delegate$lambda$0(defpackage.aidk aidkVar) {
        return defpackage.afga.aS(aidkVar.getDeclaredFunctions(), aidkVar.computeAllNonDeclaredFunctions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List allProperties_delegate$lambda$0(defpackage.aidk aidkVar) {
        return defpackage.afga.aS(aidkVar.getDeclaredProperties(), aidkVar.computeAllNonDeclaredProperties());
    }

    private final java.util.List<defpackage.agev> computeAllNonDeclaredFunctions() {
        java.util.Set<defpackage.ahoj> nonDeclaredFunctionNames = this.this$0.getNonDeclaredFunctionNames();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = nonDeclaredFunctionNames.iterator();
        while (it.hasNext()) {
            defpackage.afga.bk(arrayList, computeNonDeclaredFunctionsForName((defpackage.ahoj) it.next()));
        }
        return arrayList;
    }

    private final java.util.List<defpackage.agen> computeAllNonDeclaredProperties() {
        java.util.Set<defpackage.ahoj> nonDeclaredVariableNames = this.this$0.getNonDeclaredVariableNames();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = nonDeclaredVariableNames.iterator();
        while (it.hasNext()) {
            defpackage.afga.bk(arrayList, computeNonDeclaredPropertiesForName((defpackage.ahoj) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<defpackage.agev> computeFunctions() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = this.functionList.iterator();
        while (it.hasNext()) {
            defpackage.aids aidsVar = this.this$0;
            defpackage.agev agevVarLoadFunction = aidsVar.getC().getMemberDeserializer().loadFunction((defpackage.ahjf) ((defpackage.ahqg) it.next()));
            if (true != aidsVar.isDeclaredFunctionAvailable(agevVarLoadFunction)) {
                agevVarLoadFunction = null;
            }
            if (agevVarLoadFunction != null) {
                arrayList.add(agevVarLoadFunction);
            }
        }
        return arrayList;
    }

    private final java.util.List<defpackage.agev> computeNonDeclaredFunctionsForName(defpackage.ahoj ahojVar) {
        java.util.List<defpackage.agev> declaredFunctions = getDeclaredFunctions();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : declaredFunctions) {
            if (defpackage.afga.f(((defpackage.agci) obj).getName(), ahojVar)) {
                arrayList.add(obj);
            }
        }
        defpackage.aids aidsVar = this.this$0;
        int size = arrayList.size();
        aidsVar.computeNonDeclaredFunctions(ahojVar, arrayList);
        return arrayList.subList(size, arrayList.size());
    }

    private final java.util.List<defpackage.agen> computeNonDeclaredPropertiesForName(defpackage.ahoj ahojVar) {
        java.util.List<defpackage.agen> declaredProperties = getDeclaredProperties();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : declaredProperties) {
            if (defpackage.afga.f(((defpackage.agci) obj).getName(), ahojVar)) {
                arrayList.add(obj);
            }
        }
        defpackage.aids aidsVar = this.this$0;
        int size = arrayList.size();
        aidsVar.computeNonDeclaredProperties(ahojVar, arrayList);
        return arrayList.subList(size, arrayList.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<defpackage.agen> computeProperties() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = this.propertyList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.this$0.getC().getMemberDeserializer().loadProperty((defpackage.ahjs) ((defpackage.ahqg) it.next()), false & ((2 & 2) == 0)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<defpackage.agfd> computeTypeAliases() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = this.typeAliasList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.this$0.getC().getMemberDeserializer().loadTypeAlias((defpackage.ahkq) ((defpackage.ahqg) it.next())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Set functionNames_delegate$lambda$0(defpackage.aidk aidkVar, defpackage.aids aidsVar) {
        java.util.List<defpackage.ahjf> list = aidkVar.functionList;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        defpackage.aids aidsVar2 = aidkVar.this$0;
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(defpackage.aiaz.getName(aidsVar2.getC().getNameResolver(), ((defpackage.ahjf) ((defpackage.ahqg) it.next())).getName()));
        }
        return defpackage.afga.M(linkedHashSet, aidsVar.getNonDeclaredFunctionNames());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map functionsByName_delegate$lambda$0(defpackage.aidk aidkVar) {
        java.util.List<defpackage.agev> allFunctions = aidkVar.getAllFunctions();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : allFunctions) {
            defpackage.ahoj name = ((defpackage.agev) obj).getName();
            name.getClass();
            java.lang.Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        return linkedHashMap;
    }

    private final java.util.List<defpackage.agev> getAllFunctions() {
        return (java.util.List) defpackage.aifh.getValue(this.allFunctions$delegate, this, $$delegatedProperties[3]);
    }

    private final java.util.List<defpackage.agen> getAllProperties() {
        return (java.util.List) defpackage.aifh.getValue(this.allProperties$delegate, this, $$delegatedProperties[4]);
    }

    private final java.util.List<defpackage.agfd> getAllTypeAliases() {
        return (java.util.List) defpackage.aifh.getValue(this.allTypeAliases$delegate, this, $$delegatedProperties[2]);
    }

    private final java.util.List<defpackage.agev> getDeclaredFunctions() {
        return (java.util.List) defpackage.aifh.getValue(this.declaredFunctions$delegate, this, $$delegatedProperties[0]);
    }

    private final java.util.List<defpackage.agen> getDeclaredProperties() {
        return (java.util.List) defpackage.aifh.getValue(this.declaredProperties$delegate, this, $$delegatedProperties[1]);
    }

    private final java.util.Map<defpackage.ahoj, java.util.Collection<defpackage.agev>> getFunctionsByName() {
        return (java.util.Map) defpackage.aifh.getValue(this.functionsByName$delegate, this, $$delegatedProperties[6]);
    }

    private final java.util.Map<defpackage.ahoj, java.util.Collection<defpackage.agen>> getPropertiesByName() {
        return (java.util.Map) defpackage.aifh.getValue(this.propertiesByName$delegate, this, $$delegatedProperties[7]);
    }

    private final java.util.Map<defpackage.ahoj, defpackage.agfd> getTypeAliasesByName() {
        return (java.util.Map) defpackage.aifh.getValue(this.typeAliasesByName$delegate, this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map propertiesByName_delegate$lambda$0(defpackage.aidk aidkVar) {
        java.util.List<defpackage.agen> allProperties = aidkVar.getAllProperties();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : allProperties) {
            defpackage.ahoj name = ((defpackage.agen) obj).getName();
            name.getClass();
            java.lang.Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map typeAliasesByName_delegate$lambda$0(defpackage.aidk aidkVar) {
        java.util.List<defpackage.agfd> allTypeAliases = aidkVar.getAllTypeAliases();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.afqt.e(defpackage.afga.P(defpackage.afga.aj(allTypeAliases, 10)), 16));
        for (java.lang.Object obj : allTypeAliases) {
            defpackage.ahoj name = ((defpackage.agfd) obj).getName();
            name.getClass();
            linkedHashMap.put(name, obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Set variableNames_delegate$lambda$0(defpackage.aidk aidkVar, defpackage.aids aidsVar) {
        java.util.List<defpackage.ahjs> list = aidkVar.propertyList;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        defpackage.aids aidsVar2 = aidkVar.this$0;
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(defpackage.aiaz.getName(aidsVar2.getC().getNameResolver(), ((defpackage.ahjs) ((defpackage.ahqg) it.next())).getName()));
        }
        return defpackage.afga.M(linkedHashSet, aidsVar.getNonDeclaredVariableNames());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aicz
    public void addFunctionsAndPropertiesTo(java.util.Collection<defpackage.agci> collection, defpackage.ahxt ahxtVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar, defpackage.agmo agmoVar) {
        collection.getClass();
        ahxtVar.getClass();
        affcVar.getClass();
        agmoVar.getClass();
        if (ahxtVar.acceptsKinds(defpackage.ahxt.Companion.getVARIABLES_MASK())) {
            for (java.lang.Object obj : getAllProperties()) {
                defpackage.ahoj name = ((defpackage.agen) obj).getName();
                name.getClass();
                if (affcVar.invoke(name).booleanValue()) {
                    collection.add(obj);
                }
            }
        }
        if (ahxtVar.acceptsKinds(defpackage.ahxt.Companion.getFUNCTIONS_MASK())) {
            for (java.lang.Object obj2 : getAllFunctions()) {
                defpackage.ahoj name2 = ((defpackage.agev) obj2).getName();
                name2.getClass();
                if (affcVar.invoke(name2).booleanValue()) {
                    collection.add(obj2);
                }
            }
        }
    }

    @Override // defpackage.aicz
    public java.util.Collection<defpackage.agev> getContributedFunctions(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        java.util.Collection<defpackage.agev> collection;
        ahojVar.getClass();
        agmoVar.getClass();
        return (getFunctionNames().contains(ahojVar) && (collection = getFunctionsByName().get(ahojVar)) != null) ? collection : defpackage.afce.a;
    }

    @Override // defpackage.aicz
    public java.util.Collection<defpackage.agen> getContributedVariables(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        java.util.Collection<defpackage.agen> collection;
        ahojVar.getClass();
        agmoVar.getClass();
        return (getVariableNames().contains(ahojVar) && (collection = getPropertiesByName().get(ahojVar)) != null) ? collection : defpackage.afce.a;
    }

    @Override // defpackage.aicz
    public java.util.Set<defpackage.ahoj> getFunctionNames() {
        return (java.util.Set) defpackage.aifh.getValue(this.functionNames$delegate, this, $$delegatedProperties[8]);
    }

    @Override // defpackage.aicz
    public defpackage.agfd getTypeAliasByName(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return getTypeAliasesByName().get(ahojVar);
    }

    @Override // defpackage.aicz
    public java.util.Set<defpackage.ahoj> getTypeAliasNames() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<T> it = this.typeAliasList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(defpackage.aiaz.getName(this.this$0.getC().getNameResolver(), ((defpackage.ahkq) ((defpackage.ahqg) it.next())).getName()));
        }
        return linkedHashSet;
    }

    @Override // defpackage.aicz
    public java.util.Set<defpackage.ahoj> getVariableNames() {
        return (java.util.Set) defpackage.aifh.getValue(this.variableNames$delegate, this, $$delegatedProperties[9]);
    }
}
