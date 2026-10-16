package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class gjc extends cfx implements crq {
    public aqf a;
    public int b = 1;
    public final aiyk c;
    private final aixl d;

    public gjc(aqf aqfVar) {
        this.a = aqfVar;
        aixl aixlVarR = afpt.r(-1, 0, 6);
        this.d = aixlVarR;
        this.c = new aiyg(aixlVarR);
    }

    @Override // defpackage.crq
    public final boolean c(crs crsVar) {
        float f = this.b;
        boolean zH = this.a.h();
        float f2 = crsVar.a * f;
        if ((!zH || f2 <= BitmapDescriptorFactory.HUE_RED) && (!this.a.g() || f2 >= BitmapDescriptorFactory.HUE_RED)) {
            return false;
        }
        return aixp.c(this.d.j(Float.valueOf(f2)));
    }

    @Override // defpackage.cfx
    public final void er() {
        ahnc.d(N(), null, 0, new gfw(this, (afck) null, 3), 3);
    }

    @Override // defpackage.crq
    public final void f() {
    }
}
