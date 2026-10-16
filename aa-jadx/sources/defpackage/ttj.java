package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ttj {
    public static final defpackage.ttj a;
    public static final defpackage.ttj b;
    public static final defpackage.ypg c;
    private static final /* synthetic */ defpackage.ttj[] d;

    static {
        defpackage.ttj ttjVar = new defpackage.ttj("FROM_LEGACY", 0);
        a = ttjVar;
        defpackage.ttj ttjVar2 = new defpackage.ttj("FROM_MODERN", 1);
        b = ttjVar2;
        d = new defpackage.ttj[]{ttjVar, ttjVar2};
        c = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/internal/ApiCallPath");
    }

    public static defpackage.ttj valueOf(java.lang.String str) {
        return (defpackage.ttj) java.lang.Enum.valueOf(defpackage.ttj.class, str);
    }

    public static defpackage.ttj[] values() {
        return (defpackage.ttj[]) d.clone();
    }
}
