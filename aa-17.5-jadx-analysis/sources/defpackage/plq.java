package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class plq {
    private static final yob g = yob.c("com/google/android/apps/gmm/shared/legal/LegalInformationImpl");
    public final Context a;
    public final plt b;
    public final TelephonyManager c;
    public final zhc d = new zhc();
    public final AtomicBoolean e = new AtomicBoolean();
    public String f = "";

    public plq(Context context, plt pltVar) {
        this.a = context;
        this.b = pltVar;
        this.c = (TelephonyManager) context.getSystemService("phone");
    }

    public static Object b(zgp zgpVar, long j, xyc xycVar) {
        try {
            return zgpVar.get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ((ynz) ((ynz) ((ynz) g.h()).p(e)).ai((char) 6782)).u("Thread interrupted while trying to read persisted LegalInformation, returning defaults.");
            Thread.currentThread().interrupt();
            return xycVar.gu();
        } catch (CancellationException e2) {
            e = e2;
            ((ynz) ((ynz) ((ynz) g.h()).p(e)).ai((char) 6781)).u("Failed to read persisted LegalInformation, returning defaults.");
            return xycVar.gu();
        } catch (ExecutionException e3) {
            e = e3;
            ((ynz) ((ynz) ((ynz) g.h()).p(e)).ai((char) 6781)).u("Failed to read persisted LegalInformation, returning defaults.");
            return xycVar.gu();
        } catch (TimeoutException e4) {
            e = e4;
            ((ynz) ((ynz) ((ynz) g.h()).p(e)).ai((char) 6781)).u("Failed to read persisted LegalInformation, returning defaults.");
            return xycVar.gu();
        }
    }

    public static void e(zgp zgpVar) {
        try {
            zgpVar.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ((ynz) ((ynz) ((ynz) g.h()).p(e)).ai((char) 6785)).u("Thread interrupted while trying to persist LegalInformation.");
            Thread.currentThread().interrupt();
        } catch (CancellationException | ExecutionException e2) {
            ((ynz) ((ynz) g.a(uys.a).p(e2)).ai((char) 6783)).u("Failed to persist LegalInformation.");
        } catch (TimeoutException e3) {
            ((ynz) ((ynz) ((ynz) g.h()).p(e3)).ai((char) 6784)).u("Timed out waiting to persist LegalInformation. Continuing.");
        }
    }

    public static boolean f(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "device_provisioned", 0) != 0;
    }

    public final uzy a() {
        return ((plv) this.b).a.i(plv.c);
    }

    public final String c() {
        return d((pls) b(((plv) this.b).b, 500L, new joa(16)));
    }

    public final String d(pls plsVar) {
        if (woy.am(this.f)) {
            String strD = plsVar.d();
            this.f = strD;
            if (woy.am(strD)) {
                String strC = plsVar.c();
                this.f = strC;
                if (woy.am(strC)) {
                    TelephonyManager telephonyManager = this.c;
                    String networkCountryIso = telephonyManager.getPhoneType() != 2 ? telephonyManager.getNetworkCountryIso() : "";
                    if (woy.am(networkCountryIso)) {
                        networkCountryIso = telephonyManager.getSimCountryIso();
                    }
                    if (woy.am(networkCountryIso)) {
                        networkCountryIso = Locale.getDefault().getCountry();
                    }
                    this.f = networkCountryIso.toUpperCase(Locale.ROOT);
                    if (f(this.a)) {
                        plt pltVar = this.b;
                        ((plv) pltVar).g.d(new pfq(pltVar, this.f, 10, null));
                        zgp zgpVar = zgl.a;
                    }
                }
            }
        }
        return this.f;
    }
}
