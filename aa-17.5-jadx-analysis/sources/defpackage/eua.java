package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class eua extends eud {
    public static final boolean[] g(String str) {
        str.getClass();
        return new boolean[]{((Boolean) evm.k.c(str)).booleanValue()};
    }

    @Override // defpackage.eud
    public final /* bridge */ /* synthetic */ Object a() {
        return new boolean[0];
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!fbb.f(bundle, str) || fbb.g(bundle, str)) {
            return null;
        }
        return fbb.l(bundle, str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            return g(str);
        }
        boolean[] zArrG = g(str);
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        System.arraycopy(zArrG, 0, zArrCopyOf, length, 1);
        zArrCopyOf.getClass();
        return zArrCopyOf;
    }

    @Override // defpackage.evm
    public final String e() {
        return "boolean[]";
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        str.getClass();
        if (zArr != null) {
            bundle.putBooleanArray(str, zArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
