package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzhdy implements zzhem {
    private static final Charset zza = Charset.forName("UTF-8");
    private final InputStream zzb;

    private zzhdy(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzhdy zza(String str) {
        return new zzhdy(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzibr zzibrVar) throws IOException {
        if (!(zzibrVar instanceof zzibv)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzibrVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jZzc = zzhlz.zzc(zzibrVar.zzg().zzh());
            if (jZzc > 4294967295L || jZzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jZzc;
        } catch (NumberFormatException e7) {
            throw new IOException(e7);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzhem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzhtk zzb() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhdy.zzb():com.google.android.gms.internal.ads.zzhtk");
    }
}
