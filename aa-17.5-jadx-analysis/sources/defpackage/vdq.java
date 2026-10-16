package defpackage;

import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.OnMapReadyCallback;

/* loaded from: classes3.dex */
final class vdq extends vgu {
    final /* synthetic */ OnMapReadyCallback a;

    public vdq(OnMapReadyCallback onMapReadyCallback) {
        this.a = onMapReadyCallback;
    }

    @Override // defpackage.vgv
    public final void a(veg vegVar) {
        this.a.onMapReady(new GoogleMap(vegVar));
    }
}
