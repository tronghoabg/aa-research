package com.google.android.gms.internal.ads;

import D6.x1;
import G6.U;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzeun implements zzfcq {
    public final Context zza;
    public final x1 zzb;
    public final List zzc;

    public zzeun(Context context, x1 x1Var, List list) {
        this.zza = context;
        this.zzb = x1Var;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzbla.zza.zze()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            U u10 = C6.n.f1857D.f1863c;
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", className);
            Bundle bundle3 = new Bundle();
            x1 x1Var = this.zzb;
            bundle3.putInt("width", x1Var.f2534e);
            bundle3.putInt("height", x1Var.f2531b);
            bundle2.putBundle("size", bundle3);
            List list = this.zzc;
            if (!list.isEmpty()) {
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
