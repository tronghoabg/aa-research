package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rrz {
    public static final rrz a;
    public static final rrz b;
    public static final rrz c;
    public static final rrz d;
    public static final rrz e;
    public static final rrz f;
    public static final rrz g;
    public static final rrz h;
    public static final rrz i;
    public static final rrz j;
    public static final rrz k;
    public static final rrz l;
    private static final /* synthetic */ rrz[] m;

    static {
        rrz rrzVar = new rrz("CHARGE_ONLY_DETECTED", 0);
        a = rrzVar;
        rrz rrzVar2 = new rrz("CHARGE_ONLY_OVER", 1);
        b = rrzVar2;
        rrz rrzVar3 = new rrz("NO_ACCESSORY_MODE", 2);
        c = rrzVar3;
        rrz rrzVar4 = new rrz("FIRST_ACTIVITY_NOT_LAUNCHED", 3);
        d = rrzVar4;
        rrz rrzVar5 = new rrz("PROJECTION_NOT_STARTED", 4);
        e = rrzVar5;
        rrz rrzVar6 = new rrz("NO_ACCESSORY_MODE_FALSE_POSITIVE", 5);
        f = rrzVar6;
        rrz rrzVar7 = new rrz("FIRST_ACTIVITY_NOT_LAUNCHED_FALSE_POSITIVE", 6);
        g = rrzVar7;
        rrz rrzVar8 = new rrz("PROJECTION_NOT_STARTED_FALSE_POSITIVE", 7);
        h = rrzVar8;
        rrz rrzVar9 = new rrz("USB_RESET_SUPPRESSED", 8);
        i = rrzVar9;
        rrz rrzVar10 = new rrz("FLAKEY_USB_DETECTED", 9);
        j = rrzVar10;
        rrz rrzVar11 = new rrz("FLAKEY_USB_OVER", 10);
        k = rrzVar11;
        rrz rrzVar12 = new rrz("LOST_ACCESSORY", 11);
        l = rrzVar12;
        m = new rrz[]{rrzVar, rrzVar2, rrzVar3, rrzVar4, rrzVar5, rrzVar6, rrzVar7, rrzVar8, rrzVar9, rrzVar10, rrzVar11, rrzVar12};
    }

    public static rrz valueOf(String str) {
        return (rrz) Enum.valueOf(rrz.class, str);
    }

    public static rrz[] values() {
        return (rrz[]) m.clone();
    }
}
