package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhonePermissionsActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class mgy implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mgy(PreflightPhonePermissionsActivity preflightPhonePermissionsActivity, Object obj, int i) {
        this.c = i;
        this.a = preflightPhonePermissionsActivity;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws Resources.NotFoundException {
        int i = this.c;
        if (i == 0) {
            onu.a().k(z, (Activity) this.a);
            if (!z || onu.a().j()) {
                return;
            }
            ((SwitchCompat) this.b).setChecked(false);
            return;
        }
        Object obj = this.b;
        if (i == 1) {
            ((mko) obj).a("key_work_profile_support", z);
            mfq mfqVar = ((PreflightPhonePermissionsActivity) this.a).m;
            mfqVar.getClass();
            mfqVar.a(z ? yzy.BA : yzy.BB);
            return;
        }
        onu.a().k(z, ((Fragment) obj).getActivity());
        if (!z || onu.a().j()) {
            return;
        }
        ((Switch) this.a).setChecked(false);
    }

    public /* synthetic */ mgy(xce xceVar, Switch r2, int i) {
        this.c = i;
        this.b = xceVar;
        this.a = r2;
    }
}
