package com.waze.map.main;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final int f29297a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29298b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29299c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29300d;

    /* renamed from: e, reason: collision with root package name */
    private final int f29301e;

    /* renamed from: f, reason: collision with root package name */
    private final int f29302f;

    /* renamed from: g, reason: collision with root package name */
    private final int f29303g;

    public aa(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f29297a = i2;
        this.f29298b = i3;
        this.f29299c = i4;
        this.f29300d = i5;
        this.f29301e = i6;
        this.f29302f = i7;
        this.f29303g = i8;
    }

    public static /* synthetic */ aa h(aa aaVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i2 = aaVar.f29297a;
        }
        int i10 = i2;
        if ((i9 & 2) != 0) {
            i3 = aaVar.f29298b;
        }
        int i11 = i3;
        if ((i9 & 4) != 0) {
            i4 = aaVar.f29299c;
        }
        int i12 = i4;
        if ((i9 & 8) != 0) {
            i5 = aaVar.f29300d;
        }
        int i13 = i5;
        if ((i9 & 16) != 0) {
            i6 = aaVar.f29301e;
        }
        int i14 = i6;
        if ((i9 & 32) != 0) {
            i7 = aaVar.f29302f;
        }
        int i15 = i7;
        if ((i9 & 64) != 0) {
            i8 = aaVar.f29303g;
        }
        return new aa(i10, i11, i12, i13, i14, i15, i8);
    }

    public final int a() {
        return this.f29302f;
    }

    public final int b() {
        return this.f29303g;
    }

    public final int c() {
        return this.f29297a;
    }

    public final int d() {
        return this.f29300d;
    }

    public final int e() {
        return this.f29301e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return this.f29297a == aaVar.f29297a && this.f29298b == aaVar.f29298b && this.f29299c == aaVar.f29299c && this.f29300d == aaVar.f29300d && this.f29301e == aaVar.f29301e && this.f29302f == aaVar.f29302f && this.f29303g == aaVar.f29303g;
    }

    public final int f() {
        return this.f29299c;
    }

    public final int g() {
        return this.f29298b;
    }

    public final int hashCode() {
        return (((((((((((this.f29297a * 31) + this.f29298b) * 31) + this.f29299c) * 31) + this.f29300d) * 31) + this.f29301e) * 31) + this.f29302f) * 31) + this.f29303g;
    }

    public final String toString() {
        return "MainMapGeometry(height=" + this.f29297a + ", width=" + this.f29298b + ", topMargin=" + this.f29299c + ", leftMargin=" + this.f29300d + ", rightMargin=" + this.f29301e + ", bottomMargin=" + this.f29302f + ", carIndicationToBottom=" + this.f29303g + ")";
    }
}
