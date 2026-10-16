package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class zfd implements defpackage.xyp {
    public static final defpackage.zfd a;
    public static final defpackage.zfd b;
    private static final /* synthetic */ defpackage.zfd[] c;

    static {
        defpackage.zfd zfdVar = new defpackage.zfd("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);
        a = zfdVar;
        defpackage.zfd zfdVar2 = new defpackage.zfd("INTERFACE_ONLY", 1);
        b = zfdVar2;
        c = new defpackage.zfd[]{zfdVar, zfdVar2};
    }

    public static defpackage.zfd valueOf(java.lang.String str) {
        return (defpackage.zfd) java.lang.Enum.valueOf(defpackage.zfd.class, str);
    }

    public static defpackage.zfd[] values() {
        return (defpackage.zfd[]) c.clone();
    }

    @Override // defpackage.xyp
    public final /* synthetic */ boolean a(java.lang.Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            java.lang.reflect.Type type = ((defpackage.zff) obj).a;
            return ((type instanceof java.lang.reflect.TypeVariable) || (type instanceof java.lang.reflect.WildcardType)) ? false : true;
        }
        if (iOrdinal == 1) {
            return ((defpackage.zff) obj).c().isInterface();
        }
        throw null;
    }
}
