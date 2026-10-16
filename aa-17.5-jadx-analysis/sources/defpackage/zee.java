package defpackage;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zee {
    public static final zee a;
    public static final zee b;
    public static final zee c;
    public static final zee d;
    static final zee e;
    private static final /* synthetic */ zee[] f;

    static {
        zee zeeVar = new zee("JAVA6", 0);
        a = zeeVar;
        zee zeeVar2 = new zee("JAVA7", 1);
        b = zeeVar2;
        zee zeeVar3 = new zee("JAVA8", 2);
        c = zeeVar3;
        zee zeeVar4 = new zee("JAVA9", 3);
        d = zeeVar4;
        f = new zee[]{zeeVar, zeeVar2, zeeVar3, zeeVar4};
        if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
            if (new zeb(null).f().toString().contains("java.util.Map.java.util.Map")) {
                e = zeeVar3;
                return;
            } else {
                e = zeeVar4;
                return;
            }
        }
        if (new zeb(null).f() instanceof Class) {
            e = zeeVar2;
        } else {
            e = zeeVar;
        }
    }

    public static zee valueOf(String str) {
        return (zee) Enum.valueOf(zee.class, str);
    }

    public static zee[] values() {
        return (zee[]) f.clone();
    }

    final yfq a(Type[] typeArr) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        for (Type type : typeArr) {
            yflVar.i(d(type));
        }
        return yflVar.g();
    }

    public final String b(Type type) {
        int iOrdinal = ordinal();
        if (iOrdinal != 2 && iOrdinal != 3) {
            return zek.b(type);
        }
        return type.getTypeName();
    }

    final Type c(Type type) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return new zed(type);
        }
        if (iOrdinal == 1) {
            return type instanceof Class ? zek.a((Class) type) : new zed(type);
        }
        if (iOrdinal == 2) {
            return b.c(type);
        }
        if (iOrdinal == 3) {
            return c.c(type);
        }
        throw null;
    }

    final Type d(Type type) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            type.getClass();
            if (!(type instanceof Class)) {
                return type;
            }
            Class cls = (Class) type;
            return cls.isArray() ? new zed(cls.getComponentType()) : type;
        }
        if (iOrdinal == 1) {
            type.getClass();
            return type;
        }
        if (iOrdinal == 2) {
            return b.d(type);
        }
        if (iOrdinal == 3) {
            return c.d(type);
        }
        throw null;
    }
}
