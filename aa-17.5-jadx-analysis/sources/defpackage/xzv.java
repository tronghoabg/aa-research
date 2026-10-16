package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class xzv {
    public static final xzv a;
    public static final xzv b;
    public static final xzv c;
    private static final /* synthetic */ xzv[] d;

    static {
        xzv xzvVar = new xzv("STRONG", 0);
        a = xzvVar;
        xzv xzvVar2 = new xzv("SOFT", 1);
        b = xzvVar2;
        xzv xzvVar3 = new xzv("WEAK", 2);
        c = xzvVar3;
        d = new xzv[]{xzvVar, xzvVar2, xzvVar3};
    }

    public static xzv valueOf(String str) {
        return (xzv) Enum.valueOf(xzv.class, str);
    }

    public static xzv[] values() {
        return (xzv[]) d.clone();
    }

    final xww a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return xwt.a;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return xwu.a;
        }
        throw null;
    }
}
