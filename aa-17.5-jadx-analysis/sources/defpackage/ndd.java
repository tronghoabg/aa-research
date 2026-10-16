package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class ndd implements afec {
    final /* synthetic */ boolean a;
    final /* synthetic */ bwq b;
    final /* synthetic */ boolean c;
    final /* synthetic */ doj d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;
    final /* synthetic */ afeh g;
    final /* synthetic */ doj h;
    final /* synthetic */ doj i;
    final /* synthetic */ boolean j;
    final /* synthetic */ boolean k;
    final /* synthetic */ doj l;

    public ndd(boolean z, bwq bwqVar, boolean z2, doj dojVar, boolean z3, boolean z4, afeh afehVar, doj dojVar2, doj dojVar3, boolean z5, boolean z6, doj dojVar4) {
        this.a = z;
        this.b = bwqVar;
        this.c = z2;
        this.d = dojVar;
        this.e = z3;
        this.f = z4;
        this.g = afehVar;
        this.h = dojVar2;
        this.i = dojVar3;
        this.j = z5;
        this.k = z6;
        this.l = dojVar4;
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        float f;
        ncp ncpVar;
        boolean z;
        doi doiVar = (doi) obj;
        doiVar.getClass();
        doj dojVar = doiVar.c;
        doiVar.i.k(dojVar.d, BitmapDescriptorFactory.HUE_RED);
        boolean z2 = this.a;
        if (z2 && ((Boolean) this.b.a()).booleanValue() && !this.c) {
            doiVar.e.j(this.d.e, gjk.c.k);
        } else {
            doiVar.e.j(dojVar.b, (!((Boolean) this.b.a()).booleanValue() || this.e) ? 0.0f : gjk.d.k);
        }
        boolean z3 = this.f;
        if (z3 && this.g != null) {
            doiVar.g.j(this.h.b, gjk.d.k);
        } else if (!z2 || ((Boolean) this.b.a()).booleanValue()) {
            doiVar.g.j(((Boolean) this.b.a()).booleanValue() ? dojVar.e : this.i.b, ((!this.j || this.e) && this.k) ? gjk.d.k : 0.0f);
        } else {
            doiVar.g.j(this.d.b, gjk.c.k);
        }
        sx sxVar = doiVar.j;
        doj dojVar2 = this.l;
        boolean z4 = this.c;
        if (z4) {
            f = gjk.d.k;
        } else {
            float f2 = mvz.a;
            f = mvz.a;
        }
        sxVar.k(dojVar2.d, f);
        doiVar.c(new ncp("spread"));
        if (z4) {
            ncpVar = new ncp("wrap");
            z = z3;
        } else if (z3) {
            z3 = true;
            ncpVar = new ncp("wrap");
            z = z3;
        } else {
            ncpVar = new ncp("spread");
            z = false;
        }
        doiVar.b(ncpVar);
        if (z4) {
            doiVar.a(1.0f);
        } else if (z) {
            doiVar.a(BitmapDescriptorFactory.HUE_RED);
        }
        return afak.a;
    }
}
