package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xtj {
    public float a;
    public float b;
    public float c;
    private float d;

    public xtj(defpackage.xsf xsfVar) {
        this.a = xsfVar.a;
        this.b = xsfVar.b;
        this.c = xsfVar.c;
        this.d = xsfVar.d;
    }

    public final defpackage.xsf a() {
        return new defpackage.xsf(this.a, this.b, this.c, this.d);
    }

    public final void b() {
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public xtj() {
        this((byte[]) null);
    }

    public /* synthetic */ xtj(byte[] bArr) {
        this(new defpackage.xsf(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 64.0f, 1.0f, 1.0f));
    }
}
