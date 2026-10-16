package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xti {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    private float h;

    public xti(defpackage.xsd xsdVar) {
        this.a = xsdVar.a;
        this.b = xsdVar.b;
        this.c = xsdVar.c;
        this.d = xsdVar.d;
        this.e = xsdVar.e;
        this.f = xsdVar.f;
        this.g = xsdVar.g;
        this.h = xsdVar.h;
    }

    public final defpackage.xsd a() {
        return new defpackage.xsd(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final void b() {
        this.a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public xti() {
        this((byte[]) null);
    }

    public /* synthetic */ xti(byte[] bArr) {
        this(new defpackage.xsd(null));
    }
}
