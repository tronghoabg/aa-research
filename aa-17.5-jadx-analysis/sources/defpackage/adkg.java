package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class adkg {
    public static final adkg a;
    public static final adkg b;
    public static final adkg c;
    public static final adkg d;
    private static final /* synthetic */ adkg[] e;

    static {
        adkg adkgVar = new adkg("CT_UNKNOWN", 0);
        a = adkgVar;
        adkg adkgVar2 = new adkg("CT_INFO", 1);
        b = adkgVar2;
        adkg adkgVar3 = new adkg("CT_WARNING", 2);
        c = adkgVar3;
        adkg adkgVar4 = new adkg("CT_ERROR", 3);
        d = adkgVar4;
        e = new adkg[]{adkgVar, adkgVar2, adkgVar3, adkgVar4};
    }

    public static adkg valueOf(String str) {
        return (adkg) Enum.valueOf(adkg.class, str);
    }

    public static adkg[] values() {
        return (adkg[]) e.clone();
    }
}
