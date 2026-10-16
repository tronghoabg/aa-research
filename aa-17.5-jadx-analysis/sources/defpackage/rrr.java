package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rrr {
    public static final rrr a;
    public static final rrr b;
    private static final /* synthetic */ rrr[] c;

    static {
        rrr rrrVar = new rrr("CHARGE_ONLY_SHOWN", 0);
        a = rrrVar;
        rrr rrrVar2 = new rrr("CHARGE_ONLY_MORE_INFO_SELECTED", 1);
        b = rrrVar2;
        c = new rrr[]{rrrVar, rrrVar2};
    }

    public static rrr valueOf(String str) {
        return (rrr) Enum.valueOf(rrr.class, str);
    }

    public static rrr[] values() {
        return (rrr[]) c.clone();
    }
}
