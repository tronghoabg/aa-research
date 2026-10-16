package i6;

import com.vungle.ads.internal.protos.Sdk;
import h6.C2783b;
import h6.C2785d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: h, reason: collision with root package name */
    public final int f36808h;

    /* renamed from: i, reason: collision with root package name */
    public final int f36809i;

    /* renamed from: j, reason: collision with root package name */
    public final int f36810j;

    /* renamed from: n, reason: collision with root package name */
    public List f36813n;

    /* renamed from: o, reason: collision with root package name */
    public List f36814o;

    /* renamed from: p, reason: collision with root package name */
    public int f36815p;

    /* renamed from: q, reason: collision with root package name */
    public int f36816q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f36817r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f36818s;

    /* renamed from: t, reason: collision with root package name */
    public byte f36819t;

    /* renamed from: u, reason: collision with root package name */
    public byte f36820u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f36822w;

    /* renamed from: x, reason: collision with root package name */
    public long f36823x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f36805y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f36806z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f36799A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f36800B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 241, 9632};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f36801C = {174, 176, 189, 191, 8482, 162, 163, 9834, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f36802D = {193, 201, 211, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, Sdk.SDKError.Reason.AD_CONSUMED_VALUE, Sdk.SDKError.Reason.AD_IS_LOADING_VALUE, 235, Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE, Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 239, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f36803E = {195, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, 204, 236, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F, reason: collision with root package name */
    public static final boolean[] f36804F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    public final Y4.b f36807g = new Y4.b();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f36811l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public C2852b f36812m = new C2852b(0, 4);

    /* renamed from: v, reason: collision with root package name */
    public int f36821v = 0;
    public final long k = 16000000;

    public c(String str, int i5) {
        this.f36808h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i5 == 1) {
            this.f36810j = 0;
            this.f36809i = 0;
        } else if (i5 == 2) {
            this.f36810j = 1;
            this.f36809i = 0;
        } else if (i5 == 3) {
            this.f36810j = 0;
            this.f36809i = 1;
        } else if (i5 != 4) {
            AbstractC4256a.E("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f36810j = 0;
            this.f36809i = 0;
        } else {
            this.f36810j = 1;
            this.f36809i = 1;
        }
        k(0);
        j();
        this.f36822w = true;
        this.f36823x = -9223372036854775807L;
    }

    @Override // i6.h
    public final i e() {
        List list = this.f36813n;
        this.f36814o = list;
        list.getClass();
        return new i(0, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // i6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(i6.g r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.c.f(i6.g):void");
    }

    @Override // i6.h, H5.d
    public final void flush() {
        super.flush();
        this.f36813n = null;
        this.f36814o = null;
        k(0);
        this.f36816q = 4;
        this.f36812m.f36798h = 4;
        j();
        this.f36817r = false;
        this.f36818s = false;
        this.f36819t = (byte) 0;
        this.f36820u = (byte) 0;
        this.f36821v = 0;
        this.f36822w = true;
        this.f36823x = -9223372036854775807L;
    }

    @Override // i6.h, H5.d
    /* renamed from: g */
    public final C2785d b() {
        C2785d c2785d;
        C2785d c2785dB = super.b();
        if (c2785dB != null) {
            return c2785dB;
        }
        long j8 = this.k;
        if (j8 == -9223372036854775807L) {
            return null;
        }
        long j10 = this.f36823x;
        if (j10 == -9223372036854775807L || this.f36872e - j10 < j8 || (c2785d = (C2785d) this.f36869b.pollFirst()) == null) {
            return null;
        }
        this.f36813n = Collections.EMPTY_LIST;
        this.f36823x = -9223372036854775807L;
        c2785d.q(this.f36872e, e(), Long.MAX_VALUE);
        return c2785d;
    }

    @Override // i6.h
    public final boolean h() {
        return this.f36813n != this.f36814o;
    }

    public final ArrayList i() {
        ArrayList arrayList = this.f36811l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i5 = 0; i5 < size; i5++) {
            C2783b c2783bC = ((C2852b) arrayList.get(i5)).c(Integer.MIN_VALUE);
            arrayList2.add(c2783bC);
            if (c2783bC != null) {
                iMin = Math.min(iMin, c2783bC.f36176i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            C2783b c2783bC2 = (C2783b) arrayList2.get(i10);
            if (c2783bC2 != null) {
                if (c2783bC2.f36176i != iMin) {
                    c2783bC2 = ((C2852b) arrayList.get(i10)).c(iMin);
                    c2783bC2.getClass();
                }
                arrayList3.add(c2783bC2);
            }
        }
        return arrayList3;
    }

    public final void j() {
        C2852b c2852b = this.f36812m;
        c2852b.f36797g = this.f36815p;
        c2852b.f36791a.clear();
        c2852b.f36792b.clear();
        c2852b.f36793c.setLength(0);
        c2852b.f36794d = 15;
        c2852b.f36795e = 0;
        c2852b.f36796f = 0;
        ArrayList arrayList = this.f36811l;
        arrayList.clear();
        arrayList.add(this.f36812m);
    }

    public final void k(int i5) {
        int i10 = this.f36815p;
        if (i10 == i5) {
            return;
        }
        this.f36815p = i5;
        if (i5 != 3) {
            j();
            if (i10 == 3 || i5 == 1 || i5 == 0) {
                this.f36813n = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f36811l;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((C2852b) arrayList.get(i11)).f36797g = i5;
            i11++;
        }
    }

    @Override // i6.h, H5.d
    public final void release() {
    }
}
