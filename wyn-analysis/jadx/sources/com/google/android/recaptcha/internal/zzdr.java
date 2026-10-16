package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzdr {
    public static final void zza(@NotNull HttpURLConnection httpURLConnection) throws zzbj, IOException {
        try {
            httpURLConnection.connect();
        } catch (SocketTimeoutException e7) {
            throw new zzbj(zzbh.zzc, zzbg.zzad, e7.getMessage());
        } catch (IOException e10) {
            throw new zzbj(zzbh.zzc, zzbg.zzae, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbj(zzbh.zzc, zzbg.zzak, e11.getMessage());
        }
    }

    @NotNull
    public static final zzbj zzb(int i5) {
        return i5 != 403 ? i5 != 404 ? i5 != 503 ? new zzbj(zzbh.zzb, zzbg.zzK, null) : new zzbj(zzbh.zzi, zzbg.zzJ, null) : new zzbj(zzbh.zzc, zzbg.zzi, null) : new zzbj(zzbh.zzi, zzbg.zzJ, null);
    }

    @NotNull
    public static final InputStream zzc(@NotNull HttpURLConnection httpURLConnection) throws zzbj {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException e7) {
            throw new zzbj(zzbh.zzc, zzbg.zzaf, e7.getMessage());
        } catch (Exception e10) {
            throw new zzbj(zzbh.zzc, zzbg.zzal, e10.getMessage());
        }
    }

    @NotNull
    public static final OutputStream zzd(@NotNull HttpURLConnection httpURLConnection) throws zzbj {
        try {
            return httpURLConnection.getOutputStream();
        } catch (IOException e7) {
            throw new zzbj(zzbh.zzc, zzbg.zzaf, e7.getMessage());
        } catch (Exception e10) {
            throw new zzbj(zzbh.zzc, zzbg.zzal, e10.getMessage());
        }
    }
}
