package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pdo {
    public static final pdo a;
    public static final pdo b;
    public static final pdo c;
    public static final pdo d;
    public static final pdo e;
    public static final pdo f;
    public static final pdo g;
    public static final pdo h;
    public static final pdo i;
    public static final pdo j;
    private static final /* synthetic */ pdo[] k;

    static {
        pdo pdoVar = new pdo("USER_REQUESTED_CONNECT_PROJECTION", 0);
        a = pdoVar;
        pdo pdoVar2 = new pdo("USER_REQUESTED_DISCONNECT_FROM_MD", 1);
        b = pdoVar2;
        pdo pdoVar3 = new pdo("USER_REQUESTED_GAL_ONLY_DISCONNECT_FROM_MD", 2);
        c = pdoVar3;
        pdo pdoVar4 = new pdo("USER_REQUESTED_DISCONNECT_FROM_HU", 3);
        d = pdoVar4;
        pdo pdoVar5 = new pdo("USER_REQUESTED_CONNECT_WPP", 4);
        e = pdoVar5;
        pdo pdoVar6 = new pdo("MD_WIFI_ADAPTER_TURNED_OFF", 5);
        f = pdoVar6;
        pdo pdoVar7 = new pdo("MD_WIFI_ADAPTER_TURNED_ON", 6);
        g = pdoVar7;
        pdo pdoVar8 = new pdo("HU_WIFI_ADAPTER_TURNED_OFF", 7);
        h = pdoVar8;
        pdo pdoVar9 = new pdo("USER_DISCONNECTED_FROM_WIFI_NETWORK", 8);
        i = pdoVar9;
        pdo pdoVar10 = new pdo("HU_USER_PROFILE_SWITCHED", 9);
        j = pdoVar10;
        k = new pdo[]{pdoVar, pdoVar2, pdoVar3, pdoVar4, pdoVar5, pdoVar6, pdoVar7, pdoVar8, pdoVar9, pdoVar10};
    }

    public static pdo valueOf(String str) {
        return (pdo) Enum.valueOf(pdo.class, str);
    }

    public static pdo[] values() {
        return (pdo[]) k.clone();
    }
}
