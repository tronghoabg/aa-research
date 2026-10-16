package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.maps.model.PinConfig;
import com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate;

/* loaded from: classes3.dex */
public final class ztg extends IBitmapDescriptorFactoryDelegate.Stub {
    @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
    public final sqj defaultMarker() {
        return new sqi(ztq.b());
    }

    @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
    public final sqj defaultMarkerWithHue(float f) {
        return new sqi(new zti(ztq.b(), f));
    }

    @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
    public final sqj fromAsset(String str) {
        return new sqi(new zth(str));
    }

    @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
    public final sqj fromBitmap(Bitmap bitmap) {
        return new sqi(new ztk(bitmap));
    }

    @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
    public final sqj fromFile(String str) {
        return new sqi(new ztj(str));
    }

    @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
    public final sqj fromPath(String str) {
        return new sqi(new ztm(str));
    }

    @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
    public final sqj fromPinConfig(PinConfig pinConfig) {
        return new sqi(new ztn(pinConfig));
    }

    @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
    public final sqj fromResource(int i) {
        return new sqi(new zto(i));
    }
}
