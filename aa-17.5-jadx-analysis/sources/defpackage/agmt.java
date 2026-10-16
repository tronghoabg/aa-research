package defpackage;

/* loaded from: classes3.dex */
public final class agmt extends agnp {
    private final agms annotation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agmt(agms agmsVar) {
        super(null);
        agmsVar.getClass();
        this.annotation = agmsVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agmt) && affa.f(this.annotation, ((agmt) obj).annotation);
    }

    public final agms getAnnotation() {
        return this.annotation;
    }

    public int hashCode() {
        return this.annotation.hashCode();
    }

    @Override // defpackage.agnp
    public String toString() {
        return "AnnotationValue(" + this.annotation + ')';
    }
}
