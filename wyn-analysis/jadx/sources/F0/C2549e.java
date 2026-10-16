package f0;

import com.unity3d.services.UnityAdsConstants;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2549e {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f34744a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f34745b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f34746c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f34747d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f34748e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f34749f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f34750g;

    /* renamed from: h, reason: collision with root package name */
    public static final n f34751h;

    /* renamed from: i, reason: collision with root package name */
    public static final n f34752i;

    /* renamed from: j, reason: collision with root package name */
    public static final n f34753j;
    public static final n k;

    /* renamed from: l, reason: collision with root package name */
    public static final n f34754l;

    /* renamed from: m, reason: collision with root package name */
    public static final n f34755m;

    /* renamed from: n, reason: collision with root package name */
    public static final n f34756n;

    /* renamed from: o, reason: collision with root package name */
    public static final n f34757o;

    /* renamed from: p, reason: collision with root package name */
    public static final n f34758p;

    /* renamed from: q, reason: collision with root package name */
    public static final i f34759q;

    /* renamed from: r, reason: collision with root package name */
    public static final i f34760r;

    /* renamed from: s, reason: collision with root package name */
    public static final n f34761s;

    /* renamed from: t, reason: collision with root package name */
    public static final AbstractC2547c[] f34762t;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f34744a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f34745b = fArr2;
        o oVar = new o(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        o oVar2 = new o(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        p pVar = h.f34769d;
        n nVar = new n("sRGB IEC61966-2.1", fArr, pVar, oVar, 0);
        f34746c = nVar;
        n nVar2 = new n("sRGB IEC61966-2.1 (Linear)", fArr, pVar, 1.0d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1);
        f34747d = nVar2;
        n nVar3 = new n("scRGB-nl IEC 61966-2-2:2003", fArr, pVar, null, C2548d.f34741j, C2548d.k, -0.799f, 2.399f, oVar, 2);
        f34748e = nVar3;
        n nVar4 = new n("scRGB IEC 61966-2-2:2003", fArr, pVar, 1.0d, -0.5f, 7.499f, 3);
        f34749f = nVar4;
        n nVar5 = new n("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, pVar, new o(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f34750g = nVar5;
        n nVar6 = new n("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, pVar, new o(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f34751h = nVar6;
        n nVar7 = new n("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new p(0.314f, 0.351f), 2.6d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 6);
        f34752i = nVar7;
        n nVar8 = new n("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, pVar, oVar, 7);
        f34753j = nVar8;
        n nVar9 = new n("NTSC (1953)", fArr2, h.f34766a, new o(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        k = nVar9;
        n nVar10 = new n("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, pVar, new o(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f34754l = nVar10;
        n nVar11 = new n("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, pVar, 2.2d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 10);
        f34755m = nVar11;
        n nVar12 = new n("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, h.f34767b, new o(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f34756n = nVar12;
        float[] fArr3 = {0.7347f, 0.2653f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0E-4f, -0.077f};
        p pVar2 = h.f34768c;
        n nVar13 = new n("SMPTE ST 2065-1:2012 ACES", fArr3, pVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f34757o = nVar13;
        n nVar14 = new n("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, pVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f34758p = nVar14;
        i iVar = new i(14, AbstractC2546b.f34734b, 1, "Generic XYZ");
        f34759q = iVar;
        long j8 = AbstractC2546b.f34735c;
        i iVar2 = new i(15, j8, 0, "Generic L*a*b*");
        f34760r = iVar2;
        n nVar15 = new n(OfficeOpenXMLExtended.SECURITY_NONE, fArr, pVar, oVar2, 16);
        f34761s = nVar15;
        f34762t = new AbstractC2547c[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12, nVar13, nVar14, iVar, iVar2, nVar15, new j("Oklab", j8, 17)};
    }
}
