package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.RotaryDialpadView;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.StandardDialpadView;
import com.google.android.apps.auto.components.contentforward.CfView;

/* loaded from: classes2.dex */
public final /* synthetic */ class jzv implements olk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jzv(CfView cfView, int i) {
        this.b = i;
        this.a = cfView;
    }

    @Override // defpackage.olk
    public final void a() {
        switch (this.b) {
            case 0:
                ((RotaryDialpadView) this.a).startAnimation(null);
                break;
            case 1:
                ((MaterialStandardDialpadView) this.a).startAnimation(null);
                break;
            case 2:
                ((StandardDialpadView) this.a).startAnimation(null);
                break;
            case 3:
                ViewGroup viewGroup = ((CfView) this.a).d;
                viewGroup.getClass();
                viewGroup.startAnimation(null);
                break;
            case 4:
                ImageView imageView = ((CfView) this.a).c;
                imageView.getClass();
                imageView.startAnimation(null);
                break;
            case 5:
                ((com.google.android.apps.auto.components.telecom.dialpad.RotaryDialpadView) this.a).startAnimation(null);
                break;
            case 6:
                ((com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.a).startAnimation(null);
                break;
            case 7:
                ((ohp) this.a).i.startAnimation(null);
                break;
            default:
                ((View) this.a).startAnimation(null);
                break;
        }
    }

    public /* synthetic */ jzv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
