package com.google.l.c;

import androidx.credentials.provider.CredentialEntry;
import com.google.l.b.ac;
import com.google.l.b.k;
import j$.util.Objects;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Class f12411a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f12412b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12413c;

    protected a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type typeC = k.c(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), CredentialEntry.TRUE_STRING)) {
                    e(typeC);
                }
                this.f12412b = typeC;
                this.f12411a = k.a(typeC);
                this.f12413c = typeC.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ".concat(ac.a("type-token-raw")));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static a a(Class cls) {
        return new a(cls);
    }

    public static a b(Type type) {
        return new a(type);
    }

    private static void e(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + String.valueOf(typeVariable.getGenericDeclaration()) + "\nSee " + ac.a("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            e(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i2 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                e(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i2 < length) {
                e(actualTypeArguments[i2]);
                i2++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            e(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i2 < length2) {
            e(upperBounds[i2]);
            i2++;
        }
    }

    public final Class c() {
        return this.f12411a;
    }

    public final Type d() {
        return this.f12412b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && k.g(this.f12412b, ((a) obj).f12412b);
    }

    public final int hashCode() {
        return this.f12413c;
    }

    public final String toString() {
        return k.b(this.f12412b);
    }

    private a(Type type) {
        Type typeC = k.c((Type) Objects.requireNonNull(type));
        this.f12412b = typeC;
        this.f12411a = k.a(typeC);
        this.f12413c = typeC.hashCode();
    }
}
