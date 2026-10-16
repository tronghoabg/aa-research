package defpackage;

import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
final class adxf extends adli {
    public static final adlc f = adlc.d("pick_first: attempting to connect");
    public final adla g;
    public adjh h = adjh.d;
    private adlf i;

    public adxf(adla adlaVar) {
        this.g = adlaVar;
    }

    @Override // defpackage.adli
    public final adnq a(adle adleVar) {
        adxd adxdVar;
        Boolean bool;
        List listE = adleVar.a;
        if (listE.isEmpty()) {
            adis adisVar = adleVar.b;
            adnq adnqVarE = adnq.m.e("NameResolver returned no usable address. addrs=" + String.valueOf(listE) + ", attrs=" + adisVar.toString());
            b(adnqVarE);
            return adnqVarE;
        }
        Object obj = adleVar.c;
        if ((obj instanceof adxd) && (bool = (adxdVar = (adxd) obj).a) != null && bool.booleanValue()) {
            Long l = adxdVar.b;
            listE = adxb.e(listE, new Random());
        }
        adlf adlfVar = this.i;
        if (adlfVar == null) {
            adla adlaVar = this.g;
            adkv adkvVar = new adkv();
            adkvVar.c(listE);
            adlf adlfVarB = adlaVar.b(adkvVar.a());
            adlfVarB.c(new adxc(this, adlfVarB, 0));
            this.i = adlfVarB;
            e(adjh.a, new adkz(f));
            adlfVarB.a();
        } else {
            adlfVar.d(listE);
        }
        return adnq.b;
    }

    @Override // defpackage.adli
    public final void b(adnq adnqVar) {
        adlf adlfVar = this.i;
        if (adlfVar != null) {
            adlfVar.b();
            this.i = null;
        }
        e(adjh.c, new adkz(adlc.b(adnqVar)));
    }

    @Override // defpackage.adli
    public final void c() {
        adlf adlfVar = this.i;
        if (adlfVar != null) {
            adlfVar.a();
        }
    }

    @Override // defpackage.adli
    public final void d() {
        adlf adlfVar = this.i;
        if (adlfVar != null) {
            adlfVar.b();
        }
    }

    public final void e(adjh adjhVar, adlg adlgVar) {
        this.h = adjhVar;
        this.g.f(adjhVar, adlgVar);
    }
}
