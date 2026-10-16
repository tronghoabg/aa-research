package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agmk extends defpackage.aglx implements defpackage.ahah {
    private final boolean isVararg;
    private final java.lang.annotation.Annotation[] reflectAnnotations;
    private final java.lang.String reflectName;
    private final defpackage.agmi type;

    public agmk(defpackage.agmi agmiVar, java.lang.annotation.Annotation[] annotationArr, java.lang.String str, boolean z) {
        agmiVar.getClass();
        annotationArr.getClass();
        this.type = agmiVar;
        this.reflectAnnotations = annotationArr;
        this.reflectName = str;
        this.isVararg = z;
    }

    @Override // defpackage.ahah
    public defpackage.agld findAnnotation(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        return defpackage.agli.findAnnotation(this.reflectAnnotations, ahofVar);
    }

    @Override // defpackage.ahah
    public java.util.List<defpackage.agld> getAnnotations() {
        return defpackage.agli.getAnnotations(this.reflectAnnotations);
    }

    public defpackage.ahoj getName() {
        java.lang.String str = this.reflectName;
        if (str != null) {
            return defpackage.ahoj.guessByFirstCharacter(str);
        }
        return null;
    }

    @Override // defpackage.ahah
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public boolean isVararg() {
        return this.isVararg;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(true != isVararg() ? "" : "vararg ");
        sb.append(getName());
        sb.append(": ");
        sb.append(m80getType());
        return sb.toString();
    }

    /* JADX INFO: renamed from: getType, reason: merged with bridge method [inline-methods] */
    public defpackage.agmi m80getType() {
        return this.type;
    }
}
