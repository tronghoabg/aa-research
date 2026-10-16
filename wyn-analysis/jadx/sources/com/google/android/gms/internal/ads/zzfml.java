package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes3.dex */
public final class zzfml {
    static Task zza;
    public static AppSetIdClient zzb;
    private static final Object zzc = new Object();

    public static void zza(Context context, boolean z2) {
        synchronized (zzc) {
            try {
                if (zzb == null) {
                    zzb = AppSet.getClient(context);
                }
                Task task = zza;
                if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z2 && zza.isComplete()))) {
                    try {
                        AppSetIdClient appSetIdClient = zzb;
                        AbstractC1732v.j(appSetIdClient, "the appSetIdClient shouldn't be null");
                        zza = appSetIdClient.getAppSetIdInfo();
                    } catch (ArrayIndexOutOfBoundsException e7) {
                        String message = e7.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 31);
                        sb2.append("Failed to get app set ID info: ");
                        sb2.append(message);
                        G6.L.k(sb2.toString());
                        zza = Tasks.forException(e7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Task zzb(Context context) {
        Task task;
        zza(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }
}
