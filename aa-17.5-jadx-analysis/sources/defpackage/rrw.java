package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rrw {
    public static final rrw a;
    public static final rrw b;
    public static final rrw c;
    private static final /* synthetic */ rrw[] d;

    static {
        rrw rrwVar = new rrw("UNKNOWN", 0);
        a = rrwVar;
        rrw rrwVar2 = new rrw("USB", 1);
        b = rrwVar2;
        rrw rrwVar3 = new rrw("WIFI", 2);
        c = rrwVar3;
        d = new rrw[]{rrwVar, rrwVar2, rrwVar3};
    }

    public static rrw valueOf(String str) {
        return (rrw) Enum.valueOf(rrw.class, str);
    }

    public static rrw[] values() {
        return (rrw[]) d.clone();
    }
}
