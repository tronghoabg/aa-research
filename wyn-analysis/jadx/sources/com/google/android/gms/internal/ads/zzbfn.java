package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzbfn {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzbgc zze;
    private final zzbgj zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzbfn(int i5, int i10, int i11, int i12, int i13, int i14, int i15, boolean z2) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z2;
        this.zze = new zzbgc(i12);
        this.zzf = new zzbgj(i13, i14, i15);
    }

    private final void zzm(String str, boolean z2, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                try {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z2) {
                        this.zzi.add(str);
                        this.zzj.add(new zzbfy(f10, f11, f12, f13, r10.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i5) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            sb2.append((String) arrayList.get(i10));
            sb2.append(' ');
            i10++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String string = sb2.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbfn)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzbfn) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i5 = this.zzl;
        int i10 = this.zzn;
        int i11 = this.zzk;
        String strZzn = zzn(arrayList, 100);
        String strZzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        int length = String.valueOf(i5).length();
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(i11).length();
        int length4 = String.valueOf(strZzn).length();
        int length5 = String.valueOf(strZzn2).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        N0.a.l(i5, i10, "ActivityContent fetchId: ", " score:", sb2);
        sb2.append(" total_length:");
        sb2.append(i11);
        sb2.append("\n text: ");
        sb2.append(strZzn);
        AbstractC3256n.p(sb2, "\n viewableText", strZzn2, "\n signture: ", str);
        return AbstractC3256n.h(sb2, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }

    public final boolean zza() {
        boolean z2;
        synchronized (this.zzg) {
            z2 = this.zzm == 0;
        }
        return z2;
    }

    public final String zzb() {
        return this.zzo;
    }

    public final String zzc() {
        return this.zzq;
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzf(String str, boolean z2, float f10, float f11, float f12, float f13) {
        zzm(str, z2, f10, f11, f12, f13);
        synchronized (this.zzg) {
            try {
                if (this.zzm < 0) {
                    int i5 = G6.L.f4523b;
                    H6.l.a("ActivityContent: negative number of WebViews.");
                }
                zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(String str, boolean z2, float f10, float f11, float f12, float f13) {
        zzm(str, z2, f10, f11, f12, f13);
    }

    public final void zzh() {
        synchronized (this.zzg) {
            try {
                int iZzj = zzj(this.zzk, this.zzl);
                if (iZzj > this.zzn) {
                    this.zzn = iZzj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            try {
                int iZzj = zzj(this.zzk, this.zzl);
                if (iZzj > this.zzn) {
                    this.zzn = iZzj;
                    C6.n nVar = C6.n.f1857D;
                    if (!((G6.O) nVar.f1868h.zzp()).o()) {
                        zzbgc zzbgcVar = this.zze;
                        this.zzo = zzbgcVar.zza(this.zzh);
                        this.zzp = zzbgcVar.zza(this.zzi);
                    }
                    if (!((G6.O) nVar.f1868h.zzp()).p()) {
                        this.zzq = this.zzf.zza(this.zzi, this.zzj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zzj(int i5, int i10) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i10 * this.zzb) + (i5 * this.zza);
    }

    public final void zzk(int i5) {
        this.zzl = i5;
    }

    public final int zzl() {
        return this.zzk;
    }
}
