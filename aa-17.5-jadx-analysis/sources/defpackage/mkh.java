package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mkh {
    public static final mkh a;
    public static final mkh b;
    public static final mkh c;
    private static final /* synthetic */ mkh[] d;

    static {
        mkh mkhVar = new mkh("COMMON", 0);
        a = mkhVar;
        mkh mkhVar2 = new mkh("LITE", 1);
        b = mkhVar2;
        mkh mkhVar3 = new mkh("CROSS_PROFILE", 2);
        c = mkhVar3;
        d = new mkh[]{mkhVar, mkhVar2, mkhVar3};
    }

    public static mkh valueOf(String str) {
        return (mkh) Enum.valueOf(mkh.class, str);
    }

    public static mkh[] values() {
        return (mkh[]) d.clone();
    }
}
