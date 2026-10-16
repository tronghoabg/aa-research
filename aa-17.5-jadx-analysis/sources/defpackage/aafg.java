package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class aafg {
    public boolean a;
    public String b;
    public float c;
    public float d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public double j;
    public int k;

    public aafg() {
        zkt.k(90.0d, "maxFovYDeg");
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.a = false;
        this.b = null;
        this.c = BitmapDescriptorFactory.HUE_RED;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = 0;
        this.i = 0;
        this.j = 0.0d;
    }

    public final void a() {
        if (this.a && this.g) {
            double d = (this.e / 180.0d) / (this.i / this.j);
            if (d == 0.0d) {
                this.k = Alert.DURATION_SHOW_INDEFINITELY;
            } else {
                this.k = Math.min(this.f, Math.max(0, (int) (Math.log(d) / aahr.a)) + 2);
            }
        }
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.c("maxFovYDeg", 90.0d);
        zsaVarA.g("hasPanoData", this.a);
        zsaVarA.b("panoId", this.b);
        zsaVarA.d("minTiltVisibleDeg", this.c);
        zsaVarA.d("maxTiltVisibleDeg", this.d);
        zsaVarA.e("originalImageHeightPx", this.e);
        zsaVarA.e("originalImageMaxTileZoom", this.f);
        zsaVarA.g("hasViewData", this.g);
        zsaVarA.e("viewWidthPx", this.h);
        zsaVarA.e("viewHeightPx", this.i);
        zsaVarA.c("unzoomedFovYDeg", this.j);
        zsaVarA.e("currMaxZoomLevel", this.k);
        return zsaVarA.toString();
    }
}
