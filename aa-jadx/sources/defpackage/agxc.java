package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agxc implements defpackage.agxe {
    private final java.util.Map<defpackage.ahoj, defpackage.ahav> components;
    private final java.util.Map<defpackage.ahoj, defpackage.ahao> fields;
    private final defpackage.ahaj jClass;
    private final defpackage.affc<defpackage.ahaq, java.lang.Boolean> memberFilter;
    private final defpackage.affc<defpackage.ahar, java.lang.Boolean> methodFilter;
    private final java.util.Map<defpackage.ahoj, java.util.List<defpackage.ahar>> methods;

    /* JADX WARN: Multi-variable type inference failed */
    public agxc(defpackage.ahaj ahajVar, defpackage.affc<? super defpackage.ahaq, java.lang.Boolean> affcVar) {
        ahajVar.getClass();
        affcVar.getClass();
        this.jClass = ahajVar;
        this.memberFilter = affcVar;
        defpackage.agxb agxbVar = new defpackage.agxb(this);
        this.methodFilter = agxbVar;
        defpackage.aisp aispVarL = defpackage.afsg.l(defpackage.afga.bg(ahajVar.getMethods()), agxbVar);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        defpackage.aisy aisyVar = new defpackage.aisy((defpackage.aisk) aispVarL, 1);
        while (aisyVar.hasNext()) {
            java.lang.Object next = aisyVar.next();
            defpackage.ahoj name = ((defpackage.ahar) next).getName();
            java.lang.Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((java.util.List) arrayList).add(next);
        }
        this.methods = linkedHashMap;
        defpackage.aisp aispVarL2 = defpackage.afsg.l(defpackage.afga.bg(this.jClass.getFields()), this.memberFilter);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        defpackage.aisy aisyVar2 = new defpackage.aisy((defpackage.aisk) aispVarL2, 1);
        while (aisyVar2.hasNext()) {
            java.lang.Object next2 = aisyVar2.next();
            linkedHashMap2.put(((defpackage.ahao) next2).getName(), next2);
        }
        this.fields = linkedHashMap2;
        java.util.Collection<defpackage.ahav> recordComponents = this.jClass.getRecordComponents();
        defpackage.affc<defpackage.ahaq, java.lang.Boolean> affcVar2 = this.memberFilter;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : recordComponents) {
            if (affcVar2.invoke((defpackage.ahaq) obj).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(defpackage.afqt.e(defpackage.afga.P(defpackage.afga.aj(arrayList2, 10)), 16));
        for (java.lang.Object obj2 : arrayList2) {
            linkedHashMap3.put(((defpackage.ahav) obj2).getName(), obj2);
        }
        this.components = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean methodFilter$lambda$0(defpackage.agxc agxcVar, defpackage.ahar aharVar) {
        aharVar.getClass();
        return agxcVar.memberFilter.invoke(aharVar).booleanValue() && !defpackage.ahap.isObjectMethodInInterface(aharVar);
    }

    @Override // defpackage.agxe
    public defpackage.ahao findFieldByName(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return this.fields.get(ahojVar);
    }

    @Override // defpackage.agxe
    public java.util.Collection<defpackage.ahar> findMethodsByName(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        java.util.List<defpackage.ahar> list = this.methods.get(ahojVar);
        return list != null ? list : defpackage.afce.a;
    }

    @Override // defpackage.agxe
    public defpackage.ahav findRecordComponentByName(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return this.components.get(ahojVar);
    }

    @Override // defpackage.agxe
    public java.util.Set<defpackage.ahoj> getFieldNames() {
        defpackage.aisp aispVarL = defpackage.afsg.l(defpackage.afga.bg(this.jClass.getFields()), this.memberFilter);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        defpackage.aisy aisyVar = new defpackage.aisy((defpackage.aisk) aispVarL, 1);
        while (aisyVar.hasNext()) {
            linkedHashSet.add(((defpackage.ahao) aisyVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // defpackage.agxe
    public java.util.Set<defpackage.ahoj> getMethodNames() {
        defpackage.aisp aispVarL = defpackage.afsg.l(defpackage.afga.bg(this.jClass.getMethods()), this.methodFilter);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        defpackage.aisy aisyVar = new defpackage.aisy((defpackage.aisk) aispVarL, 1);
        while (aisyVar.hasNext()) {
            linkedHashSet.add(((defpackage.ahar) aisyVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // defpackage.agxe
    public java.util.Set<defpackage.ahoj> getRecordComponentNames() {
        return this.components.keySet();
    }
}
