package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface ahye extends defpackage.ahyi {
    public static final defpackage.ahyb Companion = defpackage.ahyb.$$INSTANCE;

    java.util.Set<defpackage.ahoj> getClassifierNames();

    @Override // defpackage.ahyi
    java.util.Collection<? extends defpackage.agev> getContributedFunctions(defpackage.ahoj ahojVar, defpackage.agmo agmoVar);

    java.util.Collection<? extends defpackage.agen> getContributedVariables(defpackage.ahoj ahojVar, defpackage.agmo agmoVar);

    java.util.Set<defpackage.ahoj> getFunctionNames();

    java.util.Set<defpackage.ahoj> getVariableNames();
}
