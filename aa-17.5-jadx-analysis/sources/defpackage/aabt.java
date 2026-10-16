package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.FeatureType;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.PointOfInterest;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.internal.IOnFeatureClickListener;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aabt implements piy {
    final /* synthetic */ aabp a;

    public aabt(aabp aabpVar) {
        this.a = aabpVar;
    }

    @Override // defpackage.piy
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // defpackage.piy
    public final void b(int i, toi toiVar) {
        aabp aabpVar = this.a;
        if (i == 1) {
            aabpVar.c(too.k(toiVar));
        } else {
            aabpVar.b(too.k(toiVar));
        }
    }

    @Override // defpackage.piy
    public final void c(trv trvVar, int i, toi toiVar) {
        zwr zwrVar;
        if (i != 1) {
            return;
        }
        LatLng latLngD = aaaw.d(toiVar);
        abhj abhjVar = trvVar.a;
        int iAB = a.aB(abhjVar.d);
        if (iAB != 0 && iAB == 2) {
            aabp aabpVar = this.a;
            aabpVar.a.a();
            try {
                if (aabpVar.h == null) {
                    zwrVar = aabpVar.b;
                } else {
                    abdl abdlVar = abhjVar.c;
                    if (abdlVar == null) {
                        abdlVar = abdl.a;
                    }
                    abnh abnhVar = abdn.w;
                    abdlVar.j(abnhVar);
                    abnl abnlVar = abdlVar.w;
                    abnu abnuVar = abnhVar.d;
                    PointOfInterest pointOfInterest = null;
                    if (abnlVar.m(abnuVar)) {
                        abdlVar.j(abnhVar);
                        Object objJ = abdlVar.w.j(abnuVar);
                        abcd abcdVar = (abcd) (objJ == null ? abnhVar.b : abnhVar.c(objJ));
                        if (!abcdVar.equals(abbf.V.b)) {
                            int i2 = abcdVar.b;
                            if ((i2 & 16) != 0 && (i2 & 32) != 0) {
                                abnr abnrVar = (abnr) absu.a.n();
                                abnp abnpVarN = zkk.a.n();
                                long j = abcdVar.f;
                                abnpVarN.t();
                                zkk zkkVar = (zkk) abnpVarN.b;
                                zkkVar.b |= 1;
                                zkkVar.c = j;
                                long j2 = abcdVar.g;
                                abnpVarN.t();
                                zkk zkkVar2 = (zkk) abnpVarN.b;
                                zkkVar2.b = 2 | zkkVar2.b;
                                zkkVar2.d = j2;
                                zkk zkkVar3 = (zkk) abnpVarN.q();
                                abnrVar.t();
                                absu absuVar = (absu) abnrVar.b;
                                zkkVar3.getClass();
                                absuVar.c = zkkVar3;
                                absuVar.b = 1 | absuVar.b;
                                pointOfInterest = new PointOfInterest(latLngD, ysi.C((absu) abnrVar.q()), abcdVar.i);
                            }
                        }
                    }
                    if (pointOfInterest != null) {
                        try {
                            aabpVar.h.e(pointOfInterest);
                        } catch (RemoteException e) {
                            throw new RuntimeRemoteException(e);
                        }
                    }
                    zwrVar = aabpVar.b;
                }
                zwrVar.c();
            } catch (Throwable th) {
                aabpVar.b.c();
                throw th;
            }
        }
        aabp aabpVar2 = this.a;
        aabpVar2.a.a();
        abdl abdlVar2 = trvVar.a.c;
        if (abdlVar2 == null) {
            abdlVar2 = abdl.a;
        }
        abnh abnhVar2 = abdn.L;
        abdlVar2.j(abnhVar2);
        abnl abnlVar2 = abdlVar2.w;
        abnu abnuVar2 = abnhVar2.d;
        if (abnlVar2.m(abnuVar2)) {
            abdlVar2.j(abnhVar2);
            Object objJ2 = abdlVar2.w.j(abnuVar2);
            zuy zuyVarA = zuy.a((abst) (objJ2 == null ? abnhVar2.b : abnhVar2.c(objJ2)), aabpVar2.e);
            if (zuyVarA != null) {
                String str = zuyVarA.b;
                if (str.equals(FeatureType.DATASET)) {
                    str = zuyVarA.c;
                }
                Set set = (Set) aabpVar2.d.get(str);
                if (set == null || set.isEmpty()) {
                    return;
                }
                zuw zuwVar = new zuw(latLngD, yfq.q(zuyVarA));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        ((IOnFeatureClickListener) it.next()).onFeatureClick(zuwVar);
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                }
            }
        }
    }
}
