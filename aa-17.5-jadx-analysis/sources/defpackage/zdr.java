package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* loaded from: classes3.dex */
final class zdr extends zea {
    final /* synthetic */ ygp a;

    public zdr(ygp ygpVar) {
        this.a = ygpVar;
    }

    @Override // defpackage.zea
    public final void a(Class cls) {
        this.a.c(cls);
    }

    @Override // defpackage.zea
    public final void b(ParameterizedType parameterizedType) {
        this.a.c((Class) parameterizedType.getRawType());
    }

    @Override // defpackage.zea
    public final void c(TypeVariable typeVariable) {
        f(typeVariable.getBounds());
    }

    @Override // defpackage.zea
    public final void d(WildcardType wildcardType) {
        f(wildcardType.getUpperBounds());
    }

    @Override // defpackage.zea
    public final void e(GenericArrayType genericArrayType) {
        this.a.c(zek.a(new zds(genericArrayType.getGenericComponentType()).c()));
    }
}
