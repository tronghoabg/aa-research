package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class afum {
    public static final afpa getJavaParameter(aful afulVar) {
        afulVar.getClass();
        Member memberMo61getMember = afulVar.getCallable().getCaller().mo61getMember();
        if (memberMo61getMember instanceof Method) {
            if (Modifier.isStatic(((Method) memberMo61getMember).getModifiers())) {
                return new afpa(memberMo61getMember, afulVar.getIndex());
            }
            Objects.toString(memberMo61getMember);
            throw new IllegalArgumentException("Only static methods are supported for now: ".concat(String.valueOf(memberMo61getMember)));
        }
        if (!(memberMo61getMember instanceof Constructor)) {
            Objects.toString(memberMo61getMember);
            throw new aftw("Unsupported parameter owner: ".concat(String.valueOf(memberMo61getMember)));
        }
        Constructor constructor = (Constructor) memberMo61getMember;
        Class declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        return new afpa(memberMo61getMember, afulVar.getIndex() + ((affa.l(declaringClass).isInner() && isJdk8()) ? -1 : constructor.getDeclaringClass().isEnum() ? (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2 : 0));
    }

    private static final boolean isJdk8() {
        String property = System.getProperty("java.version");
        return property != null && afyh.g(property, "1.", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Annotation> loadAnnotationsOnAnnotationParameter(aful afulVar) {
        if (!(afulVar instanceof afsw)) {
            return afbe.a;
        }
        afsw afswVar = (afsw) afulVar;
        List<agms> annotations = afswVar.getKmParameter$kotlin_reflection().getAnnotations();
        ArrayList arrayList = new ArrayList(woy.bp(annotations, 10));
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(afjz.toAnnotation((agms) it.next(), agkc.getSafeClassLoader(afswVar.getCallable().getContainer().getJClass())));
        }
        return arrayList;
    }
}
