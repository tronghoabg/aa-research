package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class nzj {
    public final Object a;
    public final Object b;
    public final Object c;

    public nzj(aezk aezkVar) {
        yfu yfuVar = new yfu(4);
        abgl abglVar = abgl.GMM_BASEMAP_PERSONALIZATION;
        txs txsVar = txs.a;
        yfuVar.e(abglVar, txsVar);
        abgl abglVar2 = abgl.GMM_LOCAL_RECOMMENDATIONS;
        yfuVar.e(abglVar2, txsVar);
        abgl abglVar3 = abgl.DESTINATIONS;
        txs txsVar2 = txs.c;
        yfuVar.e(abglVar3, txsVar2);
        abgl abglVar4 = abgl.EVCS;
        yfuVar.e(abglVar4, txsVar2);
        abgl abglVar5 = abgl.GMM_BUSYNESS;
        yfuVar.e(abglVar5, txsVar);
        abgl abglVar6 = abgl.GMM_AREA_BUSYNESS;
        yfuVar.e(abglVar6, txsVar);
        abgl abglVar7 = abgl.GMM_BASEMAP_PHOTOS;
        yfuVar.e(abglVar7, txsVar);
        abgl abglVar8 = abgl.ADDITIVE_STATIC_LABELS;
        yfuVar.e(abglVar8, txsVar);
        abgl abglVar9 = abgl.GMM_CRISIS_OVERLAY;
        yfuVar.e(abglVar9, txs.b);
        abgl abglVar10 = abgl.MAPS_WAYFINDING;
        yfuVar.e(abglVar10, txsVar2);
        abgl abglVar11 = abgl.CONTEXTUAL_MAP_NO_TRACE;
        yfuVar.e(abglVar11, txsVar2);
        abgl abglVar12 = abgl.MAPS_DIRECTIONS;
        yfuVar.e(abglVar12, txsVar2);
        abgl abglVar13 = abgl.MAP_ACTIONS;
        yfuVar.e(abglVar13, txsVar2);
        yfy yfyVarD = yfuVar.d(true);
        ygr.n(yrm.q(abglVar2, abglVar, abglVar6, abglVar7, abglVar8, abglVar5));
        yfu yfuVar2 = new yfu(4);
        yfuVar2.e(abglVar, new tnp(15));
        yfuVar2.e(abglVar2, new txv(1));
        yfuVar2.e(abglVar3, new tnp(5));
        yfuVar2.e(abglVar4, new tnp(6));
        yfuVar2.e(abglVar5, new tnp(7));
        yfuVar2.e(abglVar6, new tnp(8));
        yfuVar2.e(abglVar7, new tnp(9));
        yfuVar2.e(abglVar9, new tnp(10));
        yfuVar2.e(abglVar10, new tnp(11));
        yfuVar2.e(abglVar8, new tnp(12));
        yfuVar2.e(abglVar11, new tnp(16));
        yfuVar2.e(abglVar12, new tnp(17));
        yfuVar2.e(abglVar13, new tnp(18));
        this.a = yfuVar2.d(true);
        this.b = yfy.l(abglVar2, new tnp(19), abglVar, new tnp(20));
        this.c = yfyVarD;
    }

    public final void a() {
        ((vag) this.a).c();
    }

    public final boolean b() {
        return ((vag) this.a).d();
    }

    public final ppw c(Context context, pqu pquVar, pxy pxyVar, pqj pqjVar) {
        context.getClass();
        lws.N(context);
        return new ppw(this, null, null, 1, pquVar, pquVar, pxyVar, pqjVar);
    }

    public final ygr d() {
        return ((yfy) this.c).keySet();
    }

    public final boolean e(abgl abglVar) {
        return ((Boolean) ((xyc) ((yfy) this.b).getOrDefault(abglVar, new tnp(13))).gu()).booleanValue();
    }

    public final boolean f(abgl abglVar) {
        return ((Boolean) ((xyc) ((yfy) this.a).getOrDefault(abglVar, new tnp(14))).gu()).booleanValue();
    }

    public final void g(float f) {
        woy.O(f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f, "opacity not in range [0.0f, 1.0f]");
        Object obj = this.a;
        woy.O(f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f, "opacity not in range [0.0f, 1.0f]");
        ukf ukfVar = ((txf) obj).b;
        synchronized (ukfVar) {
            ((txf) obj).a = Math.round(f * 255.0f);
            ujf ujfVarD = ukfVar.d();
            int i = ((txf) obj).a;
            int iArgb = Color.argb(i, i, i, i);
            synchronized (ujfVarD) {
                ujfVarD.D = iArgb;
            }
            ujfVarD.P = null;
        }
        ((ufs) this.b).F();
    }

    public final void h(boolean z) {
        ((ufs) this.b).u(z);
    }

    public nzj(ufs ufsVar, uor uorVar, txf txfVar) {
        this.b = ufsVar;
        this.c = uorVar;
        this.a = txfVar;
    }

    public nzj(char[] cArr) {
        this.c = new too();
        this.b = new tpf();
        this.a = new tpf();
    }

    public nzj() {
        Object objDE;
        kjq kjqVarA = kjq.a.a();
        this.a = kjqVarA;
        try {
            kjq kjqVar = kjqVarA;
            objDE = kjqVarA.a();
        } catch (Throwable th) {
            objDE = woy.dE(th);
        }
        afbe afbeVar = afbe.a;
        afco afcoVar = tby.a;
        eqj eqjVar = (eqj) (true == (objDE instanceof aezv) ? new eqm(afbeVar) : objDE);
        this.b = eqjVar;
        this.c = tby.v(eqjVar, new nqz(16));
    }

    public nzj(String str, uja ujaVar, ujf ujfVar) {
        this.c = str;
        this.a = ujaVar;
        this.b = ujfVar;
    }

    public nzj(ovq ovqVar, vag vagVar, owg owgVar) {
        this.b = ovqVar;
        this.a = vagVar;
        this.c = owgVar;
        try {
            ovqVar.e(new ovm(this));
        } catch (RemoteException e) {
            Log.e("CSL.ImeController", "Error setting ImeCallbacks", e);
        }
    }

    public nzj(Optional optional, ackk ackkVar, ackk ackkVar2) {
        optional.getClass();
        ackkVar.getClass();
        ackkVar2.getClass();
        this.b = optional;
        this.c = ackkVar;
        this.a = ackkVar2;
    }

    public nzj(ackk ackkVar) {
        this.b = new ConcurrentHashMap();
        yfu yfuVar = new yfu(4);
        for (qbb qbbVar : qbb.values()) {
            yfuVar.e(qbbVar, new sm((short[]) null));
        }
        this.c = yfuVar.d(true);
        this.a = ackkVar;
    }
}
