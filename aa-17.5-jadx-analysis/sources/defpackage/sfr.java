package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class sfr {
    public static final /* synthetic */ int a = 0;
    private static final ypf b = ols.R("CAR.SETUP.FRX");

    public static final void a(Context context, int i, int i2, Intent intent) {
        woy.aa(intent != null, "continueIntent is required");
        b.l().ai(8873).S("Launching: connectionType: %d, aaSupportedResult: %d, continueIntent set? %b, skipToUsbReset? %b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(intent != null), false);
        Intent intent2 = new Intent();
        intent2.setComponent(rhz.e);
        intent2.putExtra("PreSetup.AA_SUPPORT_RESULT", i2);
        intent2.putExtra("PreSetup.CONTINUE_INTENT", intent);
        intent2.putExtra("connection_type", i);
        intent2.putExtra("PreSetup.SKIP_TO_USB_RESET", false);
        intent2.setFlags(276889600);
        context.startActivity(intent2);
    }
}
