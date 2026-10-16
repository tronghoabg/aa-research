package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzbgb {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() throws IOException {
        String string;
        try {
            this.zzb.close();
        } catch (IOException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("HashManager: Unable to convert to Base64.", e7);
        }
        try {
            try {
                this.zza.close();
                string = this.zza.toString();
            } catch (IOException e10) {
                int i10 = G6.L.f4523b;
                H6.l.d("HashManager: Unable to convert to Base64.", e10);
                string = "";
            }
            return string;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
