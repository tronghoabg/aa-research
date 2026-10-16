package zg;

import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: zg.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4685y extends AbstractC4670i {

    /* renamed from: a, reason: collision with root package name */
    public static final C4685y f48656a = new C4685y();

    @Override // zg.AbstractC4670i
    public final InterfaceC4671j b(Type type, Annotation[] annotationArr, T t10) {
        if (a0.f(type) != Optional.class) {
            return null;
        }
        return new C4684x(t10.c(a0.e(0, (ParameterizedType) type), annotationArr));
    }
}
