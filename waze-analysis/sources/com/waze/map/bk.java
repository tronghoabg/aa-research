package com.waze.map;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bk extends bl {

    /* renamed from: a, reason: collision with root package name */
    public final int f28413a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28414b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28415c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28416d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28417e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28418f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28419g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28420h;

    /* renamed from: i, reason: collision with root package name */
    public final com.waze.shared_infra.h.c f28421i;

    /* renamed from: j, reason: collision with root package name */
    private final gu f28422j;

    public bk(gu guVar, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(guVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str2, "mood");
        h.g.b.x.f(str6, "speed");
        h.g.b.x.f(cVar, "coordinate");
        this.f28422j = guVar;
        this.f28413a = i2;
        this.f28414b = str;
        this.f28415c = str2;
        this.f28416d = str3;
        this.f28417e = str4;
        this.f28418f = str5;
        this.f28419g = str6;
        this.f28420h = i3;
        this.f28421i = cVar;
    }

    @Override // com.waze.map.bl
    public final gu a() {
        return this.f28422j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return this.f28422j == bkVar.f28422j && this.f28413a == bkVar.f28413a && h.g.b.x.n(this.f28414b, bkVar.f28414b) && h.g.b.x.n(this.f28415c, bkVar.f28415c) && h.g.b.x.n(this.f28416d, bkVar.f28416d) && h.g.b.x.n(this.f28417e, bkVar.f28417e) && h.g.b.x.n(this.f28418f, bkVar.f28418f) && h.g.b.x.n(this.f28419g, bkVar.f28419g) && this.f28420h == bkVar.f28420h && h.g.b.x.n(this.f28421i, bkVar.f28421i);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f28422j.hashCode() * 31) + this.f28413a) * 31) + this.f28414b.hashCode()) * 31) + this.f28415c.hashCode();
        String str = this.f28416d;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28417e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28418f;
        return ((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f28419g.hashCode()) * 31) + this.f28420h) * 31) + this.f28421i.hashCode();
    }

    public final String toString() {
        return "Wazer(type=" + this.f28422j + ", id=" + this.f28413a + ", name=" + this.f28414b + ", mood=" + this.f28415c + ", addon=" + this.f28416d + ", points=" + this.f28417e + ", joined=" + this.f28418f + ", speed=" + this.f28419g + ", azimuth=" + this.f28420h + ", coordinate=" + this.f28421i + ")";
    }
}
