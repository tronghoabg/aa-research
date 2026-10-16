package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ozr {
    public static final ozr A;
    public static final ozr B;
    public static final ozr C;
    public static final ozr D;
    public static final ozr E;
    private static final /* synthetic */ ozr[] F;
    public static final ozr a;
    public static final ozr b;
    public static final ozr c;
    public static final ozr d;
    public static final ozr e;
    public static final ozr f;
    public static final ozr g;
    public static final ozr h;
    public static final ozr i;
    public static final ozr j;
    public static final ozr k;
    public static final ozr l;
    public static final ozr m;
    public static final ozr n;
    public static final ozr o;
    public static final ozr p;
    public static final ozr q;
    public static final ozr r;
    public static final ozr s;
    public static final ozr t;
    public static final ozr u;
    public static final ozr v;
    public static final ozr w;
    public static final ozr x;
    public static final ozr y;
    public static final ozr z;

    static {
        ozr ozrVar = new ozr("RFCOMM_SOCKET_CONNECTION_FAILED", 0);
        a = ozrVar;
        ozr ozrVar2 = new ozr("TCP_SOCKET_CONNECTION_FAILED", 1);
        b = ozrVar2;
        ozr ozrVar3 = new ozr("GAL_SOCKET_CONNECTION_FAILED", 2);
        c = ozrVar3;
        ozr ozrVar4 = new ozr("WPP_SOCKET_IO_EXCEPTION", 3);
        d = ozrVar4;
        ozr ozrVar5 = new ozr("WPP_SOCKET_CLOSED_BY_PEER", 4);
        e = ozrVar5;
        ozr ozrVar6 = new ozr("WPP_CONNECTION_MISSING_WIFI_INFO_RESPONSE", 5);
        f = ozrVar6;
        ozr ozrVar7 = new ozr("WPP_CONNECTION_MISSING_WIFI_START_RESPONSE", 6);
        g = ozrVar7;
        ozr ozrVar8 = new ozr("WPP_CONNECTION_INVALID_WIFI_CREDENTIALS", 7);
        h = ozrVar8;
        ozr ozrVar9 = new ozr("WPP_CONNECTION_FIRST_MESSAGE_TIMEOUT", 8);
        i = ozrVar9;
        ozr ozrVar10 = new ozr("WPP_PING_TIMEOUT", 9);
        j = ozrVar10;
        ozr ozrVar11 = new ozr("LOCAL_ONLY_CONNECTION_FAILURE_REASON_UNKNOWN", 10);
        k = ozrVar11;
        ozr ozrVar12 = new ozr("LOCAL_ONLY_CONNECTION_FAILURE_REASON_ASSOCIATION", 11);
        l = ozrVar12;
        ozr ozrVar13 = new ozr("LOCAL_ONLY_CONNECTION_FAILURE_REASON_AUTHENTICATION", 12);
        m = ozrVar13;
        ozr ozrVar14 = new ozr("LOCAL_ONLY_CONNECTION_FAILURE_REASON_IP_PROVISIONING", 13);
        n = ozrVar14;
        ozr ozrVar15 = new ozr("LOCAL_ONLY_CONNECTION_FAILURE_REASON_NOT_FOUND", 14);
        o = ozrVar15;
        ozr ozrVar16 = new ozr("LOCAL_ONLY_CONNECTION_FAILURE_REASON_NO_RESPONSE", 15);
        p = ozrVar16;
        ozr ozrVar17 = new ozr("LOCAL_ONLY_CONNECTION_FAILURE_REASON_USER_REJECT", 16);
        q = ozrVar17;
        ozr ozrVar18 = new ozr("NETWORK_UNAVAILABLE_HANDSHAKE_FAILED", 17);
        r = ozrVar18;
        ozr ozrVar19 = new ozr("NETWORK_UNAVAILABLE_NETWORK_NOT_FOUND", 18);
        s = ozrVar19;
        ozr ozrVar20 = new ozr("NETWORK_UNAVAILABLE_WIFI_ADAPTER_FAILED_TO_ENABLE", 19);
        t = ozrVar20;
        ozr ozrVar21 = new ozr("NETWORK_UNAVAILABLE_OTHER", 20);
        u = ozrVar21;
        ozr ozrVar22 = new ozr("NETWORK_LOST", 21);
        v = ozrVar22;
        ozr ozrVar23 = new ozr("HEAD_UNIT_REJECTED_CONNECTION_MOBILE_DEVICE_ID_NOT_FOUND", 22);
        w = ozrVar23;
        ozr ozrVar24 = new ozr("HEAD_UNIT_REJECTED_CONNECTION_INVALID_TOKEN", 23);
        x = ozrVar24;
        ozr ozrVar25 = new ozr("RECEIVED_WIFI_SETUP_INFO", 24);
        y = ozrVar25;
        ozr ozrVar26 = new ozr("LOCAL_ONLY_DISCONNECTION_REASON_UNKNOWN", 25);
        z = ozrVar26;
        ozr ozrVar27 = new ozr("LOCAL_ONLY_DISCONNECTION_REASON_DISCONNECT_API", 26);
        A = ozrVar27;
        ozr ozrVar28 = new ozr("LOCAL_ONLY_DISCONNECTION_REASON_NEW_CONNECTION", 27);
        B = ozrVar28;
        ozr ozrVar29 = new ozr("LOCAL_ONLY_DISCONNECTION_REASON_DISABLE_WIFI", 28);
        C = ozrVar29;
        ozr ozrVar30 = new ozr("LOCAL_ONLY_DISCONNECTION_REASON_AIRPLANE_MODE_ON", 29);
        D = ozrVar30;
        ozr ozrVar31 = new ozr("NETWORK_LOST_WIFI_ADAPTER_DISABLED_OR_DISABLING", 30);
        E = ozrVar31;
        F = new ozr[]{ozrVar, ozrVar2, ozrVar3, ozrVar4, ozrVar5, ozrVar6, ozrVar7, ozrVar8, ozrVar9, ozrVar10, ozrVar11, ozrVar12, ozrVar13, ozrVar14, ozrVar15, ozrVar16, ozrVar17, ozrVar18, ozrVar19, ozrVar20, ozrVar21, ozrVar22, ozrVar23, ozrVar24, ozrVar25, ozrVar26, ozrVar27, ozrVar28, ozrVar29, ozrVar30, ozrVar31};
    }

    public static ozr valueOf(String str) {
        return (ozr) Enum.valueOf(ozr.class, str);
    }

    public static ozr[] values() {
        return (ozr[]) F.clone();
    }

    public final int a() {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 22;
            case 7:
                return 30;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 24;
            case 17:
                return 15;
            case 18:
                return 16;
            case 19:
                return 23;
            case 20:
                return 17;
            case 21:
                return 18;
            case 22:
                return 19;
            case 23:
                return 20;
            case 24:
                return 21;
            case 25:
                return 25;
            case 26:
                return 26;
            case 27:
                return 27;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return 28;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return 29;
            case 30:
                return 31;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public final boolean b() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return false;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 30:
                return true;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public final boolean c() {
        switch (ordinal()) {
            case 16:
                if (aczv.as()) {
                    return false;
                }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return true;
            case 26:
            case 27:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return (aczv.ar() && hrp.a()) ? false : true;
            case 25:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return true;
            case 30:
                return !aczv.aq();
            default:
                throw new RuntimeException(null, null);
        }
    }
}
