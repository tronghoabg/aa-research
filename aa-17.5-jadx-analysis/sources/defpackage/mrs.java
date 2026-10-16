package defpackage;

import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes2.dex */
final class mrs extends mru {
    final /* synthetic */ mrv a;

    public mrs(mrv mrvVar) {
        this.a = mrvVar;
    }

    @Override // defpackage.mru, defpackage.wwc
    public final void b(wwg wwgVar) {
        mrv mrvVar = this.a;
        mrz mrzVar = (mrz) mrvVar.c.get(wwgVar.h);
        ((ype) ((ype) mrv.a.f()).ai((char) 5239)).y("launch %s", mrzVar);
        noh nohVarB = nsh.c().b(mrvVar);
        nohVarB.getClass();
        Intent intent = mrzVar.a;
        CarDisplayId carDisplayIdO = nohVarB.o();
        mpe mpeVarA = mpe.a();
        Intent intentPutExtra = intent.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1);
        qql qqlVar = new qql();
        qqlVar.e = nsr.c().a(carDisplayIdO).r(nsn.a);
        mpeVarA.k(intentPutExtra, qqlVar);
    }
}
