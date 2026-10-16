package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class agki {
    public static final agkd findAnnotation(Annotation[] annotationArr, ahnf ahnfVar) {
        Annotation annotation;
        annotationArr.getClass();
        ahnfVar.getClass();
        int i = 0;
        while (true) {
            if (i >= annotationArr.length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (affa.f(agkc.getClassId(affa.h(affa.k(annotation))).asSingleFqName(), ahnfVar)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new agkd(annotation);
        }
        return null;
    }

    public static final List<agkd> getAnnotations(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new agkd(annotation));
        }
        return arrayList;
    }
}
