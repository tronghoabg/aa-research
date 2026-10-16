package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class kgp extends qz {
    public kgp() {
        this.a.c(new erc(this, 7, null));
    }

    @Override // defpackage.qz
    public final qw b(Intent intent) {
        intent.getClass();
        Object objA = a().a(qx.class);
        objA.getClass();
        qx qxVar = (qx) objA;
        kgl kglVar = new kgl(a());
        mdh.c();
        if (mdh.a() != mdg.a) {
            qxVar.f(kglVar);
            return new khf(a());
        }
        Bundle bundleExtra = intent.getBundleExtra("key_calendar_intent_bundle");
        if (bundleExtra != null) {
            bundleExtra.setClassLoader(CalendarEventPhoneNumber.class.getClassLoader());
        }
        ArrayList parcelableArrayList = bundleExtra != null ? Build.VERSION.SDK_INT >= 33 ? bundleExtra.getParcelableArrayList("key_phone_number_list", CalendarEventPhoneNumber.class) : bundleExtra.getParcelableArrayList("key_phone_number_list") : null;
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            return kglVar;
        }
        qxVar.f(kglVar);
        return new kgn(a(), parcelableArrayList);
    }
}
