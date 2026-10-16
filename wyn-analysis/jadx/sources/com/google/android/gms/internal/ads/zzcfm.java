package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.v1;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class zzcfm {
    final String zzf;
    private final G6.N zzl;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    private final Object zzk = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;
    private int zzm = 0;
    private final Map zzn = new HashMap();
    private final Map zzo = new HashMap();

    public zzcfm(String str, G6.N n10) {
        this.zzf = str;
        this.zzl = n10;
    }

    private final void zzj() {
        if (((Boolean) zzble.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final void zza() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzb() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }

    public final int zzd() {
        int i5;
        synchronized (this.zzj) {
            i5 = this.zzi;
        }
        return i5;
    }

    public final void zze(v1 v1Var, long j8) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                G6.O o7 = (G6.O) this.zzl;
                long jS = o7.s();
                C6.n.f1857D.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.zzb == -1) {
                    if (jCurrentTimeMillis - jS > ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzbL)).longValue()) {
                        this.zzd = -1;
                    } else {
                        this.zzd = o7.u();
                    }
                    this.zzb = j8;
                    this.zza = j8;
                } else {
                    this.zza = j8;
                }
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeF)).booleanValue() || (bundle = v1Var.f2506c) == null || bundle.getInt("gw", 2) != 1) {
                    this.zzc++;
                    int i5 = this.zzd + 1;
                    this.zzd = i5;
                    if (i5 == 0) {
                        this.zze = 0L;
                        o7.v(jCurrentTimeMillis);
                    } else {
                        this.zze = jCurrentTimeMillis - o7.w();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        zzj();
    }

    public final void zzg() {
        zzj();
    }

    public final Bundle zzh(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!((G6.O) this.zzl).D()) {
                    bundle.putString("session_id", this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context contextZza = zzcbu.zza(context);
                int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z2 = false;
                if (identifier == 0) {
                    int i5 = G6.L.f4523b;
                    H6.l.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextZza.getPackageManager().getActivityInfo(new ComponentName(contextZza.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z2 = true;
                        } else {
                            int i10 = G6.L.f4523b;
                            H6.l.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i11 = G6.L.f4523b;
                        H6.l.f("Fail to fetch AdActivity theme");
                        H6.l.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z2);
                bundle.putInt("consent_form_action_identifier", zzd());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final zzcfl zzi(Set set, String str) {
        synchronized (this.zzk) {
            try {
                int i5 = this.zzm;
                this.zzm = i5 + 1;
                if (set.isEmpty()) {
                    return new zzcfl(i5, -1, -1);
                }
                TreeSet treeSet = new TreeSet(set);
                StringBuilder sb2 = new StringBuilder();
                Iterator it = treeSet.iterator();
                if (it.hasNext()) {
                    CharSequence charSequence = (CharSequence) it.next();
                    while (true) {
                        sb2.append(charSequence);
                        if (!it.hasNext()) {
                            break;
                        }
                        sb2.append((CharSequence) ",");
                        charSequence = (CharSequence) it.next();
                    }
                }
                String string = sb2.toString();
                Map map = this.zzn;
                Integer num = (Integer) map.get(string);
                int iIntValue = 0;
                int iIntValue2 = num == null ? 0 : num.intValue();
                map.put(string, Integer.valueOf(iIntValue2 + 1));
                if (str == null) {
                    return new zzcfl(i5, iIntValue2, -1);
                }
                StringBuilder sb3 = new StringBuilder(str.length() + 1 + String.valueOf(string).length());
                sb3.append(str);
                sb3.append("|");
                sb3.append(string);
                String string2 = sb3.toString();
                Map map2 = this.zzo;
                Integer num2 = (Integer) map2.get(string2);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                map2.put(string2, Integer.valueOf(iIntValue + 1));
                return new zzcfl(i5, iIntValue2, iIntValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
