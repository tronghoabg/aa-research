package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final class nog {
    protected final CarWindowLayoutParams a;
    protected final String b;
    protected final Fragment c;
    protected final eqa d;
    public Object e;
    public int f;
    protected CarDisplayId g;

    public nog(CarWindowLayoutParams carWindowLayoutParams, String str, Fragment fragment, eqa eqaVar) {
        this.a = carWindowLayoutParams;
        this.b = str;
        this.c = fragment;
        this.d = eqaVar;
        Bundle bundle = carWindowLayoutParams.r;
        String str2 = nso.c;
        CarDisplayId carDisplayId = !bundle.containsKey(str2) ? null : (CarDisplayId) carWindowLayoutParams.r.getParcelable(str2);
        this.g = carDisplayId;
        if (carDisplayId == null) {
            this.g = CarDisplayId.a;
        }
    }

    public final noh a() throws qrz, qsa {
        return b(kio.b().e());
    }

    public final noh b(qrn qrnVar) throws qrz, qsa {
        mki mkiVar = mki.a;
        Context context = mkiVar.c;
        mkiVar.g();
        sab sabVarH = qrnVar.a().h(this.g);
        yph yphVar = nsr.a;
        nso nsoVarA = ((nsr) mki.a.i(nsr.class)).a(this.g);
        CarWindowLayoutParams carWindowLayoutParams = this.a;
        Bundle bundle = carWindowLayoutParams.r;
        String str = nso.b;
        noh nohVar = new noh(sabVarH, carWindowLayoutParams, !bundle.containsKey(str) ? null : nsn.values()[bundle.getInt(str)], nsoVarA, this.c, this.d, this.e);
        sabVarH.f(nohVar.m, this.b, context, carWindowLayoutParams, this.f);
        return nohVar;
    }
}
