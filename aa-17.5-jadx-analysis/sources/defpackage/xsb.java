package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xsb {
    public float a;
    public int b;
    public float c;
    public int d;
    public int e;

    public xsb(xqx xqxVar) {
        this.a = xqxVar.a;
        this.b = xqxVar.b;
        this.c = xqxVar.c;
        this.d = xqxVar.d;
        this.e = xqxVar.e;
    }

    public final xqx a() {
        return new xqx(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b() {
        this.a = BitmapDescriptorFactory.HUE_RED;
    }

    public xsb() {
        this((byte[]) null);
    }

    public /* synthetic */ xsb(byte[] bArr) {
        this(new xqx(null));
    }
}
