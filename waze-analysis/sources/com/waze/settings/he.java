package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class he extends hg {

    /* renamed from: a, reason: collision with root package name */
    private final String f37385a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37386b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37387c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37388d;

    /* renamed from: e, reason: collision with root package name */
    private final String f37389e;

    /* renamed from: f, reason: collision with root package name */
    private final String f37390f;

    /* renamed from: g, reason: collision with root package name */
    private final String f37391g;

    /* renamed from: h, reason: collision with root package name */
    private final String f37392h;

    /* renamed from: i, reason: collision with root package name */
    private final String f37393i;

    /* renamed from: j, reason: collision with root package name */
    private final int f37394j;

    /* renamed from: k, reason: collision with root package name */
    private final String f37395k;

    public he(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, String str10) {
        super(null);
        this.f37385a = str;
        this.f37386b = str2;
        this.f37387c = str3;
        this.f37388d = str4;
        this.f37389e = str5;
        this.f37390f = str6;
        this.f37391g = str7;
        this.f37392h = str8;
        this.f37393i = str9;
        this.f37394j = i2;
        this.f37395k = str10;
    }

    public static /* synthetic */ he k(he heVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, int i3) {
        return new he((i3 & 1) != 0 ? heVar.f37385a : null, (i3 & 2) != 0 ? heVar.f37386b : str, (i3 & 4) != 0 ? heVar.f37387c : str2, (i3 & 8) != 0 ? heVar.f37388d : str3, (i3 & 16) != 0 ? heVar.f37389e : null, (i3 & 32) != 0 ? heVar.f37390f : str4, (i3 & 64) != 0 ? heVar.f37391g : str5, (i3 & 128) != 0 ? heVar.f37392h : str6, (i3 & 256) != 0 ? heVar.f37393i : str7, (i3 & 512) != 0 ? heVar.f37394j : i2, (i3 & 1024) != 0 ? heVar.f37395k : str8);
    }

    public final int a() {
        return this.f37394j;
    }

    public final String b() {
        return this.f37386b;
    }

    public final String c() {
        return this.f37390f;
    }

    public final String d() {
        return this.f37387c;
    }

    public final String e() {
        return this.f37391g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he)) {
            return false;
        }
        he heVar = (he) obj;
        return h.g.b.x.n(this.f37385a, heVar.f37385a) && h.g.b.x.n(this.f37386b, heVar.f37386b) && h.g.b.x.n(this.f37387c, heVar.f37387c) && h.g.b.x.n(this.f37388d, heVar.f37388d) && h.g.b.x.n(this.f37389e, heVar.f37389e) && h.g.b.x.n(this.f37390f, heVar.f37390f) && h.g.b.x.n(this.f37391g, heVar.f37391g) && h.g.b.x.n(this.f37392h, heVar.f37392h) && h.g.b.x.n(this.f37393i, heVar.f37393i) && this.f37394j == heVar.f37394j && h.g.b.x.n(this.f37395k, heVar.f37395k);
    }

    public final String f() {
        return this.f37389e;
    }

    public final String g() {
        return this.f37395k;
    }

    public final String h() {
        return this.f37388d;
    }

    public final int hashCode() {
        String str = this.f37385a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f37386b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f37387c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f37388d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f37389e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f37390f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f37391g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f37392h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f37393i;
        int iHashCode9 = (((iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.f37394j) * 31;
        String str10 = this.f37395k;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String i() {
        return this.f37392h;
    }

    public final String j() {
        return this.f37393i;
    }

    public final String toString() {
        return "Data(userImageUrl=" + this.f37385a + ", firstName=" + this.f37386b + ", lastName=" + this.f37387c + ", username=" + this.f37388d + ", password=" + this.f37389e + ", firstNameEdit=" + this.f37390f + ", lastNameEdit=" + this.f37391g + ", usernameEdit=" + this.f37392h + ", usernameSuggestion=" + this.f37393i + ", usernameSuggestionResult=" + this.f37394j + ", passwordEdit=" + this.f37395k + ")";
    }
}
