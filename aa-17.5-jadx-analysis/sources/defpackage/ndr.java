package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ndr implements afec {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ndr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.b;
        if (i == 0) {
            dou.a((dec) obj, (dot) this.a);
            return afak.a;
        }
        if (i == 1) {
            this.a.b(Boolean.valueOf(((cis) obj).a()));
            return afak.a;
        }
        if (i != 2) {
            if (i != 3) {
                dou.a((dec) obj, (dot) this.a);
                return afak.a;
            }
            this.a.b(Boolean.valueOf(((cis) obj).a()));
            return afak.a;
        }
        doi doiVar = (doi) obj;
        doiVar.getClass();
        doj dojVar = doiVar.c;
        doiVar.i.k(dojVar.d, BitmapDescriptorFactory.HUE_RED);
        doiVar.e.j(dojVar.b, BitmapDescriptorFactory.HUE_RED);
        doiVar.g.j(dojVar.e, BitmapDescriptorFactory.HUE_RED);
        float f = mvz.a;
        doiVar.j.k(((doj) this.a).d, mvz.a);
        doiVar.c(new ncp("spread"));
        doiVar.b(new ncp("spread"));
        return afak.a;
    }
}
