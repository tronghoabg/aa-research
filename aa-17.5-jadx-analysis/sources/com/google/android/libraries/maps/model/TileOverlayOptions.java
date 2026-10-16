package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.libraries.maps.model.internal.ITileProviderDelegate;
import defpackage.spu;
import defpackage.vjh;
import defpackage.vji;

/* loaded from: classes3.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new TileOverlayOptionsCreator();
    public ITileProviderDelegate a;
    private TileProvider b;
    private boolean c;
    private float d;
    private boolean e;
    private float f;

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.c = true;
        this.e = true;
        this.f = BitmapDescriptorFactory.HUE_RED;
        ITileProviderDelegate iTileProviderDelegateAsInterface = ITileProviderDelegate.Stub.asInterface(iBinder);
        this.a = iTileProviderDelegateAsInterface;
        this.b = iTileProviderDelegateAsInterface == null ? null : new vjh(this);
        this.c = z;
        this.d = f;
        this.e = z2;
        this.f = f2;
    }

    public TileOverlayOptions fadeIn(boolean z) {
        this.e = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.e;
    }

    public TileProvider getTileProvider() {
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

    public TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.b = tileProvider;
        this.a = tileProvider == null ? null : new vji(tileProvider);
        return this;
    }

    public TileOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            z = true;
        }
        spu.an(z, "Transparency must be in the range [0..1]");
        this.f = f;
        return this;
    }

    public TileOverlayOptions visible(boolean z) {
        this.c = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        ITileProviderDelegate iTileProviderDelegate = this.a;
        spu.y(parcel, 2, iTileProviderDelegate == null ? null : iTileProviderDelegate.asBinder());
        spu.n(parcel, 3, isVisible());
        spu.q(parcel, 4, getZIndex());
        spu.n(parcel, 5, getFadeIn());
        spu.q(parcel, 6, getTransparency());
        spu.m(parcel, iL);
    }

    public TileOverlayOptions zIndex(float f) {
        this.d = f;
        return this;
    }

    public TileOverlayOptions() {
        this.c = true;
        this.e = true;
        this.f = BitmapDescriptorFactory.HUE_RED;
    }
}
