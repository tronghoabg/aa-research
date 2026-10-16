package defpackage;

import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes2.dex */
public final class stt extends std {
    final /* synthetic */ sua a;
    final /* synthetic */ nok b;

    public stt(sua suaVar, nok nokVar) {
        this.b = nokVar;
        this.a = suaVar;
    }

    @Override // defpackage.std
    public final void a(LocationResult locationResult) {
        this.b.e(locationResult.a());
        try {
            this.a.J(uqw.G(this, "GetCurrentLocation"), false, new nok(null, null));
        } catch (RemoteException unused) {
        }
    }
}
