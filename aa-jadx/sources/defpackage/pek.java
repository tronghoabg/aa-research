package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pek {
    public static final defpackage.pek a;
    public static final defpackage.pek b;
    public static final defpackage.pek c;
    public static final defpackage.pek d;
    public static final defpackage.pek e;
    public static final defpackage.pek f;
    public static final defpackage.pek g;
    public static final defpackage.pek h;
    public static final defpackage.pek i;
    public static final defpackage.pek j;
    private static final /* synthetic */ defpackage.pek[] k;

    static {
        defpackage.pek pekVar = new defpackage.pek("USER_REQUESTED_CONNECT_PROJECTION", 0);
        a = pekVar;
        defpackage.pek pekVar2 = new defpackage.pek("USER_REQUESTED_DISCONNECT_FROM_MD", 1);
        b = pekVar2;
        defpackage.pek pekVar3 = new defpackage.pek("USER_REQUESTED_GAL_ONLY_DISCONNECT_FROM_MD", 2);
        c = pekVar3;
        defpackage.pek pekVar4 = new defpackage.pek("USER_REQUESTED_DISCONNECT_FROM_HU", 3);
        d = pekVar4;
        defpackage.pek pekVar5 = new defpackage.pek("USER_REQUESTED_CONNECT_WPP", 4);
        e = pekVar5;
        defpackage.pek pekVar6 = new defpackage.pek("MD_WIFI_ADAPTER_TURNED_OFF", 5);
        f = pekVar6;
        defpackage.pek pekVar7 = new defpackage.pek("MD_WIFI_ADAPTER_TURNED_ON", 6);
        g = pekVar7;
        defpackage.pek pekVar8 = new defpackage.pek("HU_WIFI_ADAPTER_TURNED_OFF", 7);
        h = pekVar8;
        defpackage.pek pekVar9 = new defpackage.pek("USER_DISCONNECTED_FROM_WIFI_NETWORK", 8);
        i = pekVar9;
        defpackage.pek pekVar10 = new defpackage.pek("HU_USER_PROFILE_SWITCHED", 9);
        j = pekVar10;
        k = new defpackage.pek[]{pekVar, pekVar2, pekVar3, pekVar4, pekVar5, pekVar6, pekVar7, pekVar8, pekVar9, pekVar10};
    }

    public static defpackage.pek valueOf(java.lang.String str) {
        return (defpackage.pek) java.lang.Enum.valueOf(defpackage.pek.class, str);
    }

    public static defpackage.pek[] values() {
        return (defpackage.pek[]) k.clone();
    }
}
