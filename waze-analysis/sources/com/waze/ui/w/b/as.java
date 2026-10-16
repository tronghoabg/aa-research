package com.waze.ui.w.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as extends av {

    /* renamed from: a, reason: collision with root package name */
    private final bh f43608a;

    /* renamed from: b, reason: collision with root package name */
    private final int f43609b;

    /* renamed from: c, reason: collision with root package name */
    private final int f43610c;

    /* renamed from: d, reason: collision with root package name */
    private final int f43611d;

    /* renamed from: e, reason: collision with root package name */
    private final List f43612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(bh bhVar, int i2, int i3, int i4, List list) {
        super(bhVar, true);
        h.g.b.x.f(bhVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(list, "children");
        this.f43608a = bhVar;
        this.f43609b = i2;
        this.f43610c = i3;
        this.f43611d = i4;
        this.f43612e = list;
    }

    @Override // com.waze.ui.w.b.av
    public final int a() {
        return this.f43609b;
    }

    @Override // com.waze.ui.w.b.av
    public final int b() {
        return this.f43610c;
    }

    public final int c() {
        return this.f43611d;
    }

    public final bh d() {
        return this.f43608a;
    }

    public final List e() {
        return this.f43612e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return this.f43608a == asVar.f43608a && this.f43609b == asVar.f43609b && this.f43610c == asVar.f43610c && this.f43611d == asVar.f43611d && h.g.b.x.n(this.f43612e, asVar.f43612e);
    }

    public final int hashCode() {
        return (((((((this.f43608a.hashCode() * 31) + this.f43609b) * 31) + this.f43610c) * 31) + this.f43611d) * 31) + this.f43612e.hashCode();
    }

    public final String toString() {
        return "Category(type=" + this.f43608a + ", iconResId=" + this.f43609b + ", labelStringResId=" + this.f43610c + ", submenuTitleResId=" + this.f43611d + ", children=" + this.f43612e + ")";
    }
}
