package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pfz {
    public static final pfz a;
    public static final pfz b;
    public static final pfz c;
    private static final /* synthetic */ pfz[] d;

    static {
        pfz pfzVar = new pfz("PENDING", 0);
        a = pfzVar;
        pfz pfzVar2 = new pfz("CONNECTED", 1);
        b = pfzVar2;
        pfz pfzVar3 = new pfz("DISCONNECTED", 2);
        c = pfzVar3;
        d = new pfz[]{pfzVar, pfzVar2, pfzVar3};
    }

    public static pfz valueOf(String str) {
        return (pfz) Enum.valueOf(pfz.class, str);
    }

    public static pfz[] values() {
        return (pfz[]) d.clone();
    }
}
