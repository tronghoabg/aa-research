package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class ojz extends ojm {
    final /* synthetic */ oka a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojz(oka okaVar) {
        super(okaVar);
        this.a = okaVar;
    }

    @Override // defpackage.ojm
    public final String a() {
        return this.a.a.a.getString(R.string.see_rejected_cars_action);
    }

    @Override // defpackage.ojm
    public final void b(Context context) {
        context.startActivity(new Intent().setComponent(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.companion.settings.Material3SettingsActivity")).putExtra(":android:show_fragment", "com.google.android.projection.gearhead.companion.settings.Material3ManageCarsFragment").putExtra(":android:no_headers", true).putExtra("highlight_rejected_cars", true).setFlags(335544320));
    }
}
