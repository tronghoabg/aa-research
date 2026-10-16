package zg;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: zg.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4674m extends AbstractC4665d {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f48629a;

    public C4674m(Executor executor) {
        this.f48629a = executor;
    }

    @Override // zg.AbstractC4665d
    public final InterfaceC4666e a(Type type, Annotation[] annotationArr) {
        if (a0.f(type) != InterfaceC4664c.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new t6.q(a0.e(0, (ParameterizedType) type), a0.i(annotationArr, V.class) ? null : this.f48629a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
