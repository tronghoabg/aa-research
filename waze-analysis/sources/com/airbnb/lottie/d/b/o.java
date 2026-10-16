package com.airbnb.lottie.d.b;

import com.airbnb.lottie.s;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class o implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f2194a;

    /* renamed from: b, reason: collision with root package name */
    private final List f2195b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2196c;

    public o(String str, List list, boolean z) {
        this.f2194a = str;
        this.f2195b = list;
        this.f2196c = z;
    }

    @Override // com.airbnb.lottie.d.b.c
    public final com.airbnb.lottie.a.a.d a(s sVar, com.airbnb.lottie.h hVar, com.airbnb.lottie.d.c.b bVar) {
        return new com.airbnb.lottie.a.a.e(sVar, bVar, this, hVar);
    }

    public final String b() {
        return this.f2194a;
    }

    public final List c() {
        return this.f2195b;
    }

    public final boolean d() {
        return this.f2196c;
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f2194a + "' Shapes: " + Arrays.toString(this.f2195b.toArray()) + "}";
    }
}
