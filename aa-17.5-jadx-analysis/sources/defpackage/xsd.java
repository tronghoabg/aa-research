package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xsd {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;

    public xsd(xqz xqzVar) {
        this.a = xqzVar.a;
        this.b = xqzVar.b;
        this.c = xqzVar.c;
        this.d = xqzVar.d;
        this.e = xqzVar.e;
        this.f = xqzVar.f;
        this.g = xqzVar.g;
    }

    public final xqz a() {
        return new xqz(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final void b() {
        this.a = BitmapDescriptorFactory.HUE_RED;
    }

    public xsd() {
        this((byte[]) null);
    }

    public /* synthetic */ xsd(byte[] bArr) {
        this(new xqz(null));
    }
}
