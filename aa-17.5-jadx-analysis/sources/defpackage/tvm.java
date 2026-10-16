package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class tvm implements uml, tud {
    private static final yob k = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/AreasImpl");
    public final typ a;
    public final Map b;
    public final ukq c;
    public final xyc d;
    public final xyc e;
    public final uvg f;
    public final usy g;
    public final zyq h;
    public final qrx i;
    public final gjv j;
    private final Set l;

    public tvm(typ typVar, txj txjVar, Map map, uvg uvgVar, gjv gjvVar, usy usyVar, qrx qrxVar, Context context, xyc xycVar, xyc xycVar2) {
        ukq ukqVar = new ukq(new ukp(0, 0, 0, null), new uis(), -1, 1, 1);
        zyq zyqVar = new zyq(txjVar, uvgVar, gjvVar, usyVar, context);
        this.l = new HashSet();
        this.a = typVar;
        this.b = map;
        this.f = uvgVar;
        this.j = gjvVar;
        this.g = usyVar;
        this.i = qrxVar;
        this.c = ukqVar;
        this.h = zyqVar;
        this.d = xycVar;
        this.e = xycVar2;
    }

    private static tyw g(tpr tprVar) {
        woy.Z(tprVar instanceof tyw);
        return (tyw) tprVar;
    }

    public final void a(tpr tprVar) {
        Set set = this.l;
        tyw tywVarG = g(tprVar);
        synchronized (set) {
            set.remove(tywVarG);
        }
        tywVarG.v();
    }

    public final void b(tpr tprVar) {
        boolean zRemove;
        Set set = this.l;
        tyw tywVarG = g(tprVar);
        synchronized (set) {
            zRemove = set.remove(tywVarG);
        }
        if (zRemove) {
            tywVarG.w();
        }
    }

    public final void d(tpr tprVar) {
        boolean zAdd;
        Set set = this.l;
        tyw tywVarG = g(tprVar);
        synchronized (set) {
            zAdd = set.add(tywVarG);
        }
        if (zAdd) {
            tywVarG.x();
        }
    }

    public final tvt e(abax abaxVar, abfi abfiVar) {
        if (abaxVar.j != -1) {
            ((ynz) k.a(uys.a).ai(9147)).x("Client-injected area using global style %s; this won't work.", abaxVar.j);
        }
        abnh abnhVar = abcz.b;
        abaxVar.j(abnhVar);
        boolean zM = abaxVar.w.m(abnhVar.d);
        typ typVar = this.a;
        return f(abaxVar, zM ? typVar.h : typVar.g, abfiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tvt f(abax abaxVar, tqt tqtVar, abfi abfiVar) {
        tqo tqoVarB;
        abnh abnhVar = abcz.b;
        abaxVar.j(abnhVar);
        abnl abnlVar = abaxVar.w;
        abnu abnuVar = abnhVar.d;
        if (abnlVar.m(abnuVar)) {
            abaxVar.j(abnhVar);
            tqoVarB = tqtVar.b(((abcy) (abaxVar.w.j(abnuVar) == null ? abnhVar.b : abnhVar.c(r4))).c);
        } else {
            tqoVarB = (abaxVar.b & 256) != 0 ? tqtVar.b(abaxVar.j) : tqtVar.b(abaxVar.i);
        }
        tqo tqoVar = tqoVarB;
        boolean z = true;
        if (abfiVar != abfi.WORLD_ENCODING_LAT_LNG_E7 && abfiVar != abfi.WORLD_ENCODING_LAT_LNG_DOUBLE) {
            z = false;
        }
        woy.Z(z);
        tof tofVar = (tof) this.b.get(abfiVar);
        tofVar.getClass();
        ukq ukqVar = this.c;
        typ typVar = this.a;
        zyq zyqVar = this.h;
        uvg uvgVar = this.f;
        usy usyVar = this.g;
        gjv gjvVar = this.j;
        ((Boolean) this.d.gu()).booleanValue();
        return new tvt(abaxVar, (tod) tofVar, tqtVar, ukqVar, tqoVar, typVar, zyqVar, uvgVar, usyVar, gjvVar, this, ((Boolean) this.e.gu()).booleanValue());
    }

    @Override // defpackage.uml
    public final void gp() {
        Set set = this.l;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((tyw) it.next()).u();
            }
        }
    }
}
