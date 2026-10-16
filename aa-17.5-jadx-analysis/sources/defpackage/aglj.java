package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class aglj extends agkx implements agkh, agzx {
    private final TypeVariable<?> typeVariable;

    public aglj(TypeVariable<?> typeVariable) {
        typeVariable.getClass();
        this.typeVariable = typeVariable;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aglj) && affa.f(this.typeVariable, ((aglj) obj).typeVariable);
    }

    @Override // defpackage.agkh, defpackage.agzh
    public agkd findAnnotation(ahnf ahnfVar) {
        Annotation[] declaredAnnotations;
        ahnfVar.getClass();
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return agki.findAnnotation(declaredAnnotations, ahnfVar);
    }

    @Override // defpackage.agkh, defpackage.agzh
    public List<agkd> getAnnotations() {
        Annotation[] declaredAnnotations;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) ? afbe.a : agki.getAnnotations(declaredAnnotations);
    }

    @Override // defpackage.agkh
    public AnnotatedElement getElement() {
        TypeVariable<?> typeVariable = this.typeVariable;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // defpackage.agzt
    public ahnj getName() {
        return ahnj.identifier(this.typeVariable.getName());
    }

    @Override // defpackage.agzx
    public List<agkv> getUpperBounds() {
        Type[] bounds = this.typeVariable.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new agkv(type));
        }
        agkv agkvVar = (agkv) woy.bP(arrayList);
        return affa.f(agkvVar != null ? agkvVar.getReflectType() : null, Object.class) ? afbe.a : arrayList;
    }

    public int hashCode() {
        return this.typeVariable.hashCode();
    }

    @Override // defpackage.agzh
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public String toString() {
        return getClass().getName() + ": " + this.typeVariable;
    }

    @Override // defpackage.agzh
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // defpackage.agzh
    public /* bridge */ /* synthetic */ agzf findAnnotation(ahnf ahnfVar) {
        return findAnnotation(ahnfVar);
    }
}
