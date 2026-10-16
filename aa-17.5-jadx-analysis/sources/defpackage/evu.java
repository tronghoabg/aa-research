package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class evu extends eud {
    public static final String[] g(String str) {
        str.getClass();
        return new String[]{str};
    }

    @Override // defpackage.eud
    public final /* bridge */ /* synthetic */ Object a() {
        return new String[0];
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!fbb.f(bundle, str) || fbb.g(bundle, str)) {
            return null;
        }
        return fbb.k(bundle, str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        String[] strArr = (String[]) obj;
        return strArr != null ? (String[]) woy.cJ(strArr, g(str)) : g(str);
    }

    @Override // defpackage.evm
    public final String e() {
        return "string[]";
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        String[] strArr = (String[]) obj;
        str.getClass();
        if (strArr != null) {
            fbh.d(bundle, str, strArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
