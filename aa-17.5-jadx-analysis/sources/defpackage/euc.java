package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class euc extends evm {
    public euc() {
        super(false);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!fbb.f(bundle, str) || fbb.g(bundle, str)) {
            return null;
        }
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return Boolean.valueOf(z);
        }
        crt.k(str);
        throw new aezp();
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object c(String str) {
        boolean z;
        str.getClass();
        if (affa.f(str, "true")) {
            z = true;
        } else {
            if (!affa.f(str, "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.evm
    public final String e() {
        return "boolean";
    }

    @Override // defpackage.evm
    public final /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
    }
}
