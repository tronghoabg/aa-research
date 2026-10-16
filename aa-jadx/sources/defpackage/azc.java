package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class azc {
    public abstract defpackage.bwk c();

    public final int d() {
        return c().a;
    }

    public final java.lang.Object e(int i) {
        java.lang.Object objInvoke;
        defpackage.ov ovVarB = c().b(i);
        int i2 = i - ovVarB.a;
        defpackage.affc affcVarA = ((defpackage.azb) ovVarB.c).a();
        return (affcVarA == null || (objInvoke = affcVarA.invoke(java.lang.Integer.valueOf(i2))) == null) ? new androidx.compose.foundation.lazy.layout.DefaultLazyKey(i) : objInvoke;
    }
}
