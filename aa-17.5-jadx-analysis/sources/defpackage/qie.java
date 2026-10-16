package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class qie {
    public static final yph a = yph.c("GH.FeedbackClient");
    private static final String[] c = {"com.google.android.gms", "com.google.android.gms.policy_car"};
    public static final ComponentName b = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.companion.feedback.FeedbackListActivity");

    public static HashSet a(PackageManager packageManager) {
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
        HashSet hashSet = new HashSet();
        for (ApplicationInfo applicationInfo : installedApplications) {
            if (applicationInfo.metaData != null && applicationInfo.metaData.get("com.google.android.gms.car.application") != null) {
                hashSet.add(applicationInfo.packageName);
            }
        }
        Collections.addAll(hashSet, c);
        return hashSet;
    }

    public static final Intent b() {
        return new Intent().setComponent(b);
    }

    public static final void c(Context context, String str, String str2, Bundle bundle) {
        obs.a().c(context, b, R.string.feedback_initiated_toast, 0);
        new Thread(new qct(context, 17)).start();
        new qid(context, str, str2, bundle).execute(new Void[0]);
    }
}
