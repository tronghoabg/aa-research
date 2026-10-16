package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class agli implements agzw {
    public static final aglh Factory = new aglh(null);

    public boolean equals(Object obj) {
        return (obj instanceof agli) && affa.f(getReflectType(), ((agli) obj).getReflectType());
    }

    @Override // defpackage.agzh
    public agzf findAnnotation(ahnf ahnfVar) {
        Object obj;
        ahnfVar.getClass();
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ahnd classId = ((agzf) next).getClassId();
            if (affa.f(classId != null ? classId.asSingleFqName() : null, ahnfVar)) {
                obj = next;
                break;
            }
        }
        return (agzf) obj;
    }

    protected abstract Type getReflectType();

    public int hashCode() {
        return getReflectType().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + getReflectType();
    }
}
