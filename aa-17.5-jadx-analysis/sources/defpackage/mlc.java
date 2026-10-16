package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mlc extends mku {
    public static final yph c = yph.c("GH.ConnectACarUsb");

    @Override // defpackage.exv
    public final void e(Bundle bundle, String str) throws Resources.NotFoundException {
        h(R.xml.settings_connect_usb, str);
        o(new mld(this, 1));
    }

    @Override // defpackage.mku
    public final yzz l() {
        return yzz.SETTINGS_CONNECT_A_CAR_USB;
    }
}
