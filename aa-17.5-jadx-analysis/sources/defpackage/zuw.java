package defpackage;

import android.os.IBinder;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate;
import com.google.android.libraries.maps.model.internal.IFeatureDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zuw extends IFeatureClickEventDelegate.Stub {
    private final LatLng a;
    private final List b;

    public zuw(LatLng latLng, List list) {
        this.a = latLng;
        this.b = list;
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate
    public final List<IBinder> getFeatures() {
        List list = this.b;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((IBinder) ((IFeatureDelegate) it.next()));
        }
        return arrayList;
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate
    public final LatLng getLatLng() {
        return this.a;
    }
}
