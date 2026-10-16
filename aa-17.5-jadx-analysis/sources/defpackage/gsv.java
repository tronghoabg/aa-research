package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes2.dex */
public final class gsv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public gsv(geu geuVar) {
        this.a = geuVar;
        this.b = yob.c("com/android/car/libraries/apphost/nav/emitter/AlertDataEmitter");
        gdl gdlVar = (gdl) geuVar.F(gdl.class);
        this.c = gdlVar;
        this.d = (gvb) geuVar.F(gvb.class);
        aiyk aiykVarM = dtx.m(gdlVar.b);
        this.e = aiykVarM;
        this.f = new fuu(new hcg(aiykVarM, new dxi(this, (afck) null, 12), 16), this, 14);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gvb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [gvb, java.lang.Object] */
    public final void a(gzc gzcVar, Alert alert) {
        if (alert == null || gzcVar != gzc.d) {
            this.d.g();
        } else {
            this.d.h(alert, new iju(this, 1));
        }
    }

    public gsv(hye hyeVar, hye hyeVar2, hye hyeVar3, hwo hwoVar, hwq hwqVar) {
        this.c = igf.a(150, new hwg(this, 0));
        this.e = hyeVar;
        this.f = hyeVar2;
        this.b = hyeVar3;
        this.a = hwoVar;
        this.d = hwqVar;
    }
}
