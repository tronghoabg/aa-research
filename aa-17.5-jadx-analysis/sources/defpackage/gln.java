package defpackage;

import android.view.View;
import com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton;
import com.google.android.apps.auto.components.ui.media.PlayPauseStopCoolwalkButton;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class gln implements afec {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public gln(afec afecVar, glp glpVar, aitf aitfVar, int i) {
        this.d = i;
        this.a = afecVar;
        this.b = glpVar;
        this.c = aitfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [cwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aitf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v41, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        float fMax;
        int i = this.d;
        float f = BitmapDescriptorFactory.HUE_RED;
        switch (i) {
            case 0:
                glf glfVar = (glf) obj;
                glfVar.getClass();
                ?? r2 = this.c;
                glp glpVar = (glp) this.b;
                this.a.invoke(new glm(glfVar, r2, glpVar.b, glpVar.a, glpVar.c, glpVar.d));
                break;
            case 1:
                cyz cyzVar = (cyz) obj;
                cgu cguVar = (cgu) cyzVar;
                if (!((czq) bzi.s(this.a)).k.b.contains(cguVar) || !xb.d(cguVar, cdj.l((sm) this.b))) {
                    break;
                } else {
                    ((affv) this.c).a = cyzVar;
                    break;
                }
                break;
            case 2:
                ((dot) this.b).c((cun) obj, this.a, this.c);
                break;
            case 3:
                doi doiVar = (doi) obj;
                doiVar.getClass();
                doj dojVar = doiVar.c;
                doiVar.e.j(dojVar.b, BitmapDescriptorFactory.HUE_RED);
                doiVar.g.j(dojVar.e, BitmapDescriptorFactory.HUE_RED);
                if (this.c == null) {
                    sx sxVar = doiVar.i;
                    Object obj2 = this.a;
                    float f2 = gjk.c.k;
                    sxVar.k(((doj) obj2).g, f2);
                    doiVar.j.k(((doj) this.b).d, f2);
                } else {
                    doiVar.i.k(dojVar.d, BitmapDescriptorFactory.HUE_RED);
                    doiVar.j.k(dojVar.g, BitmapDescriptorFactory.HUE_RED);
                }
                doiVar.c(new ncp("spread"));
                doiVar.b(new ncp("spread"));
                break;
            case 4:
                doi doiVar2 = (doi) obj;
                doiVar2.getClass();
                doj dojVar2 = doiVar2.c;
                doiVar2.e.j(dojVar2.b, BitmapDescriptorFactory.HUE_RED);
                doiVar2.g.j(dojVar2.e, BitmapDescriptorFactory.HUE_RED);
                if (this.c == null) {
                    sx sxVar2 = doiVar2.i;
                    Object obj3 = this.a;
                    float f3 = gjk.c.k;
                    sxVar2.k((dok) obj3, f3);
                    doiVar2.j.k((dok) this.b, f3);
                } else {
                    doiVar2.i.k(dojVar2.d, BitmapDescriptorFactory.HUE_RED);
                    doiVar2.j.k(dojVar2.g, BitmapDescriptorFactory.HUE_RED);
                }
                doiVar2.c(new ncp("spread"));
                doiVar2.b(new ncp("spread"));
                break;
            case 5:
                ((dot) this.b).c((cun) obj, this.a, this.c);
                break;
            case 6:
                ((dot) this.b).c((cun) obj, this.a, this.c);
                break;
            case 7:
                ((dot) this.b).c((cun) obj, this.a, this.c);
                break;
            case 8:
                ((dot) this.b).c((cun) obj, this.a, this.c);
                break;
            case 9:
                ((dot) this.b).c((cun) obj, this.a, this.c);
                break;
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj4 = this.a;
                if (zBooleanValue) {
                    fMax = ((PlayPauseStopCoolwalkButton) obj4).getResources().getDimensionPixelSize(R.dimen.dashboard_media_rounded_corners);
                } else {
                    PlayPauseStopCoolwalkButton playPauseStopCoolwalkButton = (PlayPauseStopCoolwalkButton) obj4;
                    fMax = Math.max(playPauseStopCoolwalkButton.getHeight(), playPauseStopCoolwalkButton.getWidth()) / 2.0f;
                }
                if (((affq) this.c).a) {
                    Object obj5 = this.a;
                    omq omqVar = omq.a;
                    View view = (View) obj5;
                    Object tag = view.getTag(R.id.spring_animation);
                    emp empVar = tag instanceof emp ? (emp) tag : null;
                    if (empVar == null) {
                        empVar = new emp(obj5, omqVar, fMax);
                        view.setTag(R.id.spring_animation, empVar);
                    }
                    empVar.s.c(1.0f);
                    empVar.k(fMax);
                } else {
                    omq.c((CoolwalkButton) this.b, fMax);
                }
                break;
            case 11:
                ((dot) this.b).c((cun) obj, this.a, this.c);
                break;
            case 12:
                doi doiVar3 = (doi) obj;
                doiVar3.getClass();
                doiVar3.i.k(doiVar3.c.d, BitmapDescriptorFactory.HUE_RED);
                bym bymVar = ((mwa) this.c).e;
                if (((Boolean) bymVar.a()).booleanValue()) {
                    f = gjk.a.k;
                }
                doiVar3.g.j(((doj) this.a).b, f);
                ?? r7 = this.b;
                aezr aezrVar = ndj.a;
                doiVar3.d.setValue(doiVar3, doi.a[2], ((Number) r7.a()).intValue() < 2 ? dov.c : ((Boolean) bymVar.a()).booleanValue() ? dov.b : dov.a);
                break;
            case 13:
                ((dot) this.b).c((cun) obj, this.a, this.c);
                break;
            case 14:
                ((dot) this.b).c((cun) obj, this.a, this.c);
                break;
            default:
                ((dot) this.b).c((cun) obj, this.a, this.c);
                break;
        }
        return afak.a;
    }

    public gln(dot dotVar, List list, Map map, int i) {
        this.d = i;
        this.b = dotVar;
        this.a = list;
        this.c = map;
    }

    public gln(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public gln(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }
}
