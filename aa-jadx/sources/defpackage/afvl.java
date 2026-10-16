package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afvl implements defpackage.afir {
    private final defpackage.afar annotations$delegate = defpackage.afga.cB(2, new defpackage.afvk(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List annotations_delegate$lambda$0(defpackage.afvl afvlVar) {
        java.util.List listBZ;
        if (defpackage.afvh.isAnnotationConstructor(afvlVar.getCallable())) {
            return defpackage.afvm.loadAnnotationsOnAnnotationParameter(afvlVar);
        }
        defpackage.afqa javaParameter = defpackage.afvm.getJavaParameter(afvlVar);
        java.lang.reflect.Member callable = javaParameter.getCallable();
        if (callable instanceof java.lang.reflect.Method) {
            java.lang.annotation.Annotation[] annotationArr = ((java.lang.reflect.Method) callable).getParameterAnnotations()[javaParameter.getIndex()];
            annotationArr.getClass();
            listBZ = defpackage.afga.bZ(annotationArr);
        } else if (callable instanceof java.lang.reflect.Constructor) {
            java.lang.annotation.Annotation[] annotationArr2 = ((java.lang.reflect.Constructor) callable).getParameterAnnotations()[javaParameter.getIndex()];
            annotationArr2.getClass();
            listBZ = defpackage.afga.bZ(annotationArr2);
        } else {
            listBZ = defpackage.afce.a;
        }
        return defpackage.afwu.unwrapKotlinRepeatableAnnotations(listBZ);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.afvl)) {
            return false;
        }
        defpackage.afvl afvlVar = (defpackage.afvl) obj;
        return defpackage.afga.f(getCallable(), afvlVar.getCallable()) && getIndex() == afvlVar.getIndex();
    }

    @Override // defpackage.afic
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return (java.util.List) this.annotations$delegate.a();
    }

    public abstract defpackage.afve<?> getCallable();

    public abstract boolean getDeclaresDefaultValue();

    public final int hashCode() {
        return (getCallable().hashCode() * 31) + getIndex();
    }

    public final java.lang.String toString() {
        return defpackage.afwf.INSTANCE.renderParameter(this);
    }
}
