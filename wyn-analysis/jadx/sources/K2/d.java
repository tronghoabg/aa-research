package K2;

import A.C0230x;
import A.e0;
import N1.D;
import P2.j;
import Q1.k;
import Q1.l;
import Q1.x;
import R1.n;
import android.util.SparseArray;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import l8.AbstractC3409K;
import l8.C3407I;
import org.apache.tika.fork.ForkServer;
import s2.C;
import s2.m;
import s2.o;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f6391e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f6392f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f6393g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f6394h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final UUID f6395i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final Map f6396j0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f6397A;

    /* renamed from: B, reason: collision with root package name */
    public long f6398B;

    /* renamed from: C, reason: collision with root package name */
    public long f6399C;

    /* renamed from: D, reason: collision with root package name */
    public long f6400D;

    /* renamed from: E, reason: collision with root package name */
    public l f6401E;

    /* renamed from: F, reason: collision with root package name */
    public l f6402F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6403G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6404H;

    /* renamed from: I, reason: collision with root package name */
    public int f6405I;

    /* renamed from: J, reason: collision with root package name */
    public long f6406J;

    /* renamed from: K, reason: collision with root package name */
    public long f6407K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public int f6408M;

    /* renamed from: N, reason: collision with root package name */
    public int[] f6409N;

    /* renamed from: O, reason: collision with root package name */
    public int f6410O;

    /* renamed from: P, reason: collision with root package name */
    public int f6411P;

    /* renamed from: Q, reason: collision with root package name */
    public int f6412Q;

    /* renamed from: R, reason: collision with root package name */
    public int f6413R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f6414S;

    /* renamed from: T, reason: collision with root package name */
    public long f6415T;

    /* renamed from: U, reason: collision with root package name */
    public int f6416U;

    /* renamed from: V, reason: collision with root package name */
    public int f6417V;

    /* renamed from: W, reason: collision with root package name */
    public int f6418W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f6419X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f6420Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f6421Z;

    /* renamed from: a, reason: collision with root package name */
    public final b f6422a;

    /* renamed from: a0, reason: collision with root package name */
    public int f6423a0;

    /* renamed from: b, reason: collision with root package name */
    public final e f6424b;

    /* renamed from: b0, reason: collision with root package name */
    public byte f6425b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f6426c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f6427c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6428d;

    /* renamed from: d0, reason: collision with root package name */
    public o f6429d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6430e;

    /* renamed from: f, reason: collision with root package name */
    public final j f6431f;

    /* renamed from: g, reason: collision with root package name */
    public final Q1.o f6432g;

    /* renamed from: h, reason: collision with root package name */
    public final Q1.o f6433h;

    /* renamed from: i, reason: collision with root package name */
    public final Q1.o f6434i;

    /* renamed from: j, reason: collision with root package name */
    public final Q1.o f6435j;
    public final Q1.o k;

    /* renamed from: l, reason: collision with root package name */
    public final Q1.o f6436l;

    /* renamed from: m, reason: collision with root package name */
    public final Q1.o f6437m;

    /* renamed from: n, reason: collision with root package name */
    public final Q1.o f6438n;

    /* renamed from: o, reason: collision with root package name */
    public final Q1.o f6439o;

    /* renamed from: p, reason: collision with root package name */
    public final Q1.o f6440p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f6441q;

    /* renamed from: r, reason: collision with root package name */
    public long f6442r;

    /* renamed from: s, reason: collision with root package name */
    public long f6443s;

    /* renamed from: t, reason: collision with root package name */
    public long f6444t;

    /* renamed from: u, reason: collision with root package name */
    public long f6445u;

    /* renamed from: v, reason: collision with root package name */
    public long f6446v;

    /* renamed from: w, reason: collision with root package name */
    public c f6447w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6448x;

    /* renamed from: y, reason: collision with root package name */
    public int f6449y;

    /* renamed from: z, reason: collision with root package name */
    public long f6450z;

    static {
        int i5 = x.f9724a;
        f6392f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f6393g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f6394h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f6395i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        N0.a.p(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        N0.a.p(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f6396j0 = DesugarCollections.unmodifiableMap(map);
    }

    public d(j jVar, int i5) {
        b bVar = new b(0);
        this.f6443s = -1L;
        this.f6444t = -9223372036854775807L;
        this.f6445u = -9223372036854775807L;
        this.f6446v = -9223372036854775807L;
        this.f6398B = -1L;
        this.f6399C = -1L;
        this.f6400D = -9223372036854775807L;
        this.f6422a = bVar;
        bVar.f6340g = new e0(this, 12);
        this.f6431f = jVar;
        this.f6428d = (i5 & 1) == 0;
        this.f6430e = (i5 & 2) == 0;
        this.f6424b = new e();
        this.f6426c = new SparseArray();
        this.f6434i = new Q1.o(4);
        this.f6435j = new Q1.o(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new Q1.o(4);
        this.f6432g = new Q1.o(n.f10151a);
        this.f6433h = new Q1.o(4);
        this.f6436l = new Q1.o();
        this.f6437m = new Q1.o();
        this.f6438n = new Q1.o(8);
        this.f6439o = new Q1.o();
        this.f6440p = new Q1.o();
        this.f6409N = new int[1];
    }

    public static byte[] e(long j8, long j10, String str) {
        k.c(j8 != -9223372036854775807L);
        int i5 = (int) (j8 / 3600000000L);
        long j11 = j8 - (i5 * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        long j12 = j11 - (i10 * 60000000);
        int i11 = (int) (j12 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (i11 * 1000000)) / j10)));
        int i12 = x.f9724a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        this.f6400D = -9223372036854775807L;
        this.f6405I = 0;
        b bVar = this.f6422a;
        bVar.f6336c = 0;
        bVar.f6335b.clear();
        e eVar = (e) bVar.f6339f;
        eVar.f6453b = 0;
        eVar.f6454c = 0;
        e eVar2 = this.f6424b;
        eVar2.f6453b = 0;
        eVar2.f6454c = 0;
        l();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f6426c;
            if (i5 >= sparseArray.size()) {
                return;
            }
            J5.x xVar = ((c) sparseArray.valueAt(i5)).f6360U;
            if (xVar != null) {
                xVar.f5688b = false;
                xVar.f5689c = 0;
            }
            i5++;
        }
    }

    public final void b(int i5) {
        if (this.f6401E == null || this.f6402F == null) {
            throw D.a(null, "Element " + i5 + " must be in a Cues");
        }
    }

    public final void c(int i5) {
        if (this.f6447w != null) {
            return;
        }
        throw D.a(null, "Element " + i5 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(K2.c r24, long r25, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.d.d(K2.c, long, int, int, int):void");
    }

    public final void f(s2.j jVar, int i5) {
        Q1.o oVar = this.f6434i;
        if (oVar.f9704c >= i5) {
            return;
        }
        byte[] bArr = oVar.f9702a;
        if (bArr.length < i5) {
            oVar.b(Math.max(bArr.length * 2, i5));
        }
        byte[] bArr2 = oVar.f9702a;
        int i10 = oVar.f9704c;
        jVar.f(bArr2, i10, i5 - i10, false);
        oVar.F(i5);
    }

    @Override // s2.m
    public final void g(o oVar) {
        if (this.f6430e) {
            oVar = new Dd.c(oVar, this.f6431f);
        }
        this.f6429d0 = oVar;
    }

    @Override // s2.m
    public final m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(s2.n nVar) throws EOFException, InterruptedIOException {
        C0230x c0230x = new C0230x((byte) 0, 5);
        s2.j jVar = (s2.j) nVar;
        long j8 = jVar.f44897c;
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (j8 != -1 && j8 <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = j8;
        }
        int i5 = (int) j10;
        Q1.o oVar = (Q1.o) c0230x.f188c;
        jVar.c(oVar.f9702a, 0, 4, false);
        long jW = oVar.w();
        c0230x.f187b = 4;
        while (true) {
            if (jW != 440786851) {
                int i10 = c0230x.f187b + 1;
                c0230x.f187b = i10;
                if (i10 == i5) {
                    break;
                }
                jVar.c(oVar.f9702a, 0, 1, false);
                jW = ((jW << 8) & (-256)) | (oVar.f9702a[0] & ForkServer.ERROR);
            } else {
                long jX = c0230x.x(jVar);
                long j11 = c0230x.f187b;
                if (jX != Long.MIN_VALUE && (j8 == -1 || j11 + jX < j8)) {
                    while (true) {
                        long j12 = c0230x.f187b;
                        long j13 = j11 + jX;
                        if (j12 < j13) {
                            if (c0230x.x(jVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long jX2 = c0230x.x(jVar);
                            if (jX2 < 0 || jX2 > 2147483647L) {
                                break;
                            }
                            if (jX2 != 0) {
                                int i11 = (int) jX2;
                                jVar.b(i11, false);
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

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return l8.e0.f40101e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04e0 A[PHI: r39
  0x04e0: PHI (r39v39 java.lang.String) = 
  (r39v4 java.lang.String)
  (r39v5 java.lang.String)
  (r39v6 java.lang.String)
  (r39v7 java.lang.String)
  (r39v8 java.lang.String)
  (r39v9 java.lang.String)
  (r39v10 java.lang.String)
  (r39v11 java.lang.String)
  (r39v12 java.lang.String)
  (r39v13 java.lang.String)
  (r39v14 java.lang.String)
  (r39v15 java.lang.String)
  (r39v16 java.lang.String)
  (r39v17 java.lang.String)
  (r39v18 java.lang.String)
  (r39v19 java.lang.String)
  (r39v20 java.lang.String)
  (r39v21 java.lang.String)
  (r39v22 java.lang.String)
  (r39v23 java.lang.String)
  (r39v24 java.lang.String)
  (r39v25 java.lang.String)
  (r39v26 java.lang.String)
  (r39v27 java.lang.String)
  (r39v28 java.lang.String)
  (r39v29 java.lang.String)
  (r39v30 java.lang.String)
  (r39v31 java.lang.String)
  (r39v32 java.lang.String)
  (r39v33 java.lang.String)
  (r39v34 java.lang.String)
  (r39v35 java.lang.String)
  (r39v40 java.lang.String)
 binds: [B:376:0x06c8, B:372:0x06bd, B:368:0x06b1, B:364:0x06a6, B:360:0x069b, B:356:0x0690, B:352:0x0685, B:348:0x0678, B:344:0x0668, B:340:0x0658, B:336:0x0648, B:332:0x0638, B:328:0x0628, B:324:0x0618, B:320:0x0608, B:316:0x05f8, B:312:0x05e8, B:308:0x05d8, B:304:0x05c8, B:300:0x05b8, B:296:0x05a8, B:292:0x0598, B:288:0x0588, B:284:0x0578, B:280:0x0568, B:276:0x0558, B:272:0x0548, B:268:0x0538, B:264:0x0528, B:260:0x0518, B:256:0x0508, B:252:0x04f8, B:245:0x04de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0cdb  */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v38, types: [s2.j] */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v64 */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r51, J5.n r52) throws java.io.EOFException, java.io.InterruptedIOException, N1.D {
        /*
            Method dump skipped, instructions count: 5258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.d.k(s2.n, J5.n):int");
    }

    public final void l() {
        this.f6416U = 0;
        this.f6417V = 0;
        this.f6418W = 0;
        this.f6419X = false;
        this.f6420Y = false;
        this.f6421Z = false;
        this.f6423a0 = 0;
        this.f6425b0 = (byte) 0;
        this.f6427c0 = false;
        this.f6436l.D(0);
    }

    public final long m(long j8) throws D {
        long j10 = this.f6444t;
        if (j10 == -9223372036854775807L) {
            throw D.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i5 = x.f9724a;
        return x.S(j8, j10, 1000L, RoundingMode.DOWN);
    }

    public final int n(s2.j jVar, c cVar, int i5, boolean z2) throws EOFException, InterruptedIOException, D {
        int iD;
        int iD2;
        int i10;
        if ("S_TEXT/UTF8".equals(cVar.f6367b)) {
            o(jVar, f6391e0, i5);
            int i11 = this.f6417V;
            l();
            return i11;
        }
        if ("S_TEXT/ASS".equals(cVar.f6367b)) {
            o(jVar, f6393g0, i5);
            int i12 = this.f6417V;
            l();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f6367b)) {
            o(jVar, f6394h0, i5);
            int i13 = this.f6417V;
            l();
            return i13;
        }
        C c10 = cVar.f6364Y;
        boolean z10 = this.f6419X;
        Q1.o oVar = this.f6436l;
        if (!z10) {
            boolean z11 = cVar.f6373h;
            Q1.o oVar2 = this.f6434i;
            if (z11) {
                this.f6412Q &= -1073741825;
                if (!this.f6420Y) {
                    jVar.f(oVar2.f9702a, 0, 1, false);
                    this.f6416U++;
                    byte b5 = oVar2.f9702a[0];
                    if ((b5 & 128) == 128) {
                        throw D.a(null, "Extension bit is set in signal byte");
                    }
                    this.f6425b0 = b5;
                    this.f6420Y = true;
                }
                byte b10 = this.f6425b0;
                if ((b10 & 1) == 1) {
                    boolean z12 = (b10 & 2) == 2;
                    this.f6412Q |= 1073741824;
                    if (!this.f6427c0) {
                        Q1.o oVar3 = this.f6438n;
                        jVar.f(oVar3.f9702a, 0, 8, false);
                        this.f6416U += 8;
                        this.f6427c0 = true;
                        oVar2.f9702a[0] = (byte) ((z12 ? 128 : 0) | 8);
                        oVar2.G(0);
                        c10.f(oVar2, 1, 1);
                        this.f6417V++;
                        oVar3.G(0);
                        c10.f(oVar3, 8, 1);
                        this.f6417V += 8;
                    }
                    if (z12) {
                        if (!this.f6421Z) {
                            jVar.f(oVar2.f9702a, 0, 1, false);
                            this.f6416U++;
                            oVar2.G(0);
                            this.f6423a0 = oVar2.u();
                            this.f6421Z = true;
                        }
                        int i14 = this.f6423a0 * 4;
                        oVar2.D(i14);
                        jVar.f(oVar2.f9702a, 0, i14, false);
                        this.f6416U += i14;
                        short s10 = (short) ((this.f6423a0 / 2) + 1);
                        int i15 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f6441q;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.f6441q = ByteBuffer.allocate(i15);
                        }
                        this.f6441q.position(0);
                        this.f6441q.putShort(s10);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i10 = this.f6423a0;
                            if (i16 >= i10) {
                                break;
                            }
                            int iY = oVar2.y();
                            if (i16 % 2 == 0) {
                                this.f6441q.putShort((short) (iY - i17));
                            } else {
                                this.f6441q.putInt(iY - i17);
                            }
                            i16++;
                            i17 = iY;
                        }
                        int i18 = (i5 - this.f6416U) - i17;
                        if (i10 % 2 == 1) {
                            this.f6441q.putInt(i18);
                        } else {
                            this.f6441q.putShort((short) i18);
                            this.f6441q.putInt(0);
                        }
                        byte[] bArrArray = this.f6441q.array();
                        Q1.o oVar4 = this.f6439o;
                        oVar4.E(i15, bArrArray);
                        c10.f(oVar4, i15, 1);
                        this.f6417V += i15;
                    }
                }
            } else {
                byte[] bArr = cVar.f6374i;
                if (bArr != null) {
                    oVar.E(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(cVar.f6367b) ? z2 : cVar.f6371f > 0) {
                this.f6412Q |= 268435456;
                this.f6440p.D(0);
                int i19 = (oVar.f9704c + i5) - this.f6416U;
                oVar2.D(4);
                byte[] bArr2 = oVar2.f9702a;
                bArr2[0] = (byte) ((i19 >> 24) & 255);
                bArr2[1] = (byte) ((i19 >> 16) & 255);
                bArr2[2] = (byte) ((i19 >> 8) & 255);
                bArr2[3] = (byte) (i19 & 255);
                c10.f(oVar2, 4, 2);
                this.f6417V += 4;
            }
            this.f6419X = true;
        }
        int i20 = i5 + oVar.f9704c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f6367b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f6367b)) {
            if (cVar.f6360U != null) {
                k.g(oVar.f9704c == 0);
                cVar.f6360U.f(jVar);
            }
            while (true) {
                int i21 = this.f6416U;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                int iA = oVar.a();
                if (iA > 0) {
                    iD2 = Math.min(i22, iA);
                    c10.e(iD2, oVar);
                } else {
                    iD2 = c10.d(jVar, i22, false);
                }
                this.f6416U += iD2;
                this.f6417V += iD2;
            }
        } else {
            Q1.o oVar5 = this.f6433h;
            byte[] bArr3 = oVar5.f9702a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i23 = cVar.f6365Z;
            int i24 = 4 - i23;
            while (this.f6416U < i20) {
                int i25 = this.f6418W;
                if (i25 == 0) {
                    int iMin = Math.min(i23, oVar.a());
                    jVar.f(bArr3, i24 + iMin, i23 - iMin, false);
                    if (iMin > 0) {
                        oVar.f(i24, iMin, bArr3);
                    }
                    this.f6416U += i23;
                    oVar5.G(0);
                    this.f6418W = oVar5.y();
                    Q1.o oVar6 = this.f6432g;
                    oVar6.G(0);
                    c10.e(4, oVar6);
                    this.f6417V += 4;
                } else {
                    int iA2 = oVar.a();
                    if (iA2 > 0) {
                        iD = Math.min(i25, iA2);
                        c10.e(iD, oVar);
                    } else {
                        iD = c10.d(jVar, i25, false);
                    }
                    this.f6416U += iD;
                    this.f6417V += iD;
                    this.f6418W -= iD;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f6367b)) {
            Q1.o oVar7 = this.f6435j;
            oVar7.G(0);
            c10.e(4, oVar7);
            this.f6417V += 4;
        }
        int i26 = this.f6417V;
        l();
        return i26;
    }

    public final void o(s2.j jVar, byte[] bArr, int i5) throws EOFException, InterruptedIOException {
        int length = bArr.length + i5;
        Q1.o oVar = this.f6437m;
        byte[] bArr2 = oVar.f9702a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i5);
            oVar.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        jVar.f(oVar.f9702a, bArr.length, i5, false);
        oVar.G(0);
        oVar.F(length);
    }

    @Override // s2.m
    public final void release() {
    }
}
