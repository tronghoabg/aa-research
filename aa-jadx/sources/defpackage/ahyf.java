package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ahyf implements defpackage.ahye {
    @Override // defpackage.ahye
    public java.util.Set<defpackage.ahoj> getClassifierNames() {
        return null;
    }

    @Override // defpackage.ahyi
    public defpackage.agcd getContributedClassifier(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        return null;
    }

    @Override // defpackage.ahyi
    public java.util.Collection<defpackage.agci> getContributedDescriptors(defpackage.ahxt ahxtVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar) {
        ahxtVar.getClass();
        affcVar.getClass();
        return defpackage.afce.a;
    }

    @Override // defpackage.ahye, defpackage.ahyi
    public java.util.Collection<? extends defpackage.agev> getContributedFunctions(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        return defpackage.afce.a;
    }

    @Override // defpackage.ahye
    public java.util.Collection<? extends defpackage.agen> getContributedVariables(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        return defpackage.afce.a;
    }

    @Override // defpackage.ahye
    public java.util.Set<defpackage.ahoj> getFunctionNames() {
        java.util.Collection<defpackage.agci> contributedDescriptors = getContributedDescriptors(defpackage.ahxt.FUNCTIONS, defpackage.aiql.alwaysTrue());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : contributedDescriptors) {
            if (obj instanceof defpackage.agev) {
                defpackage.ahoj name = ((defpackage.agev) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.ahye
    public java.util.Set<defpackage.ahoj> getVariableNames() {
        java.util.Collection<defpackage.agci> contributedDescriptors = getContributedDescriptors(defpackage.ahxt.VARIABLES, defpackage.aiql.alwaysTrue());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : contributedDescriptors) {
            if (obj instanceof defpackage.agev) {
                defpackage.ahoj name = ((defpackage.agev) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.ahyi
    /* JADX INFO: renamed from: recordLookup */
    public /* bridge */ void mo95recordLookup(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        defpackage.ahyc.recordLookup(this, ahojVar, agmoVar);
    }
}
