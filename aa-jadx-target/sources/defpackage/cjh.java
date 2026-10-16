package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cjh {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = java.lang.Math.max(f, this.a);
        this.b = java.lang.Math.max(f2, this.b);
        this.c = java.lang.Math.min(f3, this.c);
        this.d = java.lang.Math.min(f4, this.d);
    }

    public final void b(long j) {
        int i = (int) (4294967295L & j);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
        this.a += fIntBitsToFloat;
        this.b += fIntBitsToFloat2;
        this.c += fIntBitsToFloat;
        this.d += fIntBitsToFloat2;
    }

    public final boolean c() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final void d(float f, float f2) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
    }

    public final java.lang.String toString() {
        return "MutableRect(" + defpackage.bzd.p(this.a) + ", " + defpackage.bzd.p(this.b) + ", " + defpackage.bzd.p(this.c) + ", " + defpackage.bzd.p(this.d) + ")";
    }
}
