package com.waze.asks;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class au implements av {

    /* renamed from: a, reason: collision with root package name */
    private final String f15538a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15539b;

    /* renamed from: c, reason: collision with root package name */
    private final aw f15540c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15541d;

    /* renamed from: e, reason: collision with root package name */
    private final l f15542e;

    /* renamed from: f, reason: collision with root package name */
    private final List f15543f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15544g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15545h;

    public au(String str, String str2, aw awVar, boolean z, l lVar, List list, int i2, String str3) {
        h.g.b.x.f(str, "questionKey");
        h.g.b.x.f(str2, "entityId");
        h.g.b.x.f(awVar, "source");
        h.g.b.x.f(lVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(list, "answers");
        h.g.b.x.f(str3, "statsUgcContextId");
        this.f15538a = str;
        this.f15539b = str2;
        this.f15540c = awVar;
        this.f15541d = z;
        this.f15542e = lVar;
        this.f15543f = list;
        this.f15544g = i2;
        this.f15545h = str3;
    }

    public final l a() {
        return this.f15542e;
    }

    public final List b() {
        return this.f15543f;
    }

    @Override // com.waze.asks.av
    public final aw d() {
        return this.f15540c;
    }

    @Override // com.waze.asks.av
    public final String e() {
        return this.f15539b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return h.g.b.x.n(this.f15538a, auVar.f15538a) && h.g.b.x.n(this.f15539b, auVar.f15539b) && this.f15540c == auVar.f15540c && this.f15541d == auVar.f15541d && this.f15542e == auVar.f15542e && h.g.b.x.n(this.f15543f, auVar.f15543f) && this.f15544g == auVar.f15544g && h.g.b.x.n(this.f15545h, auVar.f15545h);
    }

    @Override // com.waze.asks.av
    public final String f() {
        return this.f15538a;
    }

    public final int hashCode() {
        return (((((((((((((this.f15538a.hashCode() * 31) + this.f15539b.hashCode()) * 31) + this.f15540c.hashCode()) * 31) + a.a.a(this.f15541d)) * 31) + this.f15542e.hashCode()) * 31) + this.f15543f.hashCode()) * 31) + this.f15544g) * 31) + this.f15545h.hashCode();
    }

    public final String toString() {
        return "MultiAskQuestion(questionKey=" + this.f15538a + ", entityId=" + this.f15539b + ", source=" + this.f15540c + ", isMock=" + this.f15541d + ", type=" + this.f15542e + ", answers=" + this.f15543f + ", statsAlertId=" + this.f15544g + ", statsUgcContextId=" + this.f15545h + ")";
    }
}
