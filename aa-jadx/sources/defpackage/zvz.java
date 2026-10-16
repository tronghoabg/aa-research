package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zvz extends com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate.Stub {
    private final com.google.android.libraries.maps.model.LatLng a;
    private final java.util.List b;

    public zvz(com.google.android.libraries.maps.model.LatLng latLng, java.util.List list) {
        this.a = latLng;
        this.b = list;
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate
    public final java.util.List<android.os.IBinder> getFeatures() {
        java.util.List list = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((android.os.IBinder) ((com.google.android.libraries.maps.model.internal.IFeatureDelegate) it.next()));
        }
        return arrayList;
    }

    @Override // com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate
    public final com.google.android.libraries.maps.model.LatLng getLatLng() {
        return this.a;
    }
}
