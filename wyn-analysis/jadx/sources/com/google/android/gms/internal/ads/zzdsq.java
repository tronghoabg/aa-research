package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.C0559x;
import G6.C0560y;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import n7.C3597b;
import n7.InterfaceC3596a;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class zzdsq {
    private final C0560y zza;
    private final InterfaceC3596a zzb;
    private final Executor zzc;

    public zzdsq(C0560y c0560y, InterfaceC3596a interfaceC3596a, Executor executor) {
        this.zza = c0560y;
        this.zzb = interfaceC3596a;
        this.zzc = executor;
    }

    private final Bitmap zzd(byte[] bArr, double d3, boolean z2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d3 * 160.0d);
        if (!z2) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        zzbio zzbioVar = zzbix.zzhj;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zze(bArr, options);
            options.inJustDecodeBounds = false;
            int i5 = options.outWidth * options.outHeight;
            if (i5 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i5 - 1) / ((Integer) c0395s.f2492c.zzd(zzbix.zzhk)).intValue())) / 2);
            }
        }
        return zze(bArr, options);
    }

    private final Bitmap zze(byte[] bArr, BitmapFactory.Options options) {
        ((C3597b) this.zzb).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j8 = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z2 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z2).length());
            N0.a.l(width, height, "Decoded image w: ", " h:", sb2);
            sb2.append(" bytes: ");
            sb2.append(allocationByteCount);
            sb2.append(" time: ");
            sb2.append(j8);
            sb2.append(" on ui thread: ");
            sb2.append(z2);
            G6.L.k(sb2.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final p8.p zza(final String str, final double d3, final boolean z2) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhl)).booleanValue() && str != null && str.startsWith("data:")) {
            return zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzdso
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(str, d3, z2);
                }
            }, this.zzc);
        }
        this.zza.getClass();
        zzcgd zzcgdVar = new zzcgd();
        C0560y.f4647a.zzb(new C0559x(str, zzcgdVar));
        return zzhcf.zzk(zzcgdVar, new zzgti() { // from class: com.google.android.gms.internal.ads.zzdsp
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb(d3, z2, (zzath) obj);
            }
        }, this.zzc);
    }

    public final /* synthetic */ Bitmap zzb(double d3, boolean z2, zzath zzathVar) {
        return zzd(zzathVar.zzb, d3, z2);
    }

    public final /* synthetic */ Bitmap zzc(String str, double d3, boolean z2) {
        int iIndexOf = str.indexOf(",");
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Bad data URL: no ',' found for base64 data");
        }
        if (!str.substring(0, iIndexOf).endsWith(";base64")) {
            throw new IllegalArgumentException("Bad data URL: only base64 is supported");
        }
        int iIndexOf2 = str.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        int iIndexOf3 = str.indexOf(";");
        if (iIndexOf2 == -1 || !str.substring(iIndexOf2 + 1, iIndexOf3).startsWith("image/")) {
            throw new IllegalArgumentException("Bad data URL: only image media is supported");
        }
        return zzd(Base64.decode(str.substring(iIndexOf + 1), 0), d3, z2);
    }
}
