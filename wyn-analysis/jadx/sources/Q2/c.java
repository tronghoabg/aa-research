package Q2;

import Q1.k;
import Q1.o;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y3.C4552j;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: i, reason: collision with root package name */
    public final int f9759i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9760j;
    public final int k;

    /* renamed from: o, reason: collision with root package name */
    public List f9764o;

    /* renamed from: p, reason: collision with root package name */
    public List f9765p;

    /* renamed from: q, reason: collision with root package name */
    public int f9766q;

    /* renamed from: r, reason: collision with root package name */
    public int f9767r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9768s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9769t;

    /* renamed from: u, reason: collision with root package name */
    public byte f9770u;

    /* renamed from: v, reason: collision with root package name */
    public byte f9771v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9773x;

    /* renamed from: y, reason: collision with root package name */
    public long f9774y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f9757z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f9750A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f9751B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f9752C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 241, 9632};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f9753D = {174, 176, 189, 191, 8482, 162, 163, 9834, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f9754E = {193, 201, 211, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, Sdk.SDKError.Reason.AD_CONSUMED_VALUE, Sdk.SDKError.Reason.AD_IS_LOADING_VALUE, 235, Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE, Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 239, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f9755F = {195, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, 204, 236, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G, reason: collision with root package name */
    public static final boolean[] f9756G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    public final o f9758h = new o();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f9762m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public b f9763n = new b(0, 4);

    /* renamed from: w, reason: collision with root package name */
    public int f9772w = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f9761l = 16000000;

    public c(String str, int i5) {
        this.f9759i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i5 == 1) {
            this.k = 0;
            this.f9760j = 0;
        } else if (i5 == 2) {
            this.k = 1;
            this.f9760j = 0;
        } else if (i5 == 3) {
            this.k = 0;
            this.f9760j = 1;
        } else if (i5 != 4) {
            k.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.f9760j = 0;
        } else {
            this.k = 1;
            this.f9760j = 1;
        }
        l(0);
        k();
        this.f9773x = true;
        this.f9774y = -9223372036854775807L;
    }

    @Override // Q2.h
    public final C4552j f() {
        List list = this.f9764o;
        this.f9765p = list;
        list.getClass();
        return new C4552j(list, 21);
    }

    @Override // Q2.h, T1.b
    public final void flush() {
        super.flush();
        this.f9764o = null;
        this.f9765p = null;
        l(0);
        this.f9767r = 4;
        this.f9763n.f9749h = 4;
        k();
        this.f9768s = false;
        this.f9769t = false;
        this.f9770u = (byte) 0;
        this.f9771v = (byte) 0;
        this.f9772w = 0;
        this.f9773x = true;
        this.f9774y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // Q2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(Q2.g r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.c.g(Q2.g):void");
    }

    @Override // Q2.h, T1.b
    /* renamed from: h */
    public final P2.c b() {
        P2.c cVar;
        P2.c cVarB = super.b();
        if (cVarB != null) {
            return cVarB;
        }
        long j8 = this.f9761l;
        if (j8 == -9223372036854775807L) {
            return null;
        }
        long j10 = this.f9774y;
        if (j10 == -9223372036854775807L || this.f9821e - j10 < j8 || (cVar = (P2.c) this.f9818b.pollFirst()) == null) {
            return null;
        }
        this.f9764o = Collections.EMPTY_LIST;
        this.f9774y = -9223372036854775807L;
        C4552j c4552jF = f();
        long j11 = this.f9821e;
        cVar.f11363c = j11;
        cVar.f9062e = c4552jF;
        cVar.f9063f = j11;
        return cVar;
    }

    @Override // Q2.h
    public final boolean i() {
        return this.f9764o != this.f9765p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f9762m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i5 = 0; i5 < size; i5++) {
            P1.b bVarC = ((b) arrayList.get(i5)).c(Integer.MIN_VALUE);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.f9028i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            P1.b bVarC2 = (P1.b) arrayList2.get(i10);
            if (bVarC2 != null) {
                if (bVarC2.f9028i != iMin) {
                    bVarC2 = ((b) arrayList.get(i10)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f9763n;
        bVar.f9748g = this.f9766q;
        bVar.f9742a.clear();
        bVar.f9743b.clear();
        bVar.f9744c.setLength(0);
        bVar.f9745d = 15;
        bVar.f9746e = 0;
        bVar.f9747f = 0;
        ArrayList arrayList = this.f9762m;
        arrayList.clear();
        arrayList.add(this.f9763n);
    }

    public final void l(int i5) {
        int i10 = this.f9766q;
        if (i10 == i5) {
            return;
        }
        this.f9766q = i5;
        if (i5 != 3) {
            k();
            if (i10 == 3 || i5 == 1 || i5 == 0) {
                this.f9764o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f9762m;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i11)).f9748g = i5;
            i11++;
        }
    }

    @Override // Q2.h, T1.b
    public final void release() {
    }
}
