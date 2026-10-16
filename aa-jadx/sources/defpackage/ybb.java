package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class ybb {
    public static final defpackage.ybb a;
    public static final defpackage.ybb b;
    public static final defpackage.ybb c;
    private static final /* synthetic */ defpackage.ybb[] d;

    static {
        defpackage.ybb ybbVar = new defpackage.ybb("STRONG", 0);
        a = ybbVar;
        defpackage.ybb ybbVar2 = new defpackage.ybb("SOFT", 1);
        b = ybbVar2;
        defpackage.ybb ybbVar3 = new defpackage.ybb("WEAK", 2);
        c = ybbVar3;
        d = new defpackage.ybb[]{ybbVar, ybbVar2, ybbVar3};
    }

    public static defpackage.ybb valueOf(java.lang.String str) {
        return (defpackage.ybb) java.lang.Enum.valueOf(defpackage.ybb.class, str);
    }

    public static defpackage.ybb[] values() {
        return (defpackage.ybb[]) d.clone();
    }

    final defpackage.xyc a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return defpackage.xxz.a;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return defpackage.xya.a;
        }
        throw null;
    }
}
