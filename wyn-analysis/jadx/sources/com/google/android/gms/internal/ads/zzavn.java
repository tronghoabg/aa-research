package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzavn implements zzavl {
    private int zza = (((((~1539942439) & 2070175971) | 1100945533) + ((1539942439 & (-1166483302)) | (-2145608135))) - 96382817) ^ (1143565421 % 981914693);
    private final byte[] zzb = new byte[(((((~991039875) & 475472926) | 1225689584) + ((991039875 & 357672014) | 1805818736)) - (-1256743880)) ^ (1671581032 % 1337434154)];
    private final zzavp zzc;

    public zzavn(zzavp zzavpVar) {
        this.zzc = zzavpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final byte zza(zzavx zzavxVar, int i5) {
        int i10 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i11 = 1761855727 % 1384724137;
        int i12 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i13 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i14 = 1694830070 % 1383960411;
        int i15 = i5 >>> i12;
        if (i15 != this.zza) {
            this.zzc.zza(i15, this.zzb);
            this.zza = i15;
        }
        int i16 = i13 ^ i14;
        return (byte) (((zzavxVar.zzb(i5) ^ this.zzb[i5 % (i10 ^ i11)]) << i16) >> i16);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final zzavx zzb(zzavx zzavxVar, int i5, int i10) {
        if (i5 < 0 || i5 > i10 || i10 > zzavxVar.zza.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i10 - i5];
        int i11 = 0;
        while (i5 < i10) {
            bArr[i11] = zza(zzavxVar, i5);
            i5++;
            i11++;
        }
        return zzavx.zze(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final /* bridge */ /* synthetic */ zzavl zzc() {
        return new zzavn(this.zzc);
    }
}
