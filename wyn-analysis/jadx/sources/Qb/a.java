package Qb;

import A7.C0237b0;
import C8.i;
import android.location.Location;
import com.google.android.gms.location.LocationResult;
import x7.l;

/* loaded from: classes5.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f9937a;

    public a(i iVar) {
        this.f9937a = iVar;
    }

    @Override // x7.l
    public final void onLocationResult(LocationResult locationResult) {
        for (Location location : locationResult.f26740a) {
            C0237b0 c0237b0 = (C0237b0) this.f9937a.f1940c;
            c0237b0.getClass();
            if (location != null) {
                c0237b0.f813c = String.valueOf(location.getLatitude());
                c0237b0.f814d = String.valueOf(location.getLongitude());
                if (location.isFromMockProvider()) {
                    c0237b0.f812b = true;
                } else {
                    c0237b0.f812b = false;
                }
            }
        }
    }
}
