package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.car.CarInfo;

/* loaded from: classes.dex */
public final class sgx implements sgq {
    public static final ypf a = ols.R("CAR.CONMAN");
    public final Context b;
    public final Handler c;
    public final Handler d = new sss(Looper.getMainLooper());
    public final xyc e;
    public final CarInfo f;
    public sgs g;
    public final wyd h;

    public sgx(Context context, Handler handler, xyc xycVar, wyd wydVar, CarInfo carInfo) {
        this.b = context;
        this.c = handler;
        this.e = xycVar;
        this.h = wydVar;
        this.f = carInfo;
    }

    @Override // defpackage.sgq
    public final void a() {
        a.f().ai(8944).u("Teardown initiated");
        this.c.post(new rzy(this, 12));
    }
}
