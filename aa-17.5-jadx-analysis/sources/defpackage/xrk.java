package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xrk {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public float h;
    private String i;
    private float j;
    private float k;

    public xrk(xqm xqmVar) {
        this.i = xqmVar.a;
        this.a = xqmVar.b;
        this.b = xqmVar.c;
        this.c = xqmVar.d;
        this.d = xqmVar.e;
        this.e = xqmVar.f;
        this.j = xqmVar.g;
        this.k = xqmVar.h;
        this.f = xqmVar.i;
        this.g = xqmVar.j;
        this.h = xqmVar.k;
    }

    public static /* synthetic */ afak c(xrj xrjVar) {
        xrjVar.getClass();
        xrjVar.a = 1200L;
        return afak.a;
    }

    public final xqm a() {
        return new xqm(this.i, this.a, this.b, this.c, this.d, this.e, this.j, this.k, this.f, this.g, this.h);
    }

    public final void b() {
        this.h = BitmapDescriptorFactory.HUE_RED;
    }

    public final void d() {
        this.k = 0.0033f;
    }

    public final void e() {
        this.j = 0.45f;
    }

    public xrk() {
        this((byte[]) null);
    }

    public /* synthetic */ xrk(byte[] bArr) {
        this(new xqm(null, 2047));
    }
}
