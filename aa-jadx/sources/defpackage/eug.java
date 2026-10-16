package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eug extends defpackage.euj {
    public static final boolean[] g(java.lang.String str) {
        str.getClass();
        return new boolean[]{((java.lang.Boolean) defpackage.evs.k.c(str)).booleanValue()};
    }

    @Override // defpackage.euj
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return new boolean[0];
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ java.lang.Object b(android.os.Bundle bundle, java.lang.String str) {
        str.getClass();
        if (!defpackage.fbh.f(bundle, str) || defpackage.fbh.g(bundle, str)) {
            return null;
        }
        return defpackage.fbh.l(bundle, str);
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.String str) {
        return g(str);
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ java.lang.Object d(java.lang.String str, java.lang.Object obj) {
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            return g(str);
        }
        boolean[] zArrG = g(str);
        int length = zArr.length;
        boolean[] zArrCopyOf = java.util.Arrays.copyOf(zArr, length + 1);
        java.lang.System.arraycopy(zArrG, 0, zArrCopyOf, length, 1);
        zArrCopyOf.getClass();
        return zArrCopyOf;
    }

    @Override // defpackage.evs
    public final java.lang.String e() {
        return "boolean[]";
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ void f(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        boolean[] zArr = (boolean[]) obj;
        str.getClass();
        if (zArr != null) {
            bundle.putBooleanArray(str, zArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
