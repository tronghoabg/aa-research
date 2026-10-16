package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class TileOverlayOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.maps.model.TileOverlayOptions> CREATOR = new com.google.android.libraries.maps.model.TileOverlayOptionsCreator();
    public com.google.android.libraries.maps.model.internal.ITileProviderDelegate a;
    private com.google.android.libraries.maps.model.TileProvider b;
    private boolean c;
    private float d;
    private boolean e;
    private float f;

    public TileOverlayOptions(android.os.IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.c = true;
        this.e = true;
        this.f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        com.google.android.libraries.maps.model.internal.ITileProviderDelegate iTileProviderDelegateAsInterface = com.google.android.libraries.maps.model.internal.ITileProviderDelegate.Stub.asInterface(iBinder);
        this.a = iTileProviderDelegateAsInterface;
        this.b = iTileProviderDelegateAsInterface == null ? null : new defpackage.vke(this);
        this.c = z;
        this.d = f;
        this.e = z2;
        this.f = f2;
    }

    public com.google.android.libraries.maps.model.TileOverlayOptions fadeIn(boolean z) {
        this.e = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.e;
    }

    public com.google.android.libraries.maps.model.TileProvider getTileProvider() {
        return this.b;
    }

    public float getTransparency() {
        return this.f;
    }

    public float getZIndex() {
        return this.d;
    }

    public boolean isVisible() {
        return this.c;
    }

    public com.google.android.libraries.maps.model.TileOverlayOptions tileProvider(com.google.android.libraries.maps.model.TileProvider tileProvider) {
        this.b = tileProvider;
        this.a = tileProvider == null ? null : new defpackage.vkf(tileProvider);
        return this;
    }

    public com.google.android.libraries.maps.model.TileOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            z = true;
        }
        defpackage.sqs.ar(z, "Transparency must be in the range [0..1]");
        this.f = f;
        return this;
    }

    public com.google.android.libraries.maps.model.TileOverlayOptions visible(boolean z) {
        this.c = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        com.google.android.libraries.maps.model.internal.ITileProviderDelegate iTileProviderDelegate = this.a;
        defpackage.sqs.C(parcel, 2, iTileProviderDelegate == null ? null : iTileProviderDelegate.asBinder());
        defpackage.sqs.r(parcel, 3, isVisible());
        defpackage.sqs.u(parcel, 4, getZIndex());
        defpackage.sqs.r(parcel, 5, getFadeIn());
        defpackage.sqs.u(parcel, 6, getTransparency());
        defpackage.sqs.q(parcel, iP);
    }

    public com.google.android.libraries.maps.model.TileOverlayOptions zIndex(float f) {
        this.d = f;
        return this;
    }

    public TileOverlayOptions() {
        this.c = true;
        this.e = true;
        this.f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }
}
