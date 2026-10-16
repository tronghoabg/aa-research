package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rst {
    public static final defpackage.rst a;
    public static final defpackage.rst b;
    public static final defpackage.rst c;
    public static final defpackage.rst d;
    public static final defpackage.rst e;
    public static final defpackage.rst f;
    public static final defpackage.rst g;
    public static final defpackage.rst h;
    public static final defpackage.rst i;
    public static final defpackage.rst j;
    public static final defpackage.rst k;
    public static final defpackage.rst l;
    private static final /* synthetic */ defpackage.rst[] m;

    static {
        defpackage.rst rstVar = new defpackage.rst("CHARGE_ONLY_DETECTED", 0);
        a = rstVar;
        defpackage.rst rstVar2 = new defpackage.rst("CHARGE_ONLY_OVER", 1);
        b = rstVar2;
        defpackage.rst rstVar3 = new defpackage.rst("NO_ACCESSORY_MODE", 2);
        c = rstVar3;
        defpackage.rst rstVar4 = new defpackage.rst("FIRST_ACTIVITY_NOT_LAUNCHED", 3);
        d = rstVar4;
        defpackage.rst rstVar5 = new defpackage.rst("PROJECTION_NOT_STARTED", 4);
        e = rstVar5;
        defpackage.rst rstVar6 = new defpackage.rst("NO_ACCESSORY_MODE_FALSE_POSITIVE", 5);
        f = rstVar6;
        defpackage.rst rstVar7 = new defpackage.rst("FIRST_ACTIVITY_NOT_LAUNCHED_FALSE_POSITIVE", 6);
        g = rstVar7;
        defpackage.rst rstVar8 = new defpackage.rst("PROJECTION_NOT_STARTED_FALSE_POSITIVE", 7);
        h = rstVar8;
        defpackage.rst rstVar9 = new defpackage.rst("USB_RESET_SUPPRESSED", 8);
        i = rstVar9;
        defpackage.rst rstVar10 = new defpackage.rst("FLAKEY_USB_DETECTED", 9);
        j = rstVar10;
        defpackage.rst rstVar11 = new defpackage.rst("FLAKEY_USB_OVER", 10);
        k = rstVar11;
        defpackage.rst rstVar12 = new defpackage.rst("LOST_ACCESSORY", 11);
        l = rstVar12;
        m = new defpackage.rst[]{rstVar, rstVar2, rstVar3, rstVar4, rstVar5, rstVar6, rstVar7, rstVar8, rstVar9, rstVar10, rstVar11, rstVar12};
    }

    public static defpackage.rst valueOf(java.lang.String str) {
        return (defpackage.rst) java.lang.Enum.valueOf(defpackage.rst.class, str);
    }

    public static defpackage.rst[] values() {
        return (defpackage.rst[]) m.clone();
    }
}
