package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class dpz {
    public static final Integer a = 0;
    public boolean b = true;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final dpp f;
    public final ArrayList g;
    public final ArrayList h;
    public boolean i;
    public final dlg j;
    public long k;
    public ajmd l;
    private int m;

    public dpz(dlg dlgVar) {
        HashMap map = new HashMap();
        this.c = map;
        this.d = new HashMap();
        this.e = new HashMap();
        dpp dppVar = new dpp(this);
        this.f = dppVar;
        this.m = 0;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = true;
        Integer num = a;
        dppVar.a = num;
        map.put(num, dppVar);
        this.j = dlgVar;
        this.k = dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, Alert.DURATION_SHOW_INDEFINITELY);
        this.l = new ajmd(this);
    }

    public final int a(Object obj) {
        return Math.round(((Float) obj).floatValue());
    }

    public final dpp b(Object obj) {
        HashMap map = this.c;
        dpw dpwVar = (dpw) map.get(obj);
        dpw dpwVar2 = dpwVar;
        if (dpwVar == null) {
            dpp dppVar = new dpp(this);
            map.put(obj, dppVar);
            dppVar.a = obj;
            dpwVar2 = dppVar;
        }
        if (dpwVar2 instanceof dpp) {
            return (dpp) dpwVar2;
        }
        return null;
    }

    public final dqh c() {
        return (dqh) h(1);
    }

    public final dqi d() {
        return (dqi) h(2);
    }

    public final void e(Object obj) {
        this.g.add(obj);
        this.i = true;
    }

    public final boolean f() {
        return !this.b;
    }

    public final void g(Object obj, int i) {
        dpp dppVarB = b(obj);
        dqd dqdVar = dppVarB.c;
        if (dqdVar == null || !(dqdVar instanceof dqg)) {
            dqg dqgVar = new dqg(this);
            dqgVar.b = i;
            dqgVar.f = obj;
            dppVarB.g(dqgVar);
        }
    }

    public final dpv h(int i) {
        int i2 = this.m;
        this.m = i2 + 1;
        String str = "__HELPER_KEY_" + i2 + "__";
        HashMap map = this.d;
        dpv dpvVar = (dpv) map.get(str);
        if (dpvVar != null) {
            return dpvVar;
        }
        dpv dqiVar = i + (-1) != 0 ? new dqi(this) : new dqh(this);
        dqiVar.a = str;
        map.put(str, dqiVar);
        return dqiVar;
    }
}
