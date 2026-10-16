package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzh {
    public int a;

    public bzh(int i) {
        this.a = i;
    }

    public static /* synthetic */ void b(defpackage.bzm bzmVar, defpackage.cdg cdgVar) {
        defpackage.bzp bzpVarF = bzmVar.f();
        try {
            bzpVarF.A(bzpVarF.o, new defpackage.amc(cdgVar, 11));
            bzpVarF.T();
            boolean z = true;
        } finally {
            bzpVarF.w(false);
        }
    }

    public final boolean a() {
        return this.a != Integer.MIN_VALUE;
    }

    public final java.lang.String toString() {
        return super.toString() + "{ location = " + this.a + " }";
    }
}
