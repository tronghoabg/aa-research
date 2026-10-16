package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class aful implements afhr {
    private final aezr annotations$delegate = woy.dH(2, new afuk(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final List annotations_delegate$lambda$0(aful afulVar) {
        List listDf;
        if (afuh.isAnnotationConstructor(afulVar.getCallable())) {
            return afum.loadAnnotationsOnAnnotationParameter(afulVar);
        }
        afpa javaParameter = afum.getJavaParameter(afulVar);
        Member callable = javaParameter.getCallable();
        if (callable instanceof Method) {
            Annotation[] annotationArr = ((Method) callable).getParameterAnnotations()[javaParameter.getIndex()];
            annotationArr.getClass();
            listDf = woy.df(annotationArr);
        } else if (callable instanceof Constructor) {
            Annotation[] annotationArr2 = ((Constructor) callable).getParameterAnnotations()[javaParameter.getIndex()];
            annotationArr2.getClass();
            listDf = woy.df(annotationArr2);
        } else {
            listDf = afbe.a;
        }
        return afvu.unwrapKotlinRepeatableAnnotations(listDf);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aful)) {
            return false;
        }
        aful afulVar = (aful) obj;
        return affa.f(getCallable(), afulVar.getCallable()) && getIndex() == afulVar.getIndex();
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return (List) this.annotations$delegate.a();
    }

    public abstract afue<?> getCallable();

    public abstract boolean getDeclaresDefaultValue();

    public final int hashCode() {
        return (getCallable().hashCode() * 31) + getIndex();
    }

    public final String toString() {
        return afvf.INSTANCE.renderParameter(this);
    }
}
