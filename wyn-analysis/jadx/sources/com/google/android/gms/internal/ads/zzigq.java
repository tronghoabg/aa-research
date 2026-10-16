package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzigq extends zzidl {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, com.google.android.gms.common.api.f.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzidl zzd;
    private final zzidl zze;
    private final int zzf;
    private final int zzg;

    public /* synthetic */ zzigq(zzidl zzidlVar, zzidl zzidlVar2, byte[] bArr) {
        this(zzidlVar, zzidlVar2);
    }

    private static zzidl zzG(zzidl zzidlVar, zzidl zzidlVar2) {
        int iZzb = zzidlVar.zzb();
        int iZzb2 = zzidlVar2.zzb();
        byte[] bArr = new byte[iZzb + iZzb2];
        zzidlVar.zzz(bArr, 0, 0, iZzb);
        zzidlVar2.zzz(bArr, 0, iZzb, iZzb2);
        return zzidl.zzv(bArr);
    }

    public static zzidl zzk(zzidl zzidlVar, zzidl zzidlVar2) {
        if (zzidlVar2.zzb() == 0) {
            return zzidlVar;
        }
        if (zzidlVar.zzb() == 0) {
            return zzidlVar2;
        }
        int iZzb = zzidlVar2.zzb() + zzidlVar.zzb();
        if (iZzb < 128) {
            return zzG(zzidlVar, zzidlVar2);
        }
        if (zzidlVar instanceof zzigq) {
            zzigq zzigqVar = (zzigq) zzidlVar;
            zzidl zzidlVar3 = zzigqVar.zze;
            if (zzidlVar2.zzb() + zzidlVar3.zzb() < 128) {
                return new zzigq(zzigqVar.zzd, zzG(zzidlVar3, zzidlVar2));
            }
            zzidl zzidlVar4 = zzigqVar.zzd;
            if (zzidlVar4.zzp() > zzidlVar3.zzp() && zzigqVar.zzg > zzidlVar2.zzp()) {
                return new zzigq(zzidlVar4, new zzigq(zzidlVar3, zzidlVar2));
            }
        }
        return iZzb >= zzn(Math.max(zzidlVar.zzp(), zzidlVar2.zzp()) + 1) ? new zzigq(zzidlVar, zzidlVar2) : zzigo.zza(zzidlVar, zzidlVar2, new ArrayDeque());
    }

    public static int zzn(int i5) {
        int[] iArr = zzb;
        int length = iArr.length;
        return i5 >= 47 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : iArr[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzidl, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzign(this);
    }

    public final /* synthetic */ zzidl zzF() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final byte zza(int i5) {
        int i10 = this.zzf;
        return i5 < i10 ? this.zzd.zza(i5) : this.zze.zza(i5 - i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzc(int i5, int i10) {
        return zzd(i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzd(int i5, int i10) {
        int i11 = this.zzc;
        int iZzD = zzidl.zzD(i5, i10, i11);
        if (iZzD == 0) {
            return zzidl.zza;
        }
        if (iZzD == i11) {
            return this;
        }
        int i12 = this.zzf;
        if (i10 <= i12) {
            return this.zzd.zzc(i5, i10);
        }
        int i13 = i10 - i12;
        if (i5 >= i12) {
            return this.zze.zzc(i5 - i12, i13);
        }
        zzidl zzidlVar = this.zzd;
        return new zzigq(zzidlVar.zzc(i5, zzidlVar.zzb()), this.zze.zzc(0, i13));
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final void zze(byte[] bArr, int i5, int i10, int i11) {
        int i12 = i5 + i11;
        int i13 = this.zzf;
        if (i12 <= i13) {
            this.zzd.zze(bArr, i5, i10, i11);
        } else {
            if (i5 >= i13) {
                this.zze.zze(bArr, i5 - i13, i10, i11);
                return;
            }
            int i14 = i13 - i5;
            this.zzd.zze(bArr, i5, i10, i14);
            this.zze.zze(bArr, 0, i10 + i14, i11 - i14);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final void zzg(zzidc zzidcVar) throws IOException {
        this.zzd.zzg(zzidcVar);
        this.zze.zzg(zzidcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final String zzh(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzi() {
        zzigp zzigpVar = new zzigp(this, null);
        while (zzigpVar.hasNext()) {
            if (!zzigpVar.next().zzi()) {
                return zzihp.zza(zzA());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzj(zzidl zzidlVar) {
        byte[] bArr = null;
        zzigp zzigpVar = new zzigp(this, bArr);
        zzidi zzidiVarZza = zzigpVar.next();
        zzigp zzigpVar2 = new zzigp(zzidlVar, bArr);
        zzidi zzidiVarZza2 = zzigpVar2.next();
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int iZzb = zzidiVarZza.zzb() - i5;
            int iZzb2 = zzidiVarZza2.zzb() - i10;
            int iMin = Math.min(iZzb, iZzb2);
            if (!(i5 == 0 ? zzidiVarZza.zzk(zzidiVarZza2, i10, iMin) : zzidiVarZza2.zzk(zzidiVarZza, i5, iMin))) {
                return false;
            }
            i11 += iMin;
            int i12 = this.zzc;
            if (i11 >= i12) {
                if (i11 == i12) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzb) {
                i5 = 0;
                zzidiVarZza = zzigpVar.next();
            } else {
                i5 += iMin;
                zzidiVarZza = zzidiVarZza;
            }
            if (iMin == iZzb2) {
                zzidiVarZza2 = zzigpVar2.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final int zzl(int i5, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.zzf;
        if (i12 <= i13) {
            return this.zzd.zzl(i5, i10, i11);
        }
        if (i10 >= i13) {
            return this.zze.zzl(i5, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.zze.zzl(this.zzd.zzl(i5, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidp zzm() {
        ArrayList arrayList = new ArrayList();
        zzigp zzigpVar = new zzigp(this, null);
        while (zzigpVar.hasNext()) {
            arrayList.add(zzigpVar.next().zzf());
        }
        return zzidp.zzH(new zzifi(arrayList), 4096);
    }

    public final /* synthetic */ zzidl zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* renamed from: zzr */
    public final zzidg iterator() {
        return new zzign(this);
    }

    private zzigq(zzidl zzidlVar, zzidl zzidlVar2) {
        this.zzd = zzidlVar;
        this.zze = zzidlVar2;
        int iZzb = zzidlVar.zzb();
        this.zzf = iZzb;
        this.zzc = zzidlVar2.zzb() + iZzb;
        this.zzg = Math.max(zzidlVar.zzp(), zzidlVar2.zzp()) + 1;
    }
}
