package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ngb implements nga {
    public static final ngb a;
    public static final ngb b;
    public static final ngb c;
    public static final ngb d;
    public static final ngb e;
    public static final ngb f;
    public static final ngb g;
    public static final ngb h;
    public static final ngb i;
    public static final ngb j;
    public static final ngb k;
    public static final ngb l;
    public static final ngb m;
    public static final ngb n;
    public static final ngb o;
    private static final /* synthetic */ ngb[] p;

    static {
        ngb ngbVar = new ngb("START_OF_DRIVE", 0);
        a = ngbVar;
        ngb ngbVar2 = new ngb("NEW_NOTIFICATION", 1);
        b = ngbVar2;
        ngb ngbVar3 = new ngb("DIALER_OPEN", 2);
        c = ngbVar3;
        ngb ngbVar4 = new ngb("ACTIVE_PSTN_CALL_ENDED", 3);
        d = ngbVar4;
        ngb ngbVar5 = new ngb("MEDIA_OPEN", 4);
        e = ngbVar5;
        ngb ngbVar6 = new ngb("MEDIA_STATE_IDLE", 5);
        f = ngbVar6;
        ngb ngbVar7 = new ngb("LAUNCHER_OPEN", 6);
        g = ngbVar7;
        ngb ngbVar8 = new ngb("LONG_DRIVE_START", 7);
        h = ngbVar8;
        ngb ngbVar9 = new ngb("NAVIGATION_DASHBOARD_COMPATIBILITY_CHANGE", 8);
        i = ngbVar9;
        ngb ngbVar10 = new ngb("IMMERSIVE_MODE_OPEN", 9);
        j = ngbVar10;
        ngb ngbVar11 = new ngb("START_OF_DRIVE_ROCA_CLASSIC_UPGRADE", 10);
        k = ngbVar11;
        ngb ngbVar12 = new ngb("USED_ASSISTANT", 11);
        l = ngbVar12;
        ngb ngbVar13 = new ngb("USED_GEMINI", 12);
        m = ngbVar13;
        ngb ngbVar14 = new ngb("USED_GEMINI_LIVE", 13);
        n = ngbVar14;
        ngb ngbVar15 = new ngb("GEMINI_MESSAGE_SUMMARIZATION", 14);
        o = ngbVar15;
        p = new ngb[]{ngbVar, ngbVar2, ngbVar3, ngbVar4, ngbVar5, ngbVar6, ngbVar7, ngbVar8, ngbVar9, ngbVar10, ngbVar11, ngbVar12, ngbVar13, ngbVar14, ngbVar15};
    }

    public static ngb valueOf(String str) {
        return (ngb) Enum.valueOf(ngb.class, str);
    }

    public static ngb[] values() {
        return (ngb[]) p.clone();
    }
}
