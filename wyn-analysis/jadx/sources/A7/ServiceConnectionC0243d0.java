package A7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzbz;
import y3.C4552j;

/* renamed from: A7.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ServiceConnectionC0243d0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4552j f844b;

    public ServiceConnectionC0243d0(C4552j c4552j, String str) {
        this.f844b = c4552j;
        this.f843a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C4552j c4552j = this.f844b;
        if (iBinder == null) {
            N n10 = ((C0273n0) c4552j.f48001b).f981i;
            C0273n0.d(n10);
            n10.f608i.c("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbz zzbzVarZza = zzby.zza(iBinder);
            if (zzbzVarZza == null) {
                N n11 = ((C0273n0) c4552j.f48001b).f981i;
                C0273n0.d(n11);
                n11.f608i.c("Install Referrer Service implementation was not found");
            } else {
                N n12 = ((C0273n0) c4552j.f48001b).f981i;
                C0273n0.d(n12);
                n12.f612n.c("Install Referrer Service connected");
                C0264k0 c0264k0 = ((C0273n0) c4552j.f48001b).f982j;
                C0273n0.d(c0264k0);
                c0264k0.m0(new RunnableC0278p(this, zzbzVarZza, this));
            }
        } catch (RuntimeException e7) {
            N n13 = ((C0273n0) c4552j.f48001b).f981i;
            C0273n0.d(n13);
            n13.f608i.d("Exception occurred while calling Install Referrer API", e7);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        N n10 = ((C0273n0) this.f844b.f48001b).f981i;
        C0273n0.d(n10);
        n10.f612n.c("Install Referrer Service disconnected");
    }
}
