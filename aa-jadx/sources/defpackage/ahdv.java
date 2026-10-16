package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahdv {
    private final java.lang.String errorsSinceLanguageVersion;
    private final java.lang.String functionName;
    private final java.util.List<defpackage.afau<java.lang.String, defpackage.aheb>> parameters;
    private defpackage.afau<java.lang.String, defpackage.aheb> returnType;
    private defpackage.ahuq returnValueStatus;
    final /* synthetic */ defpackage.ahdw this$0;

    public ahdv(defpackage.ahdw ahdwVar, java.lang.String str, java.lang.String str2) {
        str.getClass();
        this.this$0 = ahdwVar;
        this.functionName = str;
        this.errorsSinceLanguageVersion = str2;
        this.parameters = new java.util.ArrayList();
        this.returnType = new defpackage.afau<>("V", null);
    }

    public final defpackage.afau<java.lang.String, defpackage.ahdo> build() {
        java.util.List<defpackage.afau<java.lang.String, defpackage.aheb>> list = this.parameters;
        defpackage.ahgt ahgtVar = defpackage.ahgt.INSTANCE;
        java.lang.String className = this.this$0.getClassName();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((defpackage.afau) it.next()).a);
        }
        java.lang.String strSignature = ahgtVar.signature(className, ahgtVar.jvmDescriptor(this.functionName, arrayList, (java.lang.String) this.returnType.a));
        defpackage.aheb ahebVar = (defpackage.aheb) this.returnType.b;
        java.util.List<defpackage.afau<java.lang.String, defpackage.aheb>> list2 = this.parameters;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(list2, 10));
        java.util.Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add((defpackage.aheb) ((defpackage.afau) it2.next()).b);
        }
        return new defpackage.afau<>(strSignature, new defpackage.ahdo(ahebVar, arrayList2, this.errorsSinceLanguageVersion, this.returnValueStatus));
    }

    public final void mustUseReturnValue() {
        this.returnValueStatus = defpackage.ahuq.MustUse;
    }

    public final void parameter(java.lang.String str, defpackage.ahbr... ahbrVarArr) {
        defpackage.aheb ahebVar;
        str.getClass();
        ahbrVarArr.getClass();
        if (ahbrVarArr.length == 0) {
            ahebVar = null;
        } else {
            java.lang.Iterable<defpackage.afch> iterableBN = defpackage.afga.bN(ahbrVarArr);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.afqt.e(defpackage.afga.P(defpackage.afga.aj(iterableBN, 10)), 16));
            for (defpackage.afch afchVar : iterableBN) {
                linkedHashMap.put(java.lang.Integer.valueOf(afchVar.a), (defpackage.ahbr) afchVar.b);
            }
            ahebVar = new defpackage.aheb(linkedHashMap);
        }
        this.parameters.add(new defpackage.afau<>(str, ahebVar));
    }

    public final void returns(java.lang.String str, defpackage.ahbr... ahbrVarArr) {
        str.getClass();
        ahbrVarArr.getClass();
        java.lang.Iterable<defpackage.afch> iterableBN = defpackage.afga.bN(ahbrVarArr);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.afqt.e(defpackage.afga.P(defpackage.afga.aj(iterableBN, 10)), 16));
        for (defpackage.afch afchVar : iterableBN) {
            linkedHashMap.put(java.lang.Integer.valueOf(afchVar.a), (defpackage.ahbr) afchVar.b);
        }
        this.returnType = new defpackage.afau<>(str, new defpackage.aheb(linkedHashMap));
    }

    public final void returns(defpackage.ahxe ahxeVar) {
        ahxeVar.getClass();
        this.returnType = new defpackage.afau<>(ahxeVar.getDesc(), null);
    }
}
