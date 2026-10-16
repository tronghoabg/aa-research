package defpackage;

/* loaded from: classes.dex */
public final class cdl implements bxq {
    public cdp a;
    public String b;
    public Object c;
    public Object[] d;
    public cdt e;
    public rpp f;
    private final afdr g = new bxh(this, 2);

    public cdl(cdt cdtVar, cdp cdpVar, String str, Object obj, Object[] objArr) {
        this.e = cdtVar;
        this.a = cdpVar;
        this.b = str;
        this.c = obj;
        this.d = objArr;
    }

    public final void d() {
        String strP;
        cdp cdpVar = this.a;
        rpp rppVar = this.f;
        if (rppVar != null) {
            throw new IllegalArgumentException(a.bm(rppVar, "entry(", ") is not null"));
        }
        if (cdpVar != null) {
            afdr afdrVar = this.g;
            Object objInvoke = afdrVar.invoke();
            if (objInvoke == null || cdpVar.d(objInvoke)) {
                this.f = cdpVar.e(this.b, afdrVar);
                return;
            }
            if (objInvoke instanceof cel) {
                cel celVar = (cel) objInvoke;
                if (celVar.f() == bxp.b || celVar.f() == bxp.c || celVar.f() == bxp.a) {
                    strP = "MutableState containing " + celVar.a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strP = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strP = byx.p(objInvoke);
            }
            throw new IllegalArgumentException(strP);
        }
    }

    @Override // defpackage.bxq
    public final void eW() {
        rpp rppVar = this.f;
        if (rppVar != null) {
            rppVar.b();
        }
    }

    @Override // defpackage.bxq
    public final void eX() {
        rpp rppVar = this.f;
        if (rppVar != null) {
            rppVar.b();
        }
    }

    @Override // defpackage.bxq
    public final void eo() {
        d();
    }
}
