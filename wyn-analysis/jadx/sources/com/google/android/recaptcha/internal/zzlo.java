package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
final class zzlo implements zzlv {
    private final zzlv[] zza;

    public zzlo(zzlv... zzlvVarArr) {
        this.zza = zzlvVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final zzlu zzb(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            zzlv zzlvVar = this.zza[i5];
            if (zzlvVar.zzc(cls)) {
                return zzlvVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final boolean zzc(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            if (this.zza[i5].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
