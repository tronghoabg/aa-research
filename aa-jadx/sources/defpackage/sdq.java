package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class sdq {
    public static final defpackage.sdq a;
    public static final defpackage.sdq b;
    public static final defpackage.sdq c;
    public static final defpackage.sdq d;
    public static final defpackage.sdq e;
    public static final defpackage.sdq f;
    public static final defpackage.sdq g;
    public static final defpackage.sdq h;
    public static final defpackage.sdq i;
    private static final /* synthetic */ defpackage.sdq[] j;

    static {
        defpackage.sdq sdqVar = new defpackage.sdq("SHOW_DOWNLOAD_FLOW", 0);
        a = sdqVar;
        defpackage.sdq sdqVar2 = new defpackage.sdq("DOWNLOAD_FLOW_DISABLED", 1);
        b = sdqVar2;
        defpackage.sdq sdqVar3 = new defpackage.sdq("PHONE_NOT_SUPPORTED", 2);
        c = sdqVar3;
        defpackage.sdq sdqVar4 = new defpackage.sdq("OS_BELOW_MIN_API", 3);
        d = sdqVar4;
        defpackage.sdq sdqVar5 = new defpackage.sdq("GH_UP_TO_DATE", 4);
        e = sdqVar5;
        defpackage.sdq sdqVar6 = new defpackage.sdq("UPDATE_ONLY", 5);
        f = sdqVar6;
        defpackage.sdq sdqVar7 = new defpackage.sdq("LOCATION_PERMISSION_DENIED", 6);
        g = sdqVar7;
        defpackage.sdq sdqVar8 = new defpackage.sdq("LOCATION_SERVICES_DISABLED", 7);
        h = sdqVar8;
        defpackage.sdq sdqVar9 = new defpackage.sdq("GEARHEAD_DISABLED", 8);
        i = sdqVar9;
        j = new defpackage.sdq[]{sdqVar, sdqVar2, sdqVar3, sdqVar4, sdqVar5, sdqVar6, sdqVar7, sdqVar8, sdqVar9};
    }

    public static defpackage.sdq valueOf(java.lang.String str) {
        return (defpackage.sdq) java.lang.Enum.valueOf(defpackage.sdq.class, str);
    }

    public static defpackage.sdq[] values() {
        return (defpackage.sdq[]) j.clone();
    }
}
