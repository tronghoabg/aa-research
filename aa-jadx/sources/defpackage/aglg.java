package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aglg extends defpackage.aglf implements defpackage.ahag {
    private final java.lang.annotation.Annotation annotation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aglg(defpackage.ahoj ahojVar, java.lang.annotation.Annotation annotation) {
        super(ahojVar, null);
        annotation.getClass();
        this.annotation = annotation;
    }

    public defpackage.ahaf getAnnotation() {
        return new defpackage.agld(this.annotation);
    }
}
