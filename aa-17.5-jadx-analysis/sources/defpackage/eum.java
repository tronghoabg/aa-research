package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class eum extends evm {
    public eum() {
        super(false);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return Long.valueOf(j);
        }
        crt.k(str);
        throw new aezp();
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object c(String str) throws NumberFormatException {
        String strSubstring;
        long j;
        str.getClass();
        if (afyh.e(str, "L", false)) {
            strSubstring = str.substring(0, str.length() - 1);
            strSubstring.getClass();
        } else {
            strSubstring = str;
        }
        if (afyh.g(str, "0x", false)) {
            String strSubstring2 = strSubstring.substring(2);
            strSubstring2.getClass();
            j = Long.parseLong(strSubstring2, 16);
        } else {
            j = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j);
    }

    @Override // defpackage.evm
    public final String e() {
        return "long";
    }

    @Override // defpackage.evm
    public final /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        bundle.putLong(str, ((Number) obj).longValue());
    }
}
