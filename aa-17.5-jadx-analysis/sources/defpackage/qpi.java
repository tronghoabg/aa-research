package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qpi {
    public static final qpi a;
    public static final qpi b;
    public static final qpi c;
    public static final qpi d;
    public static final qpi e;
    public static final qpi f;
    public static final qpi g;
    public static final qpi h;
    public static final qpi i;
    public static final qpi j;
    private static final /* synthetic */ qpi[] k;

    static {
        qpi qpiVar = new qpi("OEM", 0);
        a = qpiVar;
        qpi qpiVar2 = new qpi("NOTIFICATION", 1);
        b = qpiVar2;
        qpi qpiVar3 = new qpi("MEDIA", 2);
        c = qpiVar3;
        qpi qpiVar4 = new qpi("NAVIGATION", 3);
        d = qpiVar4;
        qpi qpiVar5 = new qpi("SERVICE", 4);
        e = qpiVar5;
        qpi qpiVar6 = new qpi("PROJECTION", 5);
        f = qpiVar6;
        qpi qpiVar7 = new qpi("SMS", 6);
        g = qpiVar7;
        qpi qpiVar8 = new qpi("TEMPLATE", 7);
        h = qpiVar8;
        qpi qpiVar9 = new qpi("MESSAGING", 8);
        i = qpiVar9;
        qpi qpiVar10 = new qpi("NATIVE_APP", 9);
        j = qpiVar10;
        k = new qpi[]{qpiVar, qpiVar2, qpiVar3, qpiVar4, qpiVar5, qpiVar6, qpiVar7, qpiVar8, qpiVar9, qpiVar10};
    }

    public static qpi valueOf(String str) {
        return (qpi) Enum.valueOf(qpi.class, str);
    }

    public static qpi[] values() {
        return (qpi[]) k.clone();
    }
}
