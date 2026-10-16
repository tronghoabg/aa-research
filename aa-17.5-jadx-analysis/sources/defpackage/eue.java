package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class eue extends eud {
    public static final float[] g(String str) {
        str.getClass();
        return new float[]{((Number) evm.h.c(str)).floatValue()};
    }

    @Override // defpackage.eud
    public final /* bridge */ /* synthetic */ Object a() {
        return new float[0];
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!fbb.f(bundle, str) || fbb.g(bundle, str)) {
            return null;
        }
        return fbb.h(bundle, str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        float[] fArr = (float[]) obj;
        if (fArr == null) {
            return g(str);
        }
        float[] fArrG = g(str);
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        System.arraycopy(fArrG, 0, fArrCopyOf, length, 1);
        fArrCopyOf.getClass();
        return fArrCopyOf;
    }

    @Override // defpackage.evm
    public final String e() {
        return "float[]";
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        float[] fArr = (float[]) obj;
        str.getClass();
        if (fArr != null) {
            bundle.putFloatArray(str, fArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
