package defpackage;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final class ppr implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final acku f;

    public ppr(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6) {
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
        this.f = ackuVar6;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* bridge */ /* synthetic */ Object a() {
        aasr aasrVarA = ((pnt) this.a).a();
        aaoj aaojVarA = ((pos) this.b).a();
        accn accnVarA = ((pnw) this.c).a();
        acdh acdhVarA = ((pob) this.d).a();
        aaxq aaxqVarA = ((ppg) this.e).a();
        aaqn aaqnVarA = ((ppk) this.f).a();
        xuv xuvVarB = xuw.b("provideClientPlatformConfig");
        try {
            abnp abnpVarN = uyb.a.n();
            abnp abnpVarN2 = uyc.a.n();
            if ((aasrVarA.c & 4) != 0) {
                boolean z = aasrVarA.n;
                abnpVarN2.t();
                uyc uycVar = (uyc) abnpVarN2.b;
                uycVar.b |= 1;
                uycVar.c = z;
            }
            uyc uycVar2 = (uyc) abnpVarN2.q();
            abnpVarN.t();
            uyb uybVar = (uyb) abnpVarN.b;
            uycVar2.getClass();
            uybVar.h = uycVar2;
            uybVar.b |= 32;
            abnp abnpVarN3 = uyi.a.n();
            if ((aaojVarA.b & 4096) != 0) {
                boolean z2 = aaojVarA.g;
                abnpVarN3.t();
                uyi uyiVar = (uyi) abnpVarN3.b;
                uyiVar.b |= 1;
                uyiVar.c = z2;
            }
            if ((aaojVarA.b & 1024) != 0) {
                int i = aaojVarA.f;
                abnpVarN3.t();
                uyi uyiVar2 = (uyi) abnpVarN3.b;
                uyiVar2.b |= 2;
                uyiVar2.d = i;
            }
            if ((aaojVarA.b & 256) != 0) {
                String str = aaojVarA.d;
                abnpVarN3.t();
                uyi uyiVar3 = (uyi) abnpVarN3.b;
                str.getClass();
                uyiVar3.b |= 4;
                uyiVar3.e = str;
            }
            if ((aaojVarA.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                String str2 = aaojVarA.e;
                abnpVarN3.t();
                uyi uyiVar4 = (uyi) abnpVarN3.b;
                str2.getClass();
                uyiVar4.b |= 8;
                uyiVar4.f = str2;
            }
            if ((aaojVarA.b & Integer.MIN_VALUE) != 0) {
                boolean z3 = aaojVarA.m;
                abnpVarN3.t();
                uyi uyiVar5 = (uyi) abnpVarN3.b;
                uyiVar5.b |= 16;
                uyiVar5.g = z3;
            }
            if ((aaojVarA.c & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                boolean z4 = aaojVarA.p;
                abnpVarN3.t();
                uyi uyiVar6 = (uyi) abnpVarN3.b;
                uyiVar6.b |= 32;
                uyiVar6.h = z4;
            }
            uyi uyiVar7 = (uyi) abnpVarN3.q();
            abnpVarN.t();
            uyb uybVar2 = (uyb) abnpVarN.b;
            uyiVar7.getClass();
            uybVar2.c = uyiVar7;
            uybVar2.b |= 1;
            abnp abnpVarN4 = uyd.a.n();
            if ((accnVarA.b & 2) != 0) {
                int i2 = accnVarA.c;
                abnpVarN4.t();
                uyd uydVar = (uyd) abnpVarN4.b;
                uydVar.b |= 1;
                uydVar.c = i2;
            }
            if ((accnVarA.b & 4) != 0) {
                int i3 = accnVarA.d;
                abnpVarN4.t();
                uyd uydVar2 = (uyd) abnpVarN4.b;
                uydVar2.b |= 2;
                uydVar2.d = i3;
            }
            uyd uydVar3 = (uyd) abnpVarN4.q();
            abnpVarN.t();
            uyb uybVar3 = (uyb) abnpVarN.b;
            uydVar3.getClass();
            uybVar3.d = uydVar3;
            uybVar3.b |= 2;
            abnp abnpVarN5 = uyh.a.n();
            abod abodVar = acdhVarA.i;
            abnpVarN5.t();
            uyh uyhVar = (uyh) abnpVarN5.b;
            abod abodVar2 = uyhVar.c;
            if (!abodVar2.c()) {
                uyhVar.c = abnv.G(abodVar2);
            }
            abmc.i(abodVar, uyhVar.c);
            if ((acdhVarA.c & 4194304) != 0) {
                int i4 = acdhVarA.n;
                abnpVarN5.t();
                uyh uyhVar2 = (uyh) abnpVarN5.b;
                uyhVar2.b |= 1;
                uyhVar2.d = i4;
            }
            abod abodVar3 = acdhVarA.l;
            abnpVarN5.t();
            uyh uyhVar3 = (uyh) abnpVarN5.b;
            abod abodVar4 = uyhVar3.e;
            if (!abodVar4.c()) {
                uyhVar3.e = abnv.G(abodVar4);
            }
            abmc.i(abodVar3, uyhVar3.e);
            if ((acdhVarA.c & Integer.MIN_VALUE) != 0) {
                zav zavVar = acdhVarA.o;
                if (zavVar == null) {
                    zavVar = zav.a;
                }
                abnpVarN5.t();
                uyh uyhVar4 = (uyh) abnpVarN5.b;
                zavVar.getClass();
                uyhVar4.f = zavVar;
                uyhVar4.b |= 2;
            }
            if ((acdhVarA.e & 67108864) != 0) {
                boolean z5 = acdhVarA.t;
                abnpVarN5.t();
                uyh uyhVar5 = (uyh) abnpVarN5.b;
                uyhVar5.b |= 4;
                uyhVar5.g = z5;
            }
            if ((acdhVarA.e & 16384) != 0) {
                boolean z6 = acdhVarA.r;
                abnpVarN5.t();
                uyh uyhVar6 = (uyh) abnpVarN5.b;
                uyhVar6.b |= 8;
                uyhVar6.h = z6;
            }
            if ((acdhVarA.e & 32768) != 0) {
                Function function = pps.a;
                acdf acdfVarB = acdf.b(acdhVarA.s);
                if (acdfVarB == null) {
                    acdfVarB = acdf.UNKNOWN_UE3_REPORTER_FLUSH_STRATEGY;
                }
                uyf uyfVar = (uyf) function.apply(acdfVarB);
                abnpVarN5.t();
                uyh uyhVar7 = (uyh) abnpVarN5.b;
                uyhVar7.i = uyfVar.e;
                uyhVar7.b |= 16;
            }
            if ((acdhVarA.d & 2) != 0) {
                boolean z7 = acdhVarA.p;
                abnpVarN5.t();
                uyh uyhVar8 = (uyh) abnpVarN5.b;
                uyhVar8.b |= 32;
                uyhVar8.j = z7;
            }
            if ((acdhVarA.d & 256) != 0) {
                boolean z8 = acdhVarA.q;
                abnpVarN5.t();
                uyh uyhVar9 = (uyh) abnpVarN5.b;
                uyhVar9.b |= 64;
                uyhVar9.k = z8;
            }
            if ((acdhVarA.b & 262144) != 0) {
                Function function2 = pps.b;
                acdg acdgVarB = acdg.b(acdhVarA.k);
                if (acdgVarB == null) {
                    acdgVarB = acdg.GMM_SERVER_ONLY;
                }
                uyg uygVar = (uyg) function2.apply(acdgVarB);
                abnpVarN5.t();
                uyh uyhVar10 = (uyh) abnpVarN5.b;
                uyhVar10.l = uygVar.f;
                uyhVar10.b |= 128;
            }
            if ((acdhVarA.b & 8) != 0) {
                int i5 = acdhVarA.h;
                abnpVarN5.t();
                uyh uyhVar11 = (uyh) abnpVarN5.b;
                uyhVar11.b |= 256;
                uyhVar11.m = i5;
            }
            if ((acdhVarA.b & 4) != 0) {
                int i6 = acdhVarA.g;
                abnpVarN5.t();
                uyh uyhVar12 = (uyh) abnpVarN5.b;
                uyhVar12.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                uyhVar12.n = i6;
            }
            if ((acdhVarA.c & 32768) != 0) {
                int i7 = acdhVarA.m;
                abnpVarN5.t();
                uyh uyhVar13 = (uyh) abnpVarN5.b;
                uyhVar13.b |= 1024;
                uyhVar13.o = i7;
            }
            if ((acdhVarA.f & 131072) != 0) {
                boolean z9 = acdhVarA.u;
                abnpVarN5.t();
                uyh uyhVar14 = (uyh) abnpVarN5.b;
                uyhVar14.b |= 2048;
                uyhVar14.p = z9;
            }
            if ((acdhVarA.f & 4194304) != 0) {
                boolean z10 = acdhVarA.v;
                abnpVarN5.t();
                uyh uyhVar15 = (uyh) abnpVarN5.b;
                uyhVar15.b |= 4096;
                uyhVar15.q = z10;
            }
            if ((acdhVarA.f & 8388608) != 0) {
                int i8 = acdhVarA.w;
                abnpVarN5.t();
                uyh uyhVar16 = (uyh) abnpVarN5.b;
                uyhVar16.b |= 8192;
                uyhVar16.r = i8;
            }
            if ((acdhVarA.f & 16777216) != 0) {
                boolean z11 = acdhVarA.x;
                abnpVarN5.t();
                uyh uyhVar17 = (uyh) abnpVarN5.b;
                uyhVar17.b |= 16384;
                uyhVar17.s = z11;
            }
            if ((acdhVarA.f & Integer.MIN_VALUE) != 0) {
                boolean z12 = acdhVarA.y;
                abnpVarN5.t();
                uyh uyhVar18 = (uyh) abnpVarN5.b;
                uyhVar18.b |= 32768;
                uyhVar18.t = z12;
            }
            uyh uyhVar19 = (uyh) abnpVarN5.q();
            abnpVarN.t();
            uyb uybVar4 = (uyb) abnpVarN.b;
            uyhVar19.getClass();
            uybVar4.e = uyhVar19;
            uybVar4.b |= 4;
            abnp abnpVarN6 = uyj.a.n();
            if ((aaxqVarA.c & 8) != 0) {
                boolean z13 = aaxqVarA.g;
                abnpVarN6.t();
                uyj uyjVar = (uyj) abnpVarN6.b;
                uyjVar.b |= 1;
                uyjVar.c = z13;
            }
            if ((aaxqVarA.c & 2097152) != 0) {
                boolean z14 = aaxqVarA.m;
                abnpVarN6.t();
                uyj uyjVar2 = (uyj) abnpVarN6.b;
                uyjVar2.b |= 2;
                uyjVar2.d = z14;
            }
            if ((aaxqVarA.c & 128) != 0) {
                boolean z15 = aaxqVarA.i;
                abnpVarN6.t();
                uyj uyjVar3 = (uyj) abnpVarN6.b;
                uyjVar3.b |= 4;
                uyjVar3.e = z15;
            }
            if ((aaxqVarA.c & 16) != 0) {
                boolean z16 = aaxqVarA.h;
                abnpVarN6.t();
                uyj uyjVar4 = (uyj) abnpVarN6.b;
                uyjVar4.b |= 8;
                uyjVar4.f = z16;
            }
            if ((aaxqVarA.b & 4) != 0) {
                boolean z17 = aaxqVarA.d;
                abnpVarN6.t();
                uyj uyjVar5 = (uyj) abnpVarN6.b;
                uyjVar5.b |= 16;
                uyjVar5.g = z17;
            }
            if ((aaxqVarA.b & 8) != 0) {
                boolean z18 = aaxqVarA.e;
                abnpVarN6.t();
                uyj uyjVar6 = (uyj) abnpVarN6.b;
                uyjVar6.b |= 32;
                uyjVar6.h = z18;
            }
            if ((aaxqVarA.b & 16) != 0) {
                boolean z19 = aaxqVarA.f;
                abnpVarN6.t();
                uyj uyjVar7 = (uyj) abnpVarN6.b;
                uyjVar7.b |= 64;
                uyjVar7.i = z19;
            }
            if ((aaxqVarA.c & 8192) != 0) {
                boolean z20 = aaxqVarA.j;
                abnpVarN6.t();
                uyj uyjVar8 = (uyj) abnpVarN6.b;
                uyjVar8.b |= 128;
                uyjVar8.j = z20;
            }
            if ((aaxqVarA.c & 16384) != 0) {
                boolean z21 = aaxqVarA.k;
                abnpVarN6.t();
                uyj uyjVar9 = (uyj) abnpVarN6.b;
                uyjVar9.b |= 256;
                uyjVar9.k = z21;
            }
            uyj uyjVar10 = (uyj) abnpVarN6.q();
            abnpVarN.t();
            uyb uybVar5 = (uyb) abnpVarN.b;
            uyjVar10.getClass();
            uybVar5.f = uyjVar10;
            uybVar5.b |= 8;
            abnp abnpVarN7 = uyk.a.n();
            abod abodVar5 = aaqnVarA.b;
            abnpVarN7.t();
            uyk uykVar = (uyk) abnpVarN7.b;
            abod abodVar6 = uykVar.b;
            if (!abodVar6.c()) {
                uykVar.b = abnv.G(abodVar6);
            }
            abmc.i(abodVar5, uykVar.b);
            uyk uykVar2 = (uyk) abnpVarN7.q();
            abnpVarN.t();
            uyb uybVar6 = (uyb) abnpVarN.b;
            uykVar2.getClass();
            uybVar6.g = uykVar2;
            uybVar6.b |= 16;
            uyb uybVar7 = (uyb) abnpVarN.q();
            xuvVarB.close();
            uybVar7.getClass();
            return uybVar7;
        } catch (Throwable th) {
            try {
                xuvVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
