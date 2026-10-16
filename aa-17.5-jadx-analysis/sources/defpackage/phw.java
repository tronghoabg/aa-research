package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class phw {
    public static final phw a;
    private static final /* synthetic */ phw[] b;

    static {
        phw phwVar = new phw();
        a = phwVar;
        b = new phw[]{phwVar};
    }

    private phw() {
    }

    public static phw valueOf(String str) {
        return (phw) Enum.valueOf(phw.class, str);
    }

    public static phw[] values() {
        return (phw[]) b.clone();
    }
}
