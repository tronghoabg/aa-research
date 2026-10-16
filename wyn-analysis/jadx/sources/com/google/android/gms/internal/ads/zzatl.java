package com.google.android.gms.internal.ads;

import Va.M6;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
import ka.AbstractC3256n;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
public abstract class zzatl implements Comparable {
    private final zzatw zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzatp zzf;
    private Integer zzg;
    private zzato zzh;
    private boolean zzi;
    private zzasu zzj;
    private zzatk zzk;
    private final zzasz zzl;

    public zzatl(int i5, String str, zzatp zzatpVar) {
        Uri uri;
        String host;
        this.zza = zzatw.zza ? new zzatw() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i5;
        this.zzc = str;
        this.zzf = zzatpVar;
        this.zzl = new zzasz();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzatl) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb2 = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        AbstractC3256n.p(sb2, "[ ] ", str, StringUtils.SPACE, strConcat);
        sb2.append(" NORMAL ");
        sb2.append(num);
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzatw.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzd(String str) {
        zzato zzatoVar = this.zzh;
        if (zzatoVar != null) {
            zzatoVar.zzc(this);
        }
        if (zzatw.zza) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzatj(this, str, id2));
                return;
            }
            zzatw zzatwVar = this.zza;
            zzatwVar.zza(str, id2);
            zzatwVar.zzb(toString());
        }
    }

    public final void zze(int i5) {
        zzato zzatoVar = this.zzh;
        if (zzatoVar != null) {
            zzatoVar.zzd(this, i5);
        }
    }

    public final zzatl zzf(zzato zzatoVar) {
        this.zzh = zzatoVar;
        return this;
    }

    public final zzatl zzg(int i5) {
        this.zzg = Integer.valueOf(i5);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i5 = this.zzb;
        String str = this.zzc;
        if (i5 == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return M6.t(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), string, "-", str);
    }

    public final zzatl zzj(zzasu zzasuVar) {
        this.zzj = zzasuVar;
        return this;
    }

    public final zzasu zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzast {
        return Collections.EMPTY_MAP;
    }

    public byte[] zzn() throws zzast {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z2;
        synchronized (this.zze) {
            z2 = this.zzi;
        }
        return z2;
    }

    public abstract zzatr zzr(zzath zzathVar);

    public abstract void zzs(Object obj);

    public final void zzt(zzatu zzatuVar) {
        zzatp zzatpVar;
        synchronized (this.zze) {
            zzatpVar = this.zzf;
        }
        zzatpVar.zza(zzatuVar);
    }

    public final void zzu(zzatk zzatkVar) {
        synchronized (this.zze) {
            this.zzk = zzatkVar;
        }
    }

    public final void zzv(zzatr zzatrVar) {
        zzatk zzatkVar;
        synchronized (this.zze) {
            zzatkVar = this.zzk;
        }
        if (zzatkVar != null) {
            zzatkVar.zza(this, zzatrVar);
        }
    }

    public final void zzw() {
        zzatk zzatkVar;
        synchronized (this.zze) {
            zzatkVar = this.zzk;
        }
        if (zzatkVar != null) {
            zzatkVar.zzb(this);
        }
    }

    public final /* synthetic */ zzatw zzx() {
        return this.zza;
    }

    public final zzasz zzy() {
        return this.zzl;
    }
}
