package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class lev extends let {
    public lex g;
    String h;
    Button i;

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.g = (lex) requireActivity();
        View viewInflate = layoutInflater.cloneInContext(kfl.j(requireContext())).inflate(R.layout.wireless_continue_on_car_screen_dialog, viewGroup);
        this.i = (Button) viewInflate.findViewById(R.id.dont_show_again_button);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.h = arguments.getString("LAUNCHED_FROM_PREFLIGHT");
        }
        return viewInflate;
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        lex lexVar = this.g;
        yph yphVar = lfc.a;
        SharedPreferences sharedPreferences = lexVar.getApplicationContext().getSharedPreferences("PREFLIGHT_DONT_SHOW_AGAIN", 0);
        if ((sharedPreferences.getInt("tap_hu_dismiss", 0) + sharedPreferences.getInt("preflight_dismiss", 0) >= acvh.b() || sharedPreferences.getInt("wireless_projection_start", 0) > acvh.c()) && !Objects.equals(this.h, "frx.phonescreen.LAUNCHED_FROM_PREFLIGHT")) {
            this.i.setVisibility(0);
            this.i.setText(R.string.dont_show_again);
            this.i.setOnClickListener(new kep(this, 9));
        }
    }
}
