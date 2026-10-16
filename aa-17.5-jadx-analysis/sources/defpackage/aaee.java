package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
final class aaee implements aaeu {
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ float e;
    final /* synthetic */ aaei f;
    private float g;
    private float h;
    private aadu i = null;
    public aaeh a = null;

    public aaee(aaei aaeiVar, float f, float f2, boolean z, float f3) {
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = f3;
        this.f = aaeiVar;
        this.g = f;
        this.h = f2;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) {
        aaei aaeiVar = this.f;
        if (!aaeiVar.x().h) {
            aadu aaduVarI = aaemVar.i();
            this.i = aaduVarI;
            this.g = (float) aaduVarI.a;
            this.h = (float) aaduVarI.b;
        }
        if (this.d) {
            this.a = aaeiVar.A(aaemVar, -1.0f, this.i, 330);
            return;
        }
        double dLog = Math.log(this.e) / aaei.a;
        float f = this.g;
        float f2 = this.h;
        aaek aaekVarB = aaeiVar.B();
        float f3 = (float) dLog;
        aaekVarB.b(f3, BitmapDescriptorFactory.HUE_RED, f, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        aaeiVar.C(aaekVarB, aaemVar);
        aaeh aaehVar = null;
        if (aaeiVar.f != null && aaeiVar.d != null) {
            aaehVar = new aaeh(aaemVar.c() + f3, aaemVar.i());
        }
        this.a = aaehVar;
    }
}
