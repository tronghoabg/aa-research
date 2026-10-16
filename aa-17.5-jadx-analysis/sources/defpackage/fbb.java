package defpackage;

import android.os.Bundle;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

@afdo
/* loaded from: classes2.dex */
public final class fbb {
    public static final int a(Bundle bundle, String str) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Alert.DURATION_SHOW_INDEFINITELY) != Integer.MAX_VALUE) {
            return i;
        }
        crt.k(str);
        throw new aezp();
    }

    public static final Bundle b(Bundle bundle, String str) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        crt.k(str);
        throw new aezp();
    }

    public static final String c(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        crt.k(str);
        throw new aezp();
    }

    public static final List d(Bundle bundle, String str) {
        afhe afheVarB = affw.b(Bundle.class);
        afheVarB.getClass();
        ArrayList arrayListH = dlz.h(bundle, str, affa.h(afheVarB));
        if (arrayListH != null) {
            return arrayListH;
        }
        crt.k(str);
        throw new aezp();
    }

    public static final List e(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        crt.k(str);
        throw new aezp();
    }

    public static final boolean f(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str);
    }

    public static final boolean g(Bundle bundle, String str) {
        return f(bundle, str) && bundle.get(str) == null;
    }

    public static final float[] h(Bundle bundle, String str) {
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        crt.k(str);
        throw new aezp();
    }

    public static final int[] i(Bundle bundle, String str) {
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        crt.k(str);
        throw new aezp();
    }

    public static final long[] j(Bundle bundle, String str) {
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        crt.k(str);
        throw new aezp();
    }

    public static final String[] k(Bundle bundle, String str) {
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        crt.k(str);
        throw new aezp();
    }

    public static final boolean[] l(Bundle bundle, String str) {
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        crt.k(str);
        throw new aezp();
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
