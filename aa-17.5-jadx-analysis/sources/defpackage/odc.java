package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class odc extends cfx implements cwl, cwc, cio, cys, chu {
    public static final yph a = yph.c("GH.Tooltip.Anchor");
    public asf b;
    public cst c;
    public final List d = new ArrayList();
    public final oda e = new oda(this);
    public nok f;
    private boolean g;

    public odc(nok nokVar, asf asfVar) {
        this.f = nokVar;
        this.b = asfVar;
    }

    @Override // defpackage.cys
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.cys
    public final /* synthetic */ long eq() {
        return ty.c(0, 0, 0, 0);
    }

    @Override // defpackage.cfx
    public final void er() {
        ((byw) this.f.a).n(this);
        ahnc.d(N(), null, 0, new beo(this, (afck) null, 11), 3);
    }

    @Override // defpackage.cwl
    public final void es(cst cstVar) {
        this.c = cstVar;
        List list = this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list.clear();
    }

    @Override // defpackage.chu
    public final void eu(cis cisVar) {
        ocq ocqVar = this.e.a;
        if (ocqVar != null && this.g && !cisVar.a()) {
            a.l().u("Dismissing tooltip due to losing focus");
            mcd.C(ocqVar, yzy.lO);
            ocqVar.a();
        }
        this.g = cisVar.a();
    }

    @Override // defpackage.cfx
    public final void q() {
        ((byw) this.f.a).m(this);
        ocq ocqVar = this.e.a;
        if (ocqVar != null) {
            mcd.C(ocqVar, yzy.lK);
            ocqVar.a();
        }
    }

    @Override // defpackage.cys
    public final void s(cql cqlVar, cqm cqmVar, long j) {
        ocq ocqVar = this.e.a;
        if (ocqVar == null || !a.Y(cqlVar.e, 1)) {
            return;
        }
        a.l().u("Dismissing tooltip due to click on anchor");
        mcd.C(ocqVar, yzy.lL);
        ocqVar.a();
    }

    @Override // defpackage.cys
    public final /* synthetic */ void E() {
    }

    @Override // defpackage.cys
    public final void o() {
    }

    @Override // defpackage.cfx
    /* renamed from: p */
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.cys
    public final /* synthetic */ void t() {
    }
}
