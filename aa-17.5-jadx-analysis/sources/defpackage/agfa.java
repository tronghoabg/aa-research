package defpackage;

/* loaded from: classes3.dex */
public class agfa implements agez {
    private final agfk annotations;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public agfa(agfk agfkVar) {
        if (agfkVar == null) {
            $$$reportNull$$$0(0);
        }
        this.annotations = agfkVar;
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        agfk agfkVar = this.annotations;
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        return agfkVar;
    }
}
