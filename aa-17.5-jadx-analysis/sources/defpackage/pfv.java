package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pfv implements pfx {
    public static final pfv a;
    private static final /* synthetic */ pfv[] b;

    static {
        pfv pfvVar = new pfv();
        a = pfvVar;
        b = new pfv[]{pfvVar};
    }

    private pfv() {
    }

    public static pfv valueOf(String str) {
        return (pfv) Enum.valueOf(pfv.class, str);
    }

    public static pfv[] values() {
        return (pfv[]) b.clone();
    }
}
