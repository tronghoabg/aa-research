package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.PointOfInterest;
import com.google.android.libraries.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
public final class aabo implements tqc {
    private final aabp a;

    public aabo(aabp aabpVar) {
        this.a = aabpVar;
    }

    @Override // defpackage.tqc
    public final void a(tqr tqrVar, too tooVar) {
        if (tqrVar instanceof tww) {
            tww twwVar = (tww) tqrVar;
            too tooVar2 = twwVar.d;
            aabp aabpVar = this.a;
            aabpVar.a.a();
            try {
                if (aabpVar.h != null) {
                    abdl abdlVar = twwVar.a;
                    zkt.m(abdlVar);
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
                            int i = abcdVar.b;
                            if ((i & 16) != 0 && (i & 32) != 0) {
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
                                zkkVar2.b |= 2;
                                zkkVar2.d = j2;
                                zkk zkkVar3 = (zkk) abnpVarN.q();
                                abnrVar.t();
                                absu absuVar = (absu) abnrVar.b;
                                zkkVar3.getClass();
                                absuVar.c = zkkVar3;
                                absuVar.b |= 1;
                                pointOfInterest = new PointOfInterest(aaaw.d(tooVar2.g()), ysi.C((absu) abnrVar.q()), abcdVar.i);
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
                }
            } finally {
                aabpVar.b.c();
            }
        }
        this.a.a(tooVar);
    }

    @Override // defpackage.tqc
    public final void b(too tooVar) {
        this.a.b(tooVar);
    }

    @Override // defpackage.tqc
    public final void c(too tooVar) {
        aabp aabpVar = this.a;
        aabpVar.c(tooVar);
        aabpVar.a(tooVar);
    }

    @Override // defpackage.tqc
    public final void d(too tooVar) {
        this.a.b(tooVar);
    }
}
