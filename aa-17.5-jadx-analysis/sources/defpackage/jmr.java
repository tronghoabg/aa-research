package defpackage;

import android.app.KeyguardManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.apps.auto.carservice.frx.phonescreen.PhonescreenFrxActivity;
import com.google.android.projection.gearhead.R;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class jmr extends jms {
    public static final yph g = yph.c("GH.FrxPhIntro");
    Button h;
    Button i;
    public tes j;
    private ImageView k;

    @Override // defpackage.jms
    protected final yzz h() {
        return yzz.FRX_PHONESCREEN_INTRO;
    }

    public final boolean i() {
        KeyguardManager keyguardManager = (KeyguardManager) requireContext().getSystemService("keyguard");
        keyguardManager.getClass();
        return keyguardManager.isKeyguardLocked();
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.intro_dialog, viewGroup);
        this.h = (Button) viewInflate.findViewById(R.id.accept_button);
        this.i = (Button) viewInflate.findViewById(R.id.cancel_button);
        this.k = (ImageView) viewInflate.findViewById(R.id.dialog_illustration);
        PhonescreenFrxActivity phonescreenFrxActivityK = k();
        this.j = new tes(requireActivity());
        this.k.setImageResource(true != Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).contains("samsung") ? R.drawable.phone_frx_default : R.drawable.car_bottom_sheet_apps_illustration_samsung);
        this.h.setOnClickListener(new ie(this, 6, null));
        this.i.setOnClickListener(new jmq(this, phonescreenFrxActivityK, 0));
        if (acvb.g() && acvb.b().b.contains(Build.MANUFACTURER.toLowerCase(Locale.ROOT))) {
            requireContext().getTheme().applyStyle(R.style.ThemeOverlay_CarFrx_DeviceFontFamily, true);
        }
        return viewInflate;
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    public final void onStart() {
        yph yphVar = g;
        ((ype) ((ype) yphVar.e()).ai((char) 2367)).u("onStart");
        boolean zI = i();
        Button button = this.h;
        if (zI) {
            button.setText(R.string.car_setup_unlock_to_proceed_sentence_case);
        } else {
            button.setText(R.string.frx_common_next);
        }
        PhonescreenFrxActivity phonescreenFrxActivityK = k();
        if (i()) {
            ((ype) ((ype) yphVar.e()).ai((char) 2366)).u("Requesting phone unlock from user");
            this.j.b();
            tes tesVar = this.j;
            tesVar.b.add(new jgu(phonescreenFrxActivityK, 14));
        } else {
            ((ype) ((ype) yphVar.e()).ai((char) 2365)).u("Unlock not required");
        }
        super.onStart();
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    public final void onStop() {
        ((ype) ((ype) g.e()).ai((char) 2368)).u("onStop");
        super.onStop();
        this.j.a();
    }
}
