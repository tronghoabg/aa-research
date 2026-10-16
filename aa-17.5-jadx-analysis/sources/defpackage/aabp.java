package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.FeatureType;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.internal.IOnFeatureClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aabp {
    public final zrt a;
    public final zwr b;
    public final aabg c;
    public final Map d;
    public final zys e;
    public vgm f;
    public vgs g;
    public vhn h;
    public twq i;
    private final aaco j;

    public aabp(aaco aacoVar, zwr zwrVar, zrt zrtVar, zys zysVar) {
        this.j = aacoVar;
        this.b = zwrVar;
        zkt.n(zrtVar, "MapEventManagerPhoenix.uiThreadChecker");
        this.a = zrtVar;
        this.e = zysVar;
        this.c = new aabg(aacoVar);
        this.f = null;
        this.g = null;
        this.d = new HashMap();
    }

    public final void a(too tooVar) {
        ygr ygrVarB = this.c.b();
        if (ygrVarB.isEmpty()) {
            return;
        }
        this.a.a();
        yca ycaVar = new yca(12, 3);
        Iterator<E> it = ygrVarB.iterator();
        while (it.hasNext()) {
            zuy zuyVarA = zuy.a((abst) it.next(), this.e);
            if (zuyVarA != null) {
                String str = zuyVarA.b;
                if (str.equals(FeatureType.DATASET)) {
                    str = zuyVarA.c;
                }
                ycaVar.t(str, zuyVarA);
            }
        }
        Map map = this.d;
        for (String str2 : map.keySet()) {
            Set set = (Set) map.get(str2);
            if (!set.isEmpty() && ycaVar.s(str2)) {
                zuw zuwVar = new zuw(aaaw.d(tooVar.g()), new ArrayList(ycaVar.c(str2)));
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    try {
                        ((IOnFeatureClickListener) it2.next()).onFeatureClick(zuwVar);
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                }
            }
        }
        this.c.d();
    }

    final void b(too tooVar) {
        this.a.a();
        zkt.n(tooVar, "point");
        vgs vgsVar = this.g;
        if (vgsVar == null) {
            return;
        }
        try {
            vgsVar.e(aaaw.d(tooVar.g()));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    final void c(too tooVar) {
        this.a.a();
        zkt.n(tooVar, "point");
        LatLng latLngD = aaaw.d(tooVar.g());
        this.j.k();
        try {
            vgm vgmVar = this.f;
            if (vgmVar != null) {
                try {
                    vgmVar.e(latLngD);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
        } finally {
            this.b.c();
        }
    }
}
