package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class evw extends evm {
    public evw() {
        super(true);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!fbb.f(bundle, str) || fbb.g(bundle, str)) {
            return null;
        }
        return fbb.c(bundle, str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object c(String str) {
        str.getClass();
        if (affa.f(str, "null")) {
            return null;
        }
        return str;
    }

    @Override // defpackage.evm
    public final String e() {
        return "string";
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        String str2 = (String) obj;
        if (str2 != null) {
            fbh.c(bundle, str, str2);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return "null";
        }
        String strEncode = Uri.encode(str, null);
        strEncode.getClass();
        return strEncode;
    }
}
