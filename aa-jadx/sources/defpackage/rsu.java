package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rsu {
    public static final defpackage.rsu a;
    public static final defpackage.rsu b;
    public static final defpackage.rsu c;
    public static final defpackage.rsu d;
    public static final defpackage.rsu e;
    public static final defpackage.rsu f;
    public static final defpackage.rsu g;
    public static final defpackage.rsu h;
    public static final defpackage.rsu i;
    public static final defpackage.rsu j;
    public static final defpackage.rsu k;
    public static final defpackage.rsu l;
    public static final defpackage.rsu m;
    public static final defpackage.rsu n;
    public static final defpackage.rsu o;
    public static final defpackage.rsu p;
    private static final /* synthetic */ defpackage.rsu[] q;

    static {
        defpackage.rsu rsuVar = new defpackage.rsu("ENTERED_ACCESSORY_MODE", 0);
        a = rsuVar;
        defpackage.rsu rsuVar2 = new defpackage.rsu("EXITED_ACCESSORY_MODE", 1);
        b = rsuVar2;
        defpackage.rsu rsuVar3 = new defpackage.rsu("CONFIGURED", 2);
        c = rsuVar3;
        defpackage.rsu rsuVar4 = new defpackage.rsu("LOST_CONFIGURED", 3);
        d = rsuVar4;
        defpackage.rsu rsuVar5 = new defpackage.rsu("CONNECTED", 4);
        e = rsuVar5;
        defpackage.rsu rsuVar6 = new defpackage.rsu("DISCONNECTED", 5);
        f = rsuVar6;
        defpackage.rsu rsuVar7 = new defpackage.rsu("ENTERED_MTP_MODE", 6);
        g = rsuVar7;
        defpackage.rsu rsuVar8 = new defpackage.rsu("EXITED_MTP_MODE", 7);
        h = rsuVar8;
        defpackage.rsu rsuVar9 = new defpackage.rsu("ENTERED_PTP_MODE", 8);
        i = rsuVar9;
        defpackage.rsu rsuVar10 = new defpackage.rsu("EXITED_PTP_MODE", 9);
        j = rsuVar10;
        defpackage.rsu rsuVar11 = new defpackage.rsu("DATA_UNLOCKED", 10);
        k = rsuVar11;
        defpackage.rsu rsuVar12 = new defpackage.rsu("DATA_LOCKED", 11);
        l = rsuVar12;
        defpackage.rsu rsuVar13 = new defpackage.rsu("ENTERED_ADB_MODE", 12);
        m = rsuVar13;
        defpackage.rsu rsuVar14 = new defpackage.rsu("EXITED_ADB_MODE", 13);
        n = rsuVar14;
        defpackage.rsu rsuVar15 = new defpackage.rsu("ENTERED_AUDIO_SOURCE_MODE", 14);
        o = rsuVar15;
        defpackage.rsu rsuVar16 = new defpackage.rsu("EXITED_AUDIO_SOURCE_MODE", 15);
        p = rsuVar16;
        q = new defpackage.rsu[]{rsuVar, rsuVar2, rsuVar3, rsuVar4, rsuVar5, rsuVar6, rsuVar7, rsuVar8, rsuVar9, rsuVar10, rsuVar11, rsuVar12, rsuVar13, rsuVar14, rsuVar15, rsuVar16};
    }

    public static defpackage.rsu valueOf(java.lang.String str) {
        return (defpackage.rsu) java.lang.Enum.valueOf(defpackage.rsu.class, str);
    }

    public static defpackage.rsu[] values() {
        return (defpackage.rsu[]) q.clone();
    }
}
