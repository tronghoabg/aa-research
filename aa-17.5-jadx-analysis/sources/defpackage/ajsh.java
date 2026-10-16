package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ajsh {
    public static final ajsh a;
    public static final ajsh b;
    private static final /* synthetic */ ajsh[] c;

    static {
        ajsh ajshVar = new ajsh("DROP_FRAGMENT", 0);
        a = ajshVar;
        ajsh ajshVar2 = new ajsh("NORMALIZE", 1);
        b = ajshVar2;
        c = new ajsh[]{ajshVar, ajshVar2};
    }

    public static ajsh valueOf(String str) {
        return (ajsh) Enum.valueOf(ajsh.class, str);
    }

    public static ajsh[] values() {
        return (ajsh[]) c.clone();
    }
}
