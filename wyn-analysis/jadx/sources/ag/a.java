package Ag;

import hb.K;
import hb.t;
import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import zg.AbstractC4670i;
import zg.InterfaceC4671j;
import zg.T;

/* loaded from: classes5.dex */
public final class a extends AbstractC4670i {

    /* renamed from: a, reason: collision with root package name */
    public final K f1343a;

    public a(K k) {
        this.f1343a = k;
    }

    public static Set c(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(t.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? DesugarCollections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // zg.AbstractC4670i
    public final InterfaceC4671j a(Type type, Annotation[] annotationArr) {
        return new b(this.f1343a.c(type, c(annotationArr), null));
    }

    @Override // zg.AbstractC4670i
    public final InterfaceC4671j b(Type type, Annotation[] annotationArr, T t10) {
        return new c(this.f1343a.c(type, c(annotationArr), null));
    }
}
