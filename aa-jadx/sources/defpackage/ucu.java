package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ucu {
    public final defpackage.ujh a = new defpackage.ujh(new defpackage.tpm(), 2, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    public float b;
    public float c;
    public boolean d;
    public float e;
    public float f;

    public final void a(defpackage.ucv ucvVar) {
        synchronized (ucvVar.o) {
            defpackage.ujh ujhVar = this.a;
            defpackage.ujh ujhVar2 = ucvVar.t;
            ujhVar.a.A(ujhVar2.a);
            ujhVar.c = ujhVar2.c;
            ujhVar.b = ujhVar2.b;
            this.b = ucvVar.A;
            this.c = ucvVar.B;
            this.d = ucvVar.v;
            this.e = ucvVar.w;
            this.f = ucvVar.x;
        }
    }
}
