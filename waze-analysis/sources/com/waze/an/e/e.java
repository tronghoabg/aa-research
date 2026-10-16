package com.waze.an.e;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.an.a.ae;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    private final String f14863a;

    /* renamed from: b, reason: collision with root package name */
    private final ae f14864b;

    public e(String str, ae aeVar) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(aeVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f14863a = str;
        this.f14864b = aeVar;
    }

    public final ae a() {
        return this.f14864b;
    }

    public final String b() {
        return this.f14863a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return x.n(this.f14863a, eVar.f14863a) && this.f14864b == eVar.f14864b;
    }

    public final int hashCode() {
        return (this.f14863a.hashCode() * 31) + this.f14864b.hashCode();
    }

    public final String toString() {
        return "Notification(id=" + this.f14863a + ", type=" + this.f14864b + ")";
    }
}
