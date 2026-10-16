package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kim {
    public static final kim a;
    public static final kim b;
    private static final /* synthetic */ kim[] c;

    static {
        kim kimVar = new kim("TOKEN", 0);
        a = kimVar;
        kim kimVar2 = new kim("CAR", 1);
        b = kimVar2;
        c = new kim[]{kimVar, kimVar2};
    }

    public static kim valueOf(String str) {
        return (kim) Enum.valueOf(kim.class, str);
    }

    public static kim[] values() {
        return (kim[]) c.clone();
    }
}
