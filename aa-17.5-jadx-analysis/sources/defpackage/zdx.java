package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class zdx implements xxj {
    public static final zdx a;
    public static final zdx b;
    private static final /* synthetic */ zdx[] c;

    static {
        zdx zdxVar = new zdx("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);
        a = zdxVar;
        zdx zdxVar2 = new zdx("INTERFACE_ONLY", 1);
        b = zdxVar2;
        c = new zdx[]{zdxVar, zdxVar2};
    }

    public static zdx valueOf(String str) {
        return (zdx) Enum.valueOf(zdx.class, str);
    }

    public static zdx[] values() {
        return (zdx[]) c.clone();
    }

    @Override // defpackage.xxj
    public final /* synthetic */ boolean a(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            Type type = ((zdz) obj).a;
            return ((type instanceof TypeVariable) || (type instanceof WildcardType)) ? false : true;
        }
        if (iOrdinal == 1) {
            return ((zdz) obj).c().isInterface();
        }
        throw null;
    }
}
