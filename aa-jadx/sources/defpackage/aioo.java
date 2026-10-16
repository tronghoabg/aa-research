package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aioo {
    private final defpackage.affc<defpackage.agdj, java.lang.String> additionalCheck;
    private final defpackage.aiog[] checks;
    private final defpackage.ahoj name;
    private final java.util.Collection<defpackage.ahoj> nameList;
    private final defpackage.aito regex;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aioo(defpackage.ahoj ahojVar, defpackage.aiog[] aiogVarArr, defpackage.affc<? super defpackage.agdj, java.lang.String> affcVar) {
        this(ahojVar, (defpackage.aito) null, (java.util.Collection<defpackage.ahoj>) null, affcVar, (defpackage.aiog[]) java.util.Arrays.copyOf(aiogVarArr, aiogVarArr.length));
        ahojVar.getClass();
        aiogVarArr.getClass();
        affcVar.getClass();
    }

    public final defpackage.aiok checkAll(defpackage.agdj agdjVar) {
        agdjVar.getClass();
        for (defpackage.aiog aiogVar : this.checks) {
            java.lang.String strInvoke = aiogVar.invoke(agdjVar);
            if (strInvoke != null) {
                return new defpackage.aioi(strInvoke);
            }
        }
        java.lang.String strInvoke2 = this.additionalCheck.invoke(agdjVar);
        return strInvoke2 != null ? new defpackage.aioi(strInvoke2) : defpackage.aioj.INSTANCE;
    }

    public final boolean isApplicable(defpackage.agdj agdjVar) {
        agdjVar.getClass();
        if (this.name != null && !defpackage.afga.f(agdjVar.getName(), this.name)) {
            return false;
        }
        if (this.regex != null) {
            java.lang.String strAsString = agdjVar.getName().asString();
            strAsString.getClass();
            if (!this.regex.f(strAsString)) {
                return false;
            }
        }
        java.util.Collection<defpackage.ahoj> collection = this.nameList;
        return collection == null || collection.contains(agdjVar.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private aioo(defpackage.ahoj ahojVar, defpackage.aito aitoVar, java.util.Collection<defpackage.ahoj> collection, defpackage.affc<? super defpackage.agdj, java.lang.String> affcVar, defpackage.aiog... aiogVarArr) {
        this.name = ahojVar;
        this.regex = aitoVar;
        this.nameList = collection;
        this.additionalCheck = affcVar;
        this.checks = aiogVarArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aioo(java.util.Collection<defpackage.ahoj> collection, defpackage.aiog[] aiogVarArr, defpackage.affc<? super defpackage.agdj, java.lang.String> affcVar) {
        this((defpackage.ahoj) null, (defpackage.aito) null, collection, affcVar, (defpackage.aiog[]) java.util.Arrays.copyOf(aiogVarArr, aiogVarArr.length));
        collection.getClass();
        aiogVarArr.getClass();
        affcVar.getClass();
    }

    public /* synthetic */ aioo(defpackage.ahoj ahojVar, defpackage.aiog[] aiogVarArr, defpackage.affc affcVar, int i, defpackage.affu affuVar) {
        this(ahojVar, aiogVarArr, (defpackage.affc<? super defpackage.agdj, java.lang.String>) ((i & 4) != 0 ? defpackage.aiol.INSTANCE : affcVar));
    }

    public /* synthetic */ aioo(java.util.Collection collection, defpackage.aiog[] aiogVarArr, defpackage.affc affcVar, int i, defpackage.affu affuVar) {
        this((java.util.Collection<defpackage.ahoj>) collection, aiogVarArr, (defpackage.affc<? super defpackage.agdj, java.lang.String>) ((i & 4) != 0 ? defpackage.aion.INSTANCE : affcVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aioo(defpackage.aito aitoVar, defpackage.aiog[] aiogVarArr, defpackage.affc<? super defpackage.agdj, java.lang.String> affcVar) {
        this((defpackage.ahoj) null, aitoVar, (java.util.Collection<defpackage.ahoj>) null, affcVar, (defpackage.aiog[]) java.util.Arrays.copyOf(aiogVarArr, aiogVarArr.length));
        aitoVar.getClass();
        aiogVarArr.getClass();
        affcVar.getClass();
    }

    public /* synthetic */ aioo(defpackage.aito aitoVar, defpackage.aiog[] aiogVarArr, defpackage.affc affcVar, int i, defpackage.affu affuVar) {
        this(aitoVar, aiogVarArr, (defpackage.affc<? super defpackage.agdj, java.lang.String>) ((i & 4) != 0 ? defpackage.aiom.INSTANCE : affcVar));
    }
}
