package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzidj extends zzidi {
    private final byte[] zzb;

    public zzidj(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final byte zza(int i5) {
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzc(int i5, int i10) {
        byte[] bArr = this.zzb;
        int iZzD = zzidl.zzD(i5, i10, bArr.length);
        return iZzD == 0 ? zzidl.zza : new zzidf(bArr, i5, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidl zzd(int i5, int i10) {
        byte[] bArr = this.zzb;
        int iZzD = zzidl.zzD(i5, i10, bArr.length);
        return iZzD == 0 ? zzidl.zza : new zzidf(bArr, i5, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final void zze(byte[] bArr, int i5, int i10, int i11) {
        System.arraycopy(this.zzb, i5, bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final void zzg(zzidc zzidcVar) throws IOException {
        byte[] bArr = this.zzb;
        zzidcVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzi() {
        return zzihp.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final boolean zzj(zzidl zzidlVar) {
        return zzidlVar instanceof zzidj ? Arrays.equals(this.zzb, ((zzidj) zzidlVar).zzb) : zzidlVar instanceof zzidf ? zzk(zzidlVar, 0, this.zzb.length) : zzidlVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidi
    public final boolean zzk(zzidl zzidlVar, int i5, int i10) {
        if (i10 > zzidlVar.zzb()) {
            byte[] bArr = this.zzb;
            int length = String.valueOf(i10).length();
            int length2 = bArr.length;
            StringBuilder sb2 = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb2.append("Length too large: ");
            sb2.append(i10);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i11 = i5 + i10;
        if (i11 <= zzidlVar.zzb()) {
            if (zzidlVar instanceof zzidj) {
                return zzidl.zzE(this.zzb, 0, ((zzidj) zzidlVar).zzb, i5, i10);
            }
            if (!(zzidlVar instanceof zzidf)) {
                return zzidlVar.zzd(i5, i11).equals(zzd(0, i10));
            }
            zzidf zzidfVar = (zzidf) zzidlVar;
            return zzidl.zzE(this.zzb, 0, zzidfVar.zzn(), zzidfVar.zzo() + i5, i10);
        }
        int iZzb = zzidlVar.zzb();
        int length3 = String.valueOf(i5).length();
        StringBuilder sb3 = new StringBuilder(length3 + 24 + String.valueOf(i10).length() + 2 + String.valueOf(iZzb).length());
        N0.a.l(i5, i10, "Ran off end of other: ", ", ", sb3);
        throw new IllegalArgumentException(N0.a.d(iZzb, ", ", sb3));
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final int zzl(int i5, int i10, int i11) {
        return zzifc.zzc(i5, this.zzb, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    public final zzidp zzm() {
        byte[] bArr = this.zzb;
        return zzidp.zzI(bArr, 0, bArr.length, true);
    }

    public final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }
}
