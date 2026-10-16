package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class pga {
    public static final pga a;
    public static final pga b;
    private static final /* synthetic */ pga[] c;

    static {
        pga pgaVar = new pga("UNKNOWN", 0);
        a = pgaVar;
        pga pgaVar2 = new pga("FRX_REQUIRED", 1);
        b = pgaVar2;
        c = new pga[]{pgaVar, pgaVar2};
    }

    public static pga valueOf(String str) {
        return (pga) Enum.valueOf(pga.class, str);
    }

    public static pga[] values() {
        return (pga[]) c.clone();
    }
}
