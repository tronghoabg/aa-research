package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class oki extends ojj {
    public final Context a;

    public oki(Context context) {
        super(yxo.STARTUP_DIAGNOSTIC, false);
        this.a = context;
    }

    public static Intent c() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.settings.interactivetroubleshooter.InteractiveTroubleshooterActivity"));
        return intent;
    }

    @Override // defpackage.ojj
    public final ojn a() {
        return new okh(this);
    }

    @Override // defpackage.ojj
    public final int d() {
        return 4;
    }

    @Override // defpackage.ojj
    public final void b() {
    }
}
