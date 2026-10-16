package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzgzy {
    public static final FileOutputStream zza(File file, zzgxd zzgxdVar, zzgzp zzgzpVar) throws IOException {
        return new FileOutputStream(file, zzgxdVar.contains(zzgzx.APPEND));
    }
}
