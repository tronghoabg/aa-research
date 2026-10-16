package com.waze.ui.o;

import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final String f43114a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f43115b;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable f43116c;

    public ab(String str, Drawable drawable, Drawable drawable2) {
        this.f43114a = str;
        this.f43115b = drawable;
        this.f43116c = drawable2;
    }

    public static /* synthetic */ ab d(ab abVar, String str, Drawable drawable, Drawable drawable2, int i2) {
        if ((i2 & 1) != 0) {
            str = abVar.f43114a;
        }
        if ((i2 & 2) != 0) {
            drawable = abVar.f43115b;
        }
        if ((i2 & 4) != 0) {
            drawable2 = abVar.f43116c;
        }
        return new ab(str, drawable, drawable2);
    }

    public final Drawable a() {
        return this.f43116c;
    }

    public final Drawable b() {
        return this.f43115b;
    }

    public final String c() {
        return this.f43114a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return h.g.b.x.n(this.f43114a, abVar.f43114a) && h.g.b.x.n(this.f43115b, abVar.f43115b) && h.g.b.x.n(this.f43116c, abVar.f43116c);
    }

    public final int hashCode() {
        String str = this.f43114a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Drawable drawable = this.f43115b;
        int iHashCode2 = drawable == null ? 0 : drawable.hashCode();
        int i2 = iHashCode * 31;
        Drawable drawable2 = this.f43116c;
        return ((i2 + iHashCode2) * 31) + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public final String toString() {
        return "MainMenuHeaderState(userName=" + this.f43114a + ", moodDrawable=" + this.f43115b + ", moodAddonDrawable=" + this.f43116c + ")";
    }
}
