package com.waze.copilot.data;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final String f22955a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22956b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22957c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22958d;

    /* renamed from: e, reason: collision with root package name */
    private final String f22959e;

    /* renamed from: f, reason: collision with root package name */
    private final String f22960f;

    /* renamed from: g, reason: collision with root package name */
    private final a f22961g;

    /* renamed from: h, reason: collision with root package name */
    private final b f22962h;

    /* renamed from: i, reason: collision with root package name */
    private final ah f22963i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f22964j;

    public ag(String str, int i2, String str2, String str3, String str4, String str5, a aVar, b bVar, ah ahVar, boolean z) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str3, "description");
        h.g.b.x.f(str4, "lang");
        h.g.b.x.f(str5, "locale");
        h.g.b.x.f(aVar, "downloadable");
        h.g.b.x.f(bVar, "preview");
        h.g.b.x.f(ahVar, "voiceType");
        this.f22955a = str;
        this.f22956b = i2;
        this.f22957c = str2;
        this.f22958d = str3;
        this.f22959e = str4;
        this.f22960f = str5;
        this.f22961g = aVar;
        this.f22962h = bVar;
        this.f22963i = ahVar;
        this.f22964j = z;
    }

    public static /* synthetic */ ag k(ag agVar, String str) {
        String str2 = agVar.f22955a;
        int i2 = agVar.f22956b;
        String str3 = agVar.f22958d;
        String str4 = agVar.f22959e;
        String str5 = agVar.f22960f;
        a aVar = agVar.f22961g;
        b bVar = agVar.f22962h;
        ah ahVar = agVar.f22963i;
        boolean z = agVar.f22964j;
        h.g.b.x.f(str2, TtmlNode.ATTR_ID);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str3, "description");
        h.g.b.x.f(str4, "lang");
        h.g.b.x.f(str5, "locale");
        h.g.b.x.f(aVar, "downloadable");
        h.g.b.x.f(bVar, "preview");
        h.g.b.x.f(ahVar, "voiceType");
        return new ag(str2, i2, str, str3, str4, str5, aVar, bVar, ahVar, z);
    }

    public final int a() {
        return this.f22956b;
    }

    public final a b() {
        return this.f22961g;
    }

    public final b c() {
        return this.f22962h;
    }

    public final ah d() {
        return this.f22963i;
    }

    public final String e() {
        return this.f22958d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return h.g.b.x.n(this.f22955a, agVar.f22955a) && this.f22956b == agVar.f22956b && h.g.b.x.n(this.f22957c, agVar.f22957c) && h.g.b.x.n(this.f22958d, agVar.f22958d) && h.g.b.x.n(this.f22959e, agVar.f22959e) && h.g.b.x.n(this.f22960f, agVar.f22960f) && h.g.b.x.n(this.f22961g, agVar.f22961g) && h.g.b.x.n(this.f22962h, agVar.f22962h) && this.f22963i == agVar.f22963i && this.f22964j == agVar.f22964j;
    }

    public final String f() {
        return this.f22955a;
    }

    public final String g() {
        return this.f22959e;
    }

    public final String h() {
        return this.f22960f;
    }

    public final int hashCode() {
        return (((((((((((((((((this.f22955a.hashCode() * 31) + this.f22956b) * 31) + this.f22957c.hashCode()) * 31) + this.f22958d.hashCode()) * 31) + this.f22959e.hashCode()) * 31) + this.f22960f.hashCode()) * 31) + this.f22961g.hashCode()) * 31) + this.f22962h.hashCode()) * 31) + this.f22963i.hashCode()) * 31) + a.a.a(this.f22964j);
    }

    public final String i() {
        return this.f22957c;
    }

    public final boolean j() {
        return this.f22964j;
    }

    public final String toString() {
        return "VoiceAsset(id=" + this.f22955a + ", version=" + this.f22956b + ", name=" + this.f22957c + ", description=" + this.f22958d + ", lang=" + this.f22959e + ", locale=" + this.f22960f + ", downloadable=" + this.f22961g + ", preview=" + this.f22962h + ", voiceType=" + this.f22963i + ", isFallback=" + this.f22964j + ")";
    }
}
