package com.waze.main_screen.b.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f25871a;

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap f25872b;

    public e(Drawable drawable, Bitmap bitmap) {
        this.f25871a = drawable;
        this.f25872b = bitmap;
    }

    public static /* synthetic */ e c(e eVar, Bitmap bitmap) {
        return new e(eVar.f25871a, bitmap);
    }

    public final Bitmap a() {
        return this.f25872b;
    }

    public final Drawable b() {
        return this.f25871a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return x.n(this.f25871a, eVar.f25871a) && x.n(this.f25872b, eVar.f25872b);
    }

    public final int hashCode() {
        Drawable drawable = this.f25871a;
        int iHashCode = drawable == null ? 0 : drawable.hashCode();
        Bitmap bitmap = this.f25872b;
        return (iHashCode * 31) + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "State(icon=" + this.f25871a + ", bitmap=" + this.f25872b + ")";
    }

    public e() {
        this(null);
    }

    public /* synthetic */ e(byte[] bArr) {
        this(null, null);
    }
}
