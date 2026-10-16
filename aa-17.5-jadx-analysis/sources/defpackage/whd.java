package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class whd {
    public static final whd a;
    public static final whd b;
    private static final /* synthetic */ whd[] c;

    static {
        whd whdVar = new whd("FIRST_CARD_MODAL", 0);
        a = whdVar;
        whd whdVar2 = new whd("FIRST_CARD_NON_MODAL", 1);
        b = whdVar2;
        c = new whd[]{whdVar, whdVar2};
    }

    public static whd valueOf(String str) {
        return (whd) Enum.valueOf(whd.class, str);
    }

    public static whd[] values() {
        return (whd[]) c.clone();
    }
}
