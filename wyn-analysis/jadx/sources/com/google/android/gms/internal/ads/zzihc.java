package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzihc extends RuntimeException {
    public zzihc(zzifz zzifzVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzifh zza() {
        return new zzifh(getMessage());
    }
}
