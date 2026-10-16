package defpackage;

/* loaded from: classes2.dex */
public final class rqn extends rqy {
    public final yzz a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final xxh f;
    public final xxh g;
    public final xxh h;
    public final xxh i;
    public final xxh j;
    public final xxh k;
    public final xxh l;
    private final yxc m;
    private final yxy n;
    private final xxh o;
    private final xxh p;
    private final xxh q;
    private final yfq r;
    private final ygr s;

    public rqn(yxc yxcVar, yxy yxyVar, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, yfq yfqVar, ygr ygrVar, yzz yzzVar, int i, int i2, int i3, int i4, xxh xxhVar4, xxh xxhVar5, xxh xxhVar6, xxh xxhVar7, xxh xxhVar8, xxh xxhVar9, xxh xxhVar10) {
        this.m = yxcVar;
        this.n = yxyVar;
        this.o = xxhVar;
        this.p = xxhVar2;
        this.q = xxhVar3;
        this.r = yfqVar;
        this.s = ygrVar;
        this.a = yzzVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = xxhVar4;
        this.g = xxhVar5;
        this.h = xxhVar6;
        this.i = xxhVar7;
        this.j = xxhVar8;
        this.k = xxhVar9;
        this.l = xxhVar10;
    }

    @Override // defpackage.rqy
    public final xxh a() {
        return this.o;
    }

    @Override // defpackage.rqy
    public final xxh b() {
        return this.p;
    }

    @Override // defpackage.rqy
    public final yfq c() {
        return this.r;
    }

    @Override // defpackage.rqy
    public final ygr d() {
        return this.s;
    }

