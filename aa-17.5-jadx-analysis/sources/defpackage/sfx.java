package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.projection.gearhead.R;
import java.util.Locale;

/* loaded from: classes2.dex */
public class sfx extends wmf {
    private static final boolean h() {
        return Build.MANUFACTURER != null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).contains("samsung");
    }

    @Override // defpackage.wmf, defpackage.fh, defpackage.ao
    public final Dialog gn(Bundle bundle) {
        Dialog dialogGn = super.gn(bundle);
        ((wme) dialogGn).setOnShowListener(new les(2));
        return dialogGn;
    }

    final boolean i() {
        return getContext() != null;
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        bc bcVar = (bc) getContext();
        if (bcVar != null) {
            bcVar.finish();
            bcVar.overridePendingTransition(0, 0);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        if (!h() || context == null) {
            return null;
        }
        context.getTheme().applyStyle(R.style.ThemeOverlay_CarFrx_DeviceFontFamily, true);
        return null;
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (i() && requireContext().getResources().getDisplayMetrics().widthPixels / requireContext().getResources().getDisplayMetrics().density >= 600.0f) {
            BottomSheetBehavior.M((View) requireView().getParent()).f = requireContext().getResources().getDimensionPixelSize(R.dimen.gm3_bottom_sheet_dialog_max_tablet_width);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.dialog_illustration);
        if (h() && imageView != null && i()) {
            imageView.setImageDrawable(requireContext().getDrawable(R.drawable.car_bottom_sheet_apps_illustration_samsung));
        }
    }
}
