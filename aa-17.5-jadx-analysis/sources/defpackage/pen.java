package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pen implements peo {
    public static final pen a;
    private static final /* synthetic */ pen[] b;

    static {
        pen penVar = new pen();
        a = penVar;
        b = new pen[]{penVar};
    }

    private pen() {
    }

    public static pen valueOf(String str) {
        return (pen) Enum.valueOf(pen.class, str);
    }

    public static pen[] values() {
        return (pen[]) b.clone();
    }
}
