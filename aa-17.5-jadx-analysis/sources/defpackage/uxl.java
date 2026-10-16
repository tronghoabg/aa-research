package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class uxl {
    public final aahu a;
    final /* synthetic */ uxm c;
    private final String e;
    public int d = 1;
    private final long f = SystemClock.elapsedRealtime();
    public final List b = new ArrayList();

    public uxl(uxm uxmVar, aahu aahuVar, String str) {
        this.c = uxmVar;
        this.a = aahuVar;
        this.e = str;
    }

    public final void a(int i) {
        uxm uxmVar = this.c;
        if (uxmVar.j(this)) {
            long j = this.f;
            abnp abnpVarL = uxmVar.l(this.a, (int) (SystemClock.elapsedRealtime() - j), i);
            String str = this.e;
            if (str != null) {
                abnpVarL.t();
                yvx yvxVar = (yvx) abnpVarL.b;
                yvx yvxVar2 = yvx.a;
                yvxVar.b |= 4194304;
                yvxVar.t = str;
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                abnpVarL.M((yvv) it.next());
            }
            synchronized (uxmVar) {
                long j2 = uxmVar.d;
                if (j2 == 0 || j2 > j) {
                    aaok aaokVar = aaok.DISCONNECTED;
                    abnpVarL.t();
                    yvx yvxVar3 = (yvx) abnpVarL.b;
                    yvx yvxVar4 = yvx.a;
                    yvxVar3.r = aaokVar.h;
                    yvxVar3.b |= 524288;
                } else {
                    List list = uxmVar.e;
                    if (list.isEmpty()) {
                        aaok aaokVar2 = aaok.DISCONNECTED;
                        abnpVarL.t();
                        yvx yvxVar32 = (yvx) abnpVarL.b;
                        yvx yvxVar42 = yvx.a;
                        yvxVar32.r = aaokVar2.h;
                        yvxVar32.b |= 524288;
                    } else {
                        Network network = (Network) yrm.an(list);
                        Context context = uxmVar.c;
                        if (dup.c(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                            ((ynz) ((ynz) uxm.a.h()).ai((char) 9718)).u("ACCESS_NETWORK_STATE permission is not granted.");
                        } else {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                            if (networkCapabilities != null) {
                                if (networkCapabilities.hasTransport(1)) {
                                    aaok aaokVar3 = aaok.WIFI;
                                    abnpVarL.t();
                                    yvx yvxVar5 = (yvx) abnpVarL.b;
                                    yvx yvxVar6 = yvx.a;
                                    yvxVar5.r = aaokVar3.h;
                                    yvxVar5.b |= 524288;
                                } else if (networkCapabilities.hasTransport(0)) {
                                    aaok aaokVar4 = aaok.CELL;
                                    abnpVarL.t();
                                    yvx yvxVar7 = (yvx) abnpVarL.b;
                                    yvx yvxVar8 = yvx.a;
                                    yvxVar7.r = aaokVar4.h;
                                    yvxVar7.b |= 524288;
                                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                                    if (networkInfo != null) {
                                        yfy yfyVar = uxmVar.g;
                                        Integer numValueOf = Integer.valueOf(networkInfo.getSubtype());
                                        if (yfyVar.containsKey(numValueOf)) {
                                            aais aaisVar = (aais) yfyVar.get(numValueOf);
                                            abnpVarL.t();
                                            yvx yvxVar9 = (yvx) abnpVarL.b;
                                            yvxVar9.s = aaisVar.s;
                                            yvxVar9.b |= 1048576;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i2 = this.d;
            uxm uxmVar2 = this.c;
            if (i2 != 1) {
                yvx yvxVar10 = (yvx) abnpVarL.q();
                int i3 = this.d;
                shr shrVarF = uxmVar2.b.f(yvxVar10);
                shrVarF.o = i3;
                shrVarF.b();
            } else {
                uxmVar2.c((yvx) abnpVarL.q());
            }
            ynz ynzVar = (ynz) ((ynz) uxm.a.e()).ai(9717);
            yvx yvxVar11 = (yvx) abnpVarL.b;
            aaok aaokVarB = aaok.b(yvxVar11.r);
            if (aaokVarB == null) {
                aaokVarB = aaok.OTHER_NETWORK;
            }
            aais aaisVarB = aais.b(yvxVar11.s);
            if (aaisVarB == null) {
                aaisVarB = aais.OTHER_CELL_NETWORK;
            }
            ynzVar.M("SliEvent: Network type = %s, subtype = %s", aaokVarB, aaisVarB);
            this.c.i(this);
        }
    }
}
