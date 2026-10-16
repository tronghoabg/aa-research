package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class nsy {
    public android.graphics.Rect a;
    public android.graphics.Rect b;
    public int c;
    public boolean d;
    public android.graphics.Rect e;
    public int f;
    public java.lang.String g;
    public int h;
    public int i;
    public com.google.android.gms.car.DropShadowParams j;
    public byte k;

    public final void a(int i) {
        this.h = i;
        this.k = (byte) (this.k | 8);
    }

    public final void b(int i) {
        this.i = i;
        this.k = (byte) (this.k | 16);
    }

    public final void c(boolean z) {
        this.d = z;
        this.k = (byte) (this.k | 2);
    }

    public final void d(int i) {
        this.c = i;
        this.k = (byte) (this.k | 1);
    }
}
