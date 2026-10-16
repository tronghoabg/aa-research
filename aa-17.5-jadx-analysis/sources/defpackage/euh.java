package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class euh extends eud {
    public static final int[] g(String str) {
        str.getClass();
        return new int[]{((Number) etz.a(str)).intValue()};
    }

    @Override // defpackage.eud
    public final /* bridge */ /* synthetic */ Object a() {
        return new int[0];
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!fbb.f(bundle, str) || fbb.g(bundle, str)) {
            return null;
        }
        return fbb.i(bundle, str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        int[] iArr = (int[]) obj;
        return iArr != null ? woy.cH(iArr, g(str)) : g(str);
    }

    @Override // defpackage.evm
    public final String e() {
        return "integer[]";
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        int[] iArr = (int[]) obj;
        str.getClass();
        if (iArr != null) {
            bundle.putIntArray(str, iArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
