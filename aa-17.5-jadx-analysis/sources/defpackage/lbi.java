package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import java.util.UUID;

@Deprecated
/* loaded from: classes.dex */
public interface lbi {
    SharedPreferences a(Context context, String str);

    lhg b(Context context, odj odjVar, ohi ohiVar);

    sab c(qrn qrnVar) throws qrz, qsa;

    UUID d();

    roe e(qrn qrnVar) throws qrz;

    rny f(qrn qrnVar) throws qrz, qsa;

    rjg g(Activity activity);

    xqb h(Context context, Looper looper, wpq wpqVar);

    mbl i(ajmd ajmdVar, mbd mbdVar);
}
