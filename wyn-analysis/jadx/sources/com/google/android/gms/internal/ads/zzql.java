package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzql extends AudioDeviceCallback {
    final /* synthetic */ zzqp zza;

    public /* synthetic */ zzql(zzqp zzqpVar, byte[] bArr) {
        Objects.requireNonNull(zzqpVar);
        this.zza = zzqpVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.zza.zzi();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzfm.zza;
        int length = audioDeviceInfoArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            zzqp zzqpVar = this.zza;
            if (Objects.equals(audioDeviceInfoArr[i5], zzqpVar.zzj())) {
                zzqpVar.zzk(null);
                break;
            }
            i5++;
        }
        this.zza.zzi();
    }
}
