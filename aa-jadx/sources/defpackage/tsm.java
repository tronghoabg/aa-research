package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tsm {
    public defpackage.tpg a;
    public defpackage.tso b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private byte i;

    public final defpackage.tsn a() {
        defpackage.tpg tpgVar;
        defpackage.tso tsoVar;
        if ((this.i & 4) == 0) {
            throw new java.lang.IllegalStateException();
        }
        float f = this.e % 360.0f;
        if (f < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            f += 360.0f;
        }
        c(f);
        if ((this.i & 8) == 0) {
            throw new java.lang.IllegalStateException();
        }
        f(java.lang.Math.max(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, java.lang.Math.min(90.0f, this.f)));
        if ((this.i & 32) == 0) {
            throw new java.lang.IllegalStateException();
        }
        h(java.lang.Math.max(2.0f, java.lang.Math.min(this.h, 21.0f)));
        if (java.lang.Float.isNaN(b())) {
            g(30.0f);
        } else {
            g(b());
        }
        if (this.i != 63 || (tpgVar = this.a) == null || (tsoVar = this.b) == null) {
            throw new java.lang.IllegalStateException();
        }
        return new defpackage.tsn(tpgVar, this.c, this.d, this.e, this.f, tsoVar, this.g, this.h);
    }

    public final float b() {
        if ((this.i & 16) != 0) {
            return this.g;
        }
        throw new java.lang.IllegalStateException();
    }

    public final void c(float f) {
        this.e = f;
        this.i = (byte) (this.i | 4);
    }

    public final void d(float f) {
        this.c = f;
        this.i = (byte) (this.i | 1);
    }

    public final void e(float f) {
        this.d = f;
        this.i = (byte) (this.i | 2);
    }

    public final void f(float f) {
        this.f = f;
        this.i = (byte) (this.i | 8);
    }

    public final void g(float f) {
        this.g = f;
        this.i = (byte) (this.i | 16);
    }

    public final void h(float f) {
        this.h = f;
        this.i = (byte) (this.i | 32);
    }
}
