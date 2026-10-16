package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xso {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public float h;
    private java.lang.String i;
    private float j;
    private float k;
    private float l;

    public xso(defpackage.xrn xrnVar) {
        this.i = xrnVar.a;
        this.a = xrnVar.b;
        this.b = xrnVar.c;
        this.c = xrnVar.d;
        this.d = xrnVar.e;
        this.e = xrnVar.f;
        this.j = xrnVar.g;
        this.k = xrnVar.h;
        this.f = xrnVar.i;
        this.g = xrnVar.j;
        this.h = xrnVar.k;
        this.l = xrnVar.l;
    }

    public static /* synthetic */ defpackage.afbk c(defpackage.xsn xsnVar) {
        xsnVar.getClass();
        xsnVar.a = 1200L;
        return defpackage.afbk.a;
    }

    public final defpackage.xrn a() {
        return new defpackage.xrn(this.i, this.a, this.b, this.c, this.d, this.e, this.j, this.k, this.f, this.g, this.h, this.l);
    }

    public final void b() {
        this.h = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public final void d() {
        this.k = 0.0033f;
    }

    public final void e() {
        this.j = 0.45f;
    }

    public xso() {
        this((byte[]) null);
    }

    public /* synthetic */ xso(byte[] bArr) {
        this(new defpackage.xrn(null, 4095));
    }
}
