package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sfo extends sfx {
    public sga g;
    Button h;
    Button i;
    private bc j;

    public final yzz h() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getBoolean("PreSetupIntroFragment.isKeyguardLocked", false)) {
                return yzz.FRX_PRESETUP_INTRO_LOCKED;
            }
            if (arguments.getBoolean("PreSetupIntroFragment.showRetryMessage", false)) {
                return yzz.FRX_PRESETUP_INTRO_DOWNLOAD_RETRY;
            }
        }
        return yzz.FRX_PRESETUP_INTRO;
    }

    @Override // defpackage.sfx, android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws PackageManager.NameNotFoundException {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        bc bcVar = (bc) requireContext();
        this.j = bcVar;
        this.g = ((sfl) bcVar).B();
        View viewInflate = layoutInflater.inflate(R.layout.pre_setup_intro_dialog, viewGroup);
        this.h = (Button) viewInflate.findViewById(R.id.dialog_accept_button);
        this.i = (Button) viewInflate.findViewById(R.id.dialog_decline_button);
        Bundle arguments = getArguments();
        int iA = seu.a.a(this.j);
        final boolean z = arguments != null ? arguments.getBoolean("PreSetupIntroFragment.isKeyguardLocked", false) : false;
        this.h.setText(z ? R.string.car_setup_unlock_to_proceed_sentence_case : iA == 3 ? R.string.common_install : R.string.common_update);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: sfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sfo sfoVar = this.a;
                sga sgaVar = sfoVar.g;
                if (sgaVar != null) {
                    boolean z2 = z;
                    sgaVar.g.L(sfoVar.h(), yzy.bH);
                    sfoVar.g.h(true != z2 ? 6 : 4);
                    sfoVar.c();
                }
            }
        });
        sfm sfmVar = new sfm(this.j);
        if (adai.c()) {
            int iF = sfmVar.b.f();
            sfm.a.l().ai(8872).w("Current dismiss count at: %d", iF);
            if (iF > adai.a.gu().a()) {
                this.i.setVisibility(0);
                this.i.setOnClickListener(new sqd(this, sfmVar, 1));
            }
        }
        return viewInflate;
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("PreSetupIntroFragment.showRetryMessage", false)) {
            return;
        }
        Snackbar.k(requireView(), R.string.car_welcome_download_retry_toast_message).f();
    }
}
