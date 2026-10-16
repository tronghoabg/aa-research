package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class yio {
    public static final yio a;
    private static final /* synthetic */ yio[] b;

    static {
        yio yioVar = new yio();
        a = yioVar;
        b = new yio[]{yioVar};
    }

    private yio() {
    }

    public static yio valueOf(String str) {
        return (yio) Enum.valueOf(yio.class, str);
    }

    public static yio[] values() {
        return (yio[]) b.clone();
    }
}
