package com.waze.settings;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import com.waze.sharedui.profile.EmailVerifier;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bs {

    /* renamed from: a, reason: collision with root package name */
    private static final bs f36900a = new bs(0, false, false, false, false, false, false, false, false, false, null, null, null, false, EmailVerifier.UNKNOWN, null, false, "", "", "", "", "", bi.f36868a, hf.f37396a, c.f36922a, false, null);
    private final boolean A;
    private final String B;

    /* renamed from: b, reason: collision with root package name */
    private final int f36901b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36902c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f36903d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f36904e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f36905f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f36906g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f36907h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f36908i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f36909j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f36910k;

    /* renamed from: l, reason: collision with root package name */
    private final String f36911l;
    private final com.waze.shared_infra.q.i m;
    private final String n;
    private final boolean o;
    private final EmailVerifier p;
    private final Integer q;
    private final boolean r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final String w;
    private final bi x;
    private final hg y;
    private final c z;

    public bs(int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, com.waze.shared_infra.q.i iVar, String str2, boolean z10, EmailVerifier emailVerifier, Integer num, boolean z11, String str3, String str4, String str5, String str6, String str7, bi biVar, hg hgVar, c cVar, boolean z12, String str8) {
        h.g.b.x.f(emailVerifier, "emailVerifier");
        h.g.b.x.f(str3, "localeLanguageId");
        h.g.b.x.f(str4, "localeLanguageLabel");
        h.g.b.x.f(str5, "selectedLanguageId");
        h.g.b.x.f(str6, "selectedLanguageLabel");
        h.g.b.x.f(str7, "selectedVoiceName");
        h.g.b.x.f(biVar, "searchVoiceState");
        h.g.b.x.f(hgVar, "wazeUserData");
        h.g.b.x.f(cVar, "audioSdkState");
        this.f36901b = i2;
        this.f36902c = z;
        this.f36903d = z2;
        this.f36904e = z3;
        this.f36905f = z4;
        this.f36906g = z5;
        this.f36907h = z6;
        this.f36908i = z7;
        this.f36909j = z8;
        this.f36910k = z9;
        this.f36911l = str;
        this.m = iVar;
        this.n = str2;
        this.o = z10;
        this.p = emailVerifier;
        this.q = num;
        this.r = z11;
        this.s = str3;
        this.t = str4;
        this.u = str5;
        this.v = str6;
        this.w = str7;
        this.x = biVar;
        this.y = hgVar;
        this.z = cVar;
        this.A = z12;
        this.B = str8;
    }

    public static /* synthetic */ bs B(bs bsVar, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, com.waze.shared_infra.q.i iVar, String str2, boolean z10, EmailVerifier emailVerifier, Integer num, boolean z11, String str3, String str4, String str5, String str6, String str7, bi biVar, hg hgVar, c cVar, boolean z12, String str8, int i3) {
        int i4 = (i3 & 1) != 0 ? bsVar.f36901b : i2;
        boolean z13 = (i3 & 2) != 0 ? bsVar.f36902c : z;
        boolean z14 = (i3 & 4) != 0 ? bsVar.f36903d : z2;
        boolean z15 = (i3 & 8) != 0 ? bsVar.f36904e : z3;
        boolean z16 = (i3 & 16) != 0 ? bsVar.f36905f : z4;
        boolean z17 = (i3 & 32) != 0 ? bsVar.f36906g : z5;
        boolean z18 = (i3 & 64) != 0 ? bsVar.f36907h : z6;
        boolean z19 = (i3 & 128) != 0 ? bsVar.f36908i : z7;
        boolean z20 = (i3 & 256) != 0 ? bsVar.f36909j : z8;
        boolean z21 = (i3 & 512) != 0 ? bsVar.f36910k : z9;
        String str9 = (i3 & 1024) != 0 ? bsVar.f36911l : str;
        com.waze.shared_infra.q.i iVar2 = (i3 & 2048) != 0 ? bsVar.m : iVar;
        String str10 = (i3 & 4096) != 0 ? bsVar.n : str2;
        boolean z22 = (i3 & 8192) != 0 ? bsVar.o : z10;
        int i5 = i4;
        EmailVerifier emailVerifier2 = (i3 & 16384) != 0 ? bsVar.p : emailVerifier;
        Integer num2 = (i3 & 32768) != 0 ? bsVar.q : num;
        boolean z23 = (i3 & 65536) != 0 ? bsVar.r : z11;
        String str11 = (i3 & 131072) != 0 ? bsVar.s : str3;
        boolean z24 = z13;
        String str12 = (i3 & 262144) != 0 ? bsVar.t : str4;
        boolean z25 = z14;
        String str13 = (i3 & 524288) != 0 ? bsVar.u : str5;
        boolean z26 = z15;
        String str14 = (i3 & 1048576) != 0 ? bsVar.v : str6;
        boolean z27 = z16;
        String str15 = (i3 & 2097152) != 0 ? bsVar.w : str7;
        boolean z28 = z17;
        bi biVar2 = (i3 & 4194304) != 0 ? bsVar.x : biVar;
        boolean z29 = z18;
        hg hgVar2 = (i3 & 8388608) != 0 ? bsVar.y : hgVar;
        boolean z30 = z19;
        c cVar2 = (i3 & 16777216) != 0 ? bsVar.z : cVar;
        boolean z31 = z20;
        boolean z32 = (i3 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? bsVar.A : z12;
        if ((i3 & 67108864) != 0) {
            str8 = bsVar.B;
        }
        h.g.b.x.f(emailVerifier2, "emailVerifier");
        h.g.b.x.f(str11, "localeLanguageId");
        h.g.b.x.f(str12, "localeLanguageLabel");
        h.g.b.x.f(str13, "selectedLanguageId");
        h.g.b.x.f(str14, "selectedLanguageLabel");
        h.g.b.x.f(str15, "selectedVoiceName");
        h.g.b.x.f(biVar2, "searchVoiceState");
        h.g.b.x.f(hgVar2, "wazeUserData");
        h.g.b.x.f(cVar2, "audioSdkState");
        return new bs(i5, z24, z25, z26, z27, z28, z29, z30, z31, z21, str9, iVar2, str10, z22, emailVerifier2, num2, z23, str11, str12, str13, str14, str15, biVar2, hgVar2, cVar2, z32, str8);
    }

    public final boolean A() {
        return this.A;
    }

    public final int a() {
        return this.f36901b;
    }

    public final c b() {
        return this.z;
    }

    public final bi c() {
        return this.x;
    }

    public final hg e() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs)) {
            return false;
        }
        bs bsVar = (bs) obj;
        return this.f36901b == bsVar.f36901b && this.f36902c == bsVar.f36902c && this.f36903d == bsVar.f36903d && this.f36904e == bsVar.f36904e && this.f36905f == bsVar.f36905f && this.f36906g == bsVar.f36906g && this.f36907h == bsVar.f36907h && this.f36908i == bsVar.f36908i && this.f36909j == bsVar.f36909j && this.f36910k == bsVar.f36910k && h.g.b.x.n(this.f36911l, bsVar.f36911l) && h.g.b.x.n(this.m, bsVar.m) && h.g.b.x.n(this.n, bsVar.n) && this.o == bsVar.o && this.p == bsVar.p && h.g.b.x.n(this.q, bsVar.q) && this.r == bsVar.r && h.g.b.x.n(this.s, bsVar.s) && h.g.b.x.n(this.t, bsVar.t) && h.g.b.x.n(this.u, bsVar.u) && h.g.b.x.n(this.v, bsVar.v) && h.g.b.x.n(this.w, bsVar.w) && h.g.b.x.n(this.x, bsVar.x) && h.g.b.x.n(this.y, bsVar.y) && h.g.b.x.n(this.z, bsVar.z) && this.A == bsVar.A && h.g.b.x.n(this.B, bsVar.B);
    }

    public final com.waze.shared_infra.q.i f() {
        return this.m;
    }

    public final EmailVerifier g() {
        return this.p;
    }

    public final Integer h() {
        return this.q;
    }

    public final int hashCode() {
        String str = this.f36911l;
        int iHashCode = str == null ? 0 : str.hashCode();
        boolean z = this.f36910k;
        boolean z2 = this.f36909j;
        boolean z3 = this.f36908i;
        boolean z4 = this.f36907h;
        boolean z5 = this.f36906g;
        boolean z6 = this.f36905f;
        boolean z7 = this.f36904e;
        boolean z8 = this.f36903d;
        boolean z9 = this.f36902c;
        int i2 = this.f36901b;
        com.waze.shared_infra.q.i iVar = this.m;
        int iHashCode2 = iVar == null ? 0 : iVar.hashCode();
        int iA = a.a.a(z9);
        int iA2 = a.a.a(z8);
        int iA3 = a.a.a(z7);
        int iA4 = a.a.a(z6);
        int iA5 = a.a.a(z5);
        int iA6 = a.a.a(z4);
        int iA7 = (((((((((((((((((((i2 * 31) + iA) * 31) + iA2) * 31) + iA3) * 31) + iA4) * 31) + iA5) * 31) + iA6) * 31) + a.a.a(z3)) * 31) + a.a.a(z2)) * 31) + a.a.a(z)) * 31) + iHashCode;
        String str2 = this.n;
        int iHashCode3 = ((((((((iA7 * 31) + iHashCode2) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + a.a.a(this.o)) * 31) + this.p.hashCode()) * 31;
        Integer num = this.q;
        int iHashCode4 = (((((((((((((((((((((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + a.a.a(this.r)) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31) + a.a.a(this.A)) * 31;
        String str3 = this.B;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.n;
    }

    public final String j() {
        return this.s;
    }

    public final String k() {
        return this.t;
    }

    public final String l() {
        return this.f36911l;
    }

    public final String m() {
        return this.u;
    }

    public final String n() {
        return this.v;
    }

    public final String o() {
        return this.w;
    }

    public final String p() {
        return this.B;
    }

    public final boolean q() {
        return this.f36909j;
    }

    public final boolean r() {
        return this.f36903d;
    }

    public final boolean s() {
        return this.f36908i;
    }

    public final boolean t() {
        return this.f36910k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsGeneralState(refreshId=");
        sb.append(this.f36901b);
        sb.append(", saveButtonEnabled=");
        sb.append(this.f36902c);
        sb.append(", bottomButtonEnabled=");
        sb.append(this.f36903d);
        sb.append(", tripSuggestionsEnabled=");
        sb.append(this.f36904e);
        sb.append(", speedometerShown=");
        sb.append(this.f36905f);
        sb.append(", isCalendarConnected=");
        sb.append(this.f36906g);
        sb.append(", showChildReminder=");
        sb.append(this.f36907h);
        sb.append(", editAgeEnabled=");
        sb.append(this.f36908i);
        sb.append(", avoidHighRiskAreas=");
        sb.append(this.f36909j);
        sb.append(", highRiskAreaAlertEnabled=");
        sb.append(this.f36910k);
        sb.append(", phoneNumber=");
        sb.append(this.f36911l);
        sb.append(", birthday=");
        sb.append(this.m);
        sb.append(", email=");
        sb.append(this.n);
        sb.append(", isEmailVerified=");
        sb.append(this.o);
        sb.append(", emailVerifier=");
        sb.append(this.p);
        sb.append(", emailIcon=");
        sb.append(this.q);
        sb.append(", useCurrentLocaleLanguage=");
        sb.append(this.r);
        sb.append(", localeLanguageId=");
        sb.append(this.s);
        sb.append(", localeLanguageLabel=");
        sb.append(this.t);
        sb.append(", selectedLanguageId=");
        sb.append(this.u);
        sb.append(", selectedLanguageLabel=");
        sb.append(this.v);
        sb.append(", selectedVoiceName=");
        sb.append(this.w);
        sb.append(", searchVoiceState=");
        sb.append(this.x);
        sb.append(", wazeUserData=");
        sb.append(this.y);
        String str = this.B;
        boolean z = this.A;
        c cVar = this.z;
        sb.append(", audioSdkState=");
        sb.append(cVar);
        sb.append(", isNotificationEnabled=");
        sb.append(z);
        sb.append(", updatedLicensePlate=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        return this.f36902c;
    }

    public final boolean v() {
        return this.f36907h;
    }

    public final boolean w() {
        return this.f36905f;
    }

    public final boolean x() {
        return this.r;
    }

    public final boolean y() {
        return this.f36906g;
    }

    public final boolean z() {
        return this.o;
    }
}
