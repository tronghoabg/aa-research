package defpackage;

import android.os.Bundle;
import android.telecom.Call;
import android.telecom.PhoneAccountHandle;

/* loaded from: classes2.dex */
public final class dyu extends Call.Callback {
    final /* synthetic */ aixv a;

    public dyu(aixv aixvVar) {
        this.a = aixvVar;
    }

    @Override // android.telecom.Call.Callback
    public final void onDetailsChanged(Call call, Call.Details details) {
        if (details != null) {
            aixv aixvVar = this.a;
            boolean zHasProperty = details.hasProperty(32768);
            boolean zHasProperty2 = details.hasProperty(256);
            PhoneAccountHandle accountHandle = details.getAccountHandle();
            Bundle extras = details.getExtras();
            aikz.a(aixvVar, new dxl(zHasProperty, zHasProperty2, accountHandle, extras != null ? new Bundle(extras) : null));
        }
    }
}
