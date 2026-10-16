package M2;

import Q1.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.InterfaceC3990A;
import s2.w;

/* loaded from: classes.dex */
public final class o implements s2.m, w {

    /* renamed from: A, reason: collision with root package name */
    public n[] f7381A;

    /* renamed from: B, reason: collision with root package name */
    public long[][] f7382B;

    /* renamed from: C, reason: collision with root package name */
    public int f7383C;

    /* renamed from: D, reason: collision with root package name */
    public long f7384D;

    /* renamed from: E, reason: collision with root package name */
    public int f7385E;

    /* renamed from: F, reason: collision with root package name */
    public H2.a f7386F;

    /* renamed from: a, reason: collision with root package name */
    public final P2.j f7387a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7388b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.o f7389c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1.o f7390d;

    /* renamed from: e, reason: collision with root package name */
    public final Q1.o f7391e;

    /* renamed from: f, reason: collision with root package name */
    public final Q1.o f7392f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f7393g;

    /* renamed from: h, reason: collision with root package name */
    public final q f7394h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7395i;

    /* renamed from: j, reason: collision with root package name */
    public e0 f7396j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f7397l;

    /* renamed from: m, reason: collision with root package name */
    public long f7398m;

    /* renamed from: n, reason: collision with root package name */
    public int f7399n;

    /* renamed from: o, reason: collision with root package name */
    public Q1.o f7400o;

    /* renamed from: p, reason: collision with root package name */
    public int f7401p;

    /* renamed from: q, reason: collision with root package name */
    public int f7402q;

    /* renamed from: r, reason: collision with root package name */
    public int f7403r;

    /* renamed from: s, reason: collision with root package name */
    public int f7404s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7405t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7406u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7407v;

    /* renamed from: w, reason: collision with root package name */
    public long f7408w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7409x;

    /* renamed from: y, reason: collision with root package name */
    public long f7410y;

    /* renamed from: z, reason: collision with root package name */
    public s2.o f7411z;

