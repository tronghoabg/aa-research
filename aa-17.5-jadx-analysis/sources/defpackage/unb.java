package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class unb implements uor {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/DashServerTileStore");
    private static final long u;
    private final uom A;
    private final Runnable B;
    private long C;
    private final tsn D;
    public final ulo c;
    public final uof d;
    public final tmb e;
    public final abgl f;
    public volatile int g;
    public final uon h;
    public final Executor j;
    public final Executor k;
    public final aezk l;
    public final uoc n;
    public final uaj o;
    public final ykd s;
    public final erb t;
    private final tpd v;
    private final tox x;
    private final ukr y;
    private volatile int z;
    public final Object b = new Object();
    private volatile boolean w = false;
    public final gms r = new gms((short[]) null, (byte[]) null);
    public final te p = new te(null);
    public final sb q = new sb((char[]) null);
    public volatile long i = 0;
    public final Map m = new EnumMap(qbn.class);

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        u = 600000L;
        int i = ysy.a;
        ysv ysvVar = ytk.a;
    }

    public unb(tox toxVar, ukr ukrVar, uoc uocVar, uon uonVar, uom uomVar, ulo uloVar, tpd tpdVar, erb erbVar, aezk aezkVar, tsn tsnVar, Runnable runnable, tmb tmbVar, Executor executor, Executor executor2, int i, ykd ykdVar, uof uofVar, uaj uajVar) {
        this.g = -1;
        this.x = toxVar;
        abgl abglVar = toxVar.c;
        this.f = abglVar;
        this.y = ukrVar;
        this.t = erbVar;
        this.l = aezkVar;
        this.D = tsnVar;
        this.B = runnable;
        this.e = tmbVar;
        this.j = executor;
        this.k = executor2;
        this.n = uocVar;
        this.v = tpdVar;
        this.d = uofVar;
        this.h = uonVar;
        this.A = uomVar;
        this.c = uloVar;
        this.g = i;
        this.s = ykdVar;
        this.z = D(abglVar, tsnVar == null ? ((zwm) aezkVar.a()).d() : tsnVar.a());
        this.o = uajVar;
    }

    private static int D(abgl abglVar, abgi abgiVar) {
        abgn abgnVar = abgiVar.c;
        if (abgnVar == null) {
            abgnVar = abgn.a;
        }
        abod abodVar = null;
        for (abgk abgkVar : abgnVar.c) {
            abgl abglVarB = abgl.b(abgkVar.c);
            if (abglVarB == null) {
                abglVarB = abgl.UNKNOWN;
            }
            if (abglVarB == abglVar) {
                abgj abgjVar = abgkVar.d;
                if (abgjVar == null) {
                    abgjVar = abgj.a;
                }
                abodVar = abgjVar.i;
            }
        }
        if (abodVar != null) {
            return e(abodVar);
        }
        return 0;
    }

    private final void E(final unv unvVar) {
        this.j.execute(new Runnable() { // from class: umy
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:123:0x025c A[Catch: all -> 0x033b, TryCatch #8 {, blocks: (B:9:0x0035, B:16:0x006a, B:70:0x0170, B:121:0x0258, B:123:0x025c, B:125:0x0260, B:127:0x0264, B:94:0x01f0, B:104:0x0200, B:103:0x01fd, B:120:0x0255, B:170:0x033a, B:169:0x0337, B:10:0x003b, B:12:0x0048, B:13:0x0051, B:15:0x0062, B:105:0x0201, B:107:0x0207, B:110:0x020e, B:112:0x0221, B:113:0x0226, B:119:0x024d, B:114:0x022c, B:116:0x023e, B:118:0x0248, B:166:0x0332, B:17:0x0073, B:20:0x007b, B:21:0x0080, B:84:0x01d3, B:86:0x01d7, B:88:0x01df, B:91:0x01e8, B:93:0x01ed, B:92:0x01eb, B:97:0x01f5, B:23:0x0083, B:24:0x00a7, B:26:0x00b2, B:29:0x00bc, B:36:0x00f2, B:43:0x010f, B:44:0x0112, B:47:0x0116, B:49:0x011e, B:50:0x0126, B:53:0x012a, B:56:0x0133, B:65:0x015f, B:66:0x0162, B:68:0x0167, B:69:0x016f, B:73:0x0184, B:75:0x0199, B:76:0x01a3, B:77:0x01ab, B:79:0x01ad, B:81:0x01c3, B:82:0x01cd, B:83:0x01d2, B:58:0x013c, B:60:0x014a, B:38:0x00fa, B:40:0x0105, B:31:0x00c7, B:100:0x01f8), top: B:196:0x0035, outer: #11, inners: #0, #5, #6, #9 }] */
            /* JADX WARN: Removed duplicated region for block: B:130:0x0275 A[Catch: all -> 0x033d, TryCatch #11 {, blocks: (B:5:0x0011, B:7:0x0015, B:8:0x0020, B:128:0x0266, B:130:0x0275, B:132:0x0279, B:134:0x0283, B:135:0x0288, B:151:0x02d5, B:160:0x032a, B:159:0x0329, B:163:0x032f, B:172:0x033c, B:137:0x02ab, B:139:0x02b4, B:141:0x02bb, B:143:0x02c1, B:150:0x02cc, B:153:0x02da, B:155:0x02e0, B:156:0x02f3, B:9:0x0035, B:16:0x006a, B:70:0x0170, B:121:0x0258, B:123:0x025c, B:125:0x0260, B:127:0x0264, B:94:0x01f0, B:104:0x0200, B:103:0x01fd, B:120:0x0255, B:170:0x033a, B:169:0x0337, B:10:0x003b, B:12:0x0048, B:13:0x0051, B:15:0x0062, B:105:0x0201, B:107:0x0207, B:110:0x020e, B:112:0x0221, B:113:0x0226, B:119:0x024d, B:114:0x022c, B:116:0x023e, B:118:0x0248, B:166:0x0332, B:17:0x0073, B:20:0x007b, B:21:0x0080, B:84:0x01d3, B:86:0x01d7, B:88:0x01df, B:91:0x01e8, B:93:0x01ed, B:92:0x01eb, B:97:0x01f5, B:23:0x0083, B:24:0x00a7, B:26:0x00b2, B:29:0x00bc, B:36:0x00f2, B:43:0x010f, B:44:0x0112, B:47:0x0116, B:49:0x011e, B:50:0x0126, B:53:0x012a, B:56:0x0133, B:65:0x015f, B:66:0x0162, B:68:0x0167, B:69:0x016f, B:73:0x0184, B:75:0x0199, B:76:0x01a3, B:77:0x01ab, B:79:0x01ad, B:81:0x01c3, B:82:0x01cd, B:83:0x01d2, B:58:0x013c, B:60:0x014a, B:38:0x00fa, B:40:0x0105, B:31:0x00c7, B:100:0x01f8), top: B:200:0x0011, outer: #1, inners: #2, #7, #8 }] */
            /* JADX WARN: Removed duplicated region for block: B:146:0x02c6  */
            /* JADX WARN: Removed duplicated region for block: B:185:0x02ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x010f A[Catch: all -> 0x00ec, TryCatch #10 {all -> 0x00ec, IOException -> 0x00c6, blocks: (B:23:0x0083, B:24:0x00a7, B:26:0x00b2, B:29:0x00bc, B:36:0x00f2, B:43:0x010f, B:44:0x0112, B:47:0x0116, B:49:0x011e, B:50:0x0126, B:53:0x012a, B:56:0x0133, B:65:0x015f, B:66:0x0162, B:68:0x0167, B:69:0x016f, B:73:0x0184, B:75:0x0199, B:76:0x01a3, B:77:0x01ab, B:79:0x01ad, B:81:0x01c3, B:82:0x01cd, B:83:0x01d2, B:58:0x013c, B:60:0x014a, B:38:0x00fa, B:40:0x0105, B:31:0x00c7), top: B:199:0x0083, outer: #6 }] */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
            /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, uko] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, uko] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 843
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.umy.run():void");
            }
        });
    }

    private static final unv F(unv unvVar, String str, boolean z) {
        return new unv(unvVar.a, unvVar.b, unvVar.c, true, true, true, str, z, unvVar.i);
    }

    public static int e(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int[] iArrAy = wub.ay(list);
        Arrays.sort(iArrAy);
        ytj ytjVar = new ytj();
        for (int i : iArrAy) {
            ytjVar.c(i);
        }
        return ((yss) ytjVar.l()).a;
    }

    public final void A(qbv qbvVar) {
    }

    public final void B(abnp abnpVar, ukp ukpVar, uls ulsVar, van vanVar, int i) {
        pjy pjyVarM = uqw.m(this.x, this.y, ukpVar, ulsVar.c, ulsVar.d);
        abnpVar.t();
        pka pkaVar = (pka) abnpVar.b;
        pka pkaVar2 = pka.a;
        pjyVarM.getClass();
        pkaVar.c = pjyVarM;
        pkaVar.b |= 1;
        abgp abgpVar = ulsVar.a;
        int i2 = abgpVar.e;
        if (i2 != 0) {
            abnpVar.t();
            pka pkaVar3 = (pka) abnpVar.b;
            pkaVar3.b |= 256;
            pkaVar3.k = i2;
        } else {
            abnpVar.t();
            pka pkaVar4 = (pka) abnpVar.b;
            pkaVar4.b &= -257;
            pkaVar4.k = 0;
        }
        tpd tpdVar = this.v;
        abgl abglVar = this.f;
        long jS = tpdVar.s(abglVar, vanVar);
        if (jS != -1) {
            abnpVar.t();
            pka pkaVar5 = (pka) abnpVar.b;
            pkaVar5.b |= 64;
            pkaVar5.i = jS;
        } else {
            abnpVar.t();
            pka pkaVar6 = (pka) abnpVar.b;
            pkaVar6.b &= -65;
            pkaVar6.i = 0L;
        }
        long jQ = tpdVar.q(abglVar, vanVar);
        if (jQ != -1) {
            abnpVar.t();
            pka pkaVar7 = (pka) abnpVar.b;
            pkaVar7.b |= 32;
            pkaVar7.h = jQ;
        } else {
            abnpVar.t();
            pka pkaVar8 = (pka) abnpVar.b;
            pkaVar8.b &= -33;
            pkaVar8.h = 0L;
        }
        if ((abgpVar.b & 1024) != 0) {
            String str = abgpVar.g;
            abnpVar.t();
            pka pkaVar9 = (pka) abnpVar.b;
            str.getClass();
            pkaVar9.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            pkaVar9.l = str;
        } else {
            abnpVar.t();
            pka pkaVar10 = (pka) abnpVar.b;
            pkaVar10.b &= -513;
            pkaVar10.l = pka.a.l;
        }
        if (i != 0) {
            abnpVar.t();
            pka pkaVar11 = (pka) abnpVar.b;
            pkaVar11.b |= 4;
            pkaVar11.e = i;
        } else {
            abnpVar.t();
            pka pkaVar12 = (pka) abnpVar.b;
            pkaVar12.b &= -5;
            pkaVar12.e = 0;
        }
        abnpVar.t();
        pka pkaVar13 = (pka) abnpVar.b;
        pkaVar13.b &= -9;
        pkaVar13.f = 0;
        abnpVar.t();
        pka pkaVar14 = (pka) abnpVar.b;
        pkaVar14.b &= -17;
        pkaVar14.g = 0;
        if ((abgpVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            abms abmsVar = abgpVar.f;
            abnpVar.t();
            pka pkaVar15 = (pka) abnpVar.b;
            abmsVar.getClass();
            pkaVar15.b |= 2048;
            pkaVar15.n = abmsVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r1.d.equals(java.util.Locale.getDefault().toLanguageTag()) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.uko C(defpackage.uoo r4, defpackage.ukp r5) {
        /*
            r3 = this;
            uko r5 = r4.f(r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            r3.o(r5)
            boolean r4 = r4.i(r5)
            if (r4 == 0) goto L12
            goto L74
        L12:
            ykd r4 = r3.s
            java.lang.String r1 = r4.p()
            boolean r1 = r3.u(r1)
            if (r1 != 0) goto L43
            pka r1 = r5.b()
            pjy r1 = r1.c
            if (r1 != 0) goto L28
            pjy r1 = defpackage.pjy.a
        L28:
            java.lang.String r1 = r1.h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L74
            pka r1 = r5.b()
            pjy r1 = r1.c
            if (r1 != 0) goto L3a
            pjy r1 = defpackage.pjy.a
        L3a:
            java.lang.String r1 = r1.d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L43
            goto L74
        L43:
            pka r1 = r5.b()
            pjy r1 = r1.c
            if (r1 != 0) goto L4d
            pjy r1 = defpackage.pjy.a
        L4d:
            java.lang.String r1 = r1.h
            java.lang.String r2 = r4.p()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L75
            pka r1 = r5.b()
            pjy r1 = r1.c
            if (r1 != 0) goto L63
            pjy r1 = defpackage.pjy.a
        L63:
            java.lang.String r1 = r1.d
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.toLanguageTag()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L74
            goto L75
        L74:
            return r5
        L75:
            pka r1 = r5.b()
            pjy r1 = r1.c
            if (r1 != 0) goto L7f
            pjy r1 = defpackage.pjy.a
        L7f:
            java.lang.String r1 = r1.h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Ld0
            pka r1 = r5.b()
            pjy r1 = r1.c
            if (r1 != 0) goto L91
            pjy r1 = defpackage.pjy.a
        L91:
            java.lang.String r1 = r1.d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L9a
            goto Ld0
        L9a:
            pka r1 = r5.b()
            pjy r1 = r1.c
            if (r1 != 0) goto La4
            pjy r1 = defpackage.pjy.a
        La4:
            java.lang.String r1 = r1.h
            java.lang.String r4 = r4.p()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lb3
            r3.x()
        Lb3:
            pka r4 = r5.b()
            pjy r4 = r4.c
            if (r4 != 0) goto Lbd
            pjy r4 = defpackage.pjy.a
        Lbd:
            java.lang.String r4 = r4.d
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.toLanguageTag()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Ld0
            r3.x()
        Ld0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unb.C(uoo, ukp):uko");
    }

    @Override // defpackage.plg
    public final String a() {
        return null;
    }

    @Override // defpackage.uor
    public final ukr b() {
        return this.y;
    }

    @Override // defpackage.uor
    public final abgl c() {
        return this.f;
    }

    @Override // defpackage.uor
    public final void d() {
        this.k.execute(new ueh(this, 17));
    }

    @Override // defpackage.plg
    public final void f(float f) {
        this.n.c.j();
    }

    @Override // defpackage.uor
    public final void g(ukp ukpVar, uoq uoqVar, boolean z) {
        E(new unv(this.f, ukpVar, uoqVar, false, z, false, "", true, new pxj()));
    }

    public final uko h(ukp ukpVar, uol uolVar, pka pkaVar, boolean z) {
        byte[] bArrE = uolVar.e(ukpVar);
        if (bArrE == null) {
            return null;
        }
        toz tozVar = uolVar.c() ? toz.f : toz.g;
        if (bArrE.length == 0) {
            return new uit(pkaVar, this.f, ukpVar, tozVar);
        }
        uom uomVar = this.A;
        abgl abglVar = this.f;
        uku ukuVarA = uomVar.a(pkaVar, abglVar, ukpVar, bArrE, uolVar.d(), tozVar);
        erb erbVar = this.t;
        int i = abglVar.am;
        tss.D(erbVar, ukuVarA);
        ukt uktVar = ukuVarA.a;
        ((ynz) a.a(uktVar == ukt.h ? Level.FINE : Level.WARNING).ai(9448)).R("unpackTileWithGivenMetadata tile unpack result: coords=%s, paintTileType=%s - %s", ukpVar, abglVar.name(), uktVar);
        return (uko) ukuVarA.b.e();
    }

    @Override // defpackage.uor
    public final void i(ukp ukpVar, uoq uoqVar) {
        pxj pxjVar = new pxj();
        ((zwm) this.l.a()).b();
        E(new unv(this.f, ukpVar, uoqVar, true, true, false, "", true, pxjVar));
    }

    public final unv j(uko ukoVar, unv unvVar) {
        if (!unvVar.e || !r() || ukoVar.d() == abgl.GMM_ROAD_GRAPH) {
            return null;
        }
        boolean z = ukoVar.b().o;
        if (this.g != 0 && this.g != ukoVar.b().k) {
            z(qbo.C);
            x();
            return F(unvVar, ukoVar.b().l, true);
        }
        if (ukoVar.b().o) {
            z(qbo.D);
            x();
            uaj uajVar = this.o;
            if (uajVar != null && uajVar.g()) {
            }
            return F(unvVar, "", false);
        }
        if (uqw.p(ukoVar.b(), this.e)) {
            z(qbo.B);
            x();
            return F(unvVar, ukoVar.b().l, true);
        }
        boolean z2 = ukoVar.b().o;
        if (ukoVar.b().e == this.z) {
            return null;
        }
        z(qbo.E);
        x();
        uaj uajVar2 = this.o;
        if (uajVar2 != null && uajVar2.g()) {
        }
        return F(unvVar, ukoVar.b().l, false);
    }

    @Override // defpackage.uor
    public final void k(urg urgVar) {
        this.r.u(urgVar);
    }

    public final void l(unv unvVar, pwu pwuVar) {
        pwu pwuVar2 = pwu.m;
        if (!pwuVar.equals(pwuVar2) && !pwuVar.equals(pwu.h) && !pwuVar.equals(pwu.j) && !pwuVar.equals(pwu.o)) {
            ((ynz) ((ynz) a.f()).ai(9440)).M("An error occurred in fetching tile from the network: %s Status: %s", unvVar, pwuVar);
            this.d.a(unvVar.b);
            p(unvVar, uop.NETWORK_ERROR, null);
            return;
        }
        ((ynz) ((ynz) a.h()).ai(9439)).M("Received status: %s from Paint server Request: %s", pwuVar, unvVar);
        if (pwuVar.equals(pwu.o)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.C > u) {
                this.C = jCurrentTimeMillis;
                this.B.run();
                uaj uajVar = this.o;
                if (uajVar == null || !uajVar.g()) {
                    return;
                }
                return;
            }
            return;
        }
        uoc uocVar = this.n;
        ukp ukpVar = unvVar.b;
        uot uotVar = (uot) uocVar.c;
        uotVar.g(ukpVar, uotVar.a);
        pwu pwuVar3 = pwu.h;
        if (pwuVar.equals(pwuVar3) || pwuVar.equals(pwuVar2)) {
            this.d.b(ukpVar);
        } else {
            this.d.a(ukpVar);
        }
        p(unvVar, uop.NOT_EXIST, null);
        if (pwuVar.equals(pwuVar2)) {
            z(qbo.V);
        } else if (pwuVar.equals(pwuVar3)) {
            z(qbo.W);
        } else if (pwuVar.equals(pwu.j)) {
            z(qbo.X);
        }
    }

    protected final void m(qbu qbuVar, unv unvVar) {
        if (unvVar.a == abgl.GMM_VECTOR_BASE) {
        }
    }

    public final void n(unv unvVar, pka pkaVar) {
        abgl abglVar = unvVar.a;
        ukp ukpVar = unvVar.b;
        this.n.c.g(ukpVar, new uit(pkaVar, abglVar, ukpVar, toz.a));
    }

    public final void o(uko ukoVar) {
        uaj uajVar;
        pka pkaVarB;
        if (ukoVar == null || (uajVar = this.o) == null || !uajVar.g() || (pkaVarB = ukoVar.b()) == null) {
            return;
        }
        abnp abnpVarN = zbu.a.n();
        abnp abnpVarN2 = zqq.a.n();
        abnp abnpVarN3 = zqp.a.n();
        tox toxVar = this.x;
        abnpVarN3.t();
        zqp zqpVar = (zqp) abnpVarN3.b;
        String str = toxVar.a;
        str.getClass();
        zqpVar.b |= 1;
        zqpVar.c = str;
        abnpVarN3.t();
        zqp zqpVar2 = (zqp) abnpVarN3.b;
        zqpVar2.d = 1;
        zqpVar2.b |= 2;
        abnpVarN2.t();
        zqq zqqVar = (zqq) abnpVarN2.b;
        zqp zqpVar3 = (zqp) abnpVarN3.q();
        zqpVar3.getClass();
        zqqVar.c = zqpVar3;
        zqqVar.b |= 64;
        abnpVarN.t();
        zbu zbuVar = (zbu) abnpVarN.b;
        zqq zqqVar2 = (zqq) abnpVarN2.q();
        zqqVar2.getClass();
        zbuVar.s = zqqVar2;
        zbuVar.e |= 2;
        if (pkaVarB.o) {
            pjy pjyVar = pkaVarB.c;
            if (pjyVar == null) {
                pjyVar = pjy.a;
            }
            if (!pjyVar.h.isEmpty()) {
                pjy pjyVar2 = pkaVarB.c;
                if (pjyVar2 == null) {
                    pjyVar2 = pjy.a;
                }
                if (!pjyVar2.h.equals(this.s.p())) {
                    return;
                }
            }
            pjy pjyVar3 = pkaVarB.c;
            if (pjyVar3 == null) {
                pjyVar3 = pjy.a;
            }
            if (!pjyVar3.d.isEmpty()) {
                pjy pjyVar4 = pkaVarB.c;
                if (pjyVar4 == null) {
                    pjyVar4 = pjy.a;
                }
                if (!pjyVar4.d.equals(Locale.getDefault().toLanguageTag())) {
                    return;
                }
            }
            return;
        }
        tmb tmbVar = this.e;
        if (uqw.n(pkaVarB, tmbVar)) {
            return;
        }
        pjy pjyVar5 = pkaVarB.c;
        if (pjyVar5 == null) {
            pjyVar5 = pjy.a;
        }
        if (!pjyVar5.h.isEmpty()) {
            pjy pjyVar6 = pkaVarB.c;
            if (pjyVar6 == null) {
                pjyVar6 = pjy.a;
            }
            if (!pjyVar6.h.equals(this.s.p())) {
                return;
            }
        }
        pjy pjyVar7 = pkaVarB.c;
        if (pjyVar7 == null) {
            pjyVar7 = pjy.a;
        }
        if (!pjyVar7.d.isEmpty()) {
            pjy pjyVar8 = pkaVarB.c;
            if (pjyVar8 == null) {
                pjyVar8 = pjy.a;
            }
            if (!pjyVar8.d.equals(Locale.getDefault().toLanguageTag())) {
                return;
            }
        }
        if (this.g != 0 && this.g != pkaVarB.k) {
            return;
        }
        if (pkaVarB.e != this.z) {
            return;
        }
        boolean zP = uqw.p(pkaVarB, tmbVar);
        erb erbVar = this.t;
        if (zP) {
        }
    }

    public final void p(unv unvVar, uop uopVar, uko ukoVar) {
        if (unvVar.c == null) {
            return;
        }
        this.j.execute(new rdz(unvVar, uopVar, ukoVar, 17));
    }

    public final void q(unv unvVar, qbn qbnVar) {
        if (unvVar.a == abgl.GMM_VECTOR_BASE) {
        }
        Map map = this.m;
        if (map.containsKey(qbnVar)) {
            map.put(qbnVar, Integer.valueOf(((Integer) map.get(qbnVar)).intValue() + 1));
        } else {
            map.put(qbnVar, 1);
        }
    }

    public final boolean r() {
        return this.g > 0 || !this.v.v(this.f);
    }

    public final boolean s(uko ukoVar) {
        return (ukoVar instanceof uit) && !this.n.c.i(ukoVar);
    }

    public final boolean t(uko ukoVar) {
        int i = ukoVar.b().j;
        ((zwm) this.l.a()).b();
        return uqw.q(i, false);
    }

    public final boolean u(String str) {
        return ((zwm) this.l.a()).b().a().contains(str);
    }

    @ResultIgnorabilityUnspecified
    public final synchronized boolean v() {
        tsn tsnVar = this.D;
        int iD = D(this.f, tsnVar == null ? ((zwm) this.l.a()).d() : tsnVar.a());
        if (iD == this.z) {
            return false;
        }
        this.z = iD;
        return true;
    }

    public final void w() {
        ((zwm) this.l.a()).b();
    }

    public final void x() {
        ((zwm) this.l.a()).b();
    }

    public final void y(qbv qbvVar) {
        abnp abnpVarN = zqq.a.n();
        abnp abnpVarN2 = zqp.a.n();
        abnpVarN2.t();
        zqp zqpVar = (zqp) abnpVarN2.b;
        String str = this.x.a;
        str.getClass();
        zqpVar.b |= 1;
        zqpVar.c = str;
        abnpVarN2.t();
        zqp zqpVar2 = (zqp) abnpVarN2.b;
        zqpVar2.d = 1;
        zqpVar2.b |= 2;
        abnpVarN.t();
        zqq zqqVar = (zqq) abnpVarN.b;
        zqp zqpVar3 = (zqp) abnpVarN2.q();
        zqpVar3.getClass();
        zqqVar.c = zqpVar3;
        zqqVar.b |= 64;
        zqq zqqVar2 = (zqq) abnpVarN.q();
        abnp abnpVarN3 = zbu.a.n();
        abnpVarN3.t();
        zbu zbuVar = (zbu) abnpVarN3.b;
        zqqVar2.getClass();
        zbuVar.s = zqqVar2;
        zbuVar.e |= 2;
    }

    protected final void z(qbu qbuVar) {
    }
}
