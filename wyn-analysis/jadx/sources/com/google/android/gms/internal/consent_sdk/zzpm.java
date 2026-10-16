package com.google.android.gms.internal.consent_sdk;

import cb.AbstractC1593a;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import ka.AbstractC3256n;
import wg.b;

/* loaded from: classes.dex */
public abstract class zzpm implements Iterable, Serializable {
    public static final zzpm zzb = new zzpk(zzqs.zzb);
    private int zza = 0;

    static {
        int i5 = zzpc.zza;
    }

    public static int zzi(int i5, int i10, int i11) {
        if (((i11 - 47) | 47) >= 0) {
            return 47;
        }
        throw new IndexOutOfBoundsException(AbstractC3256n.g(i11, "End index: 47 >= "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzpm)) {
            return false;
        }
        zzpm zzpmVar = (zzpm) obj;
        int iZzd = zzd();
        if (iZzd != zzpmVar.zzd()) {
            return false;
        }
        if (iZzd == 0) {
            return true;
        }
        int i5 = this.zza;
        int i10 = zzpmVar.zza;
        if (i5 == 0 || i10 == 0 || i5 == i10) {
            return zzh(zzpmVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZze = this.zza;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zza = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzpf(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return b.c(AbstractC1593a.k(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzsk.zza(this) : zzsk.zza(zzf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i5);

    public abstract byte zzb(int i5);

    public abstract int zzd();

    public abstract int zze(int i5, int i10, int i11);

    public abstract zzpm zzf(int i5, int i10);

    public abstract void zzg(zzpe zzpeVar) throws IOException;

    public abstract boolean zzh(zzpm zzpmVar);
}
