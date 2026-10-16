package defpackage;

import android.app.Activity;
import androidx.preference.Preference;

/* loaded from: classes3.dex */
public final /* synthetic */ class xbi implements xbn {
    public final /* synthetic */ xbo a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ xbi(xbo xboVar, boolean z) {
        this.a = xboVar;
        this.b = z;
    }

    @Override // defpackage.xbn
    public final void a(Activity activity) {
        lvu lvuVar = new lvu(this.b, 3);
        Preference preferenceA = this.a.a("key_settings_connection_enable_troubleshooter_feedback");
        if (preferenceA != null) {
            lvuVar.accept(preferenceA);
        }
    }
}
