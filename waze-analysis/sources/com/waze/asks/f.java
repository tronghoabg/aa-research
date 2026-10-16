package com.waze.asks;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f15588a;

    /* renamed from: b, reason: collision with root package name */
    private final g f15589b;

    public f(int i2, g gVar) {
        h.g.b.x.f(gVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f15588a = i2;
        this.f15589b = gVar;
    }

    public final int a() {
        return this.f15588a;
    }

    public final g b() {
        return this.f15589b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f15588a == fVar.f15588a && this.f15589b == fVar.f15589b;
    }

    public final int hashCode() {
        return (this.f15588a * 31) + this.f15589b.hashCode();
    }

    public final String toString() {
        return "FeedbackAnswer(pointsAward=" + this.f15588a + ", type=" + this.f15589b + ")";
    }
}
