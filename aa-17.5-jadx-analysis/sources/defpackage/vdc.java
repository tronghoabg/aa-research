package defpackage;

import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.CameraPosition;

/* loaded from: classes3.dex */
public final class vdc extends vey {
    final /* synthetic */ GoogleMap.OnCameraChangeListener a;

    public vdc(GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        this.a = onCameraChangeListener;
    }

    @Override // defpackage.vez
    public final void a(CameraPosition cameraPosition) {
        this.a.onCameraChange(cameraPosition);
    }
}