    @Override // defpackage.rqy
    public final yxc e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqn) {
            rqn rqnVar = (rqn) obj;
            if (this.m.equals(rqnVar.m) && this.n.equals(rqnVar.n) && this.o.equals(rqnVar.o) && this.p.equals(rqnVar.p) && this.q.equals(rqnVar.q) && yrm.W(this.r, rqnVar.r) && this.s.equals(rqnVar.s) && this.a.equals(rqnVar.a) && this.b == rqnVar.b && this.c == rqnVar.c && this.d == rqnVar.d && this.e == rqnVar.e && this.f.equals(rqnVar.f) && this.g.equals(rqnVar.g) && this.h.equals(rqnVar.h) && this.i.equals(rqnVar.i) && this.j.equals(rqnVar.j) && this.k.equals(rqnVar.k) && this.l.equals(rqnVar.l)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rqy
    public final yxy f() {
        return this.n;
    }

    @Override // defpackage.rqy
    public final abnp g() {
        abnp abnpVarN = ywv.a.n();
        int i = this.a.he;
        abnpVarN.t();
        ywv ywvVar = (ywv) abnpVarN.b;
        ywvVar.b |= 1;
        ywvVar.c = i;
        abnpVarN.t();
        ywv ywvVar2 = (ywv) abnpVarN.b;
        ywvVar2.b |= 2;
        ywvVar2.d = this.b;
        abnpVarN.t();
        ywv ywvVar3 = (ywv) abnpVarN.b;
        ywvVar3.b |= 4;
        ywvVar3.e = this.c;
        abnpVarN.t();
        ywv ywvVar4 = (ywv) abnpVarN.b;
        ywvVar4.b |= 8;
        ywvVar4.f = this.d;
        abnpVarN.t();
        ywv ywvVar5 = (ywv) abnpVarN.b;
        ywvVar5.b |= 16;
        ywvVar5.g = this.e;
        xxh xxhVar = this.h;
        if (xxhVar.f()) {
            int iIntValue = ((Integer) xxhVar.b()).intValue();
            abnpVarN.t();
            ywv ywvVar6 = (ywv) abnpVarN.b;
            ywvVar6.b |= 128;
            ywvVar6.j = iIntValue;
        }
        xxh xxhVar2 = this.i;
        if (xxhVar2.f()) {
            int iIntValue2 = ((Integer) xxhVar2.b()).intValue();
            abnpVarN.t();
            ywv ywvVar7 = (ywv) abnpVarN.b;
            ywvVar7.b |= 256;
            ywvVar7.k = iIntValue2;
        }
        xxh xxhVar3 = this.j;
        if (xxhVar3.f()) {
            int iIntValue3 = ((Integer) xxhVar3.b()).intValue();
            abnpVarN.t();
            ywv ywvVar8 = (ywv) abnpVarN.b;
            ywvVar8.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            ywvVar8.l = iIntValue3;
        }
        xxh xxhVar4 = this.k;
        if (xxhVar4.f()) {
            int iIntValue4 = ((Integer) xxhVar4.b()).intValue();
            abnpVarN.t();
            ywv ywvVar9 = (ywv) abnpVarN.b;
            ywvVar9.b |= 1024;
            ywvVar9.m = iIntValue4;
        }
        xxh xxhVar5 = this.l;
        if (xxhVar5.f()) {
            int iIntValue5 = ((Integer) xxhVar5.b()).intValue();
            abnpVarN.t();
            ywv ywvVar10 = (ywv) abnpVarN.b;
            ywvVar10.b |= 2048;
            ywvVar10.n = iIntValue5;
        }
        xxh xxhVar6 = this.f;
        if (xxhVar6.f()) {
            int iIntValue6 = ((Integer) xxhVar6.b()).intValue();
            abnpVarN.t();
            ywv ywvVar11 = (ywv) abnpVarN.b;
            ywvVar11.b |= 32;
            ywvVar11.h = iIntValue6;
        }
        xxh xxhVar7 = this.g;
        if (xxhVar7.f()) {
            boolean zBooleanValue = ((Boolean) xxhVar7.b()).booleanValue();
            abnpVarN.t();
            ywv ywvVar12 = (ywv) abnpVarN.b;
            ywvVar12.b |= 64;
            ywvVar12.i = zBooleanValue;
        }
        abnp abnpVarG = super.g();
        ywv ywvVar13 = (ywv) abnpVarN.q();
        abnpVarG.t();
        yxb yxbVar = (yxb) abnpVarG.b;
        yxb yxbVar2 = yxb.a;
        ywvVar13.getClass();
        yxbVar.aa = ywvVar13;
        yxbVar.c |= 536870912;
        return abnpVarG;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((this.m.hashCode() ^ 1000003) * 1000003) ^ this.n.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
        return this.l.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        xxh xxhVar = this.l;
        xxh xxhVar2 = this.k;
        xxh xxhVar3 = this.j;
        xxh xxhVar4 = this.i;
        xxh xxhVar5 = this.h;
        xxh xxhVar6 = this.g;
        xxh xxhVar7 = this.f;
        yzz yzzVar = this.a;
        ygr ygrVar = this.s;
        yfq yfqVar = this.r;
        xxh xxhVar8 = this.q;
        xxh xxhVar9 = this.p;
        xxh xxhVar10 = this.o;
        yxy yxyVar = this.n;
        return "CalendarEventListSnapshotLogEvent{carEventType=" + String.valueOf(this.m) + ", domainIdType=" + String.valueOf(yxyVar) + ", lifetimeId=" + String.valueOf(xxhVar10) + ", sessionId=" + String.valueOf(xxhVar9) + ", gearheadInfo=" + String.valueOf(xxhVar8) + ", domainLifetimeIds=" + String.valueOf(yfqVar) + ", testCodes=" + String.valueOf(ygrVar) + ", context=" + String.valueOf(yzzVar) + ", eventItemCount=" + this.b + ", callableEventCount=" + this.c + ", navigableEventCount=" + this.d + ", actionlessEventCount=" + this.e + ", allDayEventItemCountInAgenda=" + String.valueOf(xxhVar7) + ", allDayOverflowItemPresentInAgenda=" + String.valueOf(xxhVar6) + ", workProfileEventItemCount=" + String.valueOf(xxhVar5) + ", workProfileCallableEventCount=" + String.valueOf(xxhVar4) + ", workProfileNavigableEventCount=" + String.valueOf(xxhVar3) + ", workProfileActionlessEventCount=" + String.valueOf(xxhVar2) + ", workProfileAllDayEventItemCountInAgenda=" + String.valueOf(xxhVar) + "}";
    }

    public rqn() {
        throw null;
    }
}
