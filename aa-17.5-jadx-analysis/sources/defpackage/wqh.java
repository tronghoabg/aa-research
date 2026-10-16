package defpackage;

import android.view.View;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wqh extends dzp {
    final /* synthetic */ NavigationMenuItemView a;

    public wqh(NavigationMenuItemView navigationMenuItemView) {
        this.a = navigationMenuItemView;
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        super.c(view, edgVar);
        NavigationMenuItemView navigationMenuItemView = this.a;
        edgVar.p(navigationMenuItemView.c);
        edgVar.K(navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
    }
}
