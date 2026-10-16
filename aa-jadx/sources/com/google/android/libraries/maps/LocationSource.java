package com.google.android.libraries.maps;

/* JADX INFO: loaded from: classes3.dex */
public interface LocationSource {

    public interface OnLocationChangedListener {
        void onLocationChanged(android.location.Location location);
    }

    void activate(com.google.android.libraries.maps.LocationSource.OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
