package defpackage;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
final class zuc implements zts {
    final /* synthetic */ AbstractSafeParcelable a;
    private final /* synthetic */ int b;

    public zuc(AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.b = i;
        this.a = abstractSafeParcelable;
    }

    @Override // defpackage.zts
    public final void a(ztt zttVar, int i, zys zysVar) {
        if (this.b != 0) {
            zysVar.b(aahu.CAMERA_UPDATE_NEW_CAMERA_POSITION);
            zttVar.g((CameraPosition) this.a, i);
        } else {
            zysVar.b(aahu.CAMERA_UPDATE_NEW_LATLNG);
            zttVar.i((LatLng) this.a, i);
        }
    }

    public final String toString() {
        return this.b != 0 ? "CAMERA_UPDATE_NEW_CAMERA_POSITION" : "CAMERA_UPDATE_NEW_LATLNG";
    }
}
