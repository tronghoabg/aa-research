package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tsm {
    public static final tsm a;
    public static final tsm b;
    public static final yob c;
    private static final /* synthetic */ tsm[] d;

    static {
        tsm tsmVar = new tsm("FROM_LEGACY", 0);
        a = tsmVar;
        tsm tsmVar2 = new tsm("FROM_MODERN", 1);
        b = tsmVar2;
        d = new tsm[]{tsmVar, tsmVar2};
        c = yob.c("com/google/android/libraries/geo/mapcore/internal/ApiCallPath");
    }

    public static tsm valueOf(String str) {
        return (tsm) Enum.valueOf(tsm.class, str);
    }

    public static tsm[] values() {
        return (tsm[]) d.clone();
    }
}
