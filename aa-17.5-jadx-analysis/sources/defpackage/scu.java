package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class scu {
    public static final scu a;
    public static final scu b;
    public static final scu c;
    public static final scu d;
    public static final scu e;
    public static final scu f;
    public static final scu g;
    public static final scu h;
    public static final scu i;
    private static final /* synthetic */ scu[] j;

    static {
        scu scuVar = new scu("SHOW_DOWNLOAD_FLOW", 0);
        a = scuVar;
        scu scuVar2 = new scu("DOWNLOAD_FLOW_DISABLED", 1);
        b = scuVar2;
        scu scuVar3 = new scu("PHONE_NOT_SUPPORTED", 2);
        c = scuVar3;
        scu scuVar4 = new scu("OS_BELOW_MIN_API", 3);
        d = scuVar4;
        scu scuVar5 = new scu("GH_UP_TO_DATE", 4);
        e = scuVar5;
        scu scuVar6 = new scu("UPDATE_ONLY", 5);
        f = scuVar6;
        scu scuVar7 = new scu("LOCATION_PERMISSION_DENIED", 6);
        g = scuVar7;
        scu scuVar8 = new scu("LOCATION_SERVICES_DISABLED", 7);
        h = scuVar8;
        scu scuVar9 = new scu("GEARHEAD_DISABLED", 8);
        i = scuVar9;
        j = new scu[]{scuVar, scuVar2, scuVar3, scuVar4, scuVar5, scuVar6, scuVar7, scuVar8, scuVar9};
    }

    public static scu valueOf(String str) {
        return (scu) Enum.valueOf(scu.class, str);
    }

    public static scu[] values() {
        return (scu[]) j.clone();
    }
}
