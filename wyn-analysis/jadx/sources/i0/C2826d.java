package i0;

import A.AbstractC0213f;
import e0.C2465q;
import ef.C2539w;

/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2826d {

    /* renamed from: a, reason: collision with root package name */
    public final String f36609a;

    /* renamed from: b, reason: collision with root package name */
    public final float f36610b;

    /* renamed from: c, reason: collision with root package name */
    public final float f36611c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36612d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36613e;

    /* renamed from: f, reason: collision with root package name */
    public final H f36614f;

    /* renamed from: g, reason: collision with root package name */
    public final long f36615g;

    /* renamed from: h, reason: collision with root package name */
    public final int f36616h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f36617i;

    public C2826d(String str, float f10, float f11, float f12, float f13, H h10, long j8, int i5, boolean z2) {
        this.f36609a = str;
        this.f36610b = f10;
        this.f36611c = f11;
        this.f36612d = f12;
        this.f36613e = f13;
        this.f36614f = h10;
        this.f36615g = j8;
        this.f36616h = i5;
        this.f36617i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2826d)) {
            return false;
        }
        C2826d c2826d = (C2826d) obj;
        return this.f36609a.equals(c2826d.f36609a) && L0.d.a(this.f36610b, c2826d.f36610b) && L0.d.a(this.f36611c, c2826d.f36611c) && this.f36612d == c2826d.f36612d && this.f36613e == c2826d.f36613e && this.f36614f.equals(c2826d.f36614f) && C2465q.b(this.f36615g, c2826d.f36615g) && this.f36616h == c2826d.f36616h && this.f36617i == c2826d.f36617i;
    }

    public final int hashCode() {
        int iHashCode = (this.f36614f.hashCode() + AbstractC0213f.c(this.f36613e, AbstractC0213f.c(this.f36612d, AbstractC0213f.c(this.f36611c, AbstractC0213f.c(this.f36610b, this.f36609a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i5 = C2465q.f34381j;
        return ((((C2539w.a(this.f36615g) + iHashCode) * 31) + this.f36616h) * 31) + (this.f36617i ? 1231 : 1237);
    }
}
