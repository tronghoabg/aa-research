package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class nes {
    static final /* synthetic */ afia[] a = {new affn(nes.class, "instance", "getInstance()Lcom/google/android/apps/auto/components/system/data/DoNotDisturbManager;", 0)};
    public static final /* synthetic */ int b = 0;

    public static final boolean b(Context context) {
        int currentInterruptionFilter = ((NotificationManager) context.getSystemService(NotificationManager.class)).getCurrentInterruptionFilter();
        return (currentInterruptionFilter == 1 || currentInterruptionFilter == 0) ? false : true;
    }

    public final nev a() {
        return (nev) nev.b.getValue(this, a[0]);
    }
}
