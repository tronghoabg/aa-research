package com.waze.bk;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends com.waze.bi.i {

    /* renamed from: a, reason: collision with root package name */
    private final int f16873a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16874b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16875c;

    public o(int i2, int i3, int i4) {
        super(null);
        this.f16873a = i2;
        this.f16874b = i3;
        this.f16875c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f16873a == oVar.f16873a && this.f16874b == oVar.f16874b && this.f16875c == oVar.f16875c;
    }

    public final int h() {
        return this.f16875c;
    }

    public final int hashCode() {
        return (((this.f16873a * 31) + this.f16874b) * 31) + this.f16875c;
    }

    public final int i() {
        return this.f16874b;
    }

    public final int j() {
        return this.f16873a;
    }

    public final String toString() {
        return "Resized(width=" + this.f16873a + ", height=" + this.f16874b + ", dpi=" + this.f16875c + ")";
    }
}
