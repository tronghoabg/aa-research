package defpackage;

import android.app.KeyguardManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class sdt extends sei {
    private Button a;

    private final void d() {
        boolean zInKeyguardRestrictedInputMode = ((KeyguardManager) getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        Button button = this.a;
        if (zInKeyguardRestrictedInputMode) {
            button.setText(R.string.car_setup_unlock_to_proceed_sentence_case);
        } else {
            button.setText(R.string.common_next);
        }
    }

    public final void a() {
        b().f("EVENT_INTRO_CANCEL_TIMER", null);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc bcVar = (bc) getContext();
        View viewInflate = layoutInflater.inflate(R.layout.car_frx_cakewalk_intro, viewGroup, false);
        qrv.s(layoutInflater, (ViewGroup) viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.illustration);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.body);
        Button button = (Button) viewInflate.findViewById(R.id.left_button);
        this.a = (Button) viewInflate.findViewById(R.id.right_button);
        textView.setText(R.string.car_setup_intro_title);
        ((ImageView) viewInflate.findViewById(R.id.icon)).setImageDrawable(bcVar.getDrawable(R.drawable.ic_android_auto_gms));
        imageView.setImageDrawable(bcVar.getDrawable(R.drawable.car_bottom_sheet_apps_illustration));
        textView2.setText(R.string.car_setup_intro_body_cakewalk);
        button.setText(R.string.common_exit);
        button.setVisibility(0);
        button.setOnClickListener(new sdo((Object) this, 5));
        this.a.setVisibility(0);
        d();
        this.a.setOnClickListener(new sdo((Object) this, 6));
        textView2.setMovementMethod(new sds(this));
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        d();
        super.onResume();
    }
}
