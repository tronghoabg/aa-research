package com.waze;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {
    private final boolean A;
    private final boolean B;
    private final int C;
    private final d D;
    private final Boolean E;
    private final l F;
    private final boolean G;

    /* renamed from: a, reason: collision with root package name */
    private final k f24838a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24839b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24840c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24841d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24842e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f24843f;

    /* renamed from: g, reason: collision with root package name */
    private final String f24844g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f24845h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f24846i;

    /* renamed from: j, reason: collision with root package name */
    private final int f24847j;

    /* renamed from: k, reason: collision with root package name */
    private final int f24848k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f24849l;
    private final boolean m;
    private final boolean n;
    private final i o;
    private final AlerterController$Alerter$Type p;
    private final long q;
    private final String r;
    private final boolean s;
    private final String t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final g y;
    private final com.waze.shared_infra.h.c z;

    public j(k kVar, String str, String str2, String str3, Integer num, String str4, boolean z, boolean z2, int i2, boolean z3, boolean z4, boolean z5, i iVar, AlerterController$Alerter$Type alerterController$Alerter$Type, long j2, String str5, boolean z6, String str6, boolean z7, boolean z8, boolean z9, boolean z10, g gVar, com.waze.shared_infra.h.c cVar, boolean z11, boolean z12, int i3, Boolean bool, l lVar, boolean z13) {
        h.g.b.x.f(kVar, "alertId");
        h.g.b.x.f(alerterController$Alerter$Type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(str5, "primaryButtonText");
        h.g.b.x.f(str6, "secondaryButtonText");
        h.g.b.x.f(lVar, "validationResult");
        this.f24838a = kVar;
        this.f24839b = str;
        this.f24840c = str2;
        this.f24841d = null;
        this.f24842e = str3;
        this.f24843f = num;
        this.f24844g = str4;
        this.f24845h = z;
        this.f24846i = z2;
        this.f24847j = i2;
        this.f24848k = 0;
        this.f24849l = z3;
        this.m = z4;
        this.n = z5;
        this.o = iVar;
        this.p = alerterController$Alerter$Type;
        this.q = j2;
        this.r = str5;
        this.s = z6;
        this.t = str6;
        this.u = z7;
        this.v = z8;
        this.w = z9;
        this.x = z10;
        this.y = gVar;
        this.z = cVar;
        this.A = z11;
        this.B = z12;
        this.C = i3;
        this.D = null;
        this.E = bool;
        this.F = lVar;
        this.G = z13;
    }

    public static /* synthetic */ j z(j jVar, String str, String str2, i iVar, l lVar, int i2) {
        k kVar = (i2 & 1) != 0 ? jVar.f24838a : null;
        String str3 = (i2 & 2) != 0 ? jVar.f24839b : null;
        String str4 = (i2 & 4) != 0 ? jVar.f24840c : null;
        if ((i2 & 8) != 0) {
            String str5 = jVar.f24841d;
        }
        String str6 = (i2 & 16) != 0 ? jVar.f24842e : str;
        Integer num = (i2 & 32) != 0 ? jVar.f24843f : null;
        String str7 = (i2 & 64) != 0 ? jVar.f24844g : str2;
        boolean z = (i2 & 128) != 0 ? jVar.f24845h : false;
        boolean z2 = (i2 & 256) != 0 ? jVar.f24846i : false;
        int i3 = (i2 & 512) != 0 ? jVar.f24847j : 0;
        if ((i2 & 1024) != 0) {
            int i4 = jVar.f24848k;
        }
        boolean z3 = (i2 & 2048) != 0 ? jVar.f24849l : false;
        boolean z4 = (i2 & 4096) != 0 ? jVar.m : false;
        boolean z5 = (i2 & 8192) != 0 ? jVar.n : false;
        i iVar2 = (i2 & 16384) != 0 ? jVar.o : iVar;
        AlerterController$Alerter$Type alerterController$Alerter$Type = (32768 & i2) != 0 ? jVar.p : null;
        long j2 = (i2 & 65536) != 0 ? jVar.q : 0L;
        String str8 = (131072 & i2) != 0 ? jVar.r : null;
        boolean z6 = (262144 & i2) != 0 ? jVar.s : false;
        String str9 = (524288 & i2) != 0 ? jVar.t : null;
        boolean z7 = (i2 & 1048576) != 0 ? jVar.u : false;
        boolean z8 = (i2 & 2097152) != 0 ? jVar.v : false;
        boolean z9 = (i2 & 4194304) != 0 ? jVar.w : false;
        boolean z10 = (i2 & 8388608) != 0 ? jVar.x : false;
        g gVar = (i2 & 16777216) != 0 ? jVar.y : null;
        com.waze.shared_infra.h.c cVar = (i2 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? jVar.z : null;
        boolean z11 = (i2 & 67108864) != 0 ? jVar.A : false;
        boolean z12 = (i2 & 134217728) != 0 ? jVar.B : false;
        int i5 = (i2 & 268435456) != 0 ? jVar.C : 0;
        if ((i2 & 536870912) != 0) {
            d dVar = jVar.D;
        }
        Boolean bool = (i2 & 1073741824) != 0 ? jVar.E : null;
        l lVar2 = (i2 & Integer.MIN_VALUE) != 0 ? jVar.F : lVar;
        boolean z13 = jVar.G;
        h.g.b.x.f(kVar, "alertId");
        h.g.b.x.f(alerterController$Alerter$Type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(str8, "primaryButtonText");
        h.g.b.x.f(str9, "secondaryButtonText");
        h.g.b.x.f(lVar2, "validationResult");
        return new j(kVar, str3, str4, str6, num, str7, z, z2, i3, z3, z4, z5, iVar2, alerterController$Alerter$Type, j2, str8, z6, str9, z7, z8, z9, z10, gVar, cVar, z11, z12, i5, bool, lVar2, z13);
    }

    public final int a() {
        return this.C;
    }

    public final long b() {
        return this.q;
    }

    public final g c() {
        return this.y;
    }

    public final i d() {
        return this.o;
    }

    public final AlerterController$Alerter$Type e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!h.g.b.x.n(this.f24838a, jVar.f24838a) || !h.g.b.x.n(this.f24839b, jVar.f24839b) || !h.g.b.x.n(this.f24840c, jVar.f24840c)) {
            return false;
        }
        String str = jVar.f24841d;
        if (!h.g.b.x.n(null, null) || !h.g.b.x.n(this.f24842e, jVar.f24842e) || !h.g.b.x.n(this.f24843f, jVar.f24843f) || !h.g.b.x.n(this.f24844g, jVar.f24844g) || this.f24845h != jVar.f24845h || this.f24846i != jVar.f24846i || this.f24847j != jVar.f24847j) {
            return false;
        }
        int i2 = jVar.f24848k;
        if (this.f24849l != jVar.f24849l || this.m != jVar.m || this.n != jVar.n || !h.g.b.x.n(this.o, jVar.o) || this.p != jVar.p || this.q != jVar.q || !h.g.b.x.n(this.r, jVar.r) || this.s != jVar.s || !h.g.b.x.n(this.t, jVar.t) || this.u != jVar.u || this.v != jVar.v || this.w != jVar.w || this.x != jVar.x || this.y != jVar.y || !h.g.b.x.n(this.z, jVar.z) || this.A != jVar.A || this.B != jVar.B || this.C != jVar.C) {
            return false;
        }
        d dVar = jVar.D;
        return h.g.b.x.n(null, null) && h.g.b.x.n(this.E, jVar.E) && h.g.b.x.n(this.F, jVar.F) && this.G == jVar.G;
    }

    public final k f() {
        return this.f24838a;
    }

    public final l g() {
        return this.F;
    }

    public final com.waze.shared_infra.h.c h() {
        return this.z;
    }

    public final int hashCode() {
        int iHashCode = this.f24838a.hashCode() * 31;
        String str = this.f24839b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24840c;
        int iHashCode3 = iHashCode2 + (str2 == null ? 0 : str2.hashCode());
        String str3 = this.f24842e;
        int iHashCode4 = ((iHashCode3 * 961) + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f24843f;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f24844g;
        int iHashCode6 = (((((((((((((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + a.a.a(this.f24845h)) * 31) + a.a.a(this.f24846i)) * 31) + this.f24847j) * 961) + a.a.a(this.f24849l)) * 31) + a.a.a(this.m)) * 31) + a.a.a(this.n)) * 31;
        i iVar = this.o;
        int iHashCode7 = (((((((((((((((((((iHashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.p.hashCode()) * 31) + a.a.b(this.q)) * 31) + this.r.hashCode()) * 31) + a.a.a(this.s)) * 31) + this.t.hashCode()) * 31) + a.a.a(this.u)) * 31) + a.a.a(this.v)) * 31) + a.a.a(this.w)) * 31) + a.a.a(this.x)) * 31;
        g gVar = this.y;
        int iHashCode8 = (iHashCode7 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.waze.shared_infra.h.c cVar = this.z;
        int iHashCode9 = (((((((iHashCode8 + (cVar == null ? 0 : cVar.hashCode())) * 31) + a.a.a(this.A)) * 31) + a.a.a(this.B)) * 31) + this.C) * 961;
        Boolean bool = this.E;
        return ((((iHashCode9 + (bool != null ? bool.hashCode() : 0)) * 31) + this.F.hashCode()) * 31) + a.a.a(this.G);
    }

    public final Boolean i() {
        return this.E;
    }

    public final Integer j() {
        return this.f24843f;
    }

    public final String k() {
        return this.f24842e;
    }

    public final String l() {
        return this.f24844g;
    }

    public final String m() {
        return this.r;
    }

    public final String n() {
        return this.t;
    }

    public final String o() {
        return this.f24839b;
    }

    public final String p() {
        return this.f24840c;
    }

    public final boolean q() {
        return this.f24846i;
    }

    public final boolean r() {
        return this.A;
    }

    public final boolean s() {
        return this.G;
    }

    public final boolean t() {
        return this.s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Alerter(alertId=");
        sb.append(this.f24838a);
        sb.append(", titleStr=");
        sb.append(this.f24839b);
        sb.append(", titleWithDistanceStr=");
        sb.append(this.f24840c);
        sb.append(", subtitle=null, description=");
        sb.append(this.f24842e);
        sb.append(", iconRes=");
        sb.append(this.f24843f);
        sb.append(", distanceStr=");
        sb.append(this.f24844g);
        sb.append(", isCancelable=");
        sb.append(this.f24845h);
        sb.append(", canSendThumbsUp=");
        sb.append(this.f24846i);
        sb.append(", numThumbsUp=");
        sb.append(this.f24847j);
        sb.append(", color=0, isWarning=");
        sb.append(this.f24849l);
        sb.append(", isCloseOnly=");
        sb.append(this.m);
        sb.append(", showBottomButtons=");
        sb.append(this.n);
        sb.append(", timeout=");
        sb.append(this.o);
        sb.append(", type=");
        sb.append(this.p);
        sb.append(", subType=");
        sb.append(this.q);
        sb.append(", primaryButtonText=");
        sb.append(this.r);
        sb.append(", primaryButtonHasPrimaryColor=");
        sb.append(this.s);
        sb.append(", secondaryButtonText=");
        sb.append(this.t);
        sb.append(", isPlatformAlerter=");
        sb.append(this.u);
        sb.append(", showWithEta=");
        sb.append(this.v);
        sb.append(", shouldShowStillThere=");
        sb.append(this.w);
        sb.append(", showDistance=");
        sb.append(this.x);
        sb.append(", silentActivation=");
        boolean z = this.G;
        l lVar = this.F;
        Boolean bool = this.E;
        int i2 = this.C;
        boolean z2 = this.B;
        boolean z3 = this.A;
        com.waze.shared_infra.h.c cVar = this.z;
        sb.append(this.y);
        sb.append(", position=");
        sb.append(cVar);
        sb.append(", closeDistanceSameAlertsCappingEnabled=");
        sb.append(z3);
        sb.append(", isEtaClickable=");
        sb.append(z2);
        sb.append(", reportId=");
        sb.append(i2);
        sb.append(", alertSoundProperties=null, isApproachingWithValidation=");
        sb.append(bool);
        sb.append(", validationResult=");
        sb.append(lVar);
        sb.append(", hideActionsWhenInvalid=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        return this.w;
    }

    public final boolean v() {
        return this.n;
    }

    public final boolean w() {
        return this.x;
    }

    public final boolean x() {
        return this.f24845h;
    }

    public final boolean y() {
        return this.B;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j(k kVar, String str, String str2, String str3, Integer num, String str4, boolean z, boolean z2, int i2, boolean z3, boolean z4, boolean z5, i iVar, AlerterController$Alerter$Type alerterController$Alerter$Type, long j2, String str5, boolean z6, String str6, boolean z7, boolean z8, boolean z9, boolean z10, g gVar, com.waze.shared_infra.h.c cVar, boolean z11, boolean z12, int i3, Boolean bool, l lVar, boolean z13, int i4) {
        int i5 = i4 & 1073741824;
        int i6 = i4 & 268435456;
        this(kVar, str, str2, str3, num, str4, z, z2, i2, z3, z4, z5, iVar, alerterController$Alerter$Type, j2, str5, (!((i4 & 262144) == 0)) | z6, str6, z7, z8, z9, z10, gVar, cVar, z11, z12, i6 != 0 ? -1 : i3, i5 != 0 ? null : bool, (i4 & Integer.MIN_VALUE) != 0 ? new l(true, null) : lVar, z13);
    }
}
