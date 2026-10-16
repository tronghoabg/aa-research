package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class per implements pet {
    public static final per a;
    private static final /* synthetic */ per[] b;

    static {
        per perVar = new per();
        a = perVar;
        b = new per[]{perVar};
    }

    private per() {
    }

    public static per valueOf(String str) {
        return (per) Enum.valueOf(per.class, str);
    }

    public static per[] values() {
        return (per[]) b.clone();
    }
}
