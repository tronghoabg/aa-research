package defpackage;

import java.util.Collections;

/* loaded from: classes3.dex */
final class ahsr extends aggu {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "containingClass";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahsr(agba agbaVar, agdx agdxVar, boolean z) {
        super(agbaVar, null, agfk.Companion.getEMPTY(), true, agaw.DECLARATION, agdxVar);
        if (agbaVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(1);
        }
        initialize(Collections.EMPTY_LIST, ahst.getDefaultConstructorVisibility(agbaVar, z));
    }
}
