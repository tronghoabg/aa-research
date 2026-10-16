package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class xyn {
    public static final xyn a;
    private static final /* synthetic */ xyn[] b;

    static {
        xyn xynVar = new xyn();
        a = xynVar;
        b = new xyn[]{xynVar};
    }

    private xyn() {
    }

    public static xyn valueOf(String str) {
        return (xyn) Enum.valueOf(xyn.class, str);
    }

    public static xyn[] values() {
        return (xyn[]) b.clone();
    }
}
