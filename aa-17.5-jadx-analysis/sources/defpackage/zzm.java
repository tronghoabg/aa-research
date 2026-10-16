package defpackage;

/* loaded from: classes3.dex */
public final class zzm extends zzn {
    @Override // defpackage.zza
    protected final void b(zzf zzfVar) {
        zzb zzbVar = this.b;
        zzbVar.b = false;
        zzbVar.a.e(new zzl(2));
    }

    @Override // defpackage.zza
    protected final boolean c(zzf zzfVar) {
        zzb zzbVar = this.b;
        boolean zE = zzbVar.a.e(new zzl(1));
        if (zE) {
            zzbVar.b = true;
        }
        return zE;
    }

    @Override // defpackage.zza
    protected final boolean g(zzf zzfVar) {
        return this.b.a.e(new zzl(0));
    }

    @Override // defpackage.zzn
    protected final float i(float f) {
        return (float) Math.abs(Math.abs(f) - 1.5707963267948966d);
    }

    @Override // defpackage.zzn
    protected final float j(sb sbVar, int i) {
        return sbVar.g(i);
    }

    @Override // defpackage.zzn
    protected final float k(sb sbVar, int i) {
        return sbVar.i(i);
    }
}
