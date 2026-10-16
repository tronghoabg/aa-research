package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class agga implements defpackage.agfz {
    private final defpackage.aggk annotations;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 1 ? 3 : 2];
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
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 1) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public agga(defpackage.aggk aggkVar) {
        if (aggkVar == null) {
            $$$reportNull$$$0(0);
        }
        this.annotations = aggkVar;
    }

    @Override // defpackage.agfz
    public defpackage.aggk getAnnotations() {
        defpackage.aggk aggkVar = this.annotations;
        if (aggkVar == null) {
            $$$reportNull$$$0(1);
        }
        return aggkVar;
    }
}
