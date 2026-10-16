package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class koh {
    public static final defpackage.koh a;
    public static final defpackage.koh b;
    public static final defpackage.koh c;
    public static final defpackage.koh d;
    public static final defpackage.koh e;
    public static final defpackage.koh f;
    public static final defpackage.koh g;
    public static final defpackage.koh h;
    public static final defpackage.koh i;
    public static final defpackage.koh j;
    private static final /* synthetic */ defpackage.koh[] k;

    static {
        defpackage.koh kohVar = new defpackage.koh("PING_TIMEOUT", 0);
        a = kohVar;
        defpackage.koh kohVar2 = new defpackage.koh("CONNECTION_ATTEMPT_START", 1);
        b = kohVar2;
        defpackage.koh kohVar3 = new defpackage.koh("WIFI_INFO_RESPONSE_RECEIVED", 2);
        c = kohVar3;
        defpackage.koh kohVar4 = new defpackage.koh("WIFI_START_REQUEST_RECEIVED", 3);
        d = kohVar4;
        defpackage.koh kohVar5 = new defpackage.koh("WIFI_START_RESPONSE_RECEIVED", 4);
        e = kohVar5;
        defpackage.koh kohVar6 = new defpackage.koh("WIFI_VERSION_REQUEST_RECEIVED", 5);
        f = kohVar6;
        defpackage.koh kohVar7 = new defpackage.koh("WIFI_INFO_REQUEST_SENT", 6);
        g = kohVar7;
        defpackage.koh kohVar8 = new defpackage.koh("WIFI_START_REQUEST_SENT", 7);
        h = kohVar8;
        defpackage.koh kohVar9 = new defpackage.koh("WIFI_START_RESPONSE_SENT", 8);
        i = kohVar9;
        defpackage.koh kohVar10 = new defpackage.koh("WIFI_CONNECT_STATUS_SENT", 9);
        j = kohVar10;
        k = new defpackage.koh[]{kohVar, kohVar2, kohVar3, kohVar4, kohVar5, kohVar6, kohVar7, kohVar8, kohVar9, kohVar10};
    }

    public static defpackage.koh valueOf(java.lang.String str) {
        return (defpackage.koh) java.lang.Enum.valueOf(defpackage.koh.class, str);
    }

    public static defpackage.koh[] values() {
        return (defpackage.koh[]) k.clone();
    }
}
