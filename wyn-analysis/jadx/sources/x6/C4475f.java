package x6;

import D6.C0395s;
import D6.E;
import D6.Q0;
import D6.w1;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;

/* renamed from: x6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4475f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47734a;

    /* renamed from: b, reason: collision with root package name */
    public final E f47735b;

    public C4475f(Context context, E e7) {
        this.f47734a = context;
        this.f47735b = e7;
    }

    public final void a(C4476g c4476g) {
        b(c4476g.f47736a);
    }

    public final void b(Q0 q02) {
        Context context = this.f47734a;
        zzbix.zza(context);
        if (((Boolean) zzbkv.zzc.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                H6.c.f4936b.execute(new L7.b(26, this, q02));
                return;
            }
        }
        try {
            this.f47735b.zze(w1.a(context, q02));
        } catch (RemoteException e7) {
            H6.l.d("Failed to load ad.", e7);
        }
    }
}
