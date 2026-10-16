package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
final class ubx {
    public final uim a = new uim(new too(), 2, BitmapDescriptorFactory.HUE_RED);
    public float b;
    public float c;
    public boolean d;
    public float e;
    public float f;

    public final void a(uby ubyVar) {
        synchronized (ubyVar.o) {
            uim uimVar = this.a;
            uim uimVar2 = ubyVar.t;
            uimVar.a.A(uimVar2.a);
            uimVar.c = uimVar2.c;
            uimVar.b = uimVar2.b;
            this.b = ubyVar.A;
            this.c = ubyVar.B;
            this.d = ubyVar.v;
            this.e = ubyVar.w;
            this.f = ubyVar.x;
        }
    }
}
