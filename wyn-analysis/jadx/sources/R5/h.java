package R5;

import E5.S;
import E5.T;
import E5.o0;
import J5.w;
import M2.u;
import android.util.SparseArray;
import f6.C2584N;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public final class h implements J5.k {

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f10279E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: F, reason: collision with root package name */
    public static final T f10280F;

    /* renamed from: D, reason: collision with root package name */
    public boolean f10284D;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f10290f;

    /* renamed from: g, reason: collision with root package name */
    public final Y4.b f10291g;

    /* renamed from: l, reason: collision with root package name */
    public int f10295l;

    /* renamed from: m, reason: collision with root package name */
    public int f10296m;

    /* renamed from: n, reason: collision with root package name */
    public long f10297n;

    /* renamed from: o, reason: collision with root package name */
    public int f10298o;

    /* renamed from: p, reason: collision with root package name */
    public Y4.b f10299p;

    /* renamed from: q, reason: collision with root package name */
    public long f10300q;

    /* renamed from: r, reason: collision with root package name */
    public int f10301r;

    /* renamed from: v, reason: collision with root package name */
    public g f10305v;

    /* renamed from: w, reason: collision with root package name */
    public int f10306w;

    /* renamed from: x, reason: collision with root package name */
    public int f10307x;

    /* renamed from: y, reason: collision with root package name */
    public int f10308y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10309z;

    /* renamed from: a, reason: collision with root package name */
    public final List f10285a = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST);

    /* renamed from: h, reason: collision with root package name */
    public final X2.j f10292h = new X2.j(2);

    /* renamed from: i, reason: collision with root package name */
    public final Y4.b f10293i = new Y4.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final Y4.b f10287c = new Y4.b(AbstractC4256a.f46662d);

    /* renamed from: d, reason: collision with root package name */
    public final Y4.b f10288d = new Y4.b(5);

    /* renamed from: e, reason: collision with root package name */
    public final Y4.b f10289e = new Y4.b();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f10294j = new ArrayDeque();
    public final ArrayDeque k = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f10286b = new SparseArray();

    /* renamed from: t, reason: collision with root package name */
    public long f10303t = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f10302s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f10304u = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    public J5.m f10281A = J5.m.f5654N8;

    /* renamed from: B, reason: collision with root package name */
    public w[] f10282B = new w[0];

    /* renamed from: C, reason: collision with root package name */
    public w[] f10283C = new w[0];

    static {
        S s10 = new S();
        s10.k = "application/x-emsg";
        f10280F = new T(s10);
    }

    public h() {
        byte[] bArr = new byte[16];
        this.f10290f = bArr;
        this.f10291g = new Y4.b(bArr);
    }

    public static I5.c b(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) arrayList.get(i5);
            if (bVar.f4893b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f10259c.f16679a;
                S3.l lVarD = i.d(bArr);
                UUID uuid = lVarD == null ? null : (UUID) lVarD.f10967a;
                if (uuid == null) {
                    AbstractC4256a.E("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new I5.b(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new I5.c(null, false, (I5.b[]) arrayList2.toArray(new I5.b[0]));
    }

    public static void c(Y4.b bVar, int i5, u uVar) throws o0 {
        bVar.A(i5 + 8);
        int iD = bVar.d();
        if ((iD & 1) != 0) {
            throw o0.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (iD & 2) != 0;
        int iT = bVar.t();
        if (iT == 0) {
            Arrays.fill(uVar.k, 0, uVar.f7439d, false);
            return;
        }
        if (iT != uVar.f7439d) {
            StringBuilder sbL = pd.f.l(iT, "Senc sample count ", " is different from fragment sample count");
            sbL.append(uVar.f7439d);
            throw o0.a(sbL.toString(), null);
        }
        Arrays.fill(uVar.k, 0, iT, z2);
        int iA = bVar.a();
        Y4.b bVar2 = (Y4.b) uVar.f7451q;
        bVar2.x(iA);
        uVar.f7445j = true;
        uVar.f7446l = true;
        bVar.c(0, bVar2.f16681c, bVar2.f16679a);
        bVar2.A(0);
        uVar.f7446l = false;
    }

    @Override // J5.k
    public final void a(long j8, long j10) {
        SparseArray sparseArray = this.f10286b;
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((g) sparseArray.valueAt(i5)).d();
        }
        this.k.clear();
        this.f10301r = 0;
        this.f10302s = j10;
        this.f10294j.clear();
        this.f10295l = 0;
        this.f10298o = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:317:0x077a, code lost:
    
        r54.f10295l = 0;
        r54.f10298o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x077f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r55) throws E5.o0 {
        /*
            Method dump skipped, instructions count: 1920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R5.h.d(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f6, code lost:
    
        if (com.unity3d.services.core.device.MimeTypes.VIDEO_H265.equals(r4) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0200, code lost:
    
        if (((r6 & 126) >> 1) != 39) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0202, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0204, code lost:
    
        r38 = r7;
        r7 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0207, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0208, code lost:
    
        r36.f10309z = r3;
        r36.f10307x += 5;
        r36.f10306w += r38;
        r3 = r21;
        r7 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0224, code lost:
    
        throw E5.o0.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0225, code lost:
    
        r21 = r3;
        r38 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022c, code lost:
    
        if (r36.f10309z == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022e, code lost:
    
        r3 = r36.f10289e;
        r3.x(r4);
        r22 = r13;
        r23 = r14;
        ((J5.h) r37).f(r3.f16679a, 0, r36.f10308y, false);
        r11.c(r36.f10308y, r3);
        r4 = r36.f10308y;
        r7 = u6.AbstractC4256a.C(r3.f16681c, r3.f16679a);
        r3.A(com.unity3d.services.core.device.MimeTypes.VIDEO_H265.equals(r6.f3238l) ? 1 : 0);
        r3.z(r7);
        Fe.g.w(r8, r3, r36.f10283C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0263, code lost:
    
        r22 = r13;
        r23 = r14;
        r4 = r11.d(r37, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026c, code lost:
    
        r36.f10307x += r4;
        r36.f10308y -= r4;
        r7 = r38;
        r3 = r21;
        r13 = r22;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0282, code lost:
    
        r3 = r36.f10307x;
        r4 = r36.f10306w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0286, code lost:
    
        if (r3 >= r4) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0288, code lost:
    
        r36.f10307x += r11.d(r37, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0296, code lost:
    
        if (r2.f10278l != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0298, code lost:
    
        r5 = r2.f10271d.f10366g[r2.f10273f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a7, code lost:
    
        if (r5.f7444i[r2.f10273f] == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a9, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ab, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02b0, code lost:
    
        if (r2.a() == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b2, code lost:
    
        r5 = r5 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b5, code lost:
    
        r24 = r5;
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02bb, code lost:
    
        if (r0 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02bd, code lost:
    
        r27 = r0.f10357c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c2, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c4, code lost:
    
        r22 = r8;
        r11.b(r22, r24, r36.f10306w, 0, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d5, code lost:
    
        if (r12.isEmpty() != false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d7, code lost:
    
        r0 = (R5.f) r12.removeFirst();
        r36.f10301r -= r0.f10267c;
        r3 = r0.f10266b;
        r4 = r0.f10265a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e8, code lost:
    
        if (r3 == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ea, code lost:
    
        r4 = r4 + r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ec, code lost:
    
        r30 = r4;
        r3 = r36.f10282B;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02f2, code lost:
    
        if (r5 >= r4) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02f4, code lost:
    
        r3[r5].b(r30, 1, r0.f10267c, r36.f10301r, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x030c, code lost:
    
        if (r2.b() != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x030e, code lost:
    
        r36.f10305v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0311, code lost:
    
        r36.f10295l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0316, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        r3 = r36.f10295l;
        r5 = r2.f10269b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r3 != 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
    
        if (r2.f10278l != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
    
        r3 = r2.f10271d.f10363d[r2.f10273f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        r3 = r5.f7442g[r2.f10273f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
    
        r36.f10306w = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
    
        if (r2.f10273f >= r2.f10276i) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
    
        ((J5.h) r37).j(r3);
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
    
        r3 = (Y4.b) r5.f7451q;
        r0 = r0.f10358d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fc, code lost:
    
        if (r0 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fe, code lost:
    
        r3.B(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        r0 = r2.f10273f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0105, code lost:
    
        if (r5.f7445j == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
    
        if (r5.k[r0] == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010d, code lost:
    
        r3.B(r3.v() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0119, code lost:
    
        if (r2.b() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011b, code lost:
    
        r36.f10305v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011d, code lost:
    
        r36.f10295l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0120, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0128, code lost:
    
        if (r2.f10271d.f10360a.f10351g != 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012a, code lost:
    
        r36.f10306w = r3 - 8;
        ((J5.h) r37).j(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0144, code lost:
    
        if ("audio/ac4".equals(r2.f10271d.f10360a.f10350f.f3238l) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0146, code lost:
    
        r36.f10307x = r2.c(r36.f10306w, 7);
        r3 = r36.f10306w;
        r8 = r36.f10291g;
        G5.AbstractC0521b.c(r3, r8);
        r2.f10268a.c(7, r8);
        r36.f10307x += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0161, code lost:
    
        r36.f10307x = r2.c(r36.f10306w, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0169, code lost:
    
        r36.f10306w += r36.f10307x;
        r36.f10295l = 4;
        r36.f10308y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0175, code lost:
    
        r3 = r2.f10271d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0179, code lost:
    
        if (r2.f10278l != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017b, code lost:
    
        r8 = r3.f10365f[r2.f10273f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0182, code lost:
    
        r8 = r5.f7443h[r2.f10273f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0189, code lost:
    
        r3 = r3.f10360a;
        r7 = r3.f10354j;
        r11 = r2.f10268a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018f, code lost:
    
        if (r7 == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0191, code lost:
    
        r13 = r36.f10288d;
        r14 = r13.f16679a;
        r14[0] = 0;
        r14[1] = 0;
        r14[r38] = 0;
        r15 = r7 + 1;
        r7 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a7, code lost:
    
        if (r36.f10307x >= r36.f10306w) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a9, code lost:
    
        r4 = r36.f10308y;
        r6 = r3.f10350f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01af, code lost:
    
        if (r4 != 0) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b1, code lost:
    
        r21 = r3;
        ((J5.h) r37).f(r14, r7, r15, false);
        r13.A(0);
        r4 = r13.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c2, code lost:
    
        if (r4 < 1) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c4, code lost:
    
        r36.f10308y = r4 - 1;
        r4 = r36.f10287c;
        r4.A(0);
        r11.c(4, r4);
        r11.c(1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d9, code lost:
    
        if (r36.f10283C.length <= 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01db, code lost:
    
        r4 = r6.f3238l;
        r6 = r14[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e5, code lost:
    
        if (com.unity3d.services.core.device.MimeTypes.VIDEO_H264.equals(r4) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e7, code lost:
    
        r38 = r7;
        r7 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ec, code lost:
    
        if ((r6 & 31) == 6) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ef, code lost:
    
        r38 = r7;
        r7 = 6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // J5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(J5.l r37, J5.n r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R5.h.g(J5.l, J5.n):int");
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f10281A = c2584n;
        int i5 = 0;
        this.f10295l = 0;
        this.f10298o = 0;
        w[] wVarArr = new w[2];
        this.f10282B = wVarArr;
        w[] wVarArr2 = (w[]) v.A(0, wVarArr);
        this.f10282B = wVarArr2;
        for (w wVar : wVarArr2) {
            wVar.a(f10280F);
        }
        List list = this.f10285a;
        this.f10283C = new w[list.size()];
        int i10 = 100;
        while (i5 < this.f10283C.length) {
            int i11 = i10 + 1;
            w wVarM = this.f10281A.m(i10, 3);
            wVarM.a((T) list.get(i5));
            this.f10283C[i5] = wVarM;
            i5++;
            i10 = i11;
        }
    }

    @Override // J5.k
    public final boolean i(J5.l lVar) {
        return i.h(lVar, true, false);
    }

    @Override // J5.k
    public final void release() {
    }
}
