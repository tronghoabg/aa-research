package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zfk {
    public static final defpackage.zfk a;
    public static final defpackage.zfk b;
    public static final defpackage.zfk c;
    public static final defpackage.zfk d;
    static final defpackage.zfk e;
    private static final /* synthetic */ defpackage.zfk[] f;

    static {
        defpackage.zfk zfkVar = new defpackage.zfk("JAVA6", 0);
        a = zfkVar;
        defpackage.zfk zfkVar2 = new defpackage.zfk("JAVA7", 1);
        b = zfkVar2;
        defpackage.zfk zfkVar3 = new defpackage.zfk("JAVA8", 2);
        c = zfkVar3;
        defpackage.zfk zfkVar4 = new defpackage.zfk("JAVA9", 3);
        d = zfkVar4;
        f = new defpackage.zfk[]{zfkVar, zfkVar2, zfkVar3, zfkVar4};
        if (java.lang.reflect.AnnotatedElement.class.isAssignableFrom(java.lang.reflect.TypeVariable.class)) {
            if (new defpackage.zfh(null).f().toString().contains("java.util.Map.java.util.Map")) {
                e = zfkVar3;
                return;
            } else {
                e = zfkVar4;
                return;
            }
        }
        if (new defpackage.zfh(null).f() instanceof java.lang.Class) {
            e = zfkVar2;
        } else {
            e = zfkVar;
        }
    }

    public static defpackage.zfk valueOf(java.lang.String str) {
        return (defpackage.zfk) java.lang.Enum.valueOf(defpackage.zfk.class, str);
    }

    public static defpackage.zfk[] values() {
        return (defpackage.zfk[]) f.clone();
    }

    final defpackage.ygw a(java.lang.reflect.Type[] typeArr) {
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        for (java.lang.reflect.Type type : typeArr) {
            ygrVar.i(d(type));
        }
        return ygrVar.g();
    }

    public final java.lang.String b(java.lang.reflect.Type type) {
        int iOrdinal = ordinal();
        if (iOrdinal != 2 && iOrdinal != 3) {
            return defpackage.zfq.b(type);
        }
        return type.getTypeName();
    }

    final java.lang.reflect.Type c(java.lang.reflect.Type type) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return new defpackage.zfj(type);
        }
        if (iOrdinal == 1) {
            return type instanceof java.lang.Class ? defpackage.zfq.a((java.lang.Class) type) : new defpackage.zfj(type);
        }
        if (iOrdinal == 2) {
            return b.c(type);
        }
        if (iOrdinal == 3) {
            return c.c(type);
        }
        throw null;
    }

    final java.lang.reflect.Type d(java.lang.reflect.Type type) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            type.getClass();
            if (!(type instanceof java.lang.Class)) {
                return type;
            }
            java.lang.Class cls = (java.lang.Class) type;
            return cls.isArray() ? new defpackage.zfj(cls.getComponentType()) : type;
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
