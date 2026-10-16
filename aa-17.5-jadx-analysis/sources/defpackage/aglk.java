package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes3.dex */
public final class aglk extends agkx implements agzh {
    private final boolean isVararg;
    private final Annotation[] reflectAnnotations;
    private final String reflectName;
    private final agli type;

    public aglk(agli agliVar, Annotation[] annotationArr, String str, boolean z) {
        agliVar.getClass();
        annotationArr.getClass();
        this.type = agliVar;
        this.reflectAnnotations = annotationArr;
        this.reflectName = str;
        this.isVararg = z;
    }

    @Override // defpackage.agzh
    public agkd findAnnotation(ahnf ahnfVar) {
        ahnfVar.getClass();
        return agki.findAnnotation(this.reflectAnnotations, ahnfVar);
    }

    @Override // defpackage.agzh
    public List<agkd> getAnnotations() {
        return agki.getAnnotations(this.reflectAnnotations);
    }

    public ahnj getName() {
        String str = this.reflectName;
        if (str != null) {
            return ahnj.guessByFirstCharacter(str);
        }
        return null;
    }

    @Override // defpackage.agzh
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public boolean isVararg() {
        return this.isVararg;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(true != isVararg() ? "" : "vararg ");
        sb.append(getName());
        sb.append(": ");
        sb.append(m80getType());
        return sb.toString();
    }

    /* renamed from: getType, reason: merged with bridge method [inline-methods] */
    public agli m80getType() {
        return this.type;
    }
}
