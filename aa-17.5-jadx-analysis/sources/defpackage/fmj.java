package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;

/* loaded from: classes2.dex */
final class fmj extends afde implements afeg {
    int a;
    final /* synthetic */ fja b;
    final /* synthetic */ fmk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmj(fja fjaVar, fmk fmkVar, afck afckVar) {
        super(2, afckVar);
        this.b = fjaVar;
        this.c = fmkVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        fmj fmjVar = new fmj(this.b, this.c, afckVar);
        fmjVar.d = obj;
        return fmjVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Object ahVar;
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            aixv aixvVar = (aixv) this.d;
            fja fjaVar = this.b;
            NetworkRequest networkRequestA = fjaVar.a();
            int i2 = 15;
            int i3 = 16;
            byte[] bArr = null;
            if (networkRequestA == null) {
                int i4 = fjaVar.j;
                if (i4 == 1) {
                    networkRequestA = null;
                } else {
                    NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                    if (Build.VERSION.SDK_INT < 30 || i4 != 6) {
                        int i5 = i4 - 1;
                        if (i5 == 2) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(11);
                        } else if (i5 == 3) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(18);
                        } else if (i5 == 4) {
                            builderRemoveCapability = builderRemoveCapability.addTransportType(0);
                        }
                        networkRequestA = builderRemoveCapability.build();
                    } else {
                        networkRequestA = builderRemoveCapability.addCapability(25).build();
                    }
                }
            }
            if (networkRequestA == null) {
                aixvVar.u(null);
                return afak.a;
            }
            fmk fmkVar = this.c;
            bpi bpiVar = new bpi(ahnc.d(aixvVar, null, 0, new ehs(fmkVar, aixvVar, (afck) null, 8), 3), aixvVar, i2, bArr);
            if (Build.VERSION.SDK_INT >= 30) {
                fmm fmmVar = fmm.a;
                ConnectivityManager connectivityManager = fmkVar.a;
                synchronized (fmm.b) {
                    if (fmm.c.isEmpty()) {
                        fjo.a().c(fmp.a, "NetworkRequestConstraintController register shared callback");
                        try {
                            connectivityManager.registerDefaultNetworkCallback(fmm.a);
                        } catch (SecurityException e) {
                            fjo.a();
                            Log.e(fmp.a, "NetworkRequestConstraintController couldn't register callback", e);
                            bpiVar.invoke(new fmh(7));
                            ahVar = new eup(10);
                        }
                    } else if (fmm.e && fmm.f != null) {
                        fjo.a().c(fmp.a, "NetworkRequestConstraintController send initial capabilities");
                        bpiVar.invoke(fmm.a.a(networkRequestA, fmm.d) ? fmg.a : new fmh(7));
                    }
                }
                ahVar = new bsh(bpiVar, connectivityManager, i3);
            } else {
                fmk fmkVar2 = this.c;
                fmi fmiVar = new fmi(bpiVar);
                affq affqVar = new affq();
                ConnectivityManager connectivityManager2 = fmkVar2.a;
                try {
                    fjo.a().c(fmp.a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(networkRequestA, fmiVar);
                    affqVar.a = true;
                } catch (SecurityException e2) {
                    fjo.a();
                    Log.e(fmp.a, "NetworkRequestConstraintController couldn't register callback", e2);
                    bpiVar.invoke(new fmh(7));
                } catch (RuntimeException e3) {
                    String name = e3.getClass().getName();
                    name.getClass();
                    if (!afyh.e(name, "TooManyRequestsException", false)) {
                        throw e3;
                    }
                    fjo.a().d(fmp.a, "NetworkRequestConstraintController couldn't register callback", e3);
                    bpiVar.invoke(new fmh(7));
                }
                ahVar = new ah(affqVar, connectivityManager2, fmiVar, 3, (char[]) null);
            }
            flm flmVar = new flm(ahVar, 9);
            this.a = 1;
            if (aimh.a(aixvVar, flmVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fmj) b((aixv) obj, (afck) obj2)).hT(afak.a);
    }
}
