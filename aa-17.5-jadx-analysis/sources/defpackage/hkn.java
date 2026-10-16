package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class hkn implements afec {
    private final /* synthetic */ int e;
    public static final hkn d = new hkn(3);
    public static final hkn c = new hkn(2);
    public static final hkn b = new hkn(1);
    public static final hkn a = new hkn(0);

    public hkn(int i) {
        this.e = i;
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.e;
        if (i == 0) {
            doi doiVar = (doi) obj;
            doiVar.getClass();
            float f = gjk.d.k;
            doj dojVar = doiVar.c;
            doiVar.h.j(dojVar.f, f);
            doiVar.j.k(dojVar.g, f);
            doiVar.b(new ncp("wrap"));
            doiVar.c(new ncp("wrap"));
            return afak.a;
        }
        if (i == 1) {
            cie cieVar = (cie) obj;
            cieVar.getClass();
            cieVar.g(ebq.u);
            return afak.a;
        }
        if (i != 2) {
            return new ghr(false, false);
        }
        doi doiVar2 = (doi) obj;
        doiVar2.getClass();
        doj dojVar2 = doiVar2.c;
        doiVar2.e.j(dojVar2.b, BitmapDescriptorFactory.HUE_RED);
        doiVar2.i.k(dojVar2.d, BitmapDescriptorFactory.HUE_RED);
        return afak.a;
    }
}
