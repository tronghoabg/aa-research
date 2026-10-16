package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahyt extends defpackage.ahxj {
    public static final defpackage.ahys Companion = new defpackage.ahys(null);
    private final java.lang.String debugName;
    private final defpackage.ahye workerScope;

    private ahyt(java.lang.String str, defpackage.ahye ahyeVar) {
        this.debugName = str;
        this.workerScope = ahyeVar;
    }

    static /* synthetic */ defpackage.agbv accessor$TypeIntersectionScope$lambda0(defpackage.agev agevVar) {
        getContributedFunctions$lambda$0(agevVar);
        return agevVar;
    }

    static /* synthetic */ defpackage.agbv accessor$TypeIntersectionScope$lambda1(defpackage.agen agenVar) {
        getContributedVariables$lambda$0(agenVar);
        return agenVar;
    }

    static /* synthetic */ defpackage.agbv accessor$TypeIntersectionScope$lambda2(defpackage.agbv agbvVar) {
        getContributedDescriptors$lambda$1(agbvVar);
        return agbvVar;
    }

    public static final defpackage.ahye create(java.lang.String str, java.util.Collection<? extends defpackage.aihl> collection) {
        return Companion.create(str, collection);
    }

    private static final defpackage.agbv getContributedDescriptors$lambda$1(defpackage.agbv agbvVar) {
        agbvVar.getClass();
        return agbvVar;
    }

    private static final defpackage.agbv getContributedFunctions$lambda$0(defpackage.agev agevVar) {
        agevVar.getClass();
        return agevVar;
    }

    private static final defpackage.agbv getContributedVariables$lambda$0(defpackage.agen agenVar) {
        agenVar.getClass();
        return agenVar;
    }

    @Override // defpackage.ahxj, defpackage.ahyi
    public java.util.Collection<defpackage.agci> getContributedDescriptors(defpackage.ahxt ahxtVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar) {
        ahxtVar.getClass();
        affcVar.getClass();
        java.util.Collection<defpackage.agci> contributedDescriptors = super.getContributedDescriptors(ahxtVar, affcVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : contributedDescriptors) {
            if (((defpackage.agci) obj) instanceof defpackage.agbv) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        defpackage.afau afauVar = new defpackage.afau(arrayList, arrayList2);
        java.util.List list = (java.util.List) afauVar.a;
        java.util.List list2 = (java.util.List) afauVar.b;
        list.getClass();
        return defpackage.afga.aS(defpackage.ahum.selectMostSpecificInEachOverridableGroup(list, defpackage.ahyr.INSTANCE), list2);
    }

    @Override // defpackage.ahxj, defpackage.ahye, defpackage.ahyi
    public java.util.Collection<defpackage.agev> getContributedFunctions(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        return defpackage.ahum.selectMostSpecificInEachOverridableGroup(super.getContributedFunctions(ahojVar, agmoVar), defpackage.ahyp.INSTANCE);
    }

    @Override // defpackage.ahxj, defpackage.ahye
    public java.util.Collection<defpackage.agen> getContributedVariables(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        return defpackage.ahum.selectMostSpecificInEachOverridableGroup(super.getContributedVariables(ahojVar, agmoVar), defpackage.ahyq.INSTANCE);
    }

    @Override // defpackage.ahxj
    protected defpackage.ahye getWorkerScope() {
        return this.workerScope;
    }

    public /* synthetic */ ahyt(java.lang.String str, defpackage.ahye ahyeVar, defpackage.affu affuVar) {
        this(str, ahyeVar);
    }
}
