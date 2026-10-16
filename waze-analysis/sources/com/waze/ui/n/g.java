package com.waze.ui.n;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    private final int f43079a;

    /* renamed from: b, reason: collision with root package name */
    private final int f43080b;

    /* renamed from: c, reason: collision with root package name */
    private final int f43081c;

    /* renamed from: d, reason: collision with root package name */
    private final int f43082d;

    public g(int i2, int i3, int i4, int i5) {
        super(null);
        this.f43079a = i2;
        this.f43080b = i3;
        this.f43081c = i4;
        this.f43082d = i5;
    }

    public final int a() {
        return this.f43081c;
    }

    public final int b() {
        return this.f43082d;
    }

    public final int c() {
        return this.f43080b;
    }

    public final int d() {
        return this.f43079a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f43079a == gVar.f43079a && this.f43080b == gVar.f43080b && this.f43081c == gVar.f43081c && this.f43082d == gVar.f43082d;
    }

    public final int hashCode() {
        return (((((this.f43079a * 31) + this.f43080b) * 31) + this.f43081c) * 31) + this.f43082d;
    }

    public final String toString() {
        return "Initial(title=" + this.f43079a + ", message=" + this.f43080b + ", confirmButtonText=" + this.f43081c + ", icon=" + this.f43082d + ")";
    }
}
