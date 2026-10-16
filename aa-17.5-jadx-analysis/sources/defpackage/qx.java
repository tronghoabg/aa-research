package defpackage;

import android.util.Log;
import androidx.car.app.AppManager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class qx implements sg {
    public final Deque a = new ArrayDeque();
    public final ept b;
    private final qn c;

    protected qx(qn qnVar, ept eptVar) {
        this.c = qnVar;
        this.b = eptVar;
        eptVar.c(new qy(this, 1));
    }

    public static final void h(qw qwVar, boolean z) {
        eps epsVar = qwVar.b.e;
        if (epsVar.a(eps.e)) {
            qwVar.i(epr.ON_PAUSE);
        }
        if (epsVar.a(eps.d)) {
            qwVar.i(epr.ON_STOP);
        }
        if (z) {
            qwVar.i(epr.ON_DESTROY);
        }
    }

    private final void i(qw qwVar, boolean z) {
        this.a.push(qwVar);
        if (z && ((eqc) this.b).e.a(eps.c)) {
            qwVar.i(epr.ON_CREATE);
        }
        if (qwVar.b.e.a(eps.c) && ((eqc) this.b).e.a(eps.d)) {
            ((AppManager) this.c.a(AppManager.class)).a();
            qwVar.i(epr.ON_START);
        }
    }

    public final qw a() {
        yj.a();
        qw qwVar = (qw) this.a.peek();
        qwVar.getClass();
        return qwVar;
    }

    public final Collection b() {
        return new ArrayList(this.a);
    }

    public final void c() {
        yj.a();
        if (((eqc) this.b).e.equals(eps.a)) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Popping screens after the DESTROYED state is a no-op");
            }
        } else {
            Deque deque = this.a;
            if (deque.size() > 1) {
                d(Collections.singletonList((qw) deque.pop()));
            }
        }
    }

    public final void d(List list) {
        qw qwVarA = a();
        qwVarA.e = true;
        ((AppManager) this.c.a(AppManager.class)).a();
        eqc eqcVar = (eqc) this.b;
        if (eqcVar.e.a(eps.d)) {
            qwVarA.i(epr.ON_START);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qw qwVar = (qw) it.next();
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", a.bm(qwVar, "Popping screen ", " off the screen stack"));
            }
            h(qwVar, true);
        }
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", a.bm(qwVarA, "Screen ", " is at the top of the screen stack"));
        }
        if (eqcVar.e.a(eps.e) && this.a.contains(qwVarA)) {
            qwVarA.i(epr.ON_RESUME);
        }
    }

    public final void e(String str) {
        yj.a();
        if (((eqc) this.b).e.equals(eps.a)) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Popping screens after the DESTROYED state is a no-op");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            Deque deque = this.a;
            if (deque.size() <= 1 || str.equals(a().c)) {
                break;
            } else {
                arrayList.add((qw) deque.pop());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        d(arrayList);
    }

    public final void f(qw qwVar) {
        yj.a();
        eqc eqcVar = (eqc) this.b;
        eps epsVar = eqcVar.e;
        eps epsVar2 = eps.a;
        if (epsVar.equals(epsVar2)) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Pushing screens after the DESTROYED state is a no-op");
                return;
            }
            return;
        }
        if (qwVar.b.e.equals(epsVar2)) {
            throw new IllegalStateException(String.format(Locale.US, "Failed to push screen (%s), because it has already been destroyed. Please note that screens are single-use, so a fresh instance is required every time you call screenManager.push().", qwVar));
        }
        qwVar.getClass();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", a.bm(qwVar, "Pushing screen ", " to the top of the screen stack"));
        }
        Deque deque = this.a;
        if (!deque.contains(qwVar)) {
            qw qwVar2 = (qw) deque.peek();
            i(qwVar, true);
            if (deque.contains(qwVar)) {
                if (qwVar2 != null) {
                    h(qwVar2, false);
                }
                if (eqcVar.e.a(eps.e)) {
                    qwVar.i(epr.ON_RESUME);
                    return;
                }
                return;
            }
            return;
        }
        qw qwVar3 = (qw) deque.peek();
        if (qwVar3 == null || qwVar3 == qwVar) {
            return;
        }
        deque.remove(qwVar);
        i(qwVar, false);
        h(qwVar3, false);
        if (eqcVar.e.a(eps.e)) {
            qwVar.i(epr.ON_RESUME);
        }
    }

    public final void g(qw qwVar) {
        yj.a();
        qwVar.getClass();
        if (((eqc) this.b).e.equals(eps.a)) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Popping screens after the DESTROYED state is a no-op");
                return;
            }
            return;
        }
        Deque deque = this.a;
        if (deque.size() > 1) {
            if (qwVar.equals(a())) {
                deque.pop();
                d(Collections.singletonList(qwVar));
            } else if (deque.remove(qwVar)) {
                qwVar.i(epr.ON_DESTROY);
            }
        }
    }
}
