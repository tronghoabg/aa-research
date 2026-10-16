package M2;

import N1.C0760i;
import N1.C0761j;
import N1.C0764m;
import N1.C0765n;
import N1.D;
import Q1.x;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.C;
import s2.InterfaceC3990A;

/* loaded from: classes.dex */
public final class l implements s2.m {

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f7335M = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: N, reason: collision with root package name */
    public static final C0765n f7336N;

    /* renamed from: A, reason: collision with root package name */
    public long f7337A;

    /* renamed from: B, reason: collision with root package name */
    public long f7338B;

    /* renamed from: C, reason: collision with root package name */
    public k f7339C;

    /* renamed from: D, reason: collision with root package name */
    public int f7340D;

    /* renamed from: E, reason: collision with root package name */
    public int f7341E;

    /* renamed from: F, reason: collision with root package name */
    public int f7342F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f7343G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7344H;

    /* renamed from: I, reason: collision with root package name */
    public s2.o f7345I;

    /* renamed from: J, reason: collision with root package name */
    public C[] f7346J;

    /* renamed from: K, reason: collision with root package name */
    public C[] f7347K;
    public boolean L;

    /* renamed from: a, reason: collision with root package name */
    public final P2.j f7348a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7349b;

    /* renamed from: c, reason: collision with root package name */
    public final s f7350c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7351d;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f7356i;

    /* renamed from: j, reason: collision with root package name */
    public final Q1.o f7357j;
    public final Q1.u k;

    /* renamed from: p, reason: collision with root package name */
    public final R1.q f7362p;

    /* renamed from: q, reason: collision with root package name */
    public final X1.l f7363q;

    /* renamed from: r, reason: collision with root package name */
    public e0 f7364r;

    /* renamed from: s, reason: collision with root package name */
    public int f7365s;

    /* renamed from: t, reason: collision with root package name */
    public int f7366t;

    /* renamed from: u, reason: collision with root package name */
    public long f7367u;

    /* renamed from: v, reason: collision with root package name */
    public int f7368v;

    /* renamed from: w, reason: collision with root package name */
    public Q1.o f7369w;

    /* renamed from: x, reason: collision with root package name */
    public long f7370x;

    /* renamed from: y, reason: collision with root package name */
    public int f7371y;

    /* renamed from: z, reason: collision with root package name */
    public long f7372z;

    /* renamed from: l, reason: collision with root package name */
    public final S3.s f7358l = new S3.s((byte) 0, 3);

    /* renamed from: m, reason: collision with root package name */
    public final Q1.o f7359m = new Q1.o(16);

    /* renamed from: f, reason: collision with root package name */
    public final Q1.o f7353f = new Q1.o(R1.n.f10151a);

    /* renamed from: g, reason: collision with root package name */
    public final Q1.o f7354g = new Q1.o(5);

    /* renamed from: h, reason: collision with root package name */
    public final Q1.o f7355h = new Q1.o();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f7360n = new ArrayDeque();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f7361o = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f7352e = new SparseArray();

    static {
        C0764m c0764m = new C0764m();
        c0764m.f8194m = N1.C.m("application/x-emsg");
        f7336N = new C0765n(c0764m);
    }

    public l(P2.j jVar, int i5, Q1.u uVar, s sVar, List list, X1.l lVar) {
        this.f7348a = jVar;
        this.f7349b = i5;
        this.k = uVar;
        this.f7350c = sVar;
        this.f7351d = DesugarCollections.unmodifiableList(list);
        this.f7363q = lVar;
        byte[] bArr = new byte[16];
        this.f7356i = bArr;
        this.f7357j = new Q1.o(bArr);
        C3407I c3407i = AbstractC3409K.f40056b;
        this.f7364r = e0.f40101e;
        this.f7337A = -9223372036854775807L;
        this.f7372z = -9223372036854775807L;
        this.f7338B = -9223372036854775807L;
        this.f7345I = s2.o.f44913f9;
        this.f7346J = new C[0];
        this.f7347K = new C[0];
        this.f7362p = new R1.q(new i(this));
    }

