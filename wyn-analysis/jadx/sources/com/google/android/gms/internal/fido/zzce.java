package com.google.android.gms.internal.fido;

import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
final class zzce extends zzcg {
    final char[] zza;

    private zzce(zzcd zzcdVar) {
        super(zzcdVar, null);
        this.zza = new char[512];
        zzap.zzc(zzcdVar.zzf.length == 16);
        for (int i5 = 0; i5 < 256; i5++) {
            this.zza[i5] = zzcdVar.zza(i5 >>> 4);
            this.zza[i5 | 256] = zzcdVar.zza(i5 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    public final zzch zza(zzcd zzcdVar, Character ch) {
        return new zzce(zzcdVar);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    public final void zzb(Appendable appendable, byte[] bArr, int i5, int i10) throws IOException {
        zzap.zze(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & ForkServer.ERROR;
            appendable.append(this.zza[i12]);
            appendable.append(this.zza[i12 | 256]);
        }
    }

    public zzce(String str, String str2) {
        this(new zzcd("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
