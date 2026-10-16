package zg;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: zg.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4669h extends AbstractC4665d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4669h f48624a = new C4669h();

    @Override // zg.AbstractC4665d
    public final InterfaceC4666e a(Type type, Annotation[] annotationArr) {
        if (a0.f(type) != u6.u.c()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeE = a0.e(0, (ParameterizedType) type);
        if (a0.f(typeE) != Q.class) {
            return new com.google.android.gms.ads.nativead.l(typeE, 29);
        }
        if (typeE instanceof ParameterizedType) {
            return new vb.e(a0.e(0, (ParameterizedType) typeE));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
