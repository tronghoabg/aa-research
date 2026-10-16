package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.carservice.frx.phonescreen.PhonescreenFrxActivity;

/* loaded from: classes2.dex */
public final class jmt extends mdd {
    final /* synthetic */ PhonescreenFrxActivity a;

    public jmt(PhonescreenFrxActivity phonescreenFrxActivity) {
        this.a = phonescreenFrxActivity;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("PhonescreenFrxActivity");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        if ("android.hardware.usb.action.USB_STATE".equals(intent.getAction())) {
            boolean booleanExtra = intent.getBooleanExtra("connected", true);
            yob yobVar = PhonescreenFrxActivity.m;
            ((ynz) ((ynz) yobVar.f()).ai((char) 2369)).y("USB state change detected: usbConnected=%b", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                return;
            }
            ((ynz) ((ynz) yobVar.h()).ai((char) 2370)).u("Terminating FRX (USB disconnected)");
            this.a.D();
        }
    }
}
