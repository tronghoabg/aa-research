package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class hkm implements afec {
    final /* synthetic */ hks a;
    final /* synthetic */ doj b;
    final /* synthetic */ afeh c;
    final /* synthetic */ doj d;

    public hkm(hks hksVar, doj dojVar, afeh afehVar, doj dojVar2) {
        this.a = hksVar;
        this.b = dojVar;
        this.c = afehVar;
        this.d = dojVar2;
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        doi doiVar = (doi) obj;
        doiVar.getClass();
        hks hksVar = this.a;
        doiVar.i.k(hksVar.c ? this.b.g : this.c != null ? this.d.g : doiVar.c.d, BitmapDescriptorFactory.HUE_RED);
        sx sxVar = doiVar.f;
        doj dojVar = doiVar.c;
        sxVar.j(dojVar.c, BitmapDescriptorFactory.HUE_RED);
        doiVar.h.j(dojVar.f, BitmapDescriptorFactory.HUE_RED);
        doiVar.j.k(dojVar.g, BitmapDescriptorFactory.HUE_RED);
        boolean z = hksVar.d;
        doiVar.b(z ? new ncp("spread") : new ncp("preferWrap"));
        doiVar.c(new ncp("spread"));
        if (!z) {
            doiVar.a(BitmapDescriptorFactory.HUE_RED);
        }
        return afak.a;
    }
}