    public o(P2.j jVar, int i5) {
        this.f7387a = jVar;
        this.f7388b = i5;
        C3407I c3407i = AbstractC3409K.f40056b;
        this.f7396j = e0.f40101e;
        this.k = (i5 & 4) != 0 ? 3 : 0;
        this.f7394h = new q();
        this.f7395i = new ArrayList();
        this.f7392f = new Q1.o(16);
        this.f7393g = new ArrayDeque();
        this.f7389c = new Q1.o(R1.n.f10151a);
        this.f7390d = new Q1.o(5);
        this.f7391e = new Q1.o();
        this.f7401p = -1;
        this.f7411z = s2.o.f44913f9;
        this.f7381A = new n[0];
        this.f7405t = (i5 & 32) == 0;
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        this.f7393g.clear();
        this.f7399n = 0;
        this.f7401p = -1;
        this.f7402q = 0;
        this.f7403r = 0;
        this.f7404s = 0;
        this.f7405t = (this.f7388b & 32) == 0;
        if (j8 == 0) {
            if (this.k != 3) {
                this.k = 0;
                this.f7399n = 0;
                return;
            } else {
                q qVar = this.f7394h;
                qVar.f7416a.clear();
                qVar.f7417b = 0;
                this.f7395i.clear();
                return;
            }
        }
        for (n nVar : this.f7381A) {
            v vVar = nVar.f7377b;
            int iE = x.e(vVar.f7457f, j10, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((vVar.f7458g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = vVar.a(j10);
            }
            nVar.f7380e = iE;
            J5.x xVar = nVar.f7379d;
            if (xVar != null) {
                xVar.f5688b = false;
                xVar.f5689c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0 A[EDGE_INSN: B:75:0x00e0->B:67:0x00e0 BREAK  A[LOOP:1: B:32:0x0077->B:66:0x00db], SYNTHETIC] */
    @Override // s2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s2.v c(long r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.o.c(long):s2.v");
    }

    @Override // s2.w
    public final boolean e() {
        return true;
    }

    @Override // s2.w
    public final long f() {
        return this.f7384D;
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        if ((this.f7388b & 16) == 0) {
            oVar = new Dd.c(oVar, this.f7387a);
        }
        this.f7411z = oVar;
    }

    @Override // s2.m
    public final s2.m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(s2.n nVar) {
        e0 e0VarN;
        InterfaceC3990A interfaceC3990AK = r.k(nVar, false, (this.f7388b & 2) != 0);
        if (interfaceC3990AK != null) {
            e0VarN = AbstractC3409K.n(interfaceC3990AK);
        } else {
            C3407I c3407i = AbstractC3409K.f40056b;
            e0VarN = e0.f40101e;
        }
        this.f7396j = e0VarN;
        return interfaceC3990AK == null;
    }

    @Override // s2.m
    public final List j() {
        return this.f7396j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022a, code lost:
    
        if (r4.h() == 1397048916) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x022c, code lost:
    
        r45.f5655a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0232, code lost:
    
        r45.f5655a = r44.getPosition() - (r11.f7418c - 12);
        r11.f7417b = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0243, code lost:
    
        r3 = r44.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0249, code lost:
    
        if (r3 == (-1)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024d, code lost:
    
        if (r3 >= 8) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0250, code lost:
    
        r3 = r3 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0253, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r11 != r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0255, code lost:
    
        r45.f5655a = r3;
        r15 = 1;
        r11.f7417b = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0260, code lost:
    
        if (r45.f5655a != 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0262, code lost:
    
        r43.k = 0;
        r43.f7399n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0267, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0270, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0271, code lost:
    
        r30 = r7;
        r4 = r44.getPosition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x027a, code lost:
    
        if (r43.f7401p != (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r3 = r43.f7395i;
        r11 = r43.f7394h;
        r12 = r11.f7417b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x027c, code lost:
    
        r8 = -1;
        r9 = -1;
        r10 = true;
        r11 = true;
        r12 = 0;
        r13 = Long.MAX_VALUE;
        r16 = Long.MAX_VALUE;
        r32 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0295, code lost:
    
        r6 = r43.f7381A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0298, code lost:
    
        if (r12 >= r6.length) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x029a, code lost:
    
        r6 = r6[r12];
        r7 = r6.f7380e;
        r6 = r6.f7377b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a2, code lost:
    
        if (r7 != r6.f7453b) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a7, code lost:
    
        r37 = r6.f7454c[r7];
        r3 = r43.f7382B;
        r6 = Q1.x.f9724a;
        r6 = r3[r12][r7];
        r37 = r37 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b9, code lost:
    
        if (r37 < 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02bd, code lost:
    
        if (r37 < 262144) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r12 == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c0, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c2, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c3, code lost:
    
        if (r3 != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c5, code lost:
    
        if (r11 != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c7, code lost:
    
        if (r3 != r11) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cb, code lost:
    
        if (r37 >= r32) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02cd, code lost:
    
        r11 = r3;
        r16 = r6;
        r9 = r12;
        r32 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r12 == r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d5, code lost:
    
        if (r6 >= r13) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d7, code lost:
    
        r10 = r3;
        r13 = r6;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02db, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e0, code lost:
    
        if (r13 == Long.MAX_VALUE) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02e2, code lost:
    
        if (r10 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ea, code lost:
    
        if (r16 >= (r13 + 10485760)) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ec, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02ed, code lost:
    
        r43.f7401p = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r15 = r11.f7416a;
        r5 = 2817;
        r25 = 8;
        r8 = 2820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f0, code lost:
    
        if (r8 != (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02f6, code lost:
    
        r3 = r43.f7381A[r43.f7401p];
        r6 = r3.f7378c;
        r14 = r3.f7380e;
        r7 = r3.f7377b;
        r9 = r7.f7454c[r14] + r43.f7410y;
        r8 = r7.f7455d[r14];
        r4 = (r9 - r4) + r43.f7402q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0317, code lost:
    
        if (r4 < 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x031b, code lost:
    
        if (r4 < 262144) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x031f, code lost:
    
        r2 = r3.f7376a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0324, code lost:
    
        if (r2.f7427h != 1) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0326, code lost:
    
        r4 = r4 + 8;
        r8 = r8 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r12 == r9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x032a, code lost:
    
        r44.j((int) r4);
        r4 = r2.f7426g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0339, code lost:
    
        if (j$.util.Objects.equals(r4.f8232n, com.unity3d.services.core.device.MimeTypes.VIDEO_H264) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x033b, code lost:
    
        r43.f7405t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x033d, code lost:
    
        r2 = r2.k;
        r5 = r3.f7379d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0341, code lost:
    
        if (r2 == 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0343, code lost:
    
        r4 = r43.f7390d;
        r9 = r4.f9702a;
        r9[0] = 0;
        r9[1] = 0;
        r9[2] = 0;
        r11 = r2 + 1;
        r2 = 4 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0357, code lost:
    
        if (r43.f7403r >= r8) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0359, code lost:
    
        r10 = r43.f7404s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x035b, code lost:
    
        if (r10 != 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r12 != r4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x035d, code lost:
    
        r44.readFully(r9, r2, r11);
        r43.f7402q += r11;
        r4.G(0);
        r12 = r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x036e, code lost:
    
        if (r12 < 1) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0370, code lost:
    
        r43.f7404s = r12 - 1;
        r12 = r43.f7389c;
        r12.G(0);
        r10 = r30;
        r6.e(r10, r12);
        r6.e(1, r4);
        r43.f7403r += 5;
        r8 = r8 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0389, code lost:
    
        if (r43.f7405t != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0391, code lost:
    
        if (R1.n.c(r9[r10]) == false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0393, code lost:
    
        r43.f7405t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0395, code lost:
    
        r30 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x039f, code lost:
    
        throw N1.D.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r16 = r44.getPosition();
        r11 = (int) ((r44.i() - r44.getPosition()) - r11.f7418c);
        r12 = new Q1.o(r11);
        r44.readFully(r12.f9702a, r6, r11);
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03a0, code lost:
    
        r10 = r6.d(r44, r10, false);
        r43.f7402q += r10;
        r43.f7403r += r10;
        r43.f7404s -= r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03b5, code lost:
    
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03bf, code lost:
    
        if ("audio/ac4".equals(r4.f8232n) == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03c3, code lost:
    
        if (r43.f7403r != 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03c5, code lost:
    
        s2.AbstractC3991a.i(r8, r15);
        r4 = 7;
        r6.e(7, r15);
        r43.f7403r += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03d2, code lost:
    
        r4 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03d3, code lost:
    
        r8 = r8 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03d5, code lost:
    
        if (r5 == null) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03d7, code lost:
    
        r5.f(r44);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03da, code lost:
    
        r2 = r43.f7403r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03dc, code lost:
    
        if (r2 >= r8) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03de, code lost:
    
        r2 = r6.d(r44, r8 - r2, false);
        r43.f7402q += r2;
        r43.f7403r += r2;
        r43.f7404s -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03f5, code lost:
    
        r8 = r7.f7457f[r14];
        r0 = r7.f7458g[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03ff, code lost:
    
        if (r43.f7405t != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0401, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0404, code lost:
    
        if (r5 == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0406, code lost:
    
        r5.d(r6, r8, r0, r10, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0418, code lost:
    
        if ((r14 + 1) != r7.f7453b) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r0 >= r15.size()) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x041a, code lost:
    
        r5.b(r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x041f, code lost:
    
        r6.a(r8, r0, r10, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0428, code lost:
    
        r3.f7380e++;
        r43.f7401p = -1;
        r43.f7402q = 0;
        r43.f7403r = 0;
        r43.f7404s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x043a, code lost:
    
        if ((r14 & 32) != 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x043c, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x043e, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x043f, code lost:
    
        r43.f7405t = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0441, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0442, code lost:
    
        r45.f5655a = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0446, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r9 = (M2.p) r15.get(r0);
        r18 = r15;
        r12.G((int) (r9.f7412a - r16));
        r12.H(r7);
        r11 = r12.j();
        r14 = java.nio.charset.StandardCharsets.UTF_8;
        r15 = r12.s(r11, r14);
        r30 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0447, code lost:
    
        r5 = r4;
        r6 = r43.f7398m - r43.f7399n;
        r8 = r44.getPosition() + r6;
        r3 = r43.f7400o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0456, code lost:
    
        if (r3 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0458, code lost:
    
        r44.readFully(r3.f9702a, r43.f7399n, (int) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0465, code lost:
    
        if (r43.f7397l != 1718909296) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0467, code lost:
    
        r43.f7406u = true;
        r3.G(8);
        r6 = r3.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0479, code lost:
    
        if (r6 == 1751476579) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x047b, code lost:
    
        if (r6 == 1903435808) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x047d, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x047f, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0481, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        switch(r15.hashCode()) {
            case -1711564334: goto L39;
            case -1332107749: goto L35;
            case -1251387154: goto L31;
            case -830665521: goto L27;
            case 1760745220: goto L23;
            default: goto L22;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0482, code lost:
    
        if (r6 == 0) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0485, code lost:
    
        r3.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x048d, code lost:
    
        if (r3.a() <= 0) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x048f, code lost:
    
        r6 = r3.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0493, code lost:
    
        if (r6 == 1751476579) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0495, code lost:
    
        if (r6 == 1903435808) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0497, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0499, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x049b, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x049c, code lost:
    
        if (r6 == 0) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x049f, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04a0, code lost:
    
        r43.f7385E = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04a7, code lost:
    
        if (r12.isEmpty() != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04a9, code lost:
    
        ((R1.b) r12.peek()).f10095d.add(new R1.c(r43.f7397l, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04be, code lost:
    
        if (r43.f7406u != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04c5, code lost:
    
        if (r43.f7397l != 1835295092) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04c7, code lost:
    
        r43.f7385E = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04cc, code lost:
    
        if (r6 >= 262144) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04ce, code lost:
    
        r44.j((int) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04d2, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04d4, code lost:
    
        r45.f5655a = r44.getPosition() + r6;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04dc, code lost:
    
        m(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04e1, code lost:
    
        if (r43.f7407v == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r15.equals("Super_SlowMotion_BGM") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04e3, code lost:
    
        r43.f7409x = true;
        r45.f5655a = r43.f7408w;
        r43.f7407v = false;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04ee, code lost:
    
        if (r3 == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04f3, code lost:
    
        if (r43.k == 2) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04f5, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04f7, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04f8, code lost:
    
        if (r3 == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04fa, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (r15.equals("Super_SlowMotion_Deflickering_On") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r15.equals("Super_SlowMotion_Data") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (r15.equals("Super_SlowMotion_Edit_Data") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0704, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r15.equals("SlowMotion_Data") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        switch(r7) {
            case 0: goto L50;
            case 1: goto L49;
            case 2: goto L48;
            case 3: goto L47;
            case 4: goto L46;
            default: goto L391;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
    
        throw N1.D.a(null, "Invalid SEF name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        r7 = 2817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        r7 = 2820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        r7 = 2816;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
    
        r7 = 2819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        r7 = 2192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
    
        r9 = r9.f7413b - (r11 + 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (r7 == 2192) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        if (r7 == 2816) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
    
        if (r7 == 2817) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e4, code lost:
    
        if (r7 == 2819) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e6, code lost:
    
        if (r7 != 2820) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ee, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f2, code lost:
    
        r7 = new java.util.ArrayList();
        r9 = M2.q.f7415e.E(r12.s(r9, r14));
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0106, code lost:
    
        if (r11 >= r9.size()) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0108, code lost:
    
        r14 = M2.q.f7414d.E((java.lang.CharSequence) r9.get(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0118, code lost:
    
        if (r14.size() != r4) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
    
        r7.add(new H2.b(java.lang.Long.parseLong((java.lang.String) r14.get(r6)), java.lang.Long.parseLong((java.lang.String) r14.get(1)), 1 << (java.lang.Integer.parseInt((java.lang.String) r14.get(2)) - 1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014a, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0153, code lost:
    
        throw N1.D.a(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0159, code lost:
    
        throw N1.D.a(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015a, code lost:
    
        r3.add(new H2.c(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0163, code lost:
    
        r0 = r0 + 1;
        r15 = r18;
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016b, code lost:
    
        r45.f5655a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016f, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0177, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r11 == r10) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0178, code lost:
    
        r18 = r15;
        r14 = r44.i();
        r3 = r11.f7418c - 20;
        r7 = new Q1.o(r3);
        r44.readFully(r7.f9702a, r6, r3);
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
    
        if (r0 >= (r3 / 12)) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0191, code lost:
    
        r7.H(2);
        r12 = r7.f9702a;
        r9 = r7.f9703b;
        r6 = r9 + 1;
        r7.f9703b = r6;
        r4 = r12[r9] & org.apache.tika.fork.ForkServer.ERROR;
        r7.f9703b = r9 + 2;
        r4 = (short) (r4 | ((r12[r6] & org.apache.tika.fork.ForkServer.ERROR) << 8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b1, code lost:
    
        if (r4 == 2192) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b3, code lost:
    
        if (r4 == 2816) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b5, code lost:
    
        if (r4 == r5) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b9, code lost:
    
        if (r4 == 2819) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bb, code lost:
    
        if (r4 == r8) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bd, code lost:
    
        r7.H(r25);
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c9, code lost:
    
        r4 = r18;
        r4.add(new M2.p((r14 - r11.f7418c) - r7.j(), r7.j()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e3, code lost:
    
        r0 = r0 + 1;
        r18 = r4;
        r5 = 2817;
        r8 = 2820;
        r25 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f0, code lost:
    
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f6, code lost:
    
        if (r4.isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f8, code lost:
    
        r45.f5655a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ff, code lost:
    
        r11.f7417b = 3;
        r45.f5655a = ((M2.p) r4.get(0)).f7412a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020f, code lost:
    
        r4 = new Q1.o(8);
        r44.readFully(r4.f9702a, r6, 8);
        r11.f7418c = r4.j() + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r11 == r9) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0705 A[LOOP:1: B:4:0x000b->B:373:0x0705, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0704 A[SYNTHETIC] */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r44, J5.n r45) throws N1.D {
        /*
            Method dump skipped, instructions count: 1846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.o.k(s2.n, J5.n):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        if (r7 >= r5) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0231, code lost:
    
        r7 = r4.h() + r7;
        r8 = r4.h();
        r33 = r5;
        r5 = (r8 >> 24) & 255;
        r34 = r9;
        r35 = r14;
        r36 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x024f, code lost:
    
        if (r5 == 169) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0253, code lost:
    
        if (r5 != 253) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x025d, code lost:
    
        if (r8 != 1735291493) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x025f, code lost:
    
        r5 = G2.k.a(M2.r.g(r4) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0269, code lost:
    
        if (r5 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x026b, code lost:
    
        r8 = new G2.o("TCON", null, l8.AbstractC3409K.n(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0276, code lost:
    
        r9 = null;
        Q1.k.w("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027c, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0286, code lost:
    
        if (r8 != 1684632427) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0288, code lost:
    
        r8 = M2.r.f(r8, r4, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x028f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0295, code lost:
    
        if (r8 != 1953655662) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0297, code lost:
    
        r8 = M2.r.f(r8, r4, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a1, code lost:
    
        if (r8 != 1953329263) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a3, code lost:
    
        r8 = M2.r.h(r8, "TBPM", r4, r32, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b0, code lost:
    
        if (r8 != 1668311404) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b2, code lost:
    
        r8 = M2.r.h(r8, "TCMP", r4, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02bd, code lost:
    
        if (r8 != 1668249202) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02bf, code lost:
    
        r8 = M2.r.e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c7, code lost:
    
        if (r8 != 1631670868) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c9, code lost:
    
        r8 = M2.r.j(r8, r4, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d3, code lost:
    
        if (r8 != 1936682605) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d5, code lost:
    
        r8 = M2.r.j(r8, r4, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02df, code lost:
    
        if (r8 != 1936679276) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e1, code lost:
    
        r8 = M2.r.j(r8, r4, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02eb, code lost:
    
        if (r8 != 1936679282) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ed, code lost:
    
        r8 = M2.r.j(r8, r4, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f7, code lost:
    
        if (r8 != 1936679265) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f9, code lost:
    
        r8 = M2.r.j(r8, r4, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0304, code lost:
    
        if (r8 != 1936679791) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0306, code lost:
    
        r8 = M2.r.j(r8, r4, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0311, code lost:
    
        if (r8 != 1920233063) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0313, code lost:
    
        r8 = M2.r.h(r8, "ITUNESADVISORY", r4, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x031f, code lost:
    
        if (r8 != 1885823344) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0321, code lost:
    
        r8 = M2.r.h(r8, "ITUNESGAPLESS", r4, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x032e, code lost:
    
        if (r8 != 1936683886) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0330, code lost:
    
        r8 = M2.r.j(r8, r4, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x033b, code lost:
    
        if (r8 != 1953919848) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x033d, code lost:
    
        r8 = M2.r.j(r8, r4, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0348, code lost:
    
        if (r8 != 757935405) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x034a, code lost:
    
        r8 = null;
        r14 = null;
        r3 = -1;
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x034e, code lost:
    
        r15 = r4.f9703b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0350, code lost:
    
        if (r15 >= r7) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0352, code lost:
    
        r21 = r4.h();
        r9 = r4.h();
        r37 = r5;
        r4.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0363, code lost:
    
        if (r9 != 1835360622) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0365, code lost:
    
        r8 = r4.q(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0372, code lost:
    
        if (r9 != 1851878757) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0374, code lost:
    
        r14 = r4.q(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x037e, code lost:
    
        if (r9 != 1684108385) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0380, code lost:
    
        r3 = r15;
        r37 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0383, code lost:
    
        r4.H(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0388, code lost:
    
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x038c, code lost:
    
        r37 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0391, code lost:
    
        if (r8 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0393, code lost:
    
        if (r14 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0396, code lost:
    
        if (r3 != (-1)) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0399, code lost:
    
        r4.G(r3);
        r4.H(r23);
        r9 = new G2.l(r8, r14, r4.q(r37 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03ae, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03b1, code lost:
    
        r9 = 16777215 & r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03b8, code lost:
    
        if (r9 != 6516084) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03ba, code lost:
    
        r8 = M2.r.d(r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03c3, code lost:
    
        if (r9 == 7233901) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03c8, code lost:
    
        if (r9 != 7631467) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03cf, code lost:
    
        if (r9 == 6516589) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03d4, code lost:
    
        if (r9 != 7828084) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03db, code lost:
    
        if (r9 != 6578553) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03dd, code lost:
    
        r8 = M2.r.j(r8, r4, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03e8, code lost:
    
        if (r9 != 4280916) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03ea, code lost:
    
        r8 = M2.r.j(r8, r4, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03f5, code lost:
    
        if (r9 != 7630703) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03f7, code lost:
    
        r8 = M2.r.j(r8, r4, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0402, code lost:
    
        if (r9 != 6384738) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0404, code lost:
    
        r8 = M2.r.j(r8, r4, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x040f, code lost:
    
        if (r9 != 7108978) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0411, code lost:
    
        r8 = M2.r.j(r8, r4, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x041c, code lost:
    
        if (r9 != 6776174) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x041e, code lost:
    
        r8 = M2.r.j(r8, r4, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0427, code lost:
    
        if (r9 != 6779504) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0429, code lost:
    
        r8 = M2.r.j(r8, r4, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0431, code lost:
    
        Q1.k.j("MetadataUtil", "Skipped unknown metadata entry: " + H5.a.f(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0444, code lost:
    
        r4.G(r7);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0449, code lost:
    
        r8 = M2.r.j(r8, r4, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0451, code lost:
    
        r8 = M2.r.j(r8, r4, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0459, code lost:
    
        if (r8 == null) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x045b, code lost:
    
        r6.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x045e, code lost:
    
        r5 = r33;
        r9 = r34;
        r14 = r35;
        r3 = r36;
        r23 = 16;
        r32 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x046f, code lost:
    
        r4.G(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0472, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0473, code lost:
    
        r36 = r3;
        r34 = r9;
        r35 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x047d, code lost:
    
        if (r6.isEmpty() == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x047f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0484, code lost:
    
        r3 = new N1.B(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x021f, code lost:
    
        r4.G(r5);
        r5 = r5 + r6;
        r4.H(8);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022d, code lost:
    
        r7 = r4.f9703b;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x086e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(long r41) throws N1.D {
        /*
            Method dump skipped, instructions count: 2181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.o.m(long):void");
    }

    @Override // s2.m
    public final void release() {
    }
}
