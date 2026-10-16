package defpackage;

import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class deh implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ deh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v49, types: [fbg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v91, types: [bym, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() throws IOException {
        int i = this.b;
        float fB = BitmapDescriptorFactory.HUE_RED;
        Object obj = null;
        int i2 = 1;
        int i3 = 1;
        switch (i) {
            case 0:
                Object obj2 = this.a;
                ((dei) obj2).f = null;
                ((dei) obj2).c();
                return afak.a;
            case 1:
                ((afdr) ((affv) this.a).a).invoke();
                return afak.a;
            case 2:
                List list = ((dfc) this.a).c;
                if (!list.isEmpty()) {
                    obj = list.get(0);
                    float fB2 = ((dfe) obj).a.b();
                    list.getClass();
                    int size = list.size() - 1;
                    if (size > 0) {
                        while (true) {
                            Object obj3 = list.get(i2);
                            float fB3 = ((dfe) obj3).a.b();
                            int iCompare = Float.compare(fB2, fB3);
                            if (iCompare < 0) {
                                fB2 = fB3;
                            }
                            if (iCompare < 0) {
                                obj = obj3;
                            }
                            if (i2 != size) {
                                i2++;
                            }
                        }
                    }
                }
                dfe dfeVar = (dfe) obj;
                if (dfeVar != null) {
                    fB = dfeVar.a.b();
                }
                return Float.valueOf(fB);
            case 3:
                List list2 = ((dfc) this.a).c;
                if (!list2.isEmpty()) {
                    obj = list2.get(0);
                    float fA = ((dfe) obj).a.a();
                    list2.getClass();
                    int size2 = list2.size() - 1;
                    if (size2 > 0) {
                        while (true) {
                            Object obj4 = list2.get(i3);
                            float fA2 = ((dfe) obj4).a.a();
                            int iCompare2 = Float.compare(fA, fA2);
                            if (iCompare2 < 0) {
                                fA = fA2;
                            }
                            if (iCompare2 < 0) {
                                obj = obj4;
                            }
                            if (i3 != size2) {
                                i3++;
                            }
                        }
                    }
                }
                dfe dfeVar2 = (dfe) obj;
                if (dfeVar2 != null) {
                    fB = dfeVar2.a.a();
                }
                return Float.valueOf(fB);
            case 4:
                Object systemService = ((View) ((nfh) this.a).c).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 5:
                return new BaseInputConnection(((djx) this.a).a, false);
            case 6:
                return this.a;
            case 7:
                egi egiVar = (egi) ((egd) this.a).a;
                File canonicalFile = ((File) egiVar.e.invoke()).getCanonicalFile();
                synchronized (egi.b) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    Set set = egi.a;
                    if (set.contains(absolutePath)) {
                        throw new IllegalStateException(a.bq(absolutePath, "There are multiple DataStores active for the same file: ", ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled)."));
                    }
                    absolutePath.getClass();
                    set.add(absolutePath);
                }
                canonicalFile.getClass();
                return new egl(canonicalFile, egiVar.c, (egp) egiVar.d.invoke(canonicalFile), new deh(canonicalFile, 9));
            case 8:
                return ((egd) this.a).k().a;
            case 9:
                Object obj5 = this.a;
                synchronized (egi.b) {
                    egi.a.remove(((File) obj5).getAbsolutePath());
                }
                return afak.a;
            case 10:
                ?? r9 = this.a;
                r9.getLifecycle().c(new fba(r9));
                return afak.a;
            case 11:
                return Integer.valueOf(((iph) this.a).a.getDisplay().getDisplayId());
            case 12:
                int i4 = ipk.b;
                ((iph) this.a).g();
                return afak.a;
            case 13:
                int i5 = ipk.b;
                ((iph) this.a).j(null);
                return afak.a;
            case 14:
                if (((jmc) this.a).b > 0) {
                    return afak.a;
                }
                throw new IllegalStateException("Set association ID before exiting ASSOCIATING state.");
            case 15:
                Object obj6 = this.a;
                View.OnClickListener onClickListener = ((CarButton) obj6).a;
                if (onClickListener != null) {
                    onClickListener.onClick((View) obj6);
                }
                return afak.a;
            case 16:
                led ledVar = (led) this.a;
                return new nrf(Boolean.valueOf(ledVar.d()), Boolean.valueOf(ledVar.d() && acon.a.gu().j()), Boolean.valueOf(ledVar.d() && acon.a.gu().j()), acon.a.gu().j());
            case 17:
                nso nsoVarB = nsr.c().b();
                mmc.c();
                Object obj7 = this.a;
                yfy yfyVarK = mmc.h() ? yfy.k(nsoVarB.r((nsn) ((nfh) obj7).c), new ProjectionWindowAnimationParams(R.anim.dashboard_fade_out, false, null, 0)) : acxa.Z() ? ((nfh) obj7).i(nsoVarB) : yfy.l(CarRegionId.a, new ProjectionWindowAnimationParams(R.anim.coolwalk_delayed_app_switch_enter, false, null, 200), nsoVarB.r(nsn.s), new ProjectionWindowAnimationParams(R.anim.coolwalk_widescreen_maps_fade, false, null, 0));
                rcc rccVar = new rcc();
                rccVar.b(CarRegionId.a, 0);
                rccVar.b(nsoVarB.r((nsn) ((nfh) obj7).c), 1);
                rccVar.f(yfyVarK);
                rccVar.a = false;
                return rccVar.a();
            case 18:
                nso nsoVarB2 = nsr.c().b();
                mmc.c();
                Object obj8 = this.a;
                yfy yfyVarK2 = mmc.h() ? yfy.k(nsoVarB2.r((nsn) ((nfh) obj8).c), new ProjectionWindowAnimationParams(R.anim.dashboard_fade_out, false, null, 0)) : acxa.Z() ? ((nfh) obj8).i(nsoVarB2) : ylx.a;
                rcc rccVar2 = new rcc();
                rccVar2.b(CarRegionId.a, 0);
                rccVar2.b(nsoVarB2.r((nsn) ((nfh) obj8).c), 1);
                rccVar2.f(yfyVarK2);
                rccVar2.a = true;
                return rccVar2.a();
            case 19:
                return new oxt(this.a, i2);
            default:
                yph yphVar = nhm.a;
                return Boolean.valueOf(!affa.f((nnl) this.a.a(), nnl.a));
        }
    }
}
