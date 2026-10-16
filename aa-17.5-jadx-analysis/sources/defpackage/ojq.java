package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class ojq extends ojm {
    final /* synthetic */ ojr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojq(ojr ojrVar) {
        super(ojrVar);
        this.a = ojrVar;
    }

    @Override // defpackage.ojm
    public final String a() {
        return this.a.a.getString(R.string.bluetooth_settings_action_text);
    }

    @Override // defpackage.ojm
    public final void b(Context context) {
        context.startActivity(new Intent().setAction("android.settings.BLUETOOTH_SETTINGS").setFlags(335544320));
    }
}
