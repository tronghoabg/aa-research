package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agld extends defpackage.aglx implements defpackage.ahaf {
    private final java.lang.annotation.Annotation annotation;

    public agld(java.lang.annotation.Annotation annotation) {
        annotation.getClass();
        this.annotation = annotation;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.agld) && this.annotation == ((defpackage.agld) obj).annotation;
    }

    public final java.lang.annotation.Annotation getAnnotation() {
        return this.annotation;
    }

    @Override // defpackage.ahaf
    public java.util.Collection<defpackage.ahag> getArguments() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method[] declaredMethods = defpackage.afga.h(defpackage.afga.k(this.annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(declaredMethods.length);
        for (java.lang.reflect.Method method : declaredMethods) {
            java.lang.annotation.Annotation annotation = this.annotation;
            defpackage.agle agleVar = defpackage.aglf.Factory;
            java.lang.Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            arrayList.add(agleVar.create(objInvoke, defpackage.ahoj.identifier(method.getName())));
        }
        return arrayList;
    }

    @Override // defpackage.ahaf
    public defpackage.ahod getClassId() {
        return defpackage.aglc.getClassId(defpackage.afga.h(defpackage.afga.k(this.annotation)));
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this.annotation);
    }

    @Override // defpackage.ahaf
    public boolean isFreshlySupportedTypeUseAnnotation() {
        return false;
    }

    @Override // defpackage.ahaf
    public boolean isIdeExternalAnnotation() {
        return false;
    }

    @Override // defpackage.ahaf
    public defpackage.aglt resolve() {
        return new defpackage.aglt(defpackage.afga.h(defpackage.afga.k(this.annotation)));
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + this.annotation;
    }
}
