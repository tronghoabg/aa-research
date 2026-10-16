package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agdm {
    private static final defpackage.agds<defpackage.agdn> INVALID_MODULE_NOTIFIER_CAPABILITY = new defpackage.agds<>("InvalidModuleNotifier");

    public static final void moduleInvalidated(defpackage.agdu agduVar) {
        agduVar.getClass();
        defpackage.agdn agdnVar = (defpackage.agdn) agduVar.getCapability(INVALID_MODULE_NOTIFIER_CAPABILITY);
        if (agdnVar != null) {
            agdnVar.notifyModuleInvalidated(agduVar);
        } else {
            java.util.Objects.toString(agduVar);
            throw new defpackage.agdl("Accessing invalid module descriptor ".concat(agduVar.toString()));
        }
    }
}
