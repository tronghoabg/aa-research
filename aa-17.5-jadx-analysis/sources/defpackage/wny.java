package defpackage;

import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
final class wny extends dzp {
    final /* synthetic */ woa a;

    public wny(woa woaVar) {
        this.a = woaVar;
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        super.c(view, edgVar);
        woa woaVar = this.a;
        edgVar.h(new edf(null, 16, woaVar.g.getVisibility() == 0 ? woaVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : woaVar.getString(R.string.mtrl_picker_toggle_to_day_selection), null, null));
    }
}
