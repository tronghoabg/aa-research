package defpackage;

import android.content.Context;
import java.util.Set;

/* loaded from: classes2.dex */
public final class jux {
    public static final /* synthetic */ int a = 0;
    private static final Set b = woy.di(new String[]{"com.google.android.apps.auto.components.settings.ui.CarSettingsService", "com.google.android.apps.auto.components.phone.PhoneCarAppService", "com.google.android.apps.auto.components.system.applauncher.LauncherCarAppService", "com.google.android.apps.auto.components.calendar.CalendarCarAppService", "com.google.android.apps.search.assistant.surfaces.voice.robin.car.ui.dashboard.DashboardService"});

    public static final boolean a(geu geuVar) {
        geuVar.getClass();
        return b.contains(((gmh) geuVar.d()).a.getClassName());
    }

    public static final Context b(Context context, boolean z) {
        leg legVar = leh.a;
        legVar.a();
        boolean z2 = !legVar.a().b() || olm.b(context);
        return z ? jtx.b(2, context, z2) : jtx.b(1, context, z2);
    }
}
