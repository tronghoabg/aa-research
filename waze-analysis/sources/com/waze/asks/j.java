package com.waze.asks;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f15608a;

    /* renamed from: b, reason: collision with root package name */
    private final k f15609b;

    public j(int i2, k kVar) {
        h.g.b.x.f(kVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f15608a = i2;
        this.f15609b = kVar;
    }

    public final int a() {
        return this.f15608a;
    }

    public final k b() {
        return this.f15609b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f15608a == jVar.f15608a && this.f15609b == jVar.f15609b;
    }

    public final int hashCode() {
        return (this.f15608a * 31) + this.f15609b.hashCode();
    }

    public final String toString() {
        return "MultiAskAnswer(pointsAward=" + this.f15608a + ", type=" + this.f15609b + ")";
    }
}
