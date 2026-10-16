package defpackage;

import android.graphics.Point;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.VisibleRegion;

/* loaded from: classes3.dex */
public final class aacs implements zxm {
    static final Point a = new Point(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY);
    private final VisibleRegion b;
    private final tye c;

    public aacs(tye tyeVar, VisibleRegion visibleRegion) {
        this.c = tyeVar;
        this.b = visibleRegion;
    }

    @Override // defpackage.zxm
    public final Point a(LatLng latLng) {
        zkt.n(latLng, "location");
        too tooVarQ = tmo.q(aaaw.a(latLng));
        int i = tsw.a;
        float[] fArr = new float[8];
        int[] iArr = !tsw.l(this.c.a, tooVarQ, fArr, true) ? null : new int[]{Math.round(fArr[0]), Math.round(fArr[1])};
        Point point = iArr != null ? new Point(iArr[0], iArr[1]) : null;
        return point != null ? point : a;
    }

    @Override // defpackage.zxm
    public final LatLng b(Point point) {
        zkt.n(point, "point");
        toi toiVarA = this.c.a(point);
        if (toiVarA == null) {
            return null;
        }
        return aaaw.d(toiVarA);
    }

    @Override // defpackage.zxm
    public final VisibleRegion c() {
        return this.b;
    }
}
