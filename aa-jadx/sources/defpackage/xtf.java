package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xtf {
    public float a;
    public float b;
    public int c;
    public float d;
    public float e;

    public xtf(defpackage.xsa xsaVar) {
        this.a = xsaVar.a;
        this.b = xsaVar.b;
        this.c = xsaVar.c;
        this.d = xsaVar.d;
        this.e = xsaVar.e;
    }

    public final defpackage.xsa a() {
        return new defpackage.xsa(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b() {
        this.d = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public xtf(int i) {
        this.c = i;
    }

    public xtf() {
        this((byte[]) null);
    }

    public xtf(defpackage.xtf xtfVar) {
        this.c = xtfVar.c;
        this.b = xtfVar.b;
        this.a = xtfVar.a;
        this.d = xtfVar.d;
        this.e = xtfVar.e;
    }

    public /* synthetic */ xtf(byte[] bArr) {
        this(new defpackage.xsa(null));
    }
}
