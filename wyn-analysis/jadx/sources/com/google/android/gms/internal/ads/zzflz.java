package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
public final class zzflz {
    private final Pattern zza;

    public zzflz() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) C0395s.f2489e.f2492c.zzd(zzbix.zzhU));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.zza = patternCompile;
    }

    public final String zza(String str) {
        Pattern pattern = this.zza;
        if (pattern == null || str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
