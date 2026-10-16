package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ageb {
    private final defpackage.aifa<defpackage.agdz, defpackage.agca> classes;
    private final defpackage.agdu module;
    private final defpackage.aifa<defpackage.ahof, defpackage.agec> packageFragments;
    private final defpackage.aifi storageManager;

    public ageb(defpackage.aifi aifiVar, defpackage.agdu agduVar) {
        aifiVar.getClass();
        agduVar.getClass();
        this.storageManager = aifiVar;
        this.module = agduVar;
        this.packageFragments = aifiVar.createMemoizedFunction(new defpackage.agdx(this));
        this.classes = aifiVar.createMemoizedFunction(new defpackage.agdy(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.agca classes$lambda$0(defpackage.ageb agebVar, defpackage.agdz agdzVar) {
        defpackage.agec agecVarInvoke;
        agdzVar.getClass();
        defpackage.ahod ahodVarComponent1 = agdzVar.component1();
        java.util.List<java.lang.Integer> listComponent2 = agdzVar.component2();
        if (ahodVarComponent1.isLocal()) {
            java.util.Objects.toString(ahodVarComponent1);
            throw new java.lang.UnsupportedOperationException("Unresolved local class: ".concat(java.lang.String.valueOf(ahodVarComponent1)));
        }
        defpackage.ahod outerClassId = ahodVarComponent1.getOuterClassId();
        if (outerClassId == null || (agecVarInvoke = agebVar.getClass(outerClassId, defpackage.afga.aL(listComponent2, 1))) == null) {
            agecVarInvoke = agebVar.packageFragments.invoke(ahodVarComponent1.getPackageFqName());
        }
        defpackage.agci agciVar = agecVarInvoke;
        boolean zIsNestedClass = ahodVarComponent1.isNestedClass();
        defpackage.aifi aifiVar = agebVar.storageManager;
        defpackage.ahoj shortClassName = ahodVarComponent1.getShortClassName();
        java.lang.Integer num = (java.lang.Integer) defpackage.afga.aB(listComponent2);
        return new defpackage.agea(aifiVar, agciVar, shortClassName, zIsNestedClass, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.agec packageFragments$lambda$0(defpackage.ageb agebVar, defpackage.ahof ahofVar) {
        ahofVar.getClass();
        return new defpackage.agib(agebVar.module, ahofVar);
    }

    public final defpackage.agca getClass(defpackage.ahod ahodVar, java.util.List<java.lang.Integer> list) {
        ahodVar.getClass();
        list.getClass();
        return this.classes.invoke(new defpackage.agdz(ahodVar, list));
    }
}
