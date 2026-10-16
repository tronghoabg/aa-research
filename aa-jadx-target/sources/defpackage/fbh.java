package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class fbh {
    public static final int a(android.os.Bundle bundle, java.lang.String str) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        defpackage.ckn.k(str);
        throw new defpackage.afap();
    }

    public static final android.os.Bundle b(android.os.Bundle bundle, java.lang.String str) {
        str.getClass();
        android.os.Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        defpackage.ckn.k(str);
        throw new defpackage.afap();
    }

    public static final java.lang.String c(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        defpackage.ckn.k(str);
        throw new defpackage.afap();
    }

    public static final java.util.List d(android.os.Bundle bundle, java.lang.String str) {
        defpackage.afie afieVarB = defpackage.afgw.b(android.os.Bundle.class);
        afieVarB.getClass();
        java.util.ArrayList arrayListW = defpackage.ebl.w(bundle, str, defpackage.afga.h(afieVarB));
        if (arrayListW != null) {
            return arrayListW;
        }
        defpackage.ckn.k(str);
        throw new defpackage.afap();
    }

    public static final java.util.List e(android.os.Bundle bundle, java.lang.String str) {
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        defpackage.ckn.k(str);
        throw new defpackage.afap();
    }

    public static final boolean f(android.os.Bundle bundle, java.lang.String str) {
        str.getClass();
        return bundle.containsKey(str);
    }

    public static final boolean g(android.os.Bundle bundle, java.lang.String str) {
        return f(bundle, str) && bundle.get(str) == null;
    }

    public static final float[] h(android.os.Bundle bundle, java.lang.String str) {
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        defpackage.ckn.k(str);
        throw new defpackage.afap();
    }

    public static final int[] i(android.os.Bundle bundle, java.lang.String str) {
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        defpackage.ckn.k(str);
        throw new defpackage.afap();
    }

    public static final long[] j(android.os.Bundle bundle, java.lang.String str) {
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        defpackage.ckn.k(str);
        throw new defpackage.afap();
    }

    public static final java.lang.String[] k(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        defpackage.ckn.k(str);
        throw new defpackage.afap();
    }

    public static final boolean[] l(android.os.Bundle bundle, java.lang.String str) {
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        defpackage.ckn.k(str);
        throw new defpackage.afap();
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
