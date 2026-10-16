package com.waze.uid.f;

import android.graphics.drawable.Drawable;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f44496a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44497b;

    /* renamed from: c, reason: collision with root package name */
    private final int f44498c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f44499d;

    /* renamed from: e, reason: collision with root package name */
    private final String f44500e;

    /* renamed from: f, reason: collision with root package name */
    private final String f44501f;

    /* renamed from: g, reason: collision with root package name */
    private final String f44502g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f44503h;

    /* renamed from: i, reason: collision with root package name */
    private final long f44504i;

    /* renamed from: j, reason: collision with root package name */
    private final long f44505j;

    /* renamed from: k, reason: collision with root package name */
    private final int f44506k;

    public c(long j2, String str, int i2, String str2, String str3, String str4, boolean z, long j3, long j4, int i3) {
        x.f(str, "imageUrl");
        x.f(str2, "userName");
        x.f(str3, "firstName");
        x.f(str4, "lastName");
        this.f44496a = j2;
        this.f44497b = str;
        this.f44498c = i2;
        this.f44499d = null;
        this.f44500e = str2;
        this.f44501f = str3;
        this.f44502g = str4;
        this.f44503h = z;
        this.f44504i = j3;
        this.f44505j = j4;
        this.f44506k = i3;
    }

    public final int a() {
        return this.f44498c;
    }

    public final int b() {
        return this.f44506k;
    }

    public final long c() {
        return this.f44504i;
    }

    public final long d() {
        return this.f44505j;
    }

    public final long e() {
        return this.f44496a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f44496a == cVar.f44496a && x.n(this.f44497b, cVar.f44497b) && this.f44498c == cVar.f44498c && x.n(this.f44499d, cVar.f44499d) && x.n(this.f44500e, cVar.f44500e) && x.n(this.f44501f, cVar.f44501f) && x.n(this.f44502g, cVar.f44502g) && this.f44503h == cVar.f44503h && this.f44504i == cVar.f44504i && this.f44505j == cVar.f44505j && this.f44506k == cVar.f44506k;
    }

    public final Drawable f() {
        return this.f44499d;
    }

    public final String g() {
        return this.f44501f;
    }

    public final String h() {
        return this.f44497b;
    }

    public final int hashCode() {
        int iB = (a.a.b(this.f44496a) * 31) + this.f44497b.hashCode();
        Drawable drawable = this.f44499d;
        return (((((((((((((((((iB * 31) + this.f44498c) * 31) + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f44500e.hashCode()) * 31) + this.f44501f.hashCode()) * 31) + this.f44502g.hashCode()) * 31) + a.a.a(this.f44503h)) * 31) + a.a.b(this.f44504i)) * 31) + a.a.b(this.f44505j)) * 31) + this.f44506k;
    }

    public final String i() {
        return this.f44502g;
    }

    public final String j() {
        return this.f44500e;
    }

    public final void k(Drawable drawable) {
        this.f44499d = drawable;
    }

    public final boolean l() {
        return this.f44503h;
    }

    public final String toString() {
        return "ChooseAccountProfile(userId=" + this.f44496a + ", imageUrl=" + this.f44497b + ", moodId=" + this.f44498c + ", imageDrawable=" + this.f44499d + ", userName=" + this.f44500e + ", firstName=" + this.f44501f + ", lastName=" + this.f44502g + ", anonymous=" + this.f44503h + ", lastLoginSec=" + this.f44504i + ", points=" + this.f44505j + ", numFavorites=" + this.f44506k + ")";
    }
}
