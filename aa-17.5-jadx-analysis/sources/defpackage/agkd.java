package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class agkd extends agkx implements agzf {
    private final Annotation annotation;

    public agkd(Annotation annotation) {
        annotation.getClass();
        this.annotation = annotation;
    }

    public boolean equals(Object obj) {
        return (obj instanceof agkd) && this.annotation == ((agkd) obj).annotation;
    }

    public final Annotation getAnnotation() {
        return this.annotation;
    }

    @Override // defpackage.agzf
    public Collection<agzg> getArguments() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = affa.h(affa.k(this.annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Annotation annotation = this.annotation;
            agke agkeVar = agkf.Factory;
            Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            arrayList.add(agkeVar.create(objInvoke, ahnj.identifier(method.getName())));
        }
        return arrayList;
    }

    @Override // defpackage.agzf
    public ahnd getClassId() {
        return agkc.getClassId(affa.h(affa.k(this.annotation)));
    }

    public int hashCode() {
        return System.identityHashCode(this.annotation);
    }

    @Override // defpackage.agzf
    public boolean isFreshlySupportedTypeUseAnnotation() {
        return false;
    }

    @Override // defpackage.agzf
    public boolean isIdeExternalAnnotation() {
        return false;
    }

    @Override // defpackage.agzf
    public agkt resolve() {
        return new agkt(affa.h(affa.k(this.annotation)));
    }

    public String toString() {
        return getClass().getName() + ": " + this.annotation;
    }
}
