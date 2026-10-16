package com.waze.ui.w.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au extends av {

    /* renamed from: a, reason: collision with root package name */
    private final bj f43616a;

    /* renamed from: b, reason: collision with root package name */
    private final int f43617b;

    /* renamed from: c, reason: collision with root package name */
    private final int f43618c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f43619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(bj bjVar, int i2, int i3, Object obj) {
        super(obj, false);
        h.g.b.x.f(bjVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(obj, "uiKey");
        this.f43616a = bjVar;
        this.f43617b = i2;
        this.f43618c = i3;
        this.f43619d = obj;
    }

    @Override // com.waze.ui.w.b.av
    public final int a() {
        return this.f43617b;
    }

    @Override // com.waze.ui.w.b.av
    public final int b() {
        return this.f43618c;
    }

    public final bj c() {
        return this.f43616a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return this.f43616a == auVar.f43616a && this.f43617b == auVar.f43617b && this.f43618c == auVar.f43618c && h.g.b.x.n(this.f43619d, auVar.f43619d);
    }

    @Override // com.waze.ui.w.b.av
    public final Object g() {
        return this.f43619d;
    }

    public final int hashCode() {
        return (((((this.f43616a.hashCode() * 31) + this.f43617b) * 31) + this.f43618c) * 31) + this.f43619d.hashCode();
    }

    public final String toString() {
        return "Subtype(type=" + this.f43616a + ", iconResId=" + this.f43617b + ", labelStringResId=" + this.f43618c + ", uiKey=" + this.f43619d + ")";
    }
}
