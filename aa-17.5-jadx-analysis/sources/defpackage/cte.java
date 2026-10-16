package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class cte implements cvd {
    public dlr a = dlr.b;
    public float b;
    public float c;
    final /* synthetic */ ctl d;

    public cte(ctl ctlVar) {
        this.d = ctlVar;
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.b;
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.c;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float eA(float f) {
        return f * this.b;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eE(long j) {
        return Math.round(dlf.k(this, j));
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eF(float f) {
        return dlf.l(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eG(long j) {
        return dlf.m(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eH(long j) {
        return dlf.n(this, j);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ long eI(float f) {
        return dln.d(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eJ(float f) {
        return dln.d(this, (f / this.b) + BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.cts
    public final /* synthetic */ ctq eK(int i, int i2, Map map, afec afecVar) {
        return eL(i, i2, map, null, afecVar);
    }

    @Override // defpackage.cts
    public final ctq eL(int i, int i2, Map map, afec afecVar, afec afecVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            crt.c(a.bB(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new ctd(i, i2, map, afecVar, this, this.d, afecVar2);
    }

    @Override // defpackage.csq
    public final boolean eM() {
        cxb cxbVar = this.d.a;
        return cxbVar.av() == 4 || cxbVar.av() == 2;
    }

    @Override // defpackage.dlm
    public final /* synthetic */ float ew(long j) {
        return dln.c(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ex(float f) {
        return (f / this.b) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ey(int i) {
        return (i / this.b) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ez(long j) {
        return dlf.k(this, j);
    }

    @Override // defpackage.csq
    public final dlr p() {
        return this.a;
    }

    @Override // defpackage.cvd
    public final List r(Object obj, afeg afegVar) {
        ctl ctlVar = this.d;
        ctlVar.k();
        cxb cxbVar = ctlVar.a;
        int iAv = cxbVar.av();
        if (iAv != 1 && iAv != 3 && iAv != 2 && iAv != 4) {
            crt.c("subcompose can only be used inside the measure or layout blocks");
        }
        aan aanVar = ctlVar.m;
        Object objA = aanVar.a(obj);
        if (objA == null) {
            objA = (cxb) ctlVar.n.i(obj);
            if (objA != null) {
                if (ctlVar.j <= 0) {
                    crt.c("Check failed.");
                }
                ctlVar.j--;
            } else {
                objA = ctlVar.e(obj);
                if (objA == null) {
                    objA = ctlVar.d(ctlVar.d);
                }
            }
            aanVar.m(obj, objA);
        }
        cxb cxbVar2 = (cxb) objA;
        if (woy.bI(cxbVar.x(), ctlVar.d) != cxbVar2) {
            int iIndexOf = cxbVar.x().indexOf(cxbVar2);
            if (iIndexOf < ctlVar.d) {
                crt.b(a.bm(obj, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
            }
            int i = ctlVar.d;
            if (i != iIndexOf) {
                ctlVar.o(iIndexOf, i);
            }
        }
        ctlVar.d++;
        ctlVar.n(cxbVar2, obj, false, afegVar);
        return (iAv == 1 || iAv == 3) ? cxbVar2.u() : cxbVar2.t();
    }
}
