package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class eug extends evm {
    public eug() {
        super(false);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return Float.valueOf(f);
        }
        crt.k(str);
        throw new aezp();
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object c(String str) {
        str.getClass();
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // defpackage.evm
    public final String e() {
        return "float";
    }

    @Override // defpackage.evm
    public final /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        bundle.putFloat(str, ((Number) obj).floatValue());
    }
}
