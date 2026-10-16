package com.waze.an.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final String f14607a;

    /* renamed from: b, reason: collision with root package name */
    private final ae f14608b;

    public u(String str, ae aeVar) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(aeVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f14607a = str;
        this.f14608b = aeVar;
    }

    public final ae b() {
        return this.f14608b;
    }

    public final String c() {
        return this.f14607a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return h.g.b.x.n(this.f14607a, uVar.f14607a) && this.f14608b == uVar.f14608b;
    }

    public final int hashCode() {
        return (this.f14607a.hashCode() * 31) + this.f14608b.hashCode();
    }

    public final String toString() {
        return "Notification(id=" + this.f14607a + ", type=" + this.f14608b + ")";
    }
}
