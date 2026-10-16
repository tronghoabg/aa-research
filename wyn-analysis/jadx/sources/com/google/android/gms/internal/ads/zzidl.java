package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import cb.AbstractC1593a;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class zzidl implements Iterable<Byte>, Serializable {
    public static final zzidl zza = new zzidj(zzifc.zza);
    private int zzb = 0;

    static {
        int i5 = zzicy.zza;
    }

    public static zzidk zzC() {
        return new zzidk(128);
    }

    public static int zzD(int i5, int i10, int i11) {
        int i12 = i10 - i5;
        if ((i5 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0279p0.o(new StringBuilder(String.valueOf(i5).length() + 21), "Beginning index: ", i5, " < 0"));
        }
        if (i10 < i5) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.consent_sdk.a.u(i5, i10, "Beginning index larger than ending index: ", ", ", new StringBuilder(String.valueOf(i5).length() + 44 + String.valueOf(i10).length())));
        }
        throw new IndexOutOfBoundsException(com.google.android.gms.internal.consent_sdk.a.u(i10, i11, "End index: ", " >= ", new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(i11).length())));
    }

    public static /* synthetic */ boolean zzE(byte[] bArr, int i5, byte[] bArr2, int i10, int i11) {
        int i12 = i5 + i11;
        zzD(i5, i12, bArr.length);
        zzD(i10, i11 + i10, bArr2.length);
        while (i5 < i12) {
            if (bArr[i5] != bArr2[i10]) {
                return false;
            }
            i5++;
            i10++;
        }
        return true;
    }

    private static zzidl zzk(Iterator it, int i5) {
        if (i5 <= 0) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "length (", ") must be >= 1"));
        }
        if (i5 == 1) {
            return (zzidl) it.next();
        }
        int i10 = i5 >>> 1;
        zzidl zzidlVarZzk = zzk(it, i10);
        zzidl zzidlVarZzk2 = zzk(it, i5 - i10);
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - zzidlVarZzk.zzb() >= zzidlVarZzk2.zzb()) {
            return zzigq.zzk(zzidlVarZzk, zzidlVarZzk2);
        }
        int iZzb = zzidlVarZzk.zzb();
        int iZzb2 = zzidlVarZzk2.zzb();
        throw new IllegalArgumentException(com.google.android.gms.internal.consent_sdk.a.u(iZzb, iZzb2, "ByteString would be too long: ", "+", new StringBuilder(String.valueOf(iZzb).length() + 31 + String.valueOf(iZzb2).length())));
    }

    public static zzidl zzt(byte[] bArr, int i5, int i10) {
        try {
            return zzu(bArr, i5, i10, false);
        } catch (zzifh e7) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e7);
        }
    }

    public static zzidl zzu(byte[] bArr, int i5, int i10, boolean z2) throws zzifh {
        if (i10 == 0) {
            return zza;
        }
        zzD(i5, i5 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        return new zzidj(bArr2);
    }

    public static zzidl zzv(byte[] bArr) {
        try {
            return zzw(bArr, false);
        } catch (zzifh e7) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e7);
        }
    }

    public static zzidl zzw(byte[] bArr, boolean z2) throws zzifh {
        return bArr.length == 0 ? zza : new zzidj(bArr);
    }

    public static zzidl zzx(String str) {
        return str.isEmpty() ? zza : new zzidj(str.getBytes(StandardCharsets.UTF_8));
    }

    public static zzidl zzy(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzidl)) {
            return false;
        }
        zzidl zzidlVar = (zzidl) obj;
        int iZzb = zzb();
        if (iZzb != zzidlVar.zzb()) {
            return false;
        }
        if (iZzb == 0) {
            return true;
        }
        int i5 = this.zzb;
        int i10 = zzidlVar.zzb;
        if (i5 == 0 || i10 == 0 || i5 == i10) {
            return zzj(zzidlVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzl = this.zzb;
        if (iZzl == 0) {
            int iZzb = zzb();
            iZzl = zzl(iZzb, 0, iZzb);
            if (iZzl == 0) {
                iZzl = 1;
            }
            this.zzb = iZzl;
        }
        return iZzl;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return wg.b.c(AbstractC1593a.k(zzb(), "<ByteString@", hexString, " size=", " contents=\""), zzb() <= 50 ? zzigz.zza(zzA()) : zzigz.zza(zzd(0, 47).zzA()).concat("..."), "\">");
    }

    public final byte[] zzA() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzifc.zza;
        }
        byte[] bArr = new byte[iZzb];
        zze(bArr, 0, 0, iZzb);
        return bArr;
    }

    public final String zzB(Charset charset) {
        return zzs() ? "" : zzh(charset);
    }

    public abstract byte zza(int i5);

    public abstract int zzb();

    public abstract zzidl zzc(int i5, int i10);

    public abstract zzidl zzd(int i5, int i10);

    public abstract void zze(byte[] bArr, int i5, int i10, int i11);

    public abstract ByteBuffer zzf();

    public abstract void zzg(zzidc zzidcVar) throws IOException;

    public abstract String zzh(Charset charset);

    public abstract boolean zzi();

    public abstract boolean zzj(zzidl zzidlVar);

    public abstract int zzl(int i5, int i10, int i11);

    public abstract zzidp zzm();

    public abstract int zzp();

    public abstract boolean zzq();

    @Override // java.lang.Iterable
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zzidg iterator() {
        return new zzidd(this);
    }

    public final boolean zzs() {
        return zzb() == 0;
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i5, int i10, int i11) {
        zzD(0, i11, zzb());
        zzD(i10, i10 + i11, bArr.length);
        if (i11 > 0) {
            zze(bArr, 0, i10, i11);
        }
    }
}
