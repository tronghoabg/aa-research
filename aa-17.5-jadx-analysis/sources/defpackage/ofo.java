package defpackage;

import android.telecom.Call;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
public final class ofo extends afde implements afeg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofo(affv affvVar, ofq ofqVar, CarCall carCall, affv affvVar2, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.a = affvVar;
        this.b = ofqVar;
        this.c = carCall;
        this.d = affvVar2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [dyn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [bwq, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.e;
        if (i == 0) {
            Object obj2 = this.a;
            Object obj3 = this.b;
            return new ofo((affv) obj2, (ofq) obj3, (CarCall) this.c, (affv) this.d, afckVar, 0);
        }
        if (i == 1) {
            return new ofo((nnl) this.d, (bwq) this.b, (bwq) this.c, (cil) this.a, afckVar, 1);
        }
        ?? r2 = this.b;
        Object obj4 = this.d;
        return new ofo((dyn) r2, (ohh) obj4, (Call) this.c, (ohb) this.a, afckVar, 2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [bwq, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.e;
        if (i == 0) {
            woy.dF(obj);
            Object obj2 = this.c;
            CarCall carCall = (CarCall) obj2;
            String strP = odn.a().p(((ofq) this.b).b, carCall);
            strP.getClass();
            ((affv) this.a).a = strP;
            ((affv) this.d).a = odn.a().u(carCall);
            return afak.a;
        }
        if (i == 1) {
            woy.dF(obj);
            Object obj3 = this.d;
            ?? r0 = this.b;
            if (!affa.f(obj3, r0.a())) {
                ?? r1 = this.c;
                if (r1.a() == nmr.b || ((r1.a() == nmr.c && ((nnl) obj3).o == null) || ((r1.a() == nmr.d && ((nnl) obj3).p == null) || (r1.a() == nmr.e && ((nnl) obj3).q == null)))) {
                    ((cil) this.a).a(7);
                    r0.b(obj3);
                }
            }
            return afak.a;
        }
        woy.dF(obj);
        afia<?> afiaVar = dyr.a[0];
        Object obj4 = this.b;
        if (((Boolean) ((dyr) obj4).f.getValue(obj4, afiaVar)).booleanValue()) {
            yph yphVar = ohh.b;
            ((ype) yphVar.f()).u("Call silence supported");
            Object obj5 = this.d;
            Object obj6 = this.c;
            ohf ohfVar = (ohf) ((ohh) obj5).c.get(obj6);
            if (ohfVar != null) {
                ohfVar.a();
                ((ohb) this.a).a(ohfVar.c);
            } else {
                ((ype) yphVar.h()).y("No entry in call silence map for call %s", obj6);
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((ofo) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 1) {
            return ((ofo) b((Call) obj, (afck) obj2)).hT(afak.a);
        }
        return ((ofo) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofo(dyn dynVar, ohh ohhVar, Call call, ohb ohbVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = dynVar;
        this.d = ohhVar;
        this.c = call;
        this.a = ohbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofo(nnl nnlVar, bwq bwqVar, bwq bwqVar2, cil cilVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = nnlVar;
        this.b = bwqVar;
        this.c = bwqVar2;
        this.a = cilVar;
    }
}
