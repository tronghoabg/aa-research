package defpackage;

import android.content.ComponentName;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final class rrc extends rqy {
    public final xxh A;
    public final xxh B;
    public final xxh C;
    public final xxh D;
    public final xxh E;
    public final yfq F;
    public final xxh G;
    public final xxh H;
    public final xxh I;
    public final xxh J;
    public final xxh K;
    public final xxh L;
    public final xxh M;
    public final xxh N;
    public final xxh O;
    public final xxh P;
    public final xxh Q;
    public final xxh R;
    public final xxh S;
    public final xxh T;
    public final xxh U;
    public final xxh V;
    public final xxh W;
    public final xxh X;
    public final xxh Y;
    public final xxh Z;
    public final yxc a;
    public final xxh aa;
    public final xxh ab;
    public final xxh ac;
    public final xxh ad;
    public final xxh ae;
    public final xxh af;
    public final xxh ag;
    public final xxh ah;
    public final yxy b;
    public final xxh c;
    public final xxh d;
    public final xxh e;
    public final yfq f;
    public final ygr g;
    public final yzz h;
    public final yzy i;
    public final xxh j;
    public final xxh k;
    public final xxh l;
    public final xxh m;
    public final xxh n;
    public final xxh o;
    public final xxh p;
    public final xxh q;
    public final xxh r;
    public final xxh s;
    public final xxh t;
    public final xxh u;
    public final xxh v;
    public final yfq w;
    public final xxh x;
    public final xxh y;
    public final xxh z;

    public rrc(yxc yxcVar, yxy yxyVar, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, yfq yfqVar, ygr ygrVar, yzz yzzVar, yzy yzyVar, xxh xxhVar4, xxh xxhVar5, xxh xxhVar6, xxh xxhVar7, xxh xxhVar8, xxh xxhVar9, xxh xxhVar10, xxh xxhVar11, xxh xxhVar12, xxh xxhVar13, xxh xxhVar14, xxh xxhVar15, xxh xxhVar16, yfq yfqVar2, xxh xxhVar17, xxh xxhVar18, xxh xxhVar19, xxh xxhVar20, xxh xxhVar21, xxh xxhVar22, xxh xxhVar23, xxh xxhVar24, yfq yfqVar3, xxh xxhVar25, xxh xxhVar26, xxh xxhVar27, xxh xxhVar28, xxh xxhVar29, xxh xxhVar30, xxh xxhVar31, xxh xxhVar32, xxh xxhVar33, xxh xxhVar34, xxh xxhVar35, xxh xxhVar36, xxh xxhVar37, xxh xxhVar38, xxh xxhVar39, xxh xxhVar40, xxh xxhVar41, xxh xxhVar42, xxh xxhVar43, xxh xxhVar44, xxh xxhVar45, xxh xxhVar46, xxh xxhVar47, xxh xxhVar48, xxh xxhVar49, xxh xxhVar50, xxh xxhVar51, xxh xxhVar52) {
        this.a = yxcVar;
        this.b = yxyVar;
        this.c = xxhVar;
        this.d = xxhVar2;
        this.e = xxhVar3;
        this.f = yfqVar;
        this.g = ygrVar;
        this.h = yzzVar;
        this.i = yzyVar;
        this.j = xxhVar4;
        this.k = xxhVar5;
        this.l = xxhVar6;
        this.m = xxhVar7;
        this.n = xxhVar8;
        this.o = xxhVar9;
        this.p = xxhVar10;
        this.q = xxhVar11;
        this.r = xxhVar12;
        this.s = xxhVar13;
        this.t = xxhVar14;
        this.u = xxhVar15;
        this.v = xxhVar16;
        this.w = yfqVar2;
        this.x = xxhVar17;
        this.y = xxhVar18;
        this.z = xxhVar19;
        this.A = xxhVar20;
        this.B = xxhVar21;
        this.C = xxhVar22;
        this.D = xxhVar23;
        this.E = xxhVar24;
        this.F = yfqVar3;
        this.G = xxhVar25;
        this.H = xxhVar26;
        this.I = xxhVar27;
        this.J = xxhVar28;
        this.K = xxhVar29;
        this.L = xxhVar30;
        this.M = xxhVar31;
        this.N = xxhVar32;
        this.O = xxhVar33;
        this.P = xxhVar34;
        this.Q = xxhVar35;
        this.R = xxhVar36;
        this.S = xxhVar37;
        this.T = xxhVar38;
        this.U = xxhVar39;
        this.V = xxhVar40;
        this.W = xxhVar41;
        this.X = xxhVar42;
        this.Y = xxhVar43;
        this.Z = xxhVar44;
        this.aa = xxhVar45;
        this.ab = xxhVar46;
        this.ac = xxhVar47;
        this.ad = xxhVar48;
        this.ae = xxhVar49;
        this.af = xxhVar50;
        this.ag = xxhVar51;
        this.ah = xxhVar52;
    }

    public static rrb h(yxy yxyVar, yzz yzzVar, yzy yzyVar) {
        rrb rrbVar = new rrb((byte[]) null);
        rrbVar.a = yxc.UI;
        rrbVar.b = yxyVar;
        if (yzzVar == null) {
            throw new NullPointerException("Null context");
        }
        rrbVar.e = yzzVar;
        if (yzyVar == null) {
            throw new NullPointerException("Null action");
        }
        rrbVar.f = yzyVar;
        return rrbVar;
    }

    @Override // defpackage.rqy
    public final xxh a() {
        return this.c;
    }

    @Override // defpackage.rqy
    public final xxh b() {
        return this.d;
    }

    @Override // defpackage.rqy
    public final yfq c() {
        return this.f;
    }

    @Override // defpackage.rqy
    public final ygr d() {
        return this.g;
    }

    @Override // defpackage.rqy
    public final yxc e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rrc) {
            rrc rrcVar = (rrc) obj;
            if (this.a.equals(rrcVar.a) && this.b.equals(rrcVar.b) && this.c.equals(rrcVar.c) && this.d.equals(rrcVar.d) && this.e.equals(rrcVar.e) && yrm.W(this.f, rrcVar.f) && this.g.equals(rrcVar.g) && this.h.equals(rrcVar.h) && this.i.equals(rrcVar.i) && this.j.equals(rrcVar.j) && this.k.equals(rrcVar.k) && this.l.equals(rrcVar.l) && this.m.equals(rrcVar.m) && this.n.equals(rrcVar.n) && this.o.equals(rrcVar.o) && this.p.equals(rrcVar.p) && this.q.equals(rrcVar.q) && this.r.equals(rrcVar.r) && this.s.equals(rrcVar.s) && this.t.equals(rrcVar.t) && this.u.equals(rrcVar.u) && this.v.equals(rrcVar.v) && yrm.W(this.w, rrcVar.w) && this.x.equals(rrcVar.x) && this.y.equals(rrcVar.y) && this.z.equals(rrcVar.z) && this.A.equals(rrcVar.A) && this.B.equals(rrcVar.B) && this.C.equals(rrcVar.C) && this.D.equals(rrcVar.D) && this.E.equals(rrcVar.E) && yrm.W(this.F, rrcVar.F) && this.G.equals(rrcVar.G) && this.H.equals(rrcVar.H) && this.I.equals(rrcVar.I) && this.J.equals(rrcVar.J) && this.K.equals(rrcVar.K) && this.L.equals(rrcVar.L) && this.M.equals(rrcVar.M) && this.N.equals(rrcVar.N) && this.O.equals(rrcVar.O) && this.P.equals(rrcVar.P) && this.Q.equals(rrcVar.Q) && this.R.equals(rrcVar.R) && this.S.equals(rrcVar.S) && this.T.equals(rrcVar.T) && this.U.equals(rrcVar.U) && this.V.equals(rrcVar.V) && this.W.equals(rrcVar.W) && this.X.equals(rrcVar.X) && this.Y.equals(rrcVar.Y) && this.Z.equals(rrcVar.Z) && this.aa.equals(rrcVar.aa) && this.ab.equals(rrcVar.ab) && this.ac.equals(rrcVar.ac) && this.ad.equals(rrcVar.ad) && this.ae.equals(rrcVar.ae) && this.af.equals(rrcVar.af) && this.ag.equals(rrcVar.ag) && this.ah.equals(rrcVar.ah)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rqy
    public final yxy f() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.rqy
    public final abnp g() {
        abnp abnpVarG = super.g();
        abnp abnpVarN = zab.a.n();
        int i = this.h.he;
        abnpVarN.t();
        zab zabVar = (zab) abnpVarN.b;
        zabVar.b |= 1;
        zabVar.d = i;
        int iA = this.i.a();
        abnpVarN.t();
        zab zabVar2 = (zab) abnpVarN.b;
        zabVar2.b |= 2;
        zabVar2.e = iA;
        xxh xxhVar = this.j;
        if (xxhVar.f()) {
            long jLongValue = ((Long) xxhVar.b()).longValue();
            abnpVarN.t();
            zab zabVar3 = (zab) abnpVarN.b;
            zabVar3.b |= 4;
            zabVar3.f = jLongValue;
        }
        xxh xxhVar2 = this.k;
        if (xxhVar2.f()) {
            Object objB = xxhVar2.b();
            abnpVarN.t();
            zab zabVar4 = (zab) abnpVarN.b;
            zabVar4.b |= 8;
            zabVar4.g = (String) objB;
        }
        xxh xxhVar3 = this.m;
        if (xxhVar3.f()) {
            int iIntValue = ((Integer) xxhVar3.b()).intValue();
            abnpVarN.t();
            zab zabVar5 = (zab) abnpVarN.b;
            zabVar5.b |= 32;
            zabVar5.i = iIntValue;
        }
        xxh xxhVar4 = this.n;
        if (xxhVar4.f()) {
            int i2 = ((yzr) xxhVar4.b()).J;
            abnpVarN.t();
            zab zabVar6 = (zab) abnpVarN.b;
            zabVar6.b |= 64;
            zabVar6.j = i2;
        }
        xxh xxhVar5 = this.o;
        if (xxhVar5.f()) {
            Object objB2 = xxhVar5.b();
            abnpVarN.t();
            zab zabVar7 = (zab) abnpVarN.b;
            zabVar7.k = (yyl) objB2;
            zabVar7.b |= 128;
        }
        xxh xxhVar6 = this.A;
        if (xxhVar6.f()) {
            Object objB3 = xxhVar6.b();
            abnpVarN.t();
            zab zabVar8 = (zab) abnpVarN.b;
            zabVar8.v = (yzc) objB3;
            zabVar8.b |= 131072;
        }
        xxh xxhVar7 = this.B;
        if (xxhVar7.f()) {
            Object objB4 = xxhVar7.b();
            abnpVarN.t();
            zab zabVar9 = (zab) abnpVarN.b;
            zabVar9.w = (yzd) objB4;
            zabVar9.b |= 262144;
        }
        xxh xxhVar8 = this.C;
        if (xxhVar8.f()) {
            Object objB5 = xxhVar8.b();
            abnpVarN.t();
            zab zabVar10 = (zab) abnpVarN.b;
            zabVar10.x = (yza) objB5;
            zabVar10.b |= 524288;
        }
        xxh xxhVar9 = this.p;
        if (xxhVar9.f()) {
            Object objB6 = xxhVar9.b();
            abnpVarN.t();
            zab zabVar11 = (zab) abnpVarN.b;
            zabVar11.b |= 256;
            zabVar11.l = (String) objB6;
        }
        xxh xxhVar10 = this.q;
        if (xxhVar10.f()) {
            int iIntValue2 = ((Integer) xxhVar10.b()).intValue();
            abnpVarN.t();
            zab zabVar12 = (zab) abnpVarN.b;
            zabVar12.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            zabVar12.m = iIntValue2;
        }
        xxh xxhVar11 = this.r;
        if (xxhVar11.f()) {
            int i3 = ((yzk) xxhVar11.b()).i;
            abnpVarN.t();
            zab zabVar13 = (zab) abnpVarN.b;
            zabVar13.b |= 1024;
            zabVar13.n = i3;
        }
        xxh xxhVar12 = this.s;
        if (xxhVar12.f()) {
            int iIntValue3 = ((Integer) xxhVar12.b()).intValue();
            abnpVarN.t();
            zab zabVar14 = (zab) abnpVarN.b;
            zabVar14.b |= 2048;
            zabVar14.o = iIntValue3;
        }
        xxh xxhVar13 = this.t;
        if (xxhVar13.f()) {
            Object objB7 = xxhVar13.b();
            abnpVarN.t();
            zab zabVar15 = (zab) abnpVarN.b;
            zabVar15.b |= 4096;
            zabVar15.p = (String) objB7;
        }
        xxh xxhVar14 = this.u;
        if (xxhVar14.f()) {
            int i4 = ((yzq) xxhVar14.b()).e;
            abnpVarN.t();
            zab zabVar16 = (zab) abnpVarN.b;
            zabVar16.b |= 8192;
            zabVar16.q = i4;
        }
        xxh xxhVar15 = this.v;
        if (xxhVar15.f()) {
            String strFlattenToString = ((ComponentName) xxhVar15.b()).flattenToString();
            abnpVarN.t();
            zab zabVar17 = (zab) abnpVarN.b;
            strFlattenToString.getClass();
            zabVar17.b |= 16384;
            zabVar17.r = strFlattenToString;
        }
        yfq yfqVar = this.w;
        int size = yfqVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            String strFlattenToString2 = ((ComponentName) yfqVar.get(i5)).flattenToString();
            abnpVarN.t();
            zab zabVar18 = (zab) abnpVarN.b;
            strFlattenToString2.getClass();
            zabVar18.b();
            zabVar18.y.add(strFlattenToString2);
        }
        xxh xxhVar16 = this.x;
        if (xxhVar16.f()) {
            int iIntValue4 = ((Integer) xxhVar16.b()).intValue();
            abnpVarN.t();
            zab zabVar19 = (zab) abnpVarN.b;
            zabVar19.b |= 32768;
            zabVar19.s = iIntValue4;
        }
        xxh xxhVar17 = this.y;
        if (xxhVar17.f()) {
            int i6 = ((zaa) xxhVar17.b()).ai;
            abnpVarN.t();
            zab zabVar20 = (zab) abnpVarN.b;
            zabVar20.b |= 65536;
            zabVar20.t = i6;
        }
        xxh xxhVar18 = this.E;
        if (xxhVar18.f()) {
            CarRegionId carRegionId = (CarRegionId) xxhVar18.b();
            int i7 = carRegionId.g;
            abnpVarN.t();
            zab zabVar21 = (zab) abnpVarN.b;
            zabVar21.b |= 2097152;
            zabVar21.A = i7;
            int i8 = carRegionId.h.b;
            abnpVarN.t();
            zab zabVar22 = (zab) abnpVarN.b;
            zabVar22.b |= 1048576;
            zabVar22.z = i8;
        }
        xxh xxhVar19 = this.z;
        if (xxhVar19.f()) {
            Object objB8 = xxhVar19.b();
            abnp abnpVarN2 = yzg.a.n();
            rqw rqwVar = (rqw) objB8;
            int i9 = rqwVar.a.D;
            abnpVarN2.t();
            yzg yzgVar = (yzg) abnpVarN2.b;
            yzgVar.b |= 1;
            yzgVar.c = i9;
            int i10 = rqwVar.b.az;
            abnpVarN2.t();
            yzg yzgVar2 = (yzg) abnpVarN2.b;
            yzgVar2.b |= 2;
            yzgVar2.d = i10;
            xxh xxhVar20 = rqwVar.c;
            if (xxhVar20.f()) {
                long jLongValue2 = ((Long) xxhVar20.b()).longValue();
                abnpVarN2.t();
                yzg yzgVar3 = (yzg) abnpVarN2.b;
                yzgVar3.b |= 4;
                yzgVar3.e = jLongValue2;
            }
            yzg yzgVar4 = (yzg) abnpVarN2.q();
            abnpVarG.t();
            yxb yxbVar = (yxb) abnpVarG.b;
            yxb yxbVar2 = yxb.a;
            yzgVar4.getClass();
            yxbVar.s = yzgVar4;
            yxbVar.b |= 65536;
        }
        xxh xxhVar21 = this.G;
        if (xxhVar21.f()) {
            Object objB9 = xxhVar21.b();
            abnpVarN.t();
            zab zabVar23 = (zab) abnpVarN.b;
            zabVar23.b |= 134217728;
            zabVar23.D = (String) objB9;
        }
        xxh xxhVar22 = this.H;
        if (xxhVar22.f()) {
            Object objB10 = xxhVar22.b();
            abnpVarN.t();
            zab zabVar24 = (zab) abnpVarN.b;
            zabVar24.b |= 268435456;
            zabVar24.E = (String) objB10;
        }
        xxh xxhVar23 = this.I;
        if (xxhVar23.f()) {
            Object objB11 = xxhVar23.b();
            abnpVarN.t();
            zab zabVar25 = (zab) abnpVarN.b;
            zabVar25.C = (yzn) objB11;
            zabVar25.b |= 33554432;
        }
        xxh xxhVar24 = this.J;
        if (xxhVar24.f()) {
            Object objB12 = xxhVar24.b();
            abnpVarN.t();
            zab zabVar26 = (zab) abnpVarN.b;
            zabVar26.F = (ywx) objB12;
            zabVar26.b |= 536870912;
        }
        xxh xxhVar25 = this.K;
        if (xxhVar25.f()) {
            int i11 = ((ywy) xxhVar25.b()).g;
            abnpVarN.t();
            zab zabVar27 = (zab) abnpVarN.b;
            zabVar27.b |= 1073741824;
            zabVar27.G = i11;
        }
        xxh xxhVar26 = this.T;
        if (xxhVar26.f()) {
            Object objB13 = xxhVar26.b();
            abnpVarN.t();
            zab zabVar28 = (zab) abnpVarN.b;
            zabVar28.H = (yxa) objB13;
            zabVar28.b |= Integer.MIN_VALUE;
        }
        xxh xxhVar27 = this.M;
        if (xxhVar27.f()) {
            long jLongValue3 = ((Long) xxhVar27.b()).longValue();
            abnpVarN.t();
            zab zabVar29 = (zab) abnpVarN.b;
            zabVar29.c |= 2;
            zabVar29.I = jLongValue3;
        }
        xxh xxhVar28 = this.O;
        if (xxhVar28.f()) {
            Object objB14 = xxhVar28.b();
            abnpVarN.t();
            zab zabVar30 = (zab) abnpVarN.b;
            zabVar30.c |= 16;
            zabVar30.L = (String) objB14;
        }
        xxh xxhVar29 = this.P;
        if (xxhVar29.f()) {
            Object objB15 = xxhVar29.b();
            abnpVarN.t();
            zab zabVar31 = (zab) abnpVarN.b;
            zabVar31.c |= 32;
            zabVar31.M = (String) objB15;
        }
        xxh xxhVar30 = this.Q;
        if (xxhVar30.f()) {
            int iIntValue5 = ((Integer) xxhVar30.b()).intValue();
            abnpVarN.t();
            zab zabVar32 = (zab) abnpVarN.b;
            zabVar32.c |= 64;
            zabVar32.N = iIntValue5;
        }
        xxh xxhVar31 = this.S;
        if (xxhVar31.f()) {
            boolean zBooleanValue = ((Boolean) xxhVar31.b()).booleanValue();
            abnpVarN.t();
            zab zabVar33 = (zab) abnpVarN.b;
            zabVar33.c |= 256;
            zabVar33.O = zBooleanValue;
        }
        xxh xxhVar32 = this.U;
        if (xxhVar32.f()) {
            Object objB16 = xxhVar32.b();
            abnpVarN.t();
            zab zabVar34 = (zab) abnpVarN.b;
            zabVar34.P = (yyu) objB16;
            zabVar34.c |= 2048;
        }
        xxh xxhVar33 = this.V;
        if (xxhVar33.f()) {
            Object objB17 = xxhVar33.b();
            abnpVarN.t();
            zab zabVar35 = (zab) abnpVarN.b;
            zabVar35.Q = (yww) objB17;
            zabVar35.c |= 8192;
        }
        xxh xxhVar34 = this.W;
        if (xxhVar34.f()) {
            Object objB18 = xxhVar34.b();
            abnpVarN.t();
            zab zabVar36 = (zab) abnpVarN.b;
            zabVar36.R = (yym) objB18;
            zabVar36.c |= 16384;
        }
        xxh xxhVar35 = this.X;
        if (xxhVar35.f()) {
            Object objB19 = xxhVar35.b();
            abnpVarN.t();
            zab zabVar37 = (zab) abnpVarN.b;
            zabVar37.S = (yxw) objB19;
            zabVar37.c |= 32768;
        }
        xxh xxhVar36 = this.Y;
        if (xxhVar36.f()) {
            Object objB20 = xxhVar36.b();
            abnpVarN.t();
            zab zabVar38 = (zab) abnpVarN.b;
            zabVar38.T = (yyn) objB20;
            zabVar38.c |= 65536;
        }
        xxh xxhVar37 = this.Z;
        if (xxhVar37.f()) {
            Object objB21 = xxhVar37.b();
            abnpVarN.t();
            zab zabVar39 = (zab) abnpVarN.b;
            zabVar39.U = (yyp) objB21;
            zabVar39.c |= 131072;
        }
        xxh xxhVar38 = this.aa;
        if (xxhVar38.f()) {
            int iIntValue6 = ((Integer) xxhVar38.b()).intValue();
            abnpVarN.t();
            zab zabVar40 = (zab) abnpVarN.b;
            zabVar40.c |= 262144;
            zabVar40.V = iIntValue6;
        }
        xxh xxhVar39 = this.ab;
        if (xxhVar39.f()) {
            int iIntValue7 = ((Integer) xxhVar39.b()).intValue();
            abnpVarN.t();
            zab zabVar41 = (zab) abnpVarN.b;
            zabVar41.c |= 524288;
            zabVar41.W = iIntValue7;
        }
        xxh xxhVar40 = this.ac;
        if (xxhVar40.f()) {
            int iIntValue8 = ((Integer) xxhVar40.b()).intValue();
            abnpVarN.t();
            zab zabVar42 = (zab) abnpVarN.b;
            zabVar42.c |= 1048576;
            zabVar42.X = iIntValue8;
        }
        xxh xxhVar41 = this.ad;
        if (xxhVar41.f()) {
            Object objB22 = xxhVar41.b();
            abnpVarN.t();
            zab zabVar43 = (zab) abnpVarN.b;
            zabVar43.Y = ((yxj) objB22).f;
            zabVar43.c |= 2097152;
        }
        xxh xxhVar42 = this.ah;
        if (xxhVar42.f()) {
            ?? B = xxhVar42.b();
            abnpVarN.t();
            zab zabVar44 = (zab) abnpVarN.b;
            abog abogVar = zabVar44.Z;
            if (!abogVar.c()) {
                zabVar44.Z = abnv.H(abogVar);
            }
            abmc.i(B, zabVar44.Z);
        }
        yfq yfqVar2 = this.F;
        abnpVarN.t();
        zab zabVar45 = (zab) abnpVarN.b;
        aboh abohVar = zabVar45.u;
        if (!abohVar.c()) {
            int size2 = abohVar.size();
            zabVar45.u = abohVar.d(size2 + size2);
        }
        abmc.i(yfqVar2, zabVar45.u);
        abnpVarG.t();
        yxb yxbVar3 = (yxb) abnpVarG.b;
        zab zabVar46 = (zab) abnpVarN.q();
        yxb yxbVar4 = yxb.a;
        zabVar46.getClass();
        yxbVar3.o = zabVar46;
        yxbVar3.b |= 4096;
        return abnpVarG;
    }

    public final int hashCode() {
        return this.ah.hashCode() ^ ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.v.hashCode()) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.x.hashCode()) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A.hashCode()) * 1000003) ^ this.B.hashCode()) * 1000003) ^ this.C.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.E.hashCode()) * 1000003) ^ this.F.hashCode()) * 1000003) ^ this.G.hashCode()) * 1000003) ^ this.H.hashCode()) * 1000003) ^ this.I.hashCode()) * 1000003) ^ this.J.hashCode()) * 1000003) ^ this.K.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.M.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.O.hashCode()) * 1000003) ^ this.P.hashCode()) * 1000003) ^ this.Q.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.S.hashCode()) * 1000003) ^ this.T.hashCode()) * 1000003) ^ this.U.hashCode()) * 1000003) ^ this.V.hashCode()) * 1000003) ^ this.W.hashCode()) * 1000003) ^ this.X.hashCode()) * 1000003) ^ this.Y.hashCode()) * 1000003) ^ this.Z.hashCode()) * 1000003) ^ this.aa.hashCode()) * 1000003) ^ this.ab.hashCode()) * 1000003) ^ this.ac.hashCode()) * 1000003) ^ this.ad.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003);
    }

    public final String toString() {
        xxh xxhVar = this.X;
        xxh xxhVar2 = this.W;
        xxh xxhVar3 = this.V;
        xxh xxhVar4 = this.U;
        xxh xxhVar5 = this.T;
        xxh xxhVar6 = this.S;
        xxh xxhVar7 = this.R;
        xxh xxhVar8 = this.Q;
        xxh xxhVar9 = this.P;
        xxh xxhVar10 = this.O;
        xxh xxhVar11 = this.N;
        xxh xxhVar12 = this.M;
        xxh xxhVar13 = this.L;
        xxh xxhVar14 = this.K;
        xxh xxhVar15 = this.J;
        xxh xxhVar16 = this.I;
        xxh xxhVar17 = this.H;
        xxh xxhVar18 = this.G;
        yfq yfqVar = this.F;
        xxh xxhVar19 = this.E;
        xxh xxhVar20 = this.D;
        xxh xxhVar21 = this.C;
        xxh xxhVar22 = this.B;
        xxh xxhVar23 = this.A;
        xxh xxhVar24 = this.z;
        xxh xxhVar25 = this.y;
        xxh xxhVar26 = this.x;
        yfq yfqVar2 = this.w;
        xxh xxhVar27 = this.v;
        xxh xxhVar28 = this.u;
        xxh xxhVar29 = this.t;
        xxh xxhVar30 = this.s;
        xxh xxhVar31 = this.r;
        xxh xxhVar32 = this.q;
        xxh xxhVar33 = this.p;
        xxh xxhVar34 = this.o;
        xxh xxhVar35 = this.n;
        xxh xxhVar36 = this.m;
        xxh xxhVar37 = this.l;
        xxh xxhVar38 = this.k;
        xxh xxhVar39 = this.j;
        yzy yzyVar = this.i;
        yzz yzzVar = this.h;
        ygr ygrVar = this.g;
        yfq yfqVar3 = this.f;
        xxh xxhVar40 = this.e;
        xxh xxhVar41 = this.d;
        xxh xxhVar42 = this.c;
        yxy yxyVar = this.b;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(yxyVar);
        String strValueOf3 = String.valueOf(xxhVar42);
        String strValueOf4 = String.valueOf(xxhVar41);
        String strValueOf5 = String.valueOf(xxhVar40);
        String strValueOf6 = String.valueOf(yfqVar3);
        String strValueOf7 = String.valueOf(ygrVar);
        String strValueOf8 = String.valueOf(yzzVar);
        String strValueOf9 = String.valueOf(yzyVar);
        String strValueOf10 = String.valueOf(xxhVar39);
        String strValueOf11 = String.valueOf(xxhVar38);
        String strValueOf12 = String.valueOf(xxhVar37);
        String strValueOf13 = String.valueOf(xxhVar36);
        String strValueOf14 = String.valueOf(xxhVar35);
        String strValueOf15 = String.valueOf(xxhVar34);
        String strValueOf16 = String.valueOf(xxhVar33);
        String strValueOf17 = String.valueOf(xxhVar32);
        String strValueOf18 = String.valueOf(xxhVar31);
        String strValueOf19 = String.valueOf(xxhVar30);
        String strValueOf20 = String.valueOf(xxhVar29);
        String strValueOf21 = String.valueOf(xxhVar28);
        String strValueOf22 = String.valueOf(xxhVar27);
        String strValueOf23 = String.valueOf(yfqVar2);
        String strValueOf24 = String.valueOf(xxhVar26);
        String strValueOf25 = String.valueOf(xxhVar25);
        String strValueOf26 = String.valueOf(xxhVar24);
        String strValueOf27 = String.valueOf(xxhVar23);
        String strValueOf28 = String.valueOf(xxhVar22);
        String strValueOf29 = String.valueOf(xxhVar21);
        String strValueOf30 = String.valueOf(xxhVar20);
        String strValueOf31 = String.valueOf(xxhVar19);
        String strValueOf32 = String.valueOf(yfqVar);
        String strValueOf33 = String.valueOf(xxhVar18);
        String strValueOf34 = String.valueOf(xxhVar17);
        String strValueOf35 = String.valueOf(xxhVar16);
        String strValueOf36 = String.valueOf(xxhVar15);
        String strValueOf37 = String.valueOf(xxhVar14);
        String strValueOf38 = String.valueOf(xxhVar13);
        String strValueOf39 = String.valueOf(xxhVar12);
        String strValueOf40 = String.valueOf(xxhVar11);
        String strValueOf41 = String.valueOf(xxhVar10);
        String strValueOf42 = String.valueOf(xxhVar9);
        String strValueOf43 = String.valueOf(xxhVar8);
        String strValueOf44 = String.valueOf(xxhVar7);
        String strValueOf45 = String.valueOf(xxhVar6);
        String strValueOf46 = String.valueOf(xxhVar5);
        String strValueOf47 = String.valueOf(xxhVar4);
        String strValueOf48 = String.valueOf(xxhVar3);
        String strValueOf49 = String.valueOf(xxhVar2);
        String strValueOf50 = String.valueOf(xxhVar);
        xxh xxhVar43 = this.Y;
        xxh xxhVar44 = this.Z;
        xxh xxhVar45 = this.aa;
        xxh xxhVar46 = this.ab;
        xxh xxhVar47 = this.ac;
        xxh xxhVar48 = this.ad;
        xxh xxhVar49 = this.ae;
        xxh xxhVar50 = this.af;
        xxh xxhVar51 = this.ag;
        xxh xxhVar52 = this.ah;
        return "UiLogEvent{carEventType=" + strValueOf + ", domainIdType=" + strValueOf2 + ", lifetimeId=" + strValueOf3 + ", sessionId=" + strValueOf4 + ", gearheadInfo=" + strValueOf5 + ", domainLifetimeIds=" + strValueOf6 + ", testCodes=" + strValueOf7 + ", context=" + strValueOf8 + ", action=" + strValueOf9 + ", durationMs=" + strValueOf10 + ", appPackage=" + strValueOf11 + ", screen=" + strValueOf12 + ", drawerLevel=" + strValueOf13 + ", streamItemType=" + strValueOf14 + ", handwritingEvent=" + strValueOf15 + ", customMediaAction=" + strValueOf16 + ", position=" + strValueOf17 + ", customFeedbackAction=" + strValueOf18 + ", itemsLoadedCount=" + strValueOf19 + ", locale=" + strValueOf20 + ", streamItemExtra=" + strValueOf21 + ", componentName=" + strValueOf22 + ", componentNames=" + strValueOf23 + ", eventCount=" + strValueOf24 + ", error=" + strValueOf25 + ", projectionErrorLogEvent=" + strValueOf26 + ", phoneCapabilities=" + strValueOf27 + ", projectionAppValidationInfo=" + strValueOf28 + ", notificationEvent=" + strValueOf29 + ", carDisplayId=" + strValueOf30 + ", carRegionId=" + strValueOf31 + ", permissions=" + strValueOf32 + ", carAppSdkVersion=" + strValueOf33 + ", carAppTemplateType=" + strValueOf34 + ", stateChange=" + strValueOf35 + ", carAppCall=" + strValueOf36 + ", carAppCategory=" + strValueOf37 + ", customWallpaperId=" + strValueOf38 + ", componentVersionCode=" + strValueOf39 + ", navigationStatusStats=" + strValueOf40 + ", clientAnrDebugString=" + strValueOf41 + ", hatsTriggerId=" + strValueOf42 + ", carConnectionType=" + strValueOf43 + ", crashCookieBucketId=" + strValueOf44 + ", isWorkProfile=" + strValueOf45 + ", carAppContentLimitQuery=" + strValueOf46 + ", mtmcBytesEvent=" + strValueOf47 + ", callContactPhotoEvent=" + strValueOf48 + ", icsAdapterState=" + strValueOf49 + ", dndState=" + strValueOf50 + ", icsBindingState=" + String.valueOf(xxhVar43) + ", icsCallAudioState=" + String.valueOf(xxhVar44) + ", processExitReason=" + String.valueOf(xxhVar45) + ", callDisconnectCause=" + String.valueOf(xxhVar46) + ", callId=" + String.valueOf(xxhVar47) + ", connectionResetOrigin=" + String.valueOf(xxhVar48) + ", isLowMemory=" + String.valueOf(xxhVar49) + ", availMemory=" + String.valueOf(xxhVar50) + ", totalMemory=" + String.valueOf(xxhVar51) + ", eventTimestampsMs=" + String.valueOf(xxhVar52) + "}";
    }

    public rrc() {
        throw null;
    }
}
