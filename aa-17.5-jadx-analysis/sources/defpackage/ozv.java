package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ozv implements ozx {
    public static final ozv a;
    private static final /* synthetic */ ozv[] b;

    static {
        ozv ozvVar = new ozv();
        a = ozvVar;
        b = new ozv[]{ozvVar};
    }

    private ozv() {
    }

    public static ozv valueOf(String str) {
        return (ozv) Enum.valueOf(ozv.class, str);
    }

    public static ozv[] values() {
        return (ozv[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "FailedUnexpectedly";
    }
}
