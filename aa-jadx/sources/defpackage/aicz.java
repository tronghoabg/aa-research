package defpackage;

/* JADX INFO: loaded from: classes3.dex */
interface aicz {
    void addFunctionsAndPropertiesTo(java.util.Collection<defpackage.agci> collection, defpackage.ahxt ahxtVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar, defpackage.agmo agmoVar);

    java.util.Collection<defpackage.agev> getContributedFunctions(defpackage.ahoj ahojVar, defpackage.agmo agmoVar);

    java.util.Collection<defpackage.agen> getContributedVariables(defpackage.ahoj ahojVar, defpackage.agmo agmoVar);

    java.util.Set<defpackage.ahoj> getFunctionNames();

    defpackage.agfd getTypeAliasByName(defpackage.ahoj ahojVar);

    java.util.Set<defpackage.ahoj> getTypeAliasNames();

    java.util.Set<defpackage.ahoj> getVariableNames();
}
