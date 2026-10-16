package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzasf implements ServiceConnection {
    final /* synthetic */ zzasg zza;
    private final zzash zzb;

    public /* synthetic */ zzasf(zzasg zzasgVar, zzash zzashVar, byte[] bArr) {
        Objects.requireNonNull(zzasgVar);
        this.zza = zzasgVar;
        this.zzb = zzashVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzasj.zza("InstallReferrerClient", "Install Referrer service connected.");
        zzasg zzasgVar = this.zza;
        zzasgVar.zzf(zzbep.zzb(iBinder));
        zzasgVar.zze(2);
        this.zzb.zza(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzasj.zzb("InstallReferrerClient", "Install Referrer service disconnected.");
        zzasg zzasgVar = this.zza;
        zzasgVar.zzf(null);
        zzasgVar.zze(0);
    }
}
