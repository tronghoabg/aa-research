package eg;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f34710a = {71, 73};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f34711b = {Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 80};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f34712c = {255, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f34713d = {66, 77};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f34714e = {77, 77};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f34715f = {73, 73};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f34716g = {80, 55};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f34717h = {56, 66};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f34718i = {80, 49};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f34719j = {80, 52};
    public static final int[] k = {80, 50};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f34720l = {80, 53};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f34721m = {80, 51};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f34722n = {80, 54};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f34723o = {151, 74};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f34724p = {66, 50};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f34725q = {105, 99};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f34726r = {177, 104};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f34727s = {35, 63};

    public static boolean a(int[] iArr, int[] iArr2) {
        if (iArr.length == 2 || iArr2.length == 2) {
            return iArr[0] == iArr2[0] && iArr[1] == iArr2[1];
        }
        throw new IllegalArgumentException("Invalid Byte Pair.");
    }
}
