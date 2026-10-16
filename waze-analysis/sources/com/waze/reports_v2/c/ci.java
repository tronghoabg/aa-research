package com.waze.reports_v2.c;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ci {

    /* renamed from: a, reason: collision with root package name */
    private final String f34338a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34339b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34340c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.copilot.data.ah f34341d;

    public ci(String str, String str2, String str3, com.waze.copilot.data.ah ahVar) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, "locale");
        h.g.b.x.f(str3, "lang");
        h.g.b.x.f(ahVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f34338a = str;
        this.f34339b = str2;
        this.f34340c = str3;
        this.f34341d = ahVar;
    }

    public final com.waze.copilot.data.ah a() {
        return this.f34341d;
    }

    public final String b() {
        return this.f34338a;
    }

    public final String c() {
        return this.f34339b;
    }

    public final String d() {
        return this.f34340c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return h.g.b.x.n(this.f34338a, ciVar.f34338a) && h.g.b.x.n(this.f34339b, ciVar.f34339b) && h.g.b.x.n(this.f34340c, ciVar.f34340c) && this.f34341d == ciVar.f34341d;
    }

    public final int hashCode() {
        return (((((this.f34338a.hashCode() * 31) + this.f34339b.hashCode()) * 31) + this.f34340c.hashCode()) * 31) + this.f34341d.hashCode();
    }

    public final String toString() {
        return "SelectedVoiceLang(id=" + this.f34338a + ", locale=" + this.f34339b + ", lang=" + this.f34340c + ", type=" + this.f34341d + ")";
    }
}
