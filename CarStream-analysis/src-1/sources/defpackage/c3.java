package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class c3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;

    public /* synthetic */ c3(g3 g3Var, int i) {
        this.a = i;
        this.b = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g3 g3Var = this.b;
                xc.m(g3Var.a, "daXemHuongDan", true);
                ViewGroup viewGroup = (ViewGroup) g3Var.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(g3Var);
                    break;
                }
                break;
            default:
                g3.a(this.b);
                break;
        }
    }
}
