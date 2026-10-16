package defpackage;

import android.content.Context;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.projection.gearhead.companion.settings.Material3ManageCarsFragment;
import java.util.Collection;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class ykz implements xwx {
    private final /* synthetic */ int a;

    public /* synthetic */ ykz(int i) {
        this.a = i;
    }

    @Override // defpackage.xwx
    public final Object a(Object obj) {
        String strD;
        String strD2;
        String strD3;
        String strD4;
        String strD5;
        switch (this.a) {
            case 0:
                return yrm.D((Collection) obj);
            case 1:
                yph yphVar = Material3ManageCarsFragment.f;
                return ((CarInfoInternal) obj).a;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new zck(entry);
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return new zco(entry2);
            case 4:
                return ((adnn) obj).name();
            case 5:
                return false;
            case 6:
                Context context = (Context) obj;
                String str = adab.a;
                if (str != null) {
                    return str;
                }
                synchronized (adab.class) {
                    strD = adab.a;
                    if (strD == null) {
                        strD = wac.d(context, "com.google.android.gms.auth_account_client");
                        adab.a = strD;
                    }
                }
                return strD;
            case 7:
                Context context2 = (Context) obj;
                String str2 = adcu.a;
                if (str2 != null) {
                    return str2;
                }
                synchronized (adcu.class) {
                    strD2 = adcu.a;
                    if (strD2 == null) {
                        strD2 = wac.d(context2, "com.google.android.libraries.consentverifier");
                        adcu.a = strD2;
                    }
                }
                return strD2;
            case 8:
                rju rjuVar = adcz.a;
                return "com.google.android.gms";
            case 9:
                Context context3 = (Context) obj;
                String str3 = addf.a;
                if (str3 != null) {
                    return str3;
                }
                synchronized (addf.class) {
                    strD3 = addf.a;
                    if (strD3 == null) {
                        strD3 = wac.d(context3, "com.google.android.gms.maps");
                        addf.a = strD3;
                    }
                }
                return strD3;
            case 10:
                Context context4 = (Context) obj;
                String str4 = adew.a;
                if (str4 != null) {
                    return str4;
                }
                synchronized (adew.class) {
                    strD4 = adew.a;
                    if (strD4 == null) {
                        strD4 = wac.d(context4, "com.google.android.libraries.performance.primes");
                        adew.a = strD4;
                    }
                }
                return strD4;
            case 11:
                Context context5 = (Context) obj;
                String str5 = adgr.a;
                if (str5 != null) {
                    return str5;
                }
                synchronized (adgr.class) {
                    strD5 = adgr.a;
                    if (strD5 == null) {
                        strD5 = wac.d(context5, "com.google.android.libraries.surveys");
                        adgr.a = strD5;
                    }
                }
                return strD5;
            default:
                Logger logger = adxb.f;
                return ((adxa) obj).a;
        }
    }
}
