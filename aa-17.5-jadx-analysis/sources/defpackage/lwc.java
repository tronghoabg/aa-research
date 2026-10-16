package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.Choreographer;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class lwc implements xyc {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lwc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, xyc] */
    @Override // defpackage.xyc
    public final /* synthetic */ Object gu() {
        uts utpVar;
        uaj uajVar;
        int i = 6;
        int i2 = 4;
        int i3 = 5;
        dst dstVar = null;
        switch (this.b) {
            case 0:
                lwd lwdVar = (lwd) this.a;
                List listG = lwdVar.g();
                listG.size();
                Iterator it = listG.iterator();
                while (true) {
                    String str = lwdVar.b;
                    if (!it.hasNext()) {
                        if (!zF) {
                            ((ype) ((ype) ((ype) lwd.a.h()).l(10, TimeUnit.SECONDS)).ai(4381)).y("No semantic mark-as-read action found for %s", str);
                        }
                        return dstVar;
                    }
                    dst dstVar2 = (dst) it.next();
                    CharSequence charSequence = dstVar2.j;
                    if (dstVar2.e == 2) {
                        if (dstVar2.d) {
                            ((ype) ((ype) ((ype) lwd.a.h()).l(10, TimeUnit.SECONDS)).ai(4383)).M("%s for %s is a semantic mark-as-read action, but getShowsUserInterface() is true", charSequence, str);
                        } else if (dstVar != null) {
                            ((ype) ((ype) ((ype) lwd.a.h()).l(10, TimeUnit.SECONDS)).ai(4382)).R("Ignoring secondary mark-as-read action for %s with title %s (keeping %s)", str, charSequence, dstVar.j);
                            lwdVar.h(yzy.lX);
                        } else {
                            dstVar = dstVar2;
                        }
                        zF = true;
                    }
                }
            case 1:
                lwd lwdVar2 = (lwd) this.a;
                List listG2 = lwdVar2.g();
                listG2.size();
                Iterator it2 = listG2.iterator();
                while (true) {
                    String str2 = lwdVar2.b;
                    if (!it2.hasNext()) {
                        if (!zF) {
                            ((ype) ((ype) ((ype) lwd.a.h()).l(10, TimeUnit.SECONDS)).ai(4386)).y("No semantic reply action found for %s", str2);
                        }
                        return dstVar;
                    }
                    dst dstVar3 = (dst) it2.next();
                    CharSequence charSequence2 = dstVar3.j;
                    if (dstVar3.e == 1) {
                        if (dstVar3.d) {
                            ((ype) ((ype) ((ype) lwd.a.h()).l(10, TimeUnit.SECONDS)).ai(4389)).M("%s for %s is a semantic reply action, but getShowsUserInterface() is true", charSequence2, str2);
                        } else {
                            dum[] dumVarArr = dstVar3.b;
                            if (dumVarArr == null || dumVarArr.length != 1) {
                                ((ype) ((ype) ((ype) lwd.a.h()).l(10, TimeUnit.SECONDS)).ai(4387)).M("%s for %s is a semantic reply action, but does not have exactly one remote input", charSequence2, str2);
                            } else if (dstVar != null) {
                                ((ype) ((ype) ((ype) lwd.a.h()).l(10, TimeUnit.SECONDS)).ai(4388)).R("Ignoring secondary reply action for %s with title %s (keeping %s)", str2, charSequence2, dstVar.j);
                                lwdVar2.h(yzy.lY);
                            } else {
                                dstVar = dstVar3;
                            }
                        }
                        zF = true;
                    }
                }
                break;
            case 2:
                return ((pnh) this.a).a(false);
            case 3:
                return ((pnh) this.a).a(true);
            case 4:
                return new uwm("area_fill", new uuz((Bitmap) this.a.gu(), false), 3, 1);
            case 5:
                vaq.d();
                Object obj = this.a;
                umn umnVar = (umn) ((tyb) obj).i.a();
                ykd ykdVar = new ykd(umnVar, null);
                Context context = ((tyb) obj).d;
                tnv tnvVar = ((tyb) obj).j;
                xyc xycVar = tnvVar.a;
                Boolean bool = true;
                bool.getClass();
                boolean z = tnvVar.c;
                vky vkyVar = tnvVar.d;
                vaq.d();
                boolean z2 = z || (context.getApplicationInfo().flags & 536870912) != 0;
                if (uxd.a || !z2) {
                    utn utnVar = new utn(context, ykdVar, vkyVar);
                    utnVar.setZOrderOnTop(false);
                    utpVar = utnVar;
                } else {
                    utpVar = new utp(context, ykdVar, vkyVar);
                }
                utpVar.i(true);
                utpVar.h(umnVar);
                utpVar.a().setFocusable(true);
                utpVar.a().setImportantForAccessibility(1);
                usy usyVarH = ((tyb) obj).h();
                xyc xycVar2 = ((tyb) obj).t;
                int i4 = ((tyb) obj).j.e;
                uaj uajVar2 = ((tyb) obj).v;
                zF = uajVar2 != null ? uajVar2.f() : false;
                Duration duration = Duration.ZERO;
                std stdVar = umnVar.z;
                ykd ykdVar2 = umnVar.A;
                int iIntValue = ((Integer) umnVar.p.gu()).intValue();
                int i5 = umnVar.n;
                erb erbVar = umnVar.B;
                tsl tslVar = new tsl(ykdVar2, usyVarH, xycVar2, iIntValue, i5, Choreographer.getInstance());
                umnVar.s = new tun(tslVar, erbVar, umnVar.d, i4, umnVar.y, zF);
                Optional optionalA = umnVar.u;
                if (true == optionalA.isPresent()) {
                    optionalA = ((umv) optionalA.get()).a();
                    optionalA.getClass();
                }
                tun tunVar = umnVar.s;
                tunVar.getClass();
                qat qatVar = new qat(tunVar, i3);
                if (true == optionalA.isPresent()) {
                    ((tun) qatVar.a).d((tuk) optionalA.get());
                }
                umnVar.g = utpVar;
                umnVar.w = tslVar;
                tslVar.f();
                return utpVar;
            case 6:
                vaq.d();
                Object obj2 = this.a;
                Resources resources = ((tyb) obj2).l;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                tnl tnlVar = (tnl) ((tyb) obj2).g.a();
                uvg uvgVar = (uvg) ((tyb) obj2).h.a();
                if (resources.getDisplayMetrics().widthPixels > 0 && resources.getDisplayMetrics().heightPixels > 0) {
                    ttn ttnVar = (ttn) tnlVar.h.a();
                    int i6 = displayMetrics.widthPixels;
                    int i7 = displayMetrics.heightPixels;
                    float f = displayMetrics.density;
                    uvgVar.getClass();
                    usy usyVar = new usy(ttnVar, i6, i7, f, new tvv(uvgVar, 18), ((tyb) obj2).q);
                    usyVar.c = true;
                    return usyVar;
                }
                Integer numValueOf = Integer.valueOf(resources.getDisplayMetrics().widthPixels);
                Integer numValueOf2 = Integer.valueOf(resources.getDisplayMetrics().heightPixels);
                Context baseContext = ((tyb) obj2).d;
                Integer numValueOf3 = Integer.valueOf(baseContext.getResources().getDisplayMetrics().widthPixels);
                Integer numValueOf4 = Integer.valueOf(baseContext.getResources().getDisplayMetrics().heightPixels);
                Context context2 = ((tyb) obj2).c;
                String strConcat = String.format("Resources.size=%sx%s; ActivityContext.Resources.size=%sx%s; ApplicationContext.Resources.size=%sx%s", numValueOf, numValueOf2, numValueOf3, numValueOf4, Integer.valueOf(context2.getResources().getDisplayMetrics().widthPixels), Integer.valueOf(context2.getResources().getDisplayMetrics().heightPixels));
                while (baseContext instanceof ContextWrapper) {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    strConcat = String.valueOf(strConcat).concat(String.valueOf(String.format("; ActivityContext.base.Resources.size=%s.%s", Integer.valueOf(baseContext.getResources().getDisplayMetrics().widthPixels), Integer.valueOf(baseContext.getResources().getDisplayMetrics().heightPixels))));
                }
                throw new IllegalStateException(strConcat);
            case 7:
                vaq.d();
                Object obj3 = this.a;
                return new typ(((tyb) obj3).x, ((tyb) obj3).k, zwm.f().a, uuc.a().a(true), ((tyb) obj3).z, ((tyb) obj3).m);
            case 8:
                tyb tybVar = (tyb) this.a;
                return (tybVar.n == null || (uajVar = tybVar.v) == null || !uajVar.h()) ? new txy(tybVar, 0) : new txy(tybVar, 1);
            default:
                tyb tybVar2 = (tyb) this.a;
                uvg uvgVar2 = (uvg) tybVar2.h.a();
                boolean zR = tybVar2.y.r();
                xyc xycVarL = wub.L(new txv(i2));
                xyc xycVarL2 = wub.L(new txv(i3));
                xyc xycVarL3 = wub.L(new txv(i));
                xyc xycVarL4 = wub.L(new txv(7));
                xyc xycVarL5 = wub.L(new txv(8));
                xyc xycVarL6 = wub.L(new txv(9));
                return new ugs(uvgVar2, new ugr(tybVar2.z, tybVar2.x, tybVar2.l, tybVar2.s, tybVar2.o, tybVar2.p, tybVar2.u, zR, xycVarL, xycVarL2, xycVarL3, xycVarL4, xycVarL5, xycVarL6), tybVar2.i(), tybVar2.k);
        }
    }
}
