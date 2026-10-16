package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zvb {
    private static final String a = "zvb";
    private static final Pattern b = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)");

    private zvb() {
    }

    public static synchronized void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        wae.c(applicationContext);
        final suq suqVar = new suq(context);
        final String strConcat = "com.google.android.gms.maps#".concat(String.valueOf(applicationContext.getPackageName()));
        suqVar.i(strConcat, 1, new String[]{"MAPS_API", "GMM_REALTIME_COUNTERS"});
        abnp abnpVarN = adde.a.n();
        abnpVarN.t();
        adde addeVar = (adde) abnpVarN.b;
        addeVar.e = aclh.c(4);
        addeVar.b |= 1;
        Matcher matcher = b.matcher("3.4.0");
        zkt.e(matcher.matches(), "Version not found");
        abnp abnpVarN2 = addd.a.n();
        String strGroup = matcher.group(1);
        zkt.m(strGroup);
        int i = Integer.parseInt(strGroup);
        abnpVarN2.t();
        addd adddVar = (addd) abnpVarN2.b;
        adddVar.b |= 1;
        adddVar.c = i;
        String strGroup2 = matcher.group(2);
        zkt.m(strGroup2);
        int i2 = Integer.parseInt(strGroup2);
        abnpVarN2.t();
        addd adddVar2 = (addd) abnpVarN2.b;
        adddVar2.b |= 2;
        adddVar2.d = i2;
        String strGroup3 = matcher.group(3);
        zkt.m(strGroup3);
        int i3 = Integer.parseInt(strGroup3);
        abnpVarN2.t();
        addd adddVar3 = (addd) abnpVarN2.b;
        adddVar3.b = 4 | adddVar3.b;
        adddVar3.e = i3;
        addd adddVar4 = (addd) abnpVarN2.q();
        abnpVarN.t();
        adde addeVar2 = (adde) abnpVarN.b;
        adddVar4.getClass();
        addeVar2.d = adddVar4;
        addeVar2.c = 3;
        String str = a;
        if (zrn.e(str, 3)) {
            int iAz = a.az(((adde) abnpVarN.b).e);
            if (iAz == 0) {
                iAz = 1;
            }
            Log.d(str, String.format("SDK type: %s, version: %s", Integer.toString(iAz - 2), "3.4.0"));
        }
        adde addeVar3 = (adde) abnpVarN.q();
        abnr abnrVar = (abnr) zhq.a.n();
        abnrVar.bc(adde.f, addeVar3);
        zhq zhqVar = (zhq) abnrVar.q();
        final byte[] bArrH = addeVar3.h();
        suqVar.e(strConcat, zhqVar).b(zfq.a, new svm() { // from class: sul
            @Override // defpackage.svm
            public final Object a(svz svzVar) {
                return suqVar.d(strConcat, bArrH, svzVar);
            }
        });
    }
}
