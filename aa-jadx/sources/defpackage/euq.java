package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class euq extends defpackage.euj {
    public static final long[] g(java.lang.String str) {
        str.getClass();
        return new long[]{((java.lang.Number) defpackage.evs.e.c(str)).longValue()};
    }

    @Override // defpackage.euj
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return new long[0];
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ java.lang.Object b(android.os.Bundle bundle, java.lang.String str) {
        str.getClass();
        if (!defpackage.fbh.f(bundle, str) || defpackage.fbh.g(bundle, str)) {
            return null;
        }
        return defpackage.fbh.j(bundle, str);
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.String str) {
        return g(str);
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ java.lang.Object d(java.lang.String str, java.lang.Object obj) {
        long[] jArr = (long[]) obj;
        if (jArr == null) {
            return g(str);
        }
        long[] jArrG = g(str);
        int length = jArr.length;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, length + 1);
        java.lang.System.arraycopy(jArrG, 0, jArrCopyOf, length, 1);
        jArrCopyOf.getClass();
        return jArrCopyOf;
    }

    @Override // defpackage.evs
    public final java.lang.String e() {
        return "long[]";
    }

    @Override // defpackage.evs
    public final /* bridge */ /* synthetic */ void f(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        long[] jArr = (long[]) obj;
        str.getClass();
        if (jArr != null) {
            bundle.putLongArray(str, jArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
