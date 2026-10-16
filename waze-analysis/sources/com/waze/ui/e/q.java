package com.waze.ui.e;

import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    private final int f42237a;

    /* renamed from: b, reason: collision with root package name */
    private final Color f42238b;

    private q(int i2, Color color) {
        super(null);
        this.f42237a = i2;
        this.f42238b = color;
    }

    public final int a() {
        return this.f42237a;
    }

    public final Color b() {
        return this.f42238b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f42237a == qVar.f42237a && h.g.b.x.n(this.f42238b, qVar.f42238b);
    }

    public final int hashCode() {
        Color color = this.f42238b;
        return (this.f42237a * 31) + (color == null ? 0 : Color.m8235hashCodeimpl(color.m8238unboximpl()));
    }

    public final String toString() {
        return "Resource(resId=" + this.f42237a + ", tint=" + this.f42238b + ")";
    }

    public /* synthetic */ q(int i2, Color color, byte[] bArr) {
        this(i2, color);
    }

    public /* synthetic */ q(int i2) {
        this(i2, null);
    }
}
