package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class uxm implements uxn {
    public static final yob a = yob.c("com/google/android/libraries/geo/reliability/sli/SdkSliLogger");
    private static final NetworkRequest h = new NetworkRequest.Builder().addCapability(12).build();
    public final shv b;
    public final Context c;
    public long d;
    Object f;
    public final yfy g;
    private final String i;
    private final Set j = new HashSet();
    final List e = new ArrayList();

    public uxm(Context context, shv shvVar) {
        yfu yfuVar = new yfu(4);
        yfuVar.e(2, aais.EDGE);
        yfuVar.e(4, aais.CDMA);
        yfuVar.e(11, aais.IDEN);
        yfuVar.e(8, aais.HSDPA);
        yfuVar.e(9, aais.HSUPA);
        yfuVar.e(10, aais.HSPA);
        yfuVar.e(15, aais.HSPAP);
        yfuVar.e(14, aais.EHRPD);
        yfuVar.e(13, aais.LTE);
        this.g = yfuVar.d(true);
        this.i = context.getPackageName();
        this.c = context.getApplicationContext();
        this.b = shvVar;
        d();
    }

    public final synchronized void a(Network network) {
        this.e.add(network);
        this.d = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.uxn
    public final synchronized void b(aahu aahuVar) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            if (((uxl) it.next()).a == aahuVar) {
                it.remove();
            }
        }
    }

    public void c(yvx yvxVar) {
        this.b.f(yvxVar).b();
    }

    public final synchronized void d() {
        Context context = this.c;
        if (dup.c(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            ((ynz) ((ynz) a.h()).ai((char) 9719)).u("ACCESS_NETWORK_STATE permission is not granted.");
        } else if (this.f == null) {
            this.f = new uxk(this);
            ((ConnectivityManager) context.getSystemService("connectivity")).registerNetworkCallback(h, (ConnectivityManager.NetworkCallback) this.f);
        }
    }

    @Override // defpackage.uxn
    public final synchronized void e() {
        if (this.f != null) {
            ((ConnectivityManager) this.c.getSystemService("connectivity")).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f);
            this.f = null;
            this.e.clear();
            this.d = 0L;
        }
        Set set = this.j;
        ArrayList arrayList = new ArrayList(set);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((uxl) arrayList.get(i)).a(100);
        }
        set.clear();
    }

    public final synchronized void f(Network network) {
        List list = this.e;
        list.remove(network);
        if (list.isEmpty()) {
            this.d = 0L;
        }
    }

    @Override // defpackage.uxn
    public final synchronized uxl g(aahu aahuVar) {
        return h(aahuVar, null);
    }

    @Override // defpackage.uxn
    public final synchronized uxl h(aahu aahuVar, String str) {
        uxl uxlVar;
        uxlVar = new uxl(this, aahuVar, str);
        this.j.add(uxlVar);
        return uxlVar;
    }

    public final synchronized void i(uxl uxlVar) {
        this.j.remove(uxlVar);
    }

    public final synchronized boolean j(uxl uxlVar) {
        return this.j.contains(uxlVar);
    }

    @Override // defpackage.uxn
    public final void k(aahu aahuVar, int i) {
        c((yvx) l(aahuVar, i, 0).q());
    }

    public abnp l(aahu aahuVar, int i, int i2) {
        abnp abnpVarN = yvx.a.n();
        abnpVarN.t();
        yvx yvxVar = (yvx) abnpVarN.b;
        String str = this.i;
        str.getClass();
        yvxVar.b |= 8;
        yvxVar.f = str;
        abnpVarN.t();
        yvx yvxVar2 = (yvx) abnpVarN.b;
        yvxVar2.b |= 2;
        yvxVar2.d = "3.4.0";
        abnpVarN.t();
        yvx yvxVar3 = (yvx) abnpVarN.b;
        yvxVar3.q = 1;
        yvxVar3.b |= 262144;
        abnpVarN.t();
        yvx yvxVar4 = (yvx) abnpVarN.b;
        yvxVar4.b |= 131072;
        yvxVar4.p = 0;
        abnpVarN.t();
        yvx yvxVar5 = (yvx) abnpVarN.b;
        yvxVar5.b |= 32768;
        yvxVar5.n = i;
        abnpVarN.t();
        yvx yvxVar6 = (yvx) abnpVarN.b;
        yvxVar6.b |= 65536;
        yvxVar6.o = i2;
        abnpVarN.t();
        yvx yvxVar7 = (yvx) abnpVarN.b;
        yvxVar7.m = aahuVar.gh;
        yvxVar7.b |= 8192;
        return abnpVarN;
    }
}
