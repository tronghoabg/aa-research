package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class aglb extends agkx implements agkh, agld, agzq {
    public boolean equals(Object obj) {
        return (obj instanceof aglb) && affa.f(getMember(), ((aglb) obj).getMember());
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

    @Override // defpackage.agzq
    public agkt getContainingClass() {
        Class<?> declaringClass = getMember().getDeclaringClass();
        declaringClass.getClass();
        return new agkt(declaringClass);
    }

    @Override // defpackage.agkh
    public AnnotatedElement getElement() {
        Member member = getMember();
        member.getClass();
        return (AnnotatedElement) member;
    }

    public abstract Member getMember();

    @Override // defpackage.agld
    public int getModifiers() {
        return getMember().getModifiers();
    }

    @Override // defpackage.agzt
    public ahnj getName() {
        String name = getMember().getName();
        return name != null ? ahnj.identifier(name) : ahnm.NO_NAME_PROVIDED;
    }

    protected final List<aglk> getValueParameters(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        String str;
        typeArr.getClass();
        annotationArr.getClass();
        int length = typeArr.length;
        ArrayList arrayList = new ArrayList(length);
        List<String> listLoadParameterNames = agjz.INSTANCE.loadParameterNames(getMember());
        int size = listLoadParameterNames != null ? listLoadParameterNames.size() - length : 0;
        int i = 0;
        while (i < length) {
            agli agliVarCreate = agli.Factory.create(typeArr[i]);
            if (listLoadParameterNames != null) {
                str = (String) woy.bI(listLoadParameterNames, i + size);
                if (str == null) {
                    throw new IllegalStateException("No parameter with index " + i + '+' + size + " (name=" + getName() + " type=" + agliVarCreate + ") in " + this);
                }
            } else {
                str = null;
            }
            arrayList.add(new aglk(agliVarCreate, annotationArr[i], str, z && i == woy.cN(typeArr)));
            i++;
        }
        return arrayList;
    }

    @Override // defpackage.agzs
    public agey getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? agev.INSTANCE : Modifier.isPrivate(modifiers) ? ages.INSTANCE : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? agjd.INSTANCE : agjc.INSTANCE : agjb.INSTANCE;
    }

    public int hashCode() {
        return getMember().hashCode();
    }

    @Override // defpackage.agzs
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // defpackage.agzh
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // defpackage.agzs
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // defpackage.agzs
    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public String toString() {
        return getClass().getName() + ": " + getMember();
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
