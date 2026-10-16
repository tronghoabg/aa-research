package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class euk extends defpackage.euj {
    public static final float[] g(java.lang.String str) {
        str.getClass();
        return new float[]{((java.lang.Number) defpackage.evs.h.c(str)).floatValue()};
    }

    @Override // defpackage.euj
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return new float[0];
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ java.lang.Object b(android.os.Bundle bundle, java.lang.String str) {
        str.getClass();
        if (!defpackage.fbh.f(bundle, str) || defpackage.fbh.g(bundle, str)) {
            return null;
        }
        return defpackage.fbh.h(bundle, str);
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.String str) {
        return g(str);
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ java.lang.Object d(java.lang.String str, java.lang.Object obj) {
        float[] fArr = (float[]) obj;
        if (fArr == null) {
            return g(str);
        }
        float[] fArrG = g(str);
        int length = fArr.length;
        float[] fArrCopyOf = java.util.Arrays.copyOf(fArr, length + 1);
        java.lang.System.arraycopy(fArrG, 0, fArrCopyOf, length, 1);
        fArrCopyOf.getClass();
        return fArrCopyOf;
    }

    @Override // defpackage.evs
    public final java.lang.String e() {
        return "float[]";
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ void f(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        float[] fArr = (float[]) obj;
        str.getClass();
        if (fArr != null) {
            bundle.putFloatArray(str, fArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
