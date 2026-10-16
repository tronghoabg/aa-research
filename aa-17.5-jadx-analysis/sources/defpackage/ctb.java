package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class ctb implements cvd, cts {
    final /* synthetic */ ctl a;
    private final /* synthetic */ cte b;

    public ctb(ctl ctlVar) {
        this.a = ctlVar;
        this.b = ctlVar.f;
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.b.b;
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.b.c;
    }

    @Override // defpackage.dlg
    public final float eA(float f) {
        return f * this.b.b;
    }

    @Override // defpackage.dlg
    public final int eE(long j) {
        return Math.round(dlf.k(this.b, j));
    }

    @Override // defpackage.dlg
    public final int eF(float f) {
        return dlf.l(this.b, f);
    }

    @Override // defpackage.dlg
    public final long eG(long j) {
        return dlf.m(this.b, j);
    }

    @Override // defpackage.dlg
    public final long eH(long j) {
        return dlf.n(this.b, j);
    }

    @Override // defpackage.dlm
    public final long eI(float f) {
        return dln.d(this.b, f);
    }

    @Override // defpackage.dlg
    public final long eJ(float f) {
        cte cteVar = this.b;
        return dln.d(cteVar, (f / cteVar.b) + BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.cts
    public final ctq eK(int i, int i2, Map map, afec afecVar) {
        return this.b.eL(i, i2, map, null, afecVar);
    }

    @Override // defpackage.cts
    public final ctq eL(int i, int i2, Map map, afec afecVar, afec afecVar2) {
        return this.b.eL(i, i2, map, afecVar, afecVar2);
    }

    @Override // defpackage.csq
    public final boolean eM() {
        return this.b.eM();
    }

    @Override // defpackage.dlm
    public final float ew(long j) {
        return dln.c(this.b, j);
    }

    @Override // defpackage.dlg
    public final float ex(float f) {
        return (f / this.b.b) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final float ey(int i) {
        return (i / this.b.b) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final float ez(long j) {
        return dlf.k(this.b, j);
    }

    @Override // defpackage.csq
    public final dlr p() {
        return this.b.a;
    }

    @Override // defpackage.cvd
    public final List r(Object obj, afeg afegVar) {
        ctl ctlVar = this.a;
        aan aanVar = ctlVar.m;
        cxb cxbVar = (cxb) aanVar.a(obj);
        if (cxbVar != null && ctlVar.a.x().indexOf(cxbVar) < ctlVar.d) {
            return cxbVar.u();
        }
        byw bywVar = ctlVar.h;
        if (bywVar.b < ctlVar.e) {
            crt.b("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        cxb cxbVar2 = (cxb) aanVar.a(obj);
        int i = bywVar.b;
        int i2 = ctlVar.e;
        if (i == i2) {
            bywVar.n(obj);
        } else {
            bywVar.d(i2, obj);
        }
        ctlVar.e++;
        aan aanVar2 = ctlVar.n;
        boolean zF = aan.f(aanVar2, obj);
        if (zF || cxbVar2 != null) {
            if (!zF) {
                cxb cxbVar3 = ctlVar.a;
                ctlVar.o(cxbVar3.x().indexOf(cxbVar2), cxbVar3.x().size());
                ctlVar.j++;
                aanVar.i(obj);
                aanVar2.m(obj, cxbVar2);
                ctlVar.o.m(obj, ctlVar.a(obj));
                if (cxbVar3.am()) {
                    ctlVar.k();
                }
            }
            cxb cxbVar4 = (cxb) aanVar2.a(obj);
            ctc ctcVar = cxbVar4 != null ? (ctc) ctlVar.l.a(cxbVar4) : null;
            if (ctcVar != null && ctcVar.c) {
                ctlVar.n(cxbVar4, obj, false, afegVar);
            }
            if ((ctcVar != null ? ctcVar.h : null) != null) {
                ctlVar.f(ctcVar, true);
            }
        } else {
            ctlVar.m(obj, afegVar, false);
            ctlVar.o.m(obj, ctlVar.a(obj));
        }
        cxb cxbVar5 = (cxb) aanVar2.a(obj);
        if (cxbVar5 == null) {
            return afbe.a;
        }
        List listR = cxbVar5.o().r();
        int size = listR.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((cxq) listR.get(i3)).f.b = true;
        }
        return listR;
    }
}
