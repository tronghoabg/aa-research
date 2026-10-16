package defpackage;

/* loaded from: classes.dex */
public final class bzb {
    public int a;

    public bzb(int i) {
        this.a = i;
    }

    public static /* synthetic */ void b(bzg bzgVar, cda cdaVar) {
        bzj bzjVarF = bzgVar.f();
        try {
            bzjVarF.A(bzjVarF.o, new alx(cdaVar, 11));
            bzjVarF.T();
            bzjVarF.w(true);
        } catch (Throwable th) {
            bzjVarF.w(false);
            throw th;
        }
    }

    public final boolean a() {
        return this.a != Integer.MIN_VALUE;
    }

    public final String toString() {
        return super.toString() + "{ location = " + this.a + " }";
    }
}
