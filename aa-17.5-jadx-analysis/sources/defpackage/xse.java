package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xse {
    public float a;
    public float b;
    public float c;

    public xse(xrb xrbVar) {
        this.a = xrbVar.a;
        this.b = xrbVar.b;
        this.c = xrbVar.c;
    }

    public final xrb a() {
        return new xrb(this.a, this.b, this.c);
    }

    public final void b() {
        this.c = BitmapDescriptorFactory.HUE_RED;
    }

    public xse() {
        this((byte[]) null);
    }

    public /* synthetic */ xse(byte[] bArr) {
        this(new xrb(BitmapDescriptorFactory.HUE_RED, 64.0f, 1.0f));
    }
}
