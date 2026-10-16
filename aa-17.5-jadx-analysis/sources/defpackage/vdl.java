package defpackage;

import com.google.android.libraries.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.libraries.maps.StreetViewPanorama;

/* loaded from: classes3.dex */
public final class vdl extends vii {
    final /* synthetic */ OnStreetViewPanoramaReadyCallback a;

    public vdl(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.a = onStreetViewPanoramaReadyCallback;
    }

    @Override // defpackage.vij
    public final void a(vis visVar) {
        this.a.onStreetViewPanoramaReady(new StreetViewPanorama(visVar));
    }
}
