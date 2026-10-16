package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class ahzg implements ahzh {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.ahzh
    public void reportCannotInferVisibility(agax agaxVar) {
        if (agaxVar == null) {
            $$$reportNull$$$0(2);
        }
    }

    @Override // defpackage.ahzh
    public void reportIncompleteHierarchy(agba agbaVar, List<String> list) {
        if (agbaVar == null) {
            $$$reportNull$$$0(0);
        }
        if (list == null) {
            $$$reportNull$$$0(1);
        }
    }
}
