package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class jkz {
    private static final yph e = yph.c("CAR.SETUP.FRX");
    public int a = -1;
    public int b = -1;
    public Intent c;
    public boolean d;

    public final void a(Context context) {
        woy.aa(this.a != -1, "connectionType is required");
        woy.aa(this.b != -1, "aaSupportResult is required");
        woy.aa(this.c != null, "continueIntent is required");
        ((ype) e.l().ai(2290)).S("Launching: connectionType: %d, aaSupportedResult: %d, continueIntent set? %b, skipToUsbReset? %b", Integer.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c != null), Boolean.valueOf(this.d));
        Intent intent = new Intent();
        intent.setComponent(itx.d);
        intent.putExtra("PreSetup.AA_SUPPORT_RESULT", this.b);
        intent.putExtra("PreSetup.CONTINUE_INTENT", this.c);
        intent.putExtra("connection_type", this.a);
        intent.putExtra("PreSetup.SKIP_TO_USB_RESET", this.d);
        intent.setFlags(276889600);
        context.startActivity(intent);
    }
}
