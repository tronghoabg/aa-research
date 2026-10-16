package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zwq {
    private static final ScheduledExecutorService f = zrz.e("mapTier");
    public final zwl b;
    public final zwj c;
    public zvz e;
    private final zyb h;
    private final String i;
    private final zxs j;
    private final zys l;
    private final aabc m;
    private final gjt n;
    private volatile ScheduledFuture g = null;
    public final ArrayList a = new ArrayList();
    public zwp d = zwp.a;
    private final Executor k = zrz.b();

    public zwq(String str, zyb zybVar, zxs zxsVar, aabc aabcVar, gjt gjtVar, zwl zwlVar, zys zysVar, zwj zwjVar) {
        this.i = str;
        this.h = zybVar;
        this.j = zxsVar;
        this.m = aabcVar;
        this.n = gjtVar;
        this.b = zwlVar;
        this.l = zysVar;
        this.c = zwjVar;
        g();
        acbe acbeVarE = e();
        f(acbeVarE);
        zxsVar.b(acbeVarE, zysVar, str, zwjVar);
    }

    private final acbe e() {
        return this.d == zwp.b ? acbe.BASE_MAP_CREATE_DYNAMIC : acbe.PREMIUM_MAP_LOAD;
    }

    private final void f(acbe acbeVar) {
        zvz zvzVar = this.e;
        if (zvzVar != null) {
            zvzVar.d(this);
        }
        zvz zvzVarA = zwc.a(this.m, this.n, acbeVar);
        this.e = zvzVarA;
        zvzVarA.a.put(this.c, this);
    }

    @ResultIgnorabilityUnspecified
    private final boolean g() {
        zyb zybVar = this.h;
        HashMap map = zybVar.f;
        String str = this.i;
        zwp zwpVar = map.containsKey(str) ? (zwp) zybVar.f.get(str) : zwp.a;
        if (zwpVar.equals(this.d) && zwpVar.equals(zwp.a)) {
            zwpVar = woy.am(str) ? zwp.b : zwp.c;
        }
        if (zwpVar == this.d || zwpVar == zwp.a) {
            return false;
        }
        this.d = zwpVar;
        return true;
    }

    private final void h(int i) {
        boolean z;
        zys zysVar = this.l;
        zysVar.b(aahu.MAP_TIER_CHANGED);
        acbe acbeVarE = e();
        f(acbeVarE);
        this.j.b(acbeVarE, zysVar, this.i, this.c);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zwa zwaVar = (zwa) arrayList.get(i2);
            zwaVar.d = this.d;
            zwp zwpVar = zwaVar.d;
            boolean zK = zwa.k(zwpVar);
            boolean z2 = zwaVar.a;
            if (zK != z2) {
                zwaVar.a = !z2;
                z = true;
            } else {
                z = false;
            }
            boolean zH = zwaVar.h(zwpVar);
            boolean z3 = zwaVar.b;
            if (zH != z3) {
                zwaVar.b = !z3;
            } else {
                if (!z) {
                }
            }
            if (i == 2) {
                zwaVar.c = "Capabilities requiring a Map ID will no longer be available due to billing quota outage.";
            } else {
                zwaVar.c = "";
            }
            zwaVar.d();
        }
        zwp zwpVar2 = this.d;
        zwp zwpVar3 = zwp.c;
        zwl zwlVar = this.b;
        if (zwpVar2 == zwpVar3) {
            zwlVar.m();
        } else {
            zwlVar.n();
        }
    }

    public final void a() {
        if (this.g != null) {
            this.g.cancel(false);
            this.g = null;
        }
    }

    final void b(String str) {
        a();
        this.k.execute(new xab(this, str, 19, null));
    }

    final void c(acbe acbeVar, String str) {
        if (!acbeVar.equals(acbe.PREMIUM_MAP_LOAD) || !this.d.equals(zwp.c)) {
            if (acbeVar.equals(acbe.BASE_MAP_CREATE_DYNAMIC) && this.d.equals(zwp.b)) {
                b(str);
                return;
            }
            return;
        }
        this.d = zwp.b;
        h(2);
        zte zteVar = new zte(this, 12);
        a();
        this.g = f.schedule(zteVar, 3L, TimeUnit.HOURS);
        zrn.a(4, "Out of quota for the Map ID.", new Object[0]);
    }

    @ResultIgnorabilityUnspecified
    final void d() {
        a();
        if (g()) {
            h(1);
        }
    }
}
