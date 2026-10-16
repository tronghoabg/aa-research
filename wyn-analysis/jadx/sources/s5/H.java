package s5;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f44960a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ H[] f44961b;

    /* JADX INFO: Fake field, exist only in values array */
    H EF5;

    static {
        H h10 = new H("UNKNOWN_MOBILE_SUBTYPE", 0);
        H h11 = new H("GPRS", 1);
        H h12 = new H("EDGE", 2);
        H h13 = new H("UMTS", 3);
        H h14 = new H("CDMA", 4);
        H h15 = new H("EVDO_0", 5);
        H h16 = new H("EVDO_A", 6);
        H h17 = new H("RTT", 7);
        H h18 = new H("HSDPA", 8);
        H h19 = new H("HSUPA", 9);
        H h20 = new H("HSPA", 10);
        H h21 = new H("IDEN", 11);
        H h22 = new H("EVDO_B", 12);
        H h23 = new H("LTE", 13);
        H h24 = new H("EHRPD", 14);
        H h25 = new H("HSPAP", 15);
        H h26 = new H("GSM", 16);
        H h27 = new H("TD_SCDMA", 17);
        H h28 = new H("IWLAN", 18);
        H h29 = new H("LTE_CA", 19);
        f44961b = new H[]{h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20, h21, h22, h23, h24, h25, h26, h27, h28, h29, new H("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f44960a = sparseArray;
        sparseArray.put(0, h10);
        sparseArray.put(1, h11);
        sparseArray.put(2, h12);
        sparseArray.put(3, h13);
        sparseArray.put(4, h14);
        sparseArray.put(5, h15);
        sparseArray.put(6, h16);
        sparseArray.put(7, h17);
        sparseArray.put(8, h18);
        sparseArray.put(9, h19);
        sparseArray.put(10, h20);
        sparseArray.put(11, h21);
        sparseArray.put(12, h22);
        sparseArray.put(13, h23);
        sparseArray.put(14, h24);
        sparseArray.put(15, h25);
        sparseArray.put(16, h26);
        sparseArray.put(17, h27);
        sparseArray.put(18, h28);
        sparseArray.put(19, h29);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f44961b.clone();
    }
}
