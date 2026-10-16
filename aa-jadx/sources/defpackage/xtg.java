package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xtg {
    public float a;
    public int b;
    public float c;
    public int d;
    public int e;

    public xtg(defpackage.xsb xsbVar) {
        this.a = xsbVar.a;
        this.b = xsbVar.b;
        this.c = xsbVar.c;
        this.d = xsbVar.d;
        this.e = xsbVar.e;
    }

    public final defpackage.xsb a() {
        return new defpackage.xsb(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b() {
        this.a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public xtg() {
        this((byte[]) null);
    }

    public /* synthetic */ xtg(byte[] bArr) {
        this(new defpackage.xsb(null));
    }
}
