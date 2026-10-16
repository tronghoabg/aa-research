package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class hfk implements afec {
    final /* synthetic */ float a;
    final /* synthetic */ doj b;
    final /* synthetic */ afeg c;

    public hfk(float f, doj dojVar, afeg afegVar) {
        this.a = f;
        this.b = dojVar;
        this.c = afegVar;
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        doi doiVar = (doi) obj;
        doiVar.getClass();
        doj dojVar = doiVar.c;
        sx sxVar = doiVar.e;
        float f = -this.a;
        dol dolVar = dojVar.b;
        float f2 = f + BitmapDescriptorFactory.HUE_RED;
        sxVar.j(dolVar, f2);
        doiVar.g.j(dojVar.e, f2);
        dlj dljVar = new dlj(gjk.a.k);
        if (this.c == null) {
            dljVar = null;
        }
        float f3 = dljVar != null ? dljVar.a : f2;
        doiVar.i.k(dojVar.d, f2);
        doiVar.j.k(this.b.d, f3);
        doiVar.c(new ncp("spread"));
        doiVar.b(new ncp("spread"));
        return afak.a;
    }
}
