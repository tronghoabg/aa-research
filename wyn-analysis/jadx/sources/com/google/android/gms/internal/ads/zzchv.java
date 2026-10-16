package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import G6.C0554s;
import G6.C0555t;
import G6.C0556u;
import G6.U;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzchv {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final H6.a zzd;
    private final zzbjj zze;
    private final zzbjm zzf;
    private final C0556u zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcha zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = C0392q.f2477g.f2482e.nextInt(100) < ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzos)).intValue();
    }

    public zzchv(Context context, H6.a aVar, String str, zzbjm zzbjmVar, zzbjj zzbjjVar) {
        C0555t c0555t = new C0555t();
        c0555t.b("min_1", Double.MIN_VALUE, 1.0d);
        c0555t.b("1_5", 1.0d, 5.0d);
        c0555t.b("5_10", 5.0d, 10.0d);
        c0555t.b("10_20", 10.0d, 20.0d);
        c0555t.b("20_30", 20.0d, 30.0d);
        c0555t.b("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = new C0556u(c0555t);
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = aVar;
        this.zzc = str;
        this.zzf = zzbjmVar;
        this.zze = zzbjjVar;
        String str2 = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzat);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            try {
                this.zzh[i5] = Long.parseLong(strArrSplit[i5]);
            } catch (NumberFormatException e7) {
                int i10 = G6.L.f4523b;
                H6.l.g("Unable to parse frame hash target time number.", e7);
                this.zzh[i5] = -1;
            }
        }
    }

    public final void zza(zzcha zzchaVar) {
        zzbjm zzbjmVar = this.zzf;
        zzbje.zza(zzbjmVar, this.zze, "vpc2");
        this.zzj = true;
        zzbjmVar.zzd("vpn", zzchaVar.zza());
        this.zzo = zzchaVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbje.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        Bundle bundleK;
        if (!zza || this.zzp) {
            return;
        }
        Bundle bundleB = AbstractC3256n.b("type", "native-player-metrics");
        bundleB.putString("request", this.zzc);
        bundleB.putString("player", this.zzo.zza());
        C0556u c0556u = this.zzg;
        c0556u.getClass();
        String[] strArr = c0556u.f4637a;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i5 = 0; i5 < strArr.length; i5++) {
            String str = strArr[i5];
            double d3 = c0556u.f4639c[i5];
            double d5 = c0556u.f4638b[i5];
            int i10 = c0556u.f4640d[i5];
            arrayList.add(new C0554s(str, d3, d5, i10 / c0556u.f4641e, i10));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0554s c0554s = (C0554s) it.next();
            String str2 = c0554s.f4629a;
            bundleB.putString("fps_c_".concat(String.valueOf(str2)), Integer.toString(c0554s.f4633e));
            bundleB.putString("fps_p_".concat(String.valueOf(str2)), Double.toString(c0554s.f4632d));
        }
        int i11 = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i11 >= jArr.length) {
                break;
            }
            String str3 = this.zzi[i11];
            if (str3 != null) {
                Long lValueOf = Long.valueOf(jArr[i11]);
                new StringBuilder(lValueOf.toString().length() + 3);
                bundleB.putString("fh_".concat(lValueOf.toString()), str3);
            }
            i11++;
        }
        final Context context = this.zzb;
        H6.a aVar = this.zzd;
        final U u10 = C6.n.f1857D.f1863c;
        String str4 = aVar.f4927a;
        u10.getClass();
        bundleB.putString("device", U.O());
        zzbio zzbioVar = zzbix.zza;
        C0395s c0395s = C0395s.f2489e;
        bundleB.putString("eids", TextUtils.join(",", c0395s.f2490a.zze()));
        if (bundleB.isEmpty()) {
            int i12 = G6.L.f4523b;
            H6.l.a("Empty or null bundle.");
        } else {
            final String str5 = (String) c0395s.f2492c.zzd(zzbix.zzmh);
            boolean andSet = u10.f4566d.getAndSet(true);
            AtomicReference atomicReference = u10.f4565c;
            if (!andSet) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: G6.P
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str6) {
                        u10.f4565c.set(Fe.c.K(context, str5));
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    bundleK = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    bundleK = Fe.c.K(context, str5);
                }
                atomicReference.set(bundleK);
            }
            bundleB.putAll((Bundle) atomicReference.get());
        }
        H6.f fVar = C0392q.f2477g.f2478a;
        H6.f.a(context, str4, bundleB, new S3.c(context, false, str4, 7));
        this.zzp = true;
    }

    public final void zzd(zzcha zzchaVar) {
        if (this.zzl && !this.zzm) {
            if (G6.L.m() && !this.zzm) {
                G6.L.k("VideoMetricsMixin first frame");
            }
            zzbje.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        C6.n.f1857D.k.getClass();
        long jNanoTime = System.nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            long j8 = jNanoTime - this.zzr;
            C0556u c0556u = this.zzg;
            double d3 = nanos / j8;
            c0556u.f4641e++;
            int i5 = 0;
            while (true) {
                double[] dArr = c0556u.f4639c;
                if (i5 >= dArr.length) {
                    break;
                }
                double d5 = dArr[i5];
                if (d5 <= d3 && d3 < c0556u.f4638b[i5]) {
                    int[] iArr = c0556u.f4640d;
                    iArr[i5] = iArr[i5] + 1;
                }
                if (d3 < d5) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        this.zzq = this.zzn;
        this.zzr = jNanoTime;
        long jLongValue = ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzau)).longValue();
        long jZzh = zzchaVar.zzh();
        int i10 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && jLongValue > Math.abs(jZzh - this.zzh[i10])) {
                int i11 = 8;
                Bitmap bitmap = zzchaVar.getBitmap(8, 8);
                long j10 = 63;
                long j11 = 0;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j10);
                        j10--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr[i10] = String.format("%016X", Long.valueOf(j11));
                return;
            }
            i10++;
        }
    }

    public final void zze() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        zzbje.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzf() {
        this.zzn = false;
    }
}
