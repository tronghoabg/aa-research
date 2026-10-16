package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fni implements fml, fkb {
    public static final String a = fjo.b("SystemFgDispatcher");
    public static final /* synthetic */ int k = 0;
    public final flo b;
    public final Object c = new Object();
    fny d;
    final Map e;
    public final Map f;
    public final Map g;
    public fnh h;
    public final gjv i;
    public final ajdr j;
    private final Context l;

    public fni(Context context) {
        this.l = context;
        flo floVarB = flo.b(context);
        this.b = floVarB;
        this.j = floVarB.k;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.i = new gjv(floVarB.j);
        floVarB.f.c(this);
    }

    @Override // defpackage.fkb
    public final void a(fny fnyVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            aivh aivhVar = ((fod) this.f.remove(fnyVar)) != null ? (aivh) this.g.remove(fnyVar) : null;
            if (aivhVar != null) {
                aivhVar.s(null);
            }
        }
        Map map = this.e;
        fjg fjgVar = (fjg) map.remove(fnyVar);
        if (fnyVar.equals(this.d)) {
            if (map.size() > 0) {
                Iterator it = map.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (fny) entry.getKey();
                if (this.h != null) {
                    fjg fjgVar2 = (fjg) entry.getValue();
                    fnh fnhVar = this.h;
                    int i = fjgVar2.a;
                    fnhVar.c(i, fjgVar2.b, fjgVar2.c);
                    this.h.a(i);
                }
            } else {
                this.d = null;
            }
        }
        fnh fnhVar2 = this.h;
        if (fjgVar == null || fnhVar2 == null) {
            return;
        }
        fjo fjoVarA = fjo.a();
        String str = a;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        int i2 = fjgVar.a;
        sb.append(i2);
        sb.append(", workSpecId: ");
        sb.append(fnyVar);
        sb.append(", notificationType: ");
        sb.append(fjgVar.b);
        fjoVarA.c(str, sb.toString());
        fnhVar2.a(i2);
    }

    public final void b(Intent intent) {
        if (this.h == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        fny fnyVar = new fny(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        fjo.a().c(a, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        fjg fjgVar = new fjg(intExtra, notification, intExtra2);
        Map map = this.e;
        map.put(fnyVar, fjgVar);
        fjg fjgVar2 = (fjg) map.get(this.d);
        if (fjgVar2 == null) {
            this.d = fnyVar;
        } else {
            this.h.b(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((fjg) ((Map.Entry) it.next()).getValue()).b;
                }
                fjgVar = new fjg(fjgVar2.a, fjgVar2.c, i);
            } else {
                fjgVar = fjgVar2;
            }
        }
        this.h.c(fjgVar.a, fjgVar.b, fjgVar.c);
    }

    public final void c() {
        this.h = null;
        synchronized (this.c) {
            Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                ((aivh) it.next()).s(null);
            }
        }
        this.b.f.d(this);
    }

    public final void d(int i, int i2) {
        fjo.a();
        Log.i(a, a.bp(i2, "Foreground service timed out, FGS type: "));
        for (Map.Entry entry : this.e.entrySet()) {
            if (((fjg) entry.getValue()).b == i2) {
                this.b.f((fny) entry.getKey(), -128);
            }
        }
        fnh fnhVar = this.h;
        if (fnhVar != null) {
            fnhVar.d(i);
        }
    }

    @Override // defpackage.fml
    public final void e(fod fodVar, flq flqVar) {
        if (flqVar instanceof fmh) {
            fjo.a().c(a, "Constraints unmet for WorkSpec ".concat(fodVar.a));
            this.b.f(dtb.l(fodVar), ((fmh) flqVar).a);
        }
    }
}
