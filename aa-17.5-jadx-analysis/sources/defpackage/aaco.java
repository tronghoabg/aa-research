package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.libraries.maps.model.TileProvider;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aaco implements zxf, zwy, tqj {
    static final Comparator a = new tui(14);
    public static final /* synthetic */ int o = 0;
    public final View c;
    public final aach d;
    public final Executor e;
    public final uzy f;
    public final Map g;
    int l;
    aaci m;
    aabi n;
    private final float p;
    private final ztt q;
    private final trk r;
    private final twq s;
    private final piv t;
    private final ncp u;
    public final vae b = new pqf(this, 4);
    public volatile boolean h = false;
    final Map i = new HashMap();
    final Map j = new ConcurrentHashMap();
    final List k = new ArrayList();

    public aaco(float f, View view, twq twqVar, ncp ncpVar, ztt zttVar, aach aachVar, trk trkVar, piv pivVar, Map map, Executor executor, uzy uzyVar) {
        this.p = f;
        this.c = view;
        zkt.n(twqVar, "googleMapV2");
        this.s = twqVar;
        this.u = ncpVar;
        this.q = zttVar;
        this.d = aachVar;
        synchronized (this) {
            this.l = Integer.MIN_VALUE;
            this.n = null;
            this.m = null;
        }
        this.r = trkVar;
        this.t = pivVar;
        this.g = map;
        this.e = executor;
        this.f = uzyVar;
    }

    private final synchronized void p(tqk tqkVar) {
        int i;
        for (tqn tqnVar : ((ucv) tqkVar).b.values()) {
            if (tqnVar != null && ((i = tqnVar.i) == 1 || i == 2 || i == 3 || i == 4)) {
                abdl abdlVar = tqnVar.b;
                if (abdlVar != null) {
                    abnh abnhVar = abdn.v;
                    abdlVar.j(abnhVar);
                    abnl abnlVar = abdlVar.w;
                    abnu abnuVar = abnhVar.d;
                    if (abnlVar.m(abnuVar)) {
                        abdlVar.j(abnhVar);
                        Object objJ = abdlVar.w.j(abnuVar);
                        this.k.add(((abdp) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).c);
                    }
                }
            }
        }
    }

    @Override // defpackage.tqj
    public final synchronized void a(tqk tqkVar) {
        this.k.clear();
        p(tqkVar);
    }

    @Override // defpackage.zwy
    public final zwu b(zwv zwvVar) {
        boolean z;
        zvu zvuVar = new zvu(this.s, 2);
        trk trkVar = this.r;
        if (trkVar.l()) {
            z = true;
        } else {
            trkVar.n();
            z = false;
        }
        piv pivVar = this.t;
        return new aack(this, zwvVar, this.q, trkVar, pivVar, zvuVar, this.p, z);
    }

    @Override // defpackage.zwy
    public final List c() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (String str : this.k) {
                aaci aaciVar = addm.d() ? (aaci) this.j.get(str) : (aaci) this.i.get(str);
                if (aaciVar != null) {
                    arrayList.add(aaciVar);
                }
            }
        }
        Collections.sort(arrayList, a);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((aaci) arrayList.get(i)).i());
        }
        return arrayList2;
    }

    @Override // defpackage.zwy
    public final List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (String str : this.k) {
                aaci aaciVar = addm.d() ? (aaci) this.j.get(str) : (aaci) this.i.get(str);
                if (aaciVar != null) {
                    arrayList.add(aaciVar.i());
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.zxf
    public final zvh e(zvi zviVar) {
        aabh aabhVar = new aabh(this.s, zviVar, j());
        aabhVar.e.a();
        boolean z = aabhVar.h;
        zkt.h((z || aabhVar.i) ? false : true, "isInitialized=%s isRemoved=%s", Boolean.valueOf(z), Boolean.valueOf(aabhVar.i));
        abnr abnrVar = aabhVar.k;
        int i = aabhVar.f;
        abnrVar.t();
        abax abaxVar = (abax) abnrVar.b;
        abax abaxVar2 = abax.a;
        abaxVar.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        abaxVar.k = i;
        aabhVar.e();
        aacl aaclVar = aabhVar.d;
        twq twqVar = aabhVar.j;
        zvi zviVar2 = aabhVar.c;
        int iB = aaclVar.b(twqVar, zviVar2.d(), zviVar2.c());
        abnrVar.t();
        abax abaxVar3 = (abax) abnrVar.b;
        abaxVar3.b |= 128;
        abaxVar3.i = iB;
        aabhVar.g.b((abax) abnrVar.q(), aabh.a, aabhVar.d(), aabhVar.c(), null);
        aabhVar.h = true;
        return aabhVar;
    }

    @Override // defpackage.zxf
    public final zxe f(zuk zukVar) {
        aacp aacpVar = new aacp(this.p, this.s, zukVar, j());
        aacpVar.e();
        return aacpVar;
    }

    @Override // defpackage.zxf
    public final zxe g(zxj zxjVar) {
        aacp aacpVar = new aacp(this.p, this.s, zxjVar, j());
        aacpVar.e();
        return aacpVar;
    }

    @Override // defpackage.zxf
    public final zxk h(zxl zxlVar) {
        aacr aacrVar = new aacr(this.p, this.s, zxlVar, this.u, j());
        if (!aacrVar.c) {
            aacrVar.d();
            aacrVar.e(null);
        }
        return aacrVar;
    }

    @Override // defpackage.zxf
    public final aacv i(zyo zyoVar) {
        int i;
        umx umxVar;
        aacv aacvVar = new aacv(this.s, zyoVar, j());
        aacvVar.b.a();
        if (aacvVar.e != null) {
            return aacvVar;
        }
        twq twqVar = aacvVar.d;
        zyo zyoVar2 = aacvVar.a;
        TileProvider tileProvider = zyoVar2.b;
        zkt.n(tileProvider, "tileProvider");
        aaau aaauVar = new aaau("mapview-tileoverlay-".concat(String.valueOf(zyoVar2.a)), tileProvider);
        Executor executor = aacvVar.c;
        boolean zC = zyoVar2.c();
        txf txfVar = new txf();
        Object obj = aaauVar.a;
        abgl abglVar = abgl.GMM_API_TILE_OVERLAY;
        tox toxVar = new tox((String) obj, abglVar);
        txg txgVar = twqVar.h;
        uod uodVar = txgVar.c;
        synchronized (uodVar.b(toxVar)) {
            tox toxVarS = uodVar.m.s(abglVar);
            xyc xycVar = uodVar.g;
            aezk aezkVar = uodVar.c;
            ((zwm) aezkVar.a()).b();
            int iE = uod.e(xycVar, uodVar.h);
            if (((zwm) aezkVar.a()).b().e > 0) {
                iE = ((zwm) aezkVar.a()).b().e;
                i = 2;
            } else {
                i = 1;
            }
            umxVar = new umx(toxVarS, new uot(uodVar.b, toxVarS, i, iE), new unu(null, uodVar.k), new rhj(executor, aaauVar), executor, uodVar.f, new uof(uodVar.d, abglVar));
            uodVar.c(toxVar, umxVar);
        }
        ufs ufsVarD = txgVar.b.d(toxVar, ukr.a, umxVar, txfVar, false);
        ufsVarD.D(txg.a);
        ufsVarD.K = zC;
        txgVar.d.e(ufsVarD);
        nzj nzjVar = new nzj(ufsVarD, umxVar, txfVar);
        nzjVar.g(1.0f);
        aacvVar.e = nzjVar;
        aacvVar.b();
        aacvVar.a();
        return aacvVar;
    }

    final synchronized int j() {
        int i;
        i = this.l;
        if (i == 2147483644) {
            this.l = Integer.MIN_VALUE;
        } else {
            this.l = i + 1;
        }
        return i;
    }

    public final void k() {
        aabi aabiVar;
        aaci aaciVar;
        synchronized (this) {
            aabiVar = this.n;
            aaciVar = this.m;
        }
        if (aabiVar == null || !aabiVar.d()) {
            return;
        }
        m(aabiVar, aaciVar);
    }

    public final void l() {
        this.h = true;
    }

    public final void m(aabi aabiVar, aaci aaciVar) {
        zkt.n(aaciVar, "markerRenderer");
        zrt zrtVar = zrt.a;
        zrtVar.a();
        if (zrn.e("InfoWindowRendererV3", 3)) {
            Log.d("InfoWindowRendererV3", "hideInfoWindow");
        }
        aabiVar.b();
        zwv zwvVar = aabiVar.a;
        zwvVar.b.g(zwvVar);
        aack aackVar = (aack) aaciVar;
        zkt.g(aackVar.h, "marker is not added.");
        zrtVar.a();
        if (zrn.e("MarkerRendererV3", 3)) {
            Log.d("MarkerRendererV3", "deselect");
        }
        if (aackVar.i) {
            aackVar.i = false;
            aackVar.l();
        }
        synchronized (this) {
            if (this.n == aabiVar) {
                this.n = null;
                this.m = null;
            } else {
                zrn.a(5, "closing unexpected info window", new Object[0]);
            }
        }
    }

    public final void n(aabi aabiVar) {
        View view = this.c;
        int width = view.getWidth();
        int height = view.getHeight();
        zrt.a.a();
        if (zrn.e("InfoWindowRendererV3", 3)) {
            Log.d("InfoWindowRendererV3", "refreshInfoWindow");
        }
        aabiVar.b();
        aabiVar.a(width, height);
        aabiVar.c();
    }

    public final synchronized boolean o(aabi aabiVar) {
        if (aabiVar == this.n) {
            if (aabiVar.d()) {
                return true;
            }
        }
        return false;
    }
}
