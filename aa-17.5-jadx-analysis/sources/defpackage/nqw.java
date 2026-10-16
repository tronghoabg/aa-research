package defpackage;

import android.view.View;
import com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView;
import com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final /* synthetic */ class nqw implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nqw(StandardDialpadView standardDialpadView, int i) {
        this.b = i;
        this.a = standardDialpadView;
    }

    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object, ocp] */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                nqx nqxVar = (nqx) obj;
                nqq nqqVarF = nqxVar.f();
                if (nqqVarF != null) {
                    nqqVarF.e(new npz(obj, 5));
                }
                nqq nqqVarE = nqxVar.e();
                if (nqqVarE != null) {
                    nqqVarE.e(new npz(obj, 6));
                    break;
                }
                break;
            case 1:
                RailWidgetView railWidgetView = (RailWidgetView) this.a;
                railWidgetView.g = false;
                railWidgetView.setVisibility(4);
                railWidgetView.c();
                break;
            case 2:
                ((ype) nrx.a.l().ai((char) 5352)).u("Showing irregular activity scrim because notification center opened");
                ((nrx) this.a).g(false);
                break;
            case 3:
                ((ype) nrx.a.l().ai((char) 5353)).u("Hiding irregular activity scrim because notification center closed");
                ((nrx) this.a).d();
                break;
            case 4:
                ntm ntmVar = ((ntl) this.a).a;
                ntmVar.i = null;
                ntmVar.j = false;
                ntmVar.k = false;
                ntmVar.a();
                break;
            case 5:
                int i = ntl.b;
                ((ntm) this.a).a();
                break;
            case 6:
                nvs nvsVar = (nvs) this.a;
                kfl.h().I(nvsVar.c);
                nvsVar.b.post(nvsVar.d);
                nvsVar.d = new ily(20);
                break;
            case 7:
                ((nvs) this.a).c();
                break;
            case 8:
                nwj nwjVar = (nwj) this.a;
                nwjVar.c = false;
                noh nohVar = nwjVar.a;
                if (nohVar != null) {
                    nohVar.d();
                    nwjVar.a = null;
                    if (nwjVar.b) {
                        nwjVar.k = null;
                        nwjVar.b = false;
                    }
                    if (!nwjVar.j.equals(nwr.a)) {
                        nwjVar.b();
                        break;
                    }
                }
                break;
            case 9:
                ((ype) nwk.f.l().ai((char) 5497)).u("onViewAnimateOutComplete");
                if (lbh.d().gN()) {
                    nwk nwkVar = (nwk) this.a;
                    nwkVar.i = false;
                    nwkVar.k();
                    break;
                }
                break;
            case 10:
                ((nwk) this.a).i();
                break;
            case 11:
                Object obj2 = this.a;
                yph yphVar = nwk.f;
                nwr nwrVar = (nwr) obj2;
                mcd.J(nwrVar, yzy.oe);
                nwrVar.g.run();
                break;
            case 12:
                ((nxo) this.a).c();
                break;
            case 13:
                this.a.a();
                break;
            case 14:
                ((ocd) this.a).i();
                break;
            case 15:
                ((ocm) this.a).a();
                break;
            case 16:
                ((odf) this.a).a.b();
                break;
            case 17:
                ((odf) this.a).a.b();
                break;
            case 18:
                ((StandardDialpadView) this.a).c.abandonAudioFocus(null);
                break;
            case 19:
                StandardDialpadView standardDialpadView = (StandardDialpadView) this.a;
                View view = standardDialpadView.f;
                view.getClass();
                if (view.isPressed()) {
                    standardDialpadView.f.setPressed(false);
                    standardDialpadView.f.performLongClick();
                    break;
                }
                break;
            default:
                ((oer) this.a).H();
                break;
        }
    }

    public /* synthetic */ nqw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
