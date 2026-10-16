package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class euj extends evm {
    public euj() {
        super(false);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        return Integer.valueOf(fbb.a(bundle, str));
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return etz.a(str);
    }

    @Override // defpackage.evm
    public final String e() {
        return "integer";
    }

    @Override // defpackage.evm
    public final /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        bundle.putInt(str, ((Number) obj).intValue());
    }
}
