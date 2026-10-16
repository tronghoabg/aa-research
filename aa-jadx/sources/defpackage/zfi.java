package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zfi {
    public static final defpackage.zfi a;
    public static final defpackage.zfi b;
    public static final defpackage.zfi c;
    private static final /* synthetic */ defpackage.zfi[] d;

    static {
        defpackage.zfi zfiVar = new defpackage.zfi("OWNED_BY_ENCLOSING_CLASS", 0);
        a = zfiVar;
        defpackage.zfi zfiVar2 = new defpackage.zfi("LOCAL_CLASS_HAS_NO_OWNER", 1);
        b = zfiVar2;
        d = new defpackage.zfi[]{zfiVar, zfiVar2};
        java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) new defpackage.zfh().getClass().getGenericSuperclass();
        parameterizedType.getClass();
        for (defpackage.zfi zfiVar3 : values()) {
            if (zfiVar3.a(defpackage.zfh.class) == parameterizedType.getOwnerType()) {
                c = zfiVar3;
                return;
            }
        }
        throw new java.lang.AssertionError();
    }

    public static defpackage.zfi valueOf(java.lang.String str) {
        return (defpackage.zfi) java.lang.Enum.valueOf(defpackage.zfi.class, str);
    }

    public static defpackage.zfi[] values() {
        return (defpackage.zfi[]) d.clone();
    }

    public final java.lang.Class a(java.lang.Class cls) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return cls.getEnclosingClass();
        }
        if (iOrdinal != 1) {
            throw null;
        }
        if (cls.isLocalClass()) {
            return null;
        }
        return cls.getEnclosingClass();
    }
}
