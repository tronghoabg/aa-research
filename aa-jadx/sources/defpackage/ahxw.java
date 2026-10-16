package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahxw extends defpackage.ahyf {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.ahxw.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};
    private final defpackage.aifc allDescriptors$delegate;
    private final defpackage.agca containingClass;

    public ahxw(defpackage.aifi aifiVar, defpackage.agca agcaVar) {
        aifiVar.getClass();
        agcaVar.getClass();
        this.containingClass = agcaVar;
        this.allDescriptors$delegate = aifiVar.createLazyValue(new defpackage.ahxu(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List allDescriptors_delegate$lambda$0(defpackage.ahxw ahxwVar) {
        java.util.List<defpackage.agdj> listComputeDeclaredFunctions = ahxwVar.computeDeclaredFunctions();
        return defpackage.afga.aS(listComputeDeclaredFunctions, ahxwVar.createFakeOverrides(listComputeDeclaredFunctions));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.util.List<defpackage.agci> createFakeOverrides(java.util.List<? extends defpackage.agdj> list) {
        java.util.Collection<? extends defpackage.agbx> arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
        java.util.Collection<defpackage.aihl> collectionMo89getSupertypes = this.containingClass.getTypeConstructor().mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it = collectionMo89getSupertypes.iterator();
        while (it.hasNext()) {
            defpackage.afga.bk(arrayList3, defpackage.ahyh.getContributedDescriptors$default(((defpackage.aihl) it.next()).getMemberScope(), null, null, 3, null));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList3) {
            if (obj instanceof defpackage.agbx) {
                arrayList4.add(obj);
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : arrayList4) {
            defpackage.ahoj name = ((defpackage.agbx) obj2).getName();
            java.lang.Object arrayList5 = linkedHashMap.get(name);
            if (arrayList5 == null) {
                arrayList5 = new java.util.ArrayList();
                linkedHashMap.put(name, arrayList5);
            }
            ((java.util.List) arrayList5).add(obj2);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            key.getClass();
            defpackage.ahoj ahojVar = (defpackage.ahoj) key;
            java.util.List list2 = (java.util.List) entry.getValue();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (java.lang.Object obj3 : list2) {
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((defpackage.agbx) obj3) instanceof defpackage.agdj);
                java.lang.Object arrayList6 = linkedHashMap2.get(boolValueOf);
                if (arrayList6 == null) {
                    arrayList6 = new java.util.ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList6);
                }
                ((java.util.List) arrayList6).add(obj3);
            }
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((java.lang.Boolean) entry2.getKey()).booleanValue();
                java.util.List list3 = (java.util.List) entry2.getValue();
                defpackage.ahuj ahujVar = defpackage.ahuj.DEFAULT;
                if (zBooleanValue) {
                    arrayList = new java.util.ArrayList<>();
                    for (java.lang.Object obj4 : list) {
                        if (defpackage.afga.f(((defpackage.agdj) obj4).getName(), ahojVar)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = defpackage.afce.a;
                }
                ahujVar.generateOverridesInFunctionGroup(ahojVar, list3, arrayList, this.containingClass, new defpackage.ahxv(arrayList2, this));
            }
        }
        return defpackage.aipw.compact(arrayList2);
    }

    private final java.util.List<defpackage.agci> getAllDescriptors() {
        return (java.util.List) defpackage.aifh.getValue(this.allDescriptors$delegate, this, $$delegatedProperties[0]);
    }

    protected abstract java.util.List<defpackage.agdj> computeDeclaredFunctions();

    protected final defpackage.agca getContainingClass() {
        return this.containingClass;
    }

    @Override // defpackage.ahyf, defpackage.ahyi
    public java.util.Collection<defpackage.agci> getContributedDescriptors(defpackage.ahxt ahxtVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar) {
        ahxtVar.getClass();
        affcVar.getClass();
        return !ahxtVar.acceptsKinds(defpackage.ahxt.CALLABLES.getKindMask()) ? defpackage.afce.a : getAllDescriptors();
    }

    @Override // defpackage.ahyf, defpackage.ahye, defpackage.ahyi
    public java.util.Collection<defpackage.agev> getContributedFunctions(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        java.util.List<defpackage.agci> allDescriptors = getAllDescriptors();
        if (allDescriptors.isEmpty()) {
            return defpackage.afce.a;
        }
        defpackage.aiqr aiqrVar = new defpackage.aiqr();
        for (java.lang.Object obj : allDescriptors) {
            if ((obj instanceof defpackage.agev) && defpackage.afga.f(((defpackage.agev) obj).getName(), ahojVar)) {
                aiqrVar.add(obj);
            }
        }
        return aiqrVar;
    }

    @Override // defpackage.ahyf, defpackage.ahye
    public java.util.Collection<defpackage.agen> getContributedVariables(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        java.util.List<defpackage.agci> allDescriptors = getAllDescriptors();
        if (allDescriptors.isEmpty()) {
            return defpackage.afce.a;
        }
        defpackage.aiqr aiqrVar = new defpackage.aiqr();
        for (java.lang.Object obj : allDescriptors) {
            if ((obj instanceof defpackage.agen) && defpackage.afga.f(((defpackage.agen) obj).getName(), ahojVar)) {
                aiqrVar.add(obj);
            }
        }
        return aiqrVar;
    }
}
