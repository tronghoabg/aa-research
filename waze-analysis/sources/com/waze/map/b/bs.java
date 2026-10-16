package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bs {

    /* renamed from: a, reason: collision with root package name */
    private static final bs f28105a = new bs(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private final int f28106b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28107c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28108d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28109e;

    public bs(int i2, int i3, int i4, int i5) {
        this.f28106b = i2;
        this.f28107c = i3;
        this.f28108d = i4;
        this.f28109e = i5;
    }

    public final int a() {
        return this.f28107c;
    }

    public final int b() {
        return this.f28108d;
    }

    public final int c() {
        return this.f28109e;
    }

    public final int d() {
        return this.f28106b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs)) {
            return false;
        }
        bs bsVar = (bs) obj;
        return this.f28106b == bsVar.f28106b && this.f28107c == bsVar.f28107c && this.f28108d == bsVar.f28108d && this.f28109e == bsVar.f28109e;
    }

    public final int hashCode() {
        return (((((this.f28106b * 31) + this.f28107c) * 31) + this.f28108d) * 31) + this.f28109e;
    }

    public final String toString() {
        return "MapPaddingDp(top=" + this.f28106b + ", bottom=" + this.f28107c + ", left=" + this.f28108d + ", right=" + this.f28109e + ")";
    }

    public bs() {
        this(0, 0, 0, 0);
    }
}
