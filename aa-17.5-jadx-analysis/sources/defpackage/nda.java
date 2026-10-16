package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class nda implements afec {
    final /* synthetic */ boolean a;
    final /* synthetic */ afeh b;
    final /* synthetic */ doj c;

    public nda(boolean z, afeh afehVar, doj dojVar) {
        this.a = z;
        this.b = afehVar;
        this.c = dojVar;
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        doi doiVar = (doi) obj;
        doiVar.getClass();
        doj dojVar = doiVar.c;
        doiVar.e.j(dojVar.b, BitmapDescriptorFactory.HUE_RED);
        if (!this.a || this.b == null) {
            doiVar.g.j(dojVar.e, BitmapDescriptorFactory.HUE_RED);
        } else {
            sx sxVar = doiVar.g;
            doj dojVar2 = this.c;
            sxVar.j(dojVar2.b, gjk.d.k);
        }
        doiVar.j.k(dojVar.g, BitmapDescriptorFactory.HUE_RED);
        doiVar.c(new ncp("spread"));
        return afak.a;
    }
}
