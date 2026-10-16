package com.google.android.datatransport.cct.a;

import android.util.SparseArray;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum am {
    UNKNOWN_MOBILE_SUBTYPE(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    RTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18),
    LTE_CA(19),
    COMBINED(100);

    private static final SparseArray v;
    private final int x;

    static {
        am amVar = UNKNOWN_MOBILE_SUBTYPE;
        am amVar2 = GPRS;
        am amVar3 = EDGE;
        am amVar4 = UMTS;
        am amVar5 = CDMA;
        am amVar6 = EVDO_0;
        am amVar7 = EVDO_A;
        am amVar8 = RTT;
        am amVar9 = HSDPA;
        am amVar10 = HSUPA;
        am amVar11 = HSPA;
        am amVar12 = IDEN;
        am amVar13 = EVDO_B;
        am amVar14 = LTE;
        am amVar15 = EHRPD;
        am amVar16 = HSPAP;
        am amVar17 = GSM;
        am amVar18 = TD_SCDMA;
        am amVar19 = IWLAN;
        am amVar20 = LTE_CA;
        SparseArray sparseArray = new SparseArray();
        v = sparseArray;
        sparseArray.put(0, amVar);
        sparseArray.put(1, amVar2);
        sparseArray.put(2, amVar3);
        sparseArray.put(3, amVar4);
        sparseArray.put(4, amVar5);
        sparseArray.put(5, amVar6);
        sparseArray.put(6, amVar7);
        sparseArray.put(7, amVar8);
        sparseArray.put(8, amVar9);
        sparseArray.put(9, amVar10);
        sparseArray.put(10, amVar11);
        sparseArray.put(11, amVar12);
        sparseArray.put(12, amVar13);
        sparseArray.put(13, amVar14);
        sparseArray.put(14, amVar15);
        sparseArray.put(15, amVar16);
        sparseArray.put(16, amVar17);
        sparseArray.put(17, amVar18);
        sparseArray.put(18, amVar19);
        sparseArray.put(19, amVar20);
    }

    am(int i2) {
        this.x = i2;
    }

    public static am b(int i2) {
        return (am) v.get(i2);
    }

    public final int a() {
        return this.x;
    }
}
