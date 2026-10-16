package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class uyi implements defpackage.uyj {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/reliability/sli/SdkSliLogger");
    private static final android.net.NetworkRequest h = new android.net.NetworkRequest.Builder().addCapability(12).build();
    public final defpackage.sip b;
    public final android.content.Context c;
    public long d;
    java.lang.Object f;
    public final defpackage.yhe g;
    private final java.lang.String i;
    private final java.util.Set j = new java.util.HashSet();
    final java.util.List e = new java.util.ArrayList();

    public uyi(android.content.Context context, defpackage.sip sipVar) {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(2, defpackage.aajv.EDGE);
        yhaVar.f(4, defpackage.aajv.CDMA);
        yhaVar.f(11, defpackage.aajv.IDEN);
        yhaVar.f(8, defpackage.aajv.HSDPA);
        yhaVar.f(9, defpackage.aajv.HSUPA);
        yhaVar.f(10, defpackage.aajv.HSPA);
        yhaVar.f(15, defpackage.aajv.HSPAP);
        yhaVar.f(14, defpackage.aajv.EHRPD);
        yhaVar.f(13, defpackage.aajv.LTE);
        this.g = yhaVar.d(true);
        this.i = context.getPackageName();
        this.c = context.getApplicationContext();
        this.b = sipVar;
        d();
    }

    public final synchronized void a(android.net.Network network) {
        this.e.add(network);
        this.d = android.os.SystemClock.elapsedRealtime();
    }

    @Override // defpackage.uyj
    public final synchronized void b(defpackage.aaix aaixVar) {
        java.util.Iterator it = this.j.iterator();
        while (it.hasNext()) {
            if (((defpackage.uyh) it.next()).a == aaixVar) {
                it.remove();
            }
        }
    }

    public void c(defpackage.yxc yxcVar) {
        this.b.f(yxcVar).b();
    }

    public final synchronized void d() {
        android.content.Context context = this.c;
        if (defpackage.duw.c(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            ((defpackage.ype) ((defpackage.ype) a.h()).ai((char) 9747)).u("ACCESS_NETWORK_STATE permission is not granted.");
        } else if (this.f == null) {
            this.f = new defpackage.uyg(this);
            ((android.net.ConnectivityManager) context.getSystemService("connectivity")).registerNetworkCallback(h, (android.net.ConnectivityManager.NetworkCallback) this.f);
        }
    }

    @Override // defpackage.uyj
    public final synchronized void e() {
        if (this.f != null) {
            ((android.net.ConnectivityManager) this.c.getSystemService("connectivity")).unregisterNetworkCallback((android.net.ConnectivityManager.NetworkCallback) this.f);
            this.f = null;
            this.e.clear();
            this.d = 0L;
        }
        java.util.Set set = this.j;
        java.util.ArrayList arrayList = new java.util.ArrayList(set);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.uyh) arrayList.get(i)).a(100);
        }
        set.clear();
    }

    public final synchronized void f(android.net.Network network) {
        java.util.List list = this.e;
        list.remove(network);
        if (list.isEmpty()) {
            this.d = 0L;
        }
    }

    @Override // defpackage.uyj
    public final synchronized defpackage.uyh g(defpackage.aaix aaixVar) {
        return h(aaixVar, null);
    }

    @Override // defpackage.uyj
    public final synchronized defpackage.uyh h(defpackage.aaix aaixVar, java.lang.String str) {
        defpackage.uyh uyhVar;
        uyhVar = new defpackage.uyh(this, aaixVar, str);
        this.j.add(uyhVar);
        return uyhVar;
    }

    public final synchronized void i(defpackage.uyh uyhVar) {
        this.j.remove(uyhVar);
    }

    public final synchronized boolean j(defpackage.uyh uyhVar) {
        return this.j.contains(uyhVar);
    }

    @Override // defpackage.uyj
    public final void k(defpackage.aaix aaixVar, int i) {
        c((defpackage.yxc) l(aaixVar, i, 0).q());
    }

    public defpackage.abor l(defpackage.aaix aaixVar, int i, int i2) {
        defpackage.abor aborVarN = defpackage.yxc.a.n();
        aborVarN.t();
        defpackage.yxc yxcVar = (defpackage.yxc) aborVarN.b;
        java.lang.String str = this.i;
        str.getClass();
        yxcVar.b |= 8;
        yxcVar.f = str;
        aborVarN.t();
        defpackage.yxc yxcVar2 = (defpackage.yxc) aborVarN.b;
        yxcVar2.b |= 2;
        yxcVar2.d = "3.4.0";
        aborVarN.t();
        defpackage.yxc yxcVar3 = (defpackage.yxc) aborVarN.b;
        yxcVar3.q = 1;
        yxcVar3.b |= 262144;
        aborVarN.t();
        defpackage.yxc yxcVar4 = (defpackage.yxc) aborVarN.b;
        yxcVar4.b |= 131072;
        yxcVar4.p = 0;
        aborVarN.t();
        defpackage.yxc yxcVar5 = (defpackage.yxc) aborVarN.b;
        yxcVar5.b |= 32768;
        yxcVar5.n = i;
        aborVarN.t();
        defpackage.yxc yxcVar6 = (defpackage.yxc) aborVarN.b;
        yxcVar6.b |= 65536;
        yxcVar6.o = i2;
        aborVarN.t();
        defpackage.yxc yxcVar7 = (defpackage.yxc) aborVarN.b;
        yxcVar7.m = aaixVar.gh;
        yxcVar7.b |= 8192;
        return aborVarN;
    }
}
