package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xru {
    public float a;
    public int b;
    public float c;
    public float d;
    public float e;
    public String f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;

    public xru(xqn xqnVar) {
        this.a = xqnVar.b;
        this.b = xqnVar.c;
        this.c = xqnVar.d;
        this.g = xqnVar.e;
        this.h = xqnVar.f;
        this.i = xqnVar.g;
        this.d = xqnVar.h;
        this.e = xqnVar.i;
        this.f = xqnVar.a;
        this.j = xqnVar.j;
        this.k = xqnVar.k;
        this.l = xqnVar.l;
    }

    public final xqn a() {
        String str = this.f;
        float f = this.a;
        int i = this.b;
        float f2 = this.c;
        float f3 = this.g;
        float f4 = this.h;
        float f5 = this.i;
        float f6 = this.d;
        float f7 = this.e;
        float f8 = this.k;
        float f9 = this.l;
        float f10 = this.j;
        int i2 = xqn.n;
        str.getClass();
        if (i2 != 0) {
            return new xqn(str, f, i, f2, f3, f4, f5, f6, f7, f10, f8, f9, xqs.b);
        }
        throw null;
    }

    public final void b() {
        this.a = BitmapDescriptorFactory.HUE_RED;
    }

    public final void c() {
        this.h = BitmapDescriptorFactory.HUE_RED;
    }

    public final void d() {
        this.g = BitmapDescriptorFactory.HUE_RED;
    }

    public final void e() {
        this.i = BitmapDescriptorFactory.HUE_RED;
    }

    public xru() {
        this((byte[]) null);
    }

    public /* synthetic */ xru(byte[] bArr) {
        this(new xqn());
    }
}
