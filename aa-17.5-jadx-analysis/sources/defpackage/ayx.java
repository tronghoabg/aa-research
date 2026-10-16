package defpackage;

import androidx.compose.foundation.lazy.layout.DefaultLazyKey;

/* loaded from: classes.dex */
public abstract class ayx {
    public abstract bwd c();

    public final int d() {
        return c().a;
    }

    public final Object e(int i) {
        Object objInvoke;
        os osVarB = c().b(i);
        int i2 = i - osVarB.a;
        afec afecVarA = ((ayw) osVarB.c).a();
        return (afecVarA == null || (objInvoke = afecVarA.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : objInvoke;
    }
}
