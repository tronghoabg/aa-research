package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ere {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(android.app.Activity activity, defpackage.epw epwVar) {
        epwVar.getClass();
        if (activity instanceof defpackage.eqj) {
            ((defpackage.eqj) activity).a().e(epwVar);
        } else if (activity instanceof defpackage.eqg) {
            defpackage.epy lifecycle = ((defpackage.eqg) activity).getLifecycle();
            if (lifecycle instanceof defpackage.eqi) {
                ((defpackage.eqi) lifecycle).e(epwVar);
            }
        }
    }

    public static final void b(android.app.Activity activity) {
        activity.getClass();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new defpackage.erf());
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new defpackage.erg(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final defpackage.erw c(java.util.Map map) {
        java.util.Collection collectionValues = map.values();
        collectionValues.getClass();
        defpackage.fbl[] fblVarArr = (defpackage.fbl[]) collectionValues.toArray(new defpackage.fbl[0]);
        return new defpackage.esj((defpackage.fbl[]) java.util.Arrays.copyOf(fblVarArr, fblVarArr.length));
    }

    public static final void d(defpackage.afie afieVar, defpackage.affc affcVar, java.util.Map map) {
        afieVar.getClass();
        if (!map.containsKey(afieVar)) {
            map.put(afieVar, new defpackage.fbl(afieVar, affcVar));
            return;
        }
        throw new java.lang.IllegalArgumentException("A `initializer` with the same `clazz` has already been added: " + afieVar.getQualifiedName() + ".");
    }

    public static java.lang.String e(int i) {
        if (i == 0) {
            return "FAILED";
        }
        if (i != 1) {
            return i != 2 ? defpackage.a.bo(i, "UNKNOWN:") : "DELAYED";
        }
        return "GRANTED";
    }

    public static java.lang.String f(int i) {
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
                return defpackage.a.bo(i, "UNKNOWN:");
        }
    }

    public static boolean g(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (bArr[i3] != 0) {
                return true;
            }
        }
        return false;
    }
}
