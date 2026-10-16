package kotlin.jvm.internal;

import ef.C2527k;
import ff.AbstractC2640A;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.reflect.KClass;
import kotlin.reflect.KVisibility;
import r7.AbstractC3935e;

/* renamed from: kotlin.jvm.internal.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3334e implements KClass, InterfaceC3333d, InterfaceC3342m {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f39754b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f39755a;

    static {
        int i5 = 0;
        List listD = AbstractC3935e.D(tf.a.class, tf.l.class, tf.p.class, tf.q.class, tf.r.class, tf.s.class, tf.t.class, tf.u.class, tf.v.class, tf.w.class, tf.b.class, tf.c.class, tf.d.class, tf.e.class, tf.f.class, tf.g.class, tf.h.class, tf.i.class, tf.j.class, tf.k.class, tf.m.class, tf.n.class, tf.o.class);
        ArrayList arrayList = new ArrayList(ff.p.a0(listD, 10));
        for (Object obj : listD) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                AbstractC3935e.P();
                throw null;
            }
            arrayList.add(new C2527k((Class) obj, Integer.valueOf(i5)));
            i5 = i10;
        }
        f39754b = AbstractC2640A.X(arrayList);
    }

    public C3334e(Class jClass) {
        AbstractC3340k.e(jClass, "jClass");
        this.f39755a = jClass;
    }

    public static void a() {
        throw new Ef.G(2);
    }

    @Override // kotlin.reflect.KClass
    public final boolean equals(Object obj) {
        return (obj instanceof C3334e) && Fe.b.z(this).equals(Fe.b.z((KClass) obj));
    }

    @Override // kotlin.jvm.internal.InterfaceC3342m
    public final GenericDeclaration findJavaDeclaration() {
        return this.f39755a;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Collection getConstructors() {
        a();
        throw null;
    }

    @Override // kotlin.jvm.internal.InterfaceC3333d
    public final Class getJClass() {
        return this.f39755a;
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    public final Collection getMembers() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Collection getNestedClasses() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Object getObjectInstance() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() {
        String strF;
        Class jClass = this.f39755a;
        AbstractC3340k.e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String strF2 = K.f(jClass.getName());
            return strF2 == null ? jClass.getCanonicalName() : strF2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (strF = K.f(componentType.getName())) != null) {
            strConcat = strF.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // kotlin.reflect.KClass
    public final List getSealedSubclasses() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        String strI;
        Class jClass = this.f39755a;
        AbstractC3340k.e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String strI2 = K.i(jClass.getName());
                return strI2 == null ? jClass.getSimpleName() : strI2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (strI = K.i(componentType.getName())) != null) {
                strConcat = strI.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return Bf.k.M0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return Bf.k.L0('$', simpleName, simpleName);
        }
        return Bf.k.M0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // kotlin.reflect.KClass
    public final List getSupertypes() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final List getTypeParameters() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final KVisibility getVisibility() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return Fe.b.z(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isAbstract() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isCompanion() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isData() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFinal() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFun() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(Object obj) {
        Class jClass = this.f39755a;
        AbstractC3340k.e(jClass, "jClass");
        Map map = f39754b;
        AbstractC3340k.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return K.g(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = Fe.b.z(Fe.b.B(jClass));
        }
        return jClass.isInstance(obj);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isOpen() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isSealed() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        a();
        throw null;
    }

    public final String toString() {
        return this.f39755a.toString() + " (Kotlin reflection is not available)";
    }
}
