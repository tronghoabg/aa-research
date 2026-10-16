package s5;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f44962a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ I[] f44963b;

    /* JADX INFO: Fake field, exist only in values array */
    I EF3;

    static {
        I i5 = new I("MOBILE", 0);
        I i10 = new I("WIFI", 1);
        I i11 = new I("MOBILE_MMS", 2);
        I i12 = new I("MOBILE_SUPL", 3);
        I i13 = new I("MOBILE_DUN", 4);
        I i14 = new I("MOBILE_HIPRI", 5);
        I i15 = new I("WIMAX", 6);
        I i16 = new I("BLUETOOTH", 7);
        I i17 = new I("DUMMY", 8);
        I i18 = new I("ETHERNET", 9);
        I i19 = new I("MOBILE_FOTA", 10);
        I i20 = new I("MOBILE_IMS", 11);
        I i21 = new I("MOBILE_CBS", 12);
        I i22 = new I("WIFI_P2P", 13);
        I i23 = new I("MOBILE_IA", 14);
        I i24 = new I("MOBILE_EMERGENCY", 15);
        I i25 = new I("PROXY", 16);
        I i26 = new I("VPN", 17);
        I i27 = new I("NONE", 18);
        f44963b = new I[]{i5, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27};
        SparseArray sparseArray = new SparseArray();
        f44962a = sparseArray;
        sparseArray.put(0, i5);
        sparseArray.put(1, i10);
        sparseArray.put(2, i11);
        sparseArray.put(3, i12);
        sparseArray.put(4, i13);
        sparseArray.put(5, i14);
        sparseArray.put(6, i15);
        sparseArray.put(7, i16);
        sparseArray.put(8, i17);
        sparseArray.put(9, i18);
        sparseArray.put(10, i19);
        sparseArray.put(11, i20);
        sparseArray.put(12, i21);
        sparseArray.put(13, i22);
        sparseArray.put(14, i23);
        sparseArray.put(15, i24);
        sparseArray.put(16, i25);
        sparseArray.put(17, i26);
        sparseArray.put(-1, i27);
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f44963b.clone();
    }
}
