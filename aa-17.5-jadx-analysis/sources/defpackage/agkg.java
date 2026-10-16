package defpackage;

import java.lang.annotation.Annotation;

/* loaded from: classes3.dex */
public final class agkg extends agkf implements agzg {
    private final Annotation annotation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agkg(ahnj ahnjVar, Annotation annotation) {
        super(ahnjVar, null);
        annotation.getClass();
        this.annotation = annotation;
    }

    public agzf getAnnotation() {
        return new agkd(this.annotation);
    }
}
