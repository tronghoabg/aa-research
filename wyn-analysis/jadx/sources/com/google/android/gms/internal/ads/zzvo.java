package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes3.dex */
public class zzvo extends zziv {
    public final int zza;

    public zzvo(Throwable th, zzvp zzvpVar) {
        super("Decoder failed: ".concat(String.valueOf(zzvpVar == null ? null : zzvpVar.zza)), th);
        boolean z2 = th instanceof MediaCodec.CodecException;
        if (z2) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zza = z2 ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
