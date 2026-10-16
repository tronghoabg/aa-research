package com.google.android.recaptcha.internal;

import java.io.Serializable;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
final class zzhm extends zzhn implements Serializable {
    final byte[] zza;

    public zzhm(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length >= 4) {
            return ((bArr[1] & ForkServer.ERROR) << 8) | (bArr[0] & ForkServer.ERROR) | ((bArr[2] & ForkServer.ERROR) << 16) | ((bArr[3] & ForkServer.ERROR) << 24);
        }
        throw new IllegalStateException(zzha.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final boolean zzc(zzhn zzhnVar) {
        if (this.zza.length != zzhnVar.zze().length) {
            return false;
        }
        boolean z2 = true;
        int i5 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i5 >= bArr.length) {
                return z2;
            }
            z2 &= bArr[i5] == zzhnVar.zze()[i5];
            i5++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final byte[] zze() {
        return this.zza;
    }
}
