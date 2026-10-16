package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zwp {
    public static final zwp a;
    public static final zwp b;
    public static final zwp c;
    private static final /* synthetic */ zwp[] d;

    static {
        zwp zwpVar = new zwp("TIER_UNSPECIFIED", 0);
        a = zwpVar;
        zwp zwpVar2 = new zwp("TIER_BASIC", 1);
        b = zwpVar2;
        zwp zwpVar3 = new zwp("TIER_PREMIUM", 2);
        c = zwpVar3;
        d = new zwp[]{zwpVar, zwpVar2, zwpVar3};
    }

    public static zwp valueOf(String str) {
        return (zwp) Enum.valueOf(zwp.class, str);
    }

    public static zwp[] values() {
        return (zwp[]) d.clone();
    }
}
