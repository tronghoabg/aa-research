package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
final class aadc implements aaeu {
    CameraPosition a;
    final /* synthetic */ LatLngBounds b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    public aadc(LatLngBounds latLngBounds, int i, int i2) {
        this.b = latLngBounds;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) {
        LatLngBounds latLngBounds = this.b;
        this.a = new CameraPosition(aads.b(latLngBounds).a(), (float) aads.c(latLngBounds, this.c, this.d, aaemVar.b()), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }
}
