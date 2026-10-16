package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final class mqs extends mqz {
    private final Context g;
    private static final yph b = yph.c("GH.CrashLauncherItem");
    public static final mqc a = new mqc(new ComponentName("Crash", ""));

    public mqs(Context context) {
        super(a, GhIcon.p(context, 2131233245), "Crash!", 0, null);
        this.g = context;
    }

    @Override // defpackage.mqz
    public final void c() {
        ((ype) b.l().ai((char) 5191)).u("Sending request to crash");
        this.g.sendBroadcast(new Intent("com.google.android.projection.gearhead.FORCE_CRASH").setFlags(268435456));
    }
}
