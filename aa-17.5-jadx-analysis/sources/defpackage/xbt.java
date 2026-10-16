package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xbt extends xcg {
    public static final yph a = yph.c("GH.FRX");

    @Override // defpackage.xcg
    protected final ViewGroup a(LayoutInflater layoutInflater, ViewGroup viewGroup, View view) throws Resources.NotFoundException {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.car_frx_illustration, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewGroup2.findViewById(R.id.layout);
        if (((xcj) b().l).x()) {
            linearLayout.setBackgroundColor(getActivity().getColor(R.color.car_frx_cakewalk_phone_background));
        } else {
            linearLayout.setBackgroundColor(getResources().getColor(R.color.quantum_indigo800));
        }
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.illustration);
        imageView.setImageDrawable(getResources().getDrawable(2131230999));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.car_frx_illustration_small_size);
        imageView.getLayoutParams().width = dimensionPixelSize;
        imageView.getLayoutParams().height = dimensionPixelSize;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.requestLayout();
        ((TextView) viewGroup2.findViewById(R.id.title)).setText(getString(R.string.frx_apps_permission_title));
        ((TextView) viewGroup2.findViewById(R.id.body)).setText(getString(R.string.frx_apps_permission_message));
        Button button = this.h;
        button.getClass();
        button.setVisibility(0);
        button.setText(getString(R.string.frx_exit));
        button.setOnClickListener(new xao(this, 6, null));
        return viewGroup2;
    }

    @Override // defpackage.xcg
    protected final void d() {
        b().f("EVENT_ACCEPT_CLICKED", null);
        c(yzy.bH);
    }

    @Override // defpackage.xcg
    protected final void e() {
        int i = true != ((xcj) b().l).x() ? R.string.frx_continue : R.string.common_continue;
        Button button = this.g;
        if (true != this.i) {
            i = R.string.frx_more;
        }
        button.setText(getString(i));
    }
}
