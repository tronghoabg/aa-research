package defpackage;

import java.lang.reflect.ParameterizedType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zec {
    public static final zec a;
    public static final zec b;
    public static final zec c;
    private static final /* synthetic */ zec[] d;

    static {
        zec zecVar = new zec("OWNED_BY_ENCLOSING_CLASS", 0);
        a = zecVar;
        zec zecVar2 = new zec("LOCAL_CLASS_HAS_NO_OWNER", 1);
        b = zecVar2;
        d = new zec[]{zecVar, zecVar2};
        ParameterizedType parameterizedType = (ParameterizedType) new zeb().getClass().getGenericSuperclass();
        parameterizedType.getClass();
        for (zec zecVar3 : values()) {
            if (zecVar3.a(zeb.class) == parameterizedType.getOwnerType()) {
                c = zecVar3;
                return;
            }
        }
        throw new AssertionError();
    }

    public static zec valueOf(String str) {
        return (zec) Enum.valueOf(zec.class, str);
    }

    public static zec[] values() {
        return (zec[]) d.clone();
    }

    public final Class a(Class cls) {
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
