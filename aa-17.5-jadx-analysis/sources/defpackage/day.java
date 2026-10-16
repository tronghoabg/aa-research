package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.projection.gearhead.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class day {
    private final Configuration A;
    private final bwq B;
    private Handler C;
    private final dax D;
    private kwp E;
    public final View a;
    public boolean b;
    public boolean c;
    public List d;
    public final czl e;
    public final bwq f;
    public final dak g;
    public final cxd h;
    public final dbp i;
    public int j;
    public boolean k;
    public final afdr l;
    public boolean m;
    public dbz n;
    public final dao o;
    public final kgx p;
    public final kwp q;
    public final lds r;
    public final kwp s;
    public final kwp t;
    public final kwp u;
    private boolean v;
    private bvb w;
    private eqa x;
    private fbg y;
    private eru z;

    public /* synthetic */ day(day dayVar, View view, bvb bvbVar, eqa eqaVar, fbg fbgVar, eru eruVar) {
        kwp kwpVar;
        Configuration configuration;
        bwq parcelableSnapshotMutableState;
        kwp kwpVar2;
        kwp kwpVarJ;
        czl czlVar;
        kwp kwpVar3;
        dao daoVar;
        bwq parcelableSnapshotMutableState2;
        dak dakVar;
        View view2;
        boolean zF = affa.f((dayVar == null || (view2 = dayVar.a) == null) ? null : view2.getContext(), view.getContext());
        this.a = view;
        this.w = bvbVar;
        this.x = eqaVar;
        this.y = fbgVar;
        this.z = eruVar;
        if (zF) {
            dayVar.getClass();
            kwpVar = dayVar.q;
        } else {
            kwpVar = new kwp((byte[]) null, (char[]) null);
        }
        this.q = kwpVar;
        this.r = dayVar != null ? dayVar.r : new lds((byte[]) null, (byte[]) null, (byte[]) null);
        if (zF) {
            dayVar.getClass();
            configuration = dayVar.A;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.A = configuration;
        if (zF) {
            dayVar.getClass();
            parcelableSnapshotMutableState = dayVar.B;
        } else {
            parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(new Configuration(configuration), bxp.c);
        }
        this.B = parcelableSnapshotMutableState;
        if (zF) {
            dayVar.getClass();
            kwpVar2 = dayVar.t;
        } else {
            kwpVar2 = new kwp(view.getContext(), (byte[]) null, (byte[]) null);
        }
        this.t = kwpVar2;
        if (zF) {
            dayVar.getClass();
            kwpVarJ = dayVar.j();
        } else {
            kwpVarJ = null;
        }
        this.E = kwpVarJ;
        if (zF) {
            dayVar.getClass();
            czlVar = dayVar.e;
        } else {
            czlVar = new czl(view.getContext());
        }
        this.e = czlVar;
        if (zF) {
            dayVar.getClass();
            kwpVar3 = dayVar.s;
        } else {
            kwpVar3 = new kwp(czlVar, (byte[]) null);
        }
        this.s = kwpVar3;
        if (zF) {
            dayVar.getClass();
            daoVar = dayVar.o;
        } else {
            view.getContext();
            daoVar = new dao();
        }
        this.o = daoVar;
        if (zF) {
            dayVar.getClass();
            parcelableSnapshotMutableState2 = dayVar.f;
        } else {
            parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(dao.m(view.getContext()), bxp.a);
        }
        this.f = parcelableSnapshotMutableState2;
        this.u = view == (dayVar != null ? dayVar.a : null) ? dayVar.u : new kwp(view, (byte[]) null);
        if (zF) {
            dayVar.getClass();
            dakVar = dayVar.g;
        } else {
            dakVar = new dak(ViewConfiguration.get(view.getContext()));
        }
        this.g = dakVar;
        this.h = dayVar != null ? dayVar.h : new cxd(new cmb());
        this.i = new dbp();
        this.p = dayVar != null ? dayVar.p : new kgx((char[]) null);
        this.l = new bxh(this, 19);
        this.D = new dax(this);
    }

    private final void k() {
        if (this.v) {
            return;
        }
        this.v = true;
        if (this.w == null) {
            View view = this.a;
            bvb bvbVarB = dco.b(view);
            if (bvbVarB == null) {
                bvbVarB = dco.d(view);
            }
            this.w = bvbVarB;
        }
        if (this.x == null) {
            eqa eqaVarD = ecw.d(this.a);
            if (eqaVarD == null) {
                throw new IllegalStateException("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            this.x = eqaVarD;
        }
        if (this.y == null) {
            fbg fbgVarJ = ebi.j(this.a);
            if (fbgVarJ == null) {
                throw new IllegalStateException("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
            }
            this.y = fbgVarJ;
        }
        if (this.z == null) {
            this.z = eee.j(this.a);
        }
    }

    public final bvb a() {
        k();
        bvb bvbVar = this.w;
        bvbVar.getClass();
        return bvbVar;
    }

    public final eqa b() {
        k();
        eqa eqaVar = this.x;
        eqaVar.getClass();
        return eqaVar;
    }

    public final eru c() {
        k();
        return this.z;
    }

    public final fbg d() {
        k();
        fbg fbgVar = this.y;
        fbgVar.getClass();
        return fbgVar;
    }

    public final void e(czq czqVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(123858079);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(czqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(this) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            Object tag = czqVar.getTag(R.id.inspection_slot_table_set);
            byte[] bArr = null;
            Set set = affz.f(tag) ? (Set) tag : null;
            if (set == null) {
                Object parent = czqVar.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = affz.f(tag2) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(buxVarC.e());
                bvv bvvVar = (bvv) buxVarC;
                bvvVar.f = true;
                bvvVar.k = true;
                bvvVar.c.b();
                bvvVar.n.b();
                bzj bzjVar = bvvVar.o;
                bzg bzgVar = bzjVar.a;
                bzjVar.e = bzgVar.i;
                bzjVar.s = bzgVar.j;
            }
            buxVarC.v(480629184);
            bxe[] bxeVarArr = new bxe[13];
            bxeVarArr[0] = erz.a.b(b());
            bxeVarArr[1] = fbi.a.b(d());
            bxeVarArr[2] = daa.d.b(this.q);
            bxeVarArr[3] = daa.e.b(this.r);
            bvf bvfVar = dbc.p;
            boolean zE = buxVarC.E(this);
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            if (zE || objS == buw.a) {
                objS = new cep(this, 19);
                bvvVar2.ad(objS);
            }
            bxeVarArr[4] = new bxe(bvfVar, null, false, null, (afec) objS, false);
            bxeVarArr[5] = daa.b.b(czqVar.getContext());
            bxeVarArr[6] = cfi.a.b(set);
            bxeVarArr[7] = daa.a.b(czqVar.M());
            bvf bvfVar2 = cdr.a;
            boolean zE2 = buxVarC.E(czqVar);
            Object objS2 = bvvVar2.S();
            if (zE2 || objS2 == buw.a) {
                objS2 = new cep(czqVar, 20);
                bvvVar2.ad(objS2);
            }
            bxeVarArr[8] = new bxe(bvfVar2, null, false, null, (afec) objS2, false);
            bxeVarArr[9] = daa.f.b(czqVar);
            bvf bvfVar3 = dbc.r;
            boolean zE3 = buxVarC.E(czqVar);
            Object objS3 = bvvVar2.S();
            if (zE3 || objS3 == buw.a) {
                objS3 = new daz(czqVar, i4);
                bvvVar2.ad(objS3);
            }
            bxeVarArr[10] = new bxe(bvfVar3, null, false, null, (afec) objS3, false);
            bxeVarArr[11] = dbc.n.b(czqVar.q());
            bvf bvfVar4 = bwb.a;
            kwp kwpVar = czqVar.ab;
            if (kwpVar == null) {
                kwpVar = new kwp(czqVar, (byte[]) null);
                czqVar.ab = kwpVar;
            }
            bxeVarArr[12] = bvfVar4.b(kwpVar);
            czz.an(bxeVarArr, bxc.i(1509086010, true, new apn(czqVar, afegVar, 15, bArr), buxVarC), buxVarC, 56);
            bvvVar2.Y(false);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new alu(this, czqVar, afegVar, i, 9);
        }
    }

    public final void f() {
        int i = this.j - 1;
        this.j = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.j = 0;
        } else if (i != 0) {
            return;
        }
        View view = this.a;
        dax daxVar = this.D;
        view.getContext().unregisterComponentCallbacks(daxVar);
        this.i.b(null);
        view.getViewTreeObserver().removeOnWindowFocusChangeListener(daxVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(daxVar);
        this.k = false;
        boolean z = this.m;
        Handler handler = this.C;
        if (z) {
            if (handler != null) {
                handler.post(daxVar);
            }
        } else if (handler != null) {
            handler.removeCallbacks(daxVar);
        }
        this.C = null;
    }

    public final void g() {
        int i = this.j + 1;
        this.j = i;
        if (i == 1) {
            View view = this.a;
            dax daxVar = this.D;
            view.getContext().registerComponentCallbacks(daxVar);
            h(view.getResources().getConfiguration());
            dbp dbpVar = this.i;
            dbpVar.c(view.hasWindowFocus());
            afdr afdrVar = this.l;
            dbpVar.b(afdrVar);
            bwq bwqVar = dbpVar.a;
            if (bwqVar != null) {
                bwqVar.b(afdrVar.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(daxVar);
            view.getViewTreeObserver().addOnGlobalLayoutListener(daxVar);
            this.k = false;
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.t.a;
            boolean zIsEnabled = accessibilityManager.isEnabled();
            this.b = zIsEnabled;
            this.c = zIsEnabled && accessibilityManager.isTouchExplorationEnabled();
            Handler handler = view.getHandler();
            this.C = handler;
            if (handler != null) {
                handler.post(daxVar);
            }
        }
    }

    public final void h(Configuration configuration) {
        int iUpdateFrom = this.A.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = ((HashMap) this.q.a).entrySet().iterator();
            while (it.hasNext()) {
                dct dctVar = (dct) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (dctVar == null || Configuration.needNewResources(iUpdateFrom, dctVar.b)) {
                    it.remove();
                }
            }
            this.B.b(new Configuration(configuration));
            this.r.Z();
            if ((268435456 & iUpdateFrom) != 0) {
                this.f.b(dao.m(this.a.getContext()));
            }
            if ((805248384 & iUpdateFrom) != 0) {
                if (Build.VERSION.SDK_INT < 33) {
                    this.k = true;
                    return;
                }
                dbp dbpVar = this.i;
                afdr afdrVar = this.l;
                bwq bwqVar = dbpVar.a;
                if (bwqVar != null) {
                    bwqVar.b(afdrVar.invoke());
                }
            }
        }
    }

    public final void i() {
        this.d = null;
    }

    public final kwp j() {
        kwp kwpVar = this.E;
        if (kwpVar != null) {
            return kwpVar;
        }
        kwp kwpVar2 = new kwp(this.a.getContext(), (byte[]) null);
        this.E = kwpVar2;
        return kwpVar2;
    }
}
