package defpackage;

import androidx.car.app.model.ItemList;

/* loaded from: classes2.dex */
public final /* synthetic */ class has implements afdr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ has(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [afdr, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() throws qrz {
        Integer num;
        int i = this.d;
        if (i == 0) {
            glp glpVarT = ((geu) this.b).t();
            uy onSelectedDelegate = ((ItemList) this.c).getOnSelectedDelegate();
            onSelectedDelegate.getClass();
            glpVarT.q(onSelectedDelegate, this.a);
            return afak.a;
        }
        if (i == 1) {
            int i2 = this.a;
            ((goq) this.c).b.d(Integer.valueOf(i2));
            ?? r5 = this.b;
            if (r5 != 0) {
                r5.invoke();
            }
            return afak.a;
        }
        if (i == 2) {
            kjq kjqVar = (kjq) this.c;
            boolean z = kjqVar.e;
            int i3 = this.a;
            if (!z) {
                ((ype) kjq.c.h()).w("CarControlManager is not initialized, cannot send on onCarAction(%s). DROPPING", i3);
                return afak.a;
            }
            if (i3 != 5 && i3 != 6 && kjqVar.n(5) && (num = (Integer) kkq.a.a().e()) != null && num.intValue() == 1) {
                ((ype) kjq.c.f()).w("Dismissing overlay before performing action %s", i3);
                kjqVar.l(5);
            }
            if (!kjqVar.n(i3)) {
                ((ype) kjq.c.h()).w("actionId: %s is not supported, DROPPING", i3);
                return afak.a;
            }
            rij rijVar = kjqVar.d;
            if (rijVar != null) {
                rijVar.a.g(new rcu(rijVar, this.b, 10));
            } else {
                ((ype) kjq.c.h()).w("No CarControlManager to send onCarAction(%s). DROPPING", i3);
            }
            return afak.a;
        }
        if (i == 3) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, mej.a, yzy.DS).l());
            int i4 = this.a;
            ((mej) this.b).e.invoke(this.c, Integer.valueOf(i4));
            return afak.a;
        }
        if (i == 4) {
            int i5 = this.a;
            ((mer) this.b).c.invoke(this.c, Integer.valueOf(i5));
            return afak.a;
        }
        if (i != 5) {
            kqz kqzVar = ((kih) this.c).b;
            kqzVar.getClass();
            ((mfa) this.b).e.invoke(kqzVar, Integer.valueOf(this.a));
            return afak.a;
        }
        Object obj = this.b;
        mex mexVar = (mex) obj;
        lws.n((kqz) this.c, mexVar.b, yzz.PHONE_BROWSE_INDIVIDUAL_CONTACT, this.a);
        mexVar.c.invoke();
        return afak.a;
    }

    public /* synthetic */ has(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    public /* synthetic */ has(kqz kqzVar, mex mexVar, int i, int i2) {
        this.d = i2;
        this.c = kqzVar;
        this.b = mexVar;
        this.a = i;
    }
}
