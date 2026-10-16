package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class agcm {
    private static final agcs<agcn> INVALID_MODULE_NOTIFIER_CAPABILITY = new agcs<>("InvalidModuleNotifier");

    public static final void moduleInvalidated(agcu agcuVar) {
        agcuVar.getClass();
        agcn agcnVar = (agcn) agcuVar.getCapability(INVALID_MODULE_NOTIFIER_CAPABILITY);
        if (agcnVar != null) {
            agcnVar.notifyModuleInvalidated(agcuVar);
        } else {
            Objects.toString(agcuVar);
            throw new agcl("Accessing invalid module descriptor ".concat(agcuVar.toString()));
        }
    }
}
