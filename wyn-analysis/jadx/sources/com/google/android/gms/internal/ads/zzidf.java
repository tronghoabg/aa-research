package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
final class zzidf extends zzidi {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public zzidf(byte[] bArr, int i5, int i10) {
        super(null);
        zzidl.zzD(i5, i5 + i10, bArr.length);
        this.zzb = bArr;
        this.zzc = i5;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final byte zza(int i5) {
        return this.zzb[this.zzc + i5];
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzc(int i5, int i10) {
        int iZzD = zzidl.zzD(i5, i10, this.zzd);
        return iZzD == 0 ? zzidl.zza : new zzidf(this.zzb, this.zzc + i5, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzd(int i5, int i10) {
        int iZzD = zzidl.zzD(i5, i10, this.zzd);
        return iZzD == 0 ? zzidl.zza : new zzidf(this.zzb, this.zzc + i5, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final void zze(byte[] bArr, int i5, int i10, int i11) {
        System.arraycopy(this.zzb, this.zzc + i5, bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final void zzg(zzidc zzidcVar) throws IOException {
        zzidcVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final String zzh(Charset charset) {
        return new String(this.zzb, this.zzc, this.zzd, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i5 = this.zzc;
        return zzihp.zzb(bArr, i5, this.zzd + i5);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzj(zzidl zzidlVar) {
        return ((zzidlVar instanceof zzidj) || (zzidlVar instanceof zzidf)) ? zzk(zzidlVar, 0, this.zzd) : zzidlVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidi
    public final boolean zzk(zzidl zzidlVar, int i5, int i10) {
        if (i10 > zzidlVar.zzb()) {
            int i11 = this.zzd;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
            sb2.append("Length too large: ");
            sb2.append(i10);
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i12 = i5 + i10;
        if (i12 > zzidlVar.zzb()) {
            int iZzb = zzidlVar.zzb();
            int length = String.valueOf(i5).length();
            StringBuilder sb3 = new StringBuilder(length + 24 + String.valueOf(i10).length() + 2 + String.valueOf(iZzb).length());
            N0.a.l(i5, i10, "Ran off end of other: ", ", ", sb3);
            throw new IllegalArgumentException(N0.a.d(iZzb, ", ", sb3));
        }
        if (zzidlVar instanceof zzidj) {
            return zzidl.zzE(this.zzb, this.zzc, ((zzidj) zzidlVar).zzn(), i5, i10);
        }
        if (zzidlVar instanceof zzidf) {
            zzidf zzidfVar = (zzidf) zzidlVar;
            return zzidl.zzE(this.zzb, this.zzc, zzidfVar.zzb, zzidfVar.zzc + i5, i10);
        }
        zzidl zzidlVarZzd = zzidlVar.zzd(i5, i12);
        int i13 = this.zzc;
        return zzidlVarZzd.equals(zzd(i13, i10 + i13));
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final int zzl(int i5, int i10, int i11) {
        return zzifc.zzc(i5, this.zzb, this.zzc + i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidp zzm() {
        return zzidp.zzI(this.zzb, this.zzc, this.zzd, true);
    }

    public final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    public final /* synthetic */ int zzo() {
        return this.zzc;
    }
}
