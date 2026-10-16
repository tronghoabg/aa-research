package com.waze.navigate;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final String f31782a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31783b;

    /* renamed from: c, reason: collision with root package name */
    private final r f31784c;

    /* renamed from: d, reason: collision with root package name */
    private final r f31785d;

    /* renamed from: e, reason: collision with root package name */
    private final r f31786e;

    /* renamed from: f, reason: collision with root package name */
    private final r f31787f;

    /* renamed from: g, reason: collision with root package name */
    private final r f31788g;

    /* renamed from: h, reason: collision with root package name */
    private final r f31789h;

    /* renamed from: i, reason: collision with root package name */
    private final r f31790i;

    /* renamed from: j, reason: collision with root package name */
    private final r f31791j;

    /* renamed from: k, reason: collision with root package name */
    private final r f31792k;

    /* renamed from: l, reason: collision with root package name */
    private final r f31793l;
    private final r m;

    public n(String str, int i2, r rVar, r rVar2, r rVar3, r rVar4, r rVar5, r rVar6, r rVar7, r rVar8, r rVar9, r rVar10, r rVar11) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(rVar, "iconBitmap");
        h.g.b.x.f(rVar2, "distanceMeters");
        h.g.b.x.f(rVar3, "etaMinutes");
        h.g.b.x.f(rVar4, "services");
        h.g.b.x.f(rVar5, HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
        h.g.b.x.f(rVar6, "addressDescription");
        h.g.b.x.f(rVar7, "openingStatus");
        h.g.b.x.f(rVar8, "gasPrices");
        h.g.b.x.f(rVar9, "parkingPrices");
        h.g.b.x.f(rVar10, "dangerousAreaType");
        h.g.b.x.f(rVar11, "venue");
        this.f31782a = str;
        this.f31783b = i2;
        this.f31784c = rVar;
        this.f31785d = rVar2;
        this.f31786e = rVar3;
        this.f31787f = rVar4;
        this.f31788g = rVar5;
        this.f31789h = rVar6;
        this.f31790i = rVar7;
        this.f31791j = rVar8;
        this.f31792k = rVar9;
        this.f31793l = rVar10;
        this.m = rVar11;
    }

    public static /* synthetic */ n n(n nVar, String str, r rVar, r rVar2, r rVar3, r rVar4, r rVar5, r rVar6, r rVar7, r rVar8, r rVar9, r rVar10, int i2) {
        String str2 = (i2 & 1) != 0 ? nVar.f31782a : str;
        int i3 = (i2 & 2) != 0 ? nVar.f31783b : 0;
        r rVar11 = (i2 & 4) != 0 ? nVar.f31784c : rVar;
        r rVar12 = (i2 & 8) != 0 ? nVar.f31785d : rVar2;
        r rVar13 = (i2 & 16) != 0 ? nVar.f31786e : rVar3;
        r rVar14 = (i2 & 32) != 0 ? nVar.f31787f : rVar4;
        r rVar15 = (i2 & 64) != 0 ? nVar.f31788g : rVar5;
        r rVar16 = (i2 & 128) != 0 ? nVar.f31789h : rVar6;
        r rVar17 = (i2 & 256) != 0 ? nVar.f31790i : rVar7;
        r rVar18 = (i2 & 512) != 0 ? nVar.f31791j : rVar8;
        r rVar19 = (i2 & 1024) != 0 ? nVar.f31792k : null;
        r rVar20 = (i2 & 2048) != 0 ? nVar.f31793l : rVar9;
        r rVar21 = (i2 & 4096) != 0 ? nVar.m : rVar10;
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(rVar11, "iconBitmap");
        h.g.b.x.f(rVar12, "distanceMeters");
        h.g.b.x.f(rVar13, "etaMinutes");
        h.g.b.x.f(rVar14, "services");
        h.g.b.x.f(rVar15, HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
        h.g.b.x.f(rVar16, "addressDescription");
        h.g.b.x.f(rVar17, "openingStatus");
        h.g.b.x.f(rVar18, "gasPrices");
        h.g.b.x.f(rVar19, "parkingPrices");
        h.g.b.x.f(rVar20, "dangerousAreaType");
        h.g.b.x.f(rVar21, "venue");
        return new n(str2, i3, rVar11, rVar12, rVar13, rVar14, rVar15, rVar16, rVar17, rVar18, rVar19, rVar20, rVar21);
    }

    public final int a() {
        return this.f31783b;
    }

    public final r b() {
        return this.f31789h;
    }

    public final r c() {
        return this.f31793l;
    }

    public final r d() {
        return this.f31785d;
    }

    public final r e() {
        return this.f31786e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.g.b.x.n(this.f31782a, nVar.f31782a) && this.f31783b == nVar.f31783b && h.g.b.x.n(this.f31784c, nVar.f31784c) && h.g.b.x.n(this.f31785d, nVar.f31785d) && h.g.b.x.n(this.f31786e, nVar.f31786e) && h.g.b.x.n(this.f31787f, nVar.f31787f) && h.g.b.x.n(this.f31788g, nVar.f31788g) && h.g.b.x.n(this.f31789h, nVar.f31789h) && h.g.b.x.n(this.f31790i, nVar.f31790i) && h.g.b.x.n(this.f31791j, nVar.f31791j) && h.g.b.x.n(this.f31792k, nVar.f31792k) && h.g.b.x.n(this.f31793l, nVar.f31793l) && h.g.b.x.n(this.m, nVar.m);
    }

    public final r f() {
        return this.f31791j;
    }

    public final r g() {
        return this.f31784c;
    }

    public final r h() {
        return this.f31790i;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.f31782a.hashCode() * 31) + this.f31783b) * 31) + this.f31784c.hashCode()) * 31) + this.f31785d.hashCode()) * 31) + this.f31786e.hashCode()) * 31) + this.f31787f.hashCode()) * 31) + this.f31788g.hashCode()) * 31) + this.f31789h.hashCode()) * 31) + this.f31790i.hashCode()) * 31) + this.f31791j.hashCode()) * 31) + this.f31792k.hashCode()) * 31) + this.f31793l.hashCode()) * 31) + this.m.hashCode();
    }

    public final r i() {
        return this.f31792k;
    }

    public final r j() {
        return this.f31788g;
    }

    public final r k() {
        return this.f31787f;
    }

    public final r l() {
        return this.m;
    }

    public final String m() {
        return this.f31782a;
    }

    public final String toString() {
        return "AddressPreviewData(name=" + this.f31782a + ", type=" + this.f31783b + ", iconBitmap=" + this.f31784c + ", distanceMeters=" + this.f31785d + ", etaMinutes=" + this.f31786e + ", services=" + this.f31787f + ", phoneNumber=" + this.f31788g + ", addressDescription=" + this.f31789h + ", openingStatus=" + this.f31790i + ", gasPrices=" + this.f31791j + ", parkingPrices=" + this.f31792k + ", dangerousAreaType=" + this.f31793l + ", venue=" + this.m + ")";
    }
}
