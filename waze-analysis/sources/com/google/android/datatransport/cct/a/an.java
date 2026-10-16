package com.google.android.datatransport.cct.a;

import android.util.SparseArray;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum an {
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17),
    NONE(-1);

    private static final SparseArray t;
    private final int v;

    static {
        an anVar = MOBILE;
        an anVar2 = WIFI;
        an anVar3 = MOBILE_MMS;
        an anVar4 = MOBILE_SUPL;
        an anVar5 = MOBILE_DUN;
        an anVar6 = MOBILE_HIPRI;
        an anVar7 = WIMAX;
        an anVar8 = BLUETOOTH;
        an anVar9 = DUMMY;
        an anVar10 = ETHERNET;
        an anVar11 = MOBILE_FOTA;
        an anVar12 = MOBILE_IMS;
        an anVar13 = MOBILE_CBS;
        an anVar14 = WIFI_P2P;
        an anVar15 = MOBILE_IA;
        an anVar16 = MOBILE_EMERGENCY;
        an anVar17 = PROXY;
        an anVar18 = VPN;
        an anVar19 = NONE;
        SparseArray sparseArray = new SparseArray();
        t = sparseArray;
        sparseArray.put(0, anVar);
        sparseArray.put(1, anVar2);
        sparseArray.put(2, anVar3);
        sparseArray.put(3, anVar4);
        sparseArray.put(4, anVar5);
        sparseArray.put(5, anVar6);
        sparseArray.put(6, anVar7);
        sparseArray.put(7, anVar8);
        sparseArray.put(8, anVar9);
        sparseArray.put(9, anVar10);
        sparseArray.put(10, anVar11);
        sparseArray.put(11, anVar12);
        sparseArray.put(12, anVar13);
        sparseArray.put(13, anVar14);
        sparseArray.put(14, anVar15);
        sparseArray.put(15, anVar16);
        sparseArray.put(16, anVar17);
        sparseArray.put(17, anVar18);
        sparseArray.put(-1, anVar19);
    }

    an(int i2) {
        this.v = i2;
    }

    public static an b(int i2) {
        return (an) t.get(i2);
    }

    public final int a() {
        return this.v;
    }
}
