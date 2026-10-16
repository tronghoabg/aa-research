package defpackage;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class jhq {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Rect h;
    public final jid i;
    public final jid j;
    public final int k;
    public final int l;

    public jhq(int i, int i2, int i3, int i4, int i5, Rect rect, jid jidVar, jid jidVar2, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.g = i5;
        this.e = i + i3;
        this.f = i2 + i4;
        this.h = rect;
        this.i = jidVar;
        this.j = jidVar2;
        this.k = i6;
        this.l = i7;
    }

    public final String toString() {
        jid jidVar = this.j;
        jid jidVar2 = this.i;
        return "{blX=" + this.a + ", blY=" + this.b + ", trX=" + this.e + ", trY=" + this.f + ", width=" + this.c + ", height=" + this.d + ", z=" + this.g + ", systemWindowInsets=" + String.valueOf(this.h) + ", enterAnimation=" + String.valueOf(jidVar2) + ", exitAnimation=" + String.valueOf(jidVar) + ", focusFlags=" + this.k + ", visibilityFlags=" + this.l + "}";
    }
}
