package defpackage;

import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class luk {
    public static lzj a() {
        return (lzj) mki.a.i(lzj.class);
    }

    public static mfm b() {
        return (mfm) mki.a.i(mfm.class);
    }

    public static final Bundle c() {
        ActivityOptions launchDisplayId = ActivityOptions.makeBasic().setLaunchDisplayId(0);
        if (Build.VERSION.SDK_INT >= 36) {
            launchDisplayId.setPendingIntentBackgroundActivityStartMode(3);
        } else if (Build.VERSION.SDK_INT >= 34) {
            launchDisplayId.setPendingIntentBackgroundActivityStartMode(1);
        }
        return launchDisplayId.toBundle();
    }

    public static final Bundle d() {
        ActivityOptions launchDisplayId = ActivityOptions.makeBasic().setLaunchDisplayId(0);
        if (Build.VERSION.SDK_INT >= 36) {
            launchDisplayId.setPendingIntentCreatorBackgroundActivityStartMode(3);
        } else if (Build.VERSION.SDK_INT >= 34) {
            launchDisplayId.setPendingIntentCreatorBackgroundActivityStartMode(1);
        }
        Bundle bundle = launchDisplayId.toBundle();
        bundle.getClass();
        return bundle;
    }
}
