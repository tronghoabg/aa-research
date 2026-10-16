package com.waze.z.a.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final d f45825a;

    /* renamed from: b, reason: collision with root package name */
    private final d f45826b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f45827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, d dVar2, boolean z) {
        super(null);
        x.f(dVar, "primaryAction");
        x.f(dVar2, "secondaryAction");
        this.f45825a = dVar;
        this.f45826b = dVar2;
        this.f45827c = z;
    }

    public final d a() {
        return this.f45825a;
    }

    public final d b() {
        return this.f45826b;
    }

    public final boolean c() {
        return this.f45827c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f45825a, aVar.f45825a) && x.n(this.f45826b, aVar.f45826b) && this.f45827c == aVar.f45827c;
    }

    public final int hashCode() {
        return (((this.f45825a.hashCode() * 31) + this.f45826b.hashCode()) * 31) + a.a.a(this.f45827c);
    }

    public final String toString() {
        return "DoubleActions(primaryAction=" + this.f45825a + ", secondaryAction=" + this.f45826b + ", horizontalCTA=" + this.f45827c + ")";
    }

    public /* synthetic */ a(d dVar, d dVar2) {
        this(dVar, dVar2, false);
    }
}
