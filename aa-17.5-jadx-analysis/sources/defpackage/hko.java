package defpackage;

import com.android.car.libraries.apphost.external.model.GridWrapperTemplate;
import com.android.car.libraries.apphost.external.model.WebViewTemplate;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hko implements afec {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hko(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v22, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, wb] */
    /* JADX WARN: Type inference failed for: r4v28, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, wb] */
    /* JADX WARN: Type inference failed for: r4v34, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v43, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v47, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v52, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v57, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v64, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v69, types: [bym, java.lang.Object] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                giz gizVar = (giz) obj;
                gizVar.getClass();
                return Boolean.valueOf(gizVar.ordinal() != 2 ? false : ((cil) this.a).a(7));
            case 1:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cieVar.g(new gyv(this.a, 20));
                return afak.a;
            case 2:
                dou.a((dec) obj, (dot) this.a);
                return afak.a;
            case 3:
                dou.a((dec) obj, (dot) this.a);
                return afak.a;
            case 4:
                doi doiVar = (doi) obj;
                doiVar.getClass();
                doj dojVar = doiVar.c;
                doiVar.e.j(dojVar.b, BitmapDescriptorFactory.HUE_RED);
                doiVar.i.k(((doj) this.a).g, gjk.b.k);
                doiVar.j.k(dojVar.g, BitmapDescriptorFactory.HUE_RED);
                doiVar.b(new ncp("spread"));
                return afak.a;
            case 5:
                wb wbVar = (wb) obj;
                if (wbVar != null) {
                    return this.a.invoke((WebViewTemplate) wbVar);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.external.model.WebViewTemplate");
            case 6:
                Map map = ghs.a;
                return ghs.a(this.a.invoke((wb) obj));
            case 7:
                wb wbVar2 = (wb) obj;
                if (wbVar2 != null) {
                    return this.a.invoke((MinimizedStateNavigationTemplate) wbVar2);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate");
            case 8:
                Map map2 = ghs.a;
                return ghs.a(this.a.invoke((wb) obj));
            case 9:
                wb wbVar3 = (wb) obj;
                if (wbVar3 != null) {
                    return this.a.invoke((MinimizedStateMapBasedTemplate) wbVar3);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate");
            case 10:
                return new ghr(true, ((Boolean) this.a.invoke((wb) obj)).booleanValue());
            case 11:
                wb wbVar4 = (wb) obj;
                if (wbVar4 != null) {
                    return this.a.invoke((GridWrapperTemplate) wbVar4);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.android.car.libraries.apphost.external.model.GridWrapperTemplate");
            case 12:
                afdr afdrVar = (afdr) this.a.a();
                if (afdrVar != null) {
                    afdrVar.invoke();
                }
                return afak.a;
            case 13:
                this.a.b(Boolean.valueOf(((cis) obj).a()));
                return afak.a;
            case 14:
                dou.a((dec) obj, (dot) this.a);
                return afak.a;
            case 15:
                this.a.b(Boolean.valueOf(((cis) obj).a()));
                return afak.a;
            case 16:
                dou.a((dec) obj, (dot) this.a);
                return afak.a;
            case 17:
                doi doiVar2 = (doi) obj;
                doiVar2.getClass();
                doj dojVar2 = doiVar2.c;
                doiVar2.i.k(dojVar2.d, BitmapDescriptorFactory.HUE_RED);
                if (((Boolean) this.a.a()).booleanValue()) {
                    doiVar2.e.j(dojVar2.b, BitmapDescriptorFactory.HUE_RED);
                } else {
                    doiVar2.g.j(dojVar2.e, BitmapDescriptorFactory.HUE_RED);
                }
                return afak.a;
            case 18:
                this.a.b(Boolean.valueOf(((cis) obj).a()));
                return afak.a;
            case 19:
                dou.a((dec) obj, (dot) this.a);
                return afak.a;
            default:
                afdr afdrVar2 = (afdr) this.a.a();
                if (afdrVar2 != null) {
                    afdrVar2.invoke();
                }
                return afak.a;
        }
    }
}
