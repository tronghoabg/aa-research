package com.waze.asks;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class at implements av {

    /* renamed from: a, reason: collision with root package name */
    private final String f15530a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15531b;

    /* renamed from: c, reason: collision with root package name */
    private final aw f15532c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15533d;

    /* renamed from: e, reason: collision with root package name */
    private final h f15534e;

    /* renamed from: f, reason: collision with root package name */
    private final p f15535f;

    /* renamed from: g, reason: collision with root package name */
    private final List f15536g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15537h;

    public at(String str, String str2, aw awVar, boolean z, h hVar, p pVar, List list, String str3) {
        h.g.b.x.f(str, "questionKey");
        h.g.b.x.f(str2, "entityId");
        h.g.b.x.f(awVar, "source");
        h.g.b.x.f(hVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(pVar, "triggeredByInsight");
        h.g.b.x.f(list, "answers");
        h.g.b.x.f(str3, "statsUgcContextId");
        this.f15530a = str;
        this.f15531b = str2;
        this.f15532c = awVar;
        this.f15533d = z;
        this.f15534e = hVar;
        this.f15535f = pVar;
        this.f15536g = list;
        this.f15537h = str3;
    }

    public final h a() {
        return this.f15534e;
    }

    public final p b() {
        return this.f15535f;
    }

    public final String c() {
        return this.f15537h;
    }

    @Override // com.waze.asks.av
    public final aw d() {
        return this.f15532c;
    }

    @Override // com.waze.asks.av
    public final String e() {
        return this.f15531b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        return h.g.b.x.n(this.f15530a, atVar.f15530a) && h.g.b.x.n(this.f15531b, atVar.f15531b) && this.f15532c == atVar.f15532c && this.f15533d == atVar.f15533d && this.f15534e == atVar.f15534e && h.g.b.x.n(this.f15535f, atVar.f15535f) && h.g.b.x.n(this.f15536g, atVar.f15536g) && h.g.b.x.n(this.f15537h, atVar.f15537h);
    }

    @Override // com.waze.asks.av
    public final String f() {
        return this.f15530a;
    }

    public final List g() {
        return this.f15536g;
    }

    public final int hashCode() {
        return (((((((((((((this.f15530a.hashCode() * 31) + this.f15531b.hashCode()) * 31) + this.f15532c.hashCode()) * 31) + a.a.a(this.f15533d)) * 31) + this.f15534e.hashCode()) * 31) + this.f15535f.hashCode()) * 31) + this.f15536g.hashCode()) * 31) + this.f15537h.hashCode();
    }

    public final String toString() {
        return "FeedbackQuestion(questionKey=" + this.f15530a + ", entityId=" + this.f15531b + ", source=" + this.f15532c + ", isMock=" + this.f15533d + ", type=" + this.f15534e + ", triggeredByInsight=" + this.f15535f + ", answers=" + this.f15536g + ", statsUgcContextId=" + this.f15537h + ")";
    }
}
