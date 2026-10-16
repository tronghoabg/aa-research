package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ltz {
    public static final ltz a;
    public static final ltz b;
    public static final ltz c;
    private static final /* synthetic */ ltz[] d;

    static {
        ltz ltzVar = new ltz("NOTIFICATION_IM", 0);
        a = ltzVar;
        ltz ltzVar2 = new ltz("NOTIFICATION_SMS", 1);
        b = ltzVar2;
        ltz ltzVar3 = new ltz("CAL_BINDER_CONNECTION", 2);
        c = ltzVar3;
        d = new ltz[]{ltzVar, ltzVar2, ltzVar3};
    }

    public static ltz valueOf(String str) {
        return (ltz) Enum.valueOf(ltz.class, str);
    }

    public static ltz[] values() {
        return (ltz[]) d.clone();
    }
}
