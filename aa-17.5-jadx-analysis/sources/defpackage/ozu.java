package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ozu implements ozx {
    public static final ozu a;
    private static final /* synthetic */ ozu[] b;

    static {
        ozu ozuVar = new ozu();
        a = ozuVar;
        b = new ozu[]{ozuVar};
    }

    private ozu() {
    }

    public static ozu valueOf(String str) {
        return (ozu) Enum.valueOf(ozu.class, str);
    }

    public static ozu[] values() {
        return (ozu[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Completed";
    }
}
