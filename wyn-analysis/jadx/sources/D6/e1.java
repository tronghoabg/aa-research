package D6;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbnc;
import x6.InterfaceC4482m;

/* loaded from: classes3.dex */
public final class e1 implements InterfaceC4482m {

    /* renamed from: a, reason: collision with root package name */
    public final zzbmi f2420a;

    /* renamed from: b, reason: collision with root package name */
    public final zzbnc f2421b;

    public e1(zzbmi zzbmiVar, zzbnc zzbncVar) {
        new VideoController();
        this.f2420a = zzbmiVar;
        this.f2421b = zzbncVar;
    }

    public final boolean a() {
        try {
            return this.f2420a.zzk();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return false;
        }
    }
}
