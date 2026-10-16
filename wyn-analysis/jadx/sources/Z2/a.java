package Z2;

import N1.C0764m;
import N1.C0765n;
import N1.D;
import Q1.x;
import U5.e;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import s2.C;
import s2.o;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f16932m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f16933n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final o f16934a;

    /* renamed from: b, reason: collision with root package name */
    public final C f16935b;

    /* renamed from: c, reason: collision with root package name */
    public final e f16936c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16937d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f16938e;

    /* renamed from: f, reason: collision with root package name */
    public final Q1.o f16939f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16940g;

    /* renamed from: h, reason: collision with root package name */
    public final C0765n f16941h;

    /* renamed from: i, reason: collision with root package name */
    public int f16942i;

    /* renamed from: j, reason: collision with root package name */
    public long f16943j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public long f16944l;

    public a(o oVar, C c10, e eVar) throws D {
        this.f16934a = oVar;
        this.f16935b = c10;
        this.f16936c = eVar;
        int i5 = eVar.f12340b;
        int iMax = Math.max(1, i5 / 10);
        this.f16940g = iMax;
        Q1.o oVar2 = new Q1.o(eVar.f12343e);
        oVar2.n();
        int iN = oVar2.n();
        this.f16937d = iN;
        int i10 = eVar.f12339a;
        int i11 = eVar.f12341c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (eVar.f12342d * i10)) + 1;
        if (iN != i12) {
            throw D.a(null, "Expected frames per block: " + i12 + "; got: " + iN);
        }
        int iF = x.f(iMax, iN);
        this.f16938e = new byte[iF * i11];
        this.f16939f = new Q1.o(iN * 2 * i10 * iF);
        int i13 = ((i11 * i5) * 8) / iN;
        C0764m c0764m = new C0764m();
        c0764m.f8194m = N1.C.m("audio/raw");
        c0764m.f8190h = i13;
        c0764m.f8191i = i13;
        c0764m.f8195n = iMax * 2 * i10;
        c0764m.f8173B = i10;
        c0764m.f8174C = i5;
        c0764m.f8175D = 2;
        this.f16941h = new C0765n(c0764m);
    }

    @Override // Z2.b
    public final void a(int i5, long j8) {
        this.f16934a.s(new d(this.f16936c, this.f16937d, i5, j8));
        this.f16935b.c(this.f16941h);
    }

    @Override // Z2.b
    public final void b(long j8) {
        this.f16942i = 0;
        this.f16943j = j8;
        this.k = 0;
        this.f16944l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // Z2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(s2.j r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.a.c(s2.j, long):boolean");
    }

    public final void d(int i5) {
        long j8 = this.f16943j;
        long j10 = this.f16944l;
        e eVar = this.f16936c;
        long j11 = eVar.f12340b;
        int i10 = x.f9724a;
        long jS = j8 + x.S(j10, 1000000L, j11, RoundingMode.DOWN);
        int i11 = i5 * 2 * eVar.f12339a;
        this.f16935b.a(jS, 1, i11, this.k - i11, null);
        this.f16944l += i5;
        this.k -= i11;
    }
}
