package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzfy extends zzqm implements zzrr {
    private static final zzfy zzb;

    static {
        zzfy zzfyVar = new zzfy();
        zzb = zzfyVar;
        zzqm.zzz(zzfy.class, zzfyVar);
    }

    private zzfy() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        zzfx zzfxVar = null;
        if (i10 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new zzfy();
        }
        if (i10 == 4) {
            return new zzfw(zzfxVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
