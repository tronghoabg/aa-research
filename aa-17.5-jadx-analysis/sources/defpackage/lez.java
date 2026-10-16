package defpackage;

import android.content.Intent;
import com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity;

/* loaded from: classes2.dex */
public final class lez implements mdl {
    final WirelessPreflightActivity a;

    public lez(WirelessPreflightActivity wirelessPreflightActivity) {
        this.a = wirelessPreflightActivity;
    }

    private final void c() {
        WirelessPreflightActivity wirelessPreflightActivity = this.a;
        Intent intent = new Intent(wirelessPreflightActivity, (Class<?>) WirelessPreflightActivity.class);
        intent.addFlags(67108864);
        intent.putExtra("auto_prompt_on_launch", true);
        wirelessPreflightActivity.startActivity(intent);
    }

    @Override // defpackage.mdl
    public final void a() {
        c();
    }

    @Override // defpackage.mdl
    public final void b() {
        c();
    }
}
