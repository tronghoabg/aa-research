package com.waze.reports_v2.presentation;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bc {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.w.b.bh f34843a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34844b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34845c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34846d;

    public bc(com.waze.ui.w.b.bh bhVar, int i2, int i3, int i4) {
        h.g.b.x.f(bhVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f34843a = bhVar;
        this.f34844b = i2;
        this.f34845c = i3;
        this.f34846d = i4;
    }

    public final int a() {
        return this.f34844b;
    }

    public final int b() {
        return this.f34845c;
    }

    public final int c() {
        return this.f34846d;
    }

    public final com.waze.ui.w.b.bh d() {
        return this.f34843a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return this.f34843a == bcVar.f34843a && this.f34844b == bcVar.f34844b && this.f34845c == bcVar.f34845c && this.f34846d == bcVar.f34846d;
    }

    public final int hashCode() {
        return (((((this.f34843a.hashCode() * 31) + this.f34844b) * 31) + this.f34845c) * 31) + this.f34846d;
    }

    public final String toString() {
        return "StaticCategoryUiData(type=" + this.f34843a + ", iconResId=" + this.f34844b + ", labelStringResId=" + this.f34845c + ", submenuTitleResId=" + this.f34846d + ")";
    }
}
