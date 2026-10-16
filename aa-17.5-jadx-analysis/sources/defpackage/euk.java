package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class euk extends eud {
    public static final long[] g(String str) {
        str.getClass();
        return new long[]{((Number) evm.e.c(str)).longValue()};
    }

    @Override // defpackage.eud
    public final /* bridge */ /* synthetic */ Object a() {
        return new long[0];
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!fbb.f(bundle, str) || fbb.g(bundle, str)) {
            return null;
        }
        return fbb.j(bundle, str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        long[] jArr = (long[]) obj;
        if (jArr == null) {
            return g(str);
        }
        long[] jArrG = g(str);
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        System.arraycopy(jArrG, 0, jArrCopyOf, length, 1);
        jArrCopyOf.getClass();
        return jArrCopyOf;
    }

    @Override // defpackage.evm
    public final String e() {
        return "long[]";
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        long[] jArr = (long[]) obj;
        str.getClass();
        if (jArr != null) {
            bundle.putLongArray(str, jArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
