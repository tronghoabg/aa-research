package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.surveys.internal.view.SystemInfoDialogFragment;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wke extends ca {
    final /* synthetic */ View c;
    final /* synthetic */ SystemInfoDialogFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wke(SystemInfoDialogFragment systemInfoDialogFragment, View view) {
        super(null);
        this.c = view;
        this.d = systemInfoDialogFragment;
    }

    @Override // defpackage.ca
    public final void q(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.canScrollVertically(-1)) {
            this.c.findViewById(R.id.survey_system_info_dialog_title).setElevation(this.d.getResources().getDimensionPixelSize(R.dimen.survey_system_info_dialog_title_elevation));
        } else {
            this.c.findViewById(R.id.survey_system_info_dialog_title).setElevation(BitmapDescriptorFactory.HUE_RED);
        }
        this.c.findViewById(R.id.survey_system_info_dialog_section_divider).setVisibility(true != recyclerView.canScrollVertically(1) ? 8 : 0);
    }
}
