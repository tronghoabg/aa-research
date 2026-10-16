package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lfd {
    public static final lfd a;
    public static final lfd b;
    public static final lfd c;
    private static final /* synthetic */ lfd[] d;

    static {
        lfd lfdVar = new lfd("GRANTED", 0);
        a = lfdVar;
        lfd lfdVar2 = new lfd("DENIED", 1);
        b = lfdVar2;
        lfd lfdVar3 = new lfd("DENY_DO_NOT_ASK_AGAIN", 2);
        c = lfdVar3;
        d = new lfd[]{lfdVar, lfdVar2, lfdVar3};
    }

    public static lfd valueOf(String str) {
        return (lfd) Enum.valueOf(lfd.class, str);
    }

    public static lfd[] values() {
        return (lfd[]) d.clone();
    }
}
