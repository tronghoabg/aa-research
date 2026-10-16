package com.waze.an.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final String f14609a;

    /* renamed from: b, reason: collision with root package name */
    private final ao f14610b;

    public v(String str, ao aoVar) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(aoVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f14609a = str;
        this.f14610b = aoVar;
    }

    public final ao b() {
        return this.f14610b;
    }

    public final String c() {
        return this.f14609a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return h.g.b.x.n(this.f14609a, vVar.f14609a) && h.g.b.x.n(this.f14610b, vVar.f14610b);
    }

    public final int hashCode() {
        return (this.f14609a.hashCode() * 31) + this.f14610b.hashCode();
    }

    public final String toString() {
        return "Segment(id=" + this.f14609a + ", type=" + this.f14610b + ")";
    }
}
