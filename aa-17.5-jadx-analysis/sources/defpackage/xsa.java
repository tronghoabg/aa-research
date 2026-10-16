package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xsa {
    public float a;
    public float b;
    public int c;
    public float d;

    public xsa(xqw xqwVar) {
        this.a = xqwVar.a;
        this.b = xqwVar.b;
        this.c = xqwVar.c;
        this.d = xqwVar.d;
    }

    public final xqw a() {
        return new xqw(this.a, this.b, this.c, this.d);
    }

    public final void b() {
        this.d = BitmapDescriptorFactory.HUE_RED;
    }

    public xsa() {
        this((byte[]) null);
    }

    public /* synthetic */ xsa(byte[] bArr) {
        this(new xqw(null));
    }
}
