package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class zzgtk extends zzgth implements Serializable {
    private final Pattern zza;

    public zzgtk(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final zzgtg zza(CharSequence charSequence) {
        return new zzgtj(this.zza.matcher(charSequence));
    }
}
