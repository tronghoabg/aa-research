package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class mhd extends mdd {
    private final PreflightPhoneWelcomeActivity a;

    public mhd(PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity) {
        this.a = preflightPhoneWelcomeActivity;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("PreflightWelcomeActivityUnlockReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            yph yphVar = PreflightPhoneWelcomeActivity.n;
            ((ype) ((ype) yphVar.f()).ai((char) 4908)).u("Device unlock received.");
            PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity = this.a;
            preflightPhoneWelcomeActivity.unregisterReceiver(this);
            if (((mfp) luk.b().a()).c == null) {
                ((ype) ((ype) yphVar.f()).ai((char) 4909)).u("User unlocked after AAP session ended, this will not authorize the car.");
                return;
            }
            mdh mdhVar = preflightPhoneWelcomeActivity.u;
            mdh.f(preflightPhoneWelcomeActivity);
            preflightPhoneWelcomeActivity.finish();
        }
    }
}
