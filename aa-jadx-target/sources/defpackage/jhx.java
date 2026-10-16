package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jhx {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final android.graphics.Rect h;
    public final defpackage.jik i;
    public final defpackage.jik j;
    public final int k;
    public final int l;

    public jhx(int i, int i2, int i3, int i4, int i5, android.graphics.Rect rect, defpackage.jik jikVar, defpackage.jik jikVar2, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.g = i5;
        this.e = i + i3;
        this.f = i2 + i4;
        this.h = rect;
        this.i = jikVar;
        this.j = jikVar2;
        this.k = i6;
        this.l = i7;
    }

    public final java.lang.String toString() {
        defpackage.jik jikVar = this.j;
        defpackage.jik jikVar2 = this.i;
        return "{blX=" + this.a + ", blY=" + this.b + ", trX=" + this.e + ", trY=" + this.f + ", width=" + this.c + ", height=" + this.d + ", z=" + this.g + ", systemWindowInsets=" + java.lang.String.valueOf(this.h) + ", enterAnimation=" + java.lang.String.valueOf(jikVar2) + ", exitAnimation=" + java.lang.String.valueOf(jikVar) + ", focusFlags=" + this.k + ", visibilityFlags=" + this.l + "}";
    }
}
