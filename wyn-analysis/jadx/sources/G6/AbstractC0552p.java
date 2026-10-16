package G6;

import com.google.android.gms.internal.ads.zzcfy;

/* renamed from: G6.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0552p {
    private final Runnable zza = new A7.V(this);
    private volatile Thread zzb;

    public abstract void zza();

    public p8.p zzb() {
        return zzcfy.zza.zza(this.zza);
    }

    public final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }
}
