package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzdg extends zzs {
    final /* synthetic */ TaskCompletionSource zza;

    public zzdg(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzt
    public final void zzb(int i5, String[] strArr) {
        if (i5 != 0 && (i5 < 1000 || i5 >= 1006)) {
            i5 = 13;
        }
        AbstractC1304a.J(new Status(i5, null, null, null), null, this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzt
    public final void zzc(int i5, String[] strArr) {
        if (i5 != 0 && (i5 < 1000 || i5 >= 1006)) {
            i5 = 13;
        }
        AbstractC1304a.J(new Status(i5, null, null, null), null, this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzt
    public final void zzd(int i5, PendingIntent pendingIntent) {
        if (i5 != 0 && (i5 < 1000 || i5 >= 1006)) {
            i5 = 13;
        }
        AbstractC1304a.J(new Status(i5, null, null, null), null, this.zza);
    }
}
