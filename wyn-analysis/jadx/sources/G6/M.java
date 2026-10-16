package G6;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzgax;
import n7.AbstractC3598c;

/* loaded from: classes3.dex */
public final class M extends zzgax {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e7) {
            C6.n.f1857D.f1868h.zzh(e7, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            C6.n nVar = C6.n.f1857D;
            U u10 = nVar.f1863c;
            Context contextZzq = nVar.f1868h.zzq();
            if (contextZzq != null) {
                try {
                    if (((Boolean) zzblg.zzb.zze()).booleanValue()) {
                        AbstractC3598c.a(contextZzq, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }
}
