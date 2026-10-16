package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class aduw implements adkm {
    private final adrw A;
    private final admh B;
    public final adus a;
    public final ScheduledExecutorService b;
    public final adkj c;
    public final adiy d;
    public final boolean e;
    public final List f;
    public final adnw g;
    public final adut h;
    public volatile List i;
    public final xya j;
    public adwi k;
    public adss n;
    public volatile adwi o;
    public adnq q;
    public volatile adis r;
    public final adzz s;
    public final String t;
    public adtp u;
    public aebg v;
    public aebg w;
    private final adkn x;
    private final String y;
    private final adsm z;
    public final Collection l = new ArrayList();
    public final aduj m = new aduo(this);
    public volatile adji p = adji.a(adjh.d);

    public aduw(adkx adkxVar, String str, adsm adsmVar, ScheduledExecutorService scheduledExecutorService, adnw adnwVar, adus adusVar, adkj adkjVar, adrw adrwVar, adkn adknVar, adiy adiyVar, List list, String str2, admh admhVar) {
        Object obj;
        List list2 = adkxVar.a;
        woy.O(!list2.isEmpty(), "addressGroups is empty");
        j(list2);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list2));
        this.i = listUnmodifiableList;
        this.h = new adut(listUnmodifiableList);
        this.y = str;
        this.z = adsmVar;
        this.b = scheduledExecutorService;
        this.j = new xya();
        this.g = adnwVar;
        this.B = admhVar;
        this.a = adusVar;
        this.c = adkjVar;
        this.A = adrwVar;
        this.x = adknVar;
        this.d = adiyVar;
        this.f = list;
        adkw adkwVar = adli.c;
        int i = 0;
        while (true) {
            Object[][] objArr = adkxVar.c;
            if (i >= objArr.length) {
                obj = adkwVar.a;
                break;
            } else {
                if (adkwVar.equals(objArr[i][0])) {
                    obj = adkxVar.c[i][1];
                    break;
                }
                i++;
            }
        }
        this.e = ((Boolean) obj).booleanValue();
        this.t = str2;
        this.s = new adzz(admhVar);
    }

    public static void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final String k(adnq adnqVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(adnqVar.p);
        String str = adnqVar.q;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        Throwable th = adnqVar.r;
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    public final adsk a() {
        adwi adwiVar = this.o;
        if (adwiVar != null) {
            return adwiVar;
        }
        this.g.execute(new adpo(this, 17, null));
        return null;
    }

    public final void b(adjh adjhVar) {
        this.g.c();
        c(adji.a(adjhVar));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [adlh, java.lang.Object] */
    public final void c(adji adjiVar) {
        this.g.c();
        adjh adjhVar = this.p.a;
        adjh adjhVar2 = adjiVar.a;
        if (adjhVar != adjhVar2) {
            woy.ad(this.p.a != adjh.e, "Cannot transition out of SHUTDOWN to %s", adjhVar2);
            if (this.e && adjhVar2 == adjh.c) {
                this.p = adji.a(adjh.d);
            } else {
                this.p = adjiVar;
            }
            this.a.a.a(adjiVar);
        }
    }

    public final void d() {
        this.g.execute(new adpo(this, 19, null));
    }

    @Override // defpackage.adkt
    public final adkn e() {
        return this.x;
    }

    public final void f(adss adssVar, boolean z) {
        this.g.execute(new lvn(this, adssVar, z, 6));
    }

    public final void g(adnq adnqVar) {
        this.g.execute(new adsy(this, adnqVar, 15));
    }

    public final void h() {
        adke adkeVar;
        adnw adnwVar = this.g;
        adnwVar.c();
        woy.aa(this.v == null, "Should have no reconnectTask scheduled");
        adut adutVar = this.h;
        if (adutVar.a == 0 && adutVar.b == 0) {
            xya xyaVar = this.j;
            xyaVar.d();
            xyaVar.e();
        }
        SocketAddress socketAddressB = adutVar.b();
        if (socketAddressB instanceof adke) {
            adke adkeVar2 = (adke) socketAddressB;
            adkeVar = adkeVar2;
            socketAddressB = adkeVar2.b;
        } else {
            adkeVar = null;
        }
        adis adisVarA = adutVar.a();
        String str = (String) adisVarA.a(adjv.a);
        adsl adslVar = new adsl();
        if (str == null) {
            str = this.y;
        }
        str.getClass();
        adslVar.a = str;
        adslVar.b = adisVarA;
        adslVar.c = null;
        this.B.getClass();
        adslVar.d = adkeVar;
        aduv aduvVar = new aduv();
        aduvVar.a = this.x;
        adur adurVar = new adur(this.z.a(socketAddressB, adslVar, aduvVar), this.A);
        aduvVar.a = adurVar.e();
        adkj.b(this.c.f, adurVar);
        this.n = adurVar;
        this.l.add(adurVar);
        Runnable runnableC = adurVar.c(new aduu(this, adurVar));
        if (runnableC != null) {
            adnwVar.b(runnableC);
        }
        this.d.b(2, "Started transport {0}", aduvVar.a);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.g("logId", this.x.a);
        xxgVarAo.b("addressGroups", this.i);
        return xxgVarAo.toString();
    }
}
