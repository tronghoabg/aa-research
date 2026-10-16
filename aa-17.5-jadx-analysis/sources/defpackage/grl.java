package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class grl implements afdr {
    private final /* synthetic */ int a;

    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return afak.a;
            case 1:
                return afak.a;
            case 2:
                return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            case 3:
                return new ParcelableSnapshotMutableIntState(-1);
            case 4:
                return afak.a;
            case 5:
                hiq hiqVar = hiq.a;
                return new hja(hiqVar, hiqVar, hir.a);
            case 6:
                return new hje(null);
            case 7:
                return hix.a;
            case 8:
                return hjf.a;
            case 9:
                throw new IllegalStateException("LocalBreakpoint not provided");
            case 10:
                int i = ijl.a;
                return new Handler(Looper.getMainLooper());
            case 11:
                return new SurfaceTexture(false);
            case 12:
                return afak.a;
            case 13:
                return afak.a;
            case 14:
                return afak.a;
            case 15:
                return afak.a;
            case 16:
                return afak.a;
            case 17:
                return afak.a;
            case 18:
                return afak.a;
            case 19:
                int i2 = jvk.a;
                return Integer.valueOf(View.generateViewId());
            default:
                return afak.a;
        }
    }
}
