package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* loaded from: classes2.dex */
final class eu extends ebv {
    final /* synthetic */ ev a;

    public eu(ev evVar) {
        this.a = evVar;
    }

    @Override // defpackage.ebv, defpackage.ebu
    public final void a() {
        fe feVar = this.a.a;
        feVar.r.setVisibility(8);
        PopupWindow popupWindow = feVar.s;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (feVar.r.getParent() instanceof View) {
            View view = (View) feVar.r.getParent();
            int[] iArr = ebm.a;
            view.requestApplyInsets();
        }
        feVar.r.i();
        feVar.J.w(null);
        feVar.J = null;
        ViewGroup viewGroup = feVar.v;
        int[] iArr2 = ebm.a;
        viewGroup.requestApplyInsets();
    }
}
