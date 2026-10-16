package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface agdu extends defpackage.agci {
    defpackage.afze getBuiltIns();

    <T> T getCapability(defpackage.agds<T> agdsVar);

    java.util.List<defpackage.agdu> getExpectedByModules();

    defpackage.agej getPackage(defpackage.ahof ahofVar);

    java.util.Collection<defpackage.ahof> getSubPackagesOf(defpackage.ahof ahofVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar);

    boolean shouldSeeInternalsOf(defpackage.agdu agduVar);
}
