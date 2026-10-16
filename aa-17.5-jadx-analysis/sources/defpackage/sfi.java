package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sfi extends sfw {
    @Override // defpackage.sfw
    public final yzz b() {
        return yzz.FRX_PRESETUP_INCOMPATIBLE;
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc bcVar = (bc) getContext();
        spu.aw(bcVar);
        View viewInflate = layoutInflater.inflate(R.layout.car_bottom_sheet_fragment, viewGroup, false);
        BottomSheetView bottomSheetView = (BottomSheetView) viewInflate.findViewById(R.id.bottom_sheet);
        bottomSheetView.addView(layoutInflater.inflate(R.layout.bottom_sheet_error, (ViewGroup) bottomSheetView, false));
        bottomSheetView.b(bcVar.getWindowManager().getDefaultDisplay(), new sfv(this), viewInflate.findViewById(R.id.bottom_sheet_fragment_background));
        bottomSheetView.a(false);
        ((ImageView) viewInflate.findViewById(R.id.bs_illustration)).setImageDrawable(bcVar.getDrawable(R.drawable.error_white_illustration));
        ((TextView) viewInflate.findViewById(R.id.bs_title)).setText(R.string.car_presetup_frx_device_incompatible_title);
        ((TextView) viewInflate.findViewById(R.id.bs_body)).setText(R.string.car_presetup_frx_device_incompatible_sub_title);
        Button button = (Button) viewInflate.findViewById(R.id.bs_accept_button);
        button.setVisibility(0);
        button.setText(getString(R.string.common_exit));
        button.setOnClickListener(new sdo((Object) this, 7));
        qst.a(bcVar).h();
        return viewInflate;
    }
}
