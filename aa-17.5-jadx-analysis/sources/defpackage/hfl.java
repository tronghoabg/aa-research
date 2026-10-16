package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class hfl implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hfl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v33, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                float f = hft.a;
                return Boolean.valueOf(roc.aF((cil) obj2, (giz) obj));
            case 1:
                doi doiVar = (doi) obj;
                float f2 = hft.a;
                doiVar.getClass();
                doj dojVar = doiVar.c;
                doiVar.j.k(dojVar.g, BitmapDescriptorFactory.HUE_RED);
                doiVar.g.j(dojVar.e, BitmapDescriptorFactory.HUE_RED);
                doiVar.i.k(((doj) this.a).g, BitmapDescriptorFactory.HUE_RED);
                doiVar.c(new ncp("preferWrap"));
                doiVar.b(new ncp("preferWrap"));
                return afak.a;
            case 2:
                Object obj3 = this.a;
                float f3 = hft.a;
                return hdq.c((doj) obj3, (doi) obj);
            case 3:
                Object obj4 = this.a;
                float f4 = hft.a;
                return Boolean.valueOf(roc.aF((cil) obj4, (giz) obj));
            case 4:
                Object obj5 = this.a;
                float f5 = hft.a;
                return hdq.b((doj) obj5, (doi) obj);
            case 5:
                Object obj6 = this.a;
                float f6 = hfz.a;
                return hdq.b((doj) obj6, (doi) obj);
            case 6:
                doi doiVar2 = (doi) obj;
                float f7 = hfz.a;
                doiVar2.getClass();
                doj dojVar2 = doiVar2.c;
                doiVar2.e.j(dojVar2.b, BitmapDescriptorFactory.HUE_RED);
                doiVar2.j.k(dojVar2.g, BitmapDescriptorFactory.HUE_RED);
                doiVar2.i.k(((doj) this.a).g, BitmapDescriptorFactory.HUE_RED);
                doiVar2.c(new ncp("preferWrap"));
                doiVar2.b(new ncp("preferWrap"));
                return afak.a;
            case 7:
                Object obj7 = this.a;
                float f8 = hfz.a;
                return hdq.c((doj) obj7, (doi) obj);
            case 8:
                cst cstVar = (cst) obj;
                cstVar.getClass();
                cjb cjbVarO = crt.j(cstVar).o(cstVar, true);
                this.a.invoke(new Rect(Math.round(cjbVarO.b), Math.round(cjbVarO.c), Math.round(cjbVarO.d), Math.round(cjbVarO.e)));
                return afak.a;
            case 9:
                giz gizVar = (giz) obj;
                gizVar.getClass();
                return Boolean.valueOf(gizVar == giz.d ? ((cil) this.a).a(7) : false);
            case 10:
                return Boolean.valueOf(roc.aF((cil) this.a, (giz) obj));
            case 11:
                return Boolean.valueOf(roc.aL((cil) this.a, (giz) obj));
            case 12:
                return Boolean.valueOf(roc.aM((cil) this.a, (giz) obj));
            case 13:
                dec decVar = (dec) obj;
                decVar.getClass();
                decVar.a(hjv.a, woy.bg(this.a));
                return afak.a;
            case 14:
                return Boolean.valueOf(roc.aM((cil) this.a, (giz) obj));
            case 15:
                return Boolean.valueOf(roc.aL((cil) this.a, (giz) obj));
            case 16:
                return Boolean.valueOf(roc.aL((cil) this.a, (giz) obj));
            case 17:
                return Boolean.valueOf(roc.aM((cil) this.a, (giz) obj));
            case 18:
                return Boolean.valueOf(roc.aM((cil) this.a, (giz) obj));
            case 19:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cieVar.f(new hfl(this.a, 20));
                return afak.a;
            default:
                return roc.aP((cil) this.a, (cho) obj);
        }
    }
}
