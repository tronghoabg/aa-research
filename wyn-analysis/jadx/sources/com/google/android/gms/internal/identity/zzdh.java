package com.google.android.gms.internal.identity;

import U8.v0;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import x7.l;

/* loaded from: classes.dex */
final class zzdh extends l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzdz zzb;

    public zzdh(zzdz zzdzVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        this.zzb = zzdzVar;
    }

    @Override // x7.l
    public final void onLocationResult(LocationResult locationResult) {
        TaskCompletionSource taskCompletionSource = this.zza;
        List list = locationResult.f26740a;
        int size = list.size();
        taskCompletionSource.trySetResult(size == 0 ? null : (Location) list.get(size - 1));
        try {
            this.zzb.zzw(v0.w(this, "GetCurrentLocation"), false, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }
}
