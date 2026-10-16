package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class peq implements pet {
    public static final peq a;
    private static final /* synthetic */ peq[] b;

    static {
        peq peqVar = new peq();
        a = peqVar;
        b = new peq[]{peqVar};
    }

    private peq() {
    }

    public static peq valueOf(String str) {
        return (peq) Enum.valueOf(peq.class, str);
    }

    public static peq[] values() {
        return (peq[]) b.clone();
    }
}
