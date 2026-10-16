package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uyh {
    public final defpackage.aaix a;
    final /* synthetic */ defpackage.uyi c;
    private final java.lang.String e;
    public int d = 1;
    private final long f = android.os.SystemClock.elapsedRealtime();
    public final java.util.List b = new java.util.ArrayList();

    public uyh(defpackage.uyi uyiVar, defpackage.aaix aaixVar, java.lang.String str) {
        this.c = uyiVar;
        this.a = aaixVar;
        this.e = str;
    }

    public final void a(int i) {
        defpackage.uyi uyiVar = this.c;
        if (uyiVar.j(this)) {
            long j = this.f;
            defpackage.abor aborVarL = uyiVar.l(this.a, (int) (android.os.SystemClock.elapsedRealtime() - j), i);
            java.lang.String str = this.e;
            if (str != null) {
                aborVarL.t();
                defpackage.yxc yxcVar = (defpackage.yxc) aborVarL.b;
                defpackage.yxc yxcVar2 = defpackage.yxc.a;
                yxcVar.b |= 4194304;
                yxcVar.t = str;
            }
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                aborVarL.M((defpackage.yxa) it.next());
            }
            synchronized (uyiVar) {
                long j2 = uyiVar.d;
                if (j2 == 0 || j2 > j) {
                    defpackage.aapn aapnVar = defpackage.aapn.DISCONNECTED;
                    aborVarL.t();
                    defpackage.yxc yxcVar3 = (defpackage.yxc) aborVarL.b;
                    defpackage.yxc yxcVar4 = defpackage.yxc.a;
                    yxcVar3.r = aapnVar.h;
                    yxcVar3.b |= 524288;
                } else {
                    java.util.List list = uyiVar.e;
                    if (list.isEmpty()) {
                        defpackage.aapn aapnVar2 = defpackage.aapn.DISCONNECTED;
                        aborVarL.t();
                        defpackage.yxc yxcVar5 = (defpackage.yxc) aborVarL.b;
                        defpackage.yxc yxcVar6 = defpackage.yxc.a;
                        yxcVar5.r = aapnVar2.h;
                        yxcVar5.b |= 524288;
                    } else {
                        android.net.Network network = (android.net.Network) defpackage.ysr.an(list);
                        android.content.Context context = uyiVar.c;
                        if (defpackage.duw.c(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                            ((defpackage.ype) ((defpackage.ype) defpackage.uyi.a.h()).ai((char) 9746)).u("ACCESS_NETWORK_STATE permission is not granted.");
                        } else {
                            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                            if (networkCapabilities != null) {
                                if (networkCapabilities.hasTransport(1)) {
                                    defpackage.aapn aapnVar3 = defpackage.aapn.WIFI;
                                    aborVarL.t();
                                    defpackage.yxc yxcVar7 = (defpackage.yxc) aborVarL.b;
                                    defpackage.yxc yxcVar8 = defpackage.yxc.a;
                                    yxcVar7.r = aapnVar3.h;
                                    yxcVar7.b |= 524288;
                                } else if (networkCapabilities.hasTransport(0)) {
                                    defpackage.aapn aapnVar4 = defpackage.aapn.CELL;
                                    aborVarL.t();
                                    defpackage.yxc yxcVar9 = (defpackage.yxc) aborVarL.b;
                                    defpackage.yxc yxcVar10 = defpackage.yxc.a;
                                    yxcVar9.r = aapnVar4.h;
                                    yxcVar9.b |= 524288;
                                    android.net.NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                                    if (networkInfo != null) {
                                        defpackage.yhe yheVar = uyiVar.g;
                                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(networkInfo.getSubtype());
                                        if (yheVar.containsKey(numValueOf)) {
                                            defpackage.aajv aajvVar = (defpackage.aajv) yheVar.get(numValueOf);
                                            aborVarL.t();
                                            defpackage.yxc yxcVar11 = (defpackage.yxc) aborVarL.b;
                                            yxcVar11.s = aajvVar.s;
                                            yxcVar11.b |= 1048576;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i2 = this.d;
            defpackage.uyi uyiVar2 = this.c;
            if (i2 != 1) {
                defpackage.yxc yxcVar12 = (defpackage.yxc) aborVarL.q();
                int i3 = this.d;
                defpackage.sim simVarF = uyiVar2.b.f(yxcVar12);
                simVarF.o = i3;
                simVarF.b();
            } else {
                uyiVar2.c((defpackage.yxc) aborVarL.q());
            }
            defpackage.ype ypeVar = (defpackage.ype) ((defpackage.ype) defpackage.uyi.a.e()).ai(9745);
            defpackage.yxc yxcVar13 = (defpackage.yxc) aborVarL.b;
            defpackage.aapn aapnVarB = defpackage.aapn.b(yxcVar13.r);
            if (aapnVarB == null) {
                aapnVarB = defpackage.aapn.OTHER_NETWORK;
            }
            defpackage.aajv aajvVarB = defpackage.aajv.b(yxcVar13.s);
            if (aajvVarB == null) {
                aajvVarB = defpackage.aajv.OTHER_CELL_NETWORK;
            }
            ypeVar.M("SliEvent: Network type = %s, subtype = %s", aapnVarB, aajvVarB);
            this.c.i(this);
        }
    }
}
