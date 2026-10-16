package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ykk {
    public static final defpackage.ykk a;
    public static final defpackage.ykk b;
    private static final /* synthetic */ defpackage.ykk[] c;

    static {
        defpackage.ykk ykkVar = new defpackage.ykk("STRONG", 0);
        a = ykkVar;
        defpackage.ykk ykkVar2 = new defpackage.ykk("WEAK", 1);
        b = ykkVar2;
        c = new defpackage.ykk[]{ykkVar, ykkVar2};
    }

    public static defpackage.ykk valueOf(java.lang.String str) {
        return (defpackage.ykk) java.lang.Enum.valueOf(defpackage.ykk.class, str);
    }

    public static defpackage.ykk[] values() {
        return (defpackage.ykk[]) c.clone();
    }

    final defpackage.xyc a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return defpackage.xxz.a;
        }
        if (iOrdinal == 1) {
            return defpackage.xya.a;
        }
        throw null;
    }
}
