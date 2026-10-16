package R5;

import J5.t;
import J5.x;
import f6.C2584N;
import java.util.ArrayDeque;
import java.util.ArrayList;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public final class k implements J5.k, t {

    /* renamed from: i, reason: collision with root package name */
    public int f10325i;

    /* renamed from: j, reason: collision with root package name */
    public long f10326j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public Y4.b f10327l;

    /* renamed from: n, reason: collision with root package name */
    public int f10329n;

    /* renamed from: o, reason: collision with root package name */
    public int f10330o;

    /* renamed from: p, reason: collision with root package name */
    public int f10331p;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f10334s;

    /* renamed from: t, reason: collision with root package name */
    public int f10335t;

    /* renamed from: u, reason: collision with root package name */
    public long f10336u;

    /* renamed from: v, reason: collision with root package name */
    public int f10337v;

    /* renamed from: h, reason: collision with root package name */
    public int f10324h = 0;

    /* renamed from: f, reason: collision with root package name */
    public final m f10322f = new m();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f10323g = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Y4.b f10320d = new Y4.b(16);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f10321e = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    public final Y4.b f10317a = new Y4.b(AbstractC4256a.f46662d);

    /* renamed from: b, reason: collision with root package name */
    public final Y4.b f10318b = new Y4.b(4);

    /* renamed from: c, reason: collision with root package name */
    public final Y4.b f10319c = new Y4.b();

    /* renamed from: m, reason: collision with root package name */
    public int f10328m = -1;

    /* renamed from: q, reason: collision with root package name */
    public J5.m f10332q = J5.m.f5654N8;

    /* renamed from: r, reason: collision with root package name */
    public j[] f10333r = new j[0];

    @Override // J5.k
    public final void a(long j8, long j10) {
        this.f10321e.clear();
        this.k = 0;
        this.f10328m = -1;
        this.f10329n = 0;
        this.f10330o = 0;
        this.f10331p = 0;
        if (j8 == 0) {
            if (this.f10324h != 3) {
                this.f10324h = 0;
                this.k = 0;
                return;
            } else {
                m mVar = this.f10322f;
                mVar.f10342a.clear();
                mVar.f10343b = 0;
                this.f10323g.clear();
                return;
            }
        }
        for (j jVar : this.f10333r) {
            p pVar = jVar.f10313b;
            int iE = v.e(pVar.f10365f, j10, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((pVar.f10366g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = pVar.a(j10);
            }
            jVar.f10316e = iE;
            x xVar = jVar.f10315d;
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
    @Override // J5.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final J5.s c(long r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R5.k.c(long):J5.s");
    }

    @Override // J5.t
    public final boolean e() {
        return true;
    }

    @Override // J5.t
    public final long f() {
        return this.f10336u;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04ae, code lost:
    
        r3 = r10;
        r8 = r42.k;
        r9 = r42.f10320d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04b9, code lost:
    
        if (r8 != 0) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04c3, code lost:
    
        if (r43.f(r9.f16679a, 0, 8, r3) != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04c5, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04c8, code lost:
    
        r42.k = 8;
        r9.A(0);
        r42.f10326j = r9.r();
        r42.f10325i = r9.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04de, code lost:
    
        r7 = r42.f10326j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04e4, code lost:
    
        if (r7 != 1) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04e6, code lost:
    
        r43.readFully(r9.f16679a, 8, 8);
        r42.k += 8;
        r42.f10326j = r9.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04fd, code lost:
    
        if (r7 != 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04ff, code lost:
    
        r7 = r43.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0505, code lost:
    
        if (r7 != (-1)) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0507, code lost:
    
        r11 = (R5.a) r12.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x050d, code lost:
    
        if (r11 == null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x050f, code lost:
    
        r7 = r11.f10256c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0513, code lost:
    
        if (r7 == (-1)) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0515, code lost:
    
        r42.f10326j = (r7 - r43.getPosition()) + r42.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0520, code lost:
    
        r7 = r42.f10326j;
        r11 = r42.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0527, code lost:
    
        if (r7 < r11) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0529, code lost:
    
        r7 = r42.f10325i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0534, code lost:
    
        if (r7 == 1836019574) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0539, code lost:
    
        if (r7 == 1953653099) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x053e, code lost:
    
        if (r7 == 1835297121) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0543, code lost:
    
        if (r7 == 1835626086) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0548, code lost:
    
        if (r7 == 1937007212) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x054d, code lost:
    
        if (r7 == 1701082227) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x054f, code lost:
    
        if (r7 != 1835365473) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0557, code lost:
    
        if (r7 == 1835296868) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x055c, code lost:
    
        if (r7 == 1836476516) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x055e, code lost:
    
        if (r7 == 1751411826) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0563, code lost:
    
        if (r7 == 1937011556) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0568, code lost:
    
        if (r7 == 1937011827) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x056d, code lost:
    
        if (r7 == 1937011571) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0572, code lost:
    
        if (r7 == 1668576371) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0577, code lost:
    
        if (r7 == 1701606260) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x057c, code lost:
    
        if (r7 == 1937011555) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0581, code lost:
    
        if (r7 == 1937011578) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0586, code lost:
    
        if (r7 == 1937013298) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x058b, code lost:
    
        if (r7 == 1937007471) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0590, code lost:
    
        if (r7 == 1668232756) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0595, code lost:
    
        if (r7 == 1953196132) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x059a, code lost:
    
        if (r7 == 1718909296) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x059f, code lost:
    
        if (r7 == 1969517665) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x05a4, code lost:
    
        if (r7 == 1801812339) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05a9, code lost:
    
        if (r7 != 1768715124) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x05ae, code lost:
    
        r7 = r43.getPosition();
        r11 = r42.k;
        r34 = r7 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05bc, code lost:
    
        if (r42.f10325i != 1836086884) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05be, code lost:
    
        new c6.C1561c(0, r34, -9223372036854775807L, r34 + r11, r42.f10326j - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05d0, code lost:
    
        r42.f10327l = null;
        r42.f10324h = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05d5, code lost:
    
        r14 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x05da, code lost:
    
        if (r11 != 8) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05dc, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05de, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05df, code lost:
    
        u6.AbstractC4256a.i(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05e9, code lost:
    
        if (r42.f10326j > 2147483647L) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05eb, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x05ed, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05ee, code lost:
    
        u6.AbstractC4256a.i(r3);
        r3 = new Y4.b((int) r42.f10326j);
        java.lang.System.arraycopy(r9.f16679a, 0, r3.f16679a, 0, 8);
        r42.f10327l = r3;
        r42.f10324h = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0608, code lost:
    
        r15 = r43.getPosition();
        r4 = r42.f10326j;
        r10 = r42.k;
        r7 = (r15 + r4) - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0616, code lost:
    
        if (r4 == r10) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x061a, code lost:
    
        if (r42.f10325i != 1835365473) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x061c, code lost:
    
        r14.x(8);
        r43.a(0, 8, r14.f16679a);
        r4 = R5.d.f10260a;
        r4 = r14.f16680b;
        r14 = 4;
        r14.B(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0635, code lost:
    
        if (r14.d() == 1751411826) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0637, code lost:
    
        r4 = r4 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0638, code lost:
    
        r14.A(r4);
        r43.j(r14.f16680b);
        r43.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0644, code lost:
    
        r14 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0647, code lost:
    
        r12.push(new R5.a(r42.f10325i, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0658, code lost:
    
        if (r42.f10326j != r42.k) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x065a, code lost:
    
        j(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x065e, code lost:
    
        r42.f10324h = 0;
        r42.k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x066d, code lost:
    
        throw E5.o0.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04a5  */
    @Override // J5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(J5.l r43, J5.n r44) throws E5.o0 {
        /*
            Method dump skipped, instructions count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R5.k.g(J5.l, J5.n):int");
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f10332q = c2584n;
    }

    @Override // J5.k
    public final boolean i(J5.l lVar) {
        return i.h(lVar, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c6, code lost:
    
        if (r13 >= r5) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c8, code lost:
    
        r30 = r11.d();
        r6 = r11.d();
        r32 = r7;
        r11.B(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01da, code lost:
    
        if (r6 != 1835360622) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01dc, code lost:
    
        r0 = r11.m(r30 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e6, code lost:
    
        if (r6 != 1851878757) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e8, code lost:
    
        r2 = r11.m(r30 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f2, code lost:
    
        if (r6 != 1684108385) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f4, code lost:
    
        r3 = r13;
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f7, code lost:
    
        r11.B(r30 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fc, code lost:
    
        r7 = r32;
        r25 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0202, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0204, code lost:
    
        if (r0 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0206, code lost:
    
        if (r2 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0209, code lost:
    
        if (r3 != (-1)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x020c, code lost:
    
        r11.A(r3);
        r11.B(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021e, code lost:
    
        r3 = new b6.j(r0, r2, r11.m(r12 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0221, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0222, code lost:
    
        r11.A(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0227, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022c, code lost:
    
        r2 = 16777215 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0233, code lost:
    
        if (r2 != 6516084) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0235, code lost:
    
        r3 = R5.i.a(r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023d, code lost:
    
        if (r2 == 7233901) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0242, code lost:
    
        if (r2 != 7631467) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0249, code lost:
    
        if (r2 == 6516589) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x024e, code lost:
    
        if (r2 != 7828084) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0255, code lost:
    
        if (r2 != 6578553) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0257, code lost:
    
        r3 = R5.i.e(r3, r11, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0261, code lost:
    
        if (r2 != 4280916) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0263, code lost:
    
        r3 = R5.i.e(r3, r11, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x026d, code lost:
    
        if (r2 != 7630703) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x026f, code lost:
    
        r3 = R5.i.e(r3, r11, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0279, code lost:
    
        if (r2 != 6384738) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x027b, code lost:
    
        r3 = R5.i.e(r3, r11, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0285, code lost:
    
        if (r2 != 7108978) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0287, code lost:
    
        r3 = R5.i.e(r3, r11, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0291, code lost:
    
        if (r2 != 6776174) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0293, code lost:
    
        r3 = R5.i.e(r3, r11, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x029b, code lost:
    
        if (r2 != 6779504) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x029d, code lost:
    
        r3 = R5.i.e(r3, r11, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02a5, code lost:
    
        u6.AbstractC4256a.n("MetadataUtil", "Skipped unknown metadata entry: " + H5.a.e(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b8, code lost:
    
        r11.A(r5);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02bd, code lost:
    
        r3 = R5.i.e(r3, r11, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02c5, code lost:
    
        r3 = R5.i.e(r3, r11, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02cd, code lost:
    
        if (r3 == null) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02cf, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d2, code lost:
    
        r0 = r20;
        r3 = r27;
        r7 = r32;
        r6 = 1;
        r25 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02e0, code lost:
    
        r11.A(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e4, code lost:
    
        r27 = r3;
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02ed, code lost:
    
        if (r4.isEmpty() == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02ef, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02f3, code lost:
    
        r20 = new W5.c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        r11.A(r0);
        r0 = r0 + r4;
        r11.B(r3);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r5 = r11.f16680b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r5 >= r0) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r5 = r11.d() + r5;
        r27 = r3;
        r3 = r11.d();
        r2 = (r3 >> 24) & 255;
        r29 = r6;
        r20 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r2 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
    
        if (r2 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c4, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        if (r3 != 1735291493) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        r2 = R5.i.g(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        if (r2 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        if (r2 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        r2 = R5.i.f10310a[r2 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
    
        if (r2 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
    
        r3 = new b6.m("TCON", null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        u6.AbstractC4256a.E("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        r11.A(r5);
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
    
        if (r3 != 1684632427) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
    
        r3 = R5.i.c(r3, r11, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
    
        if (r3 != 1953655662) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:
    
        r3 = R5.i.c(r3, r11, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
    
        if (r3 != 1953329263) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        r3 = R5.i.f(r3, "TBPM", r11, r29, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0126, code lost:
    
        if (r3 != 1668311404) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0128, code lost:
    
        r3 = R5.i.f(r3, "TCMP", r11, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0133, code lost:
    
        if (r3 != 1668249202) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0135, code lost:
    
        r3 = R5.i.b(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013d, code lost:
    
        if (r3 != 1631670868) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013f, code lost:
    
        r3 = R5.i.e(r3, r11, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
    
        if (r3 != 1936682605) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014b, code lost:
    
        r3 = R5.i.e(r3, r11, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0155, code lost:
    
        if (r3 != 1936679276) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0157, code lost:
    
        r3 = R5.i.e(r3, r11, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0161, code lost:
    
        if (r3 != 1936679282) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0163, code lost:
    
        r3 = R5.i.e(r3, r11, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016d, code lost:
    
        if (r3 != 1936679265) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016f, code lost:
    
        r3 = R5.i.e(r3, r11, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017a, code lost:
    
        if (r3 != 1936679791) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017c, code lost:
    
        r3 = R5.i.e(r3, r11, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
    
        if (r3 != 1920233063) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0189, code lost:
    
        r3 = R5.i.f(r3, "ITUNESADVISORY", r11, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0195, code lost:
    
        if (r3 != 1885823344) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0197, code lost:
    
        r3 = R5.i.f(r3, "ITUNESGAPLESS", r11, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a4, code lost:
    
        if (r3 != 1936683886) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a6, code lost:
    
        r3 = R5.i.e(r3, r11, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b1, code lost:
    
        if (r3 != 1953919848) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
    
        r3 = R5.i.e(r3, r11, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01be, code lost:
    
        if (r3 != 757935405) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c0, code lost:
    
        r0 = null;
        r2 = null;
        r3 = -1;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c4, code lost:
    
        r13 = r11.f16680b;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0589 A[PHI: r0
  0x0589: PHI (r0v23 W5.c) = (r0v12 W5.c), (r0v12 W5.c), (r0v18 W5.c), (r0v12 W5.c) binds: [B:276:0x058d, B:277:0x058f, B:368:0x0589, B:272:0x0582] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0624 A[LOOP:12: B:307:0x0621->B:309:0x0624, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0645  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r34) throws E5.o0 {
        /*
            Method dump skipped, instructions count: 1732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R5.k.j(long):void");
    }

    @Override // J5.k
    public final void release() {
    }
}
