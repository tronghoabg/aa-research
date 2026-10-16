package x4;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import w4.InterfaceC4359a;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4468a extends x7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f47679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f47680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4469b f47681c;

    public C4468a(C4469b c4469b, h hVar, Context context) {
        this.f47681c = c4469b;
        this.f47679a = hVar;
        this.f47680b = context;
    }

    @Override // x7.l
    public final synchronized void onLocationAvailability(LocationAvailability locationAvailability) {
        InterfaceC4359a interfaceC4359a;
        if (!(locationAvailability.f26724d < 1000)) {
            C4469b c4469b = this.f47681c;
            Context context = this.f47680b;
            c4469b.getClass();
            if (!wg.b.a(context) && (interfaceC4359a = this.f47681c.f47688g) != null) {
                interfaceC4359a.onError(3);
            }
        }
    }

    @Override // x7.l
    public final synchronized void onLocationResult(LocationResult locationResult) {
        if (this.f47681c.f47689h == null) {
            Log.e("FlutterGeolocator", "LocationCallback was called with empty locationResult or no positionChangedCallback was registered.");
            C4469b c4469b = this.f47681c;
            c4469b.f47684c.removeLocationUpdates(c4469b.f47683b);
            InterfaceC4359a interfaceC4359a = this.f47681c.f47688g;
            if (interfaceC4359a != null) {
                interfaceC4359a.onError(2);
            }
            return;
        }
        List list = locationResult.f26740a;
        int size = list.size();
        Location location = size == 0 ? null : (Location) list.get(size - 1);
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        if (this.f47679a != null) {
            location.getExtras().putBoolean("geolocator_use_mslAltitude", this.f47679a.f47706d);
        }
        this.f47681c.f47685d.a(location);
        this.f47681c.f47689h.a(location);
    }
}
