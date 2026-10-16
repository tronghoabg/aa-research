package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity;

/* loaded from: classes3.dex */
public final class xbq extends mo {
    public static final yph s = yph.c("GH.OrderingButtonsVH");
    public final LauncherAppSettingsActivity t;
    public final xai u;
    public final CharSequence[] v;
    private final TextView w;

    public xbq(xai xaiVar, LauncherAppSettingsActivity launcherAppSettingsActivity, View view) {
        super(view);
        this.u = xaiVar;
        this.t = launcherAppSettingsActivity;
        this.w = (TextView) view.findViewById(R.id.current_ordering);
        this.v = new CharSequence[]{launcherAppSettingsActivity.getText(R.string.settings_customize_alphabetical_no_hotseat_app_order_button), launcherAppSettingsActivity.getText(R.string.settings_customize_custom_app_order_button)};
    }

    public final void E() {
        this.w.setText(this.v[nrz.e().i() ? 1 : 0]);
    }
}
