package P5;

import A.C0230x;
import E5.o0;
import J5.h;
import J5.k;
import J5.n;
import J5.w;
import J5.x;
import Q1.l;
import android.util.SparseArray;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import f6.C2584N;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k8.AbstractC3198g;
import org.apache.tika.fork.ForkServer;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public final class c implements k {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f9196c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f9197d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f9198e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f9199f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f9200g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final Map f9201h0;

    /* renamed from: A, reason: collision with root package name */
    public long f9202A;

    /* renamed from: B, reason: collision with root package name */
    public long f9203B;

    /* renamed from: C, reason: collision with root package name */
    public l f9204C;

    /* renamed from: D, reason: collision with root package name */
    public l f9205D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9206E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9207F;

    /* renamed from: G, reason: collision with root package name */
    public int f9208G;

    /* renamed from: H, reason: collision with root package name */
    public long f9209H;

    /* renamed from: I, reason: collision with root package name */
    public long f9210I;

    /* renamed from: J, reason: collision with root package name */
    public int f9211J;

    /* renamed from: K, reason: collision with root package name */
    public int f9212K;
    public int[] L;

    /* renamed from: M, reason: collision with root package name */
    public int f9213M;

    /* renamed from: N, reason: collision with root package name */
    public int f9214N;

    /* renamed from: O, reason: collision with root package name */
    public int f9215O;

    /* renamed from: P, reason: collision with root package name */
    public int f9216P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f9217Q;

    /* renamed from: R, reason: collision with root package name */
    public long f9218R;

    /* renamed from: S, reason: collision with root package name */
    public int f9219S;

    /* renamed from: T, reason: collision with root package name */
    public int f9220T;

    /* renamed from: U, reason: collision with root package name */
    public int f9221U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f9222V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f9223W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f9224X;

    /* renamed from: Y, reason: collision with root package name */
    public int f9225Y;

    /* renamed from: Z, reason: collision with root package name */
    public byte f9226Z;

    /* renamed from: a, reason: collision with root package name */
    public final K2.b f9227a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f9228a0;

    /* renamed from: b, reason: collision with root package name */
    public final d f9229b;

    /* renamed from: b0, reason: collision with root package name */
    public C2584N f9230b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f9231c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9232d;

    /* renamed from: e, reason: collision with root package name */
    public final Y4.b f9233e;

    /* renamed from: f, reason: collision with root package name */
    public final Y4.b f9234f;

    /* renamed from: g, reason: collision with root package name */
    public final Y4.b f9235g;

    /* renamed from: h, reason: collision with root package name */
    public final Y4.b f9236h;

    /* renamed from: i, reason: collision with root package name */
    public final Y4.b f9237i;

    /* renamed from: j, reason: collision with root package name */
    public final Y4.b f9238j;
    public final Y4.b k;

    /* renamed from: l, reason: collision with root package name */
    public final Y4.b f9239l;

    /* renamed from: m, reason: collision with root package name */
    public final Y4.b f9240m;

    /* renamed from: n, reason: collision with root package name */
    public final Y4.b f9241n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f9242o;

    /* renamed from: p, reason: collision with root package name */
    public long f9243p;

    /* renamed from: q, reason: collision with root package name */
    public long f9244q;

    /* renamed from: r, reason: collision with root package name */
    public long f9245r;

    /* renamed from: s, reason: collision with root package name */
    public long f9246s;

    /* renamed from: t, reason: collision with root package name */
    public long f9247t;

    /* renamed from: u, reason: collision with root package name */
    public b f9248u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9249v;

    /* renamed from: w, reason: collision with root package name */
    public int f9250w;

    /* renamed from: x, reason: collision with root package name */
    public long f9251x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9252y;

    /* renamed from: z, reason: collision with root package name */
    public long f9253z;

    static {
        int i5 = v.f46721a;
        f9197d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AbstractC3198g.f39301c);
        f9198e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f9199f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f9200g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        N0.a.p(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        N0.a.p(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f9201h0 = DesugarCollections.unmodifiableMap(map);
    }

    public c() {
        K2.b bVar = new K2.b(1);
        this.f9244q = -1L;
        this.f9245r = -9223372036854775807L;
        this.f9246s = -9223372036854775807L;
        this.f9247t = -9223372036854775807L;
        this.f9253z = -1L;
        this.f9202A = -1L;
        this.f9203B = -9223372036854775807L;
        this.f9227a = bVar;
        bVar.f6340g = new xa.d(this, 20);
        this.f9232d = true;
        this.f9229b = new d();
        this.f9231c = new SparseArray();
        this.f9235g = new Y4.b(4);
        this.f9236h = new Y4.b(ByteBuffer.allocate(4).putInt(-1).array());
        this.f9237i = new Y4.b(4);
        this.f9233e = new Y4.b(AbstractC4256a.f46662d);
        this.f9234f = new Y4.b(4);
        this.f9238j = new Y4.b();
        this.k = new Y4.b();
        this.f9239l = new Y4.b(8);
        this.f9240m = new Y4.b();
        this.f9241n = new Y4.b();
        this.L = new int[1];
    }

    public static byte[] e(long j8, long j10, String str) {
        AbstractC4256a.e(j8 != -9223372036854775807L);
        int i5 = (int) (j8 / 3600000000L);
        long j11 = j8 - (i5 * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        long j12 = j11 - (i10 * 60000000);
        int i11 = (int) (j12 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (i11 * 1000000)) / j10)));
        int i12 = v.f46721a;
        return str2.getBytes(AbstractC3198g.f39301c);
    }

    @Override // J5.k
    public final void a(long j8, long j10) {
        this.f9203B = -9223372036854775807L;
        this.f9208G = 0;
        K2.b bVar = this.f9227a;
        bVar.f6336c = 0;
        bVar.f6335b.clear();
        d dVar = (d) bVar.f6339f;
        dVar.f9256b = 0;
        dVar.f9257c = 0;
        d dVar2 = this.f9229b;
        dVar2.f9256b = 0;
        dVar2.f9257c = 0;
        k();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f9231c;
            if (i5 >= sparseArray.size()) {
                return;
            }
            x xVar = ((b) sparseArray.valueAt(i5)).f9165T;
            if (xVar != null) {
                xVar.f5688b = false;
                xVar.f5689c = 0;
            }
            i5++;
        }
    }

    public final void b(int i5) {
        if (this.f9204C == null || this.f9205D == null) {
            throw o0.a("Element " + i5 + " must be in a Cues", null);
        }
    }

    public final void c(int i5) {
        if (this.f9248u != null) {
            return;
        }
        throw o0.a("Element " + i5 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(P5.b r23, long r24, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.c.d(P5.b, long, int, int, int):void");
    }

    public final boolean f(n nVar, long j8) {
        if (this.f9252y) {
            this.f9202A = j8;
            nVar.f5655a = this.f9253z;
            this.f9252y = false;
            return true;
        }
        if (this.f9249v) {
            long j10 = this.f9202A;
            if (j10 != -1) {
                nVar.f5655a = j10;
                this.f9202A = -1L;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:664:0x0dce, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04b0 A[PHI: r38
  0x04b0: PHI (r38v44 java.lang.String) = 
  (r38v10 java.lang.String)
  (r38v11 java.lang.String)
  (r38v12 java.lang.String)
  (r38v13 java.lang.String)
  (r38v14 java.lang.String)
  (r38v15 java.lang.String)
  (r38v16 java.lang.String)
  (r38v17 java.lang.String)
  (r38v18 java.lang.String)
  (r38v19 java.lang.String)
  (r38v20 java.lang.String)
  (r38v21 java.lang.String)
  (r38v22 java.lang.String)
  (r38v23 java.lang.String)
  (r38v24 java.lang.String)
  (r38v25 java.lang.String)
  (r38v26 java.lang.String)
  (r38v27 java.lang.String)
  (r38v28 java.lang.String)
  (r38v29 java.lang.String)
  (r38v30 java.lang.String)
  (r38v31 java.lang.String)
  (r38v32 java.lang.String)
  (r38v33 java.lang.String)
  (r38v34 java.lang.String)
  (r38v35 java.lang.String)
  (r38v36 java.lang.String)
  (r38v37 java.lang.String)
  (r38v38 java.lang.String)
  (r38v39 java.lang.String)
  (r38v40 java.lang.String)
  (r38v41 java.lang.String)
  (r38v45 java.lang.String)
 binds: [B:369:0x069a, B:365:0x068f, B:361:0x0683, B:357:0x0678, B:353:0x066d, B:349:0x0662, B:345:0x0655, B:341:0x0648, B:337:0x0638, B:333:0x0628, B:329:0x0618, B:325:0x0608, B:321:0x05f8, B:317:0x05e8, B:313:0x05d8, B:309:0x05c8, B:305:0x05b8, B:301:0x05a8, B:297:0x0598, B:293:0x0588, B:289:0x0578, B:285:0x0568, B:281:0x0558, B:277:0x0548, B:273:0x0538, B:269:0x0528, B:265:0x0518, B:261:0x0508, B:257:0x04f8, B:253:0x04e8, B:249:0x04d8, B:245:0x04c8, B:238:0x04ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0afe  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0251 A[PHI: r5 r8 r13
  0x0251: PHI (r5v188 java.lang.String) = (r5v14 java.lang.String), (r5v15 java.lang.String), (r5v189 java.lang.String) binds: [B:230:0x046b, B:226:0x045b, B:97:0x024d] A[DONT_GENERATE, DONT_INLINE]
  0x0251: PHI (r8v106 java.lang.String) = (r8v15 java.lang.String), (r8v16 java.lang.String), (r8v107 java.lang.String) binds: [B:230:0x046b, B:226:0x045b, B:97:0x024d] A[DONT_GENERATE, DONT_INLINE]
  0x0251: PHI (r13v19 java.lang.String) = (r13v6 java.lang.String), (r13v7 java.lang.String), (r13v20 java.lang.String) binds: [B:230:0x046b, B:226:0x045b, B:97:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v80, types: [J5.h, J5.l] */
    /* JADX WARN: Type inference failed for: r11v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v5, types: [P5.d] */
    @Override // J5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(J5.l r51, J5.n r52) throws E5.o0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 5470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.c.g(J5.l, J5.n):int");
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f9230b0 = c2584n;
    }

    @Override // J5.k
    public final boolean i(J5.l lVar) throws EOFException, InterruptedIOException {
        C0230x c0230x = new C0230x((byte) 0, 7);
        h hVar = (h) lVar;
        long j8 = hVar.f5645c;
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (j8 != -1 && j8 <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = j8;
        }
        int i5 = (int) j10;
        Y4.b bVar = (Y4.b) c0230x.f188c;
        hVar.c(bVar.f16679a, 0, 4, false);
        long jR = bVar.r();
        c0230x.f187b = 4;
        while (true) {
            if (jR != 440786851) {
                int i10 = c0230x.f187b + 1;
                c0230x.f187b = i10;
                if (i10 == i5) {
                    break;
                }
                hVar.c(bVar.f16679a, 0, 1, false);
                jR = ((jR << 8) & (-256)) | (bVar.f16679a[0] & ForkServer.ERROR);
            } else {
                long jW = c0230x.w(hVar);
                long j11 = c0230x.f187b;
                if (jW != Long.MIN_VALUE && (j8 == -1 || j11 + jW < j8)) {
                    while (true) {
                        long j12 = c0230x.f187b;
                        long j13 = j11 + jW;
                        if (j12 < j13) {
                            if (c0230x.w(hVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long jW2 = c0230x.w(hVar);
                            if (jW2 < 0 || jW2 > 2147483647L) {
                                break;
                            }
                            if (jW2 != 0) {
                                int i11 = (int) jW2;
                                hVar.b(i11, false);
                                c0230x.f187b += i11;
                            }
                        } else if (j12 == j13) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void j(h hVar, int i5) {
        Y4.b bVar = this.f9235g;
        if (bVar.f16681c >= i5) {
            return;
        }
        byte[] bArr = bVar.f16679a;
        if (bArr.length < i5) {
            bVar.b(Math.max(bArr.length * 2, i5));
        }
        byte[] bArr2 = bVar.f16679a;
        int i10 = bVar.f16681c;
        hVar.f(bArr2, i10, i5 - i10, false);
        bVar.z(i5);
    }

    public final void k() {
        this.f9219S = 0;
        this.f9220T = 0;
        this.f9221U = 0;
        this.f9222V = false;
        this.f9223W = false;
        this.f9224X = false;
        this.f9225Y = 0;
        this.f9226Z = (byte) 0;
        this.f9228a0 = false;
        this.f9238j.x(0);
    }

    public final long l(long j8) throws o0 {
        long j10 = this.f9245r;
        if (j10 != -9223372036854775807L) {
            return v.D(j8, j10, 1000L);
        }
        throw o0.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int m(h hVar, b bVar, int i5, boolean z2) throws o0, EOFException, InterruptedIOException {
        int iD;
        int iD2;
        int i10;
        if ("S_TEXT/UTF8".equals(bVar.f9172b)) {
            n(hVar, f9196c0, i5);
            int i11 = this.f9220T;
            k();
            return i11;
        }
        if ("S_TEXT/ASS".equals(bVar.f9172b)) {
            n(hVar, f9198e0, i5);
            int i12 = this.f9220T;
            k();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(bVar.f9172b)) {
            n(hVar, f9199f0, i5);
            int i13 = this.f9220T;
            k();
            return i13;
        }
        w wVar = bVar.f9169X;
        boolean z10 = this.f9222V;
        Y4.b bVar2 = this.f9238j;
        if (!z10) {
            boolean z11 = bVar.f9178h;
            Y4.b bVar3 = this.f9235g;
            if (z11) {
                this.f9215O &= -1073741825;
                if (!this.f9223W) {
                    hVar.f(bVar3.f16679a, 0, 1, false);
                    this.f9219S++;
                    byte b5 = bVar3.f16679a[0];
                    if ((b5 & 128) == 128) {
                        throw o0.a("Extension bit is set in signal byte", null);
                    }
                    this.f9226Z = b5;
                    this.f9223W = true;
                }
                byte b10 = this.f9226Z;
                if ((b10 & 1) == 1) {
                    boolean z12 = (b10 & 2) == 2;
                    this.f9215O |= 1073741824;
                    if (!this.f9228a0) {
                        Y4.b bVar4 = this.f9239l;
                        hVar.f(bVar4.f16679a, 0, 8, false);
                        this.f9219S += 8;
                        this.f9228a0 = true;
                        bVar3.f16679a[0] = (byte) ((z12 ? 128 : 0) | 8);
                        bVar3.A(0);
                        wVar.e(1, bVar3);
                        this.f9220T++;
                        bVar4.A(0);
                        wVar.e(8, bVar4);
                        this.f9220T += 8;
                    }
                    if (z12) {
                        if (!this.f9224X) {
                            hVar.f(bVar3.f16679a, 0, 1, false);
                            this.f9219S++;
                            bVar3.A(0);
                            this.f9225Y = bVar3.q();
                            this.f9224X = true;
                        }
                        int i14 = this.f9225Y * 4;
                        bVar3.x(i14);
                        hVar.f(bVar3.f16679a, 0, i14, false);
                        this.f9219S += i14;
                        short s10 = (short) ((this.f9225Y / 2) + 1);
                        int i15 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f9242o;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.f9242o = ByteBuffer.allocate(i15);
                        }
                        this.f9242o.position(0);
                        this.f9242o.putShort(s10);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i10 = this.f9225Y;
                            if (i16 >= i10) {
                                break;
                            }
                            int iT = bVar3.t();
                            if (i16 % 2 == 0) {
                                this.f9242o.putShort((short) (iT - i17));
                            } else {
                                this.f9242o.putInt(iT - i17);
                            }
                            i16++;
                            i17 = iT;
                        }
                        int i18 = (i5 - this.f9219S) - i17;
                        if (i10 % 2 == 1) {
                            this.f9242o.putInt(i18);
                        } else {
                            this.f9242o.putShort((short) i18);
                            this.f9242o.putInt(0);
                        }
                        byte[] bArrArray = this.f9242o.array();
                        Y4.b bVar5 = this.f9240m;
                        bVar5.y(i15, bArrArray);
                        wVar.e(i15, bVar5);
                        this.f9220T += i15;
                    }
                }
            } else {
                byte[] bArr = bVar.f9179i;
                if (bArr != null) {
                    bVar2.y(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(bVar.f9172b) ? z2 : bVar.f9176f > 0) {
                this.f9215O |= 268435456;
                this.f9241n.x(0);
                int i19 = (bVar2.f16681c + i5) - this.f9219S;
                bVar3.x(4);
                byte[] bArr2 = bVar3.f16679a;
                bArr2[0] = (byte) ((i19 >> 24) & 255);
                bArr2[1] = (byte) ((i19 >> 16) & 255);
                bArr2[2] = (byte) ((i19 >> 8) & 255);
                bArr2[3] = (byte) (i19 & 255);
                wVar.e(4, bVar3);
                this.f9220T += 4;
            }
            this.f9222V = true;
        }
        int i20 = i5 + bVar2.f16681c;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.f9172b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f9172b)) {
            if (bVar.f9165T != null) {
                AbstractC4256a.i(bVar2.f16681c == 0);
                bVar.f9165T.e(hVar);
            }
            while (true) {
                int i21 = this.f9219S;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                int iA = bVar2.a();
                if (iA > 0) {
                    iD2 = Math.min(i22, iA);
                    wVar.c(iD2, bVar2);
                } else {
                    iD2 = wVar.d(hVar, i22, false);
                }
                this.f9219S += iD2;
                this.f9220T += iD2;
            }
        } else {
            Y4.b bVar6 = this.f9234f;
            byte[] bArr3 = bVar6.f16679a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i23 = bVar.f9170Y;
            int i24 = 4 - i23;
            while (this.f9219S < i20) {
                int i25 = this.f9221U;
                if (i25 == 0) {
                    int iMin = Math.min(i23, bVar2.a());
                    hVar.f(bArr3, i24 + iMin, i23 - iMin, false);
                    if (iMin > 0) {
                        bVar2.c(i24, iMin, bArr3);
                    }
                    this.f9219S += i23;
                    bVar6.A(0);
                    this.f9221U = bVar6.t();
                    Y4.b bVar7 = this.f9233e;
                    bVar7.A(0);
                    wVar.c(4, bVar7);
                    this.f9220T += 4;
                } else {
                    int iA2 = bVar2.a();
                    if (iA2 > 0) {
                        iD = Math.min(i25, iA2);
                        wVar.c(iD, bVar2);
                    } else {
                        iD = wVar.d(hVar, i25, false);
                    }
                    this.f9219S += iD;
                    this.f9220T += iD;
                    this.f9221U -= iD;
                }
            }
        }
        if ("A_VORBIS".equals(bVar.f9172b)) {
            Y4.b bVar8 = this.f9236h;
            bVar8.A(0);
            wVar.c(4, bVar8);
            this.f9220T += 4;
        }
        int i26 = this.f9220T;
        k();
        return i26;
    }

    public final void n(h hVar, byte[] bArr, int i5) throws EOFException, InterruptedIOException {
        int length = bArr.length + i5;
        Y4.b bVar = this.k;
        byte[] bArr2 = bVar.f16679a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i5);
            bVar.y(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        hVar.f(bVar.f16679a, bArr.length, i5, false);
        bVar.A(0);
        bVar.z(length);
    }

    @Override // J5.k
    public final void release() {
    }
}