    public static C0761j b(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i5 = 0; i5 < size; i5++) {
            R1.c cVar = (R1.c) arrayList.get(i5);
            if (cVar.f4893b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = cVar.f10097c.f9702a;
                Y9.c cVarI = r.i(bArr);
                UUID uuid = cVarI == null ? null : (UUID) cVarI.f16739b;
                if (uuid == null) {
                    Q1.k.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C0760i(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C0761j(null, false, (C0760i[]) arrayList2.toArray(new C0760i[0]));
    }

    public static void c(Q1.o oVar, int i5, u uVar) throws D {
        oVar.G(i5 + 8);
        int iH = oVar.h();
        byte[] bArr = g.f7315a;
        if ((iH & 1) != 0) {
            throw D.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (iH & 2) != 0;
        int iY = oVar.y();
        if (iY == 0) {
            Arrays.fill(uVar.k, 0, uVar.f7439d, false);
            return;
        }
        if (iY != uVar.f7439d) {
            StringBuilder sbL = pd.f.l(iY, "Senc sample count ", " is different from fragment sample count");
            sbL.append(uVar.f7439d);
            throw D.a(null, sbL.toString());
        }
        Arrays.fill(uVar.k, 0, iY, z2);
        int iA = oVar.a();
        Q1.o oVar2 = (Q1.o) uVar.f7451q;
        oVar2.D(iA);
        uVar.f7445j = true;
        uVar.f7446l = true;
        oVar.f(0, oVar2.f9704c, oVar2.f9702a);
        oVar2.G(0);
        uVar.f7446l = false;
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        SparseArray sparseArray = this.f7352e;
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((k) sparseArray.valueAt(i5)).e();
        }
        this.f7361o.clear();
        this.f7371y = 0;
        this.f7362p.p(0);
        this.f7372z = j10;
        this.f7360n.clear();
        this.f7365s = 0;
        this.f7368v = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:358:0x081d, code lost:
    
        r58.f7365s = 0;
        r58.f7368v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0822, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r59) throws N1.D {
        /*
            Method dump skipped, instructions count: 2083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.l.d(long):void");
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        int i5;
        int i10 = this.f7349b;
        if ((i10 & 32) == 0) {
            oVar = new Dd.c(oVar, this.f7348a);
        }
        this.f7345I = oVar;
        this.f7365s = 0;
        this.f7368v = 0;
        C[] cArr = new C[2];
        this.f7346J = cArr;
        X1.l lVar = this.f7363q;
        if (lVar != null) {
            cArr[0] = lVar;
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i11 = 100;
        if ((i10 & 4) != 0) {
            cArr[i5] = oVar.mo0m(100, 5);
            i11 = 101;
            i5++;
        }
        C[] cArr2 = (C[]) x.M(i5, this.f7346J);
        this.f7346J = cArr2;
        for (C c10 : cArr2) {
            c10.c(f7336N);
        }
        List list = this.f7351d;
        this.f7347K = new C[list.size()];
        int i12 = 0;
        while (i12 < this.f7347K.length) {
            C cMo0m = this.f7345I.mo0m(i11, 3);
            cMo0m.c((C0765n) list.get(i12));
            this.f7347K[i12] = cMo0m;
            i12++;
            i11++;
        }
        s sVar = this.f7350c;
        if (sVar != null) {
            this.f7352e.put(0, new k(this.f7345I.mo0m(0, sVar.f7421b), new v(this.f7350c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new h(0, 0, 0, 0)));
            this.f7345I.l();
        }
    }

    @Override // s2.m
    public final s2.m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(s2.n nVar) {
        e0 e0VarN;
        InterfaceC3990A interfaceC3990AK = r.k(nVar, true, false);
        if (interfaceC3990AK != null) {
            e0VarN = AbstractC3409K.n(interfaceC3990AK);
        } else {
            C3407I c3407i = AbstractC3409K.f40056b;
            e0VarN = e0.f40101e;
        }
        this.f7364r = e0VarN;
        return interfaceC3990AK == null;
    }

    @Override // s2.m
    public final List j() {
        return this.f7364r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f4, code lost:
    
        r36.f7342F = r5 - 1;
        r5 = r36.f7353f;
        r5.G(0);
        r12.e(4, r5);
        r12.e(1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0208, code lost:
    
        if (r36.f7347K.length <= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020a, code lost:
    
        r5 = r4[4];
        r2 = j$.util.Objects.equals(r15.f8232n, com.unity3d.services.core.device.MimeTypes.VIDEO_H264);
        r2 = r15.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r2 != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021c, code lost:
    
        if (N1.C.b(r2, com.unity3d.services.core.device.MimeTypes.VIDEO_H264) == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021f, code lost:
    
        r23 = r4;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0225, code lost:
    
        r23 = r4;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022c, code lost:
    
        if ((r5 & 31) == 6) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0234, code lost:
    
        if (j$.util.Objects.equals(r15.f8232n, com.unity3d.services.core.device.MimeTypes.VIDEO_H265) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023a, code lost:
    
        if (N1.C.b(r2, com.unity3d.services.core.device.MimeTypes.VIDEO_H265) == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0244, code lost:
    
        if (((r5 & 126) >> 1) != 39) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0246, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0248, code lost:
    
        r23 = r4;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024e, code lost:
    
        r36.f7344H = r2;
        r36.f7341E += 5;
        r36.f7340D += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x025d, code lost:
    
        if (r36.f7343G != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026b, code lost:
    
        if (j$.util.Objects.equals(r3.f7327d.f7452a.f7426g.f8232n, com.unity3d.services.core.device.MimeTypes.VIDEO_H264) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0275, code lost:
    
        if (R1.n.c(r23[4]) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0277, code lost:
    
        r36.f7343G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x027a, code lost:
    
        r6 = r18;
        r2 = r20;
        r4 = r23;
        r14 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x028d, code lost:
    
        throw N1.D.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028e, code lost:
    
        r20 = r2;
        r23 = r4;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0297, code lost:
    
        if (r36.f7344H == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0299, code lost:
    
        r2 = r36.f7355h;
        r2.D(r5);
        r33 = r3;
        ((s2.j) r37).f(r2.f9702a, 0, r36.f7342F, false);
        r12.e(r36.f7342F, r2);
        r3 = r36.f7342F;
        r4 = R1.n.k(r2.f9704c, r2.f9702a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c0, code lost:
    
        if (j$.util.Objects.equals(r15.f8232n, com.unity3d.services.core.device.MimeTypes.VIDEO_H265) != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c8, code lost:
    
        if (N1.C.b(r15.k, com.unity3d.services.core.device.MimeTypes.VIDEO_H265) == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cb, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cd, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ce, code lost:
    
        r2.G(r5);
        r2.F(r4);
        r4 = r15.f8234p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d7, code lost:
    
        if (r4 != (-1)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02db, code lost:
    
        if (r9.f10157a == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02dd, code lost:
    
        r9.f10157a = 0;
        r9.p(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e6, code lost:
    
        if (r9.f10157a == r4) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02e8, code lost:
    
        if (r4 < 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ea, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ec, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ed, code lost:
    
        Q1.k.g(r5);
        r9.f10157a = r4;
        r9.p(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f5, code lost:
    
        r9.m(r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0300, code lost:
    
        if ((r33.a() & 4) == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0302, code lost:
    
        r9.p(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0309, code lost:
    
        r33 = r3;
        r3 = r12.d(r37, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0310, code lost:
    
        r36.f7341E += r3;
        r36.f7342F -= r3;
        r6 = r18;
        r2 = r20;
        r4 = r23;
        r14 = r31;
        r15 = r32;
        r3 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0328, code lost:
    
        r33 = r3;
        r32 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x032d, code lost:
    
        r33 = r3;
        r17 = r5;
        r31 = r14;
        r32 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0335, code lost:
    
        r2 = r36.f7341E;
        r3 = r36.f7340D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0339, code lost:
    
        if (r2 >= r3) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x033b, code lost:
    
        r36.f7341E += r12.d(r37, r3 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0347, code lost:
    
        r1 = r33.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x034d, code lost:
    
        if ((r17 & 64) == 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0351, code lost:
    
        if (r36.f7343G != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0353, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0356, code lost:
    
        r26 = r1;
        r1 = r33.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x035c, code lost:
    
        if (r1 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x035e, code lost:
    
        r29 = r1.f7433c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0363, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0365, code lost:
    
        r24 = r10;
        r12.a(r24, r26, r36.f7340D, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0376, code lost:
    
        if (r31.isEmpty() != false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0378, code lost:
    
        r1 = (M2.j) r31.removeFirst();
        r36.f7371y -= r1.f7323c;
        r2 = r1.f7322b;
        r3 = r1.f7321a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0389, code lost:
    
        if (r2 == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x038b, code lost:
    
        r3 = r3 + r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x038d, code lost:
    
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x038f, code lost:
    
        if (r32 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0391, code lost:
    
        r3 = r2.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0395, code lost:
    
        r6 = r3;
        r3 = r36.f7346J;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x039a, code lost:
    
        if (r12 >= r4) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x039c, code lost:
    
        r3[r12].a(r6, 1, r1.f7323c, r36.f7371y, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03ac, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03b3, code lost:
    
        if (r33.c() != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03b5, code lost:
    
        r36.f7339C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b8, code lost:
    
        r36.f7365s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03bd, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        r2 = r36.f7365s;
        r5 = r36.f7349b;
        r8 = r3.f7325b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (r2 != 3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        if (r3.f7334l != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        r2 = r3.f7327d.f7455d[r3.f7329f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e2, code lost:
    
        r2 = r8.f7442g[r3.f7329f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e8, code lost:
    
        r36.f7340D = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
    
        if ((r5 & 64) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fa, code lost:
    
        if (j$.util.Objects.equals(r3.f7327d.f7452a.f7426g.f8232n, com.unity3d.services.core.device.MimeTypes.VIDEO_H264) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0101, code lost:
    
        r36.f7343G = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0107, code lost:
    
        if (r3.f7329f >= r3.f7332i) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0109, code lost:
    
        ((s2.j) r37).j(r36.f7340D);
        r1 = r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0114, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:
    
        r2 = (Q1.o) r8.f7451q;
        r1 = r1.f7434d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
    
        if (r1 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:
    
        r2.H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0122, code lost:
    
        r1 = r3.f7329f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
    
        if (r8.f7445j == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012c, code lost:
    
        if (r8.k[r1] == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012e, code lost:
    
        r2.H(r2.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013a, code lost:
    
        if (r3.c() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013c, code lost:
    
        r36.f7339C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013f, code lost:
    
        r36.f7365s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0142, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014b, code lost:
    
        if (r3.f7327d.f7452a.f7427h != r22) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014d, code lost:
    
        r36.f7340D -= 8;
        ((s2.j) r37).j(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0169, code lost:
    
        if ("audio/ac4".equals(r3.f7327d.f7452a.f7426g.f8232n) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016b, code lost:
    
        r36.f7341E = r3.d(r36.f7340D, 7);
        r2 = r36.f7340D;
        r11 = r36.f7357j;
        s2.AbstractC3991a.i(r2, r11);
        r3.f7324a.e(7, r11);
        r36.f7341E += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0186, code lost:
    
        r36.f7341E = r3.d(r36.f7340D, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018e, code lost:
    
        r36.f7340D += r36.f7341E;
        r36.f7365s = 4;
        r36.f7342F = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019a, code lost:
    
        r2 = r3.f7327d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019e, code lost:
    
        if (r3.f7334l != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a0, code lost:
    
        r10 = r2.f7457f[r3.f7329f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a7, code lost:
    
        r10 = r8.f7443h[r3.f7329f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ad, code lost:
    
        if (r15 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        r10 = r15.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b3, code lost:
    
        r2 = r2.f7452a;
        r8 = r2.k;
        r12 = r3.f7324a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b9, code lost:
    
        if (r8 == 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        r13 = r36.f7354g;
        r4 = r13.f9702a;
        r4[0] = 0;
        r4[1] = 0;
        r4[r18] = 0;
        r6 = r8 + 1;
        r8 = 4 - r8;
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cf, code lost:
    
        r31 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d5, code lost:
    
        if (r36.f7341E >= r36.f7340D) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d7, code lost:
    
        r5 = r36.f7342F;
        r32 = r15;
        r15 = r2.f7426g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        if (r5 != 0) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e1, code lost:
    
        r20 = r2;
        ((s2.j) r37).f(r4, r8, r6, false);
        r13.G(0);
        r5 = r13.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f2, code lost:
    
        if (r5 < 1) goto L422;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r37, J5.n r38) throws java.io.EOFException, java.io.InterruptedIOException, N1.D {
        /*
            Method dump skipped, instructions count: 2141
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.l.k(s2.n, J5.n):int");
    }

    @Override // s2.m
    public final void release() {
    }
}
