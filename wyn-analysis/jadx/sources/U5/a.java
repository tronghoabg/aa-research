package U5;

import E5.S;
import E5.T;
import E5.o0;
import J5.w;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import f6.C2584N;
import u6.v;

/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f12310m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f12311n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final C2584N f12312a;

    /* renamed from: b, reason: collision with root package name */
    public final w f12313b;

    /* renamed from: c, reason: collision with root package name */
    public final e f12314c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12315d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f12316e;

    /* renamed from: f, reason: collision with root package name */
    public final Y4.b f12317f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12318g;

    /* renamed from: h, reason: collision with root package name */
    public final T f12319h;

    /* renamed from: i, reason: collision with root package name */
    public int f12320i;

    /* renamed from: j, reason: collision with root package name */
    public long f12321j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public long f12322l;

    public a(C2584N c2584n, w wVar, e eVar) throws o0 {
        this.f12312a = c2584n;
        this.f12313b = wVar;
        this.f12314c = eVar;
        int i5 = eVar.f12340b;
        int iMax = Math.max(1, i5 / 10);
        this.f12318g = iMax;
        byte[] bArr = eVar.f12343e;
        int length = bArr.length;
        byte b5 = bArr[0];
        byte b10 = bArr[1];
        int i10 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.f12315d = i10;
        int i11 = eVar.f12339a;
        int i12 = eVar.f12341c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (eVar.f12342d * i11)) + 1;
        if (i10 != i13) {
            throw o0.a("Expected frames per block: " + i13 + "; got: " + i10, null);
        }
        int iF = v.f(iMax, i10);
        this.f12316e = new byte[iF * i12];
        this.f12317f = new Y4.b(i10 * 2 * i11 * iF);
        int i14 = ((i12 * i5) * 8) / i10;
        S s10 = new S();
        s10.k = "audio/raw";
        s10.f3200f = i14;
        s10.f3201g = i14;
        s10.f3205l = iMax * 2 * i11;
        s10.f3217x = i11;
        s10.f3218y = i5;
        s10.f3219z = 2;
        this.f12319h = new T(s10);
    }

    @Override // U5.b
    public final void a(int i5, long j8) {
        this.f12312a.x(new g(this.f12314c, this.f12315d, i5, j8));
        this.f12313b.a(this.f12319h);
    }

    @Override // U5.b
    public final void b(long j8) {
        this.f12320i = 0;
        this.f12321j = j8;
        this.k = 0;
        this.f12322l = 0L;
    }

    public final void c(int i5) {
        long j8 = this.f12321j;
        long j10 = this.f12322l;
        e eVar = this.f12314c;
        long jD = j8 + v.D(j10, 1000000L, eVar.f12340b);
        int i10 = i5 * 2 * eVar.f12339a;
        this.f12313b.b(jD, 1, i10, this.k - i10, null);
        this.f12322l += i5;
        this.k -= i10;
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
    @Override // U5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(J5.h r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.a.d(J5.h, long):boolean");
    }
}
