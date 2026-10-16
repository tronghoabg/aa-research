package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rhx implements rhw {
    public static final rhx c;
    public static final ygr d;
    public static final ygr e;
    private static final /* synthetic */ rhx[] f;

    static {
        rhx rhxVar = new rhx();
        c = rhxVar;
        f = new rhx[]{rhxVar};
        d = ygr.t(8400, 8401, 8402, 8403, 8404, 8405, 8406, 8407, 12800, 12801);
        e = ygr.p(251, 252);
    }

    private rhx() {
    }

    public static rhx valueOf(String str) {
        return (rhx) Enum.valueOf(rhx.class, str);
    }

    public static rhx[] values() {
        return (rhx[]) f.clone();
    }

    public final int a() {
        return (int) acrk.a.gu().a();
    }
}
