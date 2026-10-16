package kotlin.reflect.full;

import Fe.b;
import ff.m;
import ff.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClass;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b\u001a*\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\bH\u0007\u001a\u0019\u0010\t\u001a\u00020\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¨\u0006\u000b"}, d2 = {"findAnnotation", "T", "", "Lkotlin/reflect/KAnnotatedElement;", "(Lkotlin/reflect/KAnnotatedElement;)Ljava/lang/annotation/Annotation;", "findAnnotations", "", "klass", "Lkotlin/reflect/KClass;", "hasAnnotation", "", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KAnnotatedElements {
    public static final <T extends Annotation> T findAnnotation(KAnnotatedElement kAnnotatedElement) {
        AbstractC3340k.e(kAnnotatedElement, "<this>");
        Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        if (!it.hasNext()) {
            AbstractC3340k.l();
            throw null;
        }
        AbstractC3340k.l();
        throw null;
    }

    @NotNull
    public static final <T extends Annotation> List<T> findAnnotations(@NotNull KAnnotatedElement kAnnotatedElement, @NotNull KClass<T> klass) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object next;
        AbstractC3340k.e(kAnnotatedElement, "<this>");
        AbstractC3340k.e(klass, "klass");
        List<Annotation> annotations = kAnnotatedElement.getAnnotations();
        Class clsY = b.y(klass);
        AbstractC3340k.e(annotations, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : annotations) {
            if (clsY.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        Class<? extends Annotation> clsLoadRepeatableContainer = Java8RepeatableContainerLoader.INSTANCE.loadRepeatableContainer(b.y(klass));
        if (clsLoadRepeatableContainer != null) {
            Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (b.y(b.x((Annotation) next)).equals(clsLoadRepeatableContainer)) {
                    break;
                }
            }
            Annotation annotation = (Annotation) next;
            if (annotation != null) {
                Object objInvoke = annotation.getClass().getMethod(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, new Class[0]).invoke(annotation, new Object[0]);
                AbstractC3340k.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.full.KAnnotatedElements.findAnnotations>");
                return m.c0((Annotation[]) objInvoke);
            }
        }
        return v.f35432a;
    }

    public static final <T extends Annotation> boolean hasAnnotation(KAnnotatedElement kAnnotatedElement) {
        AbstractC3340k.e(kAnnotatedElement, "<this>");
        Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        if (!it.hasNext()) {
            AbstractC3340k.l();
            throw null;
        }
        AbstractC3340k.l();
        throw null;
    }

    public static final <T extends Annotation> List<T> findAnnotations(KAnnotatedElement kAnnotatedElement) {
        AbstractC3340k.e(kAnnotatedElement, "<this>");
        AbstractC3340k.l();
        throw null;
    }
}
