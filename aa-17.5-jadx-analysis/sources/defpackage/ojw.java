package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class ojw extends ojm {
    final /* synthetic */ ojx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojw(ojx ojxVar) {
        super(ojxVar);
        this.a = ojxVar;
    }

    @Override // defpackage.ojm
    public final String a() {
        return this.a.a.a.getString(R.string.allow_new_cars_action);
    }

    @Override // defpackage.ojm
    public final void b(Context context) {
        context.startActivity(new Intent().setComponent(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.companion.settings.Material3SettingsActivity")).putExtra(":android:show_fragment", "com.google.android.projection.gearhead.companion.settings.Material3ManageCarsFragment").putExtra(":android:no_headers", true).putExtra("highlight_only_known_cars", true).setFlags(335544320));
    }
}
