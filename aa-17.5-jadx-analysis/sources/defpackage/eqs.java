package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public final class eqs {
    static void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public static final Object b(ept eptVar, eps epsVar, afeg afegVar, afck afckVar) {
        Object objA;
        if (epsVar != eps.b) {
            return (eptVar.a() != eps.a && (objA = ahni.a(new efz(eptVar, epsVar, afegVar, null, 4, null), afckVar)) == afcr.a) ? objA : afak.a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object c(eqa eqaVar, eps epsVar, afeg afegVar, afck afckVar) {
        Object objB = b(eqaVar.getLifecycle(), epsVar, afegVar, afckVar);
        return objB == afcr.a ? objB : afak.a;
    }

    public static final String d(String str, String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }

    public static final Object e(eyx eyxVar, String str, afck afckVar) {
        Object objA = eyxVar.a(str, new ewc(7), afckVar);
        return objA == afcr.a ? objA : afak.a;
    }
}
