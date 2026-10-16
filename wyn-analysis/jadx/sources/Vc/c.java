package Vc;

import android.location.Location;
import com.baseflow.geolocator.GeolocatorLocationService;
import uc.C4271h;
import w4.InterfaceC4359a;
import x4.l;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements l, InterfaceC4359a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4271h f14864b;

    public /* synthetic */ c(C4271h c4271h, int i5) {
        this.f14863a = i5;
        this.f14864b = c4271h;
    }

    @Override // x4.l
    public void a(Location location) {
        C4271h c4271h = this.f14864b;
        switch (this.f14863a) {
            case 1:
                int i5 = GeolocatorLocationService.k;
                c4271h.a(gc.b.M(location));
                break;
            default:
                c4271h.a(gc.b.M(location));
                break;
        }
    }

    @Override // w4.InterfaceC4359a
    public void onError(int i5) {
        C4271h c4271h = this.f14864b;
        switch (this.f14863a) {
            case 2:
                int i10 = GeolocatorLocationService.k;
                c4271h.c(pd.f.h(i5), pd.f.g(i5), null);
                break;
            default:
                c4271h.c(pd.f.h(i5), pd.f.g(i5), null);
                break;
        }
    }
}
