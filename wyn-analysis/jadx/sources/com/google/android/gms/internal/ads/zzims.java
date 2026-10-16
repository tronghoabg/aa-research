package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzims {
    public static final zzims zzj = new zzims(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzims zzk = new zzims(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzims zzl = new zzims(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzims zzm = new zzims(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;

    public zzims(double d3, double d5, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.zza = d12;
        this.zzb = d13;
        this.zzc = d14;
        this.zzd = d3;
        this.zze = d5;
        this.zzf = d10;
        this.zzg = d11;
        this.zzh = d15;
        this.zzi = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzims.class != obj.getClass()) {
            return false;
        }
        zzims zzimsVar = (zzims) obj;
        return Double.compare(zzimsVar.zzd, this.zzd) == 0 && Double.compare(zzimsVar.zze, this.zze) == 0 && Double.compare(zzimsVar.zzf, this.zzf) == 0 && Double.compare(zzimsVar.zzg, this.zzg) == 0 && Double.compare(zzimsVar.zzh, this.zzh) == 0 && Double.compare(zzimsVar.zzi, this.zzi) == 0 && Double.compare(zzimsVar.zza, this.zza) == 0 && Double.compare(zzimsVar.zzb, this.zzb) == 0 && Double.compare(zzimsVar.zzc, this.zzc) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zza);
        long j8 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zzb);
        long j10 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.zzc);
        long j11 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.zzd);
        long j12 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.zze);
        long j13 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.zzf);
        long j14 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.zzg);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.zzh);
        long j15 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.zzi);
        return (((((((((((((((((int) j8) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j15)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zzj)) {
            return "Rotate 0°";
        }
        if (equals(zzk)) {
            return "Rotate 90°";
        }
        if (equals(zzl)) {
            return "Rotate 180°";
        }
        if (equals(zzm)) {
            return "Rotate 270°";
        }
        double d3 = this.zza;
        double d5 = this.zzb;
        double d10 = this.zzc;
        double d11 = this.zzd;
        double d12 = this.zze;
        double d13 = this.zzf;
        double d14 = this.zzg;
        double d15 = this.zzh;
        double d16 = this.zzi;
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(d3);
        sb2.append(", v=");
        sb2.append(d5);
        sb2.append(", w=");
        sb2.append(d10);
        sb2.append(", a=");
        sb2.append(d11);
        sb2.append(", b=");
        sb2.append(d12);
        sb2.append(", c=");
        sb2.append(d13);
        sb2.append(", d=");
        sb2.append(d14);
        sb2.append(", tx=");
        sb2.append(d15);
        sb2.append(", ty=");
        sb2.append(d16);
        sb2.append("}");
        return sb2.toString();
    }
}
