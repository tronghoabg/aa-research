package defpackage;

/* loaded from: classes.dex */
public class eww {
    public boolean c;
    public mko d;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    public final void b() {
        mko mkoVar = this.d;
        if (mkoVar == null) {
            return;
        }
        if (!this.c) {
            mkoVar.v(this, null);
        }
        Object obj = mkoVar.b;
        Object obj2 = mkoVar.d;
        ewx ewxVar = (ewx) obj;
        if (affa.f(this, ewxVar.e) && ewxVar.d == -1) {
            ewt ewtVarA = ewxVar.c;
            if (ewtVarA == null) {
                ewtVarA = ewxVar.a(-1);
            }
            ewxVar.c = null;
            ewxVar.d = 0;
            ewxVar.e = null;
            if (ewtVarA == null) {
                ?? r0 = ((bii) ((izj) obj2).a).b;
                if (r0 != 0) {
                    r0.run();
                }
            } else {
                ewtVarA.b();
            }
            ewxVar.f.d(ewy.a);
        }
        this.c = false;
    }

    protected void a() {
    }

    protected void c(boolean z) {
    }
}
