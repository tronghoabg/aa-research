package defpackage;

import android.view.View;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.StandardDialpadView;
import com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment;
import com.google.android.projection.gearhead.input.ProjectionKeyboardLayout;

/* loaded from: classes2.dex */
public final /* synthetic */ class jzr implements View.OnLongClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jzr(ProjectionKeyboardLayout projectionKeyboardLayout, int i) {
        this.b = i;
        this.a = projectionKeyboardLayout;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.b) {
            case 0:
                ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.R).l());
                MaterialStandardDialpadView materialStandardDialpadView = (MaterialStandardDialpadView) this.a;
                StringBuilder sb = materialStandardDialpadView.f;
                materialStandardDialpadView.f = sb.delete(0, sb.length());
                materialStandardDialpadView.h();
                break;
            case 1:
                MaterialStandardDialpadView materialStandardDialpadView2 = (MaterialStandardDialpadView) this.a;
                materialStandardDialpadView2.g();
                materialStandardDialpadView2.e('+');
                break;
            case 2:
                StandardDialpadView standardDialpadView = (StandardDialpadView) this.a;
                standardDialpadView.f();
                standardDialpadView.e('+');
                break;
            case 3:
                ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.R).l());
                StandardDialpadView standardDialpadView2 = (StandardDialpadView) this.a;
                StringBuilder sb2 = standardDialpadView2.e;
                standardDialpadView2.e = sb2.delete(0, sb2.length());
                standardDialpadView2.g();
                break;
            case 4:
                niy niyVar = (niy) this.a;
                niyVar.a().n(niyVar.e);
                break;
            case 5:
                ((RailStatusBarFragment) this.a).f().k();
                break;
            case 6:
                yph yphVar = RailStatusBarFragment.b;
                break;
            case 7:
                com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView standardDialpadView3 = (com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.a;
                standardDialpadView3.d();
                standardDialpadView3.b('+');
                break;
            case 8:
                ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.R).l());
                com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView standardDialpadView4 = (com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.a;
                StringBuilder sb3 = standardDialpadView4.e;
                standardDialpadView4.e = sb3.delete(0, sb3.length());
                standardDialpadView4.e();
                break;
            default:
                xdo xdoVar = (xdo) view.getTag();
                long jCurrentTimeMillis = System.currentTimeMillis();
                char[] cArr = xdoVar.l;
                Object obj = this.a;
                if (cArr != null) {
                    ProjectionKeyboardLayout projectionKeyboardLayout = (ProjectionKeyboardLayout) obj;
                    ajmd ajmdVar = projectionKeyboardLayout.k;
                    ((xds) ajmdVar.a).i(projectionKeyboardLayout.a(), "projection_keyboard_popup_layout", xdoVar.l);
                } else {
                    ((ProjectionKeyboardLayout) obj).k.f(xdoVar.a());
                }
                ProjectionKeyboardLayout projectionKeyboardLayout2 = (ProjectionKeyboardLayout) this.a;
                projectionKeyboardLayout2.f = 0;
                projectionKeyboardLayout2.g = jCurrentTimeMillis;
                projectionKeyboardLayout2.h = xdoVar;
                break;
        }
        return true;
    }

    public /* synthetic */ jzr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
