package com.google.android.libraries.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;
    private static IBitmapDescriptorFactoryDelegate a;

    private BitmapDescriptorFactory() {
    }

    private static IBitmapDescriptorFactoryDelegate a() {
        IBitmapDescriptorFactoryDelegate iBitmapDescriptorFactoryDelegate = a;
        spu.ax(iBitmapDescriptorFactoryDelegate, "IBitmapDescriptorFactory is not initialized");
        return iBitmapDescriptorFactoryDelegate;
    }

    public static BitmapDescriptor defaultMarker() {
        try {
            return new BitmapDescriptor(a().defaultMarker());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromAsset(String str) {
        try {
            return new BitmapDescriptor(a().fromAsset(str));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        try {
            return new BitmapDescriptor(a().fromBitmap(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromFile(String str) {
        try {
            return new BitmapDescriptor(a().fromFile(str));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromPath(String str) {
        try {
            return new BitmapDescriptor(a().fromPath(str));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromPinConfig(PinConfig pinConfig) {
        try {
            return new BitmapDescriptor(a().fromPinConfig(pinConfig));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromResource(int i) {
        try {
            return new BitmapDescriptor(a().fromResource(i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static void init(IBitmapDescriptorFactoryDelegate iBitmapDescriptorFactoryDelegate) {
        if (a != null) {
            return;
        }
        spu.aw(iBitmapDescriptorFactoryDelegate);
        a = iBitmapDescriptorFactoryDelegate;
    }

    public static BitmapDescriptor defaultMarker(float f) {
        try {
            return new BitmapDescriptor(a().defaultMarkerWithHue(f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
