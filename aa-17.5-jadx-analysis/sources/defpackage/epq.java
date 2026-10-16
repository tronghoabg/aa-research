package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import com.google.android.gms.car.CarAudioConfiguration;

/* loaded from: classes.dex */
public final class epq {
    public static final epr a(eps epsVar) {
        epsVar.getClass();
        int iOrdinal = epsVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            return epr.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return epr.ON_STOP;
        }
        if (iOrdinal == 4) {
            return epr.ON_PAUSE;
        }
        throw new aezs();
    }

    public static final epr b(eps epsVar) {
        epsVar.getClass();
        int iOrdinal = epsVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return epr.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return epr.ON_START;
        }
        if (iOrdinal == 3) {
            return epr.ON_RESUME;
        }
        if (iOrdinal == 4) {
            return null;
        }
        throw new aezs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(Activity activity, epr eprVar) {
        eprVar.getClass();
        if (activity instanceof eqd) {
            ((eqd) activity).a().e(eprVar);
        } else if (activity instanceof eqa) {
            ept lifecycle = ((eqa) activity).getLifecycle();
            if (lifecycle instanceof eqc) {
                ((eqc) lifecycle).e(eprVar);
            }
        }
    }

    public static final void d(Activity activity) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new eqz());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new era(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final erm e(afhe afheVar, eru eruVar, String str, erq erqVar, esc escVar) {
        if (erqVar == null) {
            erqVar = ecw.f(eruVar);
        }
        ers ersVarH = ebj.h(eruVar, erqVar, escVar);
        if (str == null) {
            return ersVarH.b(afheVar);
        }
        afheVar.getClass();
        return ersVarH.b.w(afheVar, str);
    }

    public static String f(ouh ouhVar) {
        int iOrdinal = ouhVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "VOICE" : "MEDIA" : "SYSTEM" : "TTS";
    }

    public static String g(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "VOICE" : "MEDIA" : "SYSTEM" : "TTS";
    }

    public static final int h(int i) {
        return (i == 44100 || i == 48000) ? 2048 : 1024;
    }

    public static final int i(CarAudioConfiguration carAudioConfiguration) {
        int iH = h(carAudioConfiguration.a);
        int i = carAudioConfiguration.b;
        int i2 = iH + iH;
        return (i == 12 || i == 12) ? i2 + i2 : i2;
    }

    public static String j(int i) {
        return i != 0 ? i != 1 ? i != 2 ? a.bp(i, "UNKNOWN:") : "DELAYED" : "GRANTED" : "FAILED";
    }

    public static String k(int i) {
        switch (i) {
            case -3:
                return "LOSS_TR_CAN_DUCK";
            case -2:
                return "LOSS_TR";
            case -1:
                return "LOSS";
            case 0:
                return "NONE";
            case 1:
                return "GAIN";
            case 2:
                return "GAIN_TR";
            case 3:
                return "GAIN_TR_MAY_DUCK";
            case 4:
                return "GAIN_TR_EXC";
            default:
                return a.bp(i, "UNKNOWN:");
        }
    }
}
