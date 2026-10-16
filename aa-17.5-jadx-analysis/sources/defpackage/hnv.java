package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hnv {
    public static final hnv a;
    public static final hnv b;
    public static final hnv c;
    public static final hnv d;
    public static final hnv e;
    public static final hnv f;
    public static final hnv g;
    public static final hnv h;
    public static final /* synthetic */ afdf i;
    private static final /* synthetic */ hnv[] k;
    public final int j;

    static {
        hnv hnvVar = new hnv("UNKNOWN", 0, 0);
        a = hnvVar;
        hnv hnvVar2 = new hnv("SHARE_PHOTO", 1, 1);
        b = hnvVar2;
        hnv hnvVar3 = new hnv("SHOW_CARDS", 2, 2);
        c = hnvVar3;
        hnv hnvVar4 = new hnv("FULL_SCREEN_REQUEST", 3, 3);
        d = hnvVar4;
        hnv hnvVar5 = new hnv("TEXT_PASTE", 4, 4);
        e = hnvVar5;
        hnv hnvVar6 = new hnv("SHARE_LIVE_LOCATION", 5, 5);
        f = hnvVar6;
        hnv hnvVar7 = new hnv("HIDE_KEYBOARD", 6, 6);
        g = hnvVar7;
        hnv hnvVar8 = new hnv("BLUEFLAX", 7, 7);
        h = hnvVar8;
        hnv[] hnvVarArr = {hnvVar, hnvVar2, hnvVar3, hnvVar4, hnvVar5, hnvVar6, hnvVar7, hnvVar8};
        k = hnvVarArr;
        i = affa.p(hnvVarArr);
    }

    private hnv(String str, int i2, int i3) {
        this.j = i3;
    }

    public static hnv valueOf(String str) {
        return (hnv) Enum.valueOf(hnv.class, str);
    }

    public static hnv[] values() {
        return (hnv[]) k.clone();
    }
}
