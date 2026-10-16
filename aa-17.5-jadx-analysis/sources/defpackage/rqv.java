package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public final class rqv extends rqy {
    private final xxh A;
    private final xxh B;
    private final xxh C;
    public final ygr a;
    public final yyv b;
    public final xxh c;
    public final int d;
    private final yxc e;
    private final yxy f;
    private final xxh g;
    private final xxh h;
    private final xxh i;
    private final yfq j;
    private final xxh k;
    private final xxh l;
    private final ygr m;
    private final xxh n;
    private final xxh o;
    private final xxh p;
    private final xxh q;
    private final xxh r;
    private final xxh s;
    private final ygr t;
    private final xxh u;
    private final xxh v;
    private final xxh w;
    private final xxh x;
    private final yfq y;
    private final xxh z;

    public rqv(yxc yxcVar, yxy yxyVar, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, yfq yfqVar, ygr ygrVar, int i, yyv yyvVar, xxh xxhVar4, xxh xxhVar5, ygr ygrVar2, xxh xxhVar6, xxh xxhVar7, xxh xxhVar8, xxh xxhVar9, xxh xxhVar10, xxh xxhVar11, xxh xxhVar12, ygr ygrVar3, xxh xxhVar13, xxh xxhVar14, xxh xxhVar15, xxh xxhVar16, yfq yfqVar2, xxh xxhVar17, xxh xxhVar18, xxh xxhVar19, xxh xxhVar20) {
        this.e = yxcVar;
        this.f = yxyVar;
        this.g = xxhVar;
        this.h = xxhVar2;
        this.i = xxhVar3;
        this.j = yfqVar;
        this.a = ygrVar;
        this.d = i;
        this.b = yyvVar;
        this.k = xxhVar4;
        this.l = xxhVar5;
        this.m = ygrVar2;
        this.n = xxhVar6;
        this.o = xxhVar7;
        this.p = xxhVar8;
        this.q = xxhVar9;
        this.c = xxhVar10;
        this.r = xxhVar11;
        this.s = xxhVar12;
        this.t = ygrVar3;
        this.u = xxhVar13;
        this.v = xxhVar14;
        this.w = xxhVar15;
        this.x = xxhVar16;
        this.y = yfqVar2;
        this.z = xxhVar17;
        this.A = xxhVar18;
        this.B = xxhVar19;
        this.C = xxhVar20;
    }

    public static rqu h(yxy yxyVar, int i, yyv yyvVar) {
        rqu rquVar = new rqu();
        rquVar.a = yxc.NON_UI;
        rquVar.b = yxyVar;
        rquVar.o = i;
        rquVar.e = yyvVar;
        return rquVar;
    }

    @Override // defpackage.rqy
    public final xxh a() {
        return this.g;
    }

    @Override // defpackage.rqy
    public final xxh b() {
        return this.h;
    }

    @Override // defpackage.rqy
    public final yfq c() {
        return this.j;
    }

    @Override // defpackage.rqy
    public final ygr d() {
        return this.a;
    }

    @Override // defpackage.rqy
    public final yxc e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqv) {
            rqv rqvVar = (rqv) obj;
            if (this.e.equals(rqvVar.e) && this.f.equals(rqvVar.f) && this.g.equals(rqvVar.g) && this.h.equals(rqvVar.h) && this.i.equals(rqvVar.i) && yrm.W(this.j, rqvVar.j) && this.a.equals(rqvVar.a)) {
                int i = this.d;
                int i2 = rqvVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(rqvVar.b) && this.k.equals(rqvVar.k) && this.l.equals(rqvVar.l) && this.m.equals(rqvVar.m) && this.n.equals(rqvVar.n) && this.o.equals(rqvVar.o) && this.p.equals(rqvVar.p) && this.q.equals(rqvVar.q) && this.c.equals(rqvVar.c) && this.r.equals(rqvVar.r) && this.s.equals(rqvVar.s) && this.t.equals(rqvVar.t) && this.u.equals(rqvVar.u) && this.v.equals(rqvVar.v) && this.w.equals(rqvVar.w) && this.x.equals(rqvVar.x) && yrm.W(this.y, rqvVar.y) && this.z.equals(rqvVar.z) && this.A.equals(rqvVar.A) && this.B.equals(rqvVar.B) && this.C.equals(rqvVar.C)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rqy
    public final yxy f() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rqy
    public final abnp g() {
        abnp abnpVarG = super.g();
        abnp abnpVarN = yyz.a.n();
        int i = this.d;
        if (i == 0) {
            throw null;
        }
        abnpVarN.t();
        yyz yyzVar = (yyz) abnpVarN.b;
        yyzVar.b |= 1;
        yyzVar.c = i - 1;
        int i2 = this.b.fI;
        abnpVarN.t();
        yyz yyzVar2 = (yyz) abnpVarN.b;
        yyzVar2.b |= 2;
        yyzVar2.d = i2;
        xxh xxhVar = this.l;
        if (xxhVar.f()) {
            long jLongValue = ((Long) xxhVar.b()).longValue();
            abnpVarN.t();
            yyz yyzVar3 = (yyz) abnpVarN.b;
            yyzVar3.b |= 4;
            yyzVar3.e = jLongValue;
        }
        xxh xxhVar2 = this.k;
        if (xxhVar2.f()) {
            long jLongValue2 = ((Long) xxhVar2.b()).longValue();
            abnpVarG.t();
            yxb yxbVar = (yxb) abnpVarG.b;
            yxb yxbVar2 = yxb.a;
            yxbVar.c |= 1;
            yxbVar.F = jLongValue2;
        }
        ygr ygrVar = this.m;
        abnpVarN.t();
        yyz yyzVar4 = (yyz) abnpVarN.b;
        aboh abohVar = yyzVar4.f;
        if (!abohVar.c()) {
            int size = abohVar.size();
            yyzVar4.f = abohVar.d(size + size);
        }
        abmc.i(ygrVar, yyzVar4.f);
        xxh xxhVar3 = this.q;
        if (xxhVar3.f()) {
            Object objB = xxhVar3.b();
            abnpVarN.t();
            yyz yyzVar5 = (yyz) abnpVarN.b;
            yyzVar5.b |= 128;
            yyzVar5.h = (String) objB;
        }
        xxh xxhVar4 = this.c;
        if (xxhVar4.f()) {
            int i3 = ((yyw) xxhVar4.b()).y;
            abnpVarN.t();
            yyz yyzVar6 = (yyz) abnpVarN.b;
            yyzVar6.b |= 256;
            yyzVar6.i = i3;
        }
        xxh xxhVar5 = this.r;
        if (xxhVar5.f()) {
            Object objB2 = xxhVar5.b();
            abnpVarN.t();
            yyz yyzVar7 = (yyz) abnpVarN.b;
            yyzVar7.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            yyzVar7.j = (String) objB2;
        }
        xxh xxhVar6 = this.s;
        if (xxhVar6.f()) {
            Object objB3 = xxhVar6.b();
            abnpVarN.t();
            yyz yyzVar8 = (yyz) abnpVarN.b;
            yyzVar8.k = (yxq) objB3;
            yyzVar8.b |= 1024;
        }
        xxh xxhVar7 = this.u;
        if (xxhVar7.f()) {
            Object objB4 = xxhVar7.b();
            abnpVarN.t();
            yyz yyzVar9 = (yyz) abnpVarN.b;
            yyzVar9.b |= 8192;
            yyzVar9.m = (String) objB4;
        }
        xxh xxhVar8 = this.x;
        if (xxhVar8.f()) {
            Object objB5 = xxhVar8.b();
            abnpVarN.t();
            yyz yyzVar10 = (yyz) abnpVarN.b;
            yyzVar10.n = (yzs) objB5;
            yyzVar10.b |= 65536;
        }
        yfq yfqVar = this.y;
        abnpVarN.t();
        yyz yyzVar11 = (yyz) abnpVarN.b;
        aboh abohVar2 = yyzVar11.o;
        if (!abohVar2.c()) {
            int size2 = abohVar2.size();
            yyzVar11.o = abohVar2.d(size2 + size2);
        }
        abmc.i(yfqVar, yyzVar11.o);
        xxh xxhVar9 = this.z;
        if (xxhVar9.f()) {
            Object objB6 = xxhVar9.b();
            abnpVarN.t();
            yyz yyzVar12 = (yyz) abnpVarN.b;
            yyzVar12.b |= 131072;
            yyzVar12.p = (String) objB6;
        }
        xxh xxhVar10 = this.A;
        if (xxhVar10.f()) {
            int i4 = ((yyk) xxhVar10.b()).e;
            abnpVarN.t();
            yyz yyzVar13 = (yyz) abnpVarN.b;
            yyzVar13.b |= 262144;
            yyzVar13.q = i4;
        }
        xxh xxhVar11 = this.B;
        if (xxhVar11.f()) {
            long jLongValue3 = ((Long) xxhVar11.b()).longValue();
            abnpVarN.t();
            yyz yyzVar14 = (yyz) abnpVarN.b;
            yyzVar14.b |= 1048576;
            yyzVar14.s = jLongValue3;
        }
        xxh xxhVar12 = this.C;
        if (xxhVar12.f()) {
            Object objB7 = xxhVar12.b();
            abnpVarN.t();
            yyz yyzVar15 = (yyz) abnpVarN.b;
            yyzVar15.b |= 2097152;
            yyzVar15.t = (String) objB7;
        }
        int i5 = yfq.d;
        yfl yflVar = new yfl(4);
        yno it = this.t.iterator();
        while (it.hasNext()) {
            yflVar.i(aclh.s((UUID) it.next()));
        }
        yfq yfqVarG = yflVar.g();
        abnpVarN.t();
        yyz yyzVar16 = (yyz) abnpVarN.b;
        aboh abohVar3 = yyzVar16.l;
        if (!abohVar3.c()) {
            int size3 = abohVar3.size();
            yyzVar16.l = abohVar3.d(size3 + size3);
        }
        abmc.i(yfqVarG, yyzVar16.l);
        abnpVarG.t();
        yxb yxbVar3 = (yxb) abnpVarG.b;
        yyz yyzVar17 = (yyz) abnpVarN.q();
        yxb yxbVar4 = yxb.a;
        yyzVar17.getClass();
        yxbVar3.p = yyzVar17;
        yxbVar3.b |= 8192;
        return abnpVarG;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.h.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.a.hashCode();
        int i = this.d;
        a.aW(i);
        return this.C.hashCode() ^ (((((((((((((((((((((((((((((((((((((((((((iHashCode * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ ((yly) this.t).c) * 1000003) ^ this.u.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.x.hashCode()) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A.hashCode()) * 1000003) ^ this.B.hashCode()) * 1000003);
    }

    public final String toString() {
        int i = this.d;
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(this.f);
        String strValueOf3 = String.valueOf(this.g);
        String strValueOf4 = String.valueOf(this.h);
        String strValueOf5 = String.valueOf(this.i);
        String strValueOf6 = String.valueOf(this.j);
        String strValueOf7 = String.valueOf(this.a);
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        yyv yyvVar = this.b;
        xxh xxhVar = this.k;
        xxh xxhVar2 = this.l;
        ygr ygrVar = this.m;
        xxh xxhVar3 = this.n;
        xxh xxhVar4 = this.o;
        xxh xxhVar5 = this.p;
        xxh xxhVar6 = this.q;
        xxh xxhVar7 = this.c;
        xxh xxhVar8 = this.r;
        xxh xxhVar9 = this.s;
        ygr ygrVar2 = this.t;
        xxh xxhVar10 = this.u;
        xxh xxhVar11 = this.v;
        xxh xxhVar12 = this.w;
        xxh xxhVar13 = this.x;
        yfq yfqVar = this.y;
        xxh xxhVar14 = this.z;
        xxh xxhVar15 = this.A;
        xxh xxhVar16 = this.B;
        xxh xxhVar17 = this.C;
        return "NonUiLogEvent{carEventType=" + strValueOf + ", domainIdType=" + strValueOf2 + ", lifetimeId=" + strValueOf3 + ", sessionId=" + strValueOf4 + ", gearheadInfo=" + strValueOf5 + ", domainLifetimeIds=" + strValueOf6 + ", testCodes=" + strValueOf7 + ", context=" + string + ", action=" + String.valueOf(yyvVar) + ", sessionTimeMs=" + String.valueOf(xxhVar) + ", durationMs=" + String.valueOf(xxhVar2) + ", userPermissions=" + String.valueOf(ygrVar) + ", leakInfo=" + String.valueOf(xxhVar3) + ", leakClass=" + String.valueOf(xxhVar4) + ", leakSize=" + String.valueOf(xxhVar5) + ", appPackage=" + String.valueOf(xxhVar6) + ", error=" + String.valueOf(xxhVar7) + ", referrer=" + String.valueOf(xxhVar8) + ", carInfo=" + String.valueOf(xxhVar9) + ", crashIds=" + String.valueOf(ygrVar2) + ", hatsSiteId=" + String.valueOf(xxhVar10) + ", hatsDownloadStatus=" + String.valueOf(xxhVar11) + ", launcherIconEnabledState=" + String.valueOf(xxhVar12) + ", systemUiConfig=" + String.valueOf(xxhVar13) + ", userPreferences=" + String.valueOf(yfqVar) + ", componentName=" + String.valueOf(xxhVar14) + ", gearheadProcess=" + String.valueOf(xxhVar15) + ", activationMillis=" + String.valueOf(xxhVar16) + ", fishfoodLeaderboardAlias=" + String.valueOf(xxhVar17) + "}";
    }

    public rqv() {
        throw null;
    }
}
