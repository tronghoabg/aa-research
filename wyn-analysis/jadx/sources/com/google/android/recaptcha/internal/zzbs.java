package com.google.android.recaptcha.internal;

import Bf.r;
import android.content.Context;
import ff.o;
import ff.p;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.b;
import zf.c;

/* loaded from: classes4.dex */
public final class zzbs implements zzav {

    @NotNull
    private final Context zza;

    @NotNull
    private final String zzb = "rce_";

    public zzbs(@NotNull Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzav
    @Nullable
    public final String zza(@NotNull String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzbx.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (r.k0(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final void zzc(@NotNull String str, @NotNull String str2) throws GeneralSecurityException, IOException {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(p.a0(cVar, 10));
        Iterator it = cVar.iterator();
        while (((b) it).f48498c) {
            b bVar = (b) it;
            int i5 = bVar.f48499d;
            if (i5 != bVar.f48497b) {
                bVar.f48499d = bVar.f48496a + i5;
            } else {
                if (!bVar.f48498c) {
                    throw new NoSuchElementException();
                }
                bVar.f48498c = false;
            }
            arrayList.add(Character.valueOf((char) i5));
        }
        List listV0 = o.V0(arrayList);
        Collections.shuffle(listV0);
        String strW0 = o.w0(((ArrayList) listV0).subList(0, 8), "", null, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(strW0)));
        zzbx.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final boolean zzd(@NotNull String str) {
        File file;
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i5];
                    if (AbstractC3340k.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i5++;
                }
            }
        } catch (Exception unused) {
        }
        return file != null;
    }
}
