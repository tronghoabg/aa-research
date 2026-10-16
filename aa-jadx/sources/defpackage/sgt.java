package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class sgt extends defpackage.wnc {
    private static final boolean h() {
        return android.os.Build.MANUFACTURER != null && android.os.Build.MANUFACTURER.toLowerCase(java.util.Locale.ENGLISH).contains("samsung");
    }

    @Override // defpackage.wnc, defpackage.fi, defpackage.ao
    public final android.app.Dialog fv(android.os.Bundle bundle) {
        android.app.Dialog dialogFv = super.fv(bundle);
        ((defpackage.wnb) dialogFv).setOnShowListener(new defpackage.lex(3));
        return dialogFv;
    }

    final boolean i() {
        return getContext() != null;
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        defpackage.bc bcVar = (defpackage.bc) getContext();
        if (bcVar != null) {
            bcVar.finish();
            bcVar.overridePendingTransition(0, 0);
        }
    }

    @Override // android.support.v4.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.content.Context context = layoutInflater.getContext();
        if (!h() || context == null) {
            return null;
        }
        context.getTheme().applyStyle(com.google.android.projection.gearhead.R.style.ThemeOverlay_CarFrx_DeviceFontFamily, true);
        return null;
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        if (i() && requireContext().getResources().getDisplayMetrics().widthPixels / requireContext().getResources().getDisplayMetrics().density >= 600.0f) {
            com.google.android.material.bottomsheet.BottomSheetBehavior.B((android.view.View) requireView().getParent()).f = requireContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gm3_bottom_sheet_dialog_max_tablet_width);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.google.android.projection.gearhead.R.id.dialog_illustration);
        if (h() && imageView != null && i()) {
            imageView.setImageDrawable(requireContext().getDrawable(com.google.android.projection.gearhead.R.drawable.car_bottom_sheet_apps_illustration_samsung));
        }
    }
}
