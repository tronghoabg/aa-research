package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class leu extends let {
    ProgressBar g;

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.cloneInContext(kfl.j(requireContext())).inflate(R.layout.wireless_connecting_dialog, viewGroup);
        this.g = (ProgressBar) viewInflate.findViewById(R.id.progress_bar);
        Resources resources = getResources();
        this.g.setIndeterminateDrawable(new vkd(resources.getDimensionPixelSize(R.dimen.car_frx_progress_thickness), new int[]{resources.getColor(R.color.bottom_sheet_text_color)}));
        this.g.setIndeterminate(true);
        return viewInflate;
    }
}
