package com.airbnb.lottie.d.b;

import com.airbnb.lottie.s;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2161a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2162b;

    public h(int i2, boolean z) {
        this.f2162b = i2;
        this.f2161a = z;
    }

    @Override // com.airbnb.lottie.d.b.c
    public final com.airbnb.lottie.a.a.d a(s sVar, com.airbnb.lottie.h hVar, com.airbnb.lottie.d.c.b bVar) {
        if (sVar.N()) {
            return new com.airbnb.lottie.a.a.m(this);
        }
        com.airbnb.lottie.g.c.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final boolean b() {
        return this.f2161a;
    }

    public final int c() {
        return this.f2162b;
    }

    public final String toString() {
        int i2 = this.f2162b;
        return "MergePaths{mode=" + (i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE") + "}";
    }
}
