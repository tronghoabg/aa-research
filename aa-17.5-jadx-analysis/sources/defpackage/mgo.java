package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.material.button.MaterialButton;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class mgo extends mgr {
    public static final yph g = yph.c("GH.AuthorizationDialog");
    public boolean h = false;
    public mfq i;
    public mdh j;
    private View l;

    public static final boolean h() {
        boolean zEqualsIgnoreCase = "true".equalsIgnoreCase(dlz.E("debug.car.skip_frx"));
        ((ype) g.l().ai((char) 4898)).y("shouldAutoAcceptFrx=%b", Boolean.valueOf(zEqualsIgnoreCase));
        return zEqualsIgnoreCase;
    }

    @Override // defpackage.mgr, defpackage.ao, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        i();
        if (this.h) {
            return;
        }
        bc bcVar = ((mgr) this).k;
        if (bcVar == null || bcVar.isFinishing()) {
            this.i.a(yzy.bK);
            ((ype) ((ype) g.f()).ai((char) 4894)).u("Authorization dialog cancelled");
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        yph yphVar = g;
        ((ype) ((ype) yphVar.f()).ai((char) 4895)).u("Creating authorization dialog view");
        this.l = layoutInflater.cloneInContext(new pi(requireContext(), kfl.i())).inflate(R.layout.authorization, viewGroup);
        requireContext();
        this.j = new mdh();
        this.i = new mfr(yzz.PREFLIGHT_AUTHORIZATION_DIALOG);
        if (this.l == null) {
            ((ype) ((ype) yphVar.f()).ai((char) 4901)).u("Null root view, ending early.");
        } else {
            ((ype) ((ype) yphVar.f()).ai((char) 4899)).u("showTosAndAuthorizationView");
            this.i.b(this);
            TextView textView = (TextView) this.l.findViewById(R.id.dialog_body_tos);
            if (actj.a.gu().k()) {
                yph yphVar2 = kwo.a;
                i = ((kwo) mki.a.i(kwo.class)).f() ? R.string.preflight_intro_content_work_profile_assistant_notice : R.string.preflight_intro_content_assistant_notice;
            } else {
                yph yphVar3 = kwo.a;
                i = ((kwo) mki.a.i(kwo.class)).f() ? R.string.preflight_intro_2_body_work_profile : R.string.preflight_intro_2_body;
            }
            textView.setText(i);
            ((TextView) this.l.findViewById(R.id.dialog_body_car_authorization)).setText(R.string.preflight_car_authorization_body);
            MaterialButton materialButton = (MaterialButton) this.l.findViewById(R.id.continue_button);
            if (mdh.h()) {
                materialButton.setText(R.string.preflight_accept_after_unlock);
            }
            materialButton.setOnClickListener(new mga(this, 2));
            this.l.findViewById(R.id.manage_button).setOnClickListener(new mga(this, 3));
            this.l.findViewById(R.id.exit_button).setOnClickListener(new mga(this, 4));
            mfo mfoVar = ((mfp) ((mfm) mki.a.i(mfm.class)).a()).c;
            mfoVar.getClass();
            CarInfoInternal carInfoInternal = mfoVar.e;
            if (carInfoInternal != null) {
                String strA = mhc.a(carInfoInternal.a);
                if (!strA.isEmpty()) {
                    this.l.findViewById(R.id.dialog_car_info).setVisibility(0);
                    ((TextView) this.l.findViewById(R.id.dialog_car_info)).setText(requireContext().getString(R.string.preflight_intro_car_info, strA));
                }
            }
            if (h()) {
                materialButton.performClick();
                ((ype) ((ype) yphVar.f()).ai((char) 4900)).u("FRX is automatically accepted under test harness mode.");
            }
        }
        if (acvh.a.gu().x()) {
            ((ype) ((ype) yphVar.f()).ai((char) 4896)).u("Broadcasting AUTHORIZATION_DIALOG_SHOWN");
            ((mfp) ((mfm) mki.a.i(mfm.class)).a()).b.a(mgl.k);
        }
        return this.l;
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.h) {
            return;
        }
        bc bcVar = ((mgr) this).k;
        if (bcVar == null || bcVar.isFinishing()) {
            this.i.a(yzy.bL);
            ((ype) ((ype) g.f()).ai((char) 4897)).u("Authorization dialog dismissed");
        }
    }
}
