package defpackage;

/* loaded from: classes3.dex */
public final class zzk extends zzn {
    public zzk(zzb zzbVar) {
        super(zzbVar);
        this.c = 0.05f;
        this.d = (float) Math.tan(0.3490658503988659d);
    }

    @Override // defpackage.zza
    protected final void b(zzf zzfVar) {
        this.b.a.c(new zzg(2));
    }

    @Override // defpackage.zza
    protected final boolean c(zzf zzfVar) {
        return this.b.a.c(new zzg(1));
    }

    @Override // defpackage.zza
    protected final boolean g(zzf zzfVar) {
        return this.b.a.c(new zzg(0));
    }

    @Override // defpackage.zzn
    protected final float i(float f) {
        return Math.min(Math.abs(f), (float) Math.abs(Math.abs(f) - 3.141592653589793d));
    }

    @Override // defpackage.zzn
    protected final float j(sb sbVar, int i) {
        return sbVar.i(i);
    }

    @Override // defpackage.zzn
    protected final float k(sb sbVar, int i) {
        return sbVar.g(i);
    }
}
